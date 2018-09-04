package com.google.android.libraries.smartburst.filterfw.filterpacks.miscellaneous;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;

/* compiled from: PG */
public final class QuadsToMaskFilter extends Filter {
    public ImageShader mBackgroundShader;
    public final String mBgFragmentShader = "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n}\n";
    public int[] mImageSize;
    public final String mQuadFragmentShader = "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 1.0, 1.0, 1.0);\n}\n";
    public ImageShader mQuadShader;
    public Quad[] mQuads;

    public QuadsToMaskFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("quads", 2, FrameType.array(Quad.class)).addInputPort("imageSize", 2, FrameType.array(Integer.TYPE)).addOutputPort("mask", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("imageSize")) {
            inputPort.bindToFieldNamed("mImageSize");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("quads")) {
            inputPort.bindToFieldNamed("mQuads");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onPrepare() {
        this.mBackgroundShader = new ImageShader("precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n}\n");
        this.mQuadShader = new ImageShader("precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 1.0, 1.0, 1.0);\n}\n");
    }

    protected final void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("mask");
        Frame asFrameImage2D = connectedOutputPort.fetchAvailableFrame(this.mImageSize).asFrameImage2D();
        this.mBackgroundShader.processNoInput(asFrameImage2D);
        int i = 0;
        while (true) {
            Quad[] quadArr = this.mQuads;
            if (i < quadArr.length) {
                this.mQuadShader.setTargetQuad(quadArr[i]);
                this.mQuadShader.processNoInput(asFrameImage2D);
                i++;
            } else {
                connectedOutputPort.pushFrame(asFrameImage2D);
                return;
            }
        }
    }
}

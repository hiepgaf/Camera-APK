package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.FilterModes;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class MaskingFilter extends Filter {
    public static final String mMaskingSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord) *\ntexture2D(tex_sampler_1, v_texcoord);\n}\n";
    public FrameType mImageType;
    public ImageShader mMaskingShader;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean applyMask(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    public MaskingFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        FrameType image2D2 = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("mask", 2, image2D2).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    protected void onPrepare() {
        if (isOpenGLSupported()) {
            this.mMaskingShader = new ImageShader(mMaskingSource);
            this.mImageType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18);
        }
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        FrameImage2D asFrameImage2D2 = getConnectedInputPort("mask").pullFrame().asFrameImage2D();
        Frame asFrameImage2D3 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        if (isOpenGLSupported()) {
            asFrameImage2D2.lockTextureSource().setParameter(10240, FilterModes.NEAREST);
            asFrameImage2D2.unlock();
            FrameImage2D[] frameImage2DArr = new FrameImage2D[]{asFrameImage2D, asFrameImage2D2};
            if (asFrameImage2D3 != null) {
                this.mMaskingShader.processMulti(frameImage2DArr, asFrameImage2D3);
            }
            asFrameImage2D2.lockTextureSource().setDefaultParams();
            asFrameImage2D2.unlock();
        } else {
            applyMask(asFrameImage2D.getWidth(), asFrameImage2D.getHeight(), asFrameImage2D.lockBytes(1), asFrameImage2D2.lockBytes(1), asFrameImage2D3.lockBytes(2));
            asFrameImage2D.unlock();
            asFrameImage2D2.unlock();
            asFrameImage2D3.unlock();
        }
        if (asFrameImage2D3 != null) {
            connectedOutputPort.pushFrame(asFrameImage2D3);
        }
    }
}

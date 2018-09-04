package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import android.opengl.GLES20;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.util.Arrays;

/* compiled from: PG */
public class FixedColorSource extends Filter {
    public float[] mColor = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
    public int mHeight = 1;
    public FrameImage2D mImageFrame = null;
    public FrameType mImageType = null;
    public float[] mLastColor = null;
    public int mLastHeight = 0;
    public int mLastWidth = 0;
    public int mWidth = 1;

    public FixedColorSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        this.mImageType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16);
        return new Signature().addInputPort("color", 1, FrameType.array(Float.TYPE)).addInputPort("width", 2, FrameType.single(Integer.TYPE)).addInputPort("height", 2, FrameType.single(Integer.TYPE)).addOutputPort("image", 2, this.mImageType).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("color")) {
            inputPort.bindToFieldNamed("mColor");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("width")) {
            inputPort.bindToFieldNamed("mWidth");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("height")) {
            inputPort.bindToFieldNamed("mHeight");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        if (!(Arrays.equals(this.mLastColor, this.mColor) && this.mWidth == this.mLastWidth && this.mHeight == this.mLastHeight)) {
            int[] iArr = new int[]{this.mWidth, this.mHeight};
            FrameImage2D frameImage2D = this.mImageFrame;
            if (frameImage2D != null) {
                frameImage2D.release();
            }
            this.mImageFrame = Frame.create(this.mImageType, iArr).asFrameImage2D();
            this.mImageFrame.lockRenderTarget().focus();
            float[] fArr = this.mColor;
            GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
            GLES20.glClear(16384);
            this.mImageFrame.unlock();
            this.mLastColor = this.mColor;
            this.mLastWidth = this.mWidth;
            this.mLastHeight = this.mHeight;
        }
        connectedOutputPort.pushFrame(this.mImageFrame);
    }

    protected void onTearDown() {
        FrameImage2D frameImage2D = this.mImageFrame;
        if (frameImage2D != null) {
            frameImage2D.release();
        }
    }
}

package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class BitmapSource extends Filter {
    public boolean mAlwaysRead = false;
    public FrameImage2D mImageFrame = null;
    public FrameType mImageType = null;
    public Bitmap mLastBitmap = null;
    public long mTimestamp = -1;

    public BitmapSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        this.mImageType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 8);
        return new Signature().addInputPort("bitmap", 2, FrameType.single(Bitmap.class)).addInputPort("alwaysRead", 1, FrameType.single(Boolean.TYPE)).addInputPort("timestamp", 1, FrameType.single(Long.TYPE)).addOutputPort("image", 2, this.mImageType).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("alwaysRead")) {
            inputPort.bindToFieldNamed("mAlwaysRead");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("timestamp")) {
            inputPort.bindToFieldNamed("mTimestamp");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onProcess() {
        Bitmap bitmap = (Bitmap) getConnectedInputPort("bitmap").pullFrame().asFrameValue().getValue();
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        if (this.mLastBitmap != bitmap || this.mAlwaysRead) {
            FrameImage2D frameImage2D = this.mImageFrame;
            if (frameImage2D != null) {
                frameImage2D.release();
            }
            this.mImageFrame = Frame.create(this.mImageType, new int[]{bitmap.getWidth(), bitmap.getHeight()}).asFrameImage2D();
            this.mImageFrame.setBitmap(bitmap);
            this.mLastBitmap = bitmap;
        }
        FrameImage2D frameImage2D2 = this.mImageFrame;
        if (frameImage2D2 == null) {
            throw new RuntimeException("BitmapSource trying to push out an undefined frame! Most likely, graph.getVariable(<BitmapSource filter>).setValue(<Bitmap>) has not been called.");
        }
        long j = this.mTimestamp;
        if (j >= 0) {
            frameImage2D2.setTimestamp(j);
        }
        connectedOutputPort.pushFrame(this.mImageFrame);
    }

    protected void onTearDown() {
        FrameImage2D frameImage2D = this.mImageFrame;
        if (frameImage2D != null) {
            frameImage2D.release();
            this.mImageFrame = null;
        }
    }
}

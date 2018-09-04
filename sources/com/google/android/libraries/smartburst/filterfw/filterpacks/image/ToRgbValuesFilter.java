package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class ToRgbValuesFilter extends Filter {
    public FrameType mImageInType;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean toRgbValues(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public ToRgbValuesFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        this.mImageInType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, this.mImageInType).addOutputPort("image", 2, FrameType.buffer2D(100)).disallowOtherPorts();
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D.getDimensions();
        Frame asFrameBuffer2D = connectedOutputPort.fetchAvailableFrame(new int[]{dimensions[0] * 3, dimensions[1]}).asFrameBuffer2D();
        if (toRgbValues(asFrameImage2D.lockBytes(1), asFrameBuffer2D.lockBytes(2))) {
            asFrameImage2D.unlock();
            asFrameBuffer2D.unlock();
            connectedOutputPort.pushFrame(asFrameBuffer2D);
            return;
        }
        throw new RuntimeException("Native implementation encountered an error during processing!");
    }
}

package com.google.android.libraries.smartburst.filterpacks.image;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class PHashFilter extends Filter {
    public static final String DCT_FILTER_SIZE_PORT = "dctFilterSize";
    public static final String HASH_PORT = "hash";
    public static final String INPUT_PORT = "image";
    public int mDctFilterSize = 16;
    public ByteBuffer mHashResult = null;

    static {
        System.loadLibrary("smartburst-jni");
    }

    private static native void phash(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3);

    public PHashFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("image", 2, FrameType.image2D(100, 1)).addInputPort(DCT_FILTER_SIZE_PORT, 1, FrameType.single(Integer.TYPE)).addOutputPort(HASH_PORT, 2, FrameType.array(Float.TYPE)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals(DCT_FILTER_SIZE_PORT)) {
            inputPort.bindToFieldNamed("mDctFilterSize");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onProcess() {
        int i;
        if (this.mHashResult == null) {
            i = this.mDctFilterSize;
            this.mHashResult = ByteBuffer.allocateDirect((i * i) / 8);
        }
        i = this.mHashResult.capacity() / 4;
        Frame pullFrame = getConnectedInputPort("image").pullFrame();
        int[] dimensions = pullFrame.getDimensions();
        ByteBuffer lockBytes = pullFrame.asFrameBuffer2D().lockBytes(1);
        OutputPort connectedOutputPort = getConnectedOutputPort(HASH_PORT);
        if (connectedOutputPort != null) {
            Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            phash(this.mHashResult, lockBytes, dimensions[1], dimensions[0], this.mDctFilterSize);
            Object obj = new float[i];
            this.mHashResult.asFloatBuffer().get(obj, 0, i);
            asFrameValue.setValue(obj);
            connectedOutputPort.pushFrame(asFrameValue);
        }
        pullFrame.unlock();
    }
}

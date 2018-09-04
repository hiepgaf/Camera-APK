package com.google.android.libraries.smartburst.filterpacks.storage;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class MemoryEstimatorFilter extends Filter {
    public static final String INPUT_PORT_FRAME = "frame";
    public static final String OUTPUT_PORT_BUFFER_COUNT = "bufferCount";
    public static final String TAG = "MemoryEstimatorFilter";
    public int mMaxBuffers;
    public int mMaxMemory;
    public int mMinBuffers;
    public int mRingBufferSize;
    public int mStorageBuffers;

    public MemoryEstimatorFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("frame", 2, FrameType.any()).addOutputPort(OUTPUT_PORT_BUFFER_COUNT, 2, FrameType.single(Integer.TYPE)).disallowOtherPorts();
    }

    protected void onProcess() {
        Frame pullFrame = getConnectedInputPort("frame").pullFrame();
        if (this.mRingBufferSize == 0) {
            int elementSize = pullFrame.getType().getElementSize() * pullFrame.getElementCount();
            int i = this.mMaxMemory - (this.mStorageBuffers * elementSize);
            if (i < 0) {
                Log.w(TAG, "Warning: Frame store requirements exceed max memory!");
            } else {
                this.mRingBufferSize = i / elementSize;
            }
            this.mRingBufferSize = Math.min(Math.max(this.mRingBufferSize, this.mMinBuffers), this.mMaxBuffers);
            elementSize = this.mRingBufferSize;
            StringBuilder stringBuilder = new StringBuilder(74);
            stringBuilder.append("Ring buffer has ");
            stringBuilder.append(i);
            stringBuilder.append(" bytes of memory. Allocating ");
            stringBuilder.append(elementSize);
            stringBuilder.append(" slots.");
            Log.v(TAG, stringBuilder.toString());
        }
        OutputPort connectedOutputPort = getConnectedOutputPort(OUTPUT_PORT_BUFFER_COUNT);
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(Integer.valueOf(this.mRingBufferSize));
        connectedOutputPort.pushFrame(asFrameValue);
    }

    public void setMemoryInfo(int i, int i2, int i3, int i4) {
        this.mMaxMemory = i;
        this.mStorageBuffers = i2;
        this.mMinBuffers = i3;
        this.mMaxBuffers = i4;
    }
}

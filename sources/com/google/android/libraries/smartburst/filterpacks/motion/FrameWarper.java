package com.google.android.libraries.smartburst.filterpacks.motion;

import java.nio.ByteBuffer;
import p000.jri;

/* compiled from: PG */
public class FrameWarper {
    public final ByteBuffer mContextBuffer = ByteBuffer.allocateDirect(getContextLength());

    static {
        System.loadLibrary("smartburst-jni");
    }

    private native void frameWarpingSetUp(ByteBuffer byteBuffer, int i, int i2);

    private native void frameWarpingTearDown(ByteBuffer byteBuffer);

    private native void frameWarpingWarpFrame(ByteBuffer byteBuffer, float[] fArr, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    private native int getContextLength();

    public FrameWarper(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i2 <= 0) {
            z2 = false;
        }
        jri.m13143a(z2);
        frameWarpingSetUp(this.mContextBuffer, i, i2);
    }

    public void dispose() {
        frameWarpingTearDown(this.mContextBuffer);
    }

    public ByteBuffer warpFrame(ByteBuffer byteBuffer, HomographyTransform homographyTransform) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        frameWarpingWarpFrame(this.mContextBuffer, homographyTransform.toArray(), byteBuffer, allocateDirect);
        return allocateDirect;
    }
}

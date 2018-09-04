package com.google.android.libraries.smartburst.artifacts.gifutils;

import java.nio.ByteBuffer;
import p000.jjf;

/* compiled from: PG */
public class HeckbertQuantizer implements jjf {
    /* renamed from: a */
    private final boolean f12419a;

    static {
        System.loadLibrary("smartburst-jni");
    }

    private static native void process(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, boolean z);

    public HeckbertQuantizer() {
        this((byte) 0);
    }

    private HeckbertQuantizer(byte b) {
        this.f12419a = true;
    }

    /* renamed from: a */
    public final void mo831a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        process(byteBuffer, byteBuffer2, byteBuffer3, i, i2, this.f12419a);
    }

    public String toString() {
        boolean z = this.f12419a;
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("HeckbertQuantizer[useDither=");
        stringBuilder.append(z);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

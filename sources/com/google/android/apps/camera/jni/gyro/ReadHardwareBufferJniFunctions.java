package com.google.android.apps.camera.jni.gyro;

import android.hardware.HardwareBuffer;

/* compiled from: PG */
public class ReadHardwareBufferJniFunctions {
    static {
        System.loadLibrary("gyrostabilization-jni");
    }

    public static native boolean isSupported();

    public static native boolean readHardwareBuffer(HardwareBuffer hardwareBuffer, byte[] bArr, int i, int i2, int i3);
}

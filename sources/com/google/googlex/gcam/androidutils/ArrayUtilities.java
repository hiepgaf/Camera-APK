package com.google.googlex.gcam.androidutils;

import com.google.googlex.gcam.androidutils.Array2D.U8x4;
import com.google.googlex.gcam.androidutils.vecmath.Vector4b;

/* compiled from: PG */
public final class ArrayUtilities {
    public static void fill(U8x4 u8x4, Vector4b vector4b) {
        for (int i = 0; i < u8x4.height(); i++) {
            for (int i2 = 0; i2 < u8x4.width(); i2++) {
                u8x4.set(i2, i, vector4b);
            }
        }
    }
}

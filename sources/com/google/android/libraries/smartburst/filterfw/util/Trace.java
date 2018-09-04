package com.google.android.libraries.smartburst.filterfw.util;

import android.annotation.SuppressLint;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
public final class Trace {
    public static boolean ENABLED = true;

    @SuppressLint({"NewApi"})
    public static void beginSection(String str) {
        if (ENABLED) {
            if (str != null && str.length() > ScriptIntrinsicBLAS.RsBlas_csyrk) {
                str = str.substring(0, ScriptIntrinsicBLAS.RsBlas_csyrk);
            }
            android.os.Trace.beginSection(str);
        }
    }

    @SuppressLint({"NewApi"})
    public static void endSection() {
        if (ENABLED) {
            android.os.Trace.endSection();
        }
    }
}

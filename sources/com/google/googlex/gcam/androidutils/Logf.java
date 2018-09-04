package com.google.googlex.gcam.androidutils;

import android.util.Log;

/* compiled from: PG */
public class Logf {
    /* renamed from: d */
    public static int m1373d(String str, String str2, Throwable th, Object... objArr) {
        return Log.d(str, String.format(str2, objArr), th);
    }

    /* renamed from: d */
    public static int m1374d(String str, String str2, Object... objArr) {
        return Log.d(str, String.format(str2, objArr));
    }

    /* renamed from: e */
    public static int m1375e(String str, String str2, Throwable th, Object... objArr) {
        return Log.e(str, String.format(str2, objArr), th);
    }

    /* renamed from: e */
    public static int m1376e(String str, String str2, Object... objArr) {
        return Log.e(str, String.format(str2, objArr));
    }

    /* renamed from: i */
    public static int m1377i(String str, String str2, Throwable th, Object... objArr) {
        return Log.i(str, String.format(str2, objArr), th);
    }

    /* renamed from: i */
    public static int m1378i(String str, String str2, Object... objArr) {
        return Log.i(str, String.format(str2, objArr));
    }

    public static int println(int i, String str, String str2, Object... objArr) {
        return Log.println(i, str, String.format(str2, objArr));
    }

    /* renamed from: v */
    public static int m1379v(String str, String str2, Throwable th, Object... objArr) {
        return Log.v(str, String.format(str2, objArr), th);
    }

    /* renamed from: v */
    public static int m1380v(String str, String str2, Object... objArr) {
        return Log.v(str, String.format(str2, objArr));
    }

    /* renamed from: w */
    public static int m1381w(String str, String str2, Throwable th, Object... objArr) {
        return Log.w(str, String.format(str2, objArr), th);
    }

    /* renamed from: w */
    public static int m1382w(String str, String str2, Object... objArr) {
        return Log.w(str, String.format(str2, objArr));
    }

    public static int wtf(String str, String str2, Throwable th, Object... objArr) {
        return Log.wtf(str, String.format(str2, objArr), th);
    }

    public static int wtf(String str, String str2, Object... objArr) {
        return Log.wtf(str, String.format(str2, objArr));
    }
}

package com.google.android.apps.camera.metadata.refocus;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p000.bli;
import p000.ije;

/* compiled from: PG */
public class RefocusHelper {
    public static final String TAG = "RefocusHelper";

    public static boolean hasRefocusCapture(Context context, ActivityManager activityManager) {
        if (!ije.m3779a(context.getContentResolver(), "camera:refocus_enabled", true) || isLowRamDevice(activityManager)) {
            return false;
        }
        return true;
    }

    public static boolean isLowRamDevice(ActivityManager activityManager) {
        try {
            return activityManager.isLowRamDevice();
        } catch (NoSuchMethodError e) {
            return false;
        }
    }

    public static boolean isRgbz(Context context, Uri uri) {
        StringBuilder stringBuilder;
        String valueOf;
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        InputStream inputStream3 = null;
        try {
            inputStream3 = context.getContentResolver().openInputStream(uri);
            try {
                boolean isRgbz = RgbzUtils.isRgbz(inputStream3);
                if (inputStream3 == null) {
                    return isRgbz;
                }
                try {
                    inputStream3.close();
                    return isRgbz;
                } catch (IOException e) {
                    String valueOf2 = String.valueOf(e);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                    stringBuilder.append("Unable to close stream: ");
                    stringBuilder.append(valueOf2);
                    bli.m873e(TAG, stringBuilder.toString());
                    return isRgbz;
                }
            } catch (FileNotFoundException e2) {
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException e3) {
                        valueOf = String.valueOf(e3);
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                        stringBuilder2.append("Unable to close stream: ");
                        stringBuilder2.append(valueOf);
                        bli.m873e(TAG, stringBuilder2.toString());
                    }
                }
                return false;
            } catch (Throwable th2) {
                inputStream = inputStream3;
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e32) {
                        valueOf = String.valueOf(e32);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                        stringBuilder.append("Unable to close stream: ");
                        stringBuilder.append(valueOf);
                        bli.m873e(TAG, stringBuilder.toString());
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e4) {
            if (inputStream3 != null) {
                inputStream3.close();
            }
            return false;
        } catch (Throwable th22) {
            inputStream = inputStream3;
            th = th22;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }
}

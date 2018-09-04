package com.google.android.apps.camera.metadata.refocus;

import android.content.Context;
import android.net.Uri;
import p000.erj;

/* compiled from: PG */
public class RgbzMetadataLoader {
    public static boolean loadRgbzMetadata(Context context, Uri uri, erj erj) {
        if (!RefocusHelper.isRgbz(context, uri)) {
            return false;
        }
        erj.f4123i = true;
        return true;
    }
}

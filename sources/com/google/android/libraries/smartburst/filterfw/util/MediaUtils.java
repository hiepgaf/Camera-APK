package com.google.android.libraries.smartburst.filterfw.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
public class MediaUtils {
    @TargetApi(17)
    public static int getMediaRotation(Context context, Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        String scheme = uri.getScheme();
        if ("content".equals(scheme) || "android.resource".equals(scheme)) {
            mediaMetadataRetriever.setDataSource(context, uri);
        } else if ("file".equals(scheme)) {
            mediaMetadataRetriever.setDataSource(uri.getPath());
        } else {
            mediaMetadataRetriever.setDataSource(uri.toString(), new HashMap());
        }
        String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
        return extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
    }
}

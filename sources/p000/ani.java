package p000;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;

/* compiled from: PG */
/* renamed from: ani */
public final class ani implements ank {
    /* renamed from: a */
    public final /* synthetic */ void mo313a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}

package p000;

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* renamed from: anl */
public final class anl implements ank {
    /* renamed from: a */
    public final /* synthetic */ void mo313a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}

package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Video.Thumbnails;

/* compiled from: PG */
/* renamed from: aeq */
public final class aeq implements aer {
    /* renamed from: b */
    private static final String[] f9657b = new String[]{"_data"};
    /* renamed from: a */
    private final ContentResolver f9658a;

    public aeq(ContentResolver contentResolver) {
        this.f9658a = contentResolver;
    }

    /* renamed from: a */
    public final Cursor mo34a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f9658a.query(Thumbnails.EXTERNAL_CONTENT_URI, f9657b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }
}

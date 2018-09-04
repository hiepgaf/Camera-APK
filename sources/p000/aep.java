package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;

/* compiled from: PG */
/* renamed from: aep */
public final class aep implements aer {
    /* renamed from: b */
    private static final String[] f9655b = new String[]{"_data"};
    /* renamed from: a */
    private final ContentResolver f9656a;

    public aep(ContentResolver contentResolver) {
        this.f9656a = contentResolver;
    }

    /* renamed from: a */
    public final Cursor mo34a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f9656a.query(Thumbnails.EXTERNAL_CONTENT_URI, f9655b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}

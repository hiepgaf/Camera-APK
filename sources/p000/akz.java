package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: akz */
public final class akz implements akb, alb {
    /* renamed from: a */
    private final ContentResolver f9868a;

    public akz(ContentResolver contentResolver) {
        this.f9868a = contentResolver;
    }

    /* renamed from: a */
    public final adw mo100a(Uri uri) {
        return new adt(this.f9868a, uri);
    }

    /* renamed from: a */
    public final ajz mo91a(akh akh) {
        return new aky(this);
    }
}

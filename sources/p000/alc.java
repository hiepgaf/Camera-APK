package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: alc */
public final class alc implements akb, alb {
    /* renamed from: a */
    private final ContentResolver f9870a;

    public alc(ContentResolver contentResolver) {
        this.f9870a = contentResolver;
    }

    /* renamed from: a */
    public final adw mo100a(Uri uri) {
        return new aem(this.f9870a, uri);
    }

    /* renamed from: a */
    public final ajz mo91a(akh akh) {
        return new aky(this);
    }
}

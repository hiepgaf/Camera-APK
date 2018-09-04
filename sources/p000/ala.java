package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: ala */
public final class ala implements akb, alb {
    /* renamed from: a */
    private final ContentResolver f9869a;

    public ala(ContentResolver contentResolver) {
        this.f9869a = contentResolver;
    }

    /* renamed from: a */
    public final adw mo100a(Uri uri) {
        return new aef(this.f9869a, uri);
    }

    /* renamed from: a */
    public final ajz mo91a(akh akh) {
        return new aky(this);
    }
}

package p000;

import android.graphics.Bitmap.Config;

/* compiled from: PG */
/* renamed from: ahk */
final class ahk implements ahh {
    /* renamed from: a */
    public int f9802a;
    /* renamed from: b */
    public Config f9803b;
    /* renamed from: c */
    private final ahl f9804c;

    public ahk(ahl ahl) {
        this.f9804c = ahl;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahk)) {
            return false;
        }
        ahk ahk = (ahk) obj;
        if (this.f9802a == ahk.f9802a && arq.m658b(this.f9803b, ahk.f9803b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.f9802a * 31;
        Config config = this.f9803b;
        if (config != null) {
            hashCode = config.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo71a() {
        this.f9804c.m264a(this);
    }

    public final String toString() {
        return ahi.m6456a(this.f9802a, this.f9803b);
    }
}

package p000;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: anr */
final class anr extends anq {
    private anr(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: c */
    public final Class mo56c() {
        return this.a.getClass();
    }

    /* renamed from: d */
    public final int mo57d() {
        return Math.max(1, (this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight()) << 2);
    }

    /* renamed from: a */
    static agn m14671a(Drawable drawable) {
        return drawable != null ? new anr(drawable) : null;
    }

    /* renamed from: e */
    public final void mo58e() {
    }
}

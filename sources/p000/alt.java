package p000;

import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* renamed from: alt */
public final class alt extends anq implements agi {
    /* renamed from: b */
    private final agw f19786b;

    public alt(BitmapDrawable bitmapDrawable, agw agw) {
        super(bitmapDrawable);
        this.f19786b = agw;
    }

    /* renamed from: c */
    public final Class mo56c() {
        return BitmapDrawable.class;
    }

    /* renamed from: d */
    public final int mo57d() {
        return arq.m647a(((BitmapDrawable) this.a).getBitmap());
    }

    /* renamed from: a */
    public final void mo103a() {
        ((BitmapDrawable) this.a).getBitmap().prepareToDraw();
    }

    /* renamed from: e */
    public final void mo58e() {
        this.f19786b.mo63a(((BitmapDrawable) this.a).getBitmap());
    }
}

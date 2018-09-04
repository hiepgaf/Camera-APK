package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: aom */
public final class aom implements aoo {
    /* renamed from: a */
    private final agw f10119a;
    /* renamed from: b */
    private final aoo f10120b;
    /* renamed from: c */
    private final aoo f10121c;

    public aom(agw agw, aoo aoo, aoo aoo2) {
        this.f10119a = agw;
        this.f10120b = aoo;
        this.f10121c = aoo2;
    }

    /* renamed from: a */
    public final agn mo315a(agn agn, adp adp) {
        Drawable drawable = (Drawable) agn.mo55b();
        if (drawable instanceof BitmapDrawable) {
            return this.f10120b.mo315a(alv.m6617a(((BitmapDrawable) drawable).getBitmap(), this.f10119a), adp);
        }
        return drawable instanceof any ? this.f10121c.mo315a(agn, adp) : null;
    }
}

package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: alv */
public final class alv implements agi, agn {
    /* renamed from: a */
    private final Bitmap f9886a;
    /* renamed from: b */
    private final agw f9887b;

    public alv(Bitmap bitmap, agw agw) {
        this.f9886a = (Bitmap) aqe.m585a((Object) bitmap, "Bitmap must not be null");
        this.f9887b = (agw) aqe.m585a((Object) agw, "BitmapPool must not be null");
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo55b() {
        return this.f9886a;
    }

    /* renamed from: c */
    public final Class mo56c() {
        return Bitmap.class;
    }

    /* renamed from: d */
    public final int mo57d() {
        return arq.m647a(this.f9886a);
    }

    /* renamed from: a */
    public final void mo103a() {
        this.f9886a.prepareToDraw();
    }

    /* renamed from: a */
    public static alv m6617a(Bitmap bitmap, agw agw) {
        if (bitmap == null) {
            return null;
        }
        return new alv(bitmap, agw);
    }

    /* renamed from: e */
    public final void mo58e() {
        this.f9887b.mo63a(this.f9886a);
    }
}

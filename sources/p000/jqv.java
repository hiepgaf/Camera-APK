package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* compiled from: PG */
/* renamed from: jqv */
public final class jqv implements agw {
    /* renamed from: a */
    private final jqo f18964a;

    public jqv(jqo jqo) {
        this.f18964a = jqo;
    }

    /* renamed from: a */
    public final void mo60a() {
    }

    /* renamed from: b */
    private static void m13113b(Bitmap bitmap) {
        if (bitmap.hasAlpha() && !bitmap.isPremultiplied()) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: a */
    public final Bitmap mo59a(int i, int i2, Config config) {
        Bitmap bitmap = (Bitmap) this.f18964a.mo2041a("Pool adapter (get)", i, i2, config).mo3190d();
        jqv.m13113b(bitmap);
        return bitmap;
    }

    /* renamed from: b */
    public final Bitmap mo64b(int i, int i2, Config config) {
        Bitmap bitmap = (Bitmap) this.f18964a.mo2041a("Pool adapter (getDirty)", i, i2, config).mo3190d();
        jqv.m13113b(bitmap);
        return bitmap;
    }

    /* renamed from: a */
    public final void mo63a(Bitmap bitmap) {
        this.f18964a.mo2042a("Pool adapter (put)", bitmap).close();
    }

    /* renamed from: a */
    public final void mo61a(float f) {
    }

    /* renamed from: a */
    public final void mo62a(int i) {
    }
}

package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: jxq */
final class jxq implements jxy {
    /* renamed from: a */
    private final jxy f19098a;
    /* renamed from: b */
    private final jxy f19099b;

    public jxq(jxy jxy, jxy jxy2) {
        this.f19098a = jxy;
        this.f19099b = jxy2;
    }

    /* renamed from: a */
    public final int mo2062a(File file) {
        try {
            return this.f19098a.mo2062a(file);
        } catch (jxz e) {
            return this.f19099b.mo2062a(file);
        }
    }

    /* renamed from: b */
    public final boolean mo2063b(File file) {
        return this.f19098a.mo2063b(file) || this.f19099b.mo2063b(file);
    }

    /* renamed from: c */
    public final boolean mo2064c(File file) {
        try {
            return this.f19098a.mo2064c(file);
        } catch (jxz e) {
            return this.f19099b.mo2064c(file);
        }
    }

    /* renamed from: d */
    public final boolean mo2065d(File file) {
        try {
            return this.f19098a.mo2065d(file);
        } catch (jxz e) {
            return this.f19099b.mo2065d(file);
        }
    }

    /* renamed from: e */
    public final boolean mo2066e(File file) {
        return this.f19098a.mo2066e(file) || this.f19099b.mo2066e(file);
    }

    /* renamed from: f */
    public final File[] mo2067f(File file) {
        File[] f = this.f19098a.mo2067f(file);
        return f.length > 0 ? f : this.f19099b.mo2067f(file);
    }

    /* renamed from: g */
    public final long mo2068g(File file) {
        try {
            return this.f19098a.mo2068g(file);
        } catch (jxz e) {
            return this.f19099b.mo2068g(file);
        }
    }
}

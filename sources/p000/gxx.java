package p000;

import android.util.Size;

/* compiled from: PG */
/* renamed from: gxx */
public final class gxx {
    /* renamed from: a */
    public Size f5780a;
    /* renamed from: b */
    public Size f5781b;
    /* renamed from: c */
    private Boolean f5782c;
    /* renamed from: d */
    private hir f5783d;

    gxx(byte b) {
        this();
    }

    gxx(gxw gxw) {
        this();
        this.f5782c = Boolean.valueOf(gxw.mo1687e());
        this.f5780a = gxw.mo1686d();
        this.f5781b = gxw.mo1684b();
        this.f5783d = gxw.mo1683a();
    }

    /* renamed from: a */
    public final gxw m2899a() {
        jri.m13153b(m2898c().mo2084b());
        jri.m13153b(m2897b().mo2084b());
        Size size = (Size) m2898c().mo2081a();
        hir hir = (hir) m2897b().mo2081a();
        if (hir == hir.PORTRAIT || hir == hir.REVERSE_PORTRAIT) {
            this.f5781b = new Size(Math.min(size.getWidth(), size.getHeight()), Math.max(size.getWidth(), size.getHeight()));
        } else {
            this.f5781b = new Size(Math.max(size.getWidth(), size.getHeight()), Math.min(size.getWidth(), size.getHeight()));
        }
        String str = "";
        if (this.f5782c == null) {
            str = String.valueOf(str).concat(" windowSizeAsPreviewSize");
        }
        if (this.f5780a == null) {
            str = String.valueOf(str).concat(" windowSize");
        }
        if (this.f5781b == null) {
            str = String.valueOf(str).concat(" previewSize");
        }
        if (this.f5783d == null) {
            str = String.valueOf(str).concat(" orientation");
        }
        if (str.isEmpty()) {
            return new gxr(this.f5782c.booleanValue(), this.f5780a, this.f5781b, this.f5783d);
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: b */
    private final kbg m2897b() {
        hir hir = this.f5783d;
        if (hir != null) {
            return kbg.m4745c(hir);
        }
        return kau.f19138a;
    }

    /* renamed from: c */
    private final kbg m2898c() {
        Size size = this.f5781b;
        if (size != null) {
            return kbg.m4745c(size);
        }
        return kau.f19138a;
    }

    /* renamed from: a */
    public final gxx m2900a(hir hir) {
        if (hir == null) {
            throw new NullPointerException("Null orientation");
        }
        this.f5783d = hir;
        return this;
    }

    /* renamed from: a */
    public final gxx m2901a(boolean z) {
        this.f5782c = Boolean.valueOf(z);
        return this;
    }
}

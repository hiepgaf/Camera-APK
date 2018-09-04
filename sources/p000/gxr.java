package p000;

import android.util.Size;

/* compiled from: PG */
/* renamed from: gxr */
final class gxr extends gxw {
    /* renamed from: b */
    private final boolean f17550b;
    /* renamed from: c */
    private final Size f17551c;
    /* renamed from: d */
    private final Size f17552d;
    /* renamed from: e */
    private final hir f17553e;

    gxr(boolean z, Size size, Size size2, hir hir) {
        this.f17550b = z;
        this.f17551c = size;
        this.f17552d = size2;
        this.f17553e = hir;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxw)) {
            return false;
        }
        gxw gxw = (gxw) obj;
        if (this.f17550b == gxw.mo1687e() && this.f17551c.equals(gxw.mo1686d()) && this.f17552d.equals(gxw.mo1684b()) && this.f17553e.equals(gxw.mo1683a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.f17550b) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((i ^ 1000003) * 1000003) ^ this.f17551c.hashCode()) * 1000003) ^ this.f17552d.hashCode()) * 1000003) ^ this.f17553e.hashCode();
    }

    /* renamed from: a */
    public final hir mo1683a() {
        return this.f17553e;
    }

    /* renamed from: b */
    public final Size mo1684b() {
        return this.f17552d;
    }

    /* renamed from: c */
    public final gxx mo1685c() {
        return new gxx((gxw) this);
    }

    public final String toString() {
        boolean z = this.f17550b;
        String valueOf = String.valueOf(this.f17551c);
        String valueOf2 = String.valueOf(this.f17552d);
        String valueOf3 = String.valueOf(this.f17553e);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 95) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("CameraLayoutConstraints{windowSizeAsPreviewSize=");
        stringBuilder.append(z);
        stringBuilder.append(", windowSize=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", previewSize=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", orientation=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public final Size mo1686d() {
        return this.f17551c;
    }

    /* renamed from: e */
    public final boolean mo1687e() {
        return this.f17550b;
    }
}

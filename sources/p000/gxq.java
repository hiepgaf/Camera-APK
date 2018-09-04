package p000;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* renamed from: gxq */
public final class gxq extends gxv {
    /* renamed from: a */
    private final Size f17542a;
    /* renamed from: b */
    private final Rect f17543b;
    /* renamed from: c */
    private final Rect f17544c;
    /* renamed from: d */
    private final Rect f17545d;
    /* renamed from: e */
    private final Rect f17546e;
    /* renamed from: f */
    private final Rect f17547f;
    /* renamed from: g */
    private final Rect f17548g;
    /* renamed from: h */
    private final Rect f17549h;

    public gxq(Size size, Rect rect, Rect rect2, Rect rect3, Rect rect4, Rect rect5, Rect rect6, Rect rect7) {
        this.f17542a = size;
        this.f17543b = rect;
        this.f17544c = rect2;
        this.f17545d = rect3;
        this.f17546e = rect4;
        this.f17547f = rect5;
        this.f17548g = rect6;
        this.f17549h = rect7;
    }

    /* renamed from: a */
    public final Rect mo1675a() {
        return this.f17547f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxv)) {
            return false;
        }
        gxv gxv = (gxv) obj;
        if (this.f17542a.equals(gxv.mo1682h()) && this.f17543b.equals(gxv.mo1679e()) && this.f17544c.equals(gxv.mo1681g()) && this.f17545d.equals(gxv.mo1680f()) && this.f17546e.equals(gxv.mo1678d()) && this.f17547f.equals(gxv.mo1675a()) && this.f17548g.equals(gxv.mo1676b()) && this.f17549h.equals(gxv.mo1677c())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final Rect mo1676b() {
        return this.f17548g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f17542a.hashCode() ^ 1000003) * 1000003) ^ this.f17543b.hashCode()) * 1000003) ^ this.f17544c.hashCode()) * 1000003) ^ this.f17545d.hashCode()) * 1000003) ^ this.f17546e.hashCode()) * 1000003) ^ this.f17547f.hashCode()) * 1000003) ^ this.f17548g.hashCode()) * 1000003) ^ this.f17549h.hashCode();
    }

    /* renamed from: c */
    public final Rect mo1677c() {
        return this.f17549h;
    }

    /* renamed from: d */
    public final Rect mo1678d() {
        return this.f17546e;
    }

    /* renamed from: e */
    public final Rect mo1679e() {
        return this.f17543b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17542a);
        String valueOf2 = String.valueOf(this.f17543b);
        String valueOf3 = String.valueOf(this.f17544c);
        String valueOf4 = String.valueOf(this.f17545d);
        String valueOf5 = String.valueOf(this.f17546e);
        String valueOf6 = String.valueOf(this.f17547f);
        String valueOf7 = String.valueOf(this.f17548g);
        String valueOf8 = String.valueOf(this.f17549h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder stringBuilder = new StringBuilder((((((((length + 117) + length2) + length3) + length4) + length5) + length6) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length());
        stringBuilder.append("CameraLayoutBoxes{window=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", preview=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", uncoveredPreview=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", topBar=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", optionsBar=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", bottomBar=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", fullScreen=");
        stringBuilder.append(valueOf7);
        stringBuilder.append(", modeSwitchUi=");
        stringBuilder.append(valueOf8);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: f */
    public final Rect mo1680f() {
        return this.f17545d;
    }

    /* renamed from: g */
    public final Rect mo1681g() {
        return this.f17544c;
    }

    /* renamed from: h */
    public final Size mo1682h() {
        return this.f17542a;
    }
}

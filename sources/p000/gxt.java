package p000;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* renamed from: gxt */
final class gxt extends gyh {
    /* renamed from: a */
    private final Size f17557a;
    /* renamed from: b */
    private final Rect f17558b;
    /* renamed from: c */
    private final Rect f17559c;
    /* renamed from: d */
    private final int f17560d;
    /* renamed from: e */
    private final int f17561e = 0;

    gxt(Size size, Rect rect, Rect rect2, int i) {
        this.f17557a = size;
        this.f17558b = rect;
        this.f17559c = rect2;
        this.f17560d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gyh)) {
            return false;
        }
        gyh gyh = (gyh) obj;
        if (this.f17557a.equals(gyh.mo1695e()) && this.f17558b.equals(gyh.mo1694d()) && this.f17559c.equals(gyh.mo1693c()) && this.f17560d == gyh.mo1691a() && gyh.mo1692b() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo1691a() {
        return this.f17560d;
    }

    public final int hashCode() {
        return (((((((this.f17557a.hashCode() ^ 1000003) * 1000003) ^ this.f17558b.hashCode()) * 1000003) ^ this.f17559c.hashCode()) * 1000003) ^ this.f17560d) * 1000003;
    }

    /* renamed from: b */
    public final int mo1692b() {
        return 0;
    }

    /* renamed from: c */
    public final Rect mo1693c() {
        return this.f17559c;
    }

    /* renamed from: d */
    public final Rect mo1694d() {
        return this.f17558b;
    }

    /* renamed from: e */
    public final Size mo1695e() {
        return this.f17557a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17557a);
        String valueOf2 = String.valueOf(this.f17558b);
        String valueOf3 = String.valueOf(this.f17559c);
        int i = this.f17560d;
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 97) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("ViewfinderLayoutSpec{size=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", padding=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", margins=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", gravity=");
        stringBuilder.append(i);
        stringBuilder.append(", layoutDirection=");
        stringBuilder.append(0);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

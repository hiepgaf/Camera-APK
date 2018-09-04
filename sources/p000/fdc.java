package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: fdc */
final class fdc extends fcj {
    /* renamed from: a */
    private final PointF f15881a;
    /* renamed from: b */
    private final int f15882b;

    fdc(PointF pointF, int i) {
        this.f15881a = pointF;
        this.f15882b = i;
    }

    /* renamed from: b */
    public final int mo1355b() {
        return this.f15882b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fcj)) {
            return false;
        }
        fcj fcj = (fcj) obj;
        if (this.f15881a.equals(fcj.mo1356c()) && this.f15882b == fcj.mo1355b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15881a.hashCode() ^ 1000003) * 1000003) ^ this.f15882b;
    }

    /* renamed from: c */
    public final PointF mo1356c() {
        return this.f15881a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15881a);
        int i = this.f15882b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 58);
        stringBuilder.append("AfRoi{normalizedCenterPoint=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", confidenceScore=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

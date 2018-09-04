package p000;

/* compiled from: PG */
/* renamed from: gzl */
public final class gzl {
    /* renamed from: a */
    public final float f5858a = 1.0f;
    /* renamed from: b */
    public final float f5859b;
    /* renamed from: c */
    public final float f5860c;
    /* renamed from: d */
    private final float f5861d;

    public gzl(float f, float f2) {
        this.f5859b = f;
        this.f5861d = f2;
        float f3 = (this.f5861d - this.f5859b) / this.f5858a;
        if (Float.isNaN(f3)) {
            f3 = 0.0f;
        }
        this.f5860c = f3;
    }

    public final String toString() {
        float f = this.f5858a;
        float f2 = this.f5859b;
        float f3 = this.f5861d;
        StringBuilder stringBuilder = new StringBuilder(113);
        stringBuilder.append("LinearScale{mDomainA=");
        stringBuilder.append(0.0f);
        stringBuilder.append(", mDomainB=");
        stringBuilder.append(f);
        stringBuilder.append(", mRangeA=");
        stringBuilder.append(f2);
        stringBuilder.append(", mRangeB=");
        stringBuilder.append(f3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package p000;

/* compiled from: PG */
/* renamed from: jub */
public final class jub implements jtv {
    /* renamed from: a */
    private final jtv f19055a;
    /* renamed from: b */
    private final float f19056b;
    /* renamed from: c */
    private final float f19057c;
    /* renamed from: d */
    private final float f19058d;
    /* renamed from: e */
    private final float f19059e;
    /* renamed from: f */
    private final float f19060f;

    public jub(jtv jtv) {
        this(jtv, (byte) 0);
    }

    private jub(jtv jtv, byte b) {
        this.f19055a = jtv;
        this.f19056b = 1.0f;
        this.f19057c = -1.0f;
        this.f19058d = 1.0f;
        this.f19059e = Float.NaN;
        this.f19060f = Float.NaN;
    }

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        float a = this.f19055a.mo2049a(j).mo2076a();
        float f = this.f19059e;
        if (a >= f) {
            f = a;
        }
        a = this.f19060f;
        if (f > a) {
            f = a;
        }
        a = this.f19058d;
        if (a != 1.0f) {
            f = (float) Math.pow((double) f, (double) a);
            if (Float.isNaN(f)) {
                f = 0.0f;
            }
        }
        return new jzc((f * this.f19057c) + this.f19056b);
    }

    /* renamed from: b */
    public final void mo2051b(long j) {
        this.f19055a.mo2051b(j);
    }

    /* renamed from: c */
    public final void mo2052c(long j) {
        this.f19055a.mo2052c(j);
    }

    /* renamed from: a */
    public final void mo2050a() {
        this.f19055a.mo2050a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19055a);
        float f = this.f19056b;
        float f2 = this.f19057c;
        float f3 = this.f19058d;
        float f4 = this.f19059e;
        float f5 = this.f19060f;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 164);
        stringBuilder.append("PolynomialScoreTransformer[scorer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", translate=");
        stringBuilder.append(f);
        stringBuilder.append(", scale=");
        stringBuilder.append(f2);
        stringBuilder.append(", exponent=");
        stringBuilder.append(f3);
        stringBuilder.append(", clampLow=");
        stringBuilder.append(f4);
        stringBuilder.append(", clampHigh=");
        stringBuilder.append(f5);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

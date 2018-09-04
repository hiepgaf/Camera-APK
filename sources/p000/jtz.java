package p000;

/* compiled from: PG */
/* renamed from: jtz */
public final class jtz implements jtv {
    /* renamed from: a */
    private final jxm f19050a;
    /* renamed from: b */
    private final jxi f19051b;
    /* renamed from: c */
    private final float f19052c;

    public jtz(jxm jxm, jxi jxi) {
        this(jxm, jxi, Float.NEGATIVE_INFINITY);
    }

    public jtz(jxm jxm, jxi jxi, float f) {
        jri.m13152b((Object) jxm);
        this.f19050a = jxm;
        this.f19051b = jxi;
        this.f19052c = f;
    }

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        jxa a = this.f19050a.m4672a(j);
        if (a.m4668b(this.f19051b)) {
            return new jzc(((Float) a.m4665a(this.f19051b)).floatValue());
        }
        return new jzc(this.f19052c);
    }

    /* renamed from: b */
    public final void mo2051b(long j) {
    }

    /* renamed from: c */
    public final void mo2052c(long j) {
    }

    /* renamed from: a */
    public final void mo2050a() {
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19051b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
        stringBuilder.append("MetadataFrameScorer[key=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

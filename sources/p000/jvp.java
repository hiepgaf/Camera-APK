package p000;

/* compiled from: PG */
/* renamed from: jvp */
public final class jvp extends jun {
    /* renamed from: a */
    private final int f21959a = 500;
    /* renamed from: b */
    private final jtv f21960b;

    public jvp(jtv jtv) {
        this.f21960b = jtv;
    }

    /* renamed from: a */
    public final boolean mo3184a(juh juh) {
        return this.f21960b.mo2049a(juh.f7987d).mo2076a() - this.f21960b.mo2049a(juh.f7986c).mo2076a() >= ((float) this.f21959a);
    }

    public final String toString() {
        int i = this.f21959a;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("MinLengthSegmentSelector[minLengthMs=");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

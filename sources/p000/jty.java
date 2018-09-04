package p000;

/* compiled from: PG */
/* renamed from: jty */
public final class jty implements jtl {
    /* renamed from: a */
    private final jxm f19049a;

    public jty(jxm jxm) {
        jri.m13152b((Object) jxm);
        this.f19049a = jxm;
    }

    /* renamed from: a */
    public final jtv mo2053a(String str) {
        jxi a = jxa.m4664a(str.toUpperCase());
        return a != null ? new jtz(this.f19049a, a, 0.0f) : null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19049a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("MetadataFeatureScorerProvider[metadataStore = ");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

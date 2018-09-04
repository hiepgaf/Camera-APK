package p000;

/* compiled from: PG */
/* renamed from: fzm */
public final class fzm {
    /* renamed from: a */
    public final fzo f4856a;
    /* renamed from: b */
    public final int f4857b;
    /* renamed from: c */
    public final ken f4858c;
    /* renamed from: d */
    private final kes f4859d;

    public fzm(fzo fzo, kes kes, int i, ken ken) {
        this.f4856a = fzo;
        this.f4859d = kes;
        this.f4857b = i;
        this.f4858c = ken;
    }

    /* renamed from: a */
    public final int m2432a(fzp fzp) {
        return ((Integer) this.f4859d.get(fzp)).intValue();
    }

    /* renamed from: b */
    public final boolean m2433b(fzp fzp) {
        return this.f4859d.containsKey(fzp);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4856a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
        stringBuilder.append("ImmutableCategorySpec#");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}

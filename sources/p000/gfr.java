package p000;

/* renamed from: gfr */
final /* synthetic */ class gfr implements kbn {
    /* renamed from: a */
    private final gfo f16887a;

    gfr(gfo gfo) {
        this.f16887a = gfo;
    }

    /* renamed from: b */
    public final Object mo605b() {
        int size = this.f16887a.f16883a.size();
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("There are ");
        stringBuilder.append(size);
        stringBuilder.append(" listeners after removal");
        return stringBuilder.toString();
    }
}

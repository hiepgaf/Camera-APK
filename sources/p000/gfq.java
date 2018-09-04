package p000;

/* renamed from: gfq */
final /* synthetic */ class gfq implements kbn {
    /* renamed from: a */
    private final gfo f16886a;

    gfq(gfo gfo) {
        this.f16886a = gfo;
    }

    /* renamed from: b */
    public final Object mo605b() {
        int size = this.f16886a.f16883a.size();
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("There are ");
        stringBuilder.append(size);
        stringBuilder.append(" listeners after addition");
        return stringBuilder.toString();
    }
}

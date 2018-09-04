package p000;

/* renamed from: gfp */
final /* synthetic */ class gfp implements kbn {
    /* renamed from: a */
    private final gfo f16885a;

    gfp(gfo gfo) {
        this.f16885a = gfo;
    }

    /* renamed from: b */
    public final Object mo605b() {
        int size = this.f16885a.f16883a.size();
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("There are ");
        stringBuilder.append(size);
        stringBuilder.append(" listeners before addition");
        return stringBuilder.toString();
    }
}

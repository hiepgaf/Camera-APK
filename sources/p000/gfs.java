package p000;

/* renamed from: gfs */
final /* synthetic */ class gfs implements kbn {
    /* renamed from: a */
    private final gfo f16888a;

    gfs(gfo gfo) {
        this.f16888a = gfo;
    }

    /* renamed from: b */
    public final Object mo605b() {
        int size = this.f16888a.f16883a.size();
        StringBuilder stringBuilder = new StringBuilder(70);
        stringBuilder.append("Couldn't find listener.  There are ");
        stringBuilder.append(size);
        stringBuilder.append(" listeners after removal");
        return stringBuilder.toString();
    }
}

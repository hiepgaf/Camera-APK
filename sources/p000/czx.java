package p000;

/* renamed from: czx */
final /* synthetic */ class czx implements gua {
    /* renamed from: a */
    private final czw f13022a;

    czx(czw czw) {
        this.f13022a = czw;
    }

    /* renamed from: a */
    public final void mo1131a(long j) {
        czw czw = this.f13022a;
        if (j <= 120000000) {
            iqz iqz = czw.f2899g;
            StringBuilder stringBuilder = new StringBuilder(70);
            stringBuilder.append("Low storage alert triggered for burst. Free space=");
            stringBuilder.append(j);
            iqz.mo520f(stringBuilder.toString());
            czw.f2897e.execute(new czy(czw));
        }
    }
}

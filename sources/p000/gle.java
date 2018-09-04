package p000;

/* renamed from: gle */
final /* synthetic */ class gle implements iqb {
    /* renamed from: a */
    private final gkt f17014a;

    gle(gkt gkt) {
        this.f17014a = gkt;
    }

    /* renamed from: a */
    public final void mo369a(Object obj) {
        gkt gkt = this.f17014a;
        eql eql = (eql) obj;
        if (eql != null) {
            boolean e = eql.m9834e();
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("rows deleted successfully : ");
            stringBuilder.append(e);
            gkt.m15777a(stringBuilder.toString());
        }
    }
}

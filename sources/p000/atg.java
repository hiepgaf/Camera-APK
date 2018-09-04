package p000;

/* compiled from: PG */
/* renamed from: atg */
final class atg implements iqt {
    /* renamed from: a */
    private boolean f10210a = true;
    /* renamed from: b */
    private final /* synthetic */ atd f10211b;

    atg(atd atd) {
        this.f10211b = atd;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f10210a) {
            this.f10210a = false;
        } else if (!bool.booleanValue()) {
            this.f10211b.close();
        }
    }
}

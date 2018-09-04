package p000;

/* renamed from: brd */
public final /* synthetic */ class brd implements kaw {
    /* renamed from: a */
    private final bsn f11214a;
    /* renamed from: b */
    private final bsq f11215b;

    public brd(bsn bsn, bsq bsq) {
        this.f11214a = bsn;
        this.f11215b = bsq;
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        boolean z = false;
        Boolean bool = (Boolean) obj;
        if (this.f11214a.m954a(this.f11215b) && bool.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

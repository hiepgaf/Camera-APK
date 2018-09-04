package p000;

/* compiled from: PG */
/* renamed from: asl */
public final class asl {
    /* renamed from: a */
    private final bpt f939a;
    /* renamed from: b */
    private final fbg f940b;
    /* renamed from: c */
    private final kwk f941c;
    /* renamed from: d */
    private atd f942d = null;

    public asl(bpt bpt, fbg fbg, kwk kwk) {
        this.f939a = bpt;
        this.f940b = fbg;
        this.f941c = kwk;
    }

    /* renamed from: a */
    public final atc m682a() {
        atd atd = this.f942d;
        if (atd != null) {
            atd.close();
            this.f942d = null;
        }
        this.f940b.mo1337b();
        this.f939a.f1417a.mo2700d();
        this.f939a.m938a(false);
        this.f942d = (atd) this.f941c.mo345a();
        return this.f942d;
    }
}

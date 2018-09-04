package p000;

/* compiled from: PG */
/* renamed from: boy */
public final class boy implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ aws f1366a;
    /* renamed from: b */
    private final /* synthetic */ bpi f1367b;
    /* renamed from: c */
    private final /* synthetic */ bpd f1368c;
    /* renamed from: d */
    private final /* synthetic */ ikd f1369d;
    /* renamed from: e */
    private final /* synthetic */ enr f1370e;

    public boy(aws aws, bpi bpi, bpd bpd, ikd ikd, enr enr) {
        this.f1366a = aws;
        this.f1367b = bpi;
        this.f1368c = bpd;
        this.f1369d = ikd;
        this.f1370e = enr;
    }

    public final void run() {
        iji a = this.f1366a.mo373a();
        bpi bpi = this.f1367b;
        Object obj = this.f1368c;
        jri.m13152b(obj);
        bpi.f20137a.add(obj);
        a.mo1879a(new bpj(bpi, obj));
        eio.m1756a(this.f1369d, this.f1370e, this.f1368c);
    }
}

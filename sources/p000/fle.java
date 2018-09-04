package p000;

/* compiled from: PG */
/* renamed from: fle */
final class fle extends bcj implements bbh, fyl {
    /* renamed from: a */
    private final bbt f23187a;
    /* renamed from: b */
    private final ilp f23188b;

    private fle(bbt bbt, ilp ilp) {
        super(bbt);
        this.f23187a = bbt;
        this.f23188b = ilp;
    }

    /* renamed from: d */
    public static fle m17329d() {
        bbt bbt = new bbt(new flf());
        return new fle(bbt, ilq.m3831b(bbt.f19863a));
    }

    /* renamed from: e */
    public final boolean mo1403e() {
        fjj fjj = (fjj) this.f23187a.mo2651c();
        if (fjj == null) {
            return false;
        }
        fjj.close();
        return true;
    }

    /* renamed from: f */
    public final ilp mo1404f() {
        return this.f23188b;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2649a() {
        return (fjj) this.f23187a.mo2649a();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo2651c() {
        return (fjj) this.f23187a.mo2651c();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        this.f23187a.mo348a((fjj) obj);
    }
}

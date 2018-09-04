package p000;

/* compiled from: PG */
/* renamed from: fxd */
public final class fxd extends imt {
    /* renamed from: a */
    private final fxi f23216a;
    /* renamed from: b */
    private boolean f23217b;

    public fxd(ilp ilp, ffc ffc, fxi fxi) {
        super(ilp);
        this.f23217b = ffc.mo1939u();
        this.f23216a = fxi;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3369b(Object obj) {
        String str = (String) obj;
        if (this.f23217b) {
            return fxi.m2411a(str, this.f23216a);
        }
        return fxi.OFF;
    }

    /* renamed from: c */
    protected final /* synthetic */ Object mo3370c(Object obj) {
        return ((fxi) obj).f4787d;
    }
}

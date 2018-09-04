package p000;

/* compiled from: PG */
/* renamed from: drk */
public final class drk extends imq {
    /* renamed from: b */
    private final fwl f23009b;
    /* renamed from: c */
    private final fwl f23010c;
    /* renamed from: d */
    private final fwl f23011d;
    /* renamed from: e */
    private final fwl f23012e;
    /* renamed from: f */
    private final fwl f23013f;

    static {
        bli.m862a("ZslHdrPSelect");
    }

    public drk(ilp ilp, fwl fwl, fwl fwl2, fwl fwl3, fwl fwl4, fwl fwl5) {
        super(ilp);
        this.f23009b = fwl;
        this.f23010c = fwl2;
        this.f23011d = fwl3;
        this.f23012e = fwl4;
        this.f23013f = fwl5;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3397b(Object obj) {
        fxo fxo = (fxo) obj;
        switch (fxo.ordinal()) {
            case 0:
                return this.f23009b;
            case 1:
                return this.f23010c;
            case 2:
                return this.f23011d;
            case 3:
                return this.f23012e;
            case 4:
                return this.f23013f;
            default:
                String valueOf = String.valueOf(fxo);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                stringBuilder.append("Invalid AutoHdrPlusRecommendation enum instance:");
                stringBuilder.append(valueOf);
                throw new AssertionError(stringBuilder.toString());
        }
    }
}

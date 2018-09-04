package p000;

/* compiled from: PG */
/* renamed from: fls */
final class fls implements fkz {
    /* renamed from: a */
    private final /* synthetic */ fly f16160a;
    /* renamed from: b */
    private final /* synthetic */ int f16161b;
    /* renamed from: c */
    private final /* synthetic */ flr f16162c;

    fls(flr flr, fly fly, int i) {
        this.f16162c = flr;
        this.f16160a = fly;
        this.f16161b = i;
    }

    /* renamed from: a */
    public final boolean mo1402a() {
        int intValue = ((Integer) this.f16162c.f16157a.mo1430c().mo2860b()).intValue();
        int intValue2 = ((Integer) this.f16160a.f23192a.mo2860b()).intValue();
        if (intValue > intValue2) {
            return true;
        }
        if (intValue2 > this.f16161b) {
            return true;
        }
        return false;
    }
}

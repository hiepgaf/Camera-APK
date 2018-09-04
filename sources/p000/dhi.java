package p000;

/* compiled from: PG */
/* renamed from: dhi */
public final class dhi implements kwk {
    /* renamed from: a */
    private final kwk f13275a;

    public dhi(kwk kwk) {
        this.f13275a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        inc inc;
        bsn bsn = (bsn) this.f13275a.mo345a();
        inc inc2 = inc.FPS_120;
        kbg a = bsn.m952a(bin.f1191c);
        if (!a.mo2084b()) {
            inc = inc2;
        } else if (((Integer) a.mo2081a()).intValue() == 240) {
            inc = inc.FPS_240;
        } else {
            inc = inc2;
        }
        return (ilb) ktm.m13963a(new ilb(inc), "Cannot return null from a non-@Nullable @Provides method");
    }
}

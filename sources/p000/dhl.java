package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dhl */
public final class dhl implements kwk {
    /* renamed from: a */
    private final kwk f13279a;
    /* renamed from: b */
    private final kwk f13280b;

    public dhl(kwk kwk, kwk kwk2) {
        this.f13279a = kwk;
        this.f13280b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        iur b;
        Object valueOf;
        kwk kwk = this.f13279a;
        bfk bfk = (bfk) kwk.mo345a();
        fbn fbn = (fbn) this.f13280b.mo345a();
        iur b2 = fbn.mo1346b(iut.BACK);
        if (b2 == null) {
            b = fbn.mo1346b(iut.FRONT);
        } else {
            b = b2;
        }
        if (b != null) {
            boolean z;
            boolean z2;
            bez bez = (bez) bfk.mo2670b(b).mo2081a();
            for (inc inc : inc.m3873b()) {
                if (bez.f1114b.containsKey(inc) && !((List) bez.f1114b.get(inc)).isEmpty()) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                z2 = false;
            } else if (bez.m803a(inc.FPS_240).isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            valueOf = Boolean.valueOf(z2);
        } else {
            valueOf = Boolean.valueOf(false);
        }
        return (Boolean) ktm.m13963a(valueOf, "Cannot return null from a non-@Nullable @Provides method");
    }
}

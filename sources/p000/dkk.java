package p000;

/* compiled from: PG */
/* renamed from: dkk */
public final class dkk implements kwk {
    /* renamed from: a */
    private final kwk f13531a;

    public dkk(kwk kwk) {
        this.f13531a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        bfk bfk = (bfk) this.f13531a.mo345a();
        fbn a = bfk.mo2666a();
        iut[] values = iut.values();
        int length = values.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            boolean z2;
            iut iut = values[i];
            if (a.mo1349c(iut)) {
                kbg b = bfk.mo2670b(a.mo1346b(iut));
                if (b.mo2084b()) {
                    z2 = !z ? ((bez) b.mo2081a()).m804a() : true;
                } else {
                    z2 = z;
                }
            } else {
                z2 = z;
            }
            i++;
            z = z2;
        }
        return (djq) ktm.m13963a(new djq(z), "Cannot return null from a non-@Nullable @Provides method");
    }
}

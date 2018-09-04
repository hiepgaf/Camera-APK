package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: aty */
public final class aty implements kwk {
    /* renamed from: a */
    private final kwk f10246a;
    /* renamed from: b */
    private final kwk f10247b;
    /* renamed from: c */
    private final kwk f10248c;

    private aty(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f10246a = kwk;
        this.f10247b = kwk2;
        this.f10248c = kwk3;
    }

    /* renamed from: a */
    public static aty m7005a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new aty(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f10246a;
        kwk kwk2 = this.f10247b;
        kwk kwk3 = this.f10248c;
        ffc ffc = (ffc) kwk.mo345a();
        kwk2.mo345a();
        if (ffc.mo1937s()) {
            a = keu.m13472a(fds.m10239a(ken.m13453a((fiw) kwk3.mo345a())));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}

package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ats */
public final class ats implements kwk {
    /* renamed from: a */
    private final kwk f10225a;
    /* renamed from: b */
    private final kwk f10226b;

    private ats(kwk kwk, kwk kwk2) {
        this.f10225a = kwk;
        this.f10226b = kwk2;
    }

    /* renamed from: a */
    public static ats m6993a(kwk kwk, kwk kwk2) {
        return new ats(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f10225a;
        Object obj = (aug) kwk.mo345a();
        if (((ffc) this.f10226b.mo345a()).mo1937s()) {
            obj = keu.m13472a(fds.m10239a(ken.m13453a(obj)));
        } else {
            obj = kgn.f22045a;
        }
        return (Set) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}

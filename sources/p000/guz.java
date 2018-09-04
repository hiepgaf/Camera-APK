package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: guz */
public final class guz implements kwk {
    /* renamed from: a */
    private final kwk f17385a;
    /* renamed from: b */
    private final kwk f17386b;
    /* renamed from: c */
    private final kwk f17387c;
    /* renamed from: d */
    private final kwk f17388d;

    private guz(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f17385a = kwk;
        this.f17386b = kwk2;
        this.f17387c = kwk3;
        this.f17388d = kwk4;
    }

    /* renamed from: a */
    public static guz m11564a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new guz(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f17385a;
        kwk kwk2 = this.f17386b;
        kwk kwk3 = this.f17387c;
        kbg kbg = (kbg) kwk3.mo345a();
        kbg kbg2 = (kbg) this.f17388d.mo345a();
        if (kbg.mo2084b() && kbg2.mo2084b()) {
            a = keu.m13472a(new gus(kbg, kwk, kbg2, kwk2));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}

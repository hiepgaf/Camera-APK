package p000;

import android.os.Handler;
import java.util.Set;

/* compiled from: PG */
/* renamed from: exv */
public final class exv implements kwk {
    /* renamed from: a */
    private final kwk f15728a;
    /* renamed from: b */
    private final kwk f15729b;
    /* renamed from: c */
    private final kwk f15730c;
    /* renamed from: d */
    private final kwk f15731d;
    /* renamed from: e */
    private final kwk f15732e;

    private exv(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f15728a = kwk;
        this.f15729b = kwk2;
        this.f15730c = kwk3;
        this.f15731d = kwk4;
        this.f15732e = kwk5;
    }

    /* renamed from: a */
    public static exv m10064a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new exv(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f15728a;
        kwk kwk2 = this.f15729b;
        kwk kwk3 = this.f15730c;
        if (euh.m2131a((bmb) this.f15731d.mo345a(), (etg) this.f15732e.mo345a())) {
            ixb ixb = (ixb) kwk.mo345a();
            exi exi = (exi) kwk2.mo345a();
            exi.getClass();
            ixb.mo3148a(new exm(exi), (Handler) kwk3.mo345a());
            a = keu.m13472a(ixb.mo3154g());
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}

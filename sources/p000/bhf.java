package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: bhf */
public final class bhf implements bhe {
    /* renamed from: a */
    public static final String f10862a = bli.m862a("CdrAfScanner");
    /* renamed from: b */
    public final ikp f10863b;
    /* renamed from: c */
    public final iqt f10864c;
    /* renamed from: d */
    public final iqt f10865d;
    /* renamed from: e */
    private final bgw f10866e;

    public bhf(bgw bgw, ikp ikp, iqt iqt, iqt iqt2) {
        this.f10866e = bgw;
        this.f10863b = ikp;
        this.f10864c = iqt;
        this.f10865d = iqt2;
    }

    /* renamed from: a */
    public final aub mo440a(bhj bhj, bhs bhs, boolean z, asw asw, List list, Runnable runnable) {
        boolean z2;
        this.f10863b.m12262a();
        kpk a = this.f10866e.mo438a(bhj, bhs, z, asw.f949a, list);
        if (a != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13143a(z2);
        kpw d = kpw.m18056d();
        kow.m13622a(a, new bhg(this, d, runnable), kpq.f8410a);
        return new bhi(this, a, d, runnable, asw);
    }
}

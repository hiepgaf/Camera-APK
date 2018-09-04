package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: gga */
public final class gga implements kov {
    /* renamed from: a */
    private final /* synthetic */ gkr f16890a;
    /* renamed from: b */
    private final /* synthetic */ gfz f16891b;

    public gga(gfz gfz, gkr gkr) {
        this.f16891b = gfz;
        this.f16890a = gkr;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m866b(gfz.f23229c, "Lucky Shot Filter failed to return valid result.");
    }

    public final /* synthetic */ void b_(Object obj) {
        Set set = (Set) obj;
        if (set != null) {
            this.f16891b.m17365a(set, this.f16890a);
        }
    }
}

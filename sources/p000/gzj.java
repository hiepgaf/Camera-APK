package p000;

/* compiled from: PG */
/* renamed from: gzj */
public final class gzj implements kov {
    /* renamed from: a */
    private final /* synthetic */ gwv f17580a;

    public gzj(gwv gwv) {
        this.f17580a = gwv;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m871d(gwv.f17487a, "PassiveFocusScanAnimation: not started");
    }

    public final /* synthetic */ void b_(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            bli.m871d(gwv.f17487a, "PassiveFocusScanAnimation: completed");
            this.f17580a.f17505q.mo2795c();
            return;
        }
        bli.m871d(gwv.f17487a, "PassiveFocusScanAnimation: cancelled");
    }

    /* renamed from: a */
    public static float m11685a(long j, long j2, float f) {
        if (j <= j2) {
            return 0.0f;
        }
        return ((float) (j - j2)) / f;
    }
}

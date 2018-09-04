package p000;

/* compiled from: PG */
/* renamed from: haj */
public final class haj implements kov {
    /* renamed from: a */
    private final /* synthetic */ gwv f17603a;

    public haj(gwv gwv) {
        this.f17603a = gwv;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m871d(gwv.f17487a, "ActiveFocusScanAnimation: not started");
    }

    public final /* synthetic */ void b_(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            bli.m871d(gwv.f17487a, "ActiveFocusScanAnimation: completed");
            this.f17603a.f17505q.mo2792b();
            return;
        }
        bli.m871d(gwv.f17487a, "ActiveFocusScanAnimation: cancelled");
    }
}

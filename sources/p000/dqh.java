package p000;

/* compiled from: PG */
/* renamed from: dqh */
final class dqh implements kov {
    /* renamed from: a */
    private final /* synthetic */ dqf f14238a;

    dqh(dqf dqf) {
        this.f14238a = dqf;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f14238a.f21155d.mo520f("Failed to close the CameraDevice because Future<CameraDevice> failed.");
    }

    public final /* synthetic */ void b_(Object obj) {
        ((iwl) obj).close();
        this.f14238a.f21155d.mo520f("CameraDevice closed.");
    }
}

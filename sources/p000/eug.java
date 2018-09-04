package p000;

/* compiled from: PG */
/* renamed from: eug */
public final class eug implements eyu {
    /* renamed from: a */
    public final kbn f15554a;
    /* renamed from: b */
    public kge f15555b;
    /* renamed from: c */
    public boolean f15556c = false;
    /* renamed from: d */
    public boolean f15557d;
    /* renamed from: e */
    public final kpw f15558e = kpw.m18056d();
    /* renamed from: f */
    public final long f15559f;
    /* renamed from: g */
    public final kpw f15560g = kpw.m18056d();
    /* renamed from: h */
    private final /* synthetic */ etx f15561h;

    eug(etx etx, kbn kbn, kge kge, long j) {
        this.f15561h = etx;
        this.f15554a = kbn;
        this.f15555b = kge;
        this.f15559f = j;
    }

    /* renamed from: a */
    public final void mo1290a() {
        synchronized (this.f15561h.f15542c) {
            if (this.f15557d) {
                bli.m874e(etx.f15540a, "Cancelling session twice", new Throwable());
            } else if (this.f15555b.m13499a()) {
                bli.m873e(etx.f15540a, "Cancelling session that already ended");
            } else {
                this.f15557d = true;
                this.f15561h.m9943b();
                this.f15558e.cancel(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo1291a(long j) {
        synchronized (this.f15561h.f15542c) {
            if (this.f15555b.m13499a()) {
                bli.m873e(etx.f15540a, "Ending session twice");
            } else if (this.f15557d) {
                bli.m873e(etx.f15540a, "Ending already cancelled session");
            } else {
                this.f15555b = kge.m13495a((Long) this.f15555b.f19198a.mo2123a(), Long.valueOf(j));
                this.f15561h.m9943b();
                this.f15561h.f15541b.m2119c();
            }
        }
    }
}

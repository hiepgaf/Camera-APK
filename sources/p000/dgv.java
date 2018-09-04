package p000;

/* compiled from: PG */
/* renamed from: dgv */
final class dgv implements hnz {
    /* renamed from: a */
    private final /* synthetic */ dgl f13182a;

    dgv(dgl dgl) {
        this.f13182a = dgl;
    }

    /* renamed from: a */
    public final void mo1115a(boolean z) {
        if (!z) {
            dgl dgl = this.f13182a;
            cwh cwh = dgl.f21024z;
            boolean z2 = cwh != null ? ((Boolean) cwh.m15227b().mo2860b()).booleanValue() ? !dgl.f21008j.f17673a.m5503c() : false : false;
            if (z2) {
                dgl dgl2 = this.f13182a;
                dgl2.f21023y = true;
                dgl2.f21003e.onShutterButtonClick();
            }
        }
        this.f13182a.f20976C.m3026a(z);
    }

    /* renamed from: b */
    public final void mo1116b(boolean z) {
        if (z && !this.f13182a.f21008j.f17673a.m5503c()) {
            this.f13182a.f21020v.mo1765j();
        }
    }

    /* renamed from: c */
    public final void mo1117c(boolean z) {
        if (z && !this.f13182a.f21008j.f17673a.m5503c()) {
            this.f13182a.f21020v.mo1766k();
        }
    }
}

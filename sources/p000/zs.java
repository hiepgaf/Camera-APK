package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: zs */
public abstract class zs {
    /* renamed from: i */
    public static final aby f9591i = new aby("CamAgnt");

    /* renamed from: a */
    public abstract abg mo2542a();

    /* renamed from: a */
    public abstract void mo2543a(abi abi);

    /* renamed from: b */
    public abstract abi mo2544b();

    /* renamed from: c */
    protected abstract Handler mo2545c();

    /* renamed from: d */
    protected abstract abq mo2546d();

    /* renamed from: e */
    public abstract abs mo2547e();

    /* renamed from: f */
    public abstract void mo2548f();

    /* renamed from: a */
    public final void m6258a(boolean z) {
        if (z) {
            try {
                if (!mo2546d().m78c()) {
                    aaw aaw = new aaw();
                    mo2547e().m81a(new zu(this, aaw), aaw.f39b, "camera release");
                    return;
                }
                return;
            } catch (RuntimeException e) {
                mo2544b().mo2579a(e);
                return;
            }
        }
        mo2547e().m80a(new zv(this));
    }
}

package p000;

import android.hardware.Camera.Parameters;

/* compiled from: PG */
/* renamed from: yw */
final class yw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Parameters[] f9546a;
    /* renamed from: b */
    private final /* synthetic */ aaw f9547b;
    /* renamed from: c */
    private final /* synthetic */ yu f9548c;

    yw(yu yuVar, Parameters[] parametersArr, aaw aaw) {
        this.f9548c = yuVar;
        this.f9546a = parametersArr;
        this.f9547b = aaw;
    }

    public final void run() {
        this.f9548c.f19755a.f19747d.obtainMessage(202, this.f9546a).sendToTarget();
        this.f9548c.f19755a.f19747d.post(this.f9547b.f38a);
    }
}

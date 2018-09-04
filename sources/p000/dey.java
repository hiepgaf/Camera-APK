package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: dey */
final class dey implements aat {
    /* renamed from: a */
    private final /* synthetic */ des f13104a;

    dey(des des) {
        this.f13104a = des;
    }

    /* renamed from: a */
    public final void mo4a() {
        boolean z = false;
        des des = this.f13104a;
        ejy ejy = des.f22836v;
        if (ejy != null) {
            des.f22826l = true;
            ejy.f3746v = true;
            des.f22818d.f3901b = true;
            ejy.f3726b.f3760G = false;
            des.f22823i.start();
            des = this.f13104a;
            des.m17046m();
            des.f22797E.m2207a(0, 0, true);
            try {
                des = this.f13104a;
                if (des.f22836v.m1822b() <= 0.0f) {
                    z = true;
                }
                des.f22800H = z;
                des des2 = this.f13104a;
                Handler handler = des2.f22801I;
                if (handler != null) {
                    if (handler != null) {
                        handler.obtainMessage(1).sendToTarget();
                        des2.f22801I.obtainMessage(2, des2.f22840z, des2.f22793A).sendToTarget();
                    }
                    des2 = this.f13104a;
                    des2.f22836v.f3747w = des2.f22802J;
                }
                this.f13104a.m17039c(true);
            } catch (IllegalStateException e) {
            }
        }
    }
}

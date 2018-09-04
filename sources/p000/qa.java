package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: qa */
final class qa implements Runnable {
    /* renamed from: a */
    private qd f9040a;
    /* renamed from: b */
    private final /* synthetic */ py f9041b;

    public qa(py pyVar, qd qdVar) {
        this.f9041b = pyVar;
        this.f9040a = qdVar;
    }

    public final void run() {
        py pyVar = this.f9041b;
        if (pyVar.c != null) {
            oq oqVar = pyVar.c.f19480b;
            if (oqVar != null) {
                oqVar.mo2352m();
            }
        }
        View view = (View) this.f9041b.e;
        if (!(view == null || view.getWindowToken() == null || !this.f9040a.m5672e())) {
            this.f9041b.f22544k = this.f9040a;
        }
        this.f9041b.f22546m = null;
    }
}

package p000;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* renamed from: qd */
final class qd extends pc {
    /* renamed from: d */
    private final /* synthetic */ py f19547d;

    public qd(py pyVar, Context context, op opVar, View view) {
        this.f19547d = pyVar;
        super(context, opVar, view, true);
        m5667a(pyVar.f22547n);
    }

    /* renamed from: d */
    protected final void mo2449d() {
        py pyVar = this.f19547d;
        if (pyVar.c != null) {
            pyVar.c.close();
        }
        this.f19547d.f22544k = null;
        super.mo2449d();
    }
}

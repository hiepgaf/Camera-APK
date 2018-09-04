package p000;

import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: cgc */
final class cgc implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ cfk f1943a;

    cgc(cfk cfk) {
        this.f1943a = cfk;
    }

    public final void run() {
        hio hio = null;
        FrameLayout frameLayout = this.f1943a.f20254E;
        if (frameLayout != null) {
            int width = frameLayout.getWidth();
            int c = this.f1943a.f20256G.mo1016c();
            try {
                err e;
                cre d = this.f1943a.f20256G.mo1020d(0);
                if (d != cre.f2587c) {
                    e = d.mo1066e();
                } else {
                    e = null;
                }
                if (e != null) {
                    hio = e.mo1042a(width, width);
                }
                this.f1943a.f20282h.post(new cgd(this, e, hio, c));
            } catch (Throwable e2) {
                bli.m874e(cfk.f20249a, "exception generating thumbnail", e2);
                this.f1943a.f20282h.post(new cge(this));
            }
        }
    }
}

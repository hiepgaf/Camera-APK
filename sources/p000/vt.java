package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: vt */
final class vt {
    /* renamed from: a */
    private final vv f9425a;
    /* renamed from: b */
    private vu f9426b = new vu();

    vt(vv vvVar) {
        this.f9425a = vvVar;
    }

    /* renamed from: a */
    final View m6062a(int i, int i2, int i3, int i4) {
        int i5;
        int b = this.f9425a.mo2487b();
        int a = this.f9425a.mo2484a();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View a2 = this.f9425a.mo2486a(i);
            this.f9426b.m6066a(b, a, this.f9425a.mo2488b(a2), this.f9425a.mo2485a(a2));
            if (i3 != 0) {
                vu vuVar = this.f9426b;
                vuVar.f9427a = 0;
                vuVar.m6065a(i3);
                if (this.f9426b.m6067a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                vuVar = this.f9426b;
                vuVar.f9427a = 0;
                vuVar.m6065a(i4);
                if (!this.f9426b.m6067a()) {
                    a2 = view;
                }
            } else {
                a2 = view;
            }
            i += i5;
            view = a2;
        }
        return view;
    }

    /* renamed from: a */
    final boolean m6063a(View view) {
        this.f9426b.m6066a(this.f9425a.mo2487b(), this.f9425a.mo2484a(), this.f9425a.mo2488b(view), this.f9425a.mo2485a(view));
        vu vuVar = this.f9426b;
        vuVar.f9427a = 0;
        vuVar.m6065a(24579);
        return this.f9426b.m6067a();
    }
}

package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: cb */
public class cb {
    /* renamed from: a */
    public final View f1828a;
    /* renamed from: b */
    public int f1829b;
    /* renamed from: c */
    public int f1830c;
    /* renamed from: d */
    public int f1831d;

    cb() {
    }

    public cb(View view) {
        this.f1828a = view;
    }

    /* renamed from: a */
    public boolean m1096a(int i) {
        if (this.f1831d == i) {
            return false;
        }
        this.f1831d = i;
        m1095a();
        return true;
    }

    /* renamed from: a */
    public void m1095a() {
        View view = this.f1828a;
        jm.m4565b(view, this.f1831d - (view.getTop() - this.f1829b));
        view = this.f1828a;
        jm.m4550a(view, -(view.getLeft() - this.f1830c));
    }
}

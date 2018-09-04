package p000;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* renamed from: td */
final class td {
    /* renamed from: a */
    public boolean f9263a = true;
    /* renamed from: b */
    public int f9264b;
    /* renamed from: c */
    public int f9265c;
    /* renamed from: d */
    public int f9266d;
    /* renamed from: e */
    public int f9267e;
    /* renamed from: f */
    public int f9268f;
    /* renamed from: g */
    public int f9269g;
    /* renamed from: h */
    public int f9270h = 0;
    /* renamed from: i */
    public int f9271i;
    /* renamed from: j */
    public List f9272j = null;
    /* renamed from: k */
    public boolean f9273k;

    td() {
    }

    /* renamed from: a */
    public final void m5834a(View view) {
        View view2;
        int size = this.f9272j.size();
        View view3 = null;
        int i = LfuScheduler.MAX_PRIORITY;
        int i2 = 0;
        while (i2 < size) {
            int i3;
            View view4;
            view2 = ((ux) this.f9272j.get(i2)).f9369a;
            uk ukVar = (uk) view2.getLayoutParams();
            if (view2 == view) {
                i3 = i;
                view4 = view3;
            } else if (ukVar.f9324c.m6029j()) {
                i3 = i;
                view4 = view3;
            } else {
                i3 = (ukVar.f9324c.m6025f() - this.f9266d) * this.f9267e;
                if (i3 < 0) {
                    i3 = i;
                    view4 = view3;
                } else if (i3 < i) {
                    if (i3 == 0) {
                        break;
                    }
                    view4 = view2;
                } else {
                    i3 = i;
                    view4 = view3;
                }
            }
            i2++;
            view3 = view4;
            i = i3;
        }
        view2 = view3;
        if (view2 == null) {
            this.f9266d = -1;
        } else {
            this.f9266d = ((uk) view2.getLayoutParams()).f9324c.m6025f();
        }
    }

    /* renamed from: a */
    final boolean m5835a(uv uvVar) {
        int i = this.f9266d;
        return i >= 0 && i < uvVar.m6009a();
    }

    /* renamed from: a */
    final View m5833a(up upVar) {
        List list = this.f9272j;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                View view = ((ux) this.f9272j.get(i)).f9369a;
                uk ukVar = (uk) view.getLayoutParams();
                if (ukVar.f9324c.m6029j() || this.f9266d != ukVar.f9324c.m6025f()) {
                    i++;
                } else {
                    m5834a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = upVar.m5997a(this.f9266d, Long.MAX_VALUE).f9369a;
        this.f9266d += this.f9267e;
        return view2;
    }
}

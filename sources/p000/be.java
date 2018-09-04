package p000;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* renamed from: be */
public class be extends dj {
    /* renamed from: d */
    public cb f10683d;
    /* renamed from: e */
    public int f10684e = 0;

    public be(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public final int m7279c() {
        cb cbVar = this.f10683d;
        if (cbVar == null) {
            return 0;
        }
        return cbVar.f1831d;
    }

    /* renamed from: b */
    protected void mo2653b(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m6731a(view, i);
    }

    /* renamed from: a */
    public boolean mo118a(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo2653b(coordinatorLayout, view, i);
        if (this.f10683d == null) {
            this.f10683d = new cb(view);
        }
        cb cbVar = this.f10683d;
        cbVar.f1829b = cbVar.f1828a.getTop();
        cbVar.f1830c = cbVar.f1828a.getLeft();
        cbVar.m1095a();
        int i2 = this.f10684e;
        if (i2 != 0) {
            this.f10683d.m1096a(i2);
            this.f10684e = 0;
        }
        return true;
    }
}

package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gbd */
public final class gbd implements eoj, eok {
    /* renamed from: a */
    public final View f16720a;
    /* renamed from: b */
    public volatile Runnable f16721b;
    /* renamed from: c */
    private volatile gxn f16722c;
    /* renamed from: d */
    private final hny f16723d;
    /* renamed from: e */
    private final hnz f16724e = new gbh(this);

    public gbd(View view, hny hny) {
        this.f16720a = view;
        this.f16723d = hny;
    }

    /* renamed from: a */
    static Rect m10932a(View view, View view2, View view3) {
        if (view2.getTop() != 0) {
            return new Rect(view.getLeft(), view.getBottom(), view.getRight(), view2.getTop());
        }
        if (view2.getLeft() == 0) {
            return new Rect(view2.getRight(), view3.getTop(), view.getLeft(), view3.getBottom());
        }
        return new Rect(view.getRight(), view3.getTop(), view2.getLeft(), view3.getBottom());
    }

    /* renamed from: a */
    public final boolean m10934a(boolean z) {
        gxn gxn = this.f16722c;
        if (gxn == null) {
            return false;
        }
        this.f16722c = null;
        gxn.m2870a();
        if (z && this.f16721b != null) {
            this.f16721b.run();
            this.f16721b = null;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo381i() {
        this.f16723d.m11922a(this.f16724e);
    }

    /* renamed from: j */
    public final void mo382j() {
        this.f16723d.m11924b(this.f16724e);
    }

    /* renamed from: a */
    public final void m10933a(String str, String str2, Runnable runnable) {
        m10934a(true);
        this.f16721b = runnable;
        gzb gzb = new gzb();
        gzb.f5849a = str;
        if (gzb.f5851c.length() > 0) {
            gzb.f5851c.append("\n");
        }
        gzb.f5851c.append(str2);
        gxn gxn = new gxn(gzb.f5849a, gzb.f5851c.toString(), gzb.f5850b);
        View findViewById = this.f16720a.getRootView().findViewById(R.id.capture_overlay_layout);
        View findViewById2 = this.f16720a.getRootView().findViewById(R.id.bottom_bar);
        OnLayoutChangeListener gbi = new gbi(this, gxn, findViewById, findViewById2);
        gxn.m2875c(new gbe(findViewById2, gbi));
        gxn.m2874b(new gbf(findViewById2, gbi));
        gxn.m2869a(new gbg(this, findViewById2, gbi));
        this.f16722c = gxn;
        gxn.m2872a(findViewById, gbd.m10932a(this.f16720a, findViewById2, findViewById));
    }
}

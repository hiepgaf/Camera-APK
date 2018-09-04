package p000;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: vn */
public final class vn implements pe {
    /* renamed from: a */
    public ot f19650a;
    /* renamed from: b */
    private op f19651b;
    /* renamed from: c */
    private final /* synthetic */ Toolbar f19652c;

    public vn(Toolbar toolbar) {
        this.f19652c = toolbar;
    }

    /* renamed from: a */
    public final boolean mo2440a(ot otVar) {
        View view = this.f19652c.f717h;
        if (view instanceof np) {
            ((np) view).mo309a();
        }
        Toolbar toolbar = this.f19652c;
        toolbar.removeView(toolbar.f717h);
        toolbar = this.f19652c;
        toolbar.removeView(toolbar.f716g);
        Toolbar toolbar2 = this.f19652c;
        toolbar2.f717h = null;
        for (int size = toolbar2.f726q.size() - 1; size >= 0; size--) {
            toolbar2.addView((View) toolbar2.f726q.get(size));
        }
        toolbar2.f726q.clear();
        this.f19650a = null;
        this.f19652c.requestLayout();
        otVar.m14278a(false);
        return true;
    }

    /* renamed from: b */
    public final boolean mo2442b(ot otVar) {
        Toolbar toolbar = this.f19652c;
        if (toolbar.f716g == null) {
            toolbar.f716g = new qv(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.f716g.setImageDrawable(toolbar.f714e);
            toolbar.f716g.setContentDescription(toolbar.f715f);
            LayoutParams d = Toolbar.m491d();
            d.a = (toolbar.f722m & 112) | 8388611;
            d.f19653b = 2;
            toolbar.f716g.setLayoutParams(d);
            toolbar.f716g.setOnClickListener(new vm(toolbar));
        }
        ViewParent parent = this.f19652c.f716g.getParent();
        ViewParent viewParent = this.f19652c;
        if (parent != viewParent) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewParent.f716g);
            }
            toolbar = this.f19652c;
            toolbar.addView(toolbar.f716g);
        }
        this.f19652c.f717h = otVar.getActionView();
        this.f19650a = otVar;
        parent = this.f19652c.f717h.getParent();
        viewParent = this.f19652c;
        if (parent != viewParent) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewParent.f717h);
            }
            LayoutParams d2 = Toolbar.m491d();
            Toolbar toolbar2 = this.f19652c;
            d2.a = (toolbar2.f722m & 112) | 8388611;
            d2.f19653b = 2;
            toolbar2.f717h.setLayoutParams(d2);
            toolbar = this.f19652c;
            toolbar.addView(toolbar.f717h);
        }
        Toolbar toolbar3 = this.f19652c;
        for (int childCount = toolbar3.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar3.getChildAt(childCount);
            if (!(((vo) childAt.getLayoutParams()).f19653b == 2 || childAt == toolbar3.f710a)) {
                toolbar3.removeViewAt(childCount);
                toolbar3.f726q.add(childAt);
            }
        }
        this.f19652c.requestLayout();
        otVar.m14278a(true);
        View view = this.f19652c.f717h;
        if (view instanceof np) {
            ((np) view).mo310b();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo2439a() {
        return false;
    }

    /* renamed from: a */
    public final void mo2435a(Context context, op opVar) {
        op opVar2 = this.f19651b;
        if (opVar2 != null) {
            ot otVar = this.f19650a;
            if (otVar != null) {
                opVar2.mo3315a(otVar);
            }
        }
        this.f19651b = opVar;
    }

    /* renamed from: a */
    public final void mo2436a(op opVar, boolean z) {
    }

    /* renamed from: a */
    public final boolean mo2441a(pn pnVar) {
        return false;
    }

    /* renamed from: a */
    public final void mo2437a(pf pfVar) {
    }

    /* renamed from: a */
    public final void mo2438a(boolean z) {
        Object obj = null;
        if (this.f19650a != null) {
            op opVar = this.f19651b;
            if (opVar != null) {
                int size = opVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.f19651b.getItem(i) == this.f19650a) {
                        obj = 1;
                        break;
                    }
                }
            }
            if (obj == null) {
                mo2440a(this.f19650a);
            }
        }
    }
}

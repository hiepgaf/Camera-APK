package p000;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: py */
public final class py extends od {
    /* renamed from: f */
    public qb f22539f;
    /* renamed from: g */
    public boolean f22540g;
    /* renamed from: h */
    public boolean f22541h;
    /* renamed from: i */
    public int f22542i;
    /* renamed from: j */
    public boolean f22543j;
    /* renamed from: k */
    public qd f22544k;
    /* renamed from: l */
    public pz f22545l;
    /* renamed from: m */
    public qa f22546m;
    /* renamed from: n */
    public final qe f22547n = new qe(this);
    /* renamed from: o */
    private int f22548o;
    /* renamed from: p */
    private int f22549p;
    /* renamed from: q */
    private final SparseBooleanArray f22550q = new SparseBooleanArray();
    /* renamed from: r */
    private View f22551r;
    /* renamed from: s */
    private oc f22552s;

    public py(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo3326a(ot otVar, ph phVar) {
        phVar.mo281a(otVar);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) phVar;
        actionMenuItemView.f10005b = (ActionMenuView) this.e;
        if (this.f22552s == null) {
            this.f22552s = new oc(this);
        }
        actionMenuItemView.f10006c = this.f22552s;
    }

    /* renamed from: b */
    public final boolean m16765b() {
        return m16766c() | m16768d();
    }

    /* renamed from: a */
    public final boolean mo3327a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f22539f) {
            return false;
        }
        return super.mo3327a(viewGroup, i);
    }

    /* renamed from: a */
    public final boolean mo2439a() {
        int size;
        ArrayList arrayList;
        if (this.c != null) {
            ArrayList e = this.c.m14259e();
            size = e.size();
            arrayList = e;
        } else {
            size = 0;
            arrayList = null;
        }
        int i = this.f22542i;
        int i2 = this.f22549p;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.e;
        int i3 = 0;
        int i4 = 0;
        Object obj = null;
        int i5 = 0;
        while (i5 < size) {
            ot otVar = (ot) arrayList.get(i5);
            if (otVar.m14288g()) {
                i3++;
            } else if ((otVar.f19513e & 1) != 0) {
                i4++;
            } else {
                obj = 1;
            }
            int i6 = this.f22543j ? otVar.isActionViewExpanded() ? 0 : i : i;
            i5++;
            i = i6;
        }
        if (this.f22540g && (r2 != null || i3 + i4 > i)) {
            i--;
        }
        int i7 = i - i3;
        SparseBooleanArray sparseBooleanArray = this.f22550q;
        sparseBooleanArray.clear();
        i4 = 0;
        int i8 = 0;
        i3 = i2;
        i2 = i7;
        while (i8 < size) {
            otVar = (ot) arrayList.get(i8);
            View a;
            if (otVar.m14288g()) {
                a = mo3324a(otVar, this.f22551r, viewGroup);
                if (this.f22551r == null) {
                    this.f22551r = a;
                }
                a.measure(makeMeasureSpec, makeMeasureSpec);
                i7 = a.getMeasuredWidth();
                i3 -= i7;
                if (i4 != 0) {
                    i7 = i4;
                }
                i4 = otVar.getGroupId();
                if (i4 != 0) {
                    sparseBooleanArray.put(i4, true);
                }
                otVar.m14282c(true);
                i6 = i3;
                i4 = i2;
            } else if ((otVar.f19513e & 1) != 0) {
                boolean z;
                int groupId = otVar.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId);
                if (i2 <= 0 && !z2) {
                    z = false;
                } else if (i3 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    a = mo3324a(otVar, this.f22551r, viewGroup);
                    if (this.f22551r == null) {
                        this.f22551r = a;
                    }
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                    i7 = a.getMeasuredWidth();
                    i = i3 - i7;
                    if (i4 == 0) {
                        i3 = i7;
                    } else {
                        i3 = i4;
                    }
                    if (i + i3 > 0) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    z = i7 & z;
                } else {
                    i = i3;
                    i3 = i4;
                }
                if (z && groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId, false);
                    i4 = i2;
                    for (i2 = 0; i2 < i8; i2++) {
                        ot otVar2 = (ot) arrayList.get(i2);
                        if (otVar2.getGroupId() == groupId) {
                            if (otVar2.m14286e()) {
                                i4++;
                            }
                            otVar2.m14282c(false);
                        }
                    }
                    i7 = i4;
                    if (z) {
                        i7--;
                    }
                    otVar.m14282c(z);
                    i6 = i;
                    i4 = i7;
                    i7 = i3;
                }
                i7 = i2;
                if (z) {
                    i7--;
                }
                otVar.m14282c(z);
                i6 = i;
                i4 = i7;
                i7 = i3;
            } else {
                otVar.m14282c(false);
                i7 = i4;
                i6 = i3;
                i4 = i2;
            }
            i8++;
            i2 = i4;
            i3 = i6;
            i4 = i7;
        }
        return true;
    }

    /* renamed from: a */
    public final View mo3324a(ot otVar, View view, ViewGroup viewGroup) {
        int i;
        View actionView = otVar.getActionView();
        if (actionView == null || otVar.m14283c()) {
            actionView = super.mo3324a(otVar, view, viewGroup);
        }
        if (otVar.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m6813a(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public final pg mo3325a(ViewGroup viewGroup) {
        pg pgVar = this.e;
        pg a = super.mo3325a(viewGroup);
        if (pgVar != a) {
            ((ActionMenuView) a).m6821a(this);
        }
        return a;
    }

    /* renamed from: c */
    public final boolean m16766c() {
        Runnable runnable = this.f22546m;
        if (runnable == null || this.e == null) {
            pc pcVar = this.f22544k;
            if (pcVar == null) {
                return false;
            }
            pcVar.m5665a();
            return true;
        }
        ((View) this.e).removeCallbacks(runnable);
        this.f22546m = null;
        return true;
    }

    /* renamed from: d */
    public final boolean m16768d() {
        pz pzVar = this.f22545l;
        if (pzVar == null) {
            return false;
        }
        pzVar.m5665a();
        return true;
    }

    /* renamed from: a */
    public final void mo2435a(Context context, op opVar) {
        super.mo2435a(context, opVar);
        Resources resources = context.getResources();
        nm a = nm.m5621a(context);
        if (!this.f22541h) {
            this.f22540g = true;
        }
        this.f22548o = a.f8934a.getResources().getDisplayMetrics().widthPixels / 2;
        this.f22542i = a.m5622a();
        int i = this.f22548o;
        if (this.f22540g) {
            if (this.f22539f == null) {
                this.f22539f = new qb(this, this.a);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f22539f.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f22539f.getMeasuredWidth();
        } else {
            this.f22539f = null;
        }
        this.f22549p = i;
        float f = resources.getDisplayMetrics().density;
        this.f22551r = null;
    }

    /* renamed from: e */
    public final boolean m16769e() {
        qd qdVar = this.f22544k;
        return qdVar != null && qdVar.m5670c();
    }

    /* renamed from: a */
    public final void mo2436a(op opVar, boolean z) {
        m16765b();
        super.mo2436a(opVar, z);
    }

    /* renamed from: a */
    public final boolean mo2441a(pn pnVar) {
        if (!pnVar.hasVisibleItems()) {
            return false;
        }
        View childAt;
        pn pnVar2 = pnVar;
        while (true) {
            op opVar = pnVar2.f22537k;
            if (opVar == this.c) {
                break;
            }
            pnVar2 = (pn) opVar;
        }
        ot item = pnVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.e;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof ph) && ((ph) childAt).mo280a() == item) {
                    break;
                }
            }
            childAt = null;
        } else {
            childAt = null;
        }
        if (childAt == null) {
            return false;
        }
        boolean z;
        pnVar.getItem().getItemId();
        int size = pnVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item2 = pnVar.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
        }
        z = false;
        this.f22545l = new pz(this, this.b, pnVar, childAt);
        this.f22545l.m5668a(z);
        if (this.f22545l.m5672e()) {
            super.mo2441a(pnVar);
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    /* renamed from: c */
    public final boolean mo3328c(ot otVar) {
        return otVar.m14286e();
    }

    /* renamed from: f */
    public final boolean m16770f() {
        if (!this.f22540g || m16769e() || this.c == null || this.e == null || this.f22546m != null || this.c.m14257c().isEmpty()) {
            return false;
        }
        this.f22546m = new qa(this, new qd(this, this.b, this.c, this.f22539f));
        ((View) this.e).post(this.f22546m);
        super.mo2441a(null);
        return true;
    }

    /* renamed from: a */
    public final void mo2438a(boolean z) {
        int i;
        ArrayList c;
        super.mo2438a(z);
        ((View) this.e).requestLayout();
        if (this.c != null) {
            op opVar = this.c;
            opVar.m14242a();
            ArrayList arrayList = opVar.f19482d;
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                arrayList.get(i);
            }
        }
        if (this.c != null) {
            c = this.c.m14257c();
        } else {
            c = null;
        }
        if (!this.f22540g) {
            i = 0;
        } else if (c != null) {
            int size2 = c.size();
            if (size2 == 1) {
                i = ((ot) c.get(0)).isActionViewExpanded() ^ 1;
            } else if (size2 > 0) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            if (this.f22539f == null) {
                this.f22539f = new qb(this, this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f22539f.getParent();
            if (viewGroup != this.e) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f22539f);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.e;
                View view = this.f22539f;
                LayoutParams b = ActionMenuView.m6814b();
                b.f19549a = true;
                actionMenuView.addView(view, b);
            }
        } else {
            qb qbVar = this.f22539f;
            if (qbVar != null && qbVar.getParent() == this.e) {
                ((ViewGroup) this.e).removeView(this.f22539f);
            }
        }
        ((ActionMenuView) this.e).f10073b = this.f22540g;
    }
}

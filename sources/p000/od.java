package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: od */
public abstract class od implements pe {
    /* renamed from: a */
    public Context f19459a;
    /* renamed from: b */
    public Context f19460b;
    /* renamed from: c */
    public op f19461c;
    /* renamed from: d */
    public pf f19462d;
    /* renamed from: e */
    public pg f19463e;
    /* renamed from: f */
    private LayoutInflater f19464f;
    /* renamed from: g */
    private int f19465g = R.layout.abc_action_menu_layout;
    /* renamed from: h */
    private int f19466h = R.layout.abc_action_menu_item_layout;

    public od(Context context) {
        this.f19459a = context;
        this.f19464f = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public abstract void mo3326a(ot otVar, ph phVar);

    /* renamed from: a */
    public final boolean mo2440a(ot otVar) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo2442b(ot otVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3327a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo2439a() {
        return false;
    }

    /* renamed from: a */
    public View mo3324a(ot otVar, View view, ViewGroup viewGroup) {
        ph phVar;
        if (view instanceof ph) {
            phVar = (ph) view;
        } else {
            phVar = (ph) this.f19464f.inflate(this.f19466h, viewGroup, false);
        }
        mo3326a(otVar, phVar);
        return (View) phVar;
    }

    /* renamed from: a */
    public pg mo3325a(ViewGroup viewGroup) {
        if (this.f19463e == null) {
            this.f19463e = (pg) this.f19464f.inflate(this.f19465g, viewGroup, false);
            this.f19463e.mo130a(this.f19461c);
            mo2438a(true);
        }
        return this.f19463e;
    }

    /* renamed from: a */
    public void mo2435a(Context context, op opVar) {
        this.f19460b = context;
        LayoutInflater.from(this.f19460b);
        this.f19461c = opVar;
    }

    /* renamed from: a */
    public void mo2436a(op opVar, boolean z) {
        pf pfVar = this.f19462d;
        if (pfVar != null) {
            pfVar.mo2353a(opVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo2441a(pn pnVar) {
        pf pfVar = this.f19462d;
        return pfVar != null ? pfVar.mo2354a(pnVar) : false;
    }

    /* renamed from: a */
    public final void mo2437a(pf pfVar) {
        this.f19462d = pfVar;
    }

    /* renamed from: c */
    public boolean mo3328c(ot otVar) {
        return true;
    }

    /* renamed from: a */
    public void mo2438a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f19463e;
        if (viewGroup != null) {
            int i;
            op opVar = this.f19461c;
            if (opVar != null) {
                opVar.m14242a();
                ArrayList e = this.f19461c.m14259e();
                int size = e.size();
                int i2 = 0;
                i = 0;
                while (i2 < size) {
                    int i3;
                    ot otVar = (ot) e.get(i2);
                    if (mo3328c(otVar)) {
                        ot a;
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof ph) {
                            a = ((ph) childAt).mo280a();
                        } else {
                            a = null;
                        }
                        View a2 = mo3324a(otVar, childAt, viewGroup);
                        if (otVar != a) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f19463e).addView(a2, i);
                        }
                        i3 = i + 1;
                    } else {
                        i3 = i;
                    }
                    i2++;
                    i = i3;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo3327a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }
}

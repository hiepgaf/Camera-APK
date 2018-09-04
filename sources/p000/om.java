package p000;

import android.content.Context;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController;
import android.support.v7.app.AlertController.RecycleListView;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: om */
public final class om implements OnItemClickListener, pe {
    /* renamed from: a */
    public LayoutInflater f19471a;
    /* renamed from: b */
    public op f19472b;
    /* renamed from: c */
    public ExpandedMenuView f19473c;
    /* renamed from: d */
    public int f19474d;
    /* renamed from: e */
    public pf f19475e;
    /* renamed from: f */
    public on f19476f;
    /* renamed from: g */
    private Context f19477g;

    private om(int i) {
        this.f19474d = R.layout.abc_list_menu_item_layout;
    }

    public om(Context context) {
        this((int) R.layout.abc_list_menu_item_layout);
        this.f19477g = context;
        this.f19471a = LayoutInflater.from(this.f19477g);
    }

    /* renamed from: a */
    public final boolean mo2440a(ot otVar) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo2442b(ot otVar) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo2439a() {
        return false;
    }

    /* renamed from: b */
    public final ListAdapter m14236b() {
        if (this.f19476f == null) {
            this.f19476f = new on(this);
        }
        return this.f19476f;
    }

    /* renamed from: a */
    public final void mo2435a(Context context, op opVar) {
        if (this.f19477g != null) {
            this.f19477g = context;
            if (this.f19471a == null) {
                this.f19471a = LayoutInflater.from(this.f19477g);
            }
        }
        this.f19472b = opVar;
        on onVar = this.f19476f;
        if (onVar != null) {
            onVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo2436a(op opVar, boolean z) {
        pf pfVar = this.f19475e;
        if (pfVar != null) {
            pfVar.mo2353a(opVar, z);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f19472b.m14249a(this.f19476f.m5659a(i), (pe) this, 0);
    }

    /* renamed from: a */
    public final boolean mo2441a(pn pnVar) {
        if (!pnVar.hasVisibleItems()) {
            return false;
        }
        os osVar = new os(pnVar);
        op opVar = osVar.f19503a;
        mc mcVar = new mc(opVar.f19479a);
        osVar.f19505c = new om(mcVar.f8823a.f8810a);
        pe peVar = osVar.f19505c;
        peVar.f19475e = osVar;
        osVar.f19503a.m14246a(peVar);
        ListAdapter b = osVar.f19505c.m14236b();
        lx lxVar = mcVar.f8823a;
        lxVar.f8817h = b;
        lxVar.f8818i = osVar;
        View view = opVar.f19486h;
        if (view == null) {
            lxVar.f8812c = opVar.f19485g;
            lxVar.f8813d = opVar.f19484f;
        } else {
            lxVar.f8814e = view;
        }
        lxVar.f8816g = osVar;
        mb mbVar = new mb(lxVar.f8810a, mcVar.f8824b);
        lxVar = mcVar.f8823a;
        AlertController alertController = mbVar.f22477a;
        View view2 = lxVar.f8814e;
        if (view2 == null) {
            CharSequence charSequence = lxVar.f8813d;
            if (charSequence != null) {
                alertController.m409a(charSequence);
            }
            Drawable drawable = lxVar.f8812c;
            if (drawable != null) {
                alertController.f616j = drawable;
                ImageView imageView = alertController.f617k;
                if (imageView != null) {
                    if (drawable != null) {
                        imageView.setVisibility(0);
                        alertController.f617k.setImageDrawable(drawable);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            }
        } else {
            alertController.f620n = view2;
        }
        if (lxVar.f8817h != null) {
            RecycleListView recycleListView = (RecycleListView) lxVar.f8811b.inflate(alertController.f624r, null);
            int i = alertController.f625s;
            ListAdapter listAdapter = lxVar.f8817h;
            if (listAdapter == null) {
                listAdapter = new ma(lxVar.f8810a, i);
            }
            alertController.f621o = listAdapter;
            alertController.f622p = lxVar.f8819j;
            if (lxVar.f8818i != null) {
                recycleListView.setOnItemClickListener(new ly(lxVar, alertController));
            }
            alertController.f611e = recycleListView;
        }
        mbVar.setCancelable(mcVar.f8823a.f8815f);
        if (mcVar.f8823a.f8815f) {
            mbVar.setCanceledOnTouchOutside(true);
        }
        mbVar.setOnCancelListener(null);
        mbVar.setOnDismissListener(null);
        OnKeyListener onKeyListener = mcVar.f8823a.f8816g;
        if (onKeyListener != null) {
            mbVar.setOnKeyListener(onKeyListener);
        }
        osVar.f19504b = mbVar;
        osVar.f19504b.setOnDismissListener(osVar);
        LayoutParams attributes = osVar.f19504b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        osVar.f19504b.show();
        pf pfVar = this.f19475e;
        if (pfVar != null) {
            pfVar.mo2354a(pnVar);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo2437a(pf pfVar) {
        this.f19475e = pfVar;
    }

    /* renamed from: a */
    public final void mo2438a(boolean z) {
        on onVar = this.f19476f;
        if (onVar != null) {
            onVar.notifyDataSetChanged();
        }
    }
}

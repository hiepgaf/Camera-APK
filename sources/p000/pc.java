package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: pc */
public class pc {
    /* renamed from: a */
    public View f9012a;
    /* renamed from: b */
    public int f9013b;
    /* renamed from: c */
    public OnDismissListener f9014c;
    /* renamed from: d */
    private final Context f9015d;
    /* renamed from: e */
    private final op f9016e;
    /* renamed from: f */
    private final boolean f9017f;
    /* renamed from: g */
    private final int f9018g;
    /* renamed from: h */
    private final int f9019h;
    /* renamed from: i */
    private boolean f9020i;
    /* renamed from: j */
    private pf f9021j;
    /* renamed from: k */
    private pb f9022k;
    /* renamed from: l */
    private final OnDismissListener f9023l;

    public pc(Context context, op opVar, View view, boolean z) {
        this(context, opVar, view, z, R.attr.actionOverflowMenuStyle, 0);
    }

    public pc(Context context, op opVar, View view, boolean z, int i, int i2) {
        this.f9013b = 8388611;
        this.f9023l = new pd(this);
        this.f9015d = context;
        this.f9016e = opVar;
        this.f9012a = view;
        this.f9017f = z;
        this.f9018g = i;
        this.f9019h = i2;
    }

    /* renamed from: a */
    public final void m5665a() {
        if (m5670c()) {
            this.f9022k.mo2471c();
        }
    }

    /* renamed from: b */
    public final pb m5669b() {
        if (this.f9022k == null) {
            pb ogVar;
            Display defaultDisplay = ((WindowManager) this.f9015d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.f9015d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                ogVar = new og(this.f9015d, this.f9012a, this.f9018g, this.f9019h, this.f9017f);
            } else {
                ogVar = new pk(this.f9015d, this.f9016e, this.f9012a, this.f9018g, this.f9019h, this.f9017f);
            }
            ogVar.mo3303a(this.f9016e);
            ogVar.mo3302a(this.f9023l);
            ogVar.mo3301a(this.f9012a);
            ogVar.mo2437a(this.f9021j);
            ogVar.mo3305b(this.f9020i);
            ogVar.mo3300a(this.f9013b);
            this.f9022k = ogVar;
        }
        return this.f9022k;
    }

    /* renamed from: c */
    public final boolean m5670c() {
        pb pbVar = this.f9022k;
        return pbVar != null && pbVar.mo2473e();
    }

    /* renamed from: d */
    public void mo2449d() {
        this.f9022k = null;
        OnDismissListener onDismissListener = this.f9014c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: a */
    public final void m5668a(boolean z) {
        this.f9020i = z;
        pb pbVar = this.f9022k;
        if (pbVar != null) {
            pbVar.mo3305b(z);
        }
    }

    /* renamed from: a */
    public final void m5667a(pf pfVar) {
        this.f9021j = pfVar;
        pb pbVar = this.f9022k;
        if (pbVar != null) {
            pbVar.mo2437a(pfVar);
        }
    }

    /* renamed from: a */
    final void m5666a(int i, int i2, boolean z, boolean z2) {
        pb b = m5669b();
        b.mo3308c(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f9013b, jm.m4576j(this.f9012a)) & 7) == 5) {
                i -= this.f9012a.getWidth();
            }
            b.mo3304b(i);
            b.mo3307c(i2);
            int i3 = (int) ((this.f9015d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.f19540g = new Rect(i - i3, i2 - i3, i + i3, i3 + i2);
        }
        b.mo2474f();
    }

    /* renamed from: e */
    public final boolean m5672e() {
        if (m5670c()) {
            return true;
        }
        if (this.f9012a == null) {
            return false;
        }
        m5666a(0, 0, false, false);
        return true;
    }
}

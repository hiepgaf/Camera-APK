package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.optionsbar.OptionsBarView;
import com.google.android.apps.camera.ui.layout.GcaLayout;
import java.util.List;
import p000.bli;
import p000.cct;
import p000.gal;
import p000.gcb;
import p000.gxs;
import p000.gxu;
import p000.gxv;
import p000.gxw;
import p000.gxx;
import p000.gxy;
import p000.gye;
import p000.gyh;
import p000.hdy;
import p000.hfr;
import p000.hfs;
import p000.hft;
import p000.hgo;
import p000.hir;
import p000.hjt;
import p000.ipz;
import p000.iqm;
import p000.jqk;

/* compiled from: PG */
public class MainActivityLayout extends GcaLayout {
    /* renamed from: f */
    private static final String f12345f = bli.m862a("MainActivityLayout");
    /* renamed from: b */
    public List f12346b;
    /* renamed from: c */
    public FrameLayout f12347c = null;
    /* renamed from: d */
    public gye f12348d;
    /* renamed from: e */
    public hfs f12349e;
    /* renamed from: g */
    private final WindowManager f12350g;
    /* renamed from: h */
    private BottomBar f12351h;
    /* renamed from: i */
    private ipz f12352i = null;

    public MainActivityLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((hfr) ((cct) context).mo2796a(hfr.class)).mo2723a(this);
        this.f12350g = (WindowManager) context.getSystemService("window");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            Trace.beginSection("MAL.dispatchApplyWindowInsets");
            WindowInsets dispatchApplyWindowInsets = super.dispatchApplyWindowInsets(windowInsets);
            return dispatchApplyWindowInsets;
        } finally {
            Trace.endSection();
        }
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
        Trace.beginSection("MAL.dispatchConfigurationChanged");
        hdy.m3083a(getContext());
        super.dispatchConfigurationChanged(configuration);
        hdy.f6075a = null;
        Trace.endSection();
    }

    /* renamed from: b */
    private final gxw m8435b() {
        return !this.f12348d.m11676a() ? ((gxy) this.f12348d.mo605b()).mo1689b() : gxw.f5779a;
    }

    /* renamed from: c */
    private final boolean m8436c() {
        return this.f12347c != null;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f12351h = (BottomBar) findViewById(R.id.bottom_bar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hfs hfs = this.f12349e;
        if (motionEvent.getActionMasked() == 0 && hfs != null) {
            Object obj;
            int i;
            hjt hjt = new hjt(motionEvent, getRootView());
            hgo hgo = hfs.f6169a;
            gal gal = hgo.f17822g;
            PointF a = hjt.m3210a();
            View view = gal.f4984b;
            float f = a.x;
            float f2 = a.y;
            float x = view.getX();
            float y = view.getY();
            float width = ((float) view.getWidth()) + x;
            float height = ((float) view.getHeight()) + y;
            if (f < x) {
                obj = null;
            } else if (f > width) {
                obj = null;
            } else if (f2 < y) {
                obj = null;
            } else if (f2 <= height) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                OptionsBarView optionsBarView = hgo.f17822g.f4984b;
                if (optionsBarView.f20400e == null) {
                    obj = null;
                } else {
                    optionsBarView.m15076a();
                    i = 1;
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                f2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (this.f12348d.m11676a()) {
                    i = 0;
                } else {
                    Rect a2 = ((gxy) jqk.m13102c((gxy) this.f12348d.mo605b())).mo1688a().mo1675a();
                    i = f2 > ((float) a2.left) ? f2 < ((float) a2.right) ? y2 > ((float) a2.top) ? y2 < ((float) a2.bottom) ? 1 : 0 : 0 : 0 : 0;
                }
                return i ^ 1;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        hdy.f6075a = null;
    }

    public void onMeasure(int i, int i2) {
        Trace.beginSection("MAL.onMeasurePrologue");
        Context context = getContext();
        hdy.m3083a(context);
        Size size = new Size(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        gxx a = m8435b().mo1685c().m2900a(hir.m3181a(hdy.m3084b(context), hdy.m3085c(context), size.getWidth(), size.getHeight()));
        a.f5780a = size;
        gxw a2 = a.m2899a();
        if (m8434a(a2)) {
            this.f12351h.setUiOrientation(a2.mo1683a());
            m8437a();
        }
        Trace.endSection();
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public final void m8438a(int i, int i2, boolean z) {
        gxw b = m8435b();
        gxx a = b.mo1685c().m2900a(hir.m3182a(this.f12350g.getDefaultDisplay(), getContext(), b.mo1686d().getWidth(), b.mo1686d().getHeight()));
        a.f5781b = new Size(i, i2);
        b = a.m2901a(z).m2899a();
        if (m8436c()) {
            this.f12352i = ipz.m4018a(i, i2);
        }
        if (m8434a(b)) {
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: a */
    private final boolean m8434a(gxw gxw) {
        if (!this.f12348d.m11676a() && (((gxy) this.f12348d.mo605b()).mo1689b().equals(gxw) ^ 1) == 0) {
            return false;
        }
        gyh a;
        Trace.beginSection("updateLayoutBoxes");
        gxv a2 = gxu.m2880a(gxw, hdy.m3085c(getContext()), getContext());
        String str = f12345f;
        String valueOf = String.valueOf(a2);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("Updated layout: ");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        if (m8436c()) {
            a = gxu.m2881a(a2.mo1682h(), a2.mo1679e(), (ipz) jqk.m13102c(this.f12352i), hdy.m3085c(getContext()), gcb.m2470a(iqm.m4040c(hdy.m3084b(getContext())), true));
        } else {
            a = null;
        }
        valueOf = f12345f;
        String valueOf2 = String.valueOf(a);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
        stringBuilder2.append("Updated viewfinderSpec:");
        stringBuilder2.append(valueOf2);
        bli.m863a(valueOf, stringBuilder2.toString());
        this.f12348d.f17563a = new gxs(gxw, a2, a);
        Trace.endSection();
        return true;
    }

    /* renamed from: a */
    public final void m8437a() {
        gxw b = m8435b();
        List<hft> list = this.f12346b;
        if (list != null && b.mo1683a() != null) {
            for (hft a : list) {
                a.mo2801a(b.mo1683a());
            }
        }
    }
}

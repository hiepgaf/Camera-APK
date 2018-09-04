package com.google.android.apps.camera.focusindicator;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.Locale;
import p000.atb;
import p000.bsx;
import p000.bsz;
import p000.bta;
import p000.btb;
import p000.btc;
import p000.btd;
import p000.btg;
import p000.btj;
import p000.btk;
import p000.fcj;
import p000.fcl;
import p000.fco;
import p000.hiv;
import p000.hix;
import p000.kbg;
import p000.ktm;

/* compiled from: PG */
public class FocusIndicatorView extends RelativeLayout implements atb {
    /* renamed from: a */
    public FocusIndicatorRingView f20350a;
    /* renamed from: b */
    public bsz f20351b;
    /* renamed from: c */
    public bta f20352c;
    /* renamed from: d */
    public TextView f20353d;
    /* renamed from: e */
    public hix f20354e;
    /* renamed from: f */
    public hix f20355f;
    /* renamed from: g */
    public hix f20356g;
    /* renamed from: h */
    public hix f20357h;
    /* renamed from: i */
    public hix f20358i;
    /* renamed from: j */
    public hix f20359j;
    /* renamed from: k */
    public hix f20360k;
    /* renamed from: l */
    public hix f20361l;
    /* renamed from: m */
    public Animator f20362m;
    /* renamed from: n */
    private final btc f20363n;
    /* renamed from: o */
    private final PointF f20364o;
    /* renamed from: p */
    private final int[] f20365p;
    /* renamed from: q */
    private final AnimatorListener f20366q;

    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20364o = new PointF(0.0f, 0.0f);
        this.f20365p = new int[2];
        this.f20366q = new btb(this);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.focus_indicator_view_contents, this);
        this.f20363n = m15051a(context);
        btc btc = this.f20363n;
        this.f20350a = btg.m7733a(btc.f1520a);
        this.f20351b = btj.m7737a(btc.f1520a);
        this.f20352c = btk.m7739a(btc.f1520a);
        this.f20353d = (TextView) ktm.m13963a(btc.f1520a.f1540d, "Cannot return null from a non-@Nullable @Provides method");
        this.f20354e = (hix) btc.f1521b.mo345a();
        this.f20355f = (hix) btc.f1522c.mo345a();
        this.f20356g = (hix) btc.f1523d.mo345a();
        this.f20357h = (hix) btc.f1524e.mo345a();
        this.f20358i = (hix) btc.f1525f.mo345a();
        this.f20359j = (hix) btc.f1526g.mo345a();
        this.f20360k = (hix) btc.f1527h.mo345a();
        this.f20361l = (hix) btc.f1528i.mo345a();
        m15052a(this.f20354e);
        m15052a(this.f20355f);
        m15052a(this.f20356g);
        m15052a(this.f20357h);
        m15052a(this.f20358i);
        m15052a(this.f20359j);
        m15052a(this.f20360k);
        m15052a(this.f20361l);
    }

    FocusIndicatorView(Context context, FocusIndicatorRingView focusIndicatorRingView, bsz bsz, bta bta, TextView textView, hix hix, hix hix2, hix hix3, hix hix4, hix hix5, hix hix6) {
        super(context);
        this.f20364o = new PointF(0.0f, 0.0f);
        this.f20365p = new int[2];
        this.f20366q = new btb(this);
        this.f20363n = m15051a(context);
        this.f20350a = focusIndicatorRingView;
        this.f20351b = bsz;
        this.f20352c = bta;
        this.f20353d = textView;
        this.f20354e = m15052a(hix);
        this.f20355f = m15052a(hix2);
        this.f20356g = m15052a(hix3);
        this.f20357h = m15052a(hix4);
        this.f20358i = m15052a(hix5);
        this.f20359j = m15052a(hix6);
    }

    /* renamed from: a */
    private final hix m15052a(hix hix) {
        if (hix != null) {
            hix.mo1732a(this.f20366q);
        }
        return hix;
    }

    /* renamed from: d */
    private final void m15054d() {
        Animator animator = this.f20362m;
        if (animator != null && animator.isRunning()) {
            this.f20362m.cancel();
            this.f20362m = null;
        }
    }

    /* renamed from: a */
    public final void mo2790a() {
        m15054d();
        m15055e();
    }

    /* renamed from: e */
    private final void m15055e() {
        this.f20352c.m961a(0.0f);
        this.f20351b.m959c(0.0f);
        this.f20350a.invalidate();
    }

    /* renamed from: a */
    private final btc m15051a(Context context) {
        Object btd = new btd(context, this);
        bsx bsx = new bsx();
        bsx.f1511a = (btd) ktm.m13962a(btd);
        if (bsx.f1511a != null) {
            return new btc(bsx);
        }
        throw new IllegalStateException(String.valueOf(btd.class.getCanonicalName()).concat(" must be set"));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.f20365p);
        PointF pointF = this.f20364o;
        int[] iArr = this.f20365p;
        pointF.set((float) iArr[0], (float) iArr[1]);
    }

    /* renamed from: c */
    private final PointF m15053c(PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        PointF pointF3 = this.f20364o;
        pointF2.offset(-pointF3.x, -pointF3.y);
        return pointF2;
    }

    /* renamed from: a */
    public final void mo2791a(boolean z) {
        this.f20353d.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo2794b(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        setVisibility(i);
    }

    /* renamed from: b */
    public final hiv mo2792b() {
        Animator animator = this.f20362m;
        if (animator == null || !animator.isRunning()) {
            return this.f20355f.mo1731a();
        }
        return hix.f6257a;
    }

    /* renamed from: a */
    public final hiv mo2788a(PointF pointF) {
        m15054d();
        m15055e();
        this.f20350a.m1235a(m15053c(pointF));
        return this.f20354e.mo1731a();
    }

    /* renamed from: c */
    public final hiv mo2795c() {
        Animator animator = this.f20362m;
        if (animator == null || !animator.isRunning()) {
            return this.f20357h.mo1731a();
        }
        return hix.f6257a;
    }

    /* renamed from: a */
    public final hiv mo2789a(kbg kbg) {
        Animator animator = this.f20362m;
        if (animator != null && animator.isRunning()) {
            return hix.f6257a;
        }
        m15055e();
        if (kbg.mo2084b()) {
            this.f20350a.m1235a(m15053c((PointF) kbg.mo2081a()));
        } else {
            this.f20350a.m1235a(new PointF((float) (getWidth() / 2), (float) (getHeight() / 2)));
        }
        return this.f20356g.mo1731a();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        String pointF;
        fco fco = (fco) obj;
        TextView textView = this.f20353d;
        fcl fcl = fco.f4476b;
        String valueOf = String.valueOf(fcl.f4470a);
        String valueOf2 = String.valueOf(fcl.f4471b);
        if (fcl.f4474e.mo2084b()) {
            pointF = ((fcj) fcl.f4474e.mo2081a()).mo1356c().toString();
        } else {
            pointF = "?";
        }
        String format = String.format(Locale.ENGLISH, "%.2f", new Object[]{Float.valueOf(fcl.f4472c)});
        boolean z = fcl.f4473d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 36) + length2) + String.valueOf(pointF).length()) + String.valueOf(format).length());
        stringBuilder.append("AF mode:");
        stringBuilder.append(valueOf);
        stringBuilder.append(" state:");
        stringBuilder.append(valueOf2);
        stringBuilder.append("\n roi:");
        stringBuilder.append(pointF);
        stringBuilder.append(" lens:");
        stringBuilder.append(format);
        stringBuilder.append(" sc:");
        stringBuilder.append(z);
        textView.setText(stringBuilder.toString());
    }

    /* renamed from: b */
    public final void mo2793b(PointF pointF) {
        this.f20350a.m1235a(pointF);
        invalidate();
    }
}

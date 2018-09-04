package p000;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.google.android.apps.camera.zoomui.ZoomMarkerView;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* compiled from: PG */
/* renamed from: hpf */
public class hpf extends hpe {
    /* renamed from: a */
    private irs f23300a;
    /* renamed from: b */
    private final AnimatorListenerAdapter f23301b = new hph(this);
    /* renamed from: c */
    private final AnimatorListenerAdapter f23302c = new hpi(this);
    /* renamed from: d */
    private final AnimatorListenerAdapter f23303d = new hpj(this);
    /* renamed from: e */
    private final AnimatorUpdateListener f23304e = new hpk(this);
    /* renamed from: h */
    public ZoomUi f23305h;
    /* renamed from: i */
    public ZoomMarkerView f23306i;
    /* renamed from: j */
    public LinearLayout f23307j;
    /* renamed from: k */
    public ilp f23308k;
    /* renamed from: l */
    public SeekBar f23309l;
    /* renamed from: m */
    public ValueAnimator f23310m;
    /* renamed from: n */
    public ObjectAnimator f23311n;
    /* renamed from: o */
    public boolean f23312o;
    /* renamed from: p */
    public ValueAnimator f23313p;
    /* renamed from: q */
    public ValueAnimator f23314q;
    /* renamed from: r */
    public boolean f23315r;
    /* renamed from: s */
    public ValueAnimator f23316s;
    /* renamed from: t */
    public float f23317t;
    /* renamed from: u */
    public float f23318u = 1.0f;
    /* renamed from: v */
    public final Runnable f23319v = new hpg(this);

    static {
        bli.m862a("ZoomEnabledSC");
    }

    /* renamed from: a */
    public void mo3569a(hpt hpt, ZoomUi zoomUi, ZoomMarkerView zoomMarkerView, ilp ilp, boolean z, ValueAnimator valueAnimator, irs irs) {
        this.f23305h = zoomUi;
        this.f23306i = zoomMarkerView;
        this.f23308k = ilp;
        this.f23307j = zoomUi.m1347c();
        this.f23309l = zoomUi.m1346b();
        this.f23310m = new ValueAnimator();
        this.f23310m.addUpdateListener(this.f23304e);
        this.f23310m.addListener(this.f23301b);
        this.f23310m.setDuration(250);
        this.f23310m.setInterpolator(new ks());
        this.f23313p = new ValueAnimator();
        this.f23313p.addUpdateListener(this.f23304e);
        this.f23314q = new ValueAnimator();
        this.f23314q.addUpdateListener(this.f23304e);
        this.f23314q.setDuration(500);
        this.f23314q.setInterpolator(new ks());
        this.f23314q.addListener(this.f23303d);
        this.f23316s = valueAnimator;
        this.f23311n = ObjectAnimator.ofFloat(this.f23307j, View.ALPHA, new float[]{0.0f, 1.0f});
        this.f23311n.setDuration(300);
        this.f23311n.setInterpolator(new ks());
        this.f23311n.addListener(this.f23302c);
        this.f23312o = z;
        this.f23300a = irs;
    }
}

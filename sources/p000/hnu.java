package p000;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hnu */
public final class hnu {
    /* renamed from: a */
    public static boolean f6384a = false;
    /* renamed from: b */
    public final GestureDetector f6385b;
    /* renamed from: c */
    public final ScaleGestureDetector f6386c;
    /* renamed from: d */
    public final hnm f6387d;
    /* renamed from: e */
    public final hnt f6388e;
    /* renamed from: f */
    public final hnl f6389f;
    /* renamed from: g */
    public final hnp f6390g;
    /* renamed from: h */
    public final hns f6391h;
    /* renamed from: i */
    public final hnq f6392i;
    /* renamed from: j */
    public final hnk f6393j;
    /* renamed from: k */
    public final kcx f6394k;
    /* renamed from: l */
    public final ilp f6395l;
    /* renamed from: m */
    public int f6396m;
    /* renamed from: n */
    public boolean f6397n;
    /* renamed from: o */
    public boolean f6398o;
    /* renamed from: p */
    public float f6399p;
    /* renamed from: q */
    public float f6400q;
    /* renamed from: r */
    public int f6401r;
    /* renamed from: s */
    private final View f6402s;
    /* renamed from: t */
    private final OnGestureListener f6403t = new hnv(this);
    /* renamed from: u */
    private final OnScaleGestureListener f6404u = new hnw(this);

    public hnu(hnx hnx, hnm hnm, hnt hnt, hnp hnp, hns hns, hnq hnq, hnk hnk, hnl hnl, ilp ilp, View view, Context context) {
        this.f6385b = new GestureDetector(hnx.f6407a, this.f6403t, hnx.f6408b);
        this.f6386c = new ScaleGestureDetector(hnx.f6407a, this.f6404u, hnx.f6408b);
        this.f6386c.setQuickScaleEnabled(false);
        this.f6387d = (hnm) jri.m13152b((Object) hnm);
        this.f6388e = (hnt) jri.m13152b((Object) hnt);
        this.f6390g = (hnp) jri.m13152b((Object) hnp);
        this.f6391h = (hns) jri.m13152b((Object) hns);
        this.f6392i = (hnq) jri.m13152b((Object) hnq);
        this.f6393j = (hnk) jri.m13152b((Object) hnk);
        this.f6389f = hnl;
        this.f6396m = go.bD;
        this.f6394k = kee.m13439a(hnj.ZOOM, context.getResources().getString(R.string.preference_double_tap_zoom), hnj.SWITCH_CAMERA, context.getResources().getString(R.string.preference_double_tap_switch_camera), hnj.NONE, context.getResources().getString(R.string.preference_double_tap_none));
        this.f6395l = ilp;
        this.f6402s = view;
    }

    /* renamed from: a */
    public final PointF m3259a(MotionEvent motionEvent) {
        return new hjt(motionEvent, this.f6402s).m3210a();
    }

    /* renamed from: a */
    public final hnn m3260a() {
        if (this.f6396m == go.bE) {
            return this.f6387d;
        }
        if (this.f6396m == go.bF) {
            return this.f6388e;
        }
        return hnn.f6382a;
    }
}

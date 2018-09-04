package p000;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: hgf */
public final class hgf implements hhj {
    /* renamed from: a */
    public final bpt f17786a;
    /* renamed from: b */
    public final fbr f17787b;
    /* renamed from: c */
    private final kwk f17788c;
    /* renamed from: d */
    private final aws f17789d;
    /* renamed from: e */
    private final Context f17790e;
    /* renamed from: f */
    private final ikd f17791f;
    /* renamed from: g */
    private final bps f17792g;

    public hgf(bpt bpt, kwk kwk, fbr fbr, bps bps, aws aws, Context context, ikd ikd) {
        this.f17786a = bpt;
        this.f17788c = kwk;
        this.f17787b = fbr;
        this.f17792g = bps;
        this.f17789d = aws;
        this.f17790e = context;
        this.f17791f = ikd;
    }

    /* renamed from: a */
    public final void mo1729a() {
        boolean z;
        EvCompView evCompView = (EvCompView) ((hes) this.f17788c.mo345a()).f6120j.m3223a((int) R.id.evcomp);
        bpt bpt = this.f17786a;
        Context context = this.f17790e;
        ilp ilp = this.f17787b.f4463b;
        bps bps = this.f17792g;
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.dash_length);
        valueAnimator.addUpdateListener(new bpu((float) context.getResources().getDimensionPixelSize(R.dimen.evCompRulerShortDashLength), (float) context.getResources().getDimensionPixelSize(R.dimen.evCompRulerLongDashLength), evCompView));
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(context, 17498112);
        objectAnimator.setTarget(evCompView);
        bpt.f1421e = objectAnimator;
        bpt.f1422f = evCompView;
        int integer = context.getResources().getInteger(R.integer.evcomp_visibility_timeout_millis);
        bpt.f1420d = ilp;
        View bqo = new bqo(context);
        bpt.f1419c = bqo;
        if (evCompView.f2285g == null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        evCompView.f2285g = bqo;
        evCompView.addView(bqo);
        bqo.f1448a = new bqp(bpt);
        bpt.f1418b.mo3383a(bpt.f1417a, evCompView, valueAnimator, integer, ilp, bps);
        bpt.f1417a.mo3382a(evCompView, bqo, bpt.f1421e, bpt.f1418b, bps);
        bpt.f1417a.mo1562a();
        this.f17789d.mo373a().mo1879a(this.f17792g.f1415a.mo2859a(new hgg(this), kpq.f8410a));
        this.f17789d.mo373a().mo1879a(this.f17787b.f4464c.mo2859a(new hgh(this), this.f17791f));
    }
}

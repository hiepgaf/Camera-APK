package p000;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btl */
public final class btl {
    /* renamed from: a */
    public final Resources f1542a;
    /* renamed from: b */
    public final FocusIndicatorView f1543b;
    /* renamed from: c */
    public final FocusIndicatorRingView f1544c;
    /* renamed from: d */
    public final bsz f1545d;
    /* renamed from: e */
    public final bta f1546e;

    public btl(Resources resources, FocusIndicatorView focusIndicatorView, FocusIndicatorRingView focusIndicatorRingView, bsz bsz, bta bta) {
        this.f1542a = resources;
        this.f1543b = focusIndicatorView;
        this.f1544c = focusIndicatorRingView;
        this.f1545d = bsz;
        this.f1546e = bta;
    }

    /* renamed from: a */
    public final AnimatorUpdateListener m962a() {
        return new btn(this);
    }

    /* renamed from: b */
    public final AnimatorUpdateListener m963b() {
        return new bto(this);
    }

    /* renamed from: c */
    public final AnimatorUpdateListener m964c() {
        return new bts(this);
    }

    /* renamed from: d */
    public final AnimatorUpdateListener m965d() {
        return new btp(this);
    }

    /* renamed from: e */
    public final AnimatorUpdateListener m966e() {
        return new btq(this);
    }
}

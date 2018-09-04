package p000;

import android.animation.ObjectAnimator;
import android.view.View.OnClickListener;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: bpt */
public final class bpt {
    /* renamed from: a */
    public final bpx f1417a = new bqg(this.f1418b);
    /* renamed from: b */
    public final bqb f1418b = new bqk();
    /* renamed from: c */
    public bqo f1419c;
    /* renamed from: d */
    public ilp f1420d;
    /* renamed from: e */
    public ObjectAnimator f1421e;
    /* renamed from: f */
    public EvCompView f1422f;

    /* renamed from: a */
    public final void m936a(int i, int i2, float f) {
        this.f1417a.mo2698a(i, i2, f);
    }

    /* renamed from: a */
    public final void m938a(boolean z) {
        ((bqo) jqk.m13079a(this.f1419c, "EvCompViewController must be first initialized", new Object[0])).m941a(z);
    }

    /* renamed from: a */
    public final void m937a(OnClickListener onClickListener) {
        ((bqo) jqk.m13079a(this.f1419c, "EvCompViewController must be first initialized", new Object[0])).setOnClickListener(onClickListener);
    }
}

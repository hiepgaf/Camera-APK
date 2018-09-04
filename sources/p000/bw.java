package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bw */
public final class bw extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ boolean f1636a = false;
    /* renamed from: b */
    private final /* synthetic */ cb f1637b;
    /* renamed from: c */
    private final /* synthetic */ bu f1638c;

    public bw(bu buVar, cb cbVar) {
        this.f1638c = buVar;
        this.f1637b = cbVar;
    }

    public final void onAnimationEnd(Animator animator) {
        bu buVar = this.f1638c;
        buVar.f1576b = 0;
        buVar.f1577c = null;
        if (this.f1637b != null) {
            df.m1611c();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f1638c.f1592x.m1452a(0, false);
        bu buVar = this.f1638c;
        buVar.f1576b = 2;
        buVar.f1577c = animator;
    }
}

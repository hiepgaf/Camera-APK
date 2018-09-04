package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bv */
public final class bv extends AnimatorListenerAdapter {
    /* renamed from: a */
    private boolean f1603a;
    /* renamed from: b */
    private final /* synthetic */ boolean f1604b = false;
    /* renamed from: c */
    private final /* synthetic */ cb f1605c;
    /* renamed from: d */
    private final /* synthetic */ bu f1606d;

    public bv(bu buVar, cb cbVar) {
        this.f1606d = buVar;
        this.f1605c = cbVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f1603a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        bu buVar = this.f1606d;
        buVar.f1576b = 0;
        buVar.f1577c = null;
        if (!this.f1603a) {
            buVar.f1592x.m1452a(4, false);
            if (this.f1605c != null) {
                df.m1609b();
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f1606d.f1592x.m1452a(0, false);
        bu buVar = this.f1606d;
        buVar.f1576b = 1;
        buVar.f1577c = animator;
        this.f1603a = false;
    }
}

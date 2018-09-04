package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* renamed from: kx */
final class kx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ kv f8738a;

    kx(kv kvVar) {
        this.f8738a = kvVar;
    }

    public final void run() {
        kv kvVar = this.f8738a;
        if (kvVar.f8621e) {
            boolean z;
            if (kvVar.f8619c) {
                kvVar.f8619c = false;
                kw kwVar = kvVar.f8617a;
                kwVar.f8728e = AnimationUtils.currentAnimationTimeMillis();
                kwVar.f8731h = -1;
                kwVar.f8729f = kwVar.f8728e;
                kwVar.f8732i = 0.5f;
                kwVar.f8730g = 0;
            }
            kw kwVar2 = this.f8738a.f8617a;
            if (kwVar2.f8731h <= 0) {
                z = false;
            } else if (AnimationUtils.currentAnimationTimeMillis() <= kwVar2.f8731h + ((long) kwVar2.f8733j)) {
                z = false;
            } else {
                z = true;
            }
            if (z || !this.f8738a.m5371b()) {
                this.f8738a.f8621e = false;
                return;
            }
            long uptimeMillis;
            kv kvVar2 = this.f8738a;
            if (kvVar2.f8620d) {
                kvVar2.f8620d = false;
                uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                kvVar2.f8618b.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (kwVar2.f8729f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            uptimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = kwVar2.m5474a(uptimeMillis);
            long j = kwVar2.f8729f;
            kwVar2.f8729f = uptimeMillis;
            kwVar2.f8730g = (int) ((((float) (uptimeMillis - j)) * (((-4.0f * a) * a) + (a * 4.0f))) * kwVar2.f8727d);
            this.f8738a.mo2330b(kwVar2.f8730g);
            jm.m4556a(this.f8738a.f8618b, (Runnable) this);
        }
    }
}

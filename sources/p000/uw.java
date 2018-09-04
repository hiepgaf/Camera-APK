package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: PG */
/* renamed from: uw */
public final class uw implements Runnable {
    /* renamed from: a */
    public int f9361a;
    /* renamed from: b */
    public int f9362b;
    /* renamed from: c */
    public OverScroller f9363c;
    /* renamed from: d */
    public Interpolator f9364d = RecyclerView.f650I;
    /* renamed from: e */
    public final /* synthetic */ RecyclerView f9365e;
    /* renamed from: f */
    private boolean f9366f = false;
    /* renamed from: g */
    private boolean f9367g = false;

    public uw(RecyclerView recyclerView) {
        this.f9365e = recyclerView;
        this.f9363c = new OverScroller(recyclerView.getContext(), RecyclerView.f650I);
    }

    /* renamed from: a */
    public final void m6011a() {
        if (this.f9366f) {
            this.f9367g = true;
            return;
        }
        this.f9365e.removeCallbacks(this);
        jm.m4556a(this.f9365e, (Runnable) this);
    }

    public final void run() {
        RecyclerView recyclerView = this.f9365e;
        if (recyclerView.f683k == null) {
            m6012b();
            return;
        }
        this.f9367g = false;
        this.f9366f = true;
        recyclerView.m445a();
        OverScroller overScroller = this.f9363c;
        ug ugVar = this.f9365e.f683k;
        if (overScroller.computeScrollOffset()) {
            int i;
            int i2;
            int i3;
            int i4;
            Object obj;
            Object obj2;
            int[] iArr = this.f9365e.f662G;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f9361a;
            int i6 = currY - this.f9362b;
            this.f9361a = currX;
            this.f9362b = currY;
            if (this.f9365e.m456a(i5, i6, iArr, null, 1)) {
                i = i6 - iArr[1];
                i2 = i5 - iArr[0];
            } else {
                i = i6;
                i2 = i5;
            }
            recyclerView = this.f9365e;
            if (recyclerView.f682j == null) {
                i5 = 0;
                i6 = 0;
                i3 = 0;
                i4 = 0;
            } else {
                recyclerView.m448a(i2, i, recyclerView.f663H);
                int[] iArr2 = this.f9365e.f663H;
                i5 = iArr2[0];
                i6 = iArr2[1];
                i3 = i2 - i5;
                i4 = i - i6;
            }
            if (!this.f9365e.f685m.isEmpty()) {
                this.f9365e.invalidate();
            }
            if (this.f9365e.getOverScrollMode() != 2) {
                this.f9365e.m446a(i2, i);
            }
            if (!(this.f9365e.m455a(i5, i6, i3, i4, null, 1) || (i3 == 0 && i4 == 0))) {
                int i7;
                int currVelocity = (int) overScroller.getCurrVelocity();
                if (i3 == currX) {
                    i7 = 0;
                } else if (i3 < 0) {
                    i7 = -currVelocity;
                } else if (i3 > 0) {
                    i7 = currVelocity;
                } else {
                    i7 = 0;
                }
                if (i4 == currY) {
                    currVelocity = 0;
                } else if (i4 < 0) {
                    currVelocity = -currVelocity;
                } else if (i4 <= 0) {
                    currVelocity = 0;
                }
                if (this.f9365e.getOverScrollMode() != 2) {
                    View view = this.f9365e;
                    if (i7 < 0) {
                        view.m468d();
                        view.f692t.onAbsorb(-i7);
                    } else if (i7 > 0) {
                        view.m469e();
                        view.f694v.onAbsorb(i7);
                    }
                    if (currVelocity < 0) {
                        view.m470f();
                        view.f693u.onAbsorb(-currVelocity);
                    } else if (currVelocity > 0) {
                        view.m463c();
                        view.f695w.onAbsorb(currVelocity);
                    }
                    if (!(i7 == 0 && currVelocity == 0)) {
                        jm.m4542A(view);
                    }
                }
                if (i7 == 0 && i3 != currX) {
                    if (overScroller.getFinalX() == 0) {
                    }
                }
                if (currVelocity != 0 || i4 == currY || overScroller.getFinalY() == 0) {
                    overScroller.abortAnimation();
                }
            }
            if (!(i5 == 0 && i6 == 0)) {
                this.f9365e.m458b();
            }
            if (!this.f9365e.awakenScrollBars()) {
                this.f9365e.invalidate();
            }
            if (i == 0) {
                obj = null;
            } else if (!this.f9365e.f683k.mo822i()) {
                obj = null;
            } else if (i6 == i) {
                i6 = 1;
            } else {
                obj = null;
            }
            if (i2 == 0) {
                obj2 = null;
            } else if (!this.f9365e.f683k.mo821h()) {
                obj2 = null;
            } else if (i5 == i2) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (i2 == 0 && i == 0) {
                obj2 = 1;
            } else if (obj2 != null) {
                obj2 = 1;
            } else if (obj == null) {
                obj2 = null;
            } else {
                obj2 = 1;
            }
            if (overScroller.isFinished() || (r0 == null && !this.f9365e.m472i().m4484a(1))) {
                this.f9365e.m459b(0);
                if (RecyclerView.f655b) {
                    this.f9365e.f698z.m5986a();
                }
                this.f9365e.m464c(1);
            } else {
                m6011a();
                recyclerView = this.f9365e;
                ss ssVar = recyclerView.f697y;
                if (ssVar != null) {
                    ssVar.m5816a(recyclerView, i2, i);
                }
            }
        }
        this.f9366f = false;
        if (this.f9367g) {
            m6011a();
        }
    }

    /* renamed from: b */
    public final void m6012b() {
        this.f9365e.removeCallbacks(this);
        this.f9363c.abortAnimation();
    }
}

package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* renamed from: sp */
public abstract class sp implements OnAttachStateChangeListener, OnTouchListener {
    /* renamed from: a */
    public final View f9219a;
    /* renamed from: b */
    public boolean f9220b;
    /* renamed from: c */
    private final float f9221c;
    /* renamed from: d */
    private final int f9222d;
    /* renamed from: e */
    private final int f9223e;
    /* renamed from: f */
    private Runnable f9224f;
    /* renamed from: g */
    private Runnable f9225g;
    /* renamed from: h */
    private int f9226h;
    /* renamed from: i */
    private final int[] f9227i = new int[2];

    public sp(View view) {
        this.f9219a = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9221c = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f9222d = ViewConfiguration.getTapTimeout();
        this.f9223e = (this.f9222d + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    public abstract pj mo2433a();

    /* renamed from: d */
    final void m5814d() {
        Runnable runnable = this.f9225g;
        if (runnable != null) {
            this.f9219a.removeCallbacks(runnable);
        }
        runnable = this.f9224f;
        if (runnable != null) {
            this.f9219a.removeCallbacks(runnable);
        }
    }

    /* renamed from: b */
    public boolean mo2434b() {
        pj a = mo2433a();
        if (!(a == null || a.mo2473e())) {
            a.mo2474f();
        }
        return true;
    }

    /* renamed from: c */
    protected boolean mo2450c() {
        pj a = mo2433a();
        if (a != null && a.mo2473e()) {
            a.mo2471c();
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f9220b;
        View view2;
        int actionMasked;
        if (z2) {
            view2 = this.f9219a;
            pj a = mo2433a();
            if (a == null) {
                z = false;
            } else if (a.mo2473e()) {
                sh shVar = (sh) a.mo2472d();
                if (shVar == null) {
                    z = false;
                } else if (shVar.isShown()) {
                    MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                    int[] iArr = this.f9227i;
                    view2.getLocationOnScreen(iArr);
                    obtainNoHistory.offsetLocation((float) iArr[0], (float) iArr[1]);
                    int[] iArr2 = this.f9227i;
                    shVar.getLocationOnScreen(iArr2);
                    obtainNoHistory.offsetLocation((float) (-iArr2[0]), (float) (-iArr2[1]));
                    boolean a2 = shVar.mo2476a(obtainNoHistory, this.f9226h);
                    obtainNoHistory.recycle();
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 1) {
                        z = false;
                    } else if (actionMasked != 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!a2) {
                        z = false;
                    } else if (z) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                z = true;
            } else if (mo2450c()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            boolean z3;
            view2 = this.f9219a;
            if (view2.isEnabled()) {
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        this.f9226h = motionEvent.getPointerId(0);
                        if (this.f9224f == null) {
                            this.f9224f = new sq(this);
                        }
                        view2.postDelayed(this.f9224f, (long) this.f9222d);
                        if (this.f9225g == null) {
                            this.f9225g = new sr(this);
                        }
                        view2.postDelayed(this.f9225g, (long) this.f9223e);
                        break;
                    case 1:
                    case 3:
                        m5814d();
                        break;
                    case 2:
                        actionMasked = motionEvent.findPointerIndex(this.f9226h);
                        if (actionMasked < 0) {
                            z = false;
                            break;
                        }
                        float x = motionEvent.getX(actionMasked);
                        float y = motionEvent.getY(actionMasked);
                        float f = this.f9221c;
                        float f2 = -f;
                        if (x < f2) {
                            z = false;
                        } else if (y < f2) {
                            z = false;
                        } else if (x >= ((float) (view2.getRight() - view2.getLeft())) + f) {
                            z = false;
                        } else if (y < ((float) (view2.getBottom() - view2.getTop())) + f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            m5814d();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                }
                z = false;
            } else {
                z = false;
            }
            if (!z) {
                z3 = false;
            } else if (mo2434b()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f9219a.onTouchEvent(obtain);
                obtain.recycle();
                z = z3;
            } else {
                z = z3;
            }
        }
        this.f9220b = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f9220b = false;
        this.f9226h = -1;
        Runnable runnable = this.f9224f;
        if (runnable != null) {
            this.f9219a.removeCallbacks(runnable);
        }
    }
}

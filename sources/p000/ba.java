package p000;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* compiled from: PG */
/* renamed from: ba */
public class ba extends be {
    /* renamed from: a */
    public OverScroller f19852a;
    /* renamed from: b */
    private Runnable f19853b;
    /* renamed from: c */
    private boolean f19854c;
    /* renamed from: f */
    private int f19855f = -1;
    /* renamed from: g */
    private int f19856g;
    /* renamed from: h */
    private int f19857h = -1;
    /* renamed from: i */
    private VelocityTracker f19858i;

    public ba(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo3354a() {
        return false;
    }

    /* renamed from: d */
    private final void m14719d() {
        if (this.f19858i == null) {
            this.f19858i = VelocityTracker.obtain();
        }
    }

    /* renamed from: a */
    public int mo3352a(View view) {
        return -view.getHeight();
    }

    /* renamed from: b */
    public int mo3357b(View view) {
        return view.getHeight();
    }

    /* renamed from: b */
    public int mo3356b() {
        return m7279c();
    }

    public void a_(View view) {
    }

    /* renamed from: a */
    public final boolean mo119a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f19857h < 0) {
            this.f19857h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f19854c) {
            return true;
        }
        VelocityTracker velocityTracker;
        int y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f19854c = false;
                int x = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (mo3354a() && coordinatorLayout.m6735a(view, x, y)) {
                    this.f19856g = y;
                    this.f19855f = motionEvent.getPointerId(0);
                    m14719d();
                    break;
                }
            case 1:
            case 3:
                this.f19854c = false;
                this.f19855f = -1;
                velocityTracker = this.f19858i;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f19858i = null;
                    break;
                }
                break;
            case 2:
                y = this.f19855f;
                if (y != -1) {
                    y = motionEvent.findPointerIndex(y);
                    if (y != -1) {
                        y = (int) motionEvent.getY(y);
                        if (Math.abs(y - this.f19856g) > this.f19857h) {
                            this.f19854c = true;
                            this.f19856g = y;
                            break;
                        }
                    }
                }
                break;
        }
        velocityTracker = this.f19858i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.f19854c;
    }

    /* renamed from: b */
    public final boolean mo120b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.f19857h < 0) {
            this.f19857h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                y = (int) motionEvent.getY();
                if (coordinatorLayout.m6735a(view, (int) motionEvent.getX(), y) && mo3354a()) {
                    this.f19856g = y;
                    this.f19855f = motionEvent.getPointerId(0);
                    m14719d();
                    break;
                }
                return false;
                break;
            case 1:
                velocityTracker = this.f19858i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.f19858i.computeCurrentVelocity(1000);
                    float yVelocity = this.f19858i.getYVelocity(this.f19855f);
                    int i = -mo3357b(view);
                    Runnable runnable = this.f19853b;
                    if (runnable != null) {
                        view.removeCallbacks(runnable);
                        this.f19853b = null;
                    }
                    if (this.f19852a == null) {
                        this.f19852a = new OverScroller(view.getContext());
                    }
                    this.f19852a.fling(0, m7279c(), 0, Math.round(yVelocity), 0, 0, i, 0);
                    if (!this.f19852a.computeScrollOffset()) {
                        a_(view);
                        break;
                    }
                    this.f19853b = new bb(this, coordinatorLayout, view);
                    jm.m4556a(view, this.f19853b);
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f19855f);
                if (findPointerIndex != -1) {
                    y = (int) motionEvent.getY(findPointerIndex);
                    findPointerIndex = this.f19856g - y;
                    if (!this.f19854c) {
                        int abs = Math.abs(findPointerIndex);
                        int i2 = this.f19857h;
                        if (abs > i2) {
                            this.f19854c = true;
                            findPointerIndex = findPointerIndex > 0 ? findPointerIndex - i2 : findPointerIndex + i2;
                        }
                    }
                    if (this.f19854c) {
                        this.f19856g = y;
                        mo3351a(mo3356b() - findPointerIndex, mo3352a(view), 0);
                        break;
                    }
                }
                return false;
                break;
            case 3:
                break;
        }
        this.f19854c = false;
        this.f19855f = -1;
        velocityTracker = this.f19858i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f19858i = null;
        }
        velocityTracker = this.f19858i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return true;
    }

    /* renamed from: a */
    public int mo3351a(int i, int i2, int i3) {
        int c = m7279c();
        if (i2 != 0 && c >= i2 && c <= i3) {
            int a = df.m1576a(i, i2, i3);
            if (c != a) {
                cb cbVar = this.f10683d;
                if (cbVar != null) {
                    cbVar.m1096a(a);
                } else {
                    this.f10684e = a;
                }
                return c - a;
            }
        }
        return 0;
    }
}

package p000;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lo */
public final class lo {
    /* renamed from: v */
    private static final Interpolator f8782v = new lp();
    /* renamed from: a */
    public int f8783a;
    /* renamed from: b */
    public int f8784b;
    /* renamed from: c */
    public float[] f8785c;
    /* renamed from: d */
    public float[] f8786d;
    /* renamed from: e */
    public float[] f8787e;
    /* renamed from: f */
    public float[] f8788f;
    /* renamed from: g */
    public float f8789g;
    /* renamed from: h */
    public int f8790h;
    /* renamed from: i */
    public int f8791i;
    /* renamed from: j */
    public View f8792j;
    /* renamed from: k */
    private int f8793k = -1;
    /* renamed from: l */
    private int[] f8794l;
    /* renamed from: m */
    private int[] f8795m;
    /* renamed from: n */
    private int[] f8796n;
    /* renamed from: o */
    private int f8797o;
    /* renamed from: p */
    private VelocityTracker f8798p;
    /* renamed from: q */
    private float f8799q;
    /* renamed from: r */
    private OverScroller f8800r;
    /* renamed from: s */
    private final lr f8801s;
    /* renamed from: t */
    private boolean f8802t;
    /* renamed from: u */
    private final ViewGroup f8803u;
    /* renamed from: w */
    private final Runnable f8804w = new lq(this);

    private lo(Context context, ViewGroup viewGroup, lr lrVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (lrVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f8803u = viewGroup;
            this.f8801s = lrVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f8790h = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f8784b = viewConfiguration.getScaledTouchSlop();
            this.f8799q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f8789g = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f8800r = new OverScroller(context, f8782v);
        }
    }

    /* renamed from: a */
    public final void m5527a() {
        this.f8793k = -1;
        float[] fArr = this.f8785c;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f8786d, 0.0f);
            Arrays.fill(this.f8787e, 0.0f);
            Arrays.fill(this.f8788f, 0.0f);
            Arrays.fill(this.f8794l, 0);
            Arrays.fill(this.f8795m, 0);
            Arrays.fill(this.f8796n, 0);
            this.f8797o = 0;
        }
        VelocityTracker velocityTracker = this.f8798p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8798p = null;
        }
    }

    /* renamed from: a */
    public final void m5529a(View view, int i) {
        if (view.getParent() != this.f8803u) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            stringBuilder.append(this.f8803u);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f8792j = view;
        this.f8793k = i;
        this.f8801s.mo433c(view, i);
        m5532b(1);
    }

    /* renamed from: a */
    private final boolean m5515a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f8794l[i] & i2) != i2 || (this.f8791i & i2) == 0 || (this.f8796n[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f8795m[i] & i2;
        if (i3 == i2) {
            return false;
        }
        float f3 = (float) this.f8784b;
        if ((abs > f3 || abs2 > f3) && i3 == 0 && abs > f3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m5517a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z;
        int a = this.f8801s.mo428a(view);
        if (this.f8801s.mo502a() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (a > 0 && z) {
            int i = this.f8784b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (a > 0) {
            if (Math.abs(f) > ((float) this.f8784b)) {
                return true;
            }
            return false;
        } else if (!z || Math.abs(f2) <= ((float) this.f8784b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private static float m5510a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            return -f3;
        }
        return f3;
    }

    /* renamed from: a */
    private static int m5511a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            return -i3;
        }
        return i3;
    }

    /* renamed from: c */
    private final void m5523c(int i) {
        if (this.f8785c != null && m5530a(i)) {
            this.f8785c[i] = 0.0f;
            this.f8786d[i] = 0.0f;
            this.f8787e[i] = 0.0f;
            this.f8788f[i] = 0.0f;
            this.f8794l[i] = 0;
            this.f8795m[i] = 0;
            this.f8796n[i] = 0;
            this.f8797o &= (1 << i) ^ -1;
        }
    }

    /* renamed from: b */
    private final int m5518b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f8803u.getWidth();
        float f = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 8.0f) * 0.47123894f))) * f) + f;
        int abs = Math.abs(i2);
        if (abs > 0) {
            width = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) << 2;
        } else {
            width = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(width, 600);
    }

    /* renamed from: b */
    public final boolean m5533b() {
        if (this.f8783a == 2) {
            boolean computeScrollOffset = this.f8800r.computeScrollOffset();
            int currX = this.f8800r.getCurrX();
            int currY = this.f8800r.getCurrY();
            int left = currX - this.f8792j.getLeft();
            int top = currY - this.f8792j.getTop();
            if (left != 0) {
                jm.m4550a(this.f8792j, left);
            }
            if (top != 0) {
                jm.m4565b(this.f8792j, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f8801s.mo434d(this.f8792j, currX);
            }
            if (computeScrollOffset && currX == this.f8800r.getFinalX() && currY == this.f8800r.getFinalY()) {
                this.f8800r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f8803u.post(this.f8804w);
            }
        }
        if (this.f8783a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static lo m5512a(ViewGroup viewGroup, lr lrVar) {
        lo b = lo.m5519b(viewGroup, lrVar);
        b.f8784b = (int) ((float) b.f8784b);
        return b;
    }

    /* renamed from: b */
    public static lo m5519b(ViewGroup viewGroup, lr lrVar) {
        return new lo(viewGroup.getContext(), viewGroup, lrVar);
    }

    /* renamed from: a */
    private final void m5513a(float f, float f2) {
        this.f8802t = true;
        this.f8801s.mo431a(this.f8792j, f, f2);
        this.f8802t = false;
        if (this.f8783a == 1) {
            m5532b(0);
        }
    }

    /* renamed from: a */
    public final View m5526a(int i, int i2) {
        for (int childCount = this.f8803u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f8803u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m5516a(int i, int i2, int i3, int i4) {
        int left = this.f8792j.getLeft();
        int top = this.f8792j.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f8800r.abortAnimation();
            m5532b(0);
            return false;
        }
        float f;
        float f2;
        View view = this.f8792j;
        int a = lo.m5511a(i3, (int) this.f8789g, (int) this.f8799q);
        int a2 = lo.m5511a(i4, (int) this.f8789g, (int) this.f8799q);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (a == 0) {
            f = ((float) abs) / ((float) i8);
        } else {
            f = ((float) abs3) / ((float) i7);
        }
        if (a2 == 0) {
            f2 = ((float) abs2) / ((float) i8);
        } else {
            f2 = ((float) abs4) / ((float) i7);
        }
        int b = m5518b(i5, a, this.f8801s.mo428a(view));
        f *= (float) b;
        this.f8800r.startScroll(left, top, i5, i6, (int) ((f2 * ((float) m5518b(i6, a2, this.f8801s.mo502a()))) + f));
        m5532b(2);
        return true;
    }

    /* renamed from: a */
    public final boolean m5530a(int i) {
        return (this.f8797o & (1 << i)) != 0;
    }

    /* renamed from: d */
    private final boolean m5525d(int i) {
        if (m5530a(i)) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring pointerId=");
        stringBuilder.append(i);
        stringBuilder.append(" because ACTION_DOWN was not received ");
        stringBuilder.append("for this pointer before ACTION_MOVE. It likely happened because ");
        stringBuilder.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", stringBuilder.toString());
        return false;
    }

    /* renamed from: a */
    public final void m5528a(MotionEvent motionEvent) {
        int i = 0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m5527a();
        }
        if (this.f8798p == null) {
            this.f8798p = VelocityTracker.obtain();
        }
        this.f8798p.addMovement(motionEvent);
        float x;
        int pointerCount;
        float x2;
        int i2;
        View view;
        switch (actionMasked) {
            case 0:
                x = motionEvent.getX();
                float y = motionEvent.getY();
                i = motionEvent.getPointerId(0);
                View a = m5526a((int) x, (int) y);
                m5520b(x, y, i);
                m5521b(a, i);
                if ((this.f8794l[i] & this.f8791i) != 0) {
                    this.f8801s.mo2327c();
                    return;
                }
                return;
            case 1:
                if (this.f8783a == 1) {
                    m5522c();
                }
                m5527a();
                return;
            case 2:
                if (this.f8783a != 1) {
                    pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        actionMasked = motionEvent.getPointerId(i);
                        if (m5525d(actionMasked)) {
                            x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.f8785c[actionMasked];
                            float f2 = y2 - this.f8786d[actionMasked];
                            m5514a(f, f2, actionMasked);
                            if (this.f8783a != 1) {
                                View a2 = m5526a((int) x2, (int) y2);
                                if (m5517a(a2, f, f2) && m5521b(a2, actionMasked)) {
                                }
                            }
                            m5524c(motionEvent);
                            return;
                        }
                        i++;
                    }
                    m5524c(motionEvent);
                    return;
                } else if (m5525d(this.f8793k)) {
                    i = motionEvent.findPointerIndex(this.f8793k);
                    x = motionEvent.getX(i);
                    float y3 = motionEvent.getY(i);
                    float[] fArr = this.f8787e;
                    actionMasked = this.f8793k;
                    i2 = (int) (x - fArr[actionMasked]);
                    pointerCount = (int) (y3 - this.f8788f[actionMasked]);
                    i = this.f8792j.getLeft() + i2;
                    actionMasked = this.f8792j.getTop() + pointerCount;
                    actionIndex = this.f8792j.getLeft();
                    int top = this.f8792j.getTop();
                    if (i2 != 0) {
                        i = this.f8801s.mo429a(this.f8792j, i);
                        jm.m4550a(this.f8792j, i - actionIndex);
                    }
                    if (pointerCount != 0) {
                        jm.m4565b(this.f8792j, this.f8801s.mo432b(this.f8792j, actionMasked) - top);
                    }
                    if (!(i2 == 0 && pointerCount == 0)) {
                        this.f8801s.mo434d(this.f8792j, i);
                    }
                    m5524c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f8783a == 1) {
                    m5513a(0.0f, 0.0f);
                }
                m5527a();
                return;
            case 5:
                pointerCount = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                x2 = motionEvent.getY(actionIndex);
                m5520b(x3, x2, pointerCount);
                if (this.f8783a == 0) {
                    m5521b(m5526a((int) x3, (int) x2), pointerCount);
                    if ((this.f8794l[pointerCount] & this.f8791i) != 0) {
                        this.f8801s.mo2327c();
                        return;
                    }
                    return;
                }
                actionMasked = (int) x3;
                actionIndex = (int) x2;
                view = this.f8792j;
                if (view != null && actionMasked >= view.getLeft() && actionMasked < view.getRight() && actionIndex >= view.getTop() && actionIndex < view.getBottom()) {
                    i = 1;
                }
                if (i != 0) {
                    m5521b(this.f8792j, pointerCount);
                    return;
                }
                return;
            case 6:
                actionMasked = motionEvent.getPointerId(actionIndex);
                if (this.f8783a == 1 && actionMasked == this.f8793k) {
                    i2 = motionEvent.getPointerCount();
                    while (i < i2) {
                        actionIndex = motionEvent.getPointerId(i);
                        if (actionIndex != this.f8793k) {
                            view = m5526a((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                            View view2 = this.f8792j;
                            if (view == view2 && m5521b(view2, actionIndex)) {
                                i = this.f8793k;
                                if (i == -1) {
                                    m5522c();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        m5522c();
                    }
                }
                m5523c(actionMasked);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    private final void m5522c() {
        this.f8798p.computeCurrentVelocity(1000, this.f8799q);
        m5513a(lo.m5510a(this.f8798p.getXVelocity(this.f8793k), this.f8789g, this.f8799q), lo.m5510a(this.f8798p.getYVelocity(this.f8793k), this.f8789g, this.f8799q));
    }

    /* renamed from: a */
    private final void m5514a(float f, float f2, int i) {
        int a = m5515a(f, f2, i, 1);
        if (m5515a(f2, f, i, 4)) {
            a |= 4;
        }
        if (m5515a(f, f2, i, 2)) {
            a |= 2;
        }
        if (m5515a(f2, f, i, 8)) {
            a |= 8;
        }
        if (a != 0) {
            int[] iArr = this.f8795m;
            iArr[i] = iArr[i] | a;
            this.f8801s.mo2326a(a, i);
        }
    }

    /* renamed from: b */
    private final void m5520b(float f, float f2, int i) {
        int i2;
        int i3 = 0;
        Object obj = this.f8785c;
        if (obj == null || obj.length <= i) {
            i2 = i + 1;
            Object obj2 = new float[i2];
            Object obj3 = new float[i2];
            Object obj4 = new float[i2];
            Object obj5 = new float[i2];
            Object obj6 = new int[i2];
            Object obj7 = new int[i2];
            Object obj8 = new int[i2];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
                obj = this.f8786d;
                System.arraycopy(obj, 0, obj3, 0, obj.length);
                obj = this.f8787e;
                System.arraycopy(obj, 0, obj4, 0, obj.length);
                obj = this.f8788f;
                System.arraycopy(obj, 0, obj5, 0, obj.length);
                obj = this.f8794l;
                System.arraycopy(obj, 0, obj6, 0, obj.length);
                obj = this.f8795m;
                System.arraycopy(obj, 0, obj7, 0, obj.length);
                obj = this.f8796n;
                System.arraycopy(obj, 0, obj8, 0, obj.length);
            }
            this.f8785c = obj2;
            this.f8786d = obj3;
            this.f8787e = obj4;
            this.f8788f = obj5;
            this.f8794l = obj6;
            this.f8795m = obj7;
            this.f8796n = obj8;
        }
        float[] fArr = this.f8785c;
        this.f8787e[i] = f;
        fArr[i] = f;
        fArr = this.f8786d;
        this.f8788f[i] = f2;
        fArr[i] = f2;
        int[] iArr = this.f8794l;
        i2 = (int) f;
        int i4 = (int) f2;
        if (i2 < this.f8803u.getLeft() + this.f8790h) {
            i3 = 1;
        }
        if (i4 < this.f8803u.getTop() + this.f8790h) {
            i3 |= 4;
        }
        if (i2 > this.f8803u.getRight() - this.f8790h) {
            i3 |= 2;
        }
        if (i4 > this.f8803u.getBottom() - this.f8790h) {
            i3 |= 8;
        }
        iArr[i] = i3;
        this.f8797o |= 1 << i;
    }

    /* renamed from: c */
    private final void m5524c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m5525d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f8787e[pointerId] = x;
                this.f8788f[pointerId] = y;
            }
        }
    }

    /* renamed from: b */
    final void m5532b(int i) {
        this.f8803u.removeCallbacks(this.f8804w);
        if (this.f8783a != i) {
            this.f8783a = i;
            this.f8801s.mo430a(i);
            if (this.f8783a == 0) {
                this.f8792j = null;
            }
        }
    }

    /* renamed from: b */
    public final boolean m5534b(int i, int i2) {
        if (this.f8802t) {
            return m5516a(i, i2, (int) this.f8798p.getXVelocity(this.f8793k), (int) this.f8798p.getYVelocity(this.f8793k));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: b */
    public final boolean m5535b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m5527a();
        }
        if (this.f8798p == null) {
            this.f8798p = VelocityTracker.obtain();
        }
        this.f8798p.addMovement(motionEvent);
        float x;
        float y;
        int pointerId;
        int pointerId2;
        switch (actionMasked) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                pointerId = motionEvent.getPointerId(0);
                m5520b(x, y, pointerId);
                View a = m5526a((int) x, (int) y);
                if (a == this.f8792j && this.f8783a == 2) {
                    m5521b(a, pointerId);
                }
                if ((this.f8794l[pointerId] & this.f8791i) != 0) {
                    this.f8801s.mo2327c();
                    break;
                }
                break;
            case 1:
            case 3:
                m5527a();
                break;
            case 2:
                if (!(this.f8785c == null || this.f8786d == null)) {
                    pointerId = motionEvent.getPointerCount();
                    for (actionIndex = 0; actionIndex < pointerId; actionIndex++) {
                        pointerId2 = motionEvent.getPointerId(actionIndex);
                        if (m5525d(pointerId2)) {
                            Object obj;
                            x = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            float f = x - this.f8785c[pointerId2];
                            float f2 = y2 - this.f8786d[pointerId2];
                            View a2 = m5526a((int) x, (int) y2);
                            if (a2 == null) {
                                obj = null;
                            } else if (m5517a(a2, f, f2)) {
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                int left = a2.getLeft();
                                int a3 = this.f8801s.mo429a(a2, ((int) f) + left);
                                int top = a2.getTop();
                                int b = this.f8801s.mo432b(a2, ((int) f2) + top);
                                int a4 = this.f8801s.mo428a(a2);
                                int a5 = this.f8801s.mo502a();
                                if (a4 != 0) {
                                    if (a4 > 0 && a3 == left) {
                                    }
                                }
                                if (a5 != 0) {
                                    if (a5 > 0 && b == top) {
                                    }
                                }
                                m5524c(motionEvent);
                                break;
                            }
                            m5514a(f, f2, pointerId2);
                            if (this.f8783a != 1) {
                                if (obj != null && m5521b(a2, pointerId2)) {
                                }
                            }
                            m5524c(motionEvent);
                        }
                    }
                    m5524c(motionEvent);
                }
            case 5:
                actionMasked = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                y = motionEvent.getY(actionIndex);
                m5520b(x2, y, actionMasked);
                pointerId2 = this.f8783a;
                if (pointerId2 != 0) {
                    if (pointerId2 == 2) {
                        View a6 = m5526a((int) x2, (int) y);
                        if (a6 == this.f8792j) {
                            m5521b(a6, actionMasked);
                            break;
                        }
                    }
                } else if ((this.f8794l[actionMasked] & this.f8791i) != 0) {
                    this.f8801s.mo2327c();
                    break;
                }
                break;
            case 6:
                m5523c(motionEvent.getPointerId(actionIndex));
                break;
        }
        if (this.f8783a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m5531a(View view, int i, int i2) {
        this.f8792j = view;
        this.f8793k = -1;
        boolean a = m5516a(i, i2, 0, 0);
        if (!(a || this.f8783a != 0 || this.f8792j == null)) {
            this.f8792j = null;
        }
        return a;
    }

    /* renamed from: b */
    private final boolean m5521b(View view, int i) {
        if (view == this.f8792j && this.f8793k == i) {
            return true;
        }
        if (view == null || !this.f8801s.mo435e(view, i)) {
            return false;
        }
        this.f8793k = i;
        m5529a(view, i);
        return true;
    }
}

package android.support.design.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.GoogleCamera.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p000.bj;
import p000.bk;
import p000.bm;
import p000.bn;
import p000.dj;
import p000.jm;
import p000.lo;
import p000.lr;

/* compiled from: PG */
public class BottomSheetBehavior extends dj {
    /* renamed from: a */
    public boolean f9911a = true;
    /* renamed from: b */
    public int f9912b;
    /* renamed from: c */
    public int f9913c;
    /* renamed from: d */
    public int f9914d;
    /* renamed from: e */
    public boolean f9915e;
    /* renamed from: f */
    public int f9916f = 4;
    /* renamed from: g */
    public lo f9917g;
    /* renamed from: h */
    public int f9918h;
    /* renamed from: i */
    public WeakReference f9919i;
    /* renamed from: j */
    public WeakReference f9920j;
    /* renamed from: k */
    public int f9921k;
    /* renamed from: l */
    public boolean f9922l;
    /* renamed from: m */
    private float f9923m;
    /* renamed from: n */
    private int f9924n;
    /* renamed from: o */
    private boolean f9925o;
    /* renamed from: p */
    private int f9926p;
    /* renamed from: q */
    private int f9927q;
    /* renamed from: r */
    private boolean f9928r;
    /* renamed from: s */
    private boolean f9929s;
    /* renamed from: t */
    private int f9930t;
    /* renamed from: u */
    private boolean f9931u;
    /* renamed from: v */
    private VelocityTracker f9932v;
    /* renamed from: w */
    private int f9933w;
    /* renamed from: x */
    private Map f9934x;
    /* renamed from: y */
    private final lr f9935y = new bj(this);

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bn.f1329a);
        TypedValue peekValue = obtainStyledAttributes.peekValue(bn.f1332d);
        if (peekValue == null || peekValue.data != -1) {
            m6683c(obtainStyledAttributes.getDimensionPixelSize(bn.f1332d, -1));
        } else {
            m6683c(peekValue.data);
        }
        this.f9915e = obtainStyledAttributes.getBoolean(bn.f1331c, false);
        boolean z = obtainStyledAttributes.getBoolean(bn.f1330b, true);
        if (this.f9911a != z) {
            int i;
            this.f9911a = z;
            if (this.f9919i != null) {
                m6682c();
            }
            if (this.f9911a && this.f9916f == 6) {
                i = 3;
            } else {
                i = this.f9916f;
            }
            m6696b(i);
        }
        this.f9928r = obtainStyledAttributes.getBoolean(bn.f1333e, false);
        obtainStyledAttributes.recycle();
        this.f9923m = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: c */
    private final void m6682c() {
        if (this.f9911a) {
            this.f9914d = Math.max(this.f9918h - this.f9927q, this.f9912b);
        } else {
            this.f9914d = this.f9918h - this.f9927q;
        }
    }

    /* renamed from: a */
    public final void m6686a() {
        this.f9919i.get();
    }

    /* renamed from: a */
    private final View m6680a(View view) {
        if (jm.m4591y(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = m6680a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int m6695b() {
        return this.f9911a ? this.f9912b : 0;
    }

    /* renamed from: a */
    public final boolean mo119a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view.isShown()) {
            WeakReference weakReference;
            View view2;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m6684d();
            }
            if (this.f9932v == null) {
                this.f9932v = VelocityTracker.obtain();
            }
            this.f9932v.addMovement(motionEvent);
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f9933w = (int) motionEvent.getY();
                    weakReference = this.f9920j;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.m6735a(view2, x, this.f9933w)) {
                        this.f9921k = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f9922l = true;
                    }
                    boolean z = this.f9921k == -1 ? !coordinatorLayout.m6735a(view, x, this.f9933w) : false;
                    this.f9929s = z;
                    break;
                case 1:
                case 3:
                    this.f9922l = false;
                    this.f9921k = -1;
                    if (this.f9929s) {
                        this.f9929s = false;
                        return false;
                    }
                    break;
            }
            if (!this.f9929s) {
                lo loVar = this.f9917g;
                if (loVar != null && loVar.m5535b(motionEvent)) {
                    return true;
                }
            }
            weakReference = this.f9920j;
            if (weakReference != null) {
                view2 = (View) weakReference.get();
            } else {
                view2 = null;
            }
            if (actionMasked != 2 || r0 == null || this.f9929s || this.f9916f == 1 || coordinatorLayout.m6735a(r0, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f9917g == null || Math.abs(((float) this.f9933w) - motionEvent.getY()) <= ((float) this.f9917g.f8784b)) {
                return false;
            }
            return true;
        }
        this.f9929s = true;
        return false;
    }

    /* renamed from: a */
    public final boolean mo118a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (jm.m4573g(coordinatorLayout) && !jm.m4573g(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.m6731a(view, i);
        this.f9918h = coordinatorLayout.getHeight();
        if (this.f9925o) {
            if (this.f9926p == 0) {
                this.f9926p = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            }
            this.f9927q = Math.max(this.f9926p, this.f9918h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f9927q = this.f9924n;
        }
        this.f9912b = Math.max(0, this.f9918h - view.getHeight());
        this.f9913c = this.f9918h / 2;
        m6682c();
        int i2 = this.f9916f;
        if (i2 == 3) {
            jm.m4565b(view, m6695b());
        } else if (i2 == 6) {
            jm.m4565b(view, this.f9913c);
        } else if (this.f9915e && i2 == 5) {
            jm.m4565b(view, this.f9918h);
        } else if (i2 == 4) {
            jm.m4565b(view, this.f9914d);
        } else if (i2 == 1 || i2 == 2) {
            jm.m4565b(view, top - view.getTop());
        }
        if (this.f9917g == null) {
            this.f9917g = lo.m5519b((ViewGroup) coordinatorLayout, this.f9935y);
        }
        this.f9919i = new WeakReference(view);
        this.f9920j = new WeakReference(m6680a(view));
        return true;
    }

    /* renamed from: a */
    public final boolean mo126a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        if (view2 != this.f9920j.get()) {
            return false;
        }
        if (this.f9916f == 3 && !super.mo126a(coordinatorLayout, view, view2, f, f2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo124a(View view, View view2, int i, int[] iArr, int i2) {
        if (i2 != 1 && view2 == ((View) this.f9920j.get())) {
            int top = view.getTop();
            int i3 = top - i;
            if (i > 0) {
                if (i3 < m6695b()) {
                    iArr[1] = top - m6695b();
                    jm.m4565b(view, -iArr[1]);
                    m6696b(3);
                } else {
                    iArr[1] = i;
                    jm.m4565b(view, -i);
                    m6696b(1);
                }
            } else if (i < 0 && !view2.canScrollVertically(-1)) {
                int i4 = this.f9914d;
                if (i3 <= i4 || this.f9915e) {
                    iArr[1] = i;
                    jm.m4565b(view, -i);
                    m6696b(1);
                } else {
                    iArr[1] = top - i4;
                    jm.m4565b(view, -iArr[1]);
                    m6696b(4);
                }
            }
            view.getTop();
            m6686a();
            this.f9930t = i;
            this.f9931u = true;
        }
    }

    /* renamed from: a */
    public final void mo122a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        bk bkVar = (bk) parcelable;
        super.mo122a(coordinatorLayout, view, bkVar.f7631e);
        int i = bkVar.f10974a;
        if (i == 1 || i == 2) {
            this.f9916f = 4;
        } else {
            this.f9916f = i;
        }
    }

    /* renamed from: a */
    public final Parcelable mo121a(CoordinatorLayout coordinatorLayout, View view) {
        return new bk(super.mo121a(coordinatorLayout, view), this.f9916f);
    }

    /* renamed from: a */
    public final boolean mo125a(int i, int i2) {
        this.f9930t = 0;
        this.f9931u = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo123a(View view, View view2, int i) {
        int i2 = 3;
        if (view.getTop() == m6695b()) {
            m6696b(3);
        } else if (view2 == this.f9920j.get() && this.f9931u) {
            int b;
            if (this.f9930t > 0) {
                b = m6695b();
            } else {
                if (this.f9915e) {
                    float yVelocity;
                    VelocityTracker velocityTracker = this.f9932v;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(1000, this.f9923m);
                        yVelocity = this.f9932v.getYVelocity(this.f9921k);
                    } else {
                        yVelocity = 0.0f;
                    }
                    if (m6694a(view, yVelocity)) {
                        b = this.f9918h;
                        i2 = 5;
                    }
                }
                if (this.f9930t == 0) {
                    b = view.getTop();
                    if (!this.f9911a) {
                        int i3 = this.f9913c;
                        if (b < i3) {
                            if (b >= Math.abs(b - this.f9914d)) {
                                b = this.f9913c;
                                i2 = 6;
                            } else {
                                b = 0;
                            }
                        } else if (Math.abs(b - i3) < Math.abs(b - this.f9914d)) {
                            b = this.f9913c;
                            i2 = 6;
                        } else {
                            b = this.f9914d;
                            i2 = 4;
                        }
                    } else if (Math.abs(b - this.f9912b) < Math.abs(b - this.f9914d)) {
                        b = this.f9912b;
                    } else {
                        b = this.f9914d;
                        i2 = 4;
                    }
                } else {
                    b = this.f9914d;
                    i2 = 4;
                }
            }
            if (this.f9917g.m5531a(view, view.getLeft(), b)) {
                m6696b(2);
                jm.m4556a(view, new bm(this, view, i2));
            } else {
                m6696b(i2);
            }
            this.f9931u = false;
        }
    }

    /* renamed from: b */
    public final boolean mo120b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9916f == 1 && actionMasked == 0) {
            return true;
        }
        lo loVar = this.f9917g;
        if (loVar != null) {
            loVar.m5528a(motionEvent);
        }
        if (actionMasked == 0) {
            m6684d();
        }
        if (this.f9932v == null) {
            this.f9932v = VelocityTracker.obtain();
        }
        this.f9932v.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f9929s) {
            float abs = Math.abs(((float) this.f9933w) - motionEvent.getY());
            lo loVar2 = this.f9917g;
            if (abs > ((float) loVar2.f8784b)) {
                loVar2.m5529a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return this.f9929s ^ 1;
    }

    /* renamed from: d */
    private final void m6684d() {
        this.f9921k = -1;
        VelocityTracker velocityTracker = this.f9932v;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9932v = null;
        }
    }

    /* renamed from: c */
    private final void m6683c(int i) {
        boolean z = true;
        if (i == -1) {
            if (this.f9925o) {
                z = false;
            } else {
                this.f9925o = true;
            }
        } else if (this.f9925o || this.f9924n != i) {
            this.f9925o = false;
            this.f9924n = Math.max(0, i);
            this.f9914d = this.f9918h - i;
        } else {
            z = false;
        }
        if (z && this.f9916f == 4) {
            WeakReference weakReference = this.f9919i;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m6696b(int i) {
        if (this.f9916f != i) {
            this.f9916f = i;
            if (i == 6 || i == 3) {
                m6681a(true);
            } else if (i == 5 || i == 4) {
                m6681a(false);
            }
            this.f9919i.get();
        }
    }

    /* renamed from: a */
    public final boolean m6694a(View view, float f) {
        if (this.f9928r) {
            return true;
        }
        if (view.getTop() < this.f9914d) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (0.1f * f)) - ((float) this.f9914d)) / ((float) this.f9924n) <= 0.5f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m6681a(boolean z) {
        WeakReference weakReference = this.f9919i;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                int i;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (!z) {
                    i = 0;
                } else if (this.f9934x == null) {
                    this.f9934x = new HashMap(childCount);
                    i = 0;
                } else {
                    return;
                }
                while (i < childCount) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f9919i.get()) {
                        if (z) {
                            if (VERSION.SDK_INT >= 16) {
                                this.f9934x.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            jm.m4568c(childAt, 4);
                        } else {
                            Map map = this.f9934x;
                            if (map != null && map.containsKey(childAt)) {
                                jm.m4568c(childAt, ((Integer) this.f9934x.get(childAt)).intValue());
                            }
                        }
                    }
                    i++;
                }
                if (!z) {
                    this.f9934x = null;
                }
            }
        }
    }
}

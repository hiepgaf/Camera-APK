package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.List;
import p000.jh;
import p000.ji;
import p000.jj;
import p000.jm;
import p000.kvl;
import p000.lk;
import p000.lm;

/* compiled from: PG */
public class NestedScrollView extends FrameLayout implements ji {
    /* renamed from: w */
    private static final lk f9977w = new lk();
    /* renamed from: x */
    private static final int[] f9978x = new int[]{16843130};
    /* renamed from: A */
    private float f9979A;
    /* renamed from: a */
    private long f9980a;
    /* renamed from: b */
    private final Rect f9981b;
    /* renamed from: c */
    private OverScroller f9982c;
    /* renamed from: d */
    private EdgeEffect f9983d;
    /* renamed from: e */
    private EdgeEffect f9984e;
    /* renamed from: f */
    private int f9985f;
    /* renamed from: g */
    private boolean f9986g;
    /* renamed from: h */
    private boolean f9987h;
    /* renamed from: i */
    private View f9988i;
    /* renamed from: j */
    private boolean f9989j;
    /* renamed from: k */
    private VelocityTracker f9990k;
    /* renamed from: l */
    private boolean f9991l;
    /* renamed from: m */
    private boolean f9992m;
    /* renamed from: n */
    private int f9993n;
    /* renamed from: o */
    private int f9994o;
    /* renamed from: p */
    private int f9995p;
    /* renamed from: q */
    private int f9996q;
    /* renamed from: r */
    private final int[] f9997r;
    /* renamed from: s */
    private final int[] f9998s;
    /* renamed from: t */
    private int f9999t;
    /* renamed from: u */
    private int f10000u;
    /* renamed from: v */
    private lm f10001v;
    /* renamed from: y */
    private final jj f10002y;
    /* renamed from: z */
    private final jh f10003z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9981b = new Rect();
        this.f9986g = true;
        this.f9987h = false;
        this.f9988i = null;
        this.f9989j = false;
        this.f9992m = true;
        this.f9996q = -1;
        this.f9997r = new int[2];
        this.f9998s = new int[2];
        this.f9982c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f9993n = viewConfiguration.getScaledTouchSlop();
        this.f9994o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9995p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9978x, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.f9991l) {
            this.f9991l = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.f10002y = new jj();
        this.f10003z = new jh(this);
        setNestedScrollingEnabled(true);
        jm.m4559a((View) this, f9977w);
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    private final boolean m6752b(int i) {
        View view;
        int scrollY;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            view = findFocus;
        }
        findFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findFocus == null || !m6748a(findFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                scrollY = getScrollY();
            } else if (i != ScriptIntrinsicBLAS.RsBlas_ctrsm) {
                scrollY = height;
            } else if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                scrollY = Math.min((layoutParams.bottomMargin + childAt.getBottom()) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            } else {
                scrollY = height;
            }
            if (scrollY == 0) {
                return false;
            }
            if (i != ScriptIntrinsicBLAS.RsBlas_ctrsm) {
                scrollY = -scrollY;
            }
            m6756c(scrollY);
        } else {
            findFocus.getDrawingRect(this.f9981b);
            offsetDescendantRectToMyCoords(findFocus, this.f9981b);
            m6756c(m6741a(this.f9981b));
            findFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && m6747a(view)) {
            scrollY = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(scrollY);
        }
        return true;
    }

    /* renamed from: a */
    private static int m6740a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        if (i2 + i > i3) {
            return i3 - i2;
        }
        return i;
    }

    public void computeScroll() {
        int i = 1;
        if (this.f9982c.computeScrollOffset()) {
            this.f9982c.getCurrX();
            int currY = this.f9982c.getCurrY();
            int i2 = currY - this.f10000u;
            if (m6746a(0, i2, this.f9998s, null, 1)) {
                i2 -= this.f9998s[1];
            }
            if (i2 != 0) {
                int a = m6763a();
                int scrollY = getScrollY();
                m6744a(i2, getScrollX(), scrollY, a);
                int scrollY2 = getScrollY() - scrollY;
                if (!m6745a(0, scrollY2, 0, i2 - scrollY2, null, 1)) {
                    i2 = getOverScrollMode();
                    if (i2 != 0) {
                        if (i2 != 1) {
                            i = 0;
                        } else if (a <= 0) {
                            i = 0;
                        }
                    }
                    if (i != 0) {
                        m6755c();
                        if (currY <= 0 && scrollY > 0) {
                            this.f9983d.onAbsorb((int) this.f9982c.getCurrVelocity());
                        } else if (currY >= a && scrollY < a) {
                            this.f9984e.onAbsorb((int) this.f9982c.getCurrVelocity());
                        }
                    }
                }
            }
            this.f10000u = currY;
            jm.m4542A(this);
            return;
        }
        if (m6761f(1)) {
            m6762g(1);
        }
        this.f10000u = 0;
    }

    /* renamed from: a */
    private final int m6741a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int i;
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            i = scrollY + verticalFadingEdgeLength;
        } else {
            i = scrollY;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) {
            verticalFadingEdgeLength = i2 - verticalFadingEdgeLength;
        } else {
            verticalFadingEdgeLength = i2;
        }
        if (rect.bottom > verticalFadingEdgeLength && rect.top > i) {
            if (rect.height() > height) {
                i = rect.top - i;
            } else {
                i = rect.bottom - verticalFadingEdgeLength;
            }
            scrollY = Math.min(i, (layoutParams.bottomMargin + childAt.getBottom()) - i2);
        } else if (rect.top >= i) {
            scrollY = 0;
        } else if (rect.bottom >= verticalFadingEdgeLength) {
            scrollY = 0;
        } else {
            if (rect.height() > height) {
                scrollY = -(verticalFadingEdgeLength - rect.bottom);
            } else {
                scrollY = -(i - rect.top);
            }
            scrollY = Math.max(scrollY, -getScrollY());
        }
        return scrollY;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int bottom = layoutParams.bottomMargin + childAt.getBottom();
        int scrollY = getScrollY();
        height = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > height) {
            return bottom + (scrollY - height);
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m6767a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f10003z.m4483a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f10003z.m4482a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m6746a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    private final boolean m6746a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f10003z.m4487a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m6745a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    private final boolean m6745a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f10003z.m4486a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: c */
    private final void m6756c(int i) {
        if (i == 0) {
            return;
        }
        if (this.f9992m) {
            m6742a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    public void draw(Canvas canvas) {
        int i = 0;
        super.draw(canvas);
        if (this.f9983d != null) {
            int width;
            int height;
            int min;
            int paddingLeft;
            int scrollY = getScrollY();
            if (!this.f9983d.isFinished()) {
                int save = canvas.save();
                width = getWidth();
                height = getHeight();
                min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    paddingLeft = width - (getPaddingLeft() + getPaddingRight());
                    width = getPaddingLeft();
                } else {
                    paddingLeft = width;
                    width = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) width, (float) min);
                this.f9983d.setSize(paddingLeft, height);
                if (this.f9983d.draw(canvas)) {
                    jm.m4542A(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f9984e.isFinished()) {
                height = canvas.save();
                width = getWidth();
                min = getHeight();
                paddingLeft = Math.max(m6763a(), scrollY) + min;
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft();
                }
                if (getClipToPadding()) {
                    min -= getPaddingTop() + getPaddingBottom();
                    paddingLeft -= getPaddingBottom();
                }
                canvas.translate((float) (i - width), (float) paddingLeft);
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f9984e.setSize(width, min);
                if (this.f9984e.draw(canvas)) {
                    jm.m4542A(this);
                }
                canvas.restoreToCount(height);
            }
        }
    }

    /* renamed from: b */
    private final void m6750b() {
        this.f9989j = false;
        m6759e();
        m6762g(0);
        EdgeEffect edgeEffect = this.f9983d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f9984e.onRelease();
        }
    }

    /* renamed from: c */
    private final void m6755c() {
        if (getOverScrollMode() == 2) {
            this.f9983d = null;
            this.f9984e = null;
        } else if (this.f9983d == null) {
            Context context = getContext();
            this.f9983d = new EdgeEffect(context);
            this.f9984e = new EdgeEffect(context);
        }
    }

    /* renamed from: a */
    public final boolean m6767a(KeyEvent keyEvent) {
        FrameLayout.LayoutParams layoutParams;
        boolean z;
        int i = 33;
        this.f9981b.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.bottomMargin + (childAt.getHeight() + layoutParams.topMargin) > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            if (keyEvent.getAction() == 0) {
                switch (keyEvent.getKeyCode()) {
                    case 19:
                        if (!keyEvent.isAltPressed()) {
                            z = m6752b(33);
                            break;
                        }
                        z = m6760e(33);
                        break;
                    case 20:
                        if (!keyEvent.isAltPressed()) {
                            z = m6752b((int) ScriptIntrinsicBLAS.RsBlas_ctrsm);
                            break;
                        }
                        z = m6760e(ScriptIntrinsicBLAS.RsBlas_ctrsm);
                        break;
                    case 62:
                        Rect rect;
                        if (!keyEvent.isShiftPressed()) {
                            i = ScriptIntrinsicBLAS.RsBlas_ctrsm;
                        }
                        int height = getHeight();
                        if (i == ScriptIntrinsicBLAS.RsBlas_ctrsm) {
                            this.f9981b.top = getScrollY() + height;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                View childAt2 = getChildAt(childCount - 1);
                                layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                                childCount = (layoutParams.bottomMargin + childAt2.getBottom()) + getPaddingBottom();
                                Rect rect2 = this.f9981b;
                                if (rect2.top + height > childCount) {
                                    rect2.top = childCount - height;
                                }
                            }
                        } else {
                            this.f9981b.top = getScrollY() - height;
                            rect = this.f9981b;
                            if (rect.top < 0) {
                                rect.top = 0;
                            }
                        }
                        rect = this.f9981b;
                        rect.bottom = rect.top + height;
                        m6754b(i, rect.top, rect.bottom);
                        return false;
                    default:
                        z = false;
                        break;
                }
            }
            z = false;
            return z;
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, ScriptIntrinsicBLAS.RsBlas_ctrsm);
            if (findFocus == null || findFocus == this || !findFocus.requestFocus(ScriptIntrinsicBLAS.RsBlas_ctrsm)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: d */
    private final void m6758d(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) ? scrollY < m6763a() ? true : i < 0 : false;
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            if (getChildCount() > 0) {
                m6753b(2, 1);
                this.f9982c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, kvl.UNSET_ENUM_VALUE, LfuScheduler.MAX_PRIORITY, 0, 0);
                this.f10000u = getScrollY();
                jm.m4542A(this);
            }
        }
    }

    /* renamed from: e */
    private final boolean m6760e(int i) {
        int height = getHeight();
        Rect rect = this.f9981b;
        rect.top = 0;
        rect.bottom = height;
        if (i == ScriptIntrinsicBLAS.RsBlas_ctrsm) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                this.f9981b.bottom = (layoutParams.bottomMargin + childAt.getBottom()) + getPaddingBottom();
                rect = this.f9981b;
                rect.top = rect.bottom - height;
            }
        }
        rect = this.f9981b;
        return m6754b(i, rect.top, rect.bottom);
    }

    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((layoutParams.bottomMargin + childAt.getBottom()) - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public int getNestedScrollAxes() {
        return this.f10002y.f7876a;
    }

    /* renamed from: a */
    public final int m6763a() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, (layoutParams.bottomMargin + (childAt.getHeight() + layoutParams.topMargin)) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return m6761f(0);
    }

    /* renamed from: f */
    private final boolean m6761f(int i) {
        return this.f10003z.m4484a(i);
    }

    /* renamed from: d */
    private final void m6757d() {
        if (this.f9990k == null) {
            this.f9990k = VelocityTracker.obtain();
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.f10003z.f7820a;
    }

    /* renamed from: a */
    private final boolean m6747a(View view) {
        return m6748a(view, 0, getHeight()) ^ 1;
    }

    /* renamed from: a */
    private static boolean m6749a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m6749a((View) parent, view2);
    }

    /* renamed from: a */
    private final boolean m6748a(View view, int i, int i2) {
        view.getDrawingRect(this.f9981b);
        offsetDescendantRectToMyCoords(view, this.f9981b);
        return this.f9981b.bottom + i >= getScrollY() && this.f9981b.top - i <= getScrollY() + i2;
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9987h = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            switch (motionEvent.getAction()) {
                case 8:
                    if (!this.f9989j) {
                        float axisValue = motionEvent.getAxisValue(9);
                        if (axisValue != 0.0f) {
                            if (this.f9979A == 0.0f) {
                                TypedValue typedValue = new TypedValue();
                                Context context = getContext();
                                if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                                    this.f9979A = typedValue.getDimension(context.getResources().getDisplayMetrics());
                                } else {
                                    throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                                }
                            }
                            float f = this.f9979A;
                            int a = m6763a();
                            int scrollY = getScrollY();
                            int i = scrollY - ((int) (axisValue * f));
                            if (i < 0) {
                                a = 0;
                            } else if (i <= a) {
                                a = i;
                            }
                            if (a != scrollY) {
                                super.scrollTo(getScrollX(), a);
                                return true;
                            }
                        }
                    }
                    break;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        int action = motionEvent.getAction();
        if (action == 2 && this.f9989j) {
            return true;
        }
        int x;
        switch (action & Illuminant.kOther) {
            case 0:
                action = (int) motionEvent.getY();
                x = (int) motionEvent.getX();
                if (getChildCount() > 0) {
                    int scrollY = getScrollY();
                    View childAt = getChildAt(0);
                    if (action < childAt.getTop() - scrollY) {
                        z = false;
                    } else if (action >= childAt.getBottom() - scrollY) {
                        z = false;
                    } else if (x < childAt.getLeft()) {
                        z = false;
                    } else if (x >= childAt.getRight()) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    this.f9989j = false;
                    m6759e();
                    break;
                }
                this.f9985f = action;
                this.f9996q = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker = this.f9990k;
                if (velocityTracker == null) {
                    this.f9990k = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.f9990k.addMovement(motionEvent);
                this.f9982c.computeScrollOffset();
                this.f9989j = this.f9982c.isFinished() ^ 1;
                m6753b(2, 0);
                break;
            case 1:
            case 3:
                this.f9989j = false;
                this.f9996q = -1;
                m6759e();
                if (this.f9982c.springBack(getScrollX(), getScrollY(), 0, 0, 0, m6763a())) {
                    jm.m4542A(this);
                }
                m6762g(0);
                break;
            case 2:
                action = this.f9996q;
                if (action != -1) {
                    x = motionEvent.findPointerIndex(action);
                    if (x != -1) {
                        action = (int) motionEvent.getY(x);
                        if (Math.abs(action - this.f9985f) > this.f9993n && (getNestedScrollAxes() & 2) == 0) {
                            this.f9989j = true;
                            this.f9985f = action;
                            m6757d();
                            this.f9990k.addMovement(motionEvent);
                            this.f9999t = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid pointerId=");
                    stringBuilder.append(action);
                    stringBuilder.append(" in onInterceptTouchEvent");
                    Log.e("NestedScrollView", stringBuilder.toString());
                    break;
                }
                break;
            case 6:
                m6743a(motionEvent);
                break;
        }
        return this.f9989j;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        super.onLayout(z, i, i2, i3, i4);
        this.f9986g = false;
        View view = this.f9988i;
        if (view != null && m6749a(view, (View) this)) {
            m6751b(this.f9988i);
        }
        this.f9988i = null;
        if (!this.f9987h) {
            if (this.f10001v != null) {
                scrollTo(getScrollX(), this.f10001v.f8781a);
                this.f10001v = null;
            }
            if (getChildCount() > 0) {
                view = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                i5 = layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            i5 = m6740a(scrollY, ((i4 - i2) - paddingTop) - paddingBottom, i5);
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f9987h = true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9991l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m6758d((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo136a(view, i, i2, iArr, 0);
    }

    /* renamed from: a */
    public final void mo136a(View view, int i, int i2, int[] iArr, int i3) {
        m6746a(i, i2, iArr, null, i3);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo135a(view, i, i2, i3, i4, 0);
    }

    /* renamed from: a */
    public final void mo135a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        m6745a(0, scrollY2, 0, i4 - scrollY2, null, i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo139b(view2, i, 0);
    }

    /* renamed from: b */
    public final void mo139b(View view, int i, int i2) {
        this.f10002y.f7876a = i;
        m6753b(2, i2);
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocus;
        if (i == 2) {
            i = ScriptIntrinsicBLAS.RsBlas_ctrsm;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocus == null || m6747a(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof lm) {
            lm lmVar = (lm) parcelable;
            super.onRestoreInstanceState(lmVar.getSuperState());
            this.f10001v = lmVar;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable lmVar = new lm(super.onSaveInstanceState());
        lmVar.f8781a = getScrollY();
        return lmVar;
    }

    /* renamed from: a */
    private final void m6743a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9996q) {
            if (actionIndex == 0) {
                actionIndex = 1;
            } else {
                actionIndex = 0;
            }
            this.f9985f = (int) motionEvent.getY(actionIndex);
            this.f9996q = motionEvent.getPointerId(actionIndex);
            VelocityTracker velocityTracker = this.f9990k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m6748a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f9981b);
            offsetDescendantRectToMyCoords(findFocus, this.f9981b);
            m6756c(m6741a(this.f9981b));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo137a(view, view2, i, 0);
    }

    /* renamed from: a */
    public final boolean mo137a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        mo138b(view, 0);
    }

    /* renamed from: b */
    public final void mo138b(View view, int i) {
        this.f10002y.f7876a = 0;
        m6762g(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        m6757d();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9999t = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f9999t);
        ViewParent parent;
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean isFinished = this.f9982c.isFinished() ^ 1;
                    this.f9989j = isFinished;
                    if (isFinished) {
                        parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.f9982c.isFinished()) {
                        this.f9982c.abortAnimation();
                    }
                    this.f9985f = (int) motionEvent.getY();
                    this.f9996q = motionEvent.getPointerId(0);
                    m6753b(2, 0);
                    break;
                }
                return false;
            case 1:
                velocityTracker = this.f9990k;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f9995p);
                actionMasked = (int) velocityTracker.getYVelocity(this.f9996q);
                if (Math.abs(actionMasked) > this.f9994o) {
                    m6758d(-actionMasked);
                } else if (this.f9982c.springBack(getScrollX(), getScrollY(), 0, 0, 0, m6763a())) {
                    jm.m4542A(this);
                }
                this.f9996q = -1;
                m6750b();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f9996q);
                if (findPointerIndex != -1) {
                    int i;
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f9985f - y;
                    if (m6746a(0, i2, this.f9998s, this.f9997r, 0)) {
                        i2 -= this.f9998s[1];
                        obtain.offsetLocation(0.0f, (float) this.f9997r[1]);
                        this.f9999t += this.f9997r[1];
                    }
                    if (this.f9989j) {
                        i = i2;
                    } else if (Math.abs(i2) > this.f9993n) {
                        parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f9989j = true;
                        if (i2 > 0) {
                            i = i2 - this.f9993n;
                        } else {
                            i = i2 + this.f9993n;
                        }
                    } else {
                        i = i2;
                    }
                    if (this.f9989j) {
                        Object obj;
                        this.f9985f = y - this.f9997r[1];
                        int scrollY = getScrollY();
                        int a = m6763a();
                        actionMasked = getOverScrollMode();
                        if (actionMasked == 0) {
                            obj = 1;
                        } else if (actionMasked != 1) {
                            obj = null;
                        } else if (a <= 0) {
                            obj = null;
                        } else {
                            int i3 = 1;
                        }
                        if (m6744a(i, 0, getScrollY(), a) && !m6761f(0)) {
                            this.f9990k.clear();
                        }
                        i2 = getScrollY() - scrollY;
                        if (!m6745a(0, i2, 0, i - i2, this.f9997r, 0)) {
                            if (obj != null) {
                                m6755c();
                                actionMasked = scrollY + i;
                                if (actionMasked < 0) {
                                    this.f9983d.onPull(((float) i) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                    if (!this.f9984e.isFinished()) {
                                        this.f9984e.onRelease();
                                    }
                                } else if (actionMasked > a) {
                                    this.f9984e.onPull(((float) i) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                    if (!this.f9983d.isFinished()) {
                                        this.f9983d.onRelease();
                                    }
                                }
                                EdgeEffect edgeEffect = this.f9983d;
                                if (!(edgeEffect == null || (edgeEffect.isFinished() && this.f9984e.isFinished()))) {
                                    jm.m4542A(this);
                                    break;
                                }
                            }
                        }
                        actionMasked = this.f9985f;
                        int i4 = this.f9997r[1];
                        this.f9985f = actionMasked - i4;
                        obtain.offsetLocation(0.0f, (float) i4);
                        this.f9999t += this.f9997r[1];
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid pointerId=");
                stringBuilder.append(this.f9996q);
                stringBuilder.append(" in onTouchEvent");
                Log.e("NestedScrollView", stringBuilder.toString());
                break;
                break;
            case 3:
                if (this.f9989j && getChildCount() > 0 && this.f9982c.springBack(getScrollX(), getScrollY(), 0, 0, 0, m6763a())) {
                    jm.m4542A(this);
                }
                this.f9996q = -1;
                m6750b();
                break;
            case 5:
                actionMasked = motionEvent.getActionIndex();
                this.f9985f = (int) motionEvent.getY(actionMasked);
                this.f9996q = motionEvent.getPointerId(actionMasked);
                break;
            case 6:
                m6743a(motionEvent);
                this.f9985f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f9996q));
                break;
        }
        velocityTracker = this.f9990k;
        if (velocityTracker != null) {
            velocityTracker.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: a */
    private final boolean m6744a(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i6 = i3 + i;
        if (i2 > 0) {
            i5 = 0;
            z = true;
        } else if (i2 < 0) {
            i5 = 0;
            z = true;
        } else {
            i5 = i2;
            z = false;
        }
        if (i6 > i4) {
            z2 = true;
            i6 = i4;
        } else if (i6 < 0) {
            z2 = true;
            i6 = 0;
        } else {
            z2 = false;
        }
        if (z2 && !m6761f(1)) {
            this.f9982c.springBack(i5, i6, 0, 0, 0, m6763a());
        }
        onOverScrolled(i5, i6, z, z2);
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final void m6759e() {
        VelocityTracker velocityTracker = this.f9990k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9990k = null;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (this.f9986g) {
            this.f9988i = view2;
        } else {
            m6751b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = m6741a(rect);
        if (a != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m6742a(0, a);
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m6759e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f9986g = true;
        super.requestLayout();
    }

    /* renamed from: b */
    private final boolean m6754b(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        if (i != 33) {
            Object obj = null;
        } else {
            int i5 = 1;
        }
        List focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        Object obj2 = null;
        int i6 = 0;
        while (i6 < size) {
            Object obj3;
            View view2;
            View view3 = (View) focusables.get(i6);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i2 >= bottom) {
                obj3 = obj2;
                view2 = view;
            } else if (top >= i3) {
                obj3 = obj2;
                view2 = view;
            } else {
                Object obj4;
                if (i2 >= top) {
                    obj4 = null;
                } else if (bottom < i3) {
                    obj4 = 1;
                } else {
                    obj4 = null;
                }
                if (view != null) {
                    Object obj5;
                    if (obj != null && top < view.getTop()) {
                        obj5 = 1;
                    } else if (i == 33) {
                        obj5 = null;
                    } else if (bottom <= view.getBottom()) {
                        obj5 = null;
                    } else {
                        obj5 = 1;
                    }
                    Object obj6;
                    if (obj2 != null) {
                        if (obj4 == null) {
                            obj3 = obj2;
                            view2 = view;
                        } else if (obj5 != null) {
                            obj6 = obj2;
                            view2 = view3;
                            obj3 = obj6;
                        } else {
                            obj3 = obj2;
                            view2 = view;
                        }
                    } else if (obj4 != null) {
                        view2 = view3;
                        height = 1;
                    } else if (obj5 != null) {
                        obj6 = obj2;
                        view2 = view3;
                        obj3 = obj6;
                    } else {
                        obj3 = obj2;
                        view2 = view;
                    }
                } else {
                    view2 = view3;
                    obj3 = obj4;
                }
            }
            i6++;
            view = view2;
            obj2 = obj3;
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            if (i != 33) {
                height = i3 - i4;
            } else {
                height = i2 - scrollY;
            }
            m6756c(height);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = childAt.getWidth();
            int i3 = layoutParams.leftMargin;
            int i4 = layoutParams.rightMargin;
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = childAt.getHeight();
            int i5 = layoutParams.topMargin;
            int i6 = layoutParams.bottomMargin;
            width = m6740a(i, (width - paddingLeft) - paddingRight, (width2 + i3) + i4);
            i6 = m6740a(i2, (height - paddingTop) - paddingBottom, i6 + (height2 + i5));
            if (width != getScrollX() || i6 != getScrollY()) {
                super.scrollTo(width, i6);
            }
        }
    }

    /* renamed from: b */
    private final void m6751b(View view) {
        view.getDrawingRect(this.f9981b);
        offsetDescendantRectToMyCoords(view, this.f9981b);
        int a = m6741a(this.f9981b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f10003z.m4481a(z);
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* renamed from: a */
    private final void m6742a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f9980a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight();
                int i3 = layoutParams.topMargin;
                int i4 = layoutParams.bottomMargin;
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int scrollY = getScrollY();
                i4 = Math.max(0, Math.min(scrollY + i2, Math.max(0, (i4 + (height + i3)) - ((height2 - paddingTop) - paddingBottom))));
                this.f10000u = getScrollY();
                this.f9982c.startScroll(getScrollX(), scrollY, 0, i4 - scrollY);
                jm.m4542A(this);
            } else {
                if (!this.f9982c.isFinished()) {
                    this.f9982c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f9980a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    public final void m6764a(int i) {
        m6742a(-getScrollX(), i - getScrollY());
    }

    public boolean startNestedScroll(int i) {
        return m6753b(i, 0);
    }

    /* renamed from: b */
    private final boolean m6753b(int i, int i2) {
        return this.f10003z.m4485a(i, i2);
    }

    public void stopNestedScroll() {
        m6762g(0);
    }

    /* renamed from: g */
    private final void m6762g(int i) {
        this.f10003z.m4488b(i);
    }
}

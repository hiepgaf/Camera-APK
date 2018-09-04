package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.app.NotificationCompat.WearableExtender;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: kz */
public class kz extends ViewGroup {
    /* renamed from: a */
    public static final int[] f8743a = new int[]{16842931};
    /* renamed from: b */
    public static final boolean f8744b = true;
    /* renamed from: k */
    private static final int[] f8745k = new int[]{16843828};
    /* renamed from: l */
    private static final boolean f8746l = true;
    /* renamed from: A */
    private float f8747A;
    /* renamed from: B */
    private Drawable f8748B;
    /* renamed from: C */
    private final ArrayList f8749C;
    /* renamed from: D */
    private Rect f8750D;
    /* renamed from: E */
    private Matrix f8751E;
    /* renamed from: c */
    public int f8752c;
    /* renamed from: d */
    public final lo f8753d;
    /* renamed from: e */
    public final lo f8754e;
    /* renamed from: f */
    public int f8755f;
    /* renamed from: g */
    public boolean f8756g;
    /* renamed from: h */
    public List f8757h;
    /* renamed from: i */
    public Object f8758i;
    /* renamed from: j */
    public boolean f8759j;
    /* renamed from: m */
    private final lc f8760m;
    /* renamed from: n */
    private float f8761n;
    /* renamed from: o */
    private int f8762o;
    /* renamed from: p */
    private float f8763p;
    /* renamed from: q */
    private Paint f8764q;
    /* renamed from: r */
    private final lh f8765r;
    /* renamed from: s */
    private final lh f8766s;
    /* renamed from: t */
    private boolean f8767t;
    /* renamed from: u */
    private boolean f8768u;
    /* renamed from: v */
    private int f8769v;
    /* renamed from: w */
    private int f8770w;
    /* renamed from: x */
    private int f8771x;
    /* renamed from: y */
    private int f8772y;
    /* renamed from: z */
    private float f8773z;

    public kz(Context context) {
        this(context, null);
    }

    public kz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public kz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8760m = new lc();
        this.f8752c = -1728053248;
        this.f8764q = new Paint();
        this.f8768u = true;
        this.f8769v = 3;
        this.f8770w = 3;
        this.f8771x = 3;
        this.f8772y = 3;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f8762o = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f8765r = new lh(this, 3);
        this.f8766s = new lh(this, 5);
        this.f8753d = lo.m5512a((ViewGroup) this, this.f8765r);
        lo loVar = this.f8753d;
        loVar.f8791i = 1;
        loVar.f8789g = f2;
        this.f8765r.f19338b = loVar;
        this.f8754e = lo.m5512a((ViewGroup) this, this.f8766s);
        loVar = this.f8754e;
        loVar.f8791i = 2;
        loVar.f8789g = f2;
        this.f8766s.f19338b = loVar;
        setFocusableInTouchMode(true);
        jm.m4568c(this, 1);
        jm.m4559a((View) this, new lb(this));
        setMotionEventSplittingEnabled(false);
        if (jm.m4573g(this)) {
            setOnApplyWindowInsetsListener(new la());
            setSystemUiVisibility(DepthmapTask.DEPTH_PROCESSING_LATTICE_HR_MAX_SIZE_PX);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f8745k);
            try {
                this.f8748B = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f8761n = f * 10.0f;
        this.f8749C = new ArrayList();
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        int i3 = 0;
        if (getDescendantFocusability() != 393216) {
            int i4;
            int childCount = getChildCount();
            int i5 = 0;
            for (i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!kz.m5488f(childAt)) {
                    this.f8749C.add(childAt);
                } else if (kz.m5491i(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    i5 = 1;
                }
            }
            if (i5 == 0) {
                i4 = this.f8749C.size();
                while (i3 < i4) {
                    View view = (View) this.f8749C.get(i3);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                    i3++;
                }
            }
            this.f8749C.clear();
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m5486e() != null || kz.m5488f(view)) {
            jm.m4568c(view, 4);
        } else {
            jm.m4568c(view, 1);
        }
        if (!f8744b) {
            jm.m4559a(view, this.f8760m);
        }
    }

    /* renamed from: a */
    final boolean m5498a(View view, int i) {
        return (m5502c(view) & i) == i;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof le) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void m5495a(View view) {
        if (kz.m5488f(view)) {
            le leVar = (le) view.getLayoutParams();
            if (this.f8768u) {
                leVar.f8775b = 0.0f;
                leVar.f8777d = 0;
            } else {
                leVar.f8777d |= 4;
                if (m5498a(view, 3)) {
                    this.f8753d.m5531a(view, -view.getWidth(), view.getTop());
                } else {
                    this.f8754e.m5531a(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void m5494a() {
        View a = m5493a(8388611);
        if (a == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No drawer view found with gravity ");
            stringBuilder.append(kz.m5484c(8388611));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        m5495a(a);
    }

    /* renamed from: a */
    private final void m5483a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            le leVar = (le) childAt.getLayoutParams();
            if (kz.m5488f(childAt) && (!z || leVar.f8776c)) {
                int width = childAt.getWidth();
                if (m5498a(childAt, 3)) {
                    i |= this.f8753d.m5531a(childAt, -width, childAt.getTop());
                } else {
                    i |= this.f8754e.m5531a(childAt, getWidth(), childAt.getTop());
                }
                leVar.f8776c = false;
            }
        }
        this.f8765r.m14042d();
        this.f8766s.m14042d();
        if (i != 0) {
            invalidate();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((le) getChildAt(i).getLayoutParams()).f8775b);
        }
        this.f8763p = f;
        boolean b = this.f8753d.m5533b();
        boolean b2 = this.f8754e.m5533b();
        if (b || b2) {
            jm.m4542A(this);
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f8763p <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (this.f8750D == null) {
                    this.f8750D = new Rect();
                }
                childAt.getHitRect(this.f8750D);
                if (this.f8750D.contains((int) x, (int) y) && !kz.m5490h(childAt)) {
                    boolean dispatchGenericMotionEvent;
                    if (childAt.getMatrix().isIdentity()) {
                        float scrollX = (float) (getScrollX() - childAt.getLeft());
                        float scrollY = (float) (getScrollY() - childAt.getTop());
                        motionEvent.offsetLocation(scrollX, scrollY);
                        dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                        motionEvent.offsetLocation(-scrollX, -scrollY);
                    } else {
                        int scrollX2 = getScrollX();
                        int left = childAt.getLeft();
                        int scrollY2 = getScrollY();
                        int top = childAt.getTop();
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation((float) (scrollX2 - left), (float) (scrollY2 - top));
                        Matrix matrix = childAt.getMatrix();
                        if (!matrix.isIdentity()) {
                            if (this.f8751E == null) {
                                this.f8751E = new Matrix();
                            }
                            matrix.invert(this.f8751E);
                            obtain.transform(this.f8751E);
                        }
                        dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                        obtain.recycle();
                    }
                    if (dispatchGenericMotionEvent) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        int height = getHeight();
        boolean h = kz.m5490h(view);
        int width = getWidth();
        int save = canvas.save();
        if (h) {
            int childCount = getChildCount();
            i = 0;
            i2 = 0;
            while (i2 < childCount) {
                int i3;
                View childAt = getChildAt(i2);
                if (childAt == view) {
                    i3 = i;
                } else if (childAt.getVisibility() != 0) {
                    i3 = i;
                } else {
                    Object obj;
                    Drawable background = childAt.getBackground();
                    if (background == null) {
                        obj = null;
                    } else if (background.getOpacity() == -1) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        i3 = i;
                    } else if (!kz.m5488f(childAt)) {
                        i3 = i;
                    } else if (childAt.getHeight() < height) {
                        i3 = i;
                    } else if (m5498a(childAt, 3)) {
                        i3 = childAt.getRight();
                        if (i3 <= i) {
                            i3 = i;
                        }
                    } else {
                        i3 = childAt.getLeft();
                        if (i3 >= width) {
                            i3 = i;
                        } else {
                            width = i3;
                            i3 = i;
                        }
                    }
                }
                i2++;
                i = i3;
            }
            canvas.clipRect(i, 0, width, getHeight());
        } else {
            i = 0;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f8763p;
        if (f > 0.0f && h) {
            i2 = this.f8752c;
            this.f8764q.setColor((((int) (f * ((float) ((-16777216 & i2) >>> 24)))) << 24) | (i2 & 16777215));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f8764q);
        }
        return drawChild;
    }

    /* renamed from: a */
    public final View m5493a(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, jm.m4576j(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m5502c(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: e */
    private final View m5486e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((le) childAt.getLayoutParams()).f8777d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    final View m5500b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (kz.m5488f(childAt) && kz.m5489g(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new le();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new le(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof le) {
            return new le((le) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new le((MarginLayoutParams) layoutParams) : new le(layoutParams);
    }

    /* renamed from: b */
    public final int m5499b(View view) {
        if (kz.m5488f(view)) {
            int i = ((le) view.getLayoutParams()).f8774a;
            int j = jm.m4576j(this);
            switch (i) {
                case 3:
                    i = this.f8769v;
                    if (i != 3) {
                        return i;
                    }
                    if (j != 0) {
                        i = this.f8772y;
                    } else {
                        i = this.f8771x;
                    }
                    if (i != 3) {
                        return i;
                    }
                    break;
                case 5:
                    i = this.f8770w;
                    if (i != 3) {
                        return i;
                    }
                    if (j != 0) {
                        i = this.f8771x;
                    } else {
                        i = this.f8772y;
                    }
                    if (i != 3) {
                        return i;
                    }
                    break;
                case 8388611:
                    i = this.f8771x;
                    if (i != 3) {
                        return i;
                    }
                    if (j != 0) {
                        i = this.f8770w;
                    } else {
                        i = this.f8769v;
                    }
                    if (i != 3) {
                        return i;
                    }
                    break;
                case WearableExtender.DEFAULT_CONTENT_ICON_GRAVITY /*8388613*/:
                    i = this.f8772y;
                    if (i != 3) {
                        return i;
                    }
                    if (j != 0) {
                        i = this.f8769v;
                    } else {
                        i = this.f8770w;
                    }
                    if (i != 3) {
                        return i;
                    }
                    break;
            }
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: c */
    final int m5502c(View view) {
        return Gravity.getAbsoluteGravity(((le) view.getLayoutParams()).f8774a, jm.m4576j(this));
    }

    /* renamed from: d */
    static float m5485d(View view) {
        return ((le) view.getLayoutParams()).f8775b;
    }

    /* renamed from: c */
    private static String m5484c(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    /* renamed from: e */
    static boolean m5487e(View view) {
        return (jm.m4574h(view) == 4 || jm.m4574h(view) == 2) ? false : true;
    }

    /* renamed from: h */
    private static boolean m5490h(View view) {
        return ((le) view.getLayoutParams()).f8774a == 0;
    }

    /* renamed from: i */
    private static boolean m5491i(View view) {
        if (kz.m5488f(view)) {
            return ((le) view.getLayoutParams()).f8777d & 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: c */
    public final boolean m5503c() {
        View a = m5493a(8388611);
        return a != null ? kz.m5491i(a) : false;
    }

    /* renamed from: f */
    static boolean m5488f(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((le) view.getLayoutParams()).f8774a, jm.m4576j(view));
        if ((absoluteGravity & 3) != 0) {
            return true;
        }
        if ((absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m5489g(View view) {
        if (kz.m5488f(view)) {
            return ((le) view.getLayoutParams()).f8775b > 0.0f;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View ");
            stringBuilder.append(view);
            stringBuilder.append(" is not a drawer");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8768u = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8768u = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8759j && this.f8748B != null) {
            int systemWindowInsetTop;
            Object obj = this.f8758i;
            if (obj != null) {
                systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.f8748B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f8748B.draw(canvas);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r1 = 1;
        r2 = 0;
        r0 = r10.getActionMasked();
        r3 = r9.f8753d;
        r3 = r3.m5535b(r10);
        r4 = r9.f8754e;
        r4 = r4.m5535b(r10);
        r4 = r4 | r3;
        switch(r0) {
            case 0: goto L_0x0040;
            case 1: goto L_0x00b8;
            case 2: goto L_0x006d;
            case 3: goto L_0x00b8;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r4 != 0) goto L_0x003e;
    L_0x0019:
        if (r0 != 0) goto L_0x003e;
    L_0x001b:
        r4 = r9.getChildCount();
        r3 = r2;
    L_0x0020:
        if (r3 >= r4) goto L_0x003c;
    L_0x0022:
        r0 = r9.getChildAt(r3);
        r0 = r0.getLayoutParams();
        r0 = (p000.le) r0;
        r0 = r0.f8776c;
        if (r0 != 0) goto L_0x0034;
    L_0x0030:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0020;
    L_0x0034:
        r0 = r1;
    L_0x0035:
        if (r0 != 0) goto L_0x003e;
    L_0x0037:
        r0 = r9.f8756g;
        if (r0 != 0) goto L_0x003e;
    L_0x003b:
        return r2;
    L_0x003c:
        r0 = r2;
        goto L_0x0035;
    L_0x003e:
        r2 = r1;
        goto L_0x003b;
    L_0x0040:
        r0 = r10.getX();
        r3 = r10.getY();
        r9.f8773z = r0;
        r9.f8747A = r3;
        r5 = r9.f8763p;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x006b;
    L_0x0053:
        r5 = r9.f8753d;
        r0 = (int) r0;
        r3 = (int) r3;
        r0 = r5.m5526a(r0, r3);
        if (r0 == 0) goto L_0x0069;
    L_0x005d:
        r0 = p000.kz.m5490h(r0);
        if (r0 == 0) goto L_0x0067;
    L_0x0063:
        r0 = r1;
    L_0x0064:
        r9.f8756g = r2;
        goto L_0x0017;
    L_0x0067:
        r0 = r2;
        goto L_0x0064;
    L_0x0069:
        r0 = r2;
        goto L_0x0064;
    L_0x006b:
        r0 = r2;
        goto L_0x0064;
    L_0x006d:
        r5 = r9.f8753d;
        r0 = r5.f8785c;
        r6 = r0.length;
        r3 = r2;
    L_0x0073:
        if (r3 >= r6) goto L_0x00b6;
    L_0x0075:
        r0 = r5.m5530a(r3);
        if (r0 == 0) goto L_0x00b4;
    L_0x007b:
        r0 = r5.f8787e;
        r0 = r0[r3];
        r7 = r5.f8785c;
        r7 = r7[r3];
        r0 = r0 - r7;
        r7 = r5.f8788f;
        r7 = r7[r3];
        r8 = r5.f8786d;
        r8 = r8[r3];
        r7 = r7 - r8;
        r8 = r5.f8784b;
        r0 = r0 * r0;
        r7 = r7 * r7;
        r0 = r0 + r7;
        r7 = r8 * r8;
        r7 = (float) r7;
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 <= 0) goto L_0x00b2;
    L_0x0099:
        r0 = r1;
    L_0x009a:
        if (r0 != 0) goto L_0x00a0;
    L_0x009c:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0073;
    L_0x00a0:
        r0 = r1;
    L_0x00a1:
        if (r0 == 0) goto L_0x00af;
    L_0x00a3:
        r0 = r9.f8765r;
        r0.m14042d();
        r0 = r9.f8766s;
        r0.m14042d();
        goto L_0x0016;
    L_0x00af:
        r0 = r2;
        goto L_0x0017;
    L_0x00b2:
        r0 = r2;
        goto L_0x009a;
    L_0x00b4:
        r0 = r2;
        goto L_0x009a;
    L_0x00b6:
        r0 = r2;
        goto L_0x00a1;
    L_0x00b8:
        r9.m5483a(r1);
        r9.f8756g = r2;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: kz.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || m5500b() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View b = m5500b();
        if (b != null && m5499b(b) == 0) {
            m5483a(false);
        }
        if (b != null) {
            return true;
        }
        return false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f8767t = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                le leVar = (le) childAt.getLayoutParams();
                if (kz.m5490h(childAt)) {
                    childAt.layout(leVar.leftMargin, leVar.topMargin, leVar.leftMargin + childAt.getMeasuredWidth(), leVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    float f;
                    int i7;
                    int i8;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m5498a(childAt, 3)) {
                        f = (float) measuredWidth;
                        i7 = (-measuredWidth) + ((int) (leVar.f8775b * f));
                        f = ((float) (measuredWidth + i7)) / f;
                    } else {
                        f = (float) measuredWidth;
                        i7 = i5 - ((int) (leVar.f8775b * f));
                        f = ((float) (i5 - i7)) / f;
                    }
                    float f2 = leVar.f8775b;
                    int i9;
                    switch (leVar.f8774a & 112) {
                        case 16:
                            int i10 = i4 - i2;
                            i9 = (i10 - measuredHeight) / 2;
                            if (i9 < leVar.topMargin) {
                                i9 = leVar.topMargin;
                            } else if (i9 + measuredHeight > i10 - leVar.bottomMargin) {
                                i9 = (i10 - leVar.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i7, i9, measuredWidth + i7, measuredHeight + i9);
                            break;
                        case 80:
                            i9 = i4 - i2;
                            childAt.layout(i7, (i9 - leVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i9 - leVar.bottomMargin);
                            break;
                        default:
                            childAt.layout(i7, leVar.topMargin, measuredWidth + i7, measuredHeight + leVar.topMargin);
                            break;
                    }
                    if (f != f2) {
                        m5496a(childAt, f);
                    }
                    if (leVar.f8775b > 0.0f) {
                        i8 = 0;
                    } else {
                        i8 = 4;
                    }
                    if (childAt.getVisibility() != i8) {
                        childAt.setVisibility(i8);
                    }
                }
            }
        }
        this.f8767t = false;
        this.f8768u = false;
    }

    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            mode = size;
            mode2 = size2;
        } else if (isInEditMode()) {
            if (mode != kvl.UNSET_ENUM_VALUE && mode == 0) {
                size = VideoProviderSource.TIMESTAMP_FILTER_SIZE;
            }
            if (mode2 == kvl.UNSET_ENUM_VALUE) {
                mode = size;
                mode2 = size2;
            } else if (mode2 == 0) {
                mode = size;
                mode2 = VideoProviderSource.TIMESTAMP_FILTER_SIZE;
            } else {
                mode = size;
                mode2 = size2;
            }
        } else {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
        setMeasuredDimension(mode, mode2);
        Object obj = this.f8758i != null ? jm.m4573g(this) ? 1 : null : null;
        int j = jm.m4576j(this);
        int childCount = getChildCount();
        Object obj2 = null;
        Object obj3 = null;
        int i3 = 0;
        while (i3 < childCount) {
            Object obj4;
            Object obj5;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 8) {
                obj4 = obj3;
                obj5 = obj2;
            } else {
                int absoluteGravity;
                le leVar = (le) childAt.getLayoutParams();
                if (obj != null) {
                    absoluteGravity = Gravity.getAbsoluteGravity(leVar.f8774a, j);
                    WindowInsets windowInsets;
                    if (jm.m4573g(childAt)) {
                        windowInsets = (WindowInsets) this.f8758i;
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        windowInsets = (WindowInsets) this.f8758i;
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        leVar.leftMargin = windowInsets.getSystemWindowInsetLeft();
                        leVar.topMargin = windowInsets.getSystemWindowInsetTop();
                        leVar.rightMargin = windowInsets.getSystemWindowInsetRight();
                        leVar.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (kz.m5490h(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((mode - leVar.leftMargin) - leVar.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((mode2 - leVar.topMargin) - leVar.bottomMargin, 1073741824));
                    obj4 = obj3;
                    obj5 = obj2;
                } else if (kz.m5488f(childAt)) {
                    if (f8746l) {
                        float f = jm.m4572f(childAt);
                        float f2 = this.f8761n;
                        if (f != f2) {
                            jm.m4549a(childAt, f2);
                        }
                    }
                    absoluteGravity = m5502c(childAt) & 7;
                    if (absoluteGravity == 3) {
                        if (obj2 != null) {
                            r2 = new StringBuilder();
                            r2.append("Child drawer has absolute gravity ");
                            r2.append(kz.m5484c(absoluteGravity));
                            r2.append(" but this ");
                            r2.append("DrawerLayout");
                            r2.append(" already has a ");
                            r2.append("drawer view along that edge");
                            throw new IllegalStateException(r2.toString());
                        }
                    }
                    if (absoluteGravity == 3 || obj3 == null) {
                        if (absoluteGravity != 3) {
                            obj5 = 1;
                        } else {
                            obj5 = obj3;
                        }
                        if (absoluteGravity == 3) {
                            obj3 = 1;
                        } else {
                            obj3 = obj2;
                        }
                        childAt.measure(kz.getChildMeasureSpec(i, (this.f8762o + leVar.leftMargin) + leVar.rightMargin, leVar.width), kz.getChildMeasureSpec(i2, leVar.topMargin + leVar.bottomMargin, leVar.height));
                        obj4 = obj5;
                        obj5 = obj3;
                    } else {
                        r2 = new StringBuilder();
                        r2.append("Child drawer has absolute gravity ");
                        r2.append(kz.m5484c(absoluteGravity));
                        r2.append(" but this ");
                        r2.append("DrawerLayout");
                        r2.append(" already has a ");
                        r2.append("drawer view along that edge");
                        throw new IllegalStateException(r2.toString());
                    }
                } else {
                    r2 = new StringBuilder();
                    r2.append("Child ");
                    r2.append(childAt);
                    r2.append(" at index ");
                    r2.append(i3);
                    r2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    r2.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(r2.toString());
                }
            }
            i3++;
            obj2 = obj5;
            obj3 = obj4;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof lf) {
            lf lfVar = (lf) parcelable;
            super.onRestoreInstanceState(lfVar.f7631e);
            int i = lfVar.f19332a;
            if (i != 0) {
                View a = m5493a(i);
                if (a != null) {
                    m5492j(a);
                }
            }
            i = lfVar.f19333b;
            if (i != 3) {
                m5482a(i, 3);
            }
            i = lfVar.f19334c;
            if (i != 3) {
                m5482a(i, 5);
            }
            i = lfVar.f19335f;
            if (i != 3) {
                m5482a(i, 8388611);
            }
            i = lfVar.f19336g;
            if (i != 3) {
                m5482a(i, (int) WearableExtender.DEFAULT_CONTENT_ICON_GRAVITY);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        if (!f8746l) {
            jm.m4576j(this);
            jm.m4576j(this);
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable lfVar = new lf(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            le leVar = (le) getChildAt(i).getLayoutParams();
            int i2 = leVar.f8777d;
            if (i2 == 1 || i2 == 2) {
                lfVar.f19332a = leVar.f8774a;
                break;
            }
        }
        lfVar.f19333b = this.f8769v;
        lfVar.f19334c = this.f8770w;
        lfVar.f19335f = this.f8771x;
        lfVar.f19336g = this.f8772y;
        return lfVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        this.f8753d.m5528a(motionEvent);
        this.f8754e.m5528a(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & Illuminant.kOther) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f8773z = x;
                this.f8747A = y;
                this.f8756g = false;
                break;
            case 1:
                x = motionEvent.getX();
                y = motionEvent.getY();
                View a = this.f8753d.m5526a((int) x, (int) y);
                if (a == null) {
                    z = true;
                } else if (kz.m5490h(a)) {
                    x -= this.f8773z;
                    y -= this.f8747A;
                    int i = this.f8753d.f8784b;
                    if ((x * x) + (y * y) < ((float) (i * i))) {
                        View e = m5486e();
                        if (e == null) {
                            z = true;
                        } else if (m5499b(e) == 2) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                m5483a(z);
                break;
            case 3:
                m5483a(true);
                this.f8756g = false;
                break;
        }
        return true;
    }

    /* renamed from: j */
    private final void m5492j(View view) {
        if (kz.m5488f(view)) {
            le leVar = (le) view.getLayoutParams();
            if (this.f8768u) {
                leVar.f8775b = 1.0f;
                leVar.f8777d = 1;
                m5497a(view, true);
            } else {
                leVar.f8777d |= 2;
                if (m5498a(view, 3)) {
                    this.f8753d.m5531a(view, 0, view.getTop());
                } else {
                    this.f8754e.m5531a(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: d */
    public final void m5504d() {
        View a = m5493a(8388611);
        if (a == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No drawer view found with gravity ");
            stringBuilder.append(kz.m5484c(8388611));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        m5492j(a);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m5483a(true);
        }
    }

    public void requestLayout() {
        if (!this.f8767t) {
            super.requestLayout();
        }
    }

    /* renamed from: b */
    public final void m5501b(int i) {
        m5482a(i, 3);
        m5482a(i, 5);
    }

    /* renamed from: a */
    private final void m5482a(int i, int i2) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, jm.m4576j(this));
        switch (i2) {
            case 3:
                this.f8769v = i;
                break;
            case 5:
                this.f8770w = i;
                break;
            case 8388611:
                this.f8771x = i;
                break;
            case WearableExtender.DEFAULT_CONTENT_ICON_GRAVITY /*8388613*/:
                this.f8772y = i;
                break;
        }
        if (i != 0) {
            lo loVar;
            if (absoluteGravity != 3) {
                loVar = this.f8754e;
            } else {
                loVar = this.f8753d;
            }
            loVar.m5527a();
        }
        View a;
        switch (i) {
            case 1:
                a = m5493a(absoluteGravity);
                if (a != null) {
                    m5495a(a);
                    return;
                }
                return;
            case 2:
                a = m5493a(absoluteGravity);
                if (a != null) {
                    m5492j(a);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    final void m5496a(View view, float f) {
        le leVar = (le) view.getLayoutParams();
        if (f != leVar.f8775b) {
            leVar.f8775b = f;
            List list = this.f8757h;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((ld) this.f8757h.get(size)).onDrawerSlide(view, f);
                }
            }
        }
    }

    /* renamed from: a */
    final void m5497a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || kz.m5488f(childAt)) && !(z && childAt == view)) {
                jm.m4568c(childAt, 4);
            } else {
                jm.m4568c(childAt, 1);
            }
        }
    }
}

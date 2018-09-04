package android.support.v4.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000.jl;
import p000.jm;
import p000.jp;
import p000.jq;
import p000.jr;
import p000.js;
import p000.jt;
import p000.ju;
import p000.jv;
import p000.jw;
import p000.jx;
import p000.jy;
import p000.jz;
import p000.ka;
import p000.kc;
import p000.kvl;

/* compiled from: PG */
public class ViewPager extends ViewGroup {
    /* renamed from: V */
    private static final kc f556V = new kc();
    /* renamed from: a */
    public static final int[] f557a = new int[]{16842931};
    /* renamed from: l */
    private static final Comparator f558l = new jp();
    /* renamed from: m */
    private static final Interpolator f559m = new jq();
    /* renamed from: A */
    private int f560A;
    /* renamed from: B */
    private int f561B;
    /* renamed from: C */
    private float f562C;
    /* renamed from: D */
    private float f563D;
    /* renamed from: E */
    private float f564E;
    /* renamed from: F */
    private float f565F;
    /* renamed from: G */
    private int f566G = -1;
    /* renamed from: H */
    private VelocityTracker f567H;
    /* renamed from: I */
    private int f568I;
    /* renamed from: J */
    private int f569J;
    /* renamed from: K */
    private int f570K;
    /* renamed from: L */
    private int f571L;
    /* renamed from: M */
    private EdgeEffect f572M;
    /* renamed from: N */
    private EdgeEffect f573N;
    /* renamed from: O */
    private boolean f574O;
    /* renamed from: P */
    private int f575P;
    /* renamed from: Q */
    private List f576Q;
    /* renamed from: R */
    private jy f577R;
    /* renamed from: S */
    private int f578S;
    /* renamed from: T */
    private int f579T;
    /* renamed from: U */
    private ArrayList f580U;
    /* renamed from: W */
    private final Runnable f581W = new jr(this);
    private int aa = 0;
    /* renamed from: b */
    public int f582b;
    /* renamed from: c */
    public final ArrayList f583c = new ArrayList();
    /* renamed from: d */
    public jl f584d;
    /* renamed from: e */
    public int f585e;
    /* renamed from: f */
    public int f586f = -1;
    /* renamed from: g */
    public Parcelable f587g = null;
    /* renamed from: h */
    public ClassLoader f588h = null;
    /* renamed from: i */
    public jz f589i;
    /* renamed from: j */
    public boolean f590j;
    /* renamed from: k */
    public boolean f591k = true;
    /* renamed from: n */
    private final ju f592n = new ju();
    /* renamed from: o */
    private final Rect f593o = new Rect();
    /* renamed from: p */
    private Scroller f594p;
    /* renamed from: q */
    private boolean f595q;
    /* renamed from: r */
    private float f596r = -3.4028235E38f;
    /* renamed from: s */
    private float f597s = Float.MAX_VALUE;
    /* renamed from: t */
    private int f598t;
    /* renamed from: u */
    private boolean f599u;
    /* renamed from: v */
    private boolean f600v;
    /* renamed from: w */
    private int f601w = 1;
    /* renamed from: x */
    private boolean f602x;
    /* renamed from: y */
    private boolean f603y;
    /* renamed from: z */
    private int f604z;

    public ViewPager(Context context) {
        super(context);
        m391f();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m391f();
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    ju a = m377a(childAt);
                    if (a != null && a.f7980b == this.f585e) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    /* renamed from: a */
    private final ju m376a(int i, int i2) {
        ju juVar = new ju();
        juVar.f7980b = i;
        juVar.f7979a = this.f584d.instantiateItem((ViewGroup) this, i);
        juVar.f7982d = this.f584d.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f583c.size()) {
            this.f583c.add(juVar);
        } else {
            this.f583c.add(i2, juVar);
        }
        return juVar;
    }

    /* renamed from: a */
    public final void m403a(jx jxVar) {
        if (this.f576Q == null) {
            this.f576Q = new ArrayList();
        }
        this.f576Q.add(jxVar);
    }

    public void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                ju a = m377a(childAt);
                if (a != null && a.f7980b == this.f585e) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        int i2;
        if (checkLayoutParams(layoutParams)) {
            layoutParams2 = layoutParams;
        } else {
            layoutParams2 = generateLayoutParams(layoutParams);
        }
        jv jvVar = (jv) layoutParams2;
        boolean z = jvVar.f7994a;
        if (view.getClass().getAnnotation(jt.class) != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        jvVar.f7994a = i2 | z;
        if (!this.f599u) {
            super.addView(view, i, layoutParams2);
        } else if (jvVar == null || !jvVar.f7994a) {
            jvVar.f7997d = true;
            addViewInLayout(view, i, layoutParams2);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: c */
    private final boolean m386c(int i) {
        View view;
        boolean h;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else if (findFocus != null) {
            Object obj;
            for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    stringBuilder.append(" => ");
                    stringBuilder.append(parent2.getClass().getSimpleName());
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("arrowScroll tried to find focus based on non-child current focused view ");
                stringBuilder2.append(stringBuilder.toString());
                Log.e("ViewPager", stringBuilder2.toString());
                view = null;
            } else {
                view = findFocus;
            }
        } else {
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            h = (i == 17 || i == 1) ? m393h() : (i == 66 || i == 2) ? m394i() : false;
        } else if (i == 17) {
            h = (view == null || m375a(this.f593o, findNextFocus).left < m375a(this.f593o, view).left) ? findNextFocus.requestFocus() : m393h();
        } else if (i != 66) {
            h = false;
        } else {
            h = (view == null || m375a(this.f593o, findNextFocus).left > m375a(this.f593o, view).left) ? findNextFocus.requestFocus() : m394i();
        }
        if (h) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return h;
    }

    /* renamed from: a */
    private final boolean m383a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (m383a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f584d == null) {
            return false;
        }
        int d = m387d();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) d) * this.f596r))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) d) * this.f597s))) {
            return false;
        } else {
            return true;
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof jv) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final void m381a(boolean z) {
        boolean z2;
        int scrollX;
        if (this.aa == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            m384b(false);
            if ((this.f594p.isFinished() ^ 1) != 0) {
                this.f594p.abortAnimation();
                scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f594p.getCurrX();
                int currY = this.f594p.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m395j();
                    }
                }
            }
        }
        this.f590j = false;
        boolean z3 = z2;
        for (scrollX = 0; scrollX < this.f583c.size(); scrollX++) {
            ju juVar = (ju) this.f583c.get(scrollX);
            if (juVar.f7981c) {
                juVar.f7981c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            jm.m4556a((View) this, this.f581W);
        } else {
            this.f581W.run();
        }
    }

    public void computeScroll() {
        this.f595q = true;
        if (this.f594p.isFinished() || !this.f594p.computeScrollOffset()) {
            m381a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f594p.getCurrX();
        int currY = this.f594p.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m395j()) {
                this.f594p.abortAnimation();
                scrollTo(0, currY);
            }
        }
        jm.m4542A(this);
    }

    /* renamed from: a */
    public final void m399a() {
        boolean z;
        int count = this.f584d.getCount();
        this.f582b = count;
        int size = this.f583c.size();
        int i = this.f601w;
        if (size >= (i + i) + 1) {
            z = false;
        } else if (this.f583c.size() < count) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = false;
        int i2 = this.f585e;
        boolean z3 = z;
        i = 0;
        while (i < this.f583c.size()) {
            boolean z4;
            int i3;
            boolean z5;
            ju juVar = (ju) this.f583c.get(i);
            int itemPosition = this.f584d.getItemPosition(juVar.f7979a);
            if (itemPosition == -1) {
                size = i;
                z4 = z2;
                i3 = i2;
                z5 = z3;
            } else if (itemPosition == -2) {
                this.f583c.remove(i);
                i--;
                if (!z2) {
                    this.f584d.startUpdate((ViewGroup) this);
                    z2 = true;
                }
                this.f584d.destroyItem((ViewGroup) this, juVar.f7980b, juVar.f7979a);
                int i4 = this.f585e;
                if (i4 == juVar.f7980b) {
                    size = i;
                    z4 = z2;
                    i3 = Math.max(0, Math.min(i4, count - 1));
                    z5 = true;
                } else {
                    size = i;
                    z4 = z2;
                    i3 = i2;
                    z5 = true;
                }
            } else {
                int i5 = juVar.f7980b;
                if (i5 != itemPosition) {
                    if (i5 == this.f585e) {
                        i2 = itemPosition;
                    }
                    juVar.f7980b = itemPosition;
                    size = i;
                    z4 = z2;
                    i3 = i2;
                    z5 = true;
                } else {
                    size = i;
                    z4 = z2;
                    i3 = i2;
                    z5 = z3;
                }
            }
            z3 = z5;
            i2 = i3;
            z2 = z4;
            i = size + 1;
        }
        if (z2) {
            this.f584d.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f583c, f558l);
        if (z3) {
            i3 = getChildCount();
            for (i = 0; i < i3; i++) {
                jv jvVar = (jv) getChildAt(i).getLayoutParams();
                if (!jvVar.f7994a) {
                    jvVar.f7996c = 0.0f;
                }
            }
            m402a(i2, false, true);
            requestLayout();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            boolean c;
            if (keyEvent.getAction() == 0) {
                switch (keyEvent.getKeyCode()) {
                    case 21:
                        if (!keyEvent.hasModifiers(2)) {
                            c = m386c(17);
                            break;
                        }
                        c = m393h();
                        break;
                    case 22:
                        if (!keyEvent.hasModifiers(2)) {
                            c = m386c(66);
                            break;
                        }
                        c = m394i();
                        break;
                    case 61:
                        if (!keyEvent.hasNoModifiers()) {
                            if (!keyEvent.hasModifiers(1)) {
                                c = false;
                                break;
                            }
                            c = m386c(1);
                            break;
                        }
                        c = m386c(2);
                        break;
                    default:
                        c = false;
                        break;
                }
            }
            c = false;
            if (!c) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private final void m385c() {
        List list = this.f576Q;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jx jxVar = (jx) this.f576Q.get(i);
                if (jxVar != null) {
                    jxVar.mo724b();
                }
            }
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                ju a = m377a(childAt);
                if (a != null && a.f7980b == this.f585e && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r10) {
        /*
        r9 = this;
        r2 = 1;
        r0 = 0;
        super.draw(r10);
        r1 = r9.getOverScrollMode();
        if (r1 == 0) goto L_0x0017;
    L_0x000b:
        if (r1 != r2) goto L_0x009f;
    L_0x000d:
        r1 = r9.f584d;
        if (r1 == 0) goto L_0x009f;
    L_0x0011:
        r1 = r1.getCount();
        if (r1 <= r2) goto L_0x009f;
    L_0x0017:
        r1 = r9.f572M;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x0056;
    L_0x001f:
        r1 = r10.save();
        r0 = r9.getHeight();
        r2 = r9.getPaddingTop();
        r0 = r0 - r2;
        r2 = r9.getPaddingBottom();
        r0 = r0 - r2;
        r2 = r9.getWidth();
        r3 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r10.rotate(r3);
        r3 = -r0;
        r4 = r9.getPaddingTop();
        r3 = r3 + r4;
        r3 = (float) r3;
        r4 = r9.f596r;
        r5 = (float) r2;
        r4 = r4 * r5;
        r10.translate(r3, r4);
        r3 = r9.f572M;
        r3.setSize(r0, r2);
        r0 = r9.f572M;
        r0 = r0.draw(r10);
        r10.restoreToCount(r1);
    L_0x0056:
        r1 = r9.f573N;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x0099;
    L_0x005e:
        r1 = r10.save();
        r2 = r9.getWidth();
        r3 = r9.getHeight();
        r4 = r9.getPaddingTop();
        r5 = r9.getPaddingBottom();
        r6 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r10.rotate(r6);
        r6 = r9.getPaddingTop();
        r6 = -r6;
        r6 = (float) r6;
        r7 = r9.f597s;
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7 = r7 + r8;
        r7 = -r7;
        r8 = (float) r2;
        r7 = r7 * r8;
        r10.translate(r6, r7);
        r6 = r9.f573N;
        r3 = r3 - r4;
        r3 = r3 - r5;
        r6.setSize(r3, r2);
        r2 = r9.f573N;
        r2 = r2.draw(r10);
        r0 = r0 | r2;
        r10.restoreToCount(r1);
    L_0x0099:
        if (r0 == 0) goto L_0x009e;
    L_0x009b:
        p000.jm.m4542A(r9);
    L_0x009e:
        return;
    L_0x009f:
        r1 = r9.f572M;
        r1.finish();
        r1 = r9.f573N;
        r1.finish();
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.draw(android.graphics.Canvas):void");
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new jv();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new jv(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f579T == 2) {
            i2 = (i - 1) - i2;
        }
        return ((jv) ((View) this.f580U.get(i2)).getLayoutParams()).f7999f;
    }

    /* renamed from: a */
    private final Rect m375a(Rect rect, View view) {
        Rect rect2;
        if (rect == null) {
            rect2 = new Rect();
        } else {
            rect2 = rect;
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    /* renamed from: d */
    private final int m387d() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: a */
    private final ju m377a(View view) {
        for (int i = 0; i < this.f583c.size(); i++) {
            ju juVar = (ju) this.f583c.get(i);
            if (this.f584d.isViewFromObject(view, juVar.f7979a)) {
                return juVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    private final ju m389e() {
        float scrollX;
        float f;
        int d = m387d();
        if (d > 0) {
            scrollX = ((float) getScrollX()) / ((float) d);
        } else {
            scrollX = 0.0f;
        }
        if (d > 0) {
            f = 0.0f / ((float) d);
        } else {
            f = 0.0f;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        ju juVar = null;
        while (i2 < this.f583c.size()) {
            int i3;
            ju juVar2;
            ju juVar3 = (ju) this.f583c.get(i2);
            ju juVar4;
            if (obj == null) {
                i++;
                if (juVar3.f7980b != i) {
                    juVar3 = this.f592n;
                    juVar3.f7983e = (f2 + f3) + f;
                    juVar3.f7980b = i;
                    juVar3.f7982d = this.f584d.getPageWidth(juVar3.f7980b);
                    juVar4 = juVar3;
                    i3 = i2 - 1;
                    juVar2 = juVar4;
                } else {
                    juVar4 = juVar3;
                    i3 = i2;
                    juVar2 = juVar4;
                }
            } else {
                juVar4 = juVar3;
                i3 = i2;
                juVar2 = juVar4;
            }
            f2 = juVar2.f7983e;
            f3 = (juVar2.f7982d + f2) + f;
            if (obj == null && scrollX < f2) {
                return juVar;
            }
            if (scrollX < f3 || i3 == this.f583c.size() - 1) {
                return juVar2;
            }
            f3 = f2;
            i = juVar2.f7980b;
            obj = null;
            f2 = juVar2.f7982d;
            juVar = juVar2;
            i2 = i3 + 1;
        }
        return juVar;
    }

    /* renamed from: d */
    private final ju m388d(int i) {
        for (int i2 = 0; i2 < this.f583c.size(); i2++) {
            ju juVar = (ju) this.f583c.get(i2);
            if (juVar.f7980b == i) {
                return juVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    private final void m391f() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f594p = new Scroller(context, f559m);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f561B = viewConfiguration.getScaledPagingTouchSlop();
        this.f568I = (int) (400.0f * f);
        this.f569J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f572M = new EdgeEffect(context);
        this.f573N = new EdgeEffect(context);
        this.f570K = (int) (25.0f * f);
        this.f571L = (int) (f + f);
        this.f604z = (int) (16.0f * f);
        jm.m4559a((View) this, new jw(this));
        if (jm.m4574h(this) == 0) {
            jm.m4568c(this, 1);
        }
        jm.m4560a((View) this, new js(this));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f591k = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.f581W);
        Scroller scroller = this.f594p;
        if (!(scroller == null || scroller.isFinished())) {
            this.f594p.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & Illuminant.kOther;
        if (action == 3 || action == 1) {
            m397l();
            return false;
        }
        if (action != 0) {
            if (this.f602x) {
                return true;
            }
            if (this.f603y) {
                return false;
            }
        }
        float x;
        switch (action) {
            case 0:
                x = motionEvent.getX();
                this.f564E = x;
                this.f562C = x;
                x = motionEvent.getY();
                this.f565F = x;
                this.f563D = x;
                this.f566G = motionEvent.getPointerId(0);
                this.f603y = false;
                this.f595q = true;
                this.f594p.computeScrollOffset();
                if (this.aa == 2 && Math.abs(this.f594p.getFinalX() - this.f594p.getCurrX()) > this.f571L) {
                    this.f594p.abortAnimation();
                    this.f590j = false;
                    m405b();
                    this.f602x = true;
                    m396k();
                    m406b(1);
                    break;
                }
                m381a(false);
                this.f602x = false;
                break;
            case 2:
                action = this.f566G;
                if (action != -1) {
                    action = motionEvent.findPointerIndex(action);
                    float x2 = motionEvent.getX(action);
                    float f = x2 - this.f562C;
                    float abs = Math.abs(f);
                    float y = motionEvent.getY(action);
                    float abs2 = Math.abs(y - this.f565F);
                    if (f != 0.0f) {
                        x = this.f562C;
                        boolean z = (x < ((float) this.f560A) && f > 0.0f) ? true : x > ((float) (getWidth() - this.f560A)) ? f < 0.0f : false;
                        if (!z && m383a(this, false, (int) f, (int) x2, (int) y)) {
                            this.f562C = x2;
                            this.f563D = y;
                            this.f603y = true;
                            return false;
                        }
                    }
                    x = (float) this.f561B;
                    if (abs > x && 0.5f * abs > abs2) {
                        this.f602x = true;
                        m396k();
                        m406b(1);
                        if (f <= 0.0f) {
                            x = this.f564E - ((float) this.f561B);
                        } else {
                            x = this.f564E + ((float) this.f561B);
                        }
                        this.f562C = x;
                        this.f563D = y;
                        m384b(true);
                    } else if (abs2 > x) {
                        this.f603y = true;
                    }
                    if (this.f602x && m382a(x2)) {
                        jm.m4542A(this);
                        break;
                    }
                }
                break;
            case 6:
                m380a(motionEvent);
                break;
        }
        if (this.f567H == null) {
            this.f567H = VelocityTracker.obtain();
        }
        this.f567H.addMovement(motionEvent);
        return this.f602x;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int i6 = i3 - i;
        int i7 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        int i9 = 0;
        while (i9 < childCount) {
            jv jvVar;
            int i10;
            int i11;
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                jvVar = (jv) childAt.getLayoutParams();
                if (jvVar.f7994a) {
                    int max;
                    i10 = jvVar.f7995b;
                    int i12 = i10 & 112;
                    switch (i10 & 7) {
                        case 1:
                            max = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i5 = paddingLeft;
                            paddingLeft = paddingRight;
                            break;
                        case 3:
                            i5 = paddingLeft + childAt.getMeasuredWidth();
                            max = paddingLeft;
                            paddingLeft = paddingRight;
                            break;
                        case 5:
                            i10 = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            max = i10;
                            i5 = paddingLeft;
                            paddingLeft = paddingRight + childAt.getMeasuredWidth();
                            break;
                        default:
                            max = paddingLeft;
                            i5 = paddingLeft;
                            paddingLeft = paddingRight;
                            break;
                    }
                    switch (i12) {
                        case 16:
                            i11 = paddingBottom;
                            paddingBottom = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = i11;
                            break;
                        case 48:
                            i11 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = childAt.getMeasuredHeight() + paddingTop;
                            i10 = i11;
                            break;
                        case 80:
                            i10 = childAt.getMeasuredHeight() + paddingBottom;
                            paddingBottom = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                            break;
                        default:
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            break;
                    }
                    paddingRight = max + scrollX;
                    childAt.layout(paddingRight, paddingBottom, childAt.getMeasuredWidth() + paddingRight, childAt.getMeasuredHeight() + paddingBottom);
                    paddingBottom = i8 + 1;
                    paddingRight = paddingTop;
                    i8 = i5;
                    paddingTop = paddingLeft;
                    i11 = paddingBottom;
                    paddingBottom = i10;
                    i10 = i11;
                } else {
                    i10 = i8;
                    i8 = paddingLeft;
                    i11 = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = i11;
                }
            } else {
                i10 = i8;
                i8 = paddingLeft;
                i11 = paddingTop;
                paddingTop = paddingRight;
                paddingRight = i11;
            }
            i9++;
            paddingLeft = i8;
            i8 = i10;
            i11 = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i11;
        }
        i5 = (i6 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                jvVar = (jv) childAt2.getLayoutParams();
                if (!jvVar.f7994a) {
                    ju a = m377a(childAt2);
                    if (a != null) {
                        float f = (float) i5;
                        i9 = ((int) (a.f7983e * f)) + paddingLeft;
                        if (jvVar.f7997d) {
                            jvVar.f7997d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (jvVar.f7996c * f), 1073741824), MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i9, paddingTop, childAt2.getMeasuredWidth() + i9, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.f575P = i8;
        if (this.f591k) {
            m378a(this.f585e, false, 0, false);
        }
        this.f591k = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f560A = Math.min(measuredWidth / 10, this.f604z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            jv jvVar;
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                jvVar = (jv) childAt.getLayoutParams();
                if (jvVar != null && jvVar.f7994a) {
                    Object obj;
                    Object obj2;
                    int i6;
                    i3 = jvVar.f7995b;
                    i4 = i3 & 7;
                    i3 &= 112;
                    int i7;
                    if (i3 == 48) {
                        i7 = 1;
                    } else if (i3 != 80) {
                        obj = null;
                    } else {
                        i7 = 1;
                    }
                    int i8;
                    if (i4 == 3) {
                        i8 = 1;
                    } else if (i4 != 5) {
                        obj2 = null;
                    } else {
                        i8 = 1;
                    }
                    if (obj != null) {
                        i4 = kvl.UNSET_ENUM_VALUE;
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i4 = 1073741824;
                        i3 = kvl.UNSET_ENUM_VALUE;
                    } else {
                        i4 = kvl.UNSET_ENUM_VALUE;
                        i3 = kvl.UNSET_ENUM_VALUE;
                    }
                    if (jvVar.width == -2) {
                        i6 = paddingLeft;
                    } else if (jvVar.width != -1) {
                        i6 = jvVar.width;
                        i3 = 1073741824;
                    } else {
                        i3 = 1073741824;
                        i6 = paddingLeft;
                    }
                    if (jvVar.height == -2) {
                        measuredWidth = measuredHeight;
                    } else if (jvVar.height != -1) {
                        measuredWidth = jvVar.height;
                        i4 = 1073741824;
                    } else {
                        i4 = 1073741824;
                        measuredWidth = measuredHeight;
                    }
                    childAt.measure(MeasureSpec.makeMeasureSpec(i6, i3), MeasureSpec.makeMeasureSpec(measuredWidth, i4));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f598t = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f599u = true;
        m405b();
        this.f599u = false;
        i4 = getChildCount();
        for (i3 = 0; i3 < i4; i3++) {
            View childAt2 = getChildAt(i3);
            if (childAt2.getVisibility() != 8) {
                jvVar = (jv) childAt2.getLayoutParams();
                if (jvVar == null || !jvVar.f7994a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (jvVar.f7996c * ((float) paddingLeft)), 1073741824), this.f598t);
                }
            }
        }
    }

    /* renamed from: g */
    private final void m392g() {
        int paddingLeft;
        int paddingRight;
        int i;
        if (this.f575P > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            i = 0;
            while (i < childCount) {
                int i2;
                View childAt = getChildAt(i);
                jv jvVar = (jv) childAt.getLayoutParams();
                if (jvVar.f7994a) {
                    int i3;
                    switch (jvVar.f7995b & 7) {
                        case 1:
                            i3 = paddingRight;
                            paddingRight = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i2 = i3;
                            break;
                        case 3:
                            i3 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = childAt.getWidth() + paddingLeft;
                            i2 = i3;
                            break;
                        case 5:
                            i2 = childAt.getMeasuredWidth() + paddingRight;
                            paddingRight = (width - paddingRight) - childAt.getMeasuredWidth();
                            break;
                        default:
                            i2 = paddingRight;
                            paddingRight = paddingLeft;
                            break;
                    }
                    paddingRight = (paddingRight + scrollX) - childAt.getLeft();
                    if (paddingRight != 0) {
                        childAt.offsetLeftAndRight(paddingRight);
                    }
                } else {
                    i2 = paddingRight;
                }
                i++;
                paddingRight = i2;
            }
        }
        List list = this.f576Q;
        if (list != null) {
            paddingLeft = list.size();
            for (paddingRight = 0; paddingRight < paddingLeft; paddingRight++) {
                jx jxVar = (jx) this.f576Q.get(paddingRight);
                if (jxVar != null) {
                    jxVar.mo722a();
                }
            }
        }
        if (this.f577R != null) {
            paddingLeft = getScrollX();
            int childCount2 = getChildCount();
            for (paddingRight = 0; paddingRight < childCount2; paddingRight++) {
                View childAt2 = getChildAt(paddingRight);
                if (!((jv) childAt2.getLayoutParams()).f7994a) {
                    float left = ((float) (childAt2.getLeft() - paddingLeft)) / ((float) m387d());
                    i = childAt2.getWidth();
                    if (left < -1.0f || left <= 0.0f || left >= 1.0f) {
                        childAt2.setAlpha(1.0f);
                        childAt2.setTranslationX(0.0f);
                        childAt2.setScaleX(1.0f);
                        childAt2.setScaleY(1.0f);
                    } else {
                        childAt2.setAlpha(1.0f - left);
                        childAt2.setTranslationX(((float) i) * (-left));
                        left = ((1.0f - Math.abs(left)) * 0.25f) + 0.75f;
                        childAt2.setScaleX(left);
                        childAt2.setScaleY(left);
                    }
                }
            }
        }
        this.f574O = true;
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) == 0) {
            i2 = childCount - 1;
            childCount = -1;
        } else {
            i3 = childCount;
            i2 = 0;
            childCount = 1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                ju a = m377a(childAt);
                if (a != null && a.f7980b == this.f585e && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += childCount;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ka) {
            ka kaVar = (ka) parcelable;
            super.onRestoreInstanceState(kaVar.f7631e);
            jl jlVar = this.f584d;
            if (jlVar != null) {
                jlVar.restoreState(kaVar.f19135b, kaVar.f19136c);
                m402a(kaVar.f19134a, false, true);
                return;
            }
            this.f586f = kaVar.f19134a;
            this.f587g = kaVar.f19135b;
            this.f588h = kaVar.f19136c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable kaVar = new ka(super.onSaveInstanceState());
        kaVar.f19134a = this.f585e;
        jl jlVar = this.f584d;
        if (jlVar != null) {
            kaVar.f19135b = jlVar.saveState();
        }
        return kaVar;
    }

    /* renamed from: a */
    private final void m380a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f566G) {
            if (actionIndex == 0) {
                actionIndex = 1;
            } else {
                actionIndex = 0;
            }
            this.f562C = motionEvent.getX(actionIndex);
            this.f566G = motionEvent.getPointerId(actionIndex);
            VelocityTracker velocityTracker = this.f567H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3) {
            return;
        }
        float min;
        int paddingLeft;
        if (i3 <= 0 || this.f583c.isEmpty()) {
            ju d = m388d(this.f585e);
            if (d != null) {
                min = Math.min(d.f7983e, this.f597s);
            } else {
                min = 0.0f;
            }
            paddingLeft = (int) (min * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                m381a(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (this.f594p.isFinished()) {
            paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingLeft2 = getPaddingLeft();
            min = (float) ((i - paddingLeft) - paddingRight);
            scrollTo((int) (min * (((float) getScrollX()) / ((float) ((i3 - paddingLeft2) - getPaddingRight())))), getScrollY());
        } else {
            this.f594p.setFinalX(this.f585e * m387d());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        jl jlVar = this.f584d;
        if (jlVar == null || jlVar.getCount() == 0) {
            return false;
        }
        if (this.f567H == null) {
            this.f567H = VelocityTracker.obtain();
        }
        this.f567H.addMovement(motionEvent);
        float x;
        int d;
        float f;
        float f2;
        switch (motionEvent.getAction() & Illuminant.kOther) {
            case 0:
                this.f594p.abortAnimation();
                this.f590j = false;
                m405b();
                x = motionEvent.getX();
                this.f564E = x;
                this.f562C = x;
                x = motionEvent.getY();
                this.f565F = x;
                this.f563D = x;
                this.f566G = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.f602x) {
                    int i;
                    VelocityTracker velocityTracker = this.f567H;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f569J);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.f566G);
                    this.f590j = true;
                    d = m387d();
                    int scrollX = getScrollX();
                    ju e = m389e();
                    float f3 = (float) d;
                    d = e.f7980b;
                    f = ((((float) scrollX) / f3) - e.f7983e) / (e.f7982d + (0.0f / f3));
                    if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f566G)) - this.f564E)) <= this.f570K || Math.abs(xVelocity) <= this.f568I) {
                        if (d >= this.f585e) {
                            f2 = 0.4f;
                        } else {
                            f2 = 0.6f;
                        }
                        i = d + ((int) (f2 + f));
                    } else if (xVelocity <= 0) {
                        i = d + 1;
                    } else {
                        i = d;
                    }
                    if (this.f583c.size() > 0) {
                        ju juVar = (ju) this.f583c.get(0);
                        ArrayList arrayList = this.f583c;
                        i = Math.max(juVar.f7980b, Math.min(i, ((ju) arrayList.get(arrayList.size() - 1)).f7980b));
                    }
                    m379a(i, true, true, xVelocity);
                    z = m397l();
                    break;
                }
                break;
            case 2:
                if (!this.f602x) {
                    d = motionEvent.findPointerIndex(this.f566G);
                    if (d == -1) {
                        z = m397l();
                        break;
                    }
                    f2 = motionEvent.getX(d);
                    f = Math.abs(f2 - this.f562C);
                    float y = motionEvent.getY(d);
                    x = Math.abs(y - this.f563D);
                    if (f > ((float) this.f561B) && f > x) {
                        this.f602x = true;
                        m396k();
                        x = this.f564E;
                        if (f2 - x <= 0.0f) {
                            x -= (float) this.f561B;
                        } else {
                            x += (float) this.f561B;
                        }
                        this.f562C = x;
                        this.f563D = y;
                        m406b(1);
                        m384b(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f602x) {
                    z = m382a(motionEvent.getX(motionEvent.findPointerIndex(this.f566G)));
                    break;
                }
                break;
            case 3:
                if (this.f602x) {
                    m378a(this.f585e, true, 0, false);
                    z = m397l();
                    break;
                }
                break;
            case 5:
                d = motionEvent.getActionIndex();
                this.f562C = motionEvent.getX(d);
                this.f566G = motionEvent.getPointerId(d);
                break;
            case 6:
                m380a(motionEvent);
                this.f562C = motionEvent.getX(motionEvent.findPointerIndex(this.f566G));
                break;
        }
        if (z) {
            jm.m4542A(this);
        }
        return true;
    }

    /* renamed from: h */
    private final boolean m393h() {
        int i = this.f585e;
        if (i <= 0) {
            return false;
        }
        m401a(i - 1, true);
        return true;
    }

    /* renamed from: i */
    private final boolean m394i() {
        jl jlVar = this.f584d;
        if (jlVar == null || this.f585e >= jlVar.getCount() - 1) {
            return false;
        }
        m401a(this.f585e + 1, true);
        return true;
    }

    /* renamed from: j */
    private final boolean m395j() {
        if (this.f583c.size() != 0) {
            m389e();
            m387d();
            this.f574O = false;
            m392g();
            if (this.f574O) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f591k) {
            return false;
        } else {
            this.f574O = false;
            m392g();
            if (this.f574O) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: a */
    private final boolean m382a(float f) {
        int i;
        float f2;
        boolean z = true;
        float f3 = this.f562C;
        this.f562C = f;
        float scrollX = ((float) getScrollX()) + (f3 - f);
        float d = (float) m387d();
        float f4 = d * this.f596r;
        float f5 = d * this.f597s;
        ju juVar = (ju) this.f583c.get(0);
        ArrayList arrayList = this.f583c;
        ju juVar2 = (ju) arrayList.get(arrayList.size() - 1);
        if (juVar.f7980b != 0) {
            f4 = juVar.f7983e * d;
            i = 0;
        } else {
            boolean z2 = true;
        }
        if (juVar2.f7980b != this.f584d.getCount() - 1) {
            f2 = juVar2.f7983e * d;
            int i2 = 0;
        } else {
            f2 = f5;
            boolean z3 = true;
        }
        if (scrollX < f4) {
            if (i != 0) {
                this.f572M.onPull(Math.abs(f4 - scrollX) / d);
            } else {
                z = false;
            }
        } else if (scrollX > f2) {
            if (i2 != 0) {
                this.f573N.onPull(Math.abs(scrollX - f2) / d);
            } else {
                z = false;
            }
            f4 = f2;
        } else {
            f4 = scrollX;
            z = false;
        }
        i = (int) f4;
        this.f562C += f4 - ((float) i);
        scrollTo(i, getScrollY());
        m395j();
        return z;
    }

    /* renamed from: b */
    public final void m405b() {
        m390e(this.f585e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    private final void m390e(int r15) {
        /*
        r14 = this;
        r0 = r14.f585e;
        if (r0 == r15) goto L_0x0417;
    L_0x0004:
        r0 = r14.m388d(r0);
        r14.f585e = r15;
        r6 = r0;
    L_0x000b:
        r0 = r14.f584d;
        if (r0 != 0) goto L_0x0013;
    L_0x000f:
        r14.m398m();
    L_0x0012:
        return;
    L_0x0013:
        r0 = r14.f590j;
        if (r0 == 0) goto L_0x001b;
    L_0x0017:
        r14.m398m();
        goto L_0x0012;
    L_0x001b:
        r0 = r14.getWindowToken();
        if (r0 == 0) goto L_0x0012;
    L_0x0021:
        r0 = r14.f584d;
        r0.startUpdate(r14);
        r0 = r14.f601w;
        r1 = 0;
        r2 = r14.f585e;
        r2 = r2 - r0;
        r8 = java.lang.Math.max(r1, r2);
        r1 = r14.f584d;
        r10 = r1.getCount();
        r1 = r10 + -1;
        r2 = r14.f585e;
        r0 = r0 + r2;
        r11 = java.lang.Math.min(r1, r0);
        r0 = r14.f582b;
        if (r10 == r0) goto L_0x0092;
    L_0x0043:
        r0 = r14.getResources();	 Catch:{ NotFoundException -> 0x041b }
        r1 = r14.getId();	 Catch:{ NotFoundException -> 0x041b }
        r0 = r0.getResourceName(r1);	 Catch:{ NotFoundException -> 0x041b }
    L_0x004f:
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r2.append(r3);
        r3 = r14.f582b;
        r2.append(r3);
        r3 = ", found: ";
        r2.append(r3);
        r2.append(r10);
        r3 = " Pager id: ";
        r2.append(r3);
        r2.append(r0);
        r0 = " Pager class: ";
        r2.append(r0);
        r0 = r14.getClass();
        r2.append(r0);
        r0 = " Problematic adapter: ";
        r2.append(r0);
        r0 = r14.f584d;
        r0 = r0.getClass();
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0092:
        r0 = 0;
        r1 = r0;
    L_0x0094:
        r0 = r14.f583c;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0414;
    L_0x009c:
        r0 = r14.f583c;
        r0 = r0.get(r1);
        r0 = (p000.ju) r0;
        r2 = r0.f7980b;
        r3 = r14.f585e;
        if (r2 < r3) goto L_0x040f;
    L_0x00aa:
        if (r2 == r3) goto L_0x00ad;
    L_0x00ac:
        r0 = 0;
    L_0x00ad:
        if (r0 != 0) goto L_0x040c;
    L_0x00af:
        if (r10 <= 0) goto L_0x0409;
    L_0x00b1:
        r0 = r14.f585e;
        r0 = r14.m376a(r0, r1);
        r7 = r0;
    L_0x00b8:
        if (r7 == 0) goto L_0x0369;
    L_0x00ba:
        r4 = r1 + -1;
        if (r4 < 0) goto L_0x0405;
    L_0x00be:
        r0 = r14.f583c;
        r0 = r0.get(r4);
        r0 = (p000.ju) r0;
        r3 = r0;
    L_0x00c7:
        r9 = r14.m387d();
        if (r9 <= 0) goto L_0x0401;
    L_0x00cd:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r7.f7982d;
        r0 = r0 - r2;
        r2 = r14.getPaddingLeft();
        r2 = (float) r2;
        r5 = (float) r9;
        r2 = r2 / r5;
        r0 = r0 + r2;
        r2 = r0;
    L_0x00db:
        r0 = r14.f585e;
        r0 = r0 + -1;
        r5 = 0;
        r13 = r0;
        r0 = r3;
        r3 = r4;
        r4 = r1;
        r1 = r5;
        r5 = r13;
    L_0x00e6:
        if (r5 < 0) goto L_0x015b;
    L_0x00e8:
        r12 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r12 < 0) goto L_0x0125;
    L_0x00ec:
        if (r5 >= r8) goto L_0x0125;
    L_0x00ee:
        if (r0 == 0) goto L_0x015b;
    L_0x00f0:
        r12 = r0.f7980b;
        if (r5 != r12) goto L_0x0121;
    L_0x00f4:
        r12 = r0.f7981c;
        if (r12 != 0) goto L_0x011d;
    L_0x00f8:
        r12 = r14.f583c;
        r12.remove(r3);
        r12 = r14.f584d;
        r0 = r0.f7979a;
        r12.destroyItem(r14, r5, r0);
        r3 = r3 + -1;
        r4 = r4 + -1;
        if (r3 < 0) goto L_0x011b;
    L_0x010a:
        r0 = r14.f583c;
        r0 = r0.get(r3);
        r0 = (p000.ju) r0;
    L_0x0112:
        r13 = r1;
        r1 = r0;
        r0 = r13;
    L_0x0115:
        r5 = r5 + -1;
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x00e6;
    L_0x011b:
        r0 = 0;
        goto L_0x0112;
    L_0x011d:
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x0115;
    L_0x0121:
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x0115;
    L_0x0125:
        if (r0 == 0) goto L_0x0140;
    L_0x0127:
        r12 = r0.f7980b;
        if (r5 != r12) goto L_0x0140;
    L_0x012b:
        r0 = r0.f7982d;
        r1 = r1 + r0;
        r3 = r3 + -1;
        if (r3 < 0) goto L_0x013e;
    L_0x0132:
        r0 = r14.f583c;
        r0 = r0.get(r3);
        r0 = (p000.ju) r0;
    L_0x013a:
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x0115;
    L_0x013e:
        r0 = 0;
        goto L_0x013a;
    L_0x0140:
        r0 = r3 + 1;
        r0 = r14.m376a(r5, r0);
        r0 = r0.f7982d;
        r1 = r1 + r0;
        r4 = r4 + 1;
        if (r3 < 0) goto L_0x0159;
    L_0x014d:
        r0 = r14.f583c;
        r0 = r0.get(r3);
        r0 = (p000.ju) r0;
    L_0x0155:
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x0115;
    L_0x0159:
        r0 = 0;
        goto L_0x0155;
    L_0x015b:
        r2 = r7.f7982d;
        r8 = r4 + 1;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x021b;
    L_0x0165:
        r0 = r14.f583c;
        r0 = r0.size();
        if (r8 >= r0) goto L_0x0218;
    L_0x016d:
        r0 = r14.f583c;
        r0 = r0.get(r8);
        r0 = (p000.ju) r0;
        r3 = r0;
    L_0x0176:
        if (r9 <= 0) goto L_0x0214;
    L_0x0178:
        r0 = r14.getPaddingRight();
        r0 = (float) r0;
        r1 = (float) r9;
        r0 = r0 / r1;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 + r1;
        r1 = r0;
    L_0x0183:
        r0 = r14.f585e;
        r0 = r0 + 1;
        r9 = r0;
        r0 = r3;
        r3 = r8;
    L_0x018a:
        if (r9 >= r10) goto L_0x021b;
    L_0x018c:
        r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1));
        if (r5 < 0) goto L_0x01cc;
    L_0x0190:
        if (r9 <= r11) goto L_0x01cc;
    L_0x0192:
        if (r0 == 0) goto L_0x021b;
    L_0x0194:
        r5 = r0.f7980b;
        if (r9 != r5) goto L_0x01c8;
    L_0x0198:
        r5 = r0.f7981c;
        if (r5 != 0) goto L_0x01c4;
    L_0x019c:
        r5 = r14.f583c;
        r5.remove(r3);
        r5 = r14.f584d;
        r0 = r0.f7979a;
        r5.destroyItem(r14, r9, r0);
        r0 = r14.f583c;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x01c2;
    L_0x01b0:
        r0 = r14.f583c;
        r0 = r0.get(r3);
        r0 = (p000.ju) r0;
    L_0x01b8:
        r13 = r2;
        r2 = r0;
        r0 = r13;
    L_0x01bb:
        r5 = r9 + 1;
        r9 = r5;
        r13 = r0;
        r0 = r2;
        r2 = r13;
        goto L_0x018a;
    L_0x01c2:
        r0 = 0;
        goto L_0x01b8;
    L_0x01c4:
        r13 = r2;
        r2 = r0;
        r0 = r13;
        goto L_0x01bb;
    L_0x01c8:
        r13 = r2;
        r2 = r0;
        r0 = r13;
        goto L_0x01bb;
    L_0x01cc:
        if (r0 == 0) goto L_0x01f0;
    L_0x01ce:
        r5 = r0.f7980b;
        if (r9 != r5) goto L_0x01f0;
    L_0x01d2:
        r0 = r0.f7982d;
        r2 = r2 + r0;
        r3 = r3 + 1;
        r0 = r14.f583c;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x01eb;
    L_0x01df:
        r0 = r14.f583c;
        r0 = r0.get(r3);
        r0 = (p000.ju) r0;
        r13 = r2;
        r2 = r0;
        r0 = r13;
        goto L_0x01bb;
    L_0x01eb:
        r0 = 0;
        r13 = r2;
        r2 = r0;
        r0 = r13;
        goto L_0x01bb;
    L_0x01f0:
        r5 = r3 + 1;
        r0 = r14.m376a(r9, r3);
        r0 = r0.f7982d;
        r2 = r2 + r0;
        r0 = r14.f583c;
        r0 = r0.size();
        if (r5 >= r0) goto L_0x020e;
    L_0x0201:
        r0 = r14.f583c;
        r0 = r0.get(r5);
        r0 = (p000.ju) r0;
        r3 = r5;
        r13 = r0;
        r0 = r2;
        r2 = r13;
        goto L_0x01bb;
    L_0x020e:
        r0 = 0;
        r3 = r5;
        r13 = r0;
        r0 = r2;
        r2 = r13;
        goto L_0x01bb;
    L_0x0214:
        r0 = 0;
        r1 = r0;
        goto L_0x0183;
    L_0x0218:
        r3 = 0;
        goto L_0x0176;
    L_0x021b:
        r0 = r14.f584d;
        r10 = r0.getCount();
        r0 = r14.m387d();
        if (r0 <= 0) goto L_0x03fd;
    L_0x0227:
        r1 = 0;
        r0 = (float) r0;
        r0 = r1 / r0;
        r9 = r0;
    L_0x022c:
        if (r6 == 0) goto L_0x02d0;
    L_0x022e:
        r0 = r6.f7980b;
        r1 = r7.f7980b;
        if (r0 >= r1) goto L_0x028b;
    L_0x0234:
        r1 = r6.f7983e;
        r2 = r6.f7982d;
        r1 = r1 + r2;
        r2 = r1 + r9;
        r1 = r0 + 1;
        r0 = 0;
        r3 = r0;
    L_0x023f:
        r0 = r7.f7980b;
        if (r1 > r0) goto L_0x02d0;
    L_0x0243:
        r0 = r14.f583c;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x02d0;
    L_0x024b:
        r0 = r14.f583c;
        r0 = r0.get(r3);
        r0 = (p000.ju) r0;
        r5 = r0;
    L_0x0254:
        r0 = r5.f7980b;
        if (r1 <= r0) goto L_0x0288;
    L_0x0258:
        r0 = r14.f583c;
        r0 = r0.size();
        r0 = r0 + -1;
        if (r3 >= r0) goto L_0x026e;
    L_0x0262:
        r3 = r3 + 1;
        r0 = r14.f583c;
        r0 = r0.get(r3);
        r0 = (p000.ju) r0;
        r5 = r0;
        goto L_0x0254;
    L_0x026e:
        r0 = r1;
        r1 = r2;
    L_0x0270:
        r2 = r5.f7980b;
        if (r0 >= r2) goto L_0x027f;
    L_0x0274:
        r2 = r14.f584d;
        r2 = r2.getPageWidth(r0);
        r2 = r2 + r9;
        r1 = r1 + r2;
        r0 = r0 + 1;
        goto L_0x0270;
    L_0x027f:
        r5.f7983e = r1;
        r2 = r5.f7982d;
        r2 = r2 + r9;
        r2 = r2 + r1;
        r1 = r0 + 1;
        goto L_0x023f;
    L_0x0288:
        r0 = r1;
        r1 = r2;
        goto L_0x0270;
    L_0x028b:
        if (r0 <= r1) goto L_0x02d0;
    L_0x028d:
        r1 = r14.f583c;
        r1 = r1.size();
        r1 = r1 + -1;
        r3 = r6.f7983e;
        r2 = r0 + -1;
    L_0x0299:
        r0 = r7.f7980b;
        if (r2 < r0) goto L_0x02d0;
    L_0x029d:
        if (r1 < 0) goto L_0x02d0;
    L_0x029f:
        r0 = r14.f583c;
        r0 = r0.get(r1);
        r0 = (p000.ju) r0;
    L_0x02a7:
        r5 = r0.f7980b;
        if (r2 >= r5) goto L_0x02b8;
    L_0x02ab:
        if (r1 <= 0) goto L_0x02b8;
    L_0x02ad:
        r1 = r1 + -1;
        r0 = r14.f583c;
        r0 = r0.get(r1);
        r0 = (p000.ju) r0;
        goto L_0x02a7;
    L_0x02b8:
        r5 = r0.f7980b;
        if (r2 <= r5) goto L_0x02c7;
    L_0x02bc:
        r5 = r14.f584d;
        r5 = r5.getPageWidth(r2);
        r5 = r5 + r9;
        r3 = r3 - r5;
        r2 = r2 + -1;
        goto L_0x02b8;
    L_0x02c7:
        r5 = r0.f7982d;
        r5 = r5 + r9;
        r3 = r3 - r5;
        r0.f7983e = r3;
        r2 = r2 + -1;
        goto L_0x0299;
    L_0x02d0:
        r0 = r14.f583c;
        r5 = r0.size();
        r1 = r7.f7983e;
        r3 = r7.f7980b;
        r2 = r3 + -1;
        if (r3 != 0) goto L_0x03f8;
    L_0x02de:
        r0 = r1;
    L_0x02df:
        r14.f596r = r0;
        r6 = r10 + -1;
        if (r3 != r6) goto L_0x03f3;
    L_0x02e5:
        r0 = r7.f7982d;
        r0 = r0 + r1;
        r3 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = r0 + r3;
    L_0x02eb:
        r14.f597s = r0;
        r0 = r4 + -1;
        r4 = r0;
        r13 = r2;
        r2 = r1;
        r1 = r13;
    L_0x02f3:
        if (r4 < 0) goto L_0x0321;
    L_0x02f5:
        r0 = r14.f583c;
        r0 = r0.get(r4);
        r0 = (p000.ju) r0;
        r3 = r2;
    L_0x02fe:
        r10 = r0.f7980b;
        if (r1 <= r10) goto L_0x0310;
    L_0x0302:
        r2 = r1 + -1;
        r10 = r14.f584d;
        r1 = r10.getPageWidth(r1);
        r1 = r1 + r9;
        r1 = r3 - r1;
        r3 = r1;
        r1 = r2;
        goto L_0x02fe;
    L_0x0310:
        r2 = r0.f7982d;
        r2 = r2 + r9;
        r2 = r3 - r2;
        r0.f7983e = r2;
        if (r10 != 0) goto L_0x031b;
    L_0x0319:
        r14.f596r = r2;
    L_0x031b:
        r0 = r4 + -1;
        r1 = r1 + -1;
        r4 = r0;
        goto L_0x02f3;
    L_0x0321:
        r0 = r7.f7983e;
        r1 = r7.f7982d;
        r0 = r0 + r1;
        r2 = r0 + r9;
        r0 = r7.f7980b;
        r1 = r0 + 1;
        r4 = r8;
    L_0x032d:
        if (r4 >= r5) goto L_0x0360;
    L_0x032f:
        r0 = r14.f583c;
        r0 = r0.get(r4);
        r0 = (p000.ju) r0;
        r3 = r2;
    L_0x0338:
        r2 = r0.f7980b;
        if (r1 >= r2) goto L_0x0349;
    L_0x033c:
        r2 = r1 + 1;
        r8 = r14.f584d;
        r1 = r8.getPageWidth(r1);
        r1 = r1 + r9;
        r1 = r1 + r3;
        r3 = r1;
        r1 = r2;
        goto L_0x0338;
    L_0x0349:
        if (r2 != r6) goto L_0x0353;
    L_0x034b:
        r2 = r0.f7982d;
        r2 = r2 + r3;
        r8 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2 = r2 + r8;
        r14.f597s = r2;
    L_0x0353:
        r0.f7983e = r3;
        r0 = r0.f7982d;
        r0 = r0 + r9;
        r2 = r3 + r0;
        r0 = r4 + 1;
        r1 = r1 + 1;
        r4 = r0;
        goto L_0x032d;
    L_0x0360:
        r0 = r14.f584d;
        r1 = r14.f585e;
        r2 = r7.f7979a;
        r0.setPrimaryItem(r14, r1, r2);
    L_0x0369:
        r0 = r14.f584d;
        r0.finishUpdate(r14);
        r2 = r14.getChildCount();
        r0 = 0;
        r1 = r0;
    L_0x0374:
        if (r1 >= r2) goto L_0x039f;
    L_0x0376:
        r3 = r14.getChildAt(r1);
        r0 = r3.getLayoutParams();
        r0 = (p000.jv) r0;
        r0.f7999f = r1;
        r4 = r0.f7994a;
        if (r4 != 0) goto L_0x039b;
    L_0x0386:
        r4 = r0.f7996c;
        r5 = 0;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 != 0) goto L_0x039b;
    L_0x038d:
        r3 = r14.m377a(r3);
        if (r3 == 0) goto L_0x039b;
    L_0x0393:
        r4 = r3.f7982d;
        r0.f7996c = r4;
        r3 = r3.f7980b;
        r0.f7998e = r3;
    L_0x039b:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0374;
    L_0x039f:
        r14.m398m();
        r0 = r14.hasFocus();
        if (r0 == 0) goto L_0x0012;
    L_0x03a8:
        r0 = r14.findFocus();
        if (r0 != 0) goto L_0x0426;
    L_0x03ae:
        r0 = 0;
    L_0x03af:
        if (r0 == 0) goto L_0x03d8;
    L_0x03b1:
        r0 = r0.f7980b;
        r1 = r14.f585e;
        if (r0 == r1) goto L_0x0012;
    L_0x03b7:
        r0 = 0;
    L_0x03b8:
        r1 = r14.getChildCount();
        if (r0 >= r1) goto L_0x0012;
    L_0x03be:
        r1 = r14.getChildAt(r0);
        r2 = r14.m377a(r1);
        if (r2 == 0) goto L_0x03d5;
    L_0x03c8:
        r2 = r2.f7980b;
        r3 = r14.f585e;
        if (r2 != r3) goto L_0x03d5;
    L_0x03ce:
        r2 = 2;
        r1 = r1.requestFocus(r2);
        if (r1 != 0) goto L_0x0012;
    L_0x03d5:
        r0 = r0 + 1;
        goto L_0x03b8;
    L_0x03d8:
        r0 = 0;
        goto L_0x03b8;
    L_0x03da:
        r0 = r1.getParent();
        if (r0 == r14) goto L_0x03ee;
    L_0x03e0:
        if (r0 == 0) goto L_0x03ec;
    L_0x03e2:
        r1 = r0 instanceof android.view.View;
        if (r1 == 0) goto L_0x03ea;
    L_0x03e6:
        r0 = (android.view.View) r0;
        r1 = r0;
        goto L_0x03da;
    L_0x03ea:
        r0 = 0;
        goto L_0x03af;
    L_0x03ec:
        r0 = 0;
        goto L_0x03af;
    L_0x03ee:
        r0 = r14.m377a(r1);
        goto L_0x03af;
    L_0x03f3:
        r0 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        goto L_0x02eb;
    L_0x03f8:
        r0 = -8388609; // 0xffffffffff7fffff float:-3.4028235E38 double:NaN;
        goto L_0x02df;
    L_0x03fd:
        r0 = 0;
        r9 = r0;
        goto L_0x022c;
    L_0x0401:
        r0 = 0;
        r2 = r0;
        goto L_0x00db;
    L_0x0405:
        r0 = 0;
        r3 = r0;
        goto L_0x00c7;
    L_0x0409:
        r7 = r0;
        goto L_0x00b8;
    L_0x040c:
        r7 = r0;
        goto L_0x00b8;
    L_0x040f:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0094;
    L_0x0414:
        r0 = 0;
        goto L_0x00ad;
    L_0x0417:
        r0 = 0;
        r6 = r0;
        goto L_0x000b;
    L_0x041b:
        r0 = move-exception;
        r0 = r14.getId();
        r0 = java.lang.Integer.toHexString(r0);
        goto L_0x004f;
    L_0x0426:
        r1 = r0;
        goto L_0x03da;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.e(int):void");
    }

    public void removeView(View view) {
        if (this.f599u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: k */
    private final void m396k() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: l */
    private final boolean m397l() {
        this.f566G = -1;
        this.f602x = false;
        this.f603y = false;
        VelocityTracker velocityTracker = this.f567H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f567H = null;
        }
        this.f572M.onRelease();
        this.f573N.onRelease();
        if (this.f572M.isFinished() || this.f573N.isFinished()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m378a(int i, boolean z, int i2, boolean z2) {
        int max;
        ju d = m388d(i);
        if (d != null) {
            max = (int) (Math.max(this.f596r, Math.min(d.f7983e, this.f597s)) * ((float) m387d()));
        } else {
            max = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                m384b(false);
            } else {
                boolean z3;
                int currX;
                int i3;
                Scroller scroller = this.f594p;
                if (scroller == null) {
                    z3 = false;
                } else if (scroller.isFinished()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (this.f595q) {
                        currX = this.f594p.getCurrX();
                    } else {
                        currX = this.f594p.getStartX();
                    }
                    this.f594p.abortAnimation();
                    m384b(false);
                    i3 = currX;
                } else {
                    i3 = getScrollX();
                }
                int scrollY = getScrollY();
                max -= i3;
                int i4 = -scrollY;
                if (max == 0 && i4 == 0) {
                    m381a(false);
                    m405b();
                    m406b(0);
                } else {
                    m384b(true);
                    m406b(2);
                    currX = m387d();
                    float f = (float) currX;
                    float f2 = (float) (currX / 2);
                    f2 += ((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(max)) / f) - 8.0f) * 0.47123894f))) * f2;
                    int abs = Math.abs(i2);
                    if (abs > 0) {
                        currX = Math.round(Math.abs(f2 / ((float) abs)) * 1000.0f) << 2;
                    } else {
                        currX = (int) (((((float) Math.abs(max)) / ((this.f584d.getPageWidth(this.f585e) * f) + 0.0f)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(currX, 600);
                    this.f595q = false;
                    this.f594p.startScroll(i3, scrollY, max, i4, min);
                    jm.m4542A(this);
                }
            }
            if (z2) {
                m385c();
                return;
            }
            return;
        }
        if (z2) {
            m385c();
        }
        m381a(false);
        scrollTo(max, 0);
        m395j();
    }

    /* renamed from: a */
    public final void m400a(int i) {
        this.f590j = false;
        m402a(i, this.f591k ^ 1, false);
    }

    /* renamed from: a */
    public final void m401a(int i, boolean z) {
        this.f590j = false;
        m402a(i, z, false);
    }

    /* renamed from: a */
    public final void m402a(int i, boolean z, boolean z2) {
        m379a(i, z, z2, 0);
    }

    /* renamed from: a */
    private final void m379a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        jl jlVar = this.f584d;
        if (jlVar == null || jlVar.getCount() <= 0) {
            m384b(false);
        } else if (z2 || this.f585e != i || this.f583c.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f584d.getCount()) {
                i = this.f584d.getCount() - 1;
            }
            int i3 = this.f601w;
            int i4 = this.f585e;
            if (i <= i4 + i3) {
                if (i < i4 - i3) {
                    i4 = 0;
                }
                if (this.f585e != i) {
                    z3 = true;
                }
                if (this.f591k) {
                    m390e(i);
                    m378a(i, z, i2, z3);
                    return;
                }
                this.f585e = i;
                if (z3) {
                    m385c();
                }
                requestLayout();
            }
            i4 = 0;
            while (i4 < this.f583c.size()) {
                ((ju) this.f583c.get(i4)).f7981c = true;
                i4++;
            }
            if (this.f585e != i) {
                z3 = true;
            }
            if (this.f591k) {
                m390e(i);
                m378a(i, z, i2, z3);
                return;
            }
            this.f585e = i;
            if (z3) {
                m385c();
            }
            requestLayout();
        } else {
            m384b(false);
        }
    }

    /* renamed from: a */
    public final void m404a(jy jyVar) {
        jy jyVar2 = this.f577R;
        this.f577R = jyVar;
        setChildrenDrawingOrderEnabled(true);
        this.f579T = 2;
        this.f578S = 2;
        if (jyVar2 == null) {
            m405b();
        }
    }

    /* renamed from: b */
    public final void m406b(int i) {
        int i2 = 0;
        if (this.aa != i) {
            int i3;
            this.aa = i;
            if (this.f577R != null) {
                int childCount = getChildCount();
                for (i3 = 0; i3 < childCount; i3++) {
                    int i4;
                    if (i != 0) {
                        i4 = this.f578S;
                    } else {
                        i4 = 0;
                    }
                    getChildAt(i3).setLayerType(i4, null);
                }
            }
            List list = this.f576Q;
            if (list != null) {
                i3 = list.size();
                while (i2 < i3) {
                    jx jxVar = (jx) this.f576Q.get(i2);
                    if (jxVar != null) {
                        jxVar.mo723a(i);
                    }
                    i2++;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m384b(boolean z) {
        if (this.f600v != z) {
            this.f600v = z;
        }
    }

    /* renamed from: m */
    private final void m398m() {
        if (this.f579T != 0) {
            ArrayList arrayList = this.f580U;
            if (arrayList == null) {
                this.f580U = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f580U.add(getChildAt(i));
            }
            Collections.sort(this.f580U, f556V);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }
}

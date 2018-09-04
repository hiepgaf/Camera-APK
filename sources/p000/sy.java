package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* renamed from: sy */
public class sy extends ViewGroup {
    /* renamed from: a */
    private int f9237a;
    /* renamed from: b */
    private int f9238b;
    /* renamed from: c */
    private int f9239c;
    /* renamed from: d */
    public boolean f9240d;
    /* renamed from: e */
    public int f9241e;
    /* renamed from: f */
    public Drawable f9242f;
    /* renamed from: g */
    public int f9243g;
    /* renamed from: h */
    private int f9244h;
    /* renamed from: i */
    private float f9245i;
    /* renamed from: j */
    private boolean f9246j;
    /* renamed from: k */
    private int[] f9247k;
    /* renamed from: l */
    private int[] f9248l;
    /* renamed from: m */
    private int f9249m;
    /* renamed from: n */
    private int f9250n;
    /* renamed from: o */
    private int f9251o;

    public sy(Context context) {
        this(context, null);
    }

    public sy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public sy(Context context, AttributeSet attributeSet, int i) {
        boolean z = true;
        super(context, attributeSet, i);
        this.f9240d = true;
        this.f9237a = -1;
        this.f9238b = 0;
        this.f9241e = 8388659;
        vk a = vk.m6047a(context, attributeSet, ni.aI, i, 0);
        int d = a.m6055d(ni.aP, -1);
        if (d >= 0) {
            m5828c(d);
        }
        d = a.m6055d(ni.aO, -1);
        if (d >= 0 && this.f9241e != d) {
            if ((8388615 & d) == 0) {
                d |= 8388611;
            }
            if ((d & 112) == 0) {
                d |= 48;
            }
            this.f9241e = d;
            requestLayout();
        }
        boolean a2 = a.m6050a(ni.aM, true);
        if (!a2) {
            this.f9240d = a2;
        }
        this.f9245i = a.f9419b.getFloat(4, -1.0f);
        this.f9237a = a.m6055d(ni.aN, -1);
        this.f9246j = a.m6050a(ni.aS, false);
        Drawable b = a.m6052b(ni.aQ);
        if (b != this.f9242f) {
            this.f9242f = b;
            if (b != null) {
                this.f9243g = b.getIntrinsicWidth();
                this.f9249m = b.getIntrinsicHeight();
            } else {
                this.f9243g = 0;
                this.f9249m = 0;
            }
            if (b != null) {
                z = false;
            }
            setWillNotDraw(z);
            requestLayout();
        }
        this.f9250n = a.m6055d(ni.aT, 0);
        this.f9251o = a.m6053c(ni.aR, 0);
        a.f9419b.recycle();
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof sz;
    }

    /* renamed from: a */
    private final void m5820a(Canvas canvas, int i) {
        this.f9242f.setBounds(getPaddingLeft() + this.f9251o, i, (getWidth() - getPaddingRight()) - this.f9251o, this.f9249m + i);
        this.f9242f.draw(canvas);
    }

    /* renamed from: b */
    private final void m5822b(Canvas canvas, int i) {
        this.f9242f.setBounds(i, getPaddingTop() + this.f9251o, this.f9243g + i, (getHeight() - getPaddingBottom()) - this.f9251o);
        this.f9242f.draw(canvas);
    }

    /* renamed from: c */
    public sz mo301c() {
        int i = this.f9239c;
        if (i == 0) {
            return new sz(-2);
        }
        return i == 1 ? new sz(-1) : null;
    }

    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return mo301c();
    }

    /* renamed from: a */
    public sz mo299a(AttributeSet attributeSet) {
        return new sz(getContext(), attributeSet);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return mo299a(attributeSet);
    }

    /* renamed from: b */
    public sz mo300b(LayoutParams layoutParams) {
        return new sz(layoutParams);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return mo300b(layoutParams);
    }

    public int getBaseline() {
        if (this.f9237a < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f9237a;
        if (childCount <= i) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i2 = this.f9238b;
            if (this.f9239c == 1) {
                childCount = this.f9241e & 112;
                if (childCount != 48) {
                    switch (childCount) {
                        case 16:
                            childCount = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f9244h) / 2);
                            break;
                        case 80:
                            childCount = ((getBottom() - getTop()) - getPaddingBottom()) - this.f9244h;
                            break;
                        default:
                            childCount = i2;
                            break;
                    }
                }
                childCount = i2;
            } else {
                childCount = i2;
            }
            return (((sz) childAt.getLayoutParams()).topMargin + childCount) + baseline;
        } else if (this.f9237a == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    /* renamed from: b */
    public final boolean m5826b(int i) {
        if (i == 0) {
            return this.f9250n & 1;
        }
        if (i == getChildCount()) {
            if ((this.f9250n & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f9250n & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m5821a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    protected void onDraw(Canvas canvas) {
        if (this.f9242f != null) {
            int childCount;
            int i;
            View childAt;
            int height;
            sz szVar;
            if (this.f9239c == 1) {
                childCount = getChildCount();
                i = 0;
                while (i < childCount) {
                    View childAt2 = getChildAt(i);
                    if (!(childAt2 == null || childAt2.getVisibility() == 8 || !m5826b(i))) {
                        m5820a(canvas, (childAt2.getTop() - ((sz) childAt2.getLayoutParams()).topMargin) - this.f9249m);
                    }
                    i++;
                }
                if (m5826b(childCount)) {
                    childAt = getChildAt(childCount - 1);
                    if (childAt == null) {
                        height = (getHeight() - getPaddingBottom()) - this.f9249m;
                    } else {
                        szVar = (sz) childAt.getLayoutParams();
                        height = szVar.bottomMargin + childAt.getBottom();
                    }
                    m5820a(canvas, height);
                    return;
                }
                return;
            }
            childCount = getChildCount();
            boolean a = vx.m6076a(this);
            i = 0;
            while (i < childCount) {
                View childAt3 = getChildAt(i);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !m5826b(i))) {
                    szVar = (sz) childAt3.getLayoutParams();
                    if (a) {
                        height = szVar.rightMargin + childAt3.getRight();
                    } else {
                        height = (childAt3.getLeft() - szVar.leftMargin) - this.f9243g;
                    }
                    m5822b(canvas, height);
                }
                i++;
            }
            if (m5826b(childCount)) {
                childAt = getChildAt(childCount - 1);
                if (childAt != null) {
                    szVar = (sz) childAt.getLayoutParams();
                    if (a) {
                        height = (childAt.getLeft() - szVar.leftMargin) - this.f9243g;
                    } else {
                        height = szVar.rightMargin + childAt.getRight();
                    }
                } else if (a) {
                    height = getPaddingLeft();
                } else {
                    height = (getWidth() - getPaddingRight()) - this.f9243g;
                }
                m5822b(canvas, height);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(sy.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(sy.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int paddingRight;
        int paddingRight2;
        int childCount;
        int i6;
        int i7;
        int i8;
        int measuredWidth;
        sz szVar;
        int i9;
        if (this.f9239c == 1) {
            paddingLeft = getPaddingLeft();
            i5 = i3 - i;
            paddingRight = i5 - getPaddingRight();
            paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
            childCount = getChildCount();
            i5 = this.f9241e;
            i6 = i5 & 8388615;
            switch (i5 & 112) {
                case 16:
                    i5 = getPaddingTop() + (((i4 - i2) - this.f9244h) / 2);
                    break;
                case 80:
                    i5 = ((getPaddingTop() + i4) - i2) - this.f9244h;
                    break;
                default:
                    i5 = getPaddingTop();
                    break;
            }
            i7 = 0;
            i8 = i5;
            while (i7 < childCount) {
                View childAt = getChildAt(i7);
                if (childAt == null) {
                    i5 = i8;
                } else if (childAt.getVisibility() != 8) {
                    measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    szVar = (sz) childAt.getLayoutParams();
                    i9 = szVar.f9253h;
                    if (i9 < 0) {
                        i9 = i6;
                    }
                    switch (Gravity.getAbsoluteGravity(i9, jm.m4576j(this)) & 7) {
                        case 1:
                            i9 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + szVar.leftMargin) - szVar.rightMargin;
                            break;
                        case 5:
                            i9 = (paddingRight - measuredWidth) - szVar.rightMargin;
                            break;
                        default:
                            i9 = szVar.leftMargin + paddingLeft;
                            break;
                    }
                    if (m5826b(i7)) {
                        i8 += this.f9249m;
                    }
                    i8 += szVar.topMargin;
                    sy.m5823b(childAt, i9, i8, measuredWidth, measuredHeight);
                    i5 = (szVar.bottomMargin + measuredHeight) + i8;
                } else {
                    i5 = i8;
                }
                i7++;
                i8 = i5;
            }
            return;
        }
        boolean a = vx.m6076a(this);
        paddingLeft = getPaddingTop();
        i8 = i4 - i2;
        int paddingBottom = i8 - getPaddingBottom();
        measuredWidth = (i8 - paddingLeft) - getPaddingBottom();
        measuredHeight = getChildCount();
        i8 = this.f9241e;
        paddingRight2 = i8 & 112;
        boolean z2 = this.f9240d;
        int[] iArr = this.f9247k;
        int[] iArr2 = this.f9248l;
        switch (Gravity.getAbsoluteGravity(i8 & 8388615, jm.m4576j(this))) {
            case 1:
                i6 = getPaddingLeft() + (((i3 - i) - this.f9244h) / 2);
                break;
            case 5:
                i6 = ((getPaddingLeft() + i3) - i) - this.f9244h;
                break;
            default:
                i6 = getPaddingLeft();
                break;
        }
        if (a) {
            i9 = measuredHeight - 1;
            i8 = -1;
        } else {
            i9 = 0;
            i8 = 1;
        }
        childCount = 0;
        while (childCount < measuredHeight) {
            int i10 = i9 + (i8 * childCount);
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                i5 = i6;
            } else if (childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                szVar = (sz) childAt2.getLayoutParams();
                if (!z2) {
                    i7 = -1;
                } else if (szVar.height != -1) {
                    i7 = childAt2.getBaseline();
                } else {
                    i7 = -1;
                }
                paddingRight = szVar.f9253h;
                if (paddingRight < 0) {
                    paddingRight = paddingRight2;
                }
                switch (paddingRight & 112) {
                    case 16:
                        i7 = ((((measuredWidth - measuredHeight2) / 2) + paddingLeft) + szVar.topMargin) - szVar.bottomMargin;
                        break;
                    case 48:
                        paddingRight = szVar.topMargin + paddingLeft;
                        if (i7 == -1) {
                            i7 = paddingRight;
                            break;
                        } else {
                            i7 = (iArr[1] - i7) + paddingRight;
                            break;
                        }
                    case 80:
                        paddingRight = (paddingBottom - measuredHeight2) - szVar.bottomMargin;
                        if (i7 == -1) {
                            i7 = paddingRight;
                            break;
                        }
                        i7 = paddingRight - (iArr2[2] - (childAt2.getMeasuredHeight() - i7));
                        break;
                    default:
                        i7 = paddingLeft;
                        break;
                }
                if (m5826b(i10)) {
                    i6 += this.f9243g;
                }
                i6 += szVar.leftMargin;
                sy.m5823b(childAt2, i6, i7, measuredWidth2, measuredHeight2);
                i5 = (szVar.rightMargin + measuredWidth2) + i6;
            } else {
                i5 = i6;
            }
            childCount++;
            i6 = i5;
        }
    }

    public void onMeasure(int i, int i2) {
        int childCount;
        int mode;
        int mode2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        Object obj;
        Object obj2;
        int i7;
        int i8;
        View childAt;
        int i9;
        Object obj3;
        float f2;
        Object obj4;
        int i10;
        int i11;
        Object obj5;
        sz szVar;
        float f3;
        int i12;
        Object obj6;
        int i13;
        int i14;
        int i15;
        int combineMeasuredStates;
        Object obj7;
        int i16;
        View childAt2;
        sz szVar2;
        float f4;
        if (this.f9239c == 1) {
            Object obj8;
            this.f9244h = 0;
            childCount = getChildCount();
            mode = MeasureSpec.getMode(i);
            mode2 = MeasureSpec.getMode(i2);
            i3 = this.f9237a;
            boolean z = this.f9246j;
            i4 = 0;
            int i17 = 0;
            i5 = 0;
            i6 = 0;
            Object obj9 = 1;
            f = 0.0f;
            obj = null;
            obj2 = null;
            i7 = 0;
            i8 = 0;
            while (i8 < childCount) {
                childAt = getChildAt(i8);
                if (childAt == null) {
                    i9 = i7;
                    obj3 = obj2;
                    f2 = f;
                    obj4 = obj9;
                    i10 = i17;
                    i11 = i4;
                    obj5 = obj;
                } else if (childAt.getVisibility() == 8) {
                    i9 = i7;
                    obj3 = obj2;
                    f2 = f;
                    obj4 = obj9;
                    i10 = i17;
                    i11 = i4;
                    obj5 = obj;
                } else {
                    if (m5826b(i8)) {
                        this.f9244h += this.f9249m;
                    }
                    szVar = (sz) childAt.getLayoutParams();
                    f3 = szVar.f9252g;
                    float f5 = f + f3;
                    if (mode2 == 1073741824 && szVar.height == 0 && f3 > 0.0f) {
                        i9 = this.f9244h;
                        this.f9244h = Math.max(i9, (szVar.topMargin + i9) + szVar.bottomMargin);
                        i12 = i7;
                        obj6 = 1;
                    } else {
                        if (szVar.height != 0) {
                            i13 = Integer.MIN_VALUE;
                        } else if (f3 > 0.0f) {
                            szVar.height = -2;
                            i13 = 0;
                        } else {
                            i13 = Integer.MIN_VALUE;
                        }
                        if (f5 == 0.0f) {
                            i10 = this.f9244h;
                        } else {
                            i10 = 0;
                        }
                        m5821a(childAt, i, 0, i2, i10);
                        if (i13 != Integer.MIN_VALUE) {
                            szVar.height = i13;
                        }
                        i9 = childAt.getMeasuredHeight();
                        i14 = this.f9244h;
                        this.f9244h = Math.max(i14, ((i14 + i9) + szVar.topMargin) + szVar.bottomMargin);
                        if (z) {
                            i12 = Math.max(i9, i7);
                            obj6 = obj2;
                        } else {
                            i12 = i7;
                            obj6 = obj2;
                        }
                    }
                    if (i3 >= 0 && i3 == i8 + 1) {
                        this.f9238b = this.f9244h;
                    }
                    if (i8 >= i3 || szVar.f9252g <= 0.0f) {
                        Object obj10;
                        if (mode == 1073741824) {
                            obj8 = obj;
                            obj10 = null;
                        } else if (szVar.width == -1) {
                            obj8 = 1;
                            obj10 = 1;
                        } else {
                            obj8 = obj;
                            obj10 = null;
                        }
                        i15 = szVar.leftMargin + szVar.rightMargin;
                        i14 = childAt.getMeasuredWidth() + i15;
                        int max = Math.max(i4, i14);
                        combineMeasuredStates = View.combineMeasuredStates(i17, childAt.getMeasuredState());
                        if (obj9 == null) {
                            obj7 = null;
                        } else if (szVar.width == -1) {
                            obj7 = 1;
                        } else {
                            obj7 = null;
                        }
                        if (szVar.f9252g > 0.0f) {
                            if (obj10 == null) {
                                i16 = i14;
                            } else {
                                i16 = i15;
                            }
                            i16 = Math.max(i6, i16);
                            i14 = i5;
                        } else {
                            if (obj10 != null) {
                                i14 = i15;
                            }
                            i14 = Math.max(i5, i14);
                            i16 = i6;
                        }
                        f2 = f5;
                        i6 = i16;
                        i5 = i14;
                        i11 = max;
                        obj3 = obj6;
                        obj5 = obj8;
                        i10 = combineMeasuredStates;
                        Object obj11 = obj7;
                        i9 = i12;
                        obj4 = obj11;
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                }
                i8++;
                obj2 = obj3;
                obj = obj5;
                obj9 = obj4;
                i17 = i10;
                i4 = i11;
                f = f2;
                i7 = i9;
            }
            if (this.f9244h > 0 && m5826b(childCount)) {
                this.f9244h += this.f9249m;
            }
            if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
                this.f9244h = 0;
                for (i16 = 0; i16 < childCount; i16++) {
                    childAt2 = getChildAt(i16);
                    if (!(childAt2 == null || childAt2.getVisibility() == 8)) {
                        szVar2 = (sz) childAt2.getLayoutParams();
                        i15 = this.f9244h;
                        this.f9244h = Math.max(i15, szVar2.bottomMargin + ((i15 + i7) + szVar2.topMargin));
                    }
                }
            }
            this.f9244h += getPaddingTop() + getPaddingBottom();
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(this.f9244h, getSuggestedMinimumHeight()), i2, 0);
            i16 = (16777215 & resolveSizeAndState) - this.f9244h;
            if (obj2 != null || (i16 != 0 && f > 0.0f)) {
                f3 = this.f9245i;
                if (f3 > 0.0f) {
                    f = f3;
                }
                this.f9244h = 0;
                combineMeasuredStates = 0;
                Object obj12 = obj9;
                i12 = i5;
                i10 = i17;
                i11 = i4;
                float f6 = f;
                i14 = i16;
                f4 = f6;
                while (combineMeasuredStates < childCount) {
                    View childAt3 = getChildAt(combineMeasuredStates);
                    if (childAt3.getVisibility() == 8) {
                        f3 = f4;
                        i16 = i14;
                        obj5 = obj12;
                        i15 = i12;
                        i12 = i10;
                        i10 = i11;
                    } else {
                        szVar2 = (sz) childAt3.getLayoutParams();
                        float f7 = szVar2.f9252g;
                        if (f7 > 0.0f) {
                            i6 = (int) ((((float) i14) * f7) / f4);
                            f7 = f4 - f7;
                            i14 -= i6;
                            i7 = sy.getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + szVar2.leftMargin) + szVar2.rightMargin, szVar2.width);
                            if (szVar2.height == 0 && mode2 == 1073741824) {
                                if (i6 > 0) {
                                    i16 = i6;
                                } else {
                                    i16 = 0;
                                }
                                childAt3.measure(i7, MeasureSpec.makeMeasureSpec(i16, 1073741824));
                            } else {
                                i16 = childAt3.getMeasuredHeight() + i6;
                                if (i16 < 0) {
                                    i16 = 0;
                                }
                                childAt3.measure(i7, MeasureSpec.makeMeasureSpec(i16, 1073741824));
                            }
                            i10 = View.combineMeasuredStates(i10, childAt3.getMeasuredState() & -256);
                            f4 = f7;
                        }
                        i5 = szVar2.rightMargin + szVar2.leftMargin;
                        i6 = childAt3.getMeasuredWidth() + i5;
                        i11 = Math.max(i11, i6);
                        if (mode == 1073741824) {
                            obj8 = null;
                        } else if (szVar2.width == -1) {
                            obj8 = 1;
                        } else {
                            obj8 = null;
                        }
                        if (obj8 != null) {
                            i6 = i5;
                        }
                        i12 = Math.max(i12, i6);
                        if (obj12 == null) {
                            obj12 = null;
                        } else if (szVar2.width == -1) {
                            obj12 = 1;
                        } else {
                            obj12 = null;
                        }
                        i6 = this.f9244h;
                        this.f9244h = Math.max(i6, szVar2.bottomMargin + ((childAt3.getMeasuredHeight() + i6) + szVar2.topMargin));
                        f3 = f4;
                        i16 = i14;
                        obj5 = obj12;
                        i15 = i12;
                        i12 = i10;
                        i10 = i11;
                    }
                    combineMeasuredStates++;
                    i11 = i10;
                    i10 = i12;
                    i12 = i15;
                    obj12 = obj5;
                    i14 = i16;
                    f4 = f3;
                }
                this.f9244h += getPaddingTop() + getPaddingBottom();
                obj9 = obj12;
                i9 = i12;
                i17 = i10;
                i16 = i11;
            } else {
                i12 = Math.max(i5, i6);
                if (!z) {
                    i9 = i12;
                    i16 = i4;
                } else if (mode2 != 1073741824) {
                    for (i16 = 0; i16 < childCount; i16++) {
                        View childAt4 = getChildAt(i16);
                        if (!(childAt4 == null || childAt4.getVisibility() == 8 || ((sz) childAt4.getLayoutParams()).f9252g <= 0.0f)) {
                            childAt4.measure(MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i7, 1073741824));
                        }
                    }
                    i9 = i12;
                    i16 = i4;
                } else {
                    i9 = i12;
                    i16 = i4;
                }
            }
            if (obj9 != null) {
                i9 = i16;
            } else if (mode == 1073741824) {
                i9 = i16;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(i9 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i17), resolveSizeAndState);
            if (obj != null) {
                i14 = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (i6 = 0; i6 < childCount; i6++) {
                    childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8) {
                        szVar = (sz) childAt.getLayoutParams();
                        if (szVar.width == -1) {
                            i5 = szVar.height;
                            szVar.height = childAt.getMeasuredHeight();
                            measureChildWithMargins(childAt, i14, 0, i2, 0);
                            szVar.height = i5;
                        }
                    }
                }
                return;
            }
            return;
        }
        Object obj13;
        this.f9244h = 0;
        mode = getChildCount();
        mode2 = MeasureSpec.getMode(i);
        i3 = MeasureSpec.getMode(i2);
        if (this.f9247k == null || this.f9248l == null) {
            this.f9247k = new int[4];
            this.f9248l = new int[4];
        }
        int[] iArr = this.f9247k;
        int[] iArr2 = this.f9248l;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z2 = this.f9240d;
        boolean z3 = this.f9246j;
        if (mode2 == 1073741824) {
            obj13 = 1;
        } else {
            obj13 = null;
        }
        i13 = 0;
        i4 = 0;
        i7 = 0;
        i5 = 0;
        Object obj14 = 1;
        f = 0.0f;
        Object obj15 = null;
        obj = null;
        combineMeasuredStates = 0;
        childCount = 0;
        while (childCount < mode) {
            childAt = getChildAt(childCount);
            if (childAt == null) {
                i9 = combineMeasuredStates;
                obj3 = obj;
                f2 = f;
                obj4 = obj14;
                i10 = i4;
                i11 = i13;
                obj5 = obj15;
            } else if (childAt.getVisibility() == 8) {
                i9 = combineMeasuredStates;
                obj3 = obj;
                f2 = f;
                obj4 = obj14;
                i10 = i4;
                i11 = i13;
                obj5 = obj15;
            } else {
                Object obj16;
                if (m5826b(childCount)) {
                    this.f9244h += this.f9243g;
                }
                szVar = (sz) childAt.getLayoutParams();
                f3 = szVar.f9252g;
                float f8 = f + f3;
                if (mode2 == 1073741824 && szVar.width == 0 && f3 > 0.0f) {
                    if (obj13 != null) {
                        this.f9244h += szVar.leftMargin + szVar.rightMargin;
                    } else {
                        i9 = this.f9244h;
                        this.f9244h = Math.max(i9, (szVar.leftMargin + i9) + szVar.rightMargin);
                    }
                    if (z2) {
                        i9 = MeasureSpec.makeMeasureSpec(0, 0);
                        childAt.measure(i9, i9);
                        i12 = combineMeasuredStates;
                        obj6 = obj;
                    } else {
                        i12 = combineMeasuredStates;
                        i10 = 1;
                    }
                } else {
                    if (szVar.width != 0) {
                        i8 = Integer.MIN_VALUE;
                    } else if (f3 > 0.0f) {
                        szVar.width = -2;
                        i8 = 0;
                    } else {
                        i8 = Integer.MIN_VALUE;
                    }
                    if (f8 == 0.0f) {
                        i15 = this.f9244h;
                    } else {
                        i15 = 0;
                    }
                    m5821a(childAt, i, i15, i2, 0);
                    if (i8 != Integer.MIN_VALUE) {
                        szVar.width = i8;
                    }
                    i9 = childAt.getMeasuredWidth();
                    if (obj13 != null) {
                        this.f9244h += (szVar.leftMargin + i9) + szVar.rightMargin;
                    } else {
                        i14 = this.f9244h;
                        this.f9244h = Math.max(i14, ((i14 + i9) + szVar.leftMargin) + szVar.rightMargin);
                    }
                    if (z3) {
                        i12 = Math.max(i9, combineMeasuredStates);
                        obj6 = obj;
                    } else {
                        i12 = combineMeasuredStates;
                        obj6 = obj;
                    }
                }
                if (i3 == 1073741824) {
                    obj2 = obj15;
                    obj16 = null;
                } else if (szVar.height == -1) {
                    obj2 = 1;
                    obj16 = 1;
                } else {
                    obj2 = obj15;
                    obj16 = null;
                }
                i15 = szVar.topMargin + szVar.bottomMargin;
                i14 = childAt.getMeasuredHeight() + i15;
                max = View.combineMeasuredStates(i4, childAt.getMeasuredState());
                if (z2) {
                    i16 = childAt.getBaseline();
                    if (i16 != -1) {
                        i9 = szVar.f9253h;
                        if (i9 < 0) {
                            i9 = this.f9241e;
                        }
                        i9 = (((i9 & 112) >> 4) & -2) >> 1;
                        iArr[i9] = Math.max(iArr[i9], i16);
                        iArr2[i9] = Math.max(iArr2[i9], i14 - i16);
                    }
                }
                resolveSizeAndState = Math.max(i13, i14);
                if (obj14 == null) {
                    obj7 = null;
                } else if (szVar.height == -1) {
                    obj7 = 1;
                } else {
                    obj7 = null;
                }
                if (szVar.f9252g > 0.0f) {
                    if (obj16 == null) {
                        i16 = i14;
                    } else {
                        i16 = i15;
                    }
                    i16 = Math.max(i5, i16);
                    i14 = i7;
                } else {
                    if (obj16 != null) {
                        i14 = i15;
                    }
                    i14 = Math.max(i7, i14);
                    i16 = i5;
                }
                f2 = f8;
                i5 = i16;
                i7 = i14;
                i11 = resolveSizeAndState;
                obj3 = obj6;
                obj5 = obj2;
                i10 = max;
                obj11 = obj7;
                i9 = i12;
                obj4 = obj11;
            }
            childCount++;
            obj = obj3;
            obj15 = obj5;
            obj14 = obj4;
            i4 = i10;
            i13 = i11;
            f = f2;
            combineMeasuredStates = i9;
        }
        if (this.f9244h > 0 && m5826b(mode)) {
            this.f9244h += this.f9243g;
        }
        i9 = iArr[1];
        if (i9 == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
            i10 = i13;
        } else {
            i10 = Math.max(i13, Math.max(iArr[3], Math.max(iArr[0], Math.max(i9, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        }
        if (z3 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f9244h = 0;
            for (i16 = 0; i16 < mode; i16++) {
                childAt2 = getChildAt(i16);
                if (!(childAt2 == null || childAt2.getVisibility() == 8)) {
                    szVar2 = (sz) childAt2.getLayoutParams();
                    if (obj13 != null) {
                        this.f9244h = (szVar2.rightMargin + (szVar2.leftMargin + combineMeasuredStates)) + this.f9244h;
                    } else {
                        i15 = this.f9244h;
                        this.f9244h = Math.max(i15, szVar2.rightMargin + ((i15 + combineMeasuredStates) + szVar2.leftMargin));
                    }
                }
            }
        }
        this.f9244h += getPaddingLeft() + getPaddingRight();
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(this.f9244h, getSuggestedMinimumWidth()), i, 0);
        i12 = (16777215 & resolveSizeAndState2) - this.f9244h;
        if (obj != null || (i12 != 0 && f > 0.0f)) {
            f3 = this.f9245i;
            if (f3 <= 0.0f) {
                f3 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f9244h = 0;
            i10 = -1;
            max = 0;
            Object obj17 = obj14;
            i14 = i7;
            i15 = i4;
            f4 = f3;
            while (max < mode) {
                View childAt5 = getChildAt(max);
                if (childAt5 == null) {
                    f3 = f4;
                    i16 = i14;
                    i14 = i15;
                    i15 = i12;
                    i12 = i10;
                    obj6 = obj17;
                } else if (childAt5.getVisibility() == 8) {
                    f3 = f4;
                    i16 = i14;
                    i14 = i15;
                    i15 = i12;
                    i12 = i10;
                    obj6 = obj17;
                } else {
                    Object obj18;
                    szVar2 = (sz) childAt5.getLayoutParams();
                    float f9 = szVar2.f9252g;
                    if (f9 > 0.0f) {
                        i5 = (int) ((((float) i12) * f9) / f4);
                        f9 = f4 - f9;
                        i12 -= i5;
                        combineMeasuredStates = sy.getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + szVar2.topMargin) + szVar2.bottomMargin, szVar2.height);
                        if (szVar2.width == 0 && mode2 == 1073741824) {
                            if (i5 > 0) {
                                i16 = i5;
                            } else {
                                i16 = 0;
                            }
                            childAt5.measure(MeasureSpec.makeMeasureSpec(i16, 1073741824), combineMeasuredStates);
                        } else {
                            i16 = childAt5.getMeasuredWidth() + i5;
                            if (i16 < 0) {
                                i16 = 0;
                            }
                            childAt5.measure(MeasureSpec.makeMeasureSpec(i16, 1073741824), combineMeasuredStates);
                        }
                        i15 = View.combineMeasuredStates(i15, childAt5.getMeasuredState() & -16777216);
                        f4 = f9;
                    }
                    if (obj13 != null) {
                        this.f9244h += (childAt5.getMeasuredWidth() + szVar2.leftMargin) + szVar2.rightMargin;
                    } else {
                        i5 = this.f9244h;
                        this.f9244h = Math.max(i5, ((childAt5.getMeasuredWidth() + i5) + szVar2.leftMargin) + szVar2.rightMargin);
                    }
                    if (i3 == 1073741824) {
                        obj18 = null;
                    } else if (szVar2.height == -1) {
                        obj18 = 1;
                    } else {
                        obj18 = null;
                    }
                    combineMeasuredStates = szVar2.bottomMargin + szVar2.topMargin;
                    i7 = childAt5.getMeasuredHeight() + combineMeasuredStates;
                    i10 = Math.max(i10, i7);
                    if (obj18 == null) {
                        i5 = i7;
                    } else {
                        i5 = combineMeasuredStates;
                    }
                    i14 = Math.max(i14, i5);
                    if (obj17 == null) {
                        obj17 = null;
                    } else if (szVar2.height == -1) {
                        obj17 = 1;
                    } else {
                        obj17 = null;
                    }
                    if (z2) {
                        i5 = childAt5.getBaseline();
                        if (i5 != -1) {
                            i9 = szVar2.f9253h;
                            if (i9 < 0) {
                                i9 = this.f9241e;
                            }
                            i9 = (((i9 & 112) >> 4) & -2) >> 1;
                            iArr[i9] = Math.max(iArr[i9], i5);
                            iArr2[i9] = Math.max(iArr2[i9], i7 - i5);
                            f3 = f4;
                            i16 = i14;
                            i14 = i15;
                            i15 = i12;
                            i12 = i10;
                            obj6 = obj17;
                        } else {
                            f3 = f4;
                            i16 = i14;
                            i14 = i15;
                            i15 = i12;
                            i12 = i10;
                            obj6 = obj17;
                        }
                    } else {
                        f3 = f4;
                        i16 = i14;
                        i14 = i15;
                        i15 = i12;
                        i12 = i10;
                        obj6 = obj17;
                    }
                }
                max++;
                obj17 = obj6;
                i10 = i12;
                i12 = i15;
                i15 = i14;
                i14 = i16;
                f4 = f3;
            }
            this.f9244h += getPaddingLeft() + getPaddingRight();
            i9 = iArr[1];
            if (!(i9 == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i10 = Math.max(i10, Math.max(iArr[3], Math.max(iArr[0], Math.max(i9, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            obj14 = obj17;
            i9 = i14;
            i4 = i15;
            i16 = i10;
        } else {
            i14 = Math.max(i7, i5);
            if (!z3) {
                i9 = i14;
                i16 = i10;
            } else if (mode2 != 1073741824) {
                for (i16 = 0; i16 < mode; i16++) {
                    View childAt6 = getChildAt(i16);
                    if (!(childAt6 == null || childAt6.getVisibility() == 8 || ((sz) childAt6.getLayoutParams()).f9252g <= 0.0f)) {
                        childAt6.measure(MeasureSpec.makeMeasureSpec(combineMeasuredStates, 1073741824), MeasureSpec.makeMeasureSpec(childAt6.getMeasuredHeight(), 1073741824));
                    }
                }
                i9 = i14;
                i16 = i10;
            } else {
                i9 = i14;
                i16 = i10;
            }
        }
        if (obj14 != null) {
            i9 = i16;
        } else if (i3 == 1073741824) {
            i9 = i16;
        }
        setMeasuredDimension((-16777216 & i4) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(i9 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i4 << 16));
        if (obj15 != null) {
            i12 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            for (i6 = 0; i6 < mode; i6++) {
                childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8) {
                    szVar = (sz) childAt.getLayoutParams();
                    if (szVar.height == -1) {
                        i5 = szVar.width;
                        szVar.width = childAt.getMeasuredWidth();
                        measureChildWithMargins(childAt, i, 0, i12, 0);
                        szVar.width = i5;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m5823b(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    /* renamed from: c */
    public final void m5828c(int i) {
        if (this.f9239c != i) {
            this.f9239c = i;
            requestLayout();
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import p000.kvl;
import p000.op;
import p000.or;
import p000.ot;
import p000.pg;
import p000.py;
import p000.qf;
import p000.qg;
import p000.sy;
import p000.sz;
import p000.vx;

/* compiled from: PG */
public class ActionMenuView extends sy implements or, pg {
    /* renamed from: a */
    public op f10072a;
    /* renamed from: b */
    public boolean f10073b;
    /* renamed from: c */
    public py f10074c;
    /* renamed from: h */
    private int f10075h;
    /* renamed from: i */
    private boolean f10076i;
    /* renamed from: j */
    private int f10077j;
    /* renamed from: k */
    private int f10078k;
    /* renamed from: l */
    private int f10079l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9240d = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.f10078k = (int) (56.0f * f);
        this.f10079l = (int) (f * 4.0f);
        this.f10075h = 0;
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof qg);
    }

    /* renamed from: a */
    public final void m6818a() {
        py pyVar = this.f10074c;
        if (pyVar != null) {
            pyVar.m16765b();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: b */
    public static qg m6814b() {
        qg qgVar = new qg();
        qgVar.h = 16;
        return qgVar;
    }

    /* renamed from: c */
    protected final /* synthetic */ sz mo301c() {
        return m6814b();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m6814b();
    }

    /* renamed from: b */
    private final qg m6815b(AttributeSet attributeSet) {
        return new qg(getContext(), attributeSet);
    }

    /* renamed from: a */
    public final /* synthetic */ sz mo299a(AttributeSet attributeSet) {
        return m6815b(attributeSet);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m6815b(attributeSet);
    }

    /* renamed from: a */
    public static qg m6813a(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m6814b();
        }
        qg qgVar;
        if (layoutParams instanceof qg) {
            qgVar = new qg((qg) layoutParams);
        } else {
            qgVar = new qg(layoutParams);
        }
        if (qgVar.h > 0) {
            return qgVar;
        }
        qgVar.h = 16;
        return qgVar;
    }

    /* renamed from: b */
    protected final /* synthetic */ sz mo300b(LayoutParams layoutParams) {
        return m6813a(layoutParams);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m6813a(layoutParams);
    }

    /* renamed from: d */
    private final boolean m6816d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof qf)) {
            z = ((qf) childAt).mo283d();
        }
        if (i <= 0 || !(childAt2 instanceof qf)) {
            return z;
        }
        return ((qf) childAt2).mo284e() | z;
    }

    /* renamed from: a */
    public final void mo130a(op opVar) {
        this.f10072a = opVar;
    }

    /* renamed from: a */
    public final boolean mo285a(ot otVar) {
        return this.f10072a.m14249a((MenuItem) otVar, null, 0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        py pyVar = this.f10074c;
        if (pyVar != null) {
            pyVar.mo2438a(false);
            if (this.f10074c.m16769e()) {
                this.f10074c.m16766c();
                this.f10074c.m16770f();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6818a();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f10076i) {
            int i5;
            qg qgVar;
            int i6;
            int childCount = getChildCount();
            int i7 = (i4 - i2) / 2;
            int i8 = this.f9243g;
            int i9 = i3 - i;
            int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
            boolean a = vx.m6076a(this);
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 8) {
                    i5 = i10;
                    i10 = i11;
                    i11 = paddingRight;
                } else {
                    qgVar = (qg) childAt.getLayoutParams();
                    if (qgVar.f19549a) {
                        i11 = childAt.getMeasuredWidth();
                        if (m6816d(i12)) {
                            i11 += i8;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            i5 = qgVar.leftMargin + getPaddingLeft();
                            i6 = i5 + i11;
                        } else {
                            i6 = (getWidth() - getPaddingRight()) - qgVar.rightMargin;
                            i5 = i6 - i11;
                        }
                        int i13 = i7 - (measuredHeight / 2);
                        childAt.layout(i5, i13, i6, measuredHeight + i13);
                        i11 = paddingRight - i11;
                        int i14 = i10;
                        i10 = 1;
                        i5 = i14;
                    } else {
                        paddingRight -= qgVar.rightMargin + (childAt.getMeasuredWidth() + qgVar.leftMargin);
                        m6816d(i12);
                        i5 = i10 + 1;
                        i10 = i11;
                        i11 = paddingRight;
                    }
                }
                i12++;
                paddingRight = i11;
                i11 = i10;
                i10 = i5;
            }
            if (childCount == 1 && i11 == 0) {
                View childAt2 = getChildAt(0);
                i10 = childAt2.getMeasuredWidth();
                i11 = childAt2.getMeasuredHeight();
                paddingRight = (i9 / 2) - (i10 / 2);
                i6 = i7 - (i11 / 2);
                childAt2.layout(paddingRight, i6, i10 + paddingRight, i11 + i6);
                return;
            }
            i5 = i10 - (i11 ^ 1);
            if (i5 > 0) {
                i5 = paddingRight / i5;
            } else {
                i5 = 0;
            }
            paddingRight = Math.max(0, i5);
            View childAt3;
            if (a) {
                i10 = getWidth() - getPaddingRight();
                i11 = 0;
                while (i11 < childCount) {
                    childAt3 = getChildAt(i11);
                    qgVar = (qg) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() == 8) {
                        i5 = i10;
                    } else if (qgVar.f19549a) {
                        i5 = i10;
                    } else {
                        i10 -= qgVar.rightMargin;
                        i12 = childAt3.getMeasuredWidth();
                        i8 = childAt3.getMeasuredHeight();
                        i9 = i7 - (i8 / 2);
                        childAt3.layout(i10 - i12, i9, i10, i8 + i9);
                        i5 = i10 - ((qgVar.leftMargin + i12) + paddingRight);
                    }
                    i11++;
                    i10 = i5;
                }
                return;
            }
            i10 = getPaddingLeft();
            i11 = 0;
            while (i11 < childCount) {
                childAt3 = getChildAt(i11);
                qgVar = (qg) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8) {
                    i5 = i10;
                } else if (qgVar.f19549a) {
                    i5 = i10;
                } else {
                    i10 += qgVar.leftMargin;
                    i12 = childAt3.getMeasuredWidth();
                    i8 = childAt3.getMeasuredHeight();
                    i9 = i7 - (i8 / 2);
                    childAt3.layout(i10, i9, i10 + i12, i8 + i9);
                    i5 = ((qgVar.rightMargin + i12) + paddingRight) + i10;
                }
                i11++;
                i10 = i5;
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        qg qgVar;
        boolean z2 = this.f10076i;
        if (MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f10076i = z;
        if (z2 != this.f10076i) {
            this.f10077j = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.f10076i) {
            op opVar = this.f10072a;
            if (!(opVar == null || size == this.f10077j)) {
                this.f10077j = size;
                opVar.m14255b(true);
            }
        }
        int childCount = getChildCount();
        if (!this.f10076i) {
            i3 = 0;
        } else if (childCount <= 0) {
            i3 = 0;
        } else {
            int mode = MeasureSpec.getMode(i2);
            size = MeasureSpec.getSize(i);
            int size2 = MeasureSpec.getSize(i2);
            i3 = getPaddingLeft();
            childCount = getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
            int i4 = size - (i3 + childCount);
            size = this.f10078k;
            int i5 = i4 / size;
            i3 = i4 % size;
            if (i5 == 0) {
                setMeasuredDimension(i4, 0);
                return;
            }
            View childAt;
            int i6;
            int makeMeasureSpec;
            int i7;
            Object obj;
            long j;
            int i8 = size + (i3 / i5);
            int childCount2 = getChildCount();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            i3 = 0;
            Object obj2 = null;
            long j2 = 0;
            int i12 = 0;
            while (i12 < childCount2) {
                int i13;
                long j3;
                int i14;
                childAt = getChildAt(i12);
                if (childAt.getVisibility() != 8) {
                    ActionMenuItemView actionMenuItemView;
                    Object obj3;
                    boolean z3;
                    boolean z4 = childAt instanceof ActionMenuItemView;
                    i6 = i3 + 1;
                    if (z4) {
                        size = this.f10079l;
                        childAt.setPadding(size, 0, size, 0);
                    }
                    qgVar = (qg) childAt.getLayoutParams();
                    qgVar.f19554f = false;
                    qgVar.f19551c = 0;
                    qgVar.f19550b = 0;
                    qgVar.f19552d = false;
                    qgVar.leftMargin = 0;
                    qgVar.rightMargin = 0;
                    if (!z4) {
                        z2 = false;
                    } else if (((ActionMenuItemView) childAt).m6776c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    qgVar.f19553e = z2;
                    if (qgVar.f19549a) {
                        i13 = 1;
                    } else {
                        i13 = i5;
                    }
                    qg qgVar2 = (qg) childAt.getLayoutParams();
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(childMeasureSpec) - paddingTop, MeasureSpec.getMode(childMeasureSpec));
                    if (z4) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView == null) {
                        obj3 = null;
                    } else if (actionMenuItemView.m6776c()) {
                        obj3 = 1;
                    } else {
                        obj3 = null;
                    }
                    if (i13 <= 0) {
                        i7 = 0;
                    } else if (obj3 == null || i13 >= 2) {
                        childAt.measure(MeasureSpec.makeMeasureSpec(i8 * i13, kvl.UNSET_ENUM_VALUE), makeMeasureSpec);
                        i13 = childAt.getMeasuredWidth();
                        i7 = i13 / i8;
                        if (i13 % i8 != 0) {
                            i7++;
                        }
                        if (obj3 != null && r9 < 2) {
                            i7 = 2;
                        }
                    } else {
                        i7 = 0;
                    }
                    if (qgVar2.f19549a) {
                        z3 = false;
                    } else if (obj3 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    qgVar2.f19552d = z3;
                    qgVar2.f19550b = i7;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i7 * i8, 1073741824), makeMeasureSpec);
                    i13 = Math.max(i10, i7);
                    if (qgVar.f19552d) {
                        i3 = i11 + 1;
                    } else {
                        i3 = i11;
                    }
                    if (qgVar.f19549a) {
                        obj = 1;
                    } else {
                        obj = obj2;
                    }
                    i11 = i5 - i7;
                    i5 = Math.max(i9, childAt.getMeasuredHeight());
                    if (i7 == 1) {
                        j3 = ((long) (1 << i12)) | j2;
                        i14 = i11;
                        i11 = i3;
                        i3 = i6;
                    } else {
                        j3 = j2;
                        i14 = i11;
                        i11 = i3;
                        i3 = i6;
                    }
                } else {
                    obj = obj2;
                    j3 = j2;
                    i13 = i10;
                    i14 = i5;
                    i5 = i9;
                }
                i12++;
                j2 = j3;
                i10 = i13;
                i9 = i5;
                i5 = i14;
                obj2 = obj;
            }
            Object obj4 = obj2 != null ? i3 == 2 ? 1 : null : null;
            long j4 = j2;
            paddingTop = i5;
            Object obj5 = null;
            while (i11 > 0) {
                if (paddingTop <= 0) {
                    j = j4;
                    break;
                }
                int i15 = LfuScheduler.MAX_PRIORITY;
                i7 = 0;
                j = 0;
                makeMeasureSpec = 0;
                while (makeMeasureSpec < childCount2) {
                    qgVar = (qg) getChildAt(makeMeasureSpec).getLayoutParams();
                    if (qgVar.f19552d) {
                        i6 = qgVar.f19550b;
                        if (i6 < i15) {
                            j = 1 << makeMeasureSpec;
                            size = 1;
                            i7 = i6;
                        } else if (i6 == i15) {
                            j |= 1 << makeMeasureSpec;
                            size = i7 + 1;
                            i7 = i15;
                        } else {
                            size = i7;
                            i7 = i15;
                        }
                    } else {
                        size = i7;
                        i7 = i15;
                    }
                    makeMeasureSpec++;
                    i15 = i7;
                    i7 = size;
                }
                j4 |= j;
                if (i7 > paddingTop) {
                    j = j4;
                    break;
                }
                makeMeasureSpec = i15 + 1;
                j2 = j4;
                i6 = 0;
                i7 = paddingTop;
                while (i6 < childCount2) {
                    View childAt2 = getChildAt(i6);
                    qgVar = (qg) childAt2.getLayoutParams();
                    long j5 = (long) (1 << i6);
                    if ((j & j5) != 0) {
                        if (obj4 != null && qgVar.f19553e && i7 == 1) {
                            i12 = this.f10079l;
                            childAt2.setPadding(i12 + i8, 0, i12, 0);
                        }
                        qgVar.f19550b++;
                        qgVar.f19554f = true;
                        size = i7 - 1;
                    } else if (qgVar.f19550b == makeMeasureSpec) {
                        j2 |= j5;
                        size = i7;
                    } else {
                        size = i7;
                    }
                    i6++;
                    i7 = size;
                }
                j4 = j2;
                paddingTop = i7;
                int i16 = 1;
            }
            j = j4;
            if (obj2 != null) {
                obj = null;
            } else if (i3 == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            if (paddingTop <= 0) {
                obj4 = obj5;
            } else if (j == 0) {
                obj4 = obj5;
            } else if (paddingTop < i3 - 1 || obj != null || i10 > 1) {
                float f;
                float bitCount = (float) Long.bitCount(j);
                if (obj == null) {
                    if (!((1 & j) == 0 || ((qg) getChildAt(0).getLayoutParams()).f19553e)) {
                        bitCount -= 8.0f;
                    }
                    size = childCount2 - 1;
                    f = (((long) (1 << size)) & j) != 0 ? !((qg) getChildAt(size).getLayoutParams()).f19553e ? -0.5f + bitCount : bitCount : bitCount;
                } else {
                    f = bitCount;
                }
                if (f > 0.0f) {
                    i3 = (int) (((float) (paddingTop * i8)) / f);
                } else {
                    i3 = 0;
                }
                i7 = 0;
                obj4 = obj5;
                while (i7 < childCount2) {
                    if ((((long) (1 << i7)) & j) == 0) {
                        obj = obj4;
                    } else {
                        View childAt3 = getChildAt(i7);
                        qgVar = (qg) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            qgVar.f19551c = i3;
                            qgVar.f19554f = true;
                            if (i7 != 0) {
                                obj = 1;
                            } else if (qgVar.f19553e) {
                                obj = 1;
                            } else {
                                qgVar.leftMargin = (-i3) / 2;
                                obj = 1;
                            }
                        } else if (qgVar.f19549a) {
                            qgVar.f19551c = i3;
                            qgVar.f19554f = true;
                            qgVar.rightMargin = (-i3) / 2;
                            obj = 1;
                        } else {
                            if (i7 != 0) {
                                qgVar.leftMargin = i3 / 2;
                            }
                            if (i7 != childCount2 - 1) {
                                qgVar.rightMargin = i3 / 2;
                                obj = obj4;
                            } else {
                                obj = obj4;
                            }
                        }
                    }
                    i7++;
                    obj4 = obj;
                }
            } else {
                obj4 = obj5;
            }
            if (obj4 != null) {
                for (i3 = 0; i3 < childCount2; i3++) {
                    childAt = getChildAt(i3);
                    qgVar = (qg) childAt.getLayoutParams();
                    if (qgVar.f19554f) {
                        childAt.measure(MeasureSpec.makeMeasureSpec(qgVar.f19551c + (qgVar.f19550b * i8), 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode == 1073741824) {
                i9 = size2;
            }
            setMeasuredDimension(i4, i9);
            return;
        }
        while (i3 < childCount) {
            qgVar = (qg) getChildAt(i3).getLayoutParams();
            qgVar.rightMargin = 0;
            qgVar.leftMargin = 0;
            i3++;
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public final void m6819a(int i) {
        if (this.f10075h != i) {
            this.f10075h = i;
            if (i == 0) {
                getContext();
            } else {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* renamed from: a */
    public final void m6821a(py pyVar) {
        this.f10074c = pyVar;
        py pyVar2 = this.f10074c;
        pyVar2.e = this;
        this.f10072a = pyVar2.c;
    }
}

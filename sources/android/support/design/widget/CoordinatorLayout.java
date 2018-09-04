package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C0154do;
import p000.ar;
import p000.bh;
import p000.di;
import p000.dj;
import p000.dk;
import p000.dl;
import p000.dm;
import p000.dn;
import p000.dq;
import p000.ha;
import p000.iw;
import p000.iy;
import p000.ji;
import p000.jj;
import p000.jk;
import p000.jm;
import p000.kj;
import p000.ky;
import p000.ls;

/* compiled from: PG */
public class CoordinatorLayout extends ViewGroup implements ji {
    /* renamed from: e */
    private static final String f9954e;
    /* renamed from: f */
    private static final Class[] f9955f = new Class[]{Context.class, AttributeSet.class};
    /* renamed from: g */
    private static final ThreadLocal f9956g = new ThreadLocal();
    /* renamed from: h */
    private static final Comparator f9957h = new dq();
    /* renamed from: i */
    private static final iw f9958i = new iy(12);
    /* renamed from: a */
    public final ky f9959a;
    /* renamed from: b */
    public kj f9960b;
    /* renamed from: c */
    public boolean f9961c;
    /* renamed from: d */
    public OnHierarchyChangeListener f9962d;
    /* renamed from: j */
    private final List f9963j;
    /* renamed from: k */
    private final List f9964k;
    /* renamed from: l */
    private final List f9965l;
    /* renamed from: m */
    private final int[] f9966m;
    /* renamed from: n */
    private boolean f9967n;
    /* renamed from: o */
    private boolean f9968o;
    /* renamed from: p */
    private int[] f9969p;
    /* renamed from: q */
    private View f9970q;
    /* renamed from: r */
    private View f9971r;
    /* renamed from: s */
    private dn f9972s;
    /* renamed from: t */
    private boolean f9973t;
    /* renamed from: u */
    private Drawable f9974u;
    /* renamed from: v */
    private jk f9975v;
    /* renamed from: w */
    private final jj f9976w;

    static {
        String name;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            name = packageR.getName();
        } else {
            name = null;
        }
        f9954e = name;
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        int i2 = 0;
        super(context, attributeSet, i);
        this.f9963j = new ArrayList();
        this.f9959a = new ky();
        this.f9964k = new ArrayList();
        this.f9965l = new ArrayList();
        this.f9966m = new int[2];
        this.f9976w = new jj();
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ar.f894a, 0, R.style.Widget.Support.CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ar.f894a, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(ar.f903j, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f9969p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f9969p.length;
            while (i2 < length) {
                int[] iArr = this.f9969p;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
                i2++;
            }
        }
        this.f9974u = obtainStyledAttributes.getDrawable(ar.f904k);
        obtainStyledAttributes.recycle();
        m6724b();
        super.setOnHierarchyChangeListener(new dl(this));
    }

    /* renamed from: a */
    private static Rect m6714a() {
        Rect rect = (Rect) f9958i.mo341a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof dm) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final void m6719a(dm dmVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + dmVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - dmVar.rightMargin));
        height = Math.max(getPaddingTop() + dmVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - dmVar.bottomMargin));
        rect.set(width, height, width + i, height + i2);
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    protected void drawableStateChanged() {
        boolean z = false;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9974u;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new dm();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new dm(getContext(), attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof dm) {
            return new dm((dm) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new dm((MarginLayoutParams) layoutParams);
        }
        return new dm(layoutParams);
    }

    /* renamed from: a */
    private final void m6718a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            ls.m5547a((ViewGroup) this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public final List m6729a(View view) {
        ky kyVar = this.f9959a;
        int size = kyVar.f8740b.size();
        Collection collection = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) kyVar.f8740b.m4358d(i);
            if (arrayList != null && arrayList.contains(view)) {
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    Collection collection2 = collection;
                }
                arrayList.add(kyVar.f8740b.m4356b(i));
                collection = arrayList;
            }
        }
        this.f9965l.clear();
        if (collection != null) {
            this.f9965l.addAll(collection);
        }
        return this.f9965l;
    }

    /* renamed from: a */
    private static void m6716a(int i, Rect rect, Rect rect2, dm dmVar, int i2, int i3) {
        int i4 = dmVar.f3134c;
        if (i4 == 0) {
            i4 = 17;
        }
        i4 = Gravity.getAbsoluteGravity(i4, i);
        int absoluteGravity = Gravity.getAbsoluteGravity(m6725c(dmVar.f3135d), i);
        int i5 = i4 & 7;
        int i6 = i4 & 112;
        i4 = absoluteGravity & 112;
        switch (absoluteGravity & 7) {
            case 1:
                absoluteGravity = rect.left + (rect.width() / 2);
                break;
            case 5:
                absoluteGravity = rect.right;
                break;
            default:
                absoluteGravity = rect.left;
                break;
        }
        switch (i4) {
            case 16:
                i4 = rect.top + (rect.height() / 2);
                break;
            case 80:
                i4 = rect.bottom;
                break;
            default:
                i4 = rect.top;
                break;
        }
        switch (i5) {
            case 1:
                absoluteGravity -= i2 / 2;
                break;
            case 5:
                break;
            default:
                absoluteGravity -= i2;
                break;
        }
        switch (i6) {
            case 16:
                i4 -= i3 / 2;
                break;
            case 80:
                break;
            default:
                i4 -= i3;
                break;
        }
        rect2.set(absoluteGravity, i4, absoluteGravity + i2, i4 + i3);
    }

    /* renamed from: b */
    private final int m6722b(int i) {
        int[] iArr = this.f9969p;
        StringBuilder stringBuilder;
        if (iArr == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("No keylines defined for ");
            stringBuilder.append(this);
            stringBuilder.append(" - attempted index lookup ");
            stringBuilder.append(i);
            Log.e("CoordinatorLayout", stringBuilder.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Keyline index ");
            stringBuilder.append(i);
            stringBuilder.append(" out of range for ");
            stringBuilder.append(this);
            Log.e("CoordinatorLayout", stringBuilder.toString());
            return 0;
        }
    }

    public int getNestedScrollAxes() {
        return this.f9976w.f7876a;
    }

    /* renamed from: b */
    private static dm m6723b(View view) {
        dm dmVar = (dm) view.getLayoutParams();
        if (!dmVar.f3133b) {
            if (view instanceof di) {
                dj a = ((di) view).m1614a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                dmVar.m1658a(a);
                dmVar.f3133b = true;
            } else {
                dk dkVar;
                dk dkVar2 = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dkVar2 = (dk) cls.getAnnotation(dk.class);
                    if (dkVar2 != null) {
                        dkVar = dkVar2;
                        break;
                    }
                }
                dkVar = dkVar2;
                if (dkVar != null) {
                    try {
                        dmVar.m1658a((dj) dkVar.m1638a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Throwable e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Default behavior class ");
                        stringBuilder.append(dkVar.m1638a().getName());
                        stringBuilder.append(" could not be instantiated. Did you forget");
                        stringBuilder.append(" a default constructor?");
                        Log.e("CoordinatorLayout", stringBuilder.toString(), e);
                    }
                }
                dmVar.f3133b = true;
            }
        }
        return dmVar;
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: a */
    public final boolean m6735a(View view, int i, int i2) {
        Rect a = m6714a();
        ls.m5547a((ViewGroup) this, view, a);
        try {
            boolean contains = a.contains(i, i2);
            return contains;
        } finally {
            m6717a(a);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m6720a(false);
        if (this.f9973t) {
            if (this.f9972s == null) {
                this.f9972s = new dn(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9972s);
        }
        if (this.f9960b == null && jm.m4573g(this)) {
            jm.m4543B(this);
        }
        this.f9968o = true;
    }

    /* renamed from: a */
    public final void m6730a(int i) {
        int j = jm.m4576j(this);
        int size = this.f9963j.size();
        Rect a = m6714a();
        Rect a2 = m6714a();
        Rect a3 = m6714a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f9963j.get(i2);
            dm dmVar = (dm) view.getLayoutParams();
            int i3;
            dm dmVar2;
            Rect a4;
            Rect a5;
            Rect a6;
            int measuredWidth;
            int measuredHeight;
            Object obj;
            dj djVar;
            int absoluteGravity;
            dm dmVar3;
            dj djVar2;
            Rect a7;
            Rect a8;
            Object obj2;
            int i4;
            Object obj3;
            int i5;
            View view2;
            dm dmVar4;
            boolean z;
            if (i != 0) {
                i3 = 0;
                while (i3 < i2) {
                    if (dmVar.f3143l != ((View) this.f9963j.get(i3))) {
                        dmVar2 = (dm) view.getLayoutParams();
                        if (dmVar2.f3142k != null) {
                            a4 = m6714a();
                            a5 = m6714a();
                            a6 = m6714a();
                            ls.m5547a((ViewGroup) this, dmVar2.f3142k, a4);
                            m6718a(view, false, a5);
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            m6716a(j, a4, a6, dmVar2, measuredWidth, measuredHeight);
                            if (a6.left == a5.left) {
                                obj = 1;
                            } else if (a6.top != a5.top) {
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            m6719a(dmVar2, a6, measuredWidth, measuredHeight);
                            measuredWidth = a6.left - a5.left;
                            measuredHeight = a6.top - a5.top;
                            if (measuredWidth != 0) {
                                jm.m4550a(view, measuredWidth);
                            }
                            if (measuredHeight != 0) {
                                jm.m4565b(view, measuredHeight);
                            }
                            if (obj != null) {
                                djVar = dmVar2.f3132a;
                                if (djVar != null) {
                                    djVar.mo128a(this, view, dmVar2.f3142k);
                                }
                            }
                            m6717a(a4);
                            m6717a(a5);
                            m6717a(a6);
                        }
                    }
                    i3++;
                }
                m6718a(view, true, a2);
                absoluteGravity = Gravity.getAbsoluteGravity(dmVar.f3138g, j);
                switch (absoluteGravity & 112) {
                    case 48:
                        a.top = Math.max(a.top, a2.bottom);
                        break;
                    case 80:
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                        break;
                }
                switch (absoluteGravity & 7) {
                    case 3:
                        a.left = Math.max(a.left, a2.right);
                        break;
                    case 5:
                        a.right = Math.max(a.right, getWidth() - a2.left);
                        break;
                }
                dmVar3 = (dm) view.getLayoutParams();
                djVar2 = dmVar3.f3132a;
                a7 = m6714a();
                a8 = m6714a();
                a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                if (djVar2 != null) {
                }
                a7.set(a8);
                m6717a(a8);
                if (a7.isEmpty()) {
                    m6717a(a7);
                } else {
                    measuredWidth = Gravity.getAbsoluteGravity(dmVar3.f3139h, j);
                    if ((measuredWidth & 48) != 48) {
                        obj2 = null;
                    } else {
                        i4 = (a7.top - dmVar3.topMargin) - dmVar3.f3141j;
                        if (i4 >= a.top) {
                            obj2 = null;
                        } else {
                            m6728d(view, a.top - i4);
                            obj2 = 1;
                        }
                    }
                    if ((measuredWidth & 80) == 80) {
                        measuredHeight = ((getHeight() - a7.bottom) - dmVar3.bottomMargin) + dmVar3.f3141j;
                        if (measuredHeight < a.bottom) {
                            m6728d(view, measuredHeight - a.bottom);
                            obj2 = 1;
                        }
                    }
                    if (obj2 == null) {
                        m6728d(view, 0);
                    }
                    if ((measuredWidth & 3) != 3) {
                        obj2 = null;
                    } else {
                        i4 = (a7.left - dmVar3.leftMargin) - dmVar3.f3140i;
                        if (i4 >= a.left) {
                            obj2 = null;
                        } else {
                            m6726c(view, a.left - i4);
                            obj2 = 1;
                        }
                    }
                    if ((measuredWidth & 5) != 5) {
                        obj3 = obj2;
                    } else {
                        absoluteGravity = dmVar3.f3140i + ((getWidth() - a7.right) - dmVar3.rightMargin);
                        if (absoluteGravity >= a.right) {
                            obj3 = obj2;
                        } else {
                            m6726c(view, absoluteGravity - a.right);
                            obj3 = 1;
                        }
                    }
                    if (obj3 == null) {
                        m6726c(view, 0);
                    }
                    m6717a(a7);
                }
                if (i != 2) {
                    a3.set(((dm) view.getLayoutParams()).f3146o);
                    if (!a3.equals(a2)) {
                        ((dm) view.getLayoutParams()).f3146o.set(a2);
                    }
                }
                for (i5 = i2 + 1; i5 < size; i5++) {
                    view2 = (View) this.f9963j.get(i5);
                    dmVar4 = (dm) view2.getLayoutParams();
                    djVar = dmVar4.f3132a;
                    if (i == 0) {
                        dmVar4.f3145n = false;
                    }
                    switch (i) {
                        case 2:
                            z = true;
                            break;
                        default:
                            z = djVar.mo128a(this, view2, view);
                            break;
                    }
                    if (i != 1) {
                        dmVar4.f3145n = z;
                    }
                }
            } else if (view.getVisibility() == 8) {
                continue;
            } else {
                i3 = 0;
                while (i3 < i2) {
                    if (dmVar.f3143l != ((View) this.f9963j.get(i3))) {
                        dmVar2 = (dm) view.getLayoutParams();
                        if (dmVar2.f3142k != null) {
                            a4 = m6714a();
                            a5 = m6714a();
                            a6 = m6714a();
                            ls.m5547a((ViewGroup) this, dmVar2.f3142k, a4);
                            m6718a(view, false, a5);
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            m6716a(j, a4, a6, dmVar2, measuredWidth, measuredHeight);
                            if (a6.left == a5.left) {
                                obj = 1;
                            } else if (a6.top != a5.top) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            m6719a(dmVar2, a6, measuredWidth, measuredHeight);
                            measuredWidth = a6.left - a5.left;
                            measuredHeight = a6.top - a5.top;
                            if (measuredWidth != 0) {
                                jm.m4550a(view, measuredWidth);
                            }
                            if (measuredHeight != 0) {
                                jm.m4565b(view, measuredHeight);
                            }
                            if (obj != null) {
                                djVar = dmVar2.f3132a;
                                if (djVar != null) {
                                    djVar.mo128a(this, view, dmVar2.f3142k);
                                }
                            }
                            m6717a(a4);
                            m6717a(a5);
                            m6717a(a6);
                        }
                    }
                    i3++;
                }
                m6718a(view, true, a2);
                if (!(dmVar.f3138g == 0 || a2.isEmpty())) {
                    absoluteGravity = Gravity.getAbsoluteGravity(dmVar.f3138g, j);
                    switch (absoluteGravity & 112) {
                        case 48:
                            a.top = Math.max(a.top, a2.bottom);
                            break;
                        case 80:
                            a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                            break;
                    }
                    switch (absoluteGravity & 7) {
                        case 3:
                            a.left = Math.max(a.left, a2.right);
                            break;
                        case 5:
                            a.right = Math.max(a.right, getWidth() - a2.left);
                            break;
                    }
                }
                if (dmVar.f3139h != 0 && view.getVisibility() == 0 && jm.m4590x(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    dmVar3 = (dm) view.getLayoutParams();
                    djVar2 = dmVar3.f3132a;
                    a7 = m6714a();
                    a8 = m6714a();
                    a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (djVar2 != null || !djVar2.mo129a(view, a7)) {
                        a7.set(a8);
                    } else if (!a8.contains(a7)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Rect should be within the child's bounds. Rect:");
                        stringBuilder.append(a7.toShortString());
                        stringBuilder.append(" | Bounds:");
                        stringBuilder.append(a8.toShortString());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    m6717a(a8);
                    if (a7.isEmpty()) {
                        m6717a(a7);
                    } else {
                        measuredWidth = Gravity.getAbsoluteGravity(dmVar3.f3139h, j);
                        if ((measuredWidth & 48) != 48) {
                            i4 = (a7.top - dmVar3.topMargin) - dmVar3.f3141j;
                            if (i4 >= a.top) {
                                m6728d(view, a.top - i4);
                                obj2 = 1;
                            } else {
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if ((measuredWidth & 80) == 80) {
                            measuredHeight = ((getHeight() - a7.bottom) - dmVar3.bottomMargin) + dmVar3.f3141j;
                            if (measuredHeight < a.bottom) {
                                m6728d(view, measuredHeight - a.bottom);
                                obj2 = 1;
                            }
                        }
                        if (obj2 == null) {
                            m6728d(view, 0);
                        }
                        if ((measuredWidth & 3) != 3) {
                            i4 = (a7.left - dmVar3.leftMargin) - dmVar3.f3140i;
                            if (i4 >= a.left) {
                                m6726c(view, a.left - i4);
                                obj2 = 1;
                            } else {
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if ((measuredWidth & 5) != 5) {
                            absoluteGravity = dmVar3.f3140i + ((getWidth() - a7.right) - dmVar3.rightMargin);
                            if (absoluteGravity >= a.right) {
                                m6726c(view, absoluteGravity - a.right);
                                obj3 = 1;
                            } else {
                                obj3 = obj2;
                            }
                        } else {
                            obj3 = obj2;
                        }
                        if (obj3 == null) {
                            m6726c(view, 0);
                        }
                        m6717a(a7);
                    }
                }
                if (i != 2) {
                    a3.set(((dm) view.getLayoutParams()).f3146o);
                    if (!a3.equals(a2)) {
                        ((dm) view.getLayoutParams()).f3146o.set(a2);
                    }
                }
                for (i5 = i2 + 1; i5 < size; i5++) {
                    view2 = (View) this.f9963j.get(i5);
                    dmVar4 = (dm) view2.getLayoutParams();
                    djVar = dmVar4.f3132a;
                    if (djVar != null && djVar.mo3362c(view)) {
                        if (i == 0 && dmVar4.f3145n) {
                            dmVar4.f3145n = false;
                        } else {
                            switch (i) {
                                case 2:
                                    z = true;
                                    break;
                                default:
                                    z = djVar.mo128a(this, view2, view);
                                    break;
                            }
                            if (i != 1) {
                                dmVar4.f3145n = z;
                            }
                        }
                    }
                }
            }
        }
        m6717a(a);
        m6717a(a2);
        m6717a(a3);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6720a(false);
        if (this.f9973t && this.f9972s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9972s);
        }
        View view = this.f9971r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f9968o = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9961c && this.f9974u != null) {
            int d;
            kj kjVar = this.f9960b;
            if (kjVar != null) {
                d = kjVar.m4980d();
            } else {
                d = 0;
            }
            if (d > 0) {
                this.f9974u.setBounds(0, 0, getWidth(), d);
                this.f9974u.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m6720a(true);
        }
        boolean a = m6721a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m6720a(true);
        }
        return a;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int j = jm.m4576j(this);
        int size = this.f9963j.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f9963j.get(i5);
            if (view.getVisibility() != 8) {
                dj djVar = ((dm) view.getLayoutParams()).f3132a;
                if (djVar == null || !djVar.mo118a(this, view, j)) {
                    m6731a(view, j);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m6731a(View view, int i) {
        Object obj;
        dm dmVar = (dm) view.getLayoutParams();
        View view2 = dmVar.f3142k;
        if (view2 != null) {
            obj = null;
        } else if (dmVar.f3137f != -1) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 == null) {
            int i2 = dmVar.f3136e;
            if (i2 >= 0) {
                dmVar = (dm) view.getLayoutParams();
                int absoluteGravity = Gravity.getAbsoluteGravity(m6727d(dmVar.f3134c), i);
                r5 = absoluteGravity & 7;
                int i3 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth = view.getMeasuredWidth();
                absoluteGravity = view.getMeasuredHeight();
                if (i == 1) {
                    i2 = width - i2;
                }
                i2 = m6722b(i2) - measuredWidth;
                switch (r5) {
                    case 1:
                        r4 = i2 + (measuredWidth / 2);
                        break;
                    case 5:
                        r4 = i2 + measuredWidth;
                        break;
                    default:
                        r4 = i2;
                        break;
                }
                switch (i3) {
                    case 16:
                        i2 = absoluteGravity / 2;
                        break;
                    case 80:
                        i2 = absoluteGravity;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                int max = Math.max(getPaddingLeft() + dmVar.leftMargin, Math.min(r4, ((width - getPaddingRight()) - measuredWidth) - dmVar.rightMargin));
                int max2 = Math.max(getPaddingTop() + dmVar.topMargin, Math.min(i2, ((height - getPaddingBottom()) - absoluteGravity) - dmVar.bottomMargin));
                view.layout(max, max2, max + measuredWidth, absoluteGravity + max2);
                return;
            }
            dmVar = (dm) view.getLayoutParams();
            Rect a = m6714a();
            a.set(getPaddingLeft() + dmVar.leftMargin, getPaddingTop() + dmVar.topMargin, (getWidth() - getPaddingRight()) - dmVar.rightMargin, (getHeight() - getPaddingBottom()) - dmVar.bottomMargin);
            if (!(this.f9960b == null || !jm.m4573g(this) || jm.m4573g(view))) {
                a.left += this.f9960b.m4978b();
                a.top += this.f9960b.m4980d();
                a.right -= this.f9960b.m4979c();
                a.bottom -= this.f9960b.m4976a();
            }
            Rect a2 = m6714a();
            ha.m2968a(m6725c(dmVar.f3134c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
            m6717a(a);
            m6717a(a2);
        } else {
            Rect a3 = m6714a();
            Rect a4 = m6714a();
            try {
                ls.m5547a((ViewGroup) this, view2, a3);
                dm dmVar2 = (dm) view.getLayoutParams();
                r4 = view.getMeasuredWidth();
                r5 = view.getMeasuredHeight();
                m6716a(i, a3, a4, dmVar2, r4, r5);
                m6719a(dmVar2, a4, r4, r5);
                view.layout(a4.left, a4.top, a4.right, a4.bottom);
            } finally {
                m6717a(a3);
                m6717a(a4);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        Object obj;
        this.f9963j.clear();
        ky kyVar = this.f9959a;
        int size = kyVar.f8740b.size();
        for (i3 = 0; i3 < size; i3++) {
            ArrayList arrayList = (ArrayList) kyVar.f8740b.m4358d(i3);
            if (arrayList != null) {
                arrayList.clear();
                kyVar.f8739a.mo342a(arrayList);
            }
        }
        kyVar.f8740b.clear();
        size = getChildCount();
        for (i4 = 0; i4 < size; i4++) {
            Object obj2;
            ViewParent childAt = getChildAt(i4);
            dm b = m6723b((View) childAt);
            if (b.f3137f == -1) {
                b.f3143l = null;
                b.f3142k = null;
            } else {
                ViewParent parent;
                View view = b.f3142k;
                if (view != null) {
                    if (view.getId() == b.f3137f) {
                        view = b.f3142k;
                        parent = view.getParent();
                        while (parent != this) {
                            if (parent == null || parent == childAt) {
                                b.f3143l = null;
                                b.f3142k = null;
                                obj2 = null;
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                        }
                        b.f3143l = view;
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                    }
                }
                b.f3142k = findViewById(b.f3137f);
                view = b.f3142k;
                if (view != null) {
                    if (view != this) {
                        parent = view.getParent();
                        while (parent != this && parent != null) {
                            if (parent != childAt) {
                                if (parent instanceof View) {
                                    view = (View) parent;
                                }
                                parent = parent.getParent();
                            } else if (isInEditMode()) {
                                b.f3143l = null;
                                b.f3142k = null;
                            } else {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                        }
                        b.f3143l = view;
                    } else if (isInEditMode()) {
                        b.f3143l = null;
                        b.f3142k = null;
                    } else {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                } else if (isInEditMode()) {
                    b.f3143l = null;
                    b.f3142k = null;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not find CoordinatorLayout descendant view with id ");
                    stringBuilder.append(getResources().getResourceName(b.f3137f));
                    stringBuilder.append(" to anchor view ");
                    stringBuilder.append(childAt);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            this.f9959a.m5480a(childAt);
            for (i3 = 0; i3 < size; i3++) {
                int absoluteGravity;
                dj djVar;
                if (i3 != i4) {
                    View childAt2 = getChildAt(i3);
                    if (childAt2 != b.f3143l) {
                        int j = jm.m4576j(this);
                        absoluteGravity = Gravity.getAbsoluteGravity(((dm) childAt2.getLayoutParams()).f3138g, j);
                        if (absoluteGravity == 0) {
                            obj2 = null;
                        } else if ((Gravity.getAbsoluteGravity(b.f3139h, j) & absoluteGravity) == absoluteGravity) {
                            obj2 = 1;
                        } else {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            djVar = b.f3132a;
                            if (djVar == null) {
                                obj2 = null;
                            } else if (djVar.mo3362c(childAt2)) {
                                obj2 = 1;
                            } else {
                                obj2 = null;
                            }
                        } else {
                            obj2 = 1;
                        }
                    } else {
                        obj2 = 1;
                    }
                    if (obj2 == null) {
                        continue;
                    } else {
                        if (!this.f9959a.f8740b.containsKey(childAt2)) {
                            this.f9959a.m5480a(childAt2);
                        }
                        ky kyVar2 = this.f9959a;
                        if (kyVar2.f8740b.containsKey(childAt2) && kyVar2.f8740b.containsKey(childAt)) {
                            arrayList = (ArrayList) kyVar2.f8740b.get(childAt2);
                            if (arrayList == null) {
                                arrayList = (ArrayList) kyVar2.f8739a.mo341a();
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                kyVar2.f8740b.put(childAt2, arrayList);
                            }
                            arrayList.add(childAt);
                        } else {
                            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                        }
                    }
                }
            }
        }
        List list = this.f9963j;
        kyVar = this.f9959a;
        kyVar.f8741c.clear();
        kyVar.f8742d.clear();
        size = kyVar.f8740b.size();
        for (absoluteGravity = 0; absoluteGravity < size; absoluteGravity++) {
            kyVar.m5481a(kyVar.f8740b.m4356b(absoluteGravity), kyVar.f8741c, kyVar.f8742d);
        }
        list.addAll(kyVar.f8741c);
        Collections.reverse(this.f9963j);
        size = getChildCount();
        for (i3 = 0; i3 < size; i3++) {
            View childAt3 = getChildAt(i3);
            ky kyVar3 = this.f9959a;
            int size2 = kyVar3.f8740b.size();
            for (i4 = 0; i4 < size2; i4++) {
                arrayList = (ArrayList) kyVar3.f8740b.m4358d(i4);
                if (arrayList != null && arrayList.contains(childAt3)) {
                    obj2 = 1;
                    break;
                }
            }
            obj2 = null;
            if (obj2 != null) {
                z = true;
                break;
            }
        }
        z = false;
        if (z != this.f9973t) {
            if (z) {
                if (this.f9968o) {
                    if (this.f9972s == null) {
                        this.f9972s = new dn(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f9972s);
                }
                this.f9973t = true;
            } else {
                if (this.f9968o && this.f9972s != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f9972s);
                }
                this.f9973t = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        i3 = getPaddingTop();
        int paddingRight = getPaddingRight();
        i4 = getPaddingBottom();
        int j2 = jm.m4576j(this);
        if (j2 != 1) {
            Object obj3 = null;
        } else {
            int i5 = 1;
        }
        int mode = MeasureSpec.getMode(i);
        int size3 = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size4 = MeasureSpec.getSize(i2);
        int i6 = paddingLeft + paddingRight;
        int i7 = i3 + i4;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (this.f9960b == null) {
            obj = null;
        } else if (jm.m4573g(this)) {
            obj = 1;
        } else {
            obj = null;
        }
        int size5 = this.f9963j.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size5) {
            View view2 = (View) this.f9963j.get(i9);
            if (view2.getVisibility() == 8) {
                absoluteGravity = i8;
                i3 = suggestedMinimumHeight;
                i4 = suggestedMinimumWidth;
            } else {
                int i10;
                int i11;
                dm dmVar = (dm) view2.getLayoutParams();
                absoluteGravity = dmVar.f3136e;
                if (absoluteGravity < 0) {
                    i10 = 0;
                } else if (mode != 0) {
                    absoluteGravity = m6722b(absoluteGravity);
                    i3 = Gravity.getAbsoluteGravity(m6727d(dmVar.f3134c), j2) & 7;
                    if (i3 == 3) {
                        if (obj3 != null) {
                        }
                        i10 = Math.max(0, (size3 - paddingRight) - absoluteGravity);
                    }
                    if (i3 != 5 || obj3 == null) {
                        if (i3 == 5) {
                            if (obj3 != null) {
                            }
                            i10 = Math.max(0, absoluteGravity - paddingLeft);
                        }
                        if (i3 == 3) {
                            if (j2 != 1) {
                                i10 = 0;
                            }
                            i10 = Math.max(0, absoluteGravity - paddingLeft);
                        } else {
                            i10 = 0;
                        }
                    }
                    i10 = Math.max(0, (size3 - paddingRight) - absoluteGravity);
                } else {
                    i10 = 0;
                }
                if (obj == null) {
                    i11 = i2;
                    size = i;
                } else if (jm.m4573g(view2)) {
                    i11 = i2;
                    size = i;
                } else {
                    absoluteGravity = this.f9960b.m4978b();
                    i3 = this.f9960b.m4979c();
                    i11 = this.f9960b.m4980d();
                    size2 = this.f9960b.m4976a();
                    size = MeasureSpec.makeMeasureSpec(size3 - (absoluteGravity + i3), mode);
                    i11 = MeasureSpec.makeMeasureSpec(size4 - (i11 + size2), mode2);
                }
                djVar = dmVar.f3132a;
                if (djVar == null || !djVar.mo2652a(this, view2, size, i10, i11, 0)) {
                    m6732a(view2, size, i10, i11, 0);
                }
                size = Math.max(suggestedMinimumWidth, ((view2.getMeasuredWidth() + i6) + dmVar.leftMargin) + dmVar.rightMargin);
                i3 = Math.max(suggestedMinimumHeight, ((view2.getMeasuredHeight() + i7) + dmVar.topMargin) + dmVar.bottomMargin);
                absoluteGravity = View.combineMeasuredStates(i8, view2.getMeasuredState());
                i4 = size;
            }
            i9++;
            i8 = absoluteGravity;
            suggestedMinimumHeight = i3;
            suggestedMinimumWidth = i4;
        }
        setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, -16777216 & i8), View.resolveSizeAndState(suggestedMinimumHeight, i2, i8 << 16));
    }

    /* renamed from: a */
    public final void m6732a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        boolean z = false;
        while (i < childCount) {
            boolean z2;
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                z2 = z;
            } else {
                dm dmVar = (dm) childAt.getLayoutParams();
                if (dmVar.m1659a(0)) {
                    dj djVar = dmVar.f3132a;
                    z2 = djVar != null ? djVar.mo126a(this, childAt, view, f, f2) | z : z;
                } else {
                    z2 = z;
                }
            }
            i++;
            z = z2;
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo136a(view, i, i2, iArr, 0);
    }

    /* renamed from: a */
    public final void mo136a(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        Object obj = null;
        int i6 = 0;
        while (i6 < childCount) {
            Object obj2;
            int i7;
            int i8;
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                obj2 = obj;
                i7 = i5;
                i8 = i4;
            } else {
                dm dmVar = (dm) childAt.getLayoutParams();
                if (dmVar.m1659a(i3)) {
                    dj djVar = dmVar.f3132a;
                    if (djVar != null) {
                        int min;
                        int[] iArr2 = this.f9966m;
                        iArr2[1] = 0;
                        iArr2[0] = 0;
                        djVar.mo124a(childAt, view, i2, iArr2, i3);
                        if (i <= 0) {
                            i8 = Math.min(i4, this.f9966m[0]);
                        } else {
                            i8 = Math.max(i4, this.f9966m[0]);
                        }
                        if (i2 <= 0) {
                            min = Math.min(i5, this.f9966m[1]);
                        } else {
                            min = Math.max(i5, this.f9966m[1]);
                        }
                        i7 = min;
                        min = 1;
                    } else {
                        obj2 = obj;
                        i7 = i5;
                        i8 = i4;
                    }
                } else {
                    obj2 = obj;
                    i7 = i5;
                    i8 = i4;
                }
            }
            i6++;
            i5 = i7;
            i4 = i8;
            obj = obj2;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (obj != null) {
            m6730a(1);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo135a(view, i, i2, i3, i4, 0);
    }

    /* renamed from: a */
    public final void mo135a(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (i6 < childCount) {
            int i8;
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                i8 = i7;
            } else {
                dm dmVar = (dm) childAt.getLayoutParams();
                if (dmVar.m1659a(i5)) {
                    dj djVar = dmVar.f3132a;
                    if (djVar != null) {
                        djVar.mo3353a(childAt, i2, i4, i5);
                        i8 = 1;
                    } else {
                        i8 = i7;
                    }
                } else {
                    i8 = i7;
                }
            }
            i6++;
            i7 = i8;
        }
        if (i7 != 0) {
            m6730a(1);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo139b(view2, i, 0);
    }

    /* renamed from: b */
    public final void mo139b(View view, int i, int i2) {
        this.f9976w.f7876a = i;
        this.f9971r = view;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0154do) {
            C0154do c0154do = (C0154do) parcelable;
            super.onRestoreInstanceState(c0154do.f7631e);
            SparseArray sparseArray = c0154do.f13595a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                dj djVar = m6723b(childAt).f3132a;
                if (!(id == -1 || djVar == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        djVar.mo122a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0154do = new C0154do(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            dj djVar = ((dm) childAt.getLayoutParams()).f3132a;
            if (!(id == -1 || djVar == null)) {
                Parcelable a = djVar.mo121a(this, childAt);
                if (a != null) {
                    sparseArray.append(id, a);
                }
            }
        }
        c0154do.f13595a = sparseArray;
        return c0154do;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo137a(view, view2, i, 0);
    }

    /* renamed from: a */
    public final boolean mo137a(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (i3 < childCount) {
            boolean z2;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 8) {
                z2 = z;
            } else {
                dm dmVar = (dm) childAt.getLayoutParams();
                dj djVar = dmVar.f3132a;
                if (djVar != null) {
                    boolean a = djVar.mo125a(i, i2);
                    z |= a;
                    dmVar.m1657a(i2, a);
                    z2 = z;
                } else {
                    dmVar.m1657a(i2, false);
                    z2 = z;
                }
            }
            i3++;
            z = z2;
        }
        return z;
    }

    public void onStopNestedScroll(View view) {
        mo138b(view, 0);
    }

    /* renamed from: b */
    public final void mo138b(View view, int i) {
        this.f9976w.f7876a = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            dm dmVar = (dm) childAt.getLayoutParams();
            if (dmVar.m1659a(i)) {
                dj djVar = dmVar.f3132a;
                if (djVar != null) {
                    djVar.mo123a(childAt, view, i);
                }
                dmVar.m1657a(i, false);
                dmVar.f3145n = false;
            }
        }
        this.f9971r = null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9970q == null) {
            boolean a = m6721a(motionEvent, 1);
            if (a) {
                z = a;
            } else {
                z = a;
                z2 = false;
                if (this.f9970q == null) {
                    z2 |= super.onTouchEvent(motionEvent);
                    motionEvent2 = null;
                } else if (z) {
                    motionEvent2 = null;
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    super.onTouchEvent(motionEvent2);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                if (actionMasked == 1 || actionMasked == 3) {
                    m6720a(false);
                }
                return z2;
            }
        }
        z = false;
        dj djVar = ((dm) this.f9970q.getLayoutParams()).f3132a;
        if (djVar != null) {
            z2 = djVar.mo120b(this, this.f9970q, motionEvent);
        } else {
            z2 = false;
        }
        if (this.f9970q == null) {
            z2 |= super.onTouchEvent(motionEvent);
            motionEvent2 = null;
        } else if (z) {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            motionEvent2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent2);
        } else {
            motionEvent2 = null;
        }
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        m6720a(false);
        return z2;
    }

    /* renamed from: a */
    public static dj m6715a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder stringBuilder;
        if (str.startsWith(".")) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str);
            str = stringBuilder.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f9954e)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(f9954e);
            stringBuilder.append('.');
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        try {
            Map map;
            Map map2 = (Map) f9956g.get();
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                f9956g.set(hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f9955f);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (dj) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Throwable e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Could not inflate Behavior subclass ");
            stringBuilder2.append(str);
            throw new RuntimeException(stringBuilder2.toString(), e);
        }
    }

    /* renamed from: a */
    private final boolean m6721a(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f9964k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            int childDrawingOrder;
            if (isChildrenDrawingOrderEnabled) {
                childDrawingOrder = getChildDrawingOrder(childCount, i2);
            } else {
                childDrawingOrder = i2;
            }
            list.add(getChildAt(childDrawingOrder));
        }
        if (f9957h != null) {
            Collections.sort(list, f9957h);
        }
        int size = list.size();
        boolean z2 = false;
        Object obj = null;
        MotionEvent motionEvent2 = null;
        int i3 = 0;
        while (i3 < size) {
            boolean z3;
            boolean z4;
            Object obj2;
            View view = (View) list.get(i3);
            dm dmVar = (dm) view.getLayoutParams();
            dj djVar = dmVar.f3132a;
            if (!z2) {
                if (obj != null) {
                }
                if (!z2) {
                    z = z2;
                } else if (djVar == null) {
                    switch (i) {
                        case 0:
                            z2 = djVar.mo119a(this, view, motionEvent);
                            break;
                        case 1:
                            z2 = djVar.mo120b(this, view, motionEvent);
                            break;
                    }
                    if (z2) {
                        z = z2;
                    } else {
                        this.f9970q = view;
                        z = z2;
                    }
                } else {
                    z = z2;
                }
                if (dmVar.f3132a == null) {
                    dmVar.f3144m = false;
                }
                z3 = dmVar.f3144m;
                if (z3) {
                    dmVar.f3144m = z3;
                    z4 = z3;
                } else {
                    z4 = true;
                }
                if (!z4) {
                    obj2 = null;
                } else if (z3) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (z4 && r4 == null) {
                    list.clear();
                    return z;
                }
                i3++;
                obj = obj2;
                z2 = z;
            }
            if (actionMasked != 0) {
                if (djVar != null) {
                    MotionEvent obtain;
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    } else {
                        obtain = motionEvent2;
                    }
                    switch (i) {
                        case 0:
                            djVar.mo119a(this, view, obtain);
                            break;
                        case 1:
                            djVar.mo120b(this, view, obtain);
                            break;
                    }
                    z = z2;
                    motionEvent2 = obtain;
                    obj2 = obj;
                } else {
                    obj2 = obj;
                    z = z2;
                }
                i3++;
                obj = obj2;
                z2 = z;
            }
            if (!z2) {
                z = z2;
            } else if (djVar == null) {
                z = z2;
            } else {
                switch (i) {
                    case 0:
                        z2 = djVar.mo119a(this, view, motionEvent);
                        break;
                    case 1:
                        z2 = djVar.mo120b(this, view, motionEvent);
                        break;
                }
                if (z2) {
                    z = z2;
                } else {
                    this.f9970q = view;
                    z = z2;
                }
            }
            if (dmVar.f3132a == null) {
                dmVar.f3144m = false;
            }
            z3 = dmVar.f3144m;
            if (z3) {
                z4 = true;
            } else {
                dmVar.f3144m = z3;
                z4 = z3;
            }
            if (!z4) {
                obj2 = null;
            } else if (z3) {
                obj2 = null;
            } else {
                obj2 = 1;
            }
            list.clear();
            return z;
        }
        z = z2;
        list.clear();
        return z;
    }

    /* renamed from: a */
    private static void m6717a(Rect rect) {
        rect.setEmpty();
        f9958i.mo342a(rect);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        dj djVar = ((dm) view.getLayoutParams()).f3132a;
        if (djVar != null) {
            djVar.mo3360a(this, view, rect);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f9967n) {
            m6720a(false);
            this.f9967n = true;
        }
    }

    /* renamed from: a */
    private final void m6720a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            dj djVar = ((dm) childAt.getLayoutParams()).f3132a;
            if (djVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    djVar.mo119a(this, childAt, obtain);
                } else {
                    djVar.mo120b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((dm) getChildAt(i2).getLayoutParams()).f3144m = false;
        }
        this.f9970q = null;
        this.f9967n = false;
    }

    /* renamed from: c */
    private static int m6725c(int i) {
        int i2;
        if ((i & 7) == 0) {
            i2 = 8388611 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 112) == 0) {
            return i2 | 48;
        }
        return i2;
    }

    /* renamed from: d */
    private static int m6727d(int i) {
        return i == 0 ? 8388661 : i;
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m6724b();
    }

    /* renamed from: c */
    private static void m6726c(View view, int i) {
        dm dmVar = (dm) view.getLayoutParams();
        int i2 = dmVar.f3140i;
        if (i2 != i) {
            jm.m4550a(view, i - i2);
            dmVar.f3140i = i;
        }
    }

    /* renamed from: d */
    private static void m6728d(View view, int i) {
        dm dmVar = (dm) view.getLayoutParams();
        int i2 = dmVar.f3141j;
        if (i2 != i) {
            jm.m4565b(view, i - i2);
            dmVar.f3141j = i;
        }
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9962d = onHierarchyChangeListener;
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f9974u;
        if (drawable != null && drawable.isVisible() != z) {
            this.f9974u.setVisible(z, false);
        }
    }

    /* renamed from: b */
    private final void m6724b() {
        if (jm.m4573g(this)) {
            if (this.f9975v == null) {
                this.f9975v = new bh(this);
            }
            jm.m4560a((View) this, this.f9975v);
            setSystemUiVisibility(DepthmapTask.DEPTH_PROCESSING_LATTICE_HR_MAX_SIZE_PX);
            return;
        }
        jm.m4560a((View) this, null);
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9974u;
    }
}

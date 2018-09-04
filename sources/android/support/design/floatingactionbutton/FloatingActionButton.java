package android.support.design.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.appbar.AppBarLayout;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ImageView.ScaleType;
import com.google.android.GoogleCamera.R;
import java.util.List;
import p000.av;
import p000.bt;
import p000.bu;
import p000.bv;
import p000.bw;
import p000.bx;
import p000.ce;
import p000.cg;
import p000.ci;
import p000.ck;
import p000.cr;
import p000.cs;
import p000.cv;
import p000.df;
import p000.dg;
import p000.dj;
import p000.dk;
import p000.dm;
import p000.iz;
import p000.jm;
import p000.kvl;
import p000.qw;

@dk(a = Behavior.class)
/* compiled from: PG */
public class FloatingActionButton extends cs {
    /* renamed from: a */
    public int f9938a;
    /* renamed from: b */
    public boolean f9939b;
    /* renamed from: c */
    public final Rect f9940c;
    /* renamed from: e */
    private ColorStateList f9941e;
    /* renamed from: f */
    private Mode f9942f;
    /* renamed from: g */
    private int f9943g;
    /* renamed from: h */
    private ColorStateList f9944h;
    /* renamed from: i */
    private int f9945i;
    /* renamed from: j */
    private int f9946j;
    /* renamed from: k */
    private int f9947k;
    /* renamed from: l */
    private final Rect f9948l;
    /* renamed from: m */
    private final qw f9949m;
    /* renamed from: n */
    private final bt f9950n;
    /* renamed from: o */
    private bu f9951o;

    /* compiled from: PG */
    public class BaseBehavior extends dj {
        /* renamed from: a */
        private Rect f9936a;
        /* renamed from: b */
        private boolean f9937b;

        public BaseBehavior() {
            this.f9937b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cg.f1931b);
            this.f9937b = obtainStyledAttributes.getBoolean(cg.f1932c, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo129a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f9940c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        private static boolean m6700a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof dm ? ((dm) layoutParams).f3132a instanceof BottomSheetBehavior : false;
        }

        /* renamed from: a */
        public final void mo127a(dm dmVar) {
            if (dmVar.f3139h == 0) {
                dmVar.f3139h = 80;
            }
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo128a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m6698a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (m6700a(view2)) {
                m6702b(view2, floatingActionButton);
            }
            return false;
        }

        /* renamed from: a */
        private final boolean m6699a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            int i3 = 0;
            List a = coordinatorLayout.m6729a((View) floatingActionButton);
            int size = a.size();
            for (i2 = 0; i2 < size; i2++) {
                View view = (View) a.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m6700a(view) && m6702b(view, floatingActionButton)) {
                        break;
                    }
                }
                m6698a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            }
            coordinatorLayout.m6731a((View) floatingActionButton, i);
            Rect rect = floatingActionButton.f9940c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                dm dmVar = (dm) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - dmVar.rightMargin) {
                    i2 = rect.right;
                } else if (floatingActionButton.getLeft() > dmVar.leftMargin) {
                    i2 = 0;
                } else {
                    i2 = -rect.left;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - dmVar.bottomMargin) {
                    i3 = rect.bottom;
                } else if (floatingActionButton.getTop() <= dmVar.topMargin) {
                    i3 = -rect.top;
                }
                if (i3 != 0) {
                    jm.m4565b((View) floatingActionButton, i3);
                }
                if (i2 != 0) {
                    jm.m4550a((View) floatingActionButton, i2);
                }
            }
            return true;
        }

        /* renamed from: a */
        private final boolean m6701a(View view, FloatingActionButton floatingActionButton) {
            dm dmVar = (dm) floatingActionButton.getLayoutParams();
            if (!this.f9937b) {
                return false;
            }
            if (dmVar.f3137f != view.getId()) {
                return false;
            }
            if (floatingActionButton.f2634d != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private final boolean m6698a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m6701a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f9936a == null) {
                this.f9936a = new Rect();
            }
            Rect rect = this.f9936a;
            ck.m1163a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            int i = rect.bottom;
            throw new NoSuchMethodError();
        }

        /* renamed from: b */
        private final boolean m6702b(View view, FloatingActionButton floatingActionButton) {
            if (!m6701a(view, floatingActionButton)) {
                return false;
            }
            bu a;
            boolean z;
            Animator animator;
            av avVar;
            AnimatorSet a2;
            if (view.getTop() >= ((dm) floatingActionButton.getLayoutParams()).topMargin + (floatingActionButton.getHeight() / 2)) {
                a = floatingActionButton.m6710a();
                if (a.f1592x.getVisibility() != 0) {
                    if (a.f1576b == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (a.f1576b != 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    animator = a.f1577c;
                    if (animator != null) {
                        animator.cancel();
                    }
                    if (a.m982f()) {
                        if (a.f1592x.getVisibility() != 0) {
                            a.f1592x.setAlpha(0.0f);
                            a.f1592x.setScaleY(0.0f);
                            a.f1592x.setScaleX(0.0f);
                            a.m972a(0.0f);
                        }
                        avVar = a.f1578d;
                        if (avVar == null) {
                            if (a.f1580f == null) {
                                a.f1580f = av.m701a(a.f1592x.getContext(), R.animator.design_fab_show_motion_spec);
                            }
                            avVar = a.f1580f;
                        }
                        a2 = a.m969a(avVar, 1.0f, 1.0f, 1.0f);
                        a2.addListener(new bw(a, null));
                        a2.start();
                    } else {
                        a.f1592x.m1452a(0, false);
                        a.f1592x.setAlpha(1.0f);
                        a.f1592x.setScaleY(1.0f);
                        a.f1592x.setScaleX(1.0f);
                        a.m972a(1.0f);
                        if (null != null) {
                            df.m1611c();
                        }
                    }
                }
            } else {
                a = floatingActionButton.m6710a();
                if (a.f1592x.getVisibility() == 0) {
                    if (a.f1576b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (a.f1576b != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    animator = a.f1577c;
                    if (animator != null) {
                        animator.cancel();
                    }
                    if (a.m982f()) {
                        avVar = a.f1579e;
                        if (avVar == null) {
                            if (a.f1581g == null) {
                                a.f1581g = av.m701a(a.f1592x.getContext(), R.animator.design_fab_hide_motion_spec);
                            }
                            avVar = a.f1581g;
                        }
                        a2 = a.m969a(avVar, 0.0f, 0.0f, 0.0f);
                        a2.addListener(new bv(a, null));
                        a2.start();
                    } else {
                        a.f1592x.m1452a(4, false);
                        if (null != null) {
                            df.m1609b();
                        }
                    }
                }
            }
            return true;
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9940c = new Rect();
        this.f9948l = new Rect();
        TypedArray a = cr.m1413a(context, attributeSet, cg.f1930a, i, R.style.Widget.Design.FloatingActionButton);
        this.f9941e = df.m1592a(context, a, cg.f1933d);
        this.f9942f = df.m1593a(a.getInt(cg.f1934e, -1), null);
        this.f9944h = df.m1592a(context, a, cg.f1939j);
        this.f9945i = a.getInt(cg.f1937h, -1);
        this.f9946j = a.getDimensionPixelSize(cg.f1936g, 0);
        this.f9943g = a.getDimensionPixelSize(cg.f1935f, 0);
        float dimension = a.getDimension(3, 0.0f);
        float dimension2 = a.getDimension(6, 0.0f);
        float dimension3 = a.getDimension(7, 0.0f);
        this.f9939b = a.getBoolean(cg.f1940k, false);
        this.f9947k = a.getDimensionPixelSize(cg.f1938i, 0);
        av a2 = av.m702a(context, a, 2);
        av a3 = av.m702a(context, a, 0);
        a.recycle();
        this.f9949m = new qw(this);
        this.f9949m.m5744a(attributeSet, i);
        this.f9950n = new bt(this);
        m6710a().mo649a(this.f9941e, this.f9942f, this.f9944h, this.f9943g);
        bu a4 = m6710a();
        if (a4.f1588n != dimension) {
            a4.f1588n = dimension;
            a4.mo648a(a4.f1588n, a4.f1589o, a4.f1590p);
        }
        a4 = m6710a();
        if (a4.f1589o != dimension2) {
            a4.f1589o = dimension2;
            a4.mo648a(a4.f1588n, a4.f1589o, a4.f1590p);
        }
        a4 = m6710a();
        if (a4.f1590p != dimension3) {
            a4.f1590p = dimension3;
            a4.mo648a(a4.f1588n, a4.f1589o, a4.f1590p);
        }
        a4 = m6710a();
        int i2 = this.f9947k;
        if (a4.f1591q != i2) {
            a4.f1591q = i2;
            a4.m983g();
        }
        m6710a().f1578d = a2;
        m6710a().f1579e = a3;
        setScaleType(ScaleType.MATRIX);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m6710a().mo651a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f9941e;
    }

    public Mode getBackgroundTintMode() {
        return this.f9942f;
    }

    /* renamed from: a */
    final bu m6710a() {
        if (this.f9951o == null) {
            this.f9951o = new ce(this, new cv(this));
        }
        return this.f9951o;
    }

    /* renamed from: b */
    public final int m6711b() {
        return m6707a(this.f9945i);
    }

    /* renamed from: a */
    private final int m6707a(int i) {
        int i2 = this.f9946j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        switch (i) {
            case -1:
                if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                    return m6707a(1);
                }
                return m6707a(0);
            case 1:
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
            default:
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        m6710a().mo652b();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        bu a = m6710a();
        if (a.mo656e()) {
            if (a.f1594z == null) {
                a.f1594z = new bx(a);
            }
            a.f1592x.getViewTreeObserver().addOnPreDrawListener(a.f1594z);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bu a = m6710a();
        if (a.f1594z != null) {
            a.f1592x.getViewTreeObserver().removeOnPreDrawListener(a.f1594z);
            a.f1594z = null;
        }
    }

    protected void onMeasure(int i, int i2) {
        int b = m6711b();
        this.f9938a = (b - this.f9947k) / 2;
        m6710a().m984h();
        b = Math.min(m6708a(b, i), m6708a(b, i2));
        Rect rect = this.f9940c;
        setMeasuredDimension((rect.left + b) + rect.right, (b + rect.top) + rect.bottom);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof dg) {
            dg dgVar = (dg) parcelable;
            super.onRestoreInstanceState(dgVar.f7631e);
            bt btVar = this.f9950n;
            Bundle bundle = (Bundle) dgVar.f13112a.get("expandableWidgetHelper");
            btVar.f1515b = bundle.getBoolean("expanded", false);
            btVar.f1516c = bundle.getInt("expandedComponentIdHint", 0);
            if (btVar.f1515b) {
                ViewParent parent = btVar.f1514a.getParent();
                if (parent instanceof CoordinatorLayout) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                    View view = btVar.f1514a;
                    List list = (List) coordinatorLayout.f9959a.f8740b.get(view);
                    if (list != null && !list.isEmpty()) {
                        for (int i = 0; i < list.size(); i++) {
                            View view2 = (View) list.get(i);
                            dj djVar = ((dm) view2.getLayoutParams()).f3132a;
                            if (djVar != null) {
                                djVar.mo128a(coordinatorLayout, view2, view);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable dgVar = new dg(super.onSaveInstanceState());
        iz izVar = dgVar.f13112a;
        bt btVar = this.f9950n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", btVar.f1515b);
        bundle.putInt("expandedComponentIdHint", btVar.f1516c);
        izVar.put("expandableWidgetHelper", bundle);
        return dgVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            boolean z;
            Rect rect = this.f9948l;
            if (jm.m4590x(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                int i = rect.left;
                Rect rect2 = this.f9940c;
                rect.left = i + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                z = true;
            } else {
                z = false;
            }
            if (z && !this.f9948l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private static int m6708a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        switch (mode) {
            case kvl.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(i, size);
            case 0:
                return i;
            case 1073741824:
                return size;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f9941e != colorStateList) {
            this.f9941e = colorStateList;
            bu a = m6710a();
            Drawable drawable = a.f1584j;
            if (drawable != null) {
                drawable.setTintList(colorStateList);
            }
            ci ciVar = a.f1586l;
            if (ciVar != null) {
                ciVar.m1150a(colorStateList);
            }
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f9942f != mode) {
            this.f9942f = mode;
            Drawable drawable = m6710a().f1584j;
            if (drawable != null) {
                drawable.setTintMode(mode);
            }
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m6710a().m983g();
    }

    public void setImageResource(int i) {
        this.f9949m.m5743a(i);
    }
}

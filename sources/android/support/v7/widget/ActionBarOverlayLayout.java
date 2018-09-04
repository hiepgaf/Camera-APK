package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.app.NotificationCompat.WearableExtender;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import com.google.android.GoogleCamera.R;
import p000.jj;
import p000.jm;
import p000.kvl;
import p000.op;
import p000.pe;
import p000.pf;
import p000.pt;
import p000.pu;
import p000.pv;
import p000.pw;
import p000.px;
import p000.py;
import p000.rt;
import p000.ru;
import p000.vn;
import p000.vx;

/* compiled from: PG */
public class ActionBarOverlayLayout extends ViewGroup implements rt {
    /* renamed from: A */
    private static final int[] f10044A = new int[]{R.attr.actionBarSize, 16842841};
    /* renamed from: B */
    private final jj f10045B;
    /* renamed from: a */
    public int f10046a;
    /* renamed from: b */
    public ActionBarContainer f10047b;
    /* renamed from: c */
    public boolean f10048c;
    /* renamed from: d */
    public boolean f10049d;
    /* renamed from: e */
    public boolean f10050e;
    /* renamed from: f */
    public int f10051f;
    /* renamed from: g */
    public pw f10052g;
    /* renamed from: h */
    public ViewPropertyAnimator f10053h;
    /* renamed from: i */
    public final AnimatorListenerAdapter f10054i;
    /* renamed from: j */
    private int f10055j;
    /* renamed from: k */
    private ContentFrameLayout f10056k;
    /* renamed from: l */
    private ru f10057l;
    /* renamed from: m */
    private Drawable f10058m;
    /* renamed from: n */
    private boolean f10059n;
    /* renamed from: o */
    private boolean f10060o;
    /* renamed from: p */
    private int f10061p;
    /* renamed from: q */
    private final Rect f10062q;
    /* renamed from: r */
    private final Rect f10063r;
    /* renamed from: s */
    private final Rect f10064s;
    /* renamed from: t */
    private final Rect f10065t;
    /* renamed from: u */
    private final Rect f10066u;
    /* renamed from: v */
    private final Rect f10067v;
    /* renamed from: w */
    private final Rect f10068w;
    /* renamed from: x */
    private OverScroller f10069x;
    /* renamed from: y */
    private final Runnable f10070y;
    /* renamed from: z */
    private final Runnable f10071z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10046a = 0;
        this.f10062q = new Rect();
        this.f10063r = new Rect();
        this.f10064s = new Rect();
        this.f10065t = new Rect();
        this.f10066u = new Rect();
        this.f10067v = new Rect();
        this.f10068w = new Rect();
        this.f10054i = new pt(this);
        this.f10070y = new pu(this);
        this.f10071z = new pv(this);
        m6795a(context);
        this.f10045B = new jj();
    }

    /* renamed from: a */
    private static boolean m6796a(View view, Rect rect, boolean z) {
        boolean z2;
        px pxVar = (px) view.getLayoutParams();
        if (pxVar.leftMargin != rect.left) {
            pxVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (pxVar.topMargin != rect.top) {
            pxVar.topMargin = rect.top;
            z2 = true;
        }
        if (pxVar.rightMargin != rect.right) {
            pxVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || pxVar.bottomMargin == rect.bottom) {
            return z2;
        }
        pxVar.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: a */
    public final boolean mo292a() {
        m6799j();
        Toolbar toolbar = this.f10057l.f9146a;
        if (toolbar.getVisibility() == 0) {
            ActionMenuView actionMenuView = toolbar.f710a;
            if (actionMenuView != null && actionMenuView.f10073b) {
                return true;
            }
        }
        return false;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof px;
    }

    /* renamed from: b */
    public final void mo293b() {
        m6799j();
        this.f10057l.m5797a();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f10058m != null && !this.f10059n) {
            int bottom;
            if (this.f10047b.getVisibility() == 0) {
                bottom = (int) ((((float) this.f10047b.getBottom()) + this.f10047b.getTranslationY()) + 0.5f);
            } else {
                bottom = 0;
            }
            this.f10058m.setBounds(0, bottom, getWidth(), this.f10058m.getIntrinsicHeight() + bottom);
            this.f10058m.draw(canvas);
        }
    }

    protected boolean fitSystemWindows(Rect rect) {
        m6799j();
        jm.m4583q(this);
        boolean a = m6796a(this.f10047b, rect, false);
        this.f10065t.set(rect);
        vx.m6075a(this, this.f10065t, this.f10062q);
        if (!this.f10066u.equals(this.f10065t)) {
            this.f10066u.set(this.f10065t);
            a = true;
        }
        if (!this.f10063r.equals(this.f10062q)) {
            this.f10063r.set(this.f10062q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new px();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new px(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new px(layoutParams);
    }

    public int getNestedScrollAxes() {
        return this.f10045B.f7876a;
    }

    /* renamed from: c */
    public final void m6807c() {
        removeCallbacks(this.f10070y);
        removeCallbacks(this.f10071z);
        ViewPropertyAnimator viewPropertyAnimator = this.f10053h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: d */
    public final boolean mo294d() {
        m6799j();
        ActionMenuView actionMenuView = this.f10057l.f9146a.f710a;
        if (actionMenuView != null) {
            boolean z;
            py pyVar = actionMenuView.f10074c;
            if (pyVar == null) {
                z = false;
            } else if (pyVar.m16766c()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m6795a(Context context) {
        boolean z;
        boolean z2 = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f10044A);
        this.f10055j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f10058m = obtainStyledAttributes.getDrawable(1);
        if (this.f10058m == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        }
        this.f10059n = z2;
        this.f10069x = new OverScroller(context);
    }

    /* renamed from: a */
    public final void mo288a(int i) {
        boolean z = true;
        m6799j();
        switch (i) {
            case 2:
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            case 5:
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            case 109:
                this.f10048c = true;
                if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                    z = false;
                }
                this.f10059n = z;
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    public final boolean mo295e() {
        m6799j();
        ActionMenuView actionMenuView = this.f10057l.f9146a.f710a;
        if (actionMenuView != null) {
            boolean z;
            py pyVar = actionMenuView.f10074c;
            if (pyVar == null) {
                z = false;
            } else {
                if (pyVar.f22546m != null) {
                    z = true;
                } else if (pyVar.m16769e()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo296f() {
        m6799j();
        return this.f10057l.f9146a.m511h();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m6795a(getContext());
        jm.m4543B(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6807c();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                px pxVar = (px) childAt.getLayoutParams();
                int i6 = pxVar.leftMargin + paddingLeft;
                int i7 = pxVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        m6799j();
        measureChildWithMargins(this.f10047b, i, 0, i2, 0);
        px pxVar = (px) this.f10047b.getLayoutParams();
        int max = Math.max(0, (this.f10047b.getMeasuredWidth() + pxVar.leftMargin) + pxVar.rightMargin);
        int max2 = Math.max(0, pxVar.bottomMargin + (this.f10047b.getMeasuredHeight() + pxVar.topMargin));
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f10047b.getMeasuredState());
        int q = jm.m4583q(this) & 256;
        if (q == 0) {
            i3 = 0;
        } else {
            boolean z = true;
        }
        if (i3 != 0) {
            i3 = this.f10055j;
        } else if (this.f10047b.getVisibility() == 8) {
            i3 = 0;
        } else {
            i3 = this.f10047b.getMeasuredHeight();
        }
        this.f10064s.set(this.f10062q);
        this.f10067v.set(this.f10065t);
        Rect rect;
        if (this.f10048c || q != 0) {
            rect = this.f10067v;
            rect.top = i3 + rect.top;
        } else {
            rect = this.f10064s;
            rect.top = i3 + rect.top;
        }
        m6796a(this.f10056k, this.f10064s, true);
        if (!this.f10068w.equals(this.f10067v)) {
            this.f10068w.set(this.f10067v);
            this.f10056k.m414a(this.f10067v);
        }
        measureChildWithMargins(this.f10056k, i, 0, i2, 0);
        pxVar = (px) this.f10056k.getLayoutParams();
        q = Math.max(max, (this.f10056k.getMeasuredWidth() + pxVar.leftMargin) + pxVar.rightMargin);
        i3 = Math.max(max2, pxVar.bottomMargin + (this.f10056k.getMeasuredHeight() + pxVar.topMargin));
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f10056k.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(q + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f10060o || !z) {
            return false;
        }
        this.f10069x.fling(0, 0, 0, (int) f2, 0, 0, kvl.UNSET_ENUM_VALUE, LfuScheduler.MAX_PRIORITY);
        if (this.f10069x.getFinalY() > this.f10047b.getHeight()) {
            m6807c();
            this.f10071z.run();
        } else {
            m6807c();
            this.f10070y.run();
        }
        this.f10050e = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f10061p += i2;
        m6797b(this.f10061p);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        int i2;
        this.f10045B.f7876a = i;
        ActionBarContainer actionBarContainer = this.f10047b;
        if (actionBarContainer != null) {
            i2 = -((int) actionBarContainer.getTranslationY());
        } else {
            i2 = 0;
        }
        this.f10061p = i2;
        m6807c();
        pw pwVar = this.f10052g;
        if (pwVar != null) {
            pwVar.mo2394m();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f10047b.getVisibility() != 0) {
            return false;
        }
        return this.f10060o;
    }

    public void onStopNestedScroll(View view) {
        if (this.f10060o && !this.f10050e) {
            if (this.f10061p <= this.f10047b.getHeight()) {
                m6807c();
                postDelayed(this.f10070y, 600);
                return;
            }
            m6807c();
            postDelayed(this.f10071z, 600);
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m6799j();
        int i2 = this.f10051f ^ i;
        this.f10051f = i;
        int i3 = i & 4;
        int i4 = i & 256;
        pw pwVar = this.f10052g;
        if (pwVar != null) {
            boolean z;
            if (i4 == 0) {
                z = true;
            } else {
                z = false;
            }
            pwVar.mo2392f(z);
            if (i3 == 0 || i4 == 0) {
                this.f10052g.mo2395n();
            } else {
                this.f10052g.mo2393l();
            }
        }
        if ((i2 & 256) != 0 && this.f10052g != null) {
            jm.m4543B(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f10046a = i;
        pw pwVar = this.f10052g;
        if (pwVar != null) {
            pwVar.mo2391a(i);
        }
    }

    /* renamed from: j */
    private final void m6799j() {
        if (this.f10056k == null) {
            ru ruVar;
            this.f10056k = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f10047b = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof ru) {
                ruVar = (ru) findViewById;
            } else if (findViewById instanceof Toolbar) {
                ruVar = ((Toolbar) findViewById).m510g();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't make a decor toolbar out of ");
                stringBuilder.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.f10057l = ruVar;
        }
    }

    /* renamed from: b */
    private final void m6797b(int i) {
        m6807c();
        this.f10047b.setTranslationY((float) (-Math.max(0, Math.min(i, this.f10047b.getHeight()))));
    }

    /* renamed from: a */
    public final void m6804a(boolean z) {
        if (z != this.f10060o) {
            this.f10060o = z;
            if (!z) {
                m6807c();
                m6797b(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo289a(Menu menu, pf pfVar) {
        m6799j();
        ru ruVar = this.f10057l;
        if (ruVar.f9152g == null) {
            ruVar.f9152g = new py(ruVar.f9146a.getContext());
        }
        py pyVar = ruVar.f9152g;
        pyVar.f19462d = pfVar;
        Toolbar toolbar = ruVar.f9146a;
        op opVar = (op) menu;
        if (opVar != null || toolbar.f710a != null) {
            if (toolbar.f710a == null) {
                toolbar.f710a = new ActionMenuView(toolbar.getContext());
                toolbar.f710a.m6819a(toolbar.f719j);
                LayoutParams d = Toolbar.m491d();
                d.a = (toolbar.f722m & 112) | WearableExtender.DEFAULT_CONTENT_ICON_GRAVITY;
                toolbar.f710a.setLayoutParams(d);
                toolbar.m501a(toolbar.f710a, false);
            }
            op opVar2 = toolbar.f710a.f10072a;
            if (opVar2 != opVar) {
                if (opVar2 != null) {
                    opVar2.m14254b(toolbar.f727r);
                    opVar2.m14254b(toolbar.f728s);
                }
                if (toolbar.f728s == null) {
                    toolbar.f728s = new vn(toolbar);
                }
                pyVar.f22543j = true;
                if (opVar != null) {
                    opVar.m14247a((pe) pyVar, toolbar.f718i);
                    opVar.m14247a(toolbar.f728s, toolbar.f718i);
                } else {
                    pyVar.mo2435a(toolbar.f718i, null);
                    toolbar.f728s.mo2435a(toolbar.f718i, null);
                    pyVar.mo2438a(true);
                    toolbar.f728s.mo2438a(true);
                }
                toolbar.f710a.m6819a(toolbar.f719j);
                toolbar.f710a.m6821a(pyVar);
                toolbar.f727r = pyVar;
            }
        }
    }

    /* renamed from: g */
    public final void mo297g() {
        m6799j();
        this.f10057l.f9151f = true;
    }

    /* renamed from: h */
    public static void m6798h() {
    }

    /* renamed from: a */
    public final void mo290a(Callback callback) {
        m6799j();
        this.f10057l.f9150e = callback;
    }

    /* renamed from: a */
    public final void mo291a(CharSequence charSequence) {
        m6799j();
        this.f10057l.m5802b(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo298i() {
        m6799j();
        return this.f10057l.f9146a.m512i();
    }
}

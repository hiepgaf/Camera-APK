package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.Trace;
import android.support.v4.app.FragmentTransaction;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import p000.jh;
import p000.jm;
import p000.kvl;
import p000.nl;
import p000.qi;
import p000.qj;
import p000.rp;
import p000.rq;
import p000.rr;
import p000.rv;
import p000.sk;
import p000.ss;
import p000.tr;
import p000.ts;
import p000.tu;
import p000.tv;
import p000.tw;
import p000.tx;
import p000.ua;
import p000.ub;
import p000.ud;
import p000.ue;
import p000.uf;
import p000.ug;
import p000.uj;
import p000.uk;
import p000.ul;
import p000.um;
import p000.up;
import p000.uq;
import p000.ur;
import p000.us;
import p000.uv;
import p000.uw;
import p000.ux;
import p000.uy;
import p000.vw;
import p000.wm;
import p000.wy;

/* compiled from: PG */
public class RecyclerView extends ViewGroup {
    /* renamed from: I */
    public static final Interpolator f650I = new tw();
    /* renamed from: J */
    private static final int[] f651J = new int[]{16843830};
    /* renamed from: K */
    private static final int[] f652K = new int[]{16842987};
    /* renamed from: L */
    private static final Class[] f653L = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    /* renamed from: a */
    public static final boolean f654a = true;
    /* renamed from: b */
    public static final boolean f655b = true;
    /* renamed from: A */
    public final uv f656A;
    /* renamed from: B */
    public List f657B;
    /* renamed from: C */
    public boolean f658C;
    /* renamed from: D */
    public boolean f659D;
    /* renamed from: E */
    public boolean f660E;
    /* renamed from: F */
    public uy f661F;
    /* renamed from: G */
    public final int[] f662G;
    /* renamed from: H */
    public final int[] f663H;
    /* renamed from: M */
    private us f664M;
    /* renamed from: N */
    private boolean f665N;
    /* renamed from: O */
    private final Rect f666O;
    /* renamed from: P */
    private boolean f667P;
    /* renamed from: Q */
    private int f668Q;
    /* renamed from: R */
    private boolean f669R;
    /* renamed from: S */
    private int f670S;
    /* renamed from: T */
    private final AccessibilityManager f671T;
    /* renamed from: U */
    private boolean f672U;
    /* renamed from: V */
    private int f673V;
    /* renamed from: W */
    private int f674W;
    private int aa;
    private int ab;
    private VelocityTracker ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private final int ai;
    private final int aj;
    private float ak;
    private float al;
    private boolean am;
    private final uw an;
    private ud ao;
    private final int[] ap;
    private jh aq;
    private final int[] ar;
    private final int[] as;
    private final List at;
    private Runnable au;
    private final wy av;
    /* renamed from: c */
    public final ur f675c;
    /* renamed from: d */
    public final up f676d;
    /* renamed from: e */
    public ts f677e;
    /* renamed from: f */
    public rp f678f;
    /* renamed from: g */
    public final wm f679g;
    /* renamed from: h */
    public final Rect f680h;
    /* renamed from: i */
    public final RectF f681i;
    /* renamed from: j */
    public tx f682j;
    /* renamed from: k */
    public ug f683k;
    /* renamed from: l */
    public uq f684l;
    /* renamed from: m */
    public final ArrayList f685m;
    /* renamed from: n */
    public final ArrayList f686n;
    /* renamed from: o */
    public ul f687o;
    /* renamed from: p */
    public boolean f688p;
    /* renamed from: q */
    public boolean f689q;
    /* renamed from: r */
    public boolean f690r;
    /* renamed from: s */
    public boolean f691s;
    /* renamed from: t */
    public EdgeEffect f692t;
    /* renamed from: u */
    public EdgeEffect f693u;
    /* renamed from: v */
    public EdgeEffect f694v;
    /* renamed from: w */
    public EdgeEffect f695w;
    /* renamed from: x */
    public ub f696x;
    /* renamed from: y */
    public ss f697y;
    /* renamed from: z */
    public uj f698z;

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        uj ujVar;
        boolean z;
        String stringBuilder;
        StringBuilder stringBuilder2;
        super(context, attributeSet, i);
        this.f675c = new ur(this);
        this.f676d = new up(this);
        this.f679g = new wm();
        tu tuVar = new tu(this);
        this.f680h = new Rect();
        this.f666O = new Rect();
        this.f681i = new RectF();
        this.f685m = new ArrayList();
        this.f686n = new ArrayList();
        this.f668Q = 0;
        this.f691s = false;
        this.f672U = false;
        this.f673V = 0;
        this.f674W = 0;
        ua uaVar = new ua();
        this.f696x = new rv();
        this.aa = 0;
        this.ab = -1;
        this.ak = Float.MIN_VALUE;
        this.al = Float.MIN_VALUE;
        this.am = true;
        this.an = new uw(this);
        if (f655b) {
            ujVar = new uj();
        } else {
            ujVar = null;
        }
        this.f698z = ujVar;
        this.f656A = new uv();
        this.f658C = false;
        this.f659D = false;
        this.ao = new ud(this);
        this.f660E = false;
        this.ap = new int[2];
        this.ar = new int[2];
        this.f662G = new int[2];
        this.as = new int[2];
        this.f663H = new int[2];
        this.at = new ArrayList();
        this.au = new tv(this);
        this.av = new wy(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f652K, i, 0);
            this.f665N = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f665N = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ah = viewConfiguration.getScaledTouchSlop();
        this.ak = viewConfiguration.getScaledHorizontalScrollFactor();
        this.al = viewConfiguration.getScaledVerticalScrollFactor();
        this.ai = viewConfiguration.getScaledMinimumFlingVelocity();
        this.aj = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.f696x.f9298h = this.ao;
        this.f677e = new ts(new qi(this));
        this.f678f = new rp(new rr(this));
        if (jm.m4575i(this) == 0) {
            jm.m4545D(this);
        }
        if (jm.m4574h(this) == 0) {
            jm.m4568c(this, 1);
        }
        this.f671T = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f661F = new uy(this);
        jm.m4559a((View) this, this.f661F);
        if (attributeSet != null) {
            StringBuilder stringBuilder3;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, nl.f8926a, i, 0);
            String string = obtainStyledAttributes2.getString(nl.f8933h);
            if (obtainStyledAttributes2.getInt(nl.f8927b, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f667P = obtainStyledAttributes2.getBoolean(nl.f8928c, false);
            if (this.f667P) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(nl.f8931f);
                Drawable drawable = obtainStyledAttributes2.getDrawable(nl.f8932g);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(nl.f8929d);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(nl.f8930e);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Trying to set fast scroller without both required drawables.");
                    stringBuilder3.append(m471g());
                    throw new IllegalArgumentException(stringBuilder3.toString());
                }
                Resources resources = getContext().getResources();
                sk skVar = new sk(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            }
            obtainStyledAttributes2.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(context.getPackageName());
                        stringBuilder3.append(trim);
                        stringBuilder = stringBuilder3.toString();
                    } else if (trim.contains(".")) {
                        stringBuilder = trim;
                    } else {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(RecyclerView.class.getPackage().getName());
                        stringBuilder3.append('.');
                        stringBuilder3.append(trim);
                        stringBuilder = stringBuilder3.toString();
                    }
                    try {
                        ClassLoader classLoader;
                        Constructor constructor;
                        Object[] objArr;
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class asSubclass = classLoader.loadClass(stringBuilder).asSubclass(ug.class);
                        try {
                            constructor = asSubclass.getConstructor(f653L);
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(0)};
                        } catch (Throwable e) {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        }
                        constructor.setAccessible(true);
                        m451a((ug) constructor.newInstance(objArr));
                    } catch (Throwable e2) {
                        e2.initCause(e);
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(attributeSet.getPositionDescription());
                        stringBuilder2.append(": Error creating LayoutManager ");
                        stringBuilder2.append(stringBuilder);
                        throw new IllegalStateException(stringBuilder2.toString(), e2);
                    } catch (Throwable e3) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(attributeSet.getPositionDescription());
                        stringBuilder2.append(": Unable to find LayoutManager ");
                        stringBuilder2.append(stringBuilder);
                        throw new IllegalStateException(stringBuilder2.toString(), e3);
                    } catch (Throwable e32) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(attributeSet.getPositionDescription());
                        stringBuilder2.append(": Could not instantiate the LayoutManager: ");
                        stringBuilder2.append(stringBuilder);
                        throw new IllegalStateException(stringBuilder2.toString(), e32);
                    } catch (Throwable e322) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(attributeSet.getPositionDescription());
                        stringBuilder2.append(": Could not instantiate the LayoutManager: ");
                        stringBuilder2.append(stringBuilder);
                        throw new IllegalStateException(stringBuilder2.toString(), e322);
                    } catch (Throwable e3222) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(attributeSet.getPositionDescription());
                        stringBuilder2.append(": Cannot access non-public constructor ");
                        stringBuilder2.append(stringBuilder);
                        throw new IllegalStateException(stringBuilder2.toString(), e3222);
                    } catch (Throwable e32222) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(attributeSet.getPositionDescription());
                        stringBuilder2.append(": Class is not a LayoutManager ");
                        stringBuilder2.append(stringBuilder);
                        throw new IllegalStateException(stringBuilder2.toString(), e32222);
                    }
                }
            }
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f651J, i, 0);
                z = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
            } else {
                z = true;
            }
        } else {
            setDescendantFocusability(262144);
            z = true;
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: a */
    public final void m452a(ux uxVar) {
        View view = uxVar.f9369a;
        RecyclerView parent = view.getParent();
        this.f676d.m6005b(m431e(view));
        if (uxVar.m6031l()) {
            this.f678f.m5761a(view, -1, view.getLayoutParams(), true);
        } else if (parent != this) {
            this.f678f.m5762a(view, -1, true);
        } else {
            rp rpVar = this.f678f;
            int a = rpVar.f9139a.m5777a(view);
            if (a < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("view is not a child, cannot hide ");
                stringBuilder.append(view);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            rpVar.f9140b.m5776e(a);
            rpVar.m5760a(view);
        }
    }

    /* renamed from: a */
    public final void m449a(String str) {
        StringBuilder stringBuilder;
        if (m440x()) {
            if (str == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                stringBuilder.append(m471g());
                throw new IllegalStateException(stringBuilder.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.f674W > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(m471g());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(stringBuilder.toString()));
        }
    }

    /* renamed from: q */
    private final void m433q() {
        m415A();
        m459b(0);
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof uk) && this.f683k.mo808a((uk) layoutParams);
    }

    /* renamed from: b */
    public static void m427b(ux uxVar) {
        WeakReference weakReference = uxVar.f9370b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != uxVar.f9369a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            uxVar.f9370b = null;
        }
    }

    /* renamed from: r */
    private final void m434r() {
        int i = 0;
        int b = this.f678f.m5763b();
        for (int i2 = 0; i2 < b; i2++) {
            ux c = m428c(this.f678f.m5768d(i2));
            if (!c.m6035p()) {
                c.m6013a();
            }
        }
        up upVar = this.f676d;
        int size = upVar.f9336c.size();
        for (b = 0; b < size; b++) {
            ((ux) upVar.f9336c.get(b)).m6013a();
        }
        size = upVar.f9334a.size();
        for (b = 0; b < size; b++) {
            ((ux) upVar.f9334a.get(b)).m6013a();
        }
        ArrayList arrayList = upVar.f9335b;
        if (arrayList != null) {
            b = arrayList.size();
            while (i < b) {
                ((ux) upVar.f9335b.get(i)).m6013a();
                i++;
            }
        }
    }

    public int computeHorizontalScrollExtent() {
        ug ugVar = this.f683k;
        if (ugVar != null && ugVar.mo821h()) {
            return this.f683k.mo810b(this.f656A);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        ug ugVar = this.f683k;
        if (ugVar != null && ugVar.mo821h()) {
            return this.f683k.mo812c(this.f656A);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        ug ugVar = this.f683k;
        if (ugVar != null && ugVar.mo821h()) {
            return this.f683k.mo814d(this.f656A);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        ug ugVar = this.f683k;
        if (ugVar != null && ugVar.mo822i()) {
            return this.f683k.mo816e(this.f656A);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        ug ugVar = this.f683k;
        if (ugVar != null && ugVar.mo822i()) {
            return this.f683k.mo818f(this.f656A);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        ug ugVar = this.f683k;
        if (ugVar != null && ugVar.mo822i()) {
            return this.f683k.mo820g(this.f656A);
        }
        return 0;
    }

    /* renamed from: a */
    public final void m446a(int i, int i2) {
        int i3 = 0;
        EdgeEffect edgeEffect = this.f692t;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i <= 0)) {
            this.f692t.onRelease();
            i3 = this.f692t.isFinished();
        }
        edgeEffect = this.f694v;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i >= 0)) {
            this.f694v.onRelease();
            i3 |= this.f694v.isFinished();
        }
        edgeEffect = this.f693u;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i2 <= 0)) {
            this.f693u.onRelease();
            i3 |= this.f693u.isFinished();
        }
        edgeEffect = this.f695w;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i2 >= 0)) {
            this.f695w.onRelease();
            i3 |= this.f695w.isFinished();
        }
        if (i3 != 0) {
            jm.m4542A(this);
        }
    }

    /* renamed from: a */
    public final void m445a() {
        if (!this.f689q || this.f691s) {
            Trace.beginSection("RV FullInvalidate");
            m435s();
            Trace.endSection();
        } else if (this.f677e.m5848b() && this.f677e.m5848b()) {
            Trace.beginSection("RV FullInvalidate");
            m435s();
            Trace.endSection();
        }
    }

    /* renamed from: b */
    public final void m460b(int i, int i2) {
        setMeasuredDimension(ug.m5915a(i, getPaddingLeft() + getPaddingRight(), jm.m4578l(this)), ug.m5915a(i2, getPaddingTop() + getPaddingBottom(), jm.m4577k(this)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: s */
    private final void m435s() {
        /*
        r10 = this;
        r0 = r10.f682j;
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = "RecyclerView";
        r1 = "No adapter attached; skipping layout";
        android.util.Log.e(r0, r1);
    L_0x000b:
        return;
    L_0x000c:
        r0 = r10.f683k;
        if (r0 != 0) goto L_0x0018;
    L_0x0010:
        r0 = "RecyclerView";
        r1 = "No layout manager attached; skipping layout";
        android.util.Log.e(r0, r1);
        goto L_0x000b;
    L_0x0018:
        r0 = r10.f656A;
        r1 = 0;
        r0.f9355i = r1;
        r0 = r0.f9350d;
        r1 = 1;
        if (r0 != r1) goto L_0x0381;
    L_0x0022:
        r10.m436t();
        r0 = r10.f683k;
        r0.m5934a(r10);
        r10.m437u();
    L_0x002d:
        r0 = r10.f656A;
        r1 = 4;
        r0.m6010a(r1);
        r10.m479p();
        r10.m476m();
        r0 = r10.f656A;
        r1 = 1;
        r0.f9350d = r1;
        r0 = r0.f9356j;
        if (r0 == 0) goto L_0x01fe;
    L_0x0042:
        r0 = r10.f678f;
        r0 = r0.m5758a();
        r0 = r0 + -1;
        r2 = r0;
    L_0x004b:
        if (r2 < 0) goto L_0x0164;
    L_0x004d:
        r0 = r10.f678f;
        r0 = r0.m5765b(r2);
        r3 = m428c(r0);
        r0 = r3.m6035p();
        if (r0 == 0) goto L_0x0061;
    L_0x005d:
        r0 = r2 + -1;
        r2 = r0;
        goto L_0x004b;
    L_0x0061:
        r4 = r10.m429d(r3);
        r1 = p000.ub.m5899f();
        r0 = r3.f9369a;
        r6 = r0.getLeft();
        r1.f9304a = r6;
        r6 = r0.getTop();
        r1.f9305b = r6;
        r0.getRight();
        r0.getBottom();
        r0 = r10.f679g;
        r0 = r0.f9464b;
        r0 = r0.m3869b(r4);
        r0 = (p000.ux) r0;
        if (r0 == 0) goto L_0x015d;
    L_0x0089:
        r6 = r0.m6035p();
        if (r6 != 0) goto L_0x015d;
    L_0x008f:
        r6 = r10.f679g;
        r6 = r6.m6150b(r0);
        r7 = r10.f679g;
        r7 = r7.m6150b(r3);
        if (r6 == 0) goto L_0x00a5;
    L_0x009d:
        if (r0 != r3) goto L_0x00a5;
    L_0x009f:
        r0 = r10.f679g;
        r0.m6148a(r3, r1);
        goto L_0x005d;
    L_0x00a5:
        r8 = r10.f679g;
        r9 = 4;
        r8 = r8.m6144a(r0, r9);
        r9 = r10.f679g;
        r9.m6148a(r3, r1);
        r1 = r10.f679g;
        r9 = 8;
        r1 = r1.m6144a(r3, r9);
        if (r8 != 0) goto L_0x0130;
    L_0x00bb:
        r1 = r10.f678f;
        r6 = r1.m5758a();
        r1 = 0;
    L_0x00c2:
        if (r1 >= r6) goto L_0x0109;
    L_0x00c4:
        r7 = r10.f678f;
        r7 = r7.m5765b(r1);
        r7 = m428c(r7);
        if (r7 == r3) goto L_0x0106;
    L_0x00d0:
        r8 = r10.m429d(r7);
        r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r8 != 0) goto L_0x0106;
    L_0x00d8:
        r0 = r10.f682j;
        if (r0 == 0) goto L_0x03bf;
    L_0x00dc:
        r0 = r0.f9296b;
        if (r0 == 0) goto L_0x03bf;
    L_0x00e0:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:";
        r1.append(r2);
        r1.append(r7);
        r2 = " \n View Holder 2:";
        r1.append(r2);
        r1.append(r3);
        r2 = r10.m471g();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0106:
        r1 = r1 + 1;
        goto L_0x00c2;
    L_0x0109:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder ";
        r1.append(r4);
        r1.append(r0);
        r0 = " cannot be found but it is necessary for ";
        r1.append(r0);
        r1.append(r3);
        r0 = r10.m471g();
        r1.append(r0);
        r0 = "RecyclerView";
        r1 = r1.toString();
        android.util.Log.e(r0, r1);
        goto L_0x005d;
    L_0x0130:
        r4 = 0;
        r0.m6019a(r4);
        if (r6 == 0) goto L_0x0139;
    L_0x0136:
        r10.m452a(r0);
    L_0x0139:
        if (r0 == r3) goto L_0x0150;
    L_0x013b:
        if (r7 == 0) goto L_0x0140;
    L_0x013d:
        r10.m452a(r3);
    L_0x0140:
        r0.f9376h = r3;
        r10.m452a(r0);
        r4 = r10.f676d;
        r4.m6005b(r0);
        r4 = 0;
        r3.m6019a(r4);
        r3.f9377i = r0;
    L_0x0150:
        r4 = r10.f696x;
        r0 = r4.mo2490a(r0, r3, r8, r1);
        if (r0 == 0) goto L_0x005d;
    L_0x0158:
        r10.m477n();
        goto L_0x005d;
    L_0x015d:
        r0 = r10.f679g;
        r0.m6148a(r3, r1);
        goto L_0x005d;
    L_0x0164:
        r3 = r10.f679g;
        r4 = r10.av;
        r0 = r3.f9463a;
        r0 = r0.size();
        r0 = r0 + -1;
        r2 = r0;
    L_0x0171:
        if (r2 < 0) goto L_0x01fe;
    L_0x0173:
        r0 = r3.f9463a;
        r0 = r0.m4356b(r2);
        r0 = (p000.ux) r0;
        r1 = r3.f9463a;
        r1 = r1.mo2635c(r2);
        r1 = (p000.vw) r1;
        r5 = r1.f9433a;
        r6 = r5 & 3;
        r7 = 3;
        if (r6 != r7) goto L_0x0194;
    L_0x018a:
        r4.m6211a(r0);
    L_0x018d:
        p000.vw.m6074a(r1);
        r0 = r2 + -1;
        r2 = r0;
        goto L_0x0171;
    L_0x0194:
        r6 = r5 & 1;
        if (r6 == 0) goto L_0x01a6;
    L_0x0198:
        r5 = r1.f9434b;
        if (r5 != 0) goto L_0x01a0;
    L_0x019c:
        r4.m6211a(r0);
        goto L_0x018d;
    L_0x01a0:
        r6 = r1.f9435c;
        r4.m6213b(r0, r5, r6);
        goto L_0x018d;
    L_0x01a6:
        r6 = r5 & 14;
        r7 = 14;
        if (r6 != r7) goto L_0x01b4;
    L_0x01ac:
        r5 = r1.f9434b;
        r6 = r1.f9435c;
        r4.m6212a(r0, r5, r6);
        goto L_0x018d;
    L_0x01b4:
        r6 = r5 & 12;
        r7 = 12;
        if (r6 != r7) goto L_0x01e4;
    L_0x01ba:
        r5 = r1.f9434b;
        r6 = r1.f9435c;
        r7 = 0;
        r0.m6019a(r7);
        r7 = r4.f9491a;
        r8 = r7.f691s;
        if (r8 == 0) goto L_0x01d6;
    L_0x01c8:
        r7 = r7.f696x;
        r0 = r7.mo2490a(r0, r0, r5, r6);
        if (r0 == 0) goto L_0x018d;
    L_0x01d0:
        r0 = r4.f9491a;
        r0.m477n();
        goto L_0x018d;
    L_0x01d6:
        r7 = r7.f696x;
        r0 = r7.mo2492c(r0, r5, r6);
        if (r0 == 0) goto L_0x018d;
    L_0x01de:
        r0 = r4.f9491a;
        r0.m477n();
        goto L_0x018d;
    L_0x01e4:
        r6 = r5 & 4;
        if (r6 == 0) goto L_0x01ef;
    L_0x01e8:
        r5 = r1.f9434b;
        r6 = 0;
        r4.m6213b(r0, r5, r6);
        goto L_0x018d;
    L_0x01ef:
        r5 = r5 & 8;
        if (r5 == 0) goto L_0x01fb;
    L_0x01f3:
        r5 = r1.f9434b;
        r6 = r1.f9435c;
        r4.m6212a(r0, r5, r6);
        goto L_0x018d;
    L_0x01fb:
        r0 = r1.f9433a;
        goto L_0x018d;
    L_0x01fe:
        r0 = r10.f683k;
        r1 = r10.f676d;
        r0.m5952b(r1);
        r0 = r10.f656A;
        r1 = r0.f9351e;
        r0.f9348b = r1;
        r1 = 0;
        r10.f691s = r1;
        r1 = 0;
        r10.f672U = r1;
        r1 = 0;
        r0.f9356j = r1;
        r1 = 0;
        r0.f9357k = r1;
        r0 = r10.f676d;
        r0 = r0.f9335b;
        if (r0 == 0) goto L_0x0220;
    L_0x021d:
        r0.clear();
    L_0x0220:
        r0 = r10.f683k;
        r1 = r0.f9315m;
        if (r1 == 0) goto L_0x0231;
    L_0x0226:
        r1 = 0;
        r0.f9314l = r1;
        r1 = 0;
        r0.f9315m = r1;
        r0 = r10.f676d;
        r0.m6008d();
    L_0x0231:
        r0 = r10.f683k;
        r1 = r10.f656A;
        r0.mo807a(r1);
        r0 = 1;
        r10.m454a(r0);
        r0 = 0;
        r10.m466c(r0);
        r0 = r10.f679g;
        r0.m6145a();
        r0 = r10.ap;
        r1 = 0;
        r1 = r0[r1];
        r2 = 1;
        r2 = r0[r2];
        r10.m423a(r0);
        r0 = r10.ap;
        r3 = 0;
        r3 = r0[r3];
        if (r3 != r1) goto L_0x037e;
    L_0x0257:
        r1 = 1;
        r0 = r0[r1];
        if (r0 != r2) goto L_0x037b;
    L_0x025c:
        r0 = 0;
    L_0x025d:
        if (r0 == 0) goto L_0x0262;
    L_0x025f:
        r10.m458b();
    L_0x0262:
        r0 = r10.am;
        if (r0 == 0) goto L_0x02e2;
    L_0x0266:
        r0 = r10.f682j;
        if (r0 == 0) goto L_0x02e2;
    L_0x026a:
        r0 = r10.hasFocus();
        if (r0 == 0) goto L_0x02e2;
    L_0x0270:
        r0 = r10.getDescendantFocusability();
        r1 = 393216; // 0x60000 float:5.51013E-40 double:1.942745E-318;
        if (r0 == r1) goto L_0x02e2;
    L_0x0278:
        r0 = r10.getDescendantFocusability();
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        if (r0 != r1) goto L_0x0286;
    L_0x0280:
        r0 = r10.isFocused();
        if (r0 != 0) goto L_0x02e2;
    L_0x0286:
        r0 = r10.isFocused();
        if (r0 != 0) goto L_0x0298;
    L_0x028c:
        r0 = r10.getFocusedChild();
        r1 = r10.f678f;
        r0 = r1.m5767c(r0);
        if (r0 == 0) goto L_0x02e2;
    L_0x0298:
        r0 = r10.f656A;
        r4 = r0.f9359m;
        r0 = -1;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x0378;
    L_0x02a2:
        r0 = r10.f682j;
        r1 = r0.f9296b;
        if (r1 != 0) goto L_0x0333;
    L_0x02a8:
        r0 = 0;
    L_0x02a9:
        if (r0 == 0) goto L_0x02bd;
    L_0x02ab:
        r1 = r10.f678f;
        r2 = r0.f9369a;
        r1 = r1.m5767c(r2);
        if (r1 != 0) goto L_0x02bd;
    L_0x02b5:
        r1 = r0.f9369a;
        r1 = r1.hasFocusable();
        if (r1 != 0) goto L_0x0330;
    L_0x02bd:
        r0 = r10.f678f;
        r0 = r0.m5758a();
        if (r0 > 0) goto L_0x02ed;
    L_0x02c5:
        r1 = 0;
    L_0x02c6:
        if (r1 == 0) goto L_0x02e2;
    L_0x02c8:
        r0 = r10.f656A;
        r0 = r0.f9360n;
        r2 = (long) r0;
        r4 = -1;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x02eb;
    L_0x02d3:
        r0 = r1.findViewById(r0);
        if (r0 == 0) goto L_0x02e9;
    L_0x02d9:
        r2 = r0.isFocusable();
        if (r2 == 0) goto L_0x02e7;
    L_0x02df:
        r0.requestFocus();
    L_0x02e2:
        r10.m442z();
        goto L_0x000b;
    L_0x02e7:
        r0 = r1;
        goto L_0x02df;
    L_0x02e9:
        r0 = r1;
        goto L_0x02df;
    L_0x02eb:
        r0 = r1;
        goto L_0x02df;
    L_0x02ed:
        r1 = r10.f656A;
        r0 = r1.f9358l;
        r2 = -1;
        if (r0 != r2) goto L_0x02f5;
    L_0x02f4:
        r0 = 0;
    L_0x02f5:
        r2 = r1.m6009a();
        r1 = r0;
    L_0x02fa:
        if (r1 >= r2) goto L_0x0310;
    L_0x02fc:
        r3 = r10.m444a(r1);
        if (r3 == 0) goto L_0x0310;
    L_0x0302:
        r4 = r3.f9369a;
        r4 = r4.hasFocusable();
        if (r4 == 0) goto L_0x030d;
    L_0x030a:
        r1 = r3.f9369a;
        goto L_0x02c6;
    L_0x030d:
        r1 = r1 + 1;
        goto L_0x02fa;
    L_0x0310:
        r0 = java.lang.Math.min(r2, r0);
        r0 = r0 + -1;
    L_0x0316:
        if (r0 < 0) goto L_0x032e;
    L_0x0318:
        r1 = r10.m444a(r0);
        if (r1 == 0) goto L_0x032c;
    L_0x031e:
        r2 = r1.f9369a;
        r2 = r2.hasFocusable();
        if (r2 == 0) goto L_0x0329;
    L_0x0326:
        r1 = r1.f9369a;
        goto L_0x02c6;
    L_0x0329:
        r0 = r0 + -1;
        goto L_0x0316;
    L_0x032c:
        r1 = 0;
        goto L_0x02c6;
    L_0x032e:
        r1 = 0;
        goto L_0x02c6;
    L_0x0330:
        r1 = r0.f9369a;
        goto L_0x02c6;
    L_0x0333:
        if (r0 == 0) goto L_0x0375;
    L_0x0335:
        if (r1 == 0) goto L_0x0372;
    L_0x0337:
        r0 = r10.f678f;
        r3 = r0.m5763b();
        r1 = 0;
        r0 = 0;
        r2 = r0;
    L_0x0340:
        if (r2 >= r3) goto L_0x036f;
    L_0x0342:
        r0 = r10.f678f;
        r0 = r0.m5768d(r2);
        r0 = m428c(r0);
        if (r0 == 0) goto L_0x036d;
    L_0x034e:
        r6 = r0.m6029j();
        if (r6 == 0) goto L_0x035a;
    L_0x0354:
        r0 = r1;
    L_0x0355:
        r1 = r2 + 1;
        r2 = r1;
        r1 = r0;
        goto L_0x0340;
    L_0x035a:
        r6 = r0.f9373e;
        r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x036b;
    L_0x0360:
        r1 = r10.f678f;
        r6 = r0.f9369a;
        r1 = r1.m5767c(r6);
        if (r1 == 0) goto L_0x02a9;
    L_0x036a:
        goto L_0x0355;
    L_0x036b:
        r0 = r1;
        goto L_0x0355;
    L_0x036d:
        r0 = r1;
        goto L_0x0355;
    L_0x036f:
        r0 = r1;
        goto L_0x02a9;
    L_0x0372:
        r0 = 0;
        goto L_0x02a9;
    L_0x0375:
        r0 = 0;
        goto L_0x02a9;
    L_0x0378:
        r0 = 0;
        goto L_0x02a9;
    L_0x037b:
        r0 = 1;
        goto L_0x025d;
    L_0x037e:
        r0 = 1;
        goto L_0x025d;
    L_0x0381:
        r0 = r10.f677e;
        r1 = r0.f9286b;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x03bd;
    L_0x038b:
        r0 = r0.f9285a;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x03bb;
    L_0x0393:
        r0 = 1;
    L_0x0394:
        if (r0 != 0) goto L_0x03aa;
    L_0x0396:
        r0 = r10.f683k;
        r0 = r0.f9318p;
        r1 = r10.getWidth();
        if (r0 != r1) goto L_0x03aa;
    L_0x03a0:
        r0 = r10.f683k;
        r0 = r0.f9319q;
        r1 = r10.getHeight();
        if (r0 == r1) goto L_0x03b4;
    L_0x03aa:
        r0 = r10.f683k;
        r0.m5934a(r10);
        r10.m437u();
        goto L_0x002d;
    L_0x03b4:
        r0 = r10.f683k;
        r0.m5934a(r10);
        goto L_0x002d;
    L_0x03bb:
        r0 = 0;
        goto L_0x0394;
    L_0x03bd:
        r0 = 0;
        goto L_0x0394;
    L_0x03bf:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:";
        r1.append(r2);
        r1.append(r7);
        r2 = " \n View Holder 2:";
        r1.append(r2);
        r1.append(r3);
        r2 = r10.m471g();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.s():void");
    }

    /* renamed from: t */
    private final void m436t() {
        Object obj;
        int i;
        boolean z;
        boolean z2;
        View view;
        ux uxVar;
        int i2;
        this.f656A.m6010a(1);
        m438v();
        this.f656A.f9355i = false;
        m479p();
        this.f679g.m6145a();
        m476m();
        if (this.f691s) {
            this.f677e.m5849c();
            if (this.f672U) {
                this.f683k.mo3348c();
            }
        }
        if (m441y()) {
            ts tsVar = this.f677e;
            tr trVar = tsVar.f9288d;
            List list = tsVar.f9285a;
            while (true) {
                int i3;
                int i4;
                qj qjVar;
                qj qjVar2;
                int i5;
                int i6;
                int i7;
                Object obj2;
                Object obj3;
                int i8;
                qj qjVar3;
                int i9;
                int i10;
                int i11;
                Object obj4;
                int size = list.size() - 1;
                Object obj5 = null;
                while (size >= 0) {
                    if (((qj) list.get(size)).f9043a != 8) {
                        obj = 1;
                    } else if (obj5 == null) {
                        obj = obj5;
                    } else {
                        i3 = size;
                        if (i3 != -1) {
                            i4 = i3 + 1;
                            qjVar = (qj) list.get(i3);
                            qjVar2 = (qj) list.get(i4);
                            switch (qjVar2.f9043a) {
                                case 1:
                                    i5 = qjVar.f9046d;
                                    i6 = qjVar2.f9044b;
                                    if (i5 >= i6) {
                                        size = -1;
                                    } else {
                                        size = 0;
                                    }
                                    i7 = qjVar.f9044b;
                                    if (i7 < i6) {
                                        size++;
                                    }
                                    if (i6 <= i7) {
                                        qjVar.f9044b = qjVar2.f9046d + i7;
                                    }
                                    i6 = qjVar2.f9044b;
                                    if (i6 <= i5) {
                                        qjVar.f9046d = i5 + qjVar2.f9046d;
                                    }
                                    qjVar2.f9044b = size + i6;
                                    list.set(i3, qjVar2);
                                    list.set(i4, qjVar);
                                    break;
                                case 2:
                                    size = qjVar.f9044b;
                                    i6 = qjVar.f9046d;
                                    if (size >= i6) {
                                        if (qjVar2.f9044b == size) {
                                            obj2 = null;
                                            obj3 = null;
                                        } else if (qjVar2.f9046d != i6 - size) {
                                            obj2 = 1;
                                            obj3 = null;
                                        } else {
                                            obj2 = null;
                                            obj3 = null;
                                        }
                                    } else if (qjVar2.f9044b == i6 + 1) {
                                        obj2 = null;
                                        obj3 = 1;
                                    } else if (qjVar2.f9046d != size - i6) {
                                        obj2 = 1;
                                        obj3 = 1;
                                    } else {
                                        obj2 = null;
                                        obj3 = 1;
                                    }
                                    i7 = qjVar2.f9044b;
                                    if (i6 < i7) {
                                        i8 = qjVar2.f9046d;
                                        if (i6 < i7 + i8) {
                                            qjVar2.f9046d = i8 - 1;
                                            qjVar.f9043a = 2;
                                            qjVar.f9046d = 1;
                                            if (qjVar2.f9046d != 0) {
                                                break;
                                            }
                                            list.remove(i4);
                                            trVar.f9284a.m5850c(qjVar2);
                                            break;
                                        }
                                    }
                                    qjVar2.f9044b = i7 - 1;
                                    i6 = qjVar.f9044b;
                                    i7 = qjVar2.f9044b;
                                    if (i6 > i7) {
                                        qjVar2.f9044b = i7 + 1;
                                        qjVar3 = null;
                                    } else {
                                        i7 += qjVar2.f9046d;
                                        if (i6 < i7) {
                                            qjVar3 = null;
                                        } else {
                                            qjVar3 = trVar.f9284a.m5843a(2, i6 + 1, i7 - i6, null);
                                            qjVar2.f9046d = qjVar.f9044b - qjVar2.f9044b;
                                        }
                                    }
                                    if (obj2 == null) {
                                        if (obj3 == null) {
                                            if (qjVar3 != null) {
                                                size = qjVar.f9044b;
                                                if (size > qjVar3.f9044b) {
                                                    qjVar.f9044b = size - qjVar3.f9046d;
                                                }
                                                size = qjVar.f9046d;
                                                if (size > qjVar3.f9044b) {
                                                    qjVar.f9046d = size - qjVar3.f9046d;
                                                }
                                            }
                                            size = qjVar.f9044b;
                                            if (size > qjVar2.f9044b) {
                                                qjVar.f9044b = size - qjVar2.f9046d;
                                            }
                                            size = qjVar.f9046d;
                                            if (size > qjVar2.f9044b) {
                                                qjVar.f9046d = size - qjVar2.f9046d;
                                            }
                                        } else {
                                            if (qjVar3 != null) {
                                                size = qjVar.f9044b;
                                                if (size >= qjVar3.f9044b) {
                                                    qjVar.f9044b = size - qjVar3.f9046d;
                                                }
                                                size = qjVar.f9046d;
                                                if (size >= qjVar3.f9044b) {
                                                    qjVar.f9046d = size - qjVar3.f9046d;
                                                }
                                            }
                                            size = qjVar.f9044b;
                                            if (size >= qjVar2.f9044b) {
                                                qjVar.f9044b = size - qjVar2.f9046d;
                                            }
                                            size = qjVar.f9046d;
                                            if (size >= qjVar2.f9044b) {
                                                qjVar.f9046d = size - qjVar2.f9046d;
                                            }
                                        }
                                        list.set(i3, qjVar2);
                                        if (qjVar.f9044b == qjVar.f9046d) {
                                            list.set(i4, qjVar);
                                        } else {
                                            list.remove(i4);
                                        }
                                        if (qjVar3 == null) {
                                            break;
                                        }
                                        list.add(i3, qjVar3);
                                        break;
                                    }
                                    list.set(i3, qjVar2);
                                    list.remove(i4);
                                    trVar.f9284a.m5850c(qjVar);
                                    break;
                                case 4:
                                    size = qjVar.f9046d;
                                    i5 = qjVar2.f9044b;
                                    if (size >= i5) {
                                        qjVar2.f9044b = i5 - 1;
                                        obj3 = null;
                                    } else {
                                        i6 = qjVar2.f9046d;
                                        if (size < i5 + i6) {
                                            obj3 = null;
                                        } else {
                                            qjVar2.f9046d = i6 - 1;
                                            obj3 = trVar.f9284a.m5843a(4, qjVar.f9044b, 1, qjVar2.f9045c);
                                        }
                                    }
                                    i5 = qjVar.f9044b;
                                    i6 = qjVar2.f9044b;
                                    if (i5 > i6) {
                                        qjVar2.f9044b = i6 + 1;
                                        obj2 = null;
                                    } else {
                                        i6 += qjVar2.f9046d;
                                        if (i5 >= i6) {
                                            i6 -= i5;
                                            obj2 = trVar.f9284a.m5843a(4, i5 + 1, i6, qjVar2.f9045c);
                                            qjVar2.f9046d -= i6;
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    list.set(i4, qjVar);
                                    if (qjVar2.f9046d <= 0) {
                                        list.set(i3, qjVar2);
                                    } else {
                                        list.remove(i3);
                                        trVar.f9284a.m5850c(qjVar2);
                                    }
                                    if (obj3 != null) {
                                        list.add(i3, obj3);
                                    }
                                    if (obj2 == null) {
                                        break;
                                    }
                                    list.add(i3, obj2);
                                    break;
                                default:
                                    break;
                            }
                        }
                        i4 = tsVar.f9285a.size();
                        for (i9 = 0; i9 < i4; i9++) {
                            qjVar = (qj) tsVar.f9285a.get(i9);
                            switch (qjVar.f9043a) {
                                case 1:
                                    tsVar.m5847b(qjVar);
                                    break;
                                case 2:
                                    i3 = qjVar.f9044b;
                                    i5 = i3 + qjVar.f9046d;
                                    i6 = -1;
                                    size = i3;
                                    i10 = 0;
                                    while (size < i5) {
                                        if (tsVar.f9287c.m5706a(size) == null || tsVar.m5846a(size)) {
                                            if (i6 != 0) {
                                                tsVar.m5845a(tsVar.m5843a(2, i3, i10, null));
                                                obj5 = 1;
                                            } else {
                                                obj5 = null;
                                            }
                                            i6 = 1;
                                        } else {
                                            if (i6 == 1) {
                                                tsVar.m5847b(tsVar.m5843a(2, i3, i10, null));
                                                obj5 = 1;
                                            } else {
                                                obj5 = null;
                                            }
                                            i6 = 0;
                                        }
                                        if (obj5 == null) {
                                            i = size - i10;
                                            size = i5 - i10;
                                            i5 = 1;
                                        } else {
                                            i11 = size;
                                            size = i5;
                                            i5 = i10 + 1;
                                            i = i11;
                                        }
                                        i10 = i5;
                                        i5 = size;
                                        size = i + 1;
                                    }
                                    if (i10 != qjVar.f9046d) {
                                        tsVar.m5850c(qjVar);
                                        qjVar = tsVar.m5843a(2, i3, i10, null);
                                    }
                                    if (i6 != 0) {
                                        tsVar.m5847b(qjVar);
                                        break;
                                    } else {
                                        tsVar.m5845a(qjVar);
                                        break;
                                    }
                                    break;
                                case 4:
                                    i6 = qjVar.f9044b;
                                    i3 = i6 + qjVar.f9046d;
                                    size = 0;
                                    i = -1;
                                    i5 = i6;
                                    while (i6 < i3) {
                                        if (tsVar.f9287c.m5706a(i6) == null || tsVar.m5846a(i6)) {
                                            if (i == 0) {
                                                tsVar.m5845a(tsVar.m5843a(4, i5, size, qjVar.f9045c));
                                                size = 0;
                                                i5 = i6;
                                            }
                                            i = 1;
                                        } else {
                                            if (i == 1) {
                                                tsVar.m5847b(tsVar.m5843a(4, i5, size, qjVar.f9045c));
                                                size = 0;
                                                i5 = i6;
                                            }
                                            i = 0;
                                        }
                                        size++;
                                        i6++;
                                    }
                                    if (size != qjVar.f9046d) {
                                        obj4 = qjVar.f9045c;
                                        tsVar.m5850c(qjVar);
                                        qjVar = tsVar.m5843a(4, i5, size, obj4);
                                    }
                                    if (i != 0) {
                                        tsVar.m5847b(qjVar);
                                        break;
                                    } else {
                                        tsVar.m5845a(qjVar);
                                        break;
                                    }
                                    break;
                                case 8:
                                    tsVar.m5847b(qjVar);
                                    break;
                                default:
                                    break;
                            }
                        }
                        tsVar.f9285a.clear();
                    }
                    size--;
                    obj5 = obj;
                }
                i3 = -1;
                if (i3 != -1) {
                    i4 = i3 + 1;
                    qjVar = (qj) list.get(i3);
                    qjVar2 = (qj) list.get(i4);
                    switch (qjVar2.f9043a) {
                        case 1:
                            i5 = qjVar.f9046d;
                            i6 = qjVar2.f9044b;
                            if (i5 >= i6) {
                                size = 0;
                            } else {
                                size = -1;
                            }
                            i7 = qjVar.f9044b;
                            if (i7 < i6) {
                                size++;
                            }
                            if (i6 <= i7) {
                                qjVar.f9044b = qjVar2.f9046d + i7;
                            }
                            i6 = qjVar2.f9044b;
                            if (i6 <= i5) {
                                qjVar.f9046d = i5 + qjVar2.f9046d;
                            }
                            qjVar2.f9044b = size + i6;
                            list.set(i3, qjVar2);
                            list.set(i4, qjVar);
                            break;
                        case 2:
                            size = qjVar.f9044b;
                            i6 = qjVar.f9046d;
                            if (size >= i6) {
                                if (qjVar2.f9044b == i6 + 1) {
                                    obj2 = null;
                                    obj3 = 1;
                                } else if (qjVar2.f9046d != size - i6) {
                                    obj2 = null;
                                    obj3 = 1;
                                } else {
                                    obj2 = 1;
                                    obj3 = 1;
                                }
                            } else if (qjVar2.f9044b == size) {
                                obj2 = null;
                                obj3 = null;
                            } else if (qjVar2.f9046d != i6 - size) {
                                obj2 = null;
                                obj3 = null;
                            } else {
                                obj2 = 1;
                                obj3 = null;
                            }
                            i7 = qjVar2.f9044b;
                            if (i6 < i7) {
                                i8 = qjVar2.f9046d;
                                if (i6 < i7 + i8) {
                                    qjVar2.f9046d = i8 - 1;
                                    qjVar.f9043a = 2;
                                    qjVar.f9046d = 1;
                                    if (qjVar2.f9046d != 0) {
                                        list.remove(i4);
                                        trVar.f9284a.m5850c(qjVar2);
                                        break;
                                    }
                                    break;
                                }
                            }
                            qjVar2.f9044b = i7 - 1;
                            i6 = qjVar.f9044b;
                            i7 = qjVar2.f9044b;
                            if (i6 > i7) {
                                i7 += qjVar2.f9046d;
                                if (i6 < i7) {
                                    qjVar3 = trVar.f9284a.m5843a(2, i6 + 1, i7 - i6, null);
                                    qjVar2.f9046d = qjVar.f9044b - qjVar2.f9044b;
                                } else {
                                    qjVar3 = null;
                                }
                            } else {
                                qjVar2.f9044b = i7 + 1;
                                qjVar3 = null;
                            }
                            if (obj2 == null) {
                                list.set(i3, qjVar2);
                                list.remove(i4);
                                trVar.f9284a.m5850c(qjVar);
                                break;
                            }
                            if (obj3 == null) {
                                if (qjVar3 != null) {
                                    size = qjVar.f9044b;
                                    if (size >= qjVar3.f9044b) {
                                        qjVar.f9044b = size - qjVar3.f9046d;
                                    }
                                    size = qjVar.f9046d;
                                    if (size >= qjVar3.f9044b) {
                                        qjVar.f9046d = size - qjVar3.f9046d;
                                    }
                                }
                                size = qjVar.f9044b;
                                if (size >= qjVar2.f9044b) {
                                    qjVar.f9044b = size - qjVar2.f9046d;
                                }
                                size = qjVar.f9046d;
                                if (size >= qjVar2.f9044b) {
                                    qjVar.f9046d = size - qjVar2.f9046d;
                                }
                            } else {
                                if (qjVar3 != null) {
                                    size = qjVar.f9044b;
                                    if (size > qjVar3.f9044b) {
                                        qjVar.f9044b = size - qjVar3.f9046d;
                                    }
                                    size = qjVar.f9046d;
                                    if (size > qjVar3.f9044b) {
                                        qjVar.f9046d = size - qjVar3.f9046d;
                                    }
                                }
                                size = qjVar.f9044b;
                                if (size > qjVar2.f9044b) {
                                    qjVar.f9044b = size - qjVar2.f9046d;
                                }
                                size = qjVar.f9046d;
                                if (size > qjVar2.f9044b) {
                                    qjVar.f9046d = size - qjVar2.f9046d;
                                }
                            }
                            list.set(i3, qjVar2);
                            if (qjVar.f9044b == qjVar.f9046d) {
                                list.remove(i4);
                            } else {
                                list.set(i4, qjVar);
                            }
                            if (qjVar3 == null) {
                                list.add(i3, qjVar3);
                                break;
                            }
                            break;
                        case 4:
                            size = qjVar.f9046d;
                            i5 = qjVar2.f9044b;
                            if (size >= i5) {
                                i6 = qjVar2.f9046d;
                                if (size < i5 + i6) {
                                    qjVar2.f9046d = i6 - 1;
                                    obj3 = trVar.f9284a.m5843a(4, qjVar.f9044b, 1, qjVar2.f9045c);
                                } else {
                                    obj3 = null;
                                }
                            } else {
                                qjVar2.f9044b = i5 - 1;
                                obj3 = null;
                            }
                            i5 = qjVar.f9044b;
                            i6 = qjVar2.f9044b;
                            if (i5 > i6) {
                                i6 += qjVar2.f9046d;
                                if (i5 >= i6) {
                                    obj2 = null;
                                } else {
                                    i6 -= i5;
                                    obj2 = trVar.f9284a.m5843a(4, i5 + 1, i6, qjVar2.f9045c);
                                    qjVar2.f9046d -= i6;
                                }
                            } else {
                                qjVar2.f9044b = i6 + 1;
                                obj2 = null;
                            }
                            list.set(i4, qjVar);
                            if (qjVar2.f9046d <= 0) {
                                list.remove(i3);
                                trVar.f9284a.m5850c(qjVar2);
                            } else {
                                list.set(i3, qjVar2);
                            }
                            if (obj3 != null) {
                                list.add(i3, obj3);
                            }
                            if (obj2 == null) {
                                list.add(i3, obj2);
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                i4 = tsVar.f9285a.size();
                for (i9 = 0; i9 < i4; i9++) {
                    qjVar = (qj) tsVar.f9285a.get(i9);
                    switch (qjVar.f9043a) {
                        case 1:
                            tsVar.m5847b(qjVar);
                            break;
                        case 2:
                            i3 = qjVar.f9044b;
                            i5 = i3 + qjVar.f9046d;
                            i6 = -1;
                            size = i3;
                            i10 = 0;
                            while (size < i5) {
                                if (tsVar.f9287c.m5706a(size) == null) {
                                    break;
                                }
                                if (i6 != 0) {
                                    obj5 = null;
                                } else {
                                    tsVar.m5845a(tsVar.m5843a(2, i3, i10, null));
                                    obj5 = 1;
                                }
                                i6 = 1;
                                if (obj5 == null) {
                                    i11 = size;
                                    size = i5;
                                    i5 = i10 + 1;
                                    i = i11;
                                } else {
                                    i = size - i10;
                                    size = i5 - i10;
                                    i5 = 1;
                                }
                                i10 = i5;
                                i5 = size;
                                size = i + 1;
                            }
                            if (i10 != qjVar.f9046d) {
                                tsVar.m5850c(qjVar);
                                qjVar = tsVar.m5843a(2, i3, i10, null);
                            }
                            if (i6 != 0) {
                                tsVar.m5845a(qjVar);
                                break;
                            } else {
                                tsVar.m5847b(qjVar);
                                break;
                            }
                        case 4:
                            i6 = qjVar.f9044b;
                            i3 = i6 + qjVar.f9046d;
                            size = 0;
                            i = -1;
                            i5 = i6;
                            while (i6 < i3) {
                                if (tsVar.f9287c.m5706a(i6) == null) {
                                    break;
                                }
                                if (i == 0) {
                                    tsVar.m5845a(tsVar.m5843a(4, i5, size, qjVar.f9045c));
                                    size = 0;
                                    i5 = i6;
                                }
                                i = 1;
                                size++;
                                i6++;
                            }
                            if (size != qjVar.f9046d) {
                                obj4 = qjVar.f9045c;
                                tsVar.m5850c(qjVar);
                                qjVar = tsVar.m5843a(4, i5, size, obj4);
                            }
                            if (i != 0) {
                                tsVar.m5845a(qjVar);
                                break;
                            } else {
                                tsVar.m5847b(qjVar);
                                break;
                            }
                        case 8:
                            tsVar.m5847b(qjVar);
                            break;
                        default:
                            break;
                    }
                }
                tsVar.f9285a.clear();
            }
        } else {
            this.f677e.m5844a();
        }
        if (this.f658C) {
            obj = 1;
        } else if (this.f659D) {
            obj = 1;
        } else {
            obj = null;
        }
        uv uvVar = this.f656A;
        if (!this.f689q) {
            z = false;
        } else if (this.f696x != null) {
            z = this.f691s;
            if (!z && obj == null) {
                z = false;
            } else if (!z) {
                z = true;
            } else if (this.f682j.f9296b) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        uvVar.f9356j = z;
        if (!uvVar.f9356j) {
            z2 = false;
        } else if (obj == null) {
            z2 = false;
        } else if (this.f691s) {
            z2 = false;
        } else if (m441y()) {
            z2 = true;
        } else {
            z2 = false;
        }
        uvVar.f9357k = z2;
        if (!this.am) {
            view = null;
        } else if (!hasFocus()) {
            view = null;
        } else if (this.f682j != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view == null) {
            uxVar = null;
        } else {
            view = m443a(view);
            if (view != null) {
                uxVar = m431e(view);
            } else {
                uxVar = null;
            }
        }
        if (uxVar == null) {
            m442z();
        } else {
            long j;
            uv uvVar2 = this.f656A;
            if (this.f682j.f9296b) {
                j = uxVar.f9373e;
            } else {
                j = -1;
            }
            uvVar2.f9359m = j;
            if (this.f691s) {
                i2 = -1;
            } else if (uxVar.m6029j()) {
                i2 = uxVar.f9372d;
            } else {
                i2 = uxVar.m6024e();
            }
            uvVar2.f9358l = i2;
            uvVar2 = this.f656A;
            view = uxVar.f9369a;
            i = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    i = view.getId();
                }
            }
            uvVar2.f9360n = i;
        }
        uv uvVar3 = this.f656A;
        if (!uvVar3.f9356j) {
            z2 = false;
        } else if (this.f659D) {
            z2 = true;
        } else {
            z2 = false;
        }
        uvVar3.f9354h = z2;
        this.f659D = false;
        this.f658C = false;
        uvVar3.f9353g = uvVar3.f9357k;
        uvVar3.f9351e = this.f682j.mo728a();
        m423a(this.ap);
        if (this.f656A.f9356j) {
            i = this.f678f.m5758a();
            for (i2 = 0; i2 < i; i2++) {
                uxVar = m428c(this.f678f.m5765b(i2));
                if (!uxVar.m6035p() && (!uxVar.m6027h() || this.f682j.f9296b)) {
                    ub.m5898d(uxVar);
                    uxVar.m6026g();
                    ue f = ub.m5899f();
                    View view2 = uxVar.f9369a;
                    f.f9304a = view2.getLeft();
                    f.f9305b = view2.getTop();
                    view2.getRight();
                    view2.getBottom();
                    this.f679g.m6149b(uxVar, f);
                    if (!(!this.f656A.f9354h || !uxVar.m6032m() || uxVar.m6029j() || uxVar.m6035p() || uxVar.m6027h())) {
                        this.f679g.m6146a(m429d(uxVar), uxVar);
                    }
                }
            }
        }
        if (this.f656A.f9357k) {
            i = this.f678f.m5763b();
            for (i2 = 0; i2 < i; i2++) {
                uxVar = m428c(this.f678f.m5768d(i2));
                if (!uxVar.m6035p() && uxVar.f9372d == -1) {
                    uxVar.f9372d = uxVar.f9371c;
                }
            }
            uv uvVar4 = this.f656A;
            z = uvVar4.f9352f;
            uvVar4.f9352f = false;
            this.f683k.mo813c(this.f676d, uvVar4);
            this.f656A.f9352f = z;
            for (i = 0; i < this.f678f.m5758a(); i++) {
                uxVar = m428c(this.f678f.m5765b(i));
                if (!uxVar.m6035p()) {
                    vw vwVar = (vw) this.f679g.f9463a.get(uxVar);
                    if (vwVar == null) {
                        obj = null;
                    } else if ((vwVar.f9433a & 4) != 0) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        ub.m5898d(uxVar);
                        z2 = uxVar.m6021b(8192);
                        uxVar.m6026g();
                        f = ub.m5899f();
                        view2 = uxVar.f9369a;
                        f.f9304a = view2.getLeft();
                        f.f9305b = view2.getTop();
                        view2.getRight();
                        view2.getBottom();
                        if (z2) {
                            m453a(uxVar, f);
                        } else {
                            wm wmVar = this.f679g;
                            vwVar = (vw) wmVar.f9463a.get(uxVar);
                            if (vwVar == null) {
                                vwVar = vw.m6073a();
                                wmVar.f9463a.put(uxVar, vwVar);
                            }
                            vwVar.f9433a |= 2;
                            vwVar.f9434b = f;
                        }
                    }
                }
            }
            m434r();
        } else {
            m434r();
        }
        m454a(true);
        m466c(false);
        this.f656A.f9350d = 2;
    }

    /* renamed from: u */
    private final void m437u() {
        boolean z;
        m479p();
        m476m();
        this.f656A.m6010a(6);
        this.f677e.m5844a();
        this.f656A.f9351e = this.f682j.mo728a();
        uv uvVar = this.f656A;
        uvVar.f9349c = 0;
        uvVar.f9353g = false;
        this.f683k.mo813c(this.f676d, uvVar);
        uv uvVar2 = this.f656A;
        uvVar2.f9352f = false;
        this.f664M = null;
        if (!uvVar2.f9356j) {
            z = false;
        } else if (this.f696x != null) {
            z = true;
        } else {
            z = false;
        }
        uvVar2.f9356j = z;
        uvVar2.f9350d = 4;
        m454a(true);
        m466c(false);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return m472i().m4483a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return m472i().m4482a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m472i().m4487a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public final boolean m456a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return m472i().m4487a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m472i().m4486a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public final boolean m455a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m472i().m4486a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: b */
    public final void m458b() {
        this.f674W++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        List list = this.f657B;
        if (list != null) {
            for (scrollY = list.size() - 1; scrollY >= 0; scrollY--) {
                ((um) this.f657B.get(scrollY)).mo2460a(this);
            }
        }
        this.f674W--;
    }

    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = 1;
        int i4 = 0;
        super.draw(canvas);
        int size = this.f685m.size();
        for (i = 0; i < size; i++) {
            ((uf) this.f685m.get(i)).mo2457a(canvas);
        }
        EdgeEffect edgeEffect = this.f692t;
        if (edgeEffect == null) {
            i2 = 0;
        } else if (edgeEffect.isFinished()) {
            i2 = 0;
        } else {
            i = canvas.save();
            if (this.f665N) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) (i2 + (-getHeight())), 0.0f);
            edgeEffect = this.f692t;
            if (edgeEffect == null) {
                i2 = 0;
            } else if (edgeEffect.draw(canvas)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            canvas.restoreToCount(i);
        }
        EdgeEffect edgeEffect2 = this.f693u;
        if (edgeEffect2 == null) {
            i = i2;
        } else if (edgeEffect2.isFinished()) {
            i = i2;
        } else {
            size = canvas.save();
            if (this.f665N) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            edgeEffect2 = this.f693u;
            if (edgeEffect2 == null) {
                i = 0;
            } else if (edgeEffect2.draw(canvas)) {
                i = 1;
            } else {
                i = 0;
            }
            i2 |= i;
            canvas.restoreToCount(size);
            i = i2;
        }
        edgeEffect = this.f694v;
        if (!(edgeEffect == null || edgeEffect.isFinished())) {
            size = canvas.save();
            int width = getWidth();
            if (this.f665N) {
                i2 = getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i2), (float) (-width));
            edgeEffect = this.f694v;
            if (edgeEffect == null) {
                i2 = 0;
            } else if (edgeEffect.draw(canvas)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            i |= i2;
            canvas.restoreToCount(size);
        }
        edgeEffect = this.f695w;
        if (edgeEffect == null) {
            i2 = i;
        } else if (edgeEffect.isFinished()) {
            i2 = i;
        } else {
            i2 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f665N) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect3 = this.f695w;
            if (edgeEffect3 != null && edgeEffect3.draw(canvas)) {
                i4 = 1;
            }
            i |= i4;
            canvas.restoreToCount(i2);
            i2 = i;
        }
        if (i2 != 0) {
            i3 = i2;
        } else if (this.f696x == null) {
            i3 = i2;
        } else if (this.f685m.size() <= 0) {
            i3 = i2;
        } else if (!this.f696x.mo3337c()) {
            i3 = i2;
        }
        if (i3 != 0) {
            jm.m4542A(this);
        }
    }

    /* renamed from: c */
    public final void m463c() {
        if (this.f695w == null) {
            this.f695w = ua.m5897a(this);
            if (this.f665N) {
                this.f695w.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f695w.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: d */
    public final void m468d() {
        if (this.f692t == null) {
            this.f692t = ua.m5897a(this);
            if (this.f665N) {
                this.f692t.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f692t.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: e */
    public final void m469e() {
        if (this.f694v == null) {
            this.f694v = ua.m5897a(this);
            if (this.f665N) {
                this.f694v.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f694v.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: f */
    public final void m470f() {
        if (this.f693u == null) {
            this.f693u = ua.m5897a(this);
            if (this.f665N) {
                this.f693u.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f693u.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: g */
    public final String m471g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(super.toString());
        stringBuilder.append(", adapter:");
        stringBuilder.append(this.f682j);
        stringBuilder.append(", layout:");
        stringBuilder.append(this.f683k);
        stringBuilder.append(", context:");
        stringBuilder.append(getContext());
        return stringBuilder.toString();
    }

    /* renamed from: v */
    private final void m438v() {
        if (this.aa == 2) {
            OverScroller overScroller = this.an.f9363c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
    }

    /* renamed from: a */
    public final View m443a(View view) {
        RecyclerView parent = view.getParent();
        View view2 = view;
        while (parent != null && parent != this && (parent instanceof View)) {
            View view3 = parent;
            view2 = view3;
            ViewParent parent2 = view3.getParent();
        }
        return parent == this ? view2 : null;
    }

    /* renamed from: a */
    private final void m423a(int[] iArr) {
        int a = this.f678f.m5758a();
        if (a != 0) {
            int i = LfuScheduler.MAX_PRIORITY;
            int i2 = kvl.UNSET_ENUM_VALUE;
            int i3 = 0;
            while (i3 < a) {
                int i4;
                ux c = m428c(this.f678f.m5765b(i3));
                if (c.m6035p()) {
                    i4 = i;
                } else {
                    i4 = c.m6025f();
                    if (i4 < i) {
                        i = i4;
                    }
                    if (i4 <= i2) {
                        i4 = i;
                    } else {
                        i2 = i4;
                        i4 = i;
                    }
                }
                i3++;
                i = i4;
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    /* renamed from: b */
    public static RecyclerView m426b(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View b = m426b(viewGroup.getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final ux m444a(int i) {
        if (this.f691s) {
            return null;
        }
        int b = this.f678f.m5763b();
        int i2 = 0;
        ux uxVar = null;
        while (i2 < b) {
            ux c = m428c(this.f678f.m5768d(i2));
            if (c == null) {
                c = uxVar;
            } else if (c.m6029j()) {
                c = uxVar;
            } else if (m462c(c) != i) {
                c = uxVar;
            } else if (!this.f678f.m5767c(c.f9369a)) {
                return c;
            }
            i2++;
            uxVar = c;
        }
        return uxVar;
    }

    public View focusSearch(View view, int i) {
        int i2;
        View findNextFocus;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = this.f682j != null ? this.f683k != null ? !m440x() : false : false;
        FocusFinder instance = FocusFinder.getInstance();
        if (z3 && (i == 2 || i == 1)) {
            if (this.f683k.mo822i()) {
                if (i == 2) {
                    i2 = ScriptIntrinsicBLAS.RsBlas_ctrsm;
                } else {
                    i2 = 33;
                }
                if (instance.findNextFocus(this, view, i2) == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (z3) {
                z3 = true;
            } else if (this.f683k.mo821h()) {
                int i3;
                if (jm.m4576j(this.f683k.f9309g) == 1) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (i == 2) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if ((i2 ^ i3) == 0) {
                    i2 = 17;
                } else {
                    i2 = 66;
                }
                if (instance.findNextFocus(this, view, i2) == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (z3) {
                m445a();
                if (m443a(view) == null) {
                    return null;
                }
                m479p();
                this.f683k.mo2462a(view, i, this.f676d, this.f656A);
                m466c(false);
            }
            findNextFocus = instance.findNextFocus(this, view, i);
        } else {
            findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus == null && z3) {
                m445a();
                if (m443a(view) == null) {
                    return null;
                }
                m479p();
                findNextFocus = this.f683k.mo2462a(view, i, this.f676d, this.f656A);
                m466c(false);
            }
        }
        if (findNextFocus == null || findNextFocus.hasFocusable()) {
            if (!(findNextFocus == null || findNextFocus == this || m443a(findNextFocus) == null)) {
                if (view == null) {
                    z2 = true;
                } else if (m443a(view) != null) {
                    StringBuilder stringBuilder;
                    this.f680h.set(0, 0, view.getWidth(), view.getHeight());
                    this.f666O.set(0, 0, findNextFocus.getWidth(), findNextFocus.getHeight());
                    offsetDescendantRectToMyCoords(view, this.f680h);
                    offsetDescendantRectToMyCoords(findNextFocus, this.f666O);
                    if (jm.m4576j(this.f683k.f9309g) == 1) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    Rect rect = this.f680h;
                    int i4 = rect.left;
                    Rect rect2 = this.f666O;
                    if (i4 >= rect2.left) {
                        if (rect.right <= rect2.left) {
                        }
                        if (rect.right <= rect2.right && rect.left < rect2.right) {
                            i4 = 0;
                            if (rect.top >= rect2.top) {
                                if (rect.bottom <= rect2.top) {
                                }
                                if (rect.bottom <= rect2.bottom && rect.top < rect2.bottom) {
                                    z = false;
                                    switch (i) {
                                        case 1:
                                            if (z < false) {
                                                if (!z && r0 * i4 <= 0) {
                                                    z2 = true;
                                                    break;
                                                }
                                            }
                                            z2 = true;
                                            break;
                                        case 2:
                                            if (z > false) {
                                                if (!z && r0 * i4 >= 0) {
                                                    z2 = true;
                                                    break;
                                                }
                                            }
                                            z2 = true;
                                            break;
                                        case 17:
                                            if (i4 < 0) {
                                                z2 = true;
                                                break;
                                            }
                                            break;
                                        case 33:
                                            if (z >= false) {
                                                z2 = true;
                                                break;
                                            }
                                            break;
                                        case 66:
                                            if (i4 > 0) {
                                                z2 = true;
                                                break;
                                            }
                                            break;
                                        case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                            if (z <= false) {
                                                z2 = true;
                                                break;
                                            }
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Invalid direction: ");
                                            stringBuilder.append(i);
                                            stringBuilder.append(m471g());
                                            throw new IllegalArgumentException(stringBuilder.toString());
                                    }
                                }
                                if (rect.top <= rect2.top) {
                                    z = false;
                                }
                                switch (i) {
                                    case 1:
                                        if (z < false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                        break;
                                    case 2:
                                        if (z > false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case 17:
                                        if (i4 < 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 33:
                                        if (z >= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 66:
                                        if (i4 > 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                        if (z <= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Invalid direction: ");
                                        stringBuilder.append(i);
                                        stringBuilder.append(m471g());
                                        throw new IllegalArgumentException(stringBuilder.toString());
                                }
                            }
                            if (rect.bottom < rect2.bottom) {
                                z = true;
                                switch (i) {
                                    case 1:
                                        if (z < false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                        break;
                                    case 2:
                                        if (z > false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case 17:
                                        if (i4 < 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 33:
                                        if (z >= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 66:
                                        if (i4 > 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                        if (z <= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Invalid direction: ");
                                        stringBuilder.append(i);
                                        stringBuilder.append(m471g());
                                        throw new IllegalArgumentException(stringBuilder.toString());
                                }
                            }
                            if (rect.bottom <= rect2.bottom) {
                                z = false;
                                switch (i) {
                                    case 1:
                                        if (z < false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                        break;
                                    case 2:
                                        if (z > false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case 17:
                                        if (i4 < 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 33:
                                        if (z >= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 66:
                                        if (i4 > 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                        if (z <= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Invalid direction: ");
                                        stringBuilder.append(i);
                                        stringBuilder.append(m471g());
                                        throw new IllegalArgumentException(stringBuilder.toString());
                                }
                            }
                            if (rect.top <= rect2.top) {
                                z = false;
                            }
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.left <= rect2.left) {
                            i4 = -1;
                        } else {
                            i4 = 0;
                        }
                        if (rect.top >= rect2.top) {
                            if (rect.bottom <= rect2.top) {
                            }
                            if (rect.bottom <= rect2.bottom) {
                                z = false;
                                switch (i) {
                                    case 1:
                                        if (z < false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                        break;
                                    case 2:
                                        if (z > false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case 17:
                                        if (i4 < 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 33:
                                        if (z >= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 66:
                                        if (i4 > 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                        if (z <= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Invalid direction: ");
                                        stringBuilder.append(i);
                                        stringBuilder.append(m471g());
                                        throw new IllegalArgumentException(stringBuilder.toString());
                                }
                            }
                            if (rect.top <= rect2.top) {
                                z = false;
                            }
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.bottom < rect2.bottom) {
                            z = true;
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.bottom <= rect2.bottom) {
                            z = false;
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.top <= rect2.top) {
                            z = false;
                        }
                        switch (i) {
                            case 1:
                                if (z < false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                                break;
                            case 2:
                                if (z > false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 17:
                                if (i4 < 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 33:
                                if (z >= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 66:
                                if (i4 > 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                if (z <= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            default:
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid direction: ");
                                stringBuilder.append(i);
                                stringBuilder.append(m471g());
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    if (rect.right < rect2.right) {
                        i4 = 1;
                        if (rect.top >= rect2.top) {
                            if (rect.bottom <= rect2.top) {
                            }
                            if (rect.bottom <= rect2.bottom) {
                                z = false;
                                switch (i) {
                                    case 1:
                                        if (z < false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                        break;
                                    case 2:
                                        if (z > false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case 17:
                                        if (i4 < 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 33:
                                        if (z >= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 66:
                                        if (i4 > 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                        if (z <= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Invalid direction: ");
                                        stringBuilder.append(i);
                                        stringBuilder.append(m471g());
                                        throw new IllegalArgumentException(stringBuilder.toString());
                                }
                            }
                            if (rect.top <= rect2.top) {
                                z = false;
                            }
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.bottom < rect2.bottom) {
                            z = true;
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.bottom <= rect2.bottom) {
                            z = false;
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.top <= rect2.top) {
                            z = false;
                        }
                        switch (i) {
                            case 1:
                                if (z < false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                                break;
                            case 2:
                                if (z > false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 17:
                                if (i4 < 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 33:
                                if (z >= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 66:
                                if (i4 > 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                if (z <= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            default:
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid direction: ");
                                stringBuilder.append(i);
                                stringBuilder.append(m471g());
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    if (rect.right <= rect2.right) {
                        i4 = 0;
                        if (rect.top >= rect2.top) {
                            if (rect.bottom <= rect2.top) {
                            }
                            if (rect.bottom <= rect2.bottom) {
                                z = false;
                                switch (i) {
                                    case 1:
                                        if (z < false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                        break;
                                    case 2:
                                        if (z > false) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case 17:
                                        if (i4 < 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 33:
                                        if (z >= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case 66:
                                        if (i4 > 0) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                        if (z <= false) {
                                            z2 = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Invalid direction: ");
                                        stringBuilder.append(i);
                                        stringBuilder.append(m471g());
                                        throw new IllegalArgumentException(stringBuilder.toString());
                                }
                            }
                            if (rect.top <= rect2.top) {
                                z = false;
                            }
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.bottom < rect2.bottom) {
                            z = true;
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.bottom <= rect2.bottom) {
                            z = false;
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.top <= rect2.top) {
                            z = false;
                        }
                        switch (i) {
                            case 1:
                                if (z < false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                                break;
                            case 2:
                                if (z > false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 17:
                                if (i4 < 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 33:
                                if (z >= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 66:
                                if (i4 > 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                if (z <= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            default:
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid direction: ");
                                stringBuilder.append(i);
                                stringBuilder.append(m471g());
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    if (rect.left <= rect2.left) {
                        i4 = 0;
                    } else {
                        i4 = -1;
                    }
                    if (rect.top >= rect2.top) {
                        if (rect.bottom <= rect2.top) {
                        }
                        if (rect.bottom <= rect2.bottom) {
                            z = false;
                            switch (i) {
                                case 1:
                                    if (z < false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                case 2:
                                    if (z > false) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = true;
                                    break;
                                case 17:
                                    if (i4 < 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (z >= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (i4 > 0) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                    if (z <= false) {
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid direction: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(m471g());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        if (rect.top <= rect2.top) {
                            z = false;
                        }
                        switch (i) {
                            case 1:
                                if (z < false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                                break;
                            case 2:
                                if (z > false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 17:
                                if (i4 < 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 33:
                                if (z >= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 66:
                                if (i4 > 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                if (z <= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            default:
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid direction: ");
                                stringBuilder.append(i);
                                stringBuilder.append(m471g());
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    if (rect.bottom < rect2.bottom) {
                        z = true;
                        switch (i) {
                            case 1:
                                if (z < false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                                break;
                            case 2:
                                if (z > false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 17:
                                if (i4 < 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 33:
                                if (z >= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 66:
                                if (i4 > 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                if (z <= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            default:
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid direction: ");
                                stringBuilder.append(i);
                                stringBuilder.append(m471g());
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    if (rect.bottom <= rect2.bottom) {
                        z = false;
                        switch (i) {
                            case 1:
                                if (z < false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                                break;
                            case 2:
                                if (z > false) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 17:
                                if (i4 < 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 33:
                                if (z >= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case 66:
                                if (i4 > 0) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                                if (z <= false) {
                                    z2 = true;
                                    break;
                                }
                                break;
                            default:
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid direction: ");
                                stringBuilder.append(i);
                                stringBuilder.append(m471g());
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    if (rect.top <= rect2.top) {
                        z = false;
                    }
                    switch (i) {
                        case 1:
                            if (z < false) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                            break;
                        case 2:
                            if (z > false) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case 17:
                            if (i4 < 0) {
                                z2 = true;
                                break;
                            }
                            break;
                        case 33:
                            if (z >= false) {
                                z2 = true;
                                break;
                            }
                            break;
                        case 66:
                            if (i4 > 0) {
                                z2 = true;
                                break;
                            }
                            break;
                        case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                            if (z <= false) {
                                z2 = true;
                                break;
                            }
                            break;
                        default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid direction: ");
                            stringBuilder.append(i);
                            stringBuilder.append(m471g());
                            throw new IllegalArgumentException(stringBuilder.toString());
                    }
                } else {
                    z2 = true;
                }
            }
            return !z2 ? super.focusSearch(view, i) : findNextFocus;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m422a(findNextFocus, null);
            return view;
        }
    }

    public LayoutParams generateDefaultLayoutParams() {
        ug ugVar = this.f683k;
        if (ugVar != null) {
            return ugVar.mo804a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(m471g());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ug ugVar = this.f683k;
        if (ugVar != null) {
            return ugVar.mo805a(getContext(), attributeSet);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(m471g());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        ug ugVar = this.f683k;
        if (ugVar != null) {
            return ugVar.mo3341a(layoutParams);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(m471g());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: c */
    public final int m462c(ux uxVar) {
        if (uxVar.m6021b(524) || (uxVar.f9378j & 1) == 0) {
            return -1;
        }
        ts tsVar = this.f677e;
        int i = uxVar.f9371c;
        int size = tsVar.f9285a.size();
        for (int i2 = 0; i2 < size; i2++) {
            qj qjVar = (qj) tsVar.f9285a.get(i2);
            int i3;
            switch (qjVar.f9043a) {
                case 1:
                    if (qjVar.f9044b > i) {
                        break;
                    }
                    i += qjVar.f9046d;
                    break;
                case 2:
                    i3 = qjVar.f9044b;
                    if (i3 <= i) {
                        int i4 = qjVar.f9046d;
                        if (i3 + i4 <= i) {
                            i -= i4;
                            break;
                        }
                        return -1;
                    }
                    continue;
                case 8:
                    i3 = qjVar.f9044b;
                    if (i3 != i) {
                        if (i3 < i) {
                            i--;
                        }
                        if (qjVar.f9046d > i) {
                            break;
                        }
                        i++;
                        break;
                    }
                    i = qjVar.f9046d;
                    break;
                default:
                    break;
            }
        }
        return i;
    }

    public int getBaseline() {
        if (this.f683k != null) {
            return -1;
        }
        return super.getBaseline();
    }

    /* renamed from: d */
    private final long m429d(ux uxVar) {
        return !this.f682j.f9296b ? (long) uxVar.f9371c : uxVar.f9373e;
    }

    /* renamed from: e */
    private final ux m431e(View view) {
        Object parent = view.getParent();
        if (parent == null || parent == this) {
            return m428c(view);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a direct child of ");
        stringBuilder.append(this);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: c */
    public static ux m428c(View view) {
        if (view == null) {
            return null;
        }
        return ((uk) view.getLayoutParams()).f9324c;
    }

    public boolean getClipToPadding() {
        return this.f665N;
    }

    /* renamed from: a */
    public static void m421a(View view, Rect rect) {
        uk ukVar = (uk) view.getLayoutParams();
        Rect rect2 = ukVar.f9325d;
        rect.set((view.getLeft() - rect2.left) - ukVar.leftMargin, (view.getTop() - rect2.top) - ukVar.topMargin, (view.getRight() + rect2.right) + ukVar.rightMargin, ukVar.bottomMargin + (rect2.bottom + view.getBottom()));
    }

    /* renamed from: d */
    public final Rect m467d(View view) {
        uk ukVar = (uk) view.getLayoutParams();
        if (!ukVar.f9326e) {
            return ukVar.f9325d;
        }
        if (this.f656A.f9353g && (ukVar.f9324c.m6032m() || ukVar.f9324c.m6027h())) {
            return ukVar.f9325d;
        }
        Rect rect = ukVar.f9325d;
        rect.set(0, 0, 0, 0);
        int size = this.f685m.size();
        for (int i = 0; i < size; i++) {
            this.f680h.set(0, 0, 0, 0);
            ((uf) this.f685m.get(i)).mo735a(this.f680h, view, this);
            int i2 = rect.left;
            Rect rect2 = this.f680h;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        ukVar.f9326e = false;
        return rect;
    }

    /* renamed from: h */
    public static long m432h() {
        return f655b ? System.nanoTime() : 0;
    }

    /* renamed from: i */
    public final jh m472i() {
        if (this.aq == null) {
            this.aq = new jh(this);
        }
        return this.aq;
    }

    public boolean hasNestedScrollingParent() {
        return m472i().m4484a(0);
    }

    /* renamed from: j */
    public final boolean m473j() {
        return !this.f689q || this.f691s || this.f677e.m5848b();
    }

    /* renamed from: w */
    private final void m439w() {
        this.f695w = null;
        this.f693u = null;
        this.f694v = null;
        this.f692t = null;
    }

    /* renamed from: k */
    public final boolean m474k() {
        AccessibilityManager accessibilityManager = this.f671T;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAttachedToWindow() {
        return this.f688p;
    }

    /* renamed from: x */
    private final boolean m440x() {
        return this.f673V > 0;
    }

    public boolean isNestedScrollingEnabled() {
        return m472i().f7820a;
    }

    /* renamed from: l */
    public final void m475l() {
        int i = 0;
        int b = this.f678f.m5763b();
        for (int i2 = 0; i2 < b; i2++) {
            ((uk) this.f678f.m5768d(i2).getLayoutParams()).f9326e = true;
        }
        up upVar = this.f676d;
        b = upVar.f9336c.size();
        while (i < b) {
            uk ukVar = (uk) ((ux) upVar.f9336c.get(i)).f9369a.getLayoutParams();
            if (ukVar != null) {
                ukVar.f9326e = true;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final void m447a(int i, int i2, boolean z) {
        int i3;
        int i4 = i + i2;
        int b = this.f678f.m5763b();
        for (int i5 = 0; i5 < b; i5++) {
            ux c = m428c(this.f678f.m5768d(i5));
            if (!(c == null || c.m6035p())) {
                i3 = c.f9371c;
                if (i3 >= i4) {
                    c.m6016a(-i2, z);
                    this.f656A.f9352f = true;
                } else if (i3 >= i) {
                    c.m6014a(8);
                    c.m6016a(-i2, z);
                    c.f9371c = i - 1;
                    this.f656A.f9352f = true;
                }
            }
        }
        up upVar = this.f676d;
        for (b = upVar.f9336c.size() - 1; b >= 0; b--) {
            ux uxVar = (ux) upVar.f9336c.get(b);
            if (uxVar != null) {
                i3 = uxVar.f9371c;
                if (i3 >= i4) {
                    uxVar.m6016a(-i2, z);
                } else if (i3 >= i) {
                    uxVar.m6014a(8);
                    upVar.m6003b(b);
                }
            }
        }
        requestLayout();
    }

    protected void onAttachedToWindow() {
        boolean z = true;
        super.onAttachedToWindow();
        this.f673V = 0;
        this.f688p = true;
        if (!this.f689q) {
            z = false;
        } else if (isLayoutRequested()) {
            z = false;
        }
        this.f689q = z;
        ug ugVar = this.f683k;
        if (ugVar != null) {
            ugVar.mo825v();
        }
        this.f660E = false;
        if (f655b) {
            this.f697y = (ss) ss.f9230a.get();
            if (this.f697y == null) {
                float f;
                this.f697y = new ss();
                Display e = jm.m4571e(this);
                if (isInEditMode()) {
                    f = 60.0f;
                } else if (e != null) {
                    f = e.getRefreshRate();
                    if (f < 30.0f) {
                        f = 60.0f;
                    }
                } else {
                    f = 60.0f;
                }
                this.f697y.f9233c = (long) (1.0E9f / f);
                ss.f9230a.set(this.f697y);
            }
            this.f697y.f9232b.add(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ub ubVar = this.f696x;
        if (ubVar != null) {
            ubVar.mo3334b();
        }
        m416B();
        this.f688p = false;
        ug ugVar = this.f683k;
        if (ugVar != null) {
            ugVar.mo826w();
        }
        this.at.clear();
        removeCallbacks(this.au);
        do {
        } while (vw.f9432d.mo341a() != null);
        if (f655b) {
            ss ssVar = this.f697y;
            if (ssVar != null) {
                ssVar.f9232b.remove(this);
                this.f697y = null;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f685m.size();
        for (int i = 0; i < size; i++) {
            this.f685m.get(i);
        }
    }

    /* renamed from: m */
    public final void m476m() {
        this.f673V++;
    }

    /* renamed from: a */
    public final void m454a(boolean z) {
        this.f673V--;
        if (this.f673V <= 0) {
            this.f673V = 0;
            if (z) {
                int i = this.f670S;
                this.f670S = 0;
                if (i != 0 && m474k()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
                    obtain.setContentChangeTypes(i);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.at.size() - 1; size >= 0; size--) {
                    ux uxVar = (ux) this.at.get(size);
                    if (uxVar.f9369a.getParent() == this && !uxVar.m6035p()) {
                        int i2 = uxVar.f9382n;
                        if (i2 != -1) {
                            jm.m4568c(uxVar.f9369a, i2);
                            uxVar.f9382n = -1;
                        }
                    }
                }
                this.at.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f683k != null && motionEvent.getAction() == 8) {
            float f;
            float axisValue;
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f683k.mo822i()) {
                    f = -motionEvent.getAxisValue(9);
                } else {
                    f = 0.0f;
                }
                if (this.f683k.mo821h()) {
                    axisValue = motionEvent.getAxisValue(10);
                } else {
                    axisValue = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f = motionEvent.getAxisValue(26);
                if (this.f683k.mo822i()) {
                    f = -f;
                    axisValue = 0.0f;
                } else if (this.f683k.mo821h()) {
                    axisValue = f;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (!(f == 0.0f && axisValue == 0.0f)) {
                m424a((int) (this.ak * axisValue), (int) (f * this.al), motionEvent);
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f687o = null;
        }
        int size = this.f686n.size();
        for (int i = 0; i < size; i++) {
            ul ulVar = (ul) this.f686n.get(i);
            if (ulVar.mo2458a(motionEvent) && action != 3) {
                this.f687o = ulVar;
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            m433q();
            return true;
        }
        ug ugVar = this.f683k;
        if (ugVar == null) {
            return false;
        }
        int h = ugVar.mo821h();
        boolean i2 = this.f683k.mo822i();
        if (this.ac == null) {
            this.ac = VelocityTracker.obtain();
        }
        this.ac.addMovement(motionEvent);
        action = motionEvent.getActionMasked();
        size = motionEvent.getActionIndex();
        switch (action) {
            case 0:
                this.ab = motionEvent.getPointerId(0);
                action = (int) (motionEvent.getX() + 0.5f);
                this.af = action;
                this.ad = action;
                action = (int) (motionEvent.getY() + 0.5f);
                this.ag = action;
                this.ae = action;
                if (this.aa == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m459b(1);
                }
                int[] iArr = this.as;
                iArr[1] = 0;
                iArr[0] = 0;
                if (i2) {
                    h |= 2;
                }
                m430d(h, 0);
                break;
            case 1:
                this.ac.clear();
                m464c(0);
                break;
            case 2:
                action = motionEvent.findPointerIndex(this.ab);
                if (action >= 0) {
                    size = (int) (motionEvent.getX(action) + 0.5f);
                    action = (int) (motionEvent.getY(action) + 0.5f);
                    if (this.aa != 1) {
                        int i3 = size - this.ad;
                        int i4 = action - this.ae;
                        if (h == 0) {
                            z = false;
                        } else if (Math.abs(i3) > this.ah) {
                            this.af = size;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i2 && Math.abs(i4) > this.ah) {
                            this.ag = action;
                            z = true;
                        }
                        if (z) {
                            m459b(1);
                            break;
                        }
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error processing scroll; pointer index for id ");
                stringBuilder.append(this.ab);
                stringBuilder.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", stringBuilder.toString());
                return false;
                break;
            case 3:
                m433q();
                break;
            case 5:
                this.ab = motionEvent.getPointerId(size);
                h = (int) (motionEvent.getX(size) + 0.5f);
                this.af = h;
                this.ad = h;
                h = (int) (motionEvent.getY(size) + 0.5f);
                this.ag = h;
                this.ae = h;
                break;
            case 6:
                m420a(motionEvent);
                break;
        }
        if (this.aa == 1) {
            return true;
        }
        return false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        m435s();
        Trace.endSection();
        this.f689q = true;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = false;
        ug ugVar = this.f683k;
        if (ugVar == null) {
            m460b(i, i2);
        } else if (ugVar.mo2469k()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.f683k.m5928a(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f682j != null) {
                if (this.f656A.f9350d == 1) {
                    m436t();
                }
                this.f683k.m5950b(i, i2);
                this.f656A.f9355i = true;
                m437u();
                this.f683k.m5961d(i, i2);
                if (this.f683k.mo2470n()) {
                    this.f683k.m5950b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f656A.f9355i = true;
                    m437u();
                    this.f683k.m5961d(i, i2);
                }
            }
        } else {
            uv uvVar = this.f656A;
            if (uvVar.f9357k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            tx txVar = this.f682j;
            if (txVar != null) {
                uvVar.f9351e = txVar.mo728a();
            } else {
                uvVar.f9351e = 0;
            }
            m479p();
            this.f683k.m5928a(i, i2);
            m466c(false);
            this.f656A.f9353g = false;
        }
    }

    /* renamed from: a */
    private final void m420a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ab) {
            if (actionIndex == 0) {
                actionIndex = 1;
            } else {
                actionIndex = 0;
            }
            this.ab = motionEvent.getPointerId(actionIndex);
            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.af = x;
            this.ad = x;
            actionIndex = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ag = actionIndex;
            this.ae = actionIndex;
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m440x()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof us) {
            this.f664M = (us) parcelable;
            super.onRestoreInstanceState(this.f664M.f7631e);
            ug ugVar = this.f683k;
            if (ugVar != null) {
                Parcelable parcelable2 = this.f664M.f19645a;
                if (parcelable2 != null) {
                    ugVar.mo806a(parcelable2);
                    return;
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Object usVar = new us(super.onSaveInstanceState());
        us usVar2 = this.f664M;
        if (usVar2 == null) {
            ug ugVar = this.f683k;
            if (ugVar != null) {
                usVar.f19645a = ugVar.mo823m();
            } else {
                usVar.f19645a = null;
            }
        } else {
            usVar.f19645a = usVar2.f19645a;
        }
        return usVar;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m439w();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = r14.getAction();
        r1 = r13.f687o;
        if (r1 == 0) goto L_0x000d;
    L_0x0008:
        if (r0 != 0) goto L_0x02c7;
    L_0x000a:
        r1 = 0;
        r13.f687o = r1;
    L_0x000d:
        if (r0 == 0) goto L_0x02c4;
    L_0x000f:
        r0 = r13.f686n;
        r2 = r0.size();
        r0 = 0;
        r1 = r0;
    L_0x0017:
        if (r1 >= r2) goto L_0x02c1;
    L_0x0019:
        r0 = r13.f686n;
        r0 = r0.get(r1);
        r0 = (p000.ul) r0;
        r3 = r0.mo2458a(r14);
        if (r3 == 0) goto L_0x02bc;
    L_0x0027:
        r13.f687o = r0;
        r0 = 1;
    L_0x002a:
        if (r0 == 0) goto L_0x0031;
    L_0x002c:
        r13.m433q();
        r0 = 1;
    L_0x0030:
        return r0;
    L_0x0031:
        r0 = r13.f683k;
        if (r0 != 0) goto L_0x0037;
    L_0x0035:
        r0 = 0;
        goto L_0x0030;
    L_0x0037:
        r6 = r0.mo821h();
        r0 = r13.f683k;
        r7 = r0.mo822i();
        r0 = r13.ac;
        if (r0 != 0) goto L_0x004b;
    L_0x0045:
        r0 = android.view.VelocityTracker.obtain();
        r13.ac = r0;
    L_0x004b:
        r9 = android.view.MotionEvent.obtain(r14);
        r0 = r14.getActionMasked();
        r1 = r14.getActionIndex();
        if (r0 != 0) goto L_0x0063;
    L_0x0059:
        r2 = r13.as;
        r3 = 1;
        r4 = 0;
        r2[r3] = r4;
        r3 = 0;
        r4 = 0;
        r2[r3] = r4;
    L_0x0063:
        r2 = r13.as;
        r3 = 0;
        r3 = r2[r3];
        r3 = (float) r3;
        r4 = 1;
        r2 = r2[r4];
        r2 = (float) r2;
        r9.offsetLocation(r3, r2);
        switch(r0) {
            case 0: goto L_0x0080;
            case 1: goto L_0x01d5;
            case 2: goto L_0x00d1;
            case 3: goto L_0x00cd;
            case 4: goto L_0x0073;
            case 5: goto L_0x00ae;
            case 6: goto L_0x00aa;
            default: goto L_0x0073;
        };
    L_0x0073:
        r0 = 0;
    L_0x0074:
        if (r0 != 0) goto L_0x007b;
    L_0x0076:
        r0 = r13.ac;
        r0.addMovement(r9);
    L_0x007b:
        r9.recycle();
        r0 = 1;
        goto L_0x0030;
    L_0x0080:
        r0 = 0;
        r0 = r14.getPointerId(r0);
        r13.ab = r0;
        r0 = r14.getX();
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r0 = (int) r0;
        r13.af = r0;
        r13.ad = r0;
        r0 = r14.getY();
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r0 = (int) r0;
        r13.ag = r0;
        r13.ae = r0;
        if (r7 == 0) goto L_0x00a8;
    L_0x00a1:
        r0 = r6 | 2;
    L_0x00a3:
        r1 = 0;
        r13.m430d(r0, r1);
        goto L_0x0073;
    L_0x00a8:
        r0 = r6;
        goto L_0x00a3;
    L_0x00aa:
        r13.m420a(r14);
        goto L_0x0073;
    L_0x00ae:
        r0 = r14.getPointerId(r1);
        r13.ab = r0;
        r0 = r14.getX(r1);
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r2;
        r0 = (int) r0;
        r13.af = r0;
        r13.ad = r0;
        r0 = r14.getY(r1);
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r0 = (int) r0;
        r13.ag = r0;
        r13.ae = r0;
        goto L_0x0073;
    L_0x00cd:
        r13.m433q();
        goto L_0x0073;
    L_0x00d1:
        r0 = r13.ab;
        r0 = r14.findPointerIndex(r0);
        if (r0 >= 0) goto L_0x00f9;
    L_0x00d9:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Error processing scroll; pointer index for id ";
        r0.append(r1);
        r1 = r13.ab;
        r0.append(r1);
        r1 = " not found. Did any MotionEvents get skipped?";
        r0.append(r1);
        r1 = "RecyclerView";
        r0 = r0.toString();
        android.util.Log.e(r1, r0);
        r0 = 0;
        goto L_0x0030;
    L_0x00f9:
        r1 = r14.getX(r0);
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r1 + r2;
        r8 = (int) r1;
        r0 = r14.getY(r0);
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r10 = (int) r0;
        r0 = r13.af;
        r1 = r0 - r8;
        r0 = r13.ag;
        r2 = r0 - r10;
        r3 = r13.f662G;
        r4 = r13.ar;
        r5 = 0;
        r0 = r13;
        r0 = r0.m456a(r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x014c;
    L_0x011d:
        r0 = r13.f662G;
        r3 = 0;
        r3 = r0[r3];
        r1 = r1 - r3;
        r3 = 1;
        r0 = r0[r3];
        r2 = r2 - r0;
        r0 = r13.ar;
        r3 = 0;
        r3 = r0[r3];
        r3 = (float) r3;
        r4 = 1;
        r0 = r0[r4];
        r0 = (float) r0;
        r9.offsetLocation(r3, r0);
        r0 = r13.as;
        r3 = 0;
        r3 = r0[r3];
        r4 = r13.ar;
        r5 = 0;
        r11 = 0;
        r11 = r4[r11];
        r3 = r3 + r11;
        r0[r5] = r3;
        r3 = 1;
        r5 = 1;
        r5 = r0[r5];
        r11 = 1;
        r4 = r4[r11];
        r4 = r4 + r5;
        r0[r3] = r4;
    L_0x014c:
        r0 = r13.aa;
        r3 = 1;
        if (r0 == r3) goto L_0x01d1;
    L_0x0151:
        if (r6 == 0) goto L_0x01ce;
    L_0x0153:
        r0 = java.lang.Math.abs(r1);
        r3 = r13.ah;
        if (r0 <= r3) goto L_0x01cb;
    L_0x015b:
        if (r1 <= 0) goto L_0x01c8;
    L_0x015d:
        r0 = r1 - r3;
    L_0x015f:
        r1 = 1;
        r3 = r0;
        r0 = r1;
    L_0x0162:
        if (r7 == 0) goto L_0x01c6;
    L_0x0164:
        r1 = java.lang.Math.abs(r2);
        r4 = r13.ah;
        if (r1 <= r4) goto L_0x01c4;
    L_0x016c:
        if (r2 <= 0) goto L_0x01c1;
    L_0x016e:
        r0 = r2 - r4;
    L_0x0170:
        r1 = 1;
        r12 = r1;
        r1 = r0;
        r0 = r12;
    L_0x0174:
        if (r0 == 0) goto L_0x01bf;
    L_0x0176:
        r0 = 1;
        r13.m459b(r0);
        r2 = r3;
    L_0x017b:
        r0 = r13.aa;
        r3 = 1;
        if (r0 != r3) goto L_0x01bc;
    L_0x0180:
        r0 = r13.ar;
        r3 = 0;
        r3 = r0[r3];
        r3 = r8 - r3;
        r13.af = r3;
        r3 = 1;
        r0 = r0[r3];
        r0 = r10 - r0;
        r13.ag = r0;
        if (r6 != 0) goto L_0x01ba;
    L_0x0192:
        r0 = 0;
        r3 = r0;
    L_0x0194:
        if (r7 != 0) goto L_0x01b8;
    L_0x0196:
        r0 = 0;
    L_0x0197:
        r0 = r13.m424a(r3, r0, r9);
        if (r0 == 0) goto L_0x01a5;
    L_0x019d:
        r0 = r13.getParent();
        r3 = 1;
        r0.requestDisallowInterceptTouchEvent(r3);
    L_0x01a5:
        r0 = r13.f697y;
        if (r0 == 0) goto L_0x01b5;
    L_0x01a9:
        if (r2 != 0) goto L_0x01ad;
    L_0x01ab:
        if (r1 == 0) goto L_0x01b2;
    L_0x01ad:
        r0.m5816a(r13, r2, r1);
        goto L_0x0073;
    L_0x01b2:
        r0 = 0;
        goto L_0x0074;
    L_0x01b5:
        r0 = 0;
        goto L_0x0074;
    L_0x01b8:
        r0 = r1;
        goto L_0x0197;
    L_0x01ba:
        r3 = r2;
        goto L_0x0194;
    L_0x01bc:
        r0 = 0;
        goto L_0x0074;
    L_0x01bf:
        r2 = r3;
        goto L_0x017b;
    L_0x01c1:
        r0 = r2 + r4;
        goto L_0x0170;
    L_0x01c4:
        r1 = r2;
        goto L_0x0174;
    L_0x01c6:
        r1 = r2;
        goto L_0x0174;
    L_0x01c8:
        r0 = r1 + r3;
        goto L_0x015f;
    L_0x01cb:
        r0 = 0;
        r3 = r1;
        goto L_0x0162;
    L_0x01ce:
        r0 = 0;
        r3 = r1;
        goto L_0x0162;
    L_0x01d1:
        r12 = r2;
        r2 = r1;
        r1 = r12;
        goto L_0x017b;
    L_0x01d5:
        r0 = r13.ac;
        r0.addMovement(r9);
        r0 = r13.ac;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r13.aj;
        r2 = (float) r2;
        r0.computeCurrentVelocity(r1, r2);
        if (r6 == 0) goto L_0x02b8;
    L_0x01e6:
        r0 = r13.ac;
        r1 = r13.ab;
        r0 = r0.getXVelocity(r1);
        r0 = -r0;
        r1 = r0;
    L_0x01f0:
        if (r7 == 0) goto L_0x02b5;
    L_0x01f2:
        r0 = r13.ac;
        r2 = r13.ab;
        r0 = r0.getYVelocity(r2);
        r0 = -r0;
    L_0x01fb:
        r2 = 0;
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x02ae;
    L_0x0200:
        r2 = (int) r1;
        r0 = (int) r0;
        r1 = r13.f683k;
        if (r1 != 0) goto L_0x021a;
    L_0x0206:
        r0 = "RecyclerView";
        r1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.";
        android.util.Log.e(r0, r1);
        r0 = 0;
    L_0x020e:
        if (r0 != 0) goto L_0x0214;
    L_0x0210:
        r0 = 0;
        r13.m459b(r0);
    L_0x0214:
        r13.m415A();
        r0 = 1;
        goto L_0x0074;
    L_0x021a:
        r1 = r1.mo821h();
        r3 = r13.f683k;
        r4 = r3.mo822i();
        if (r1 == 0) goto L_0x02ab;
    L_0x0226:
        r3 = java.lang.Math.abs(r2);
        r5 = r13.ai;
        if (r3 >= r5) goto L_0x02a9;
    L_0x022e:
        r2 = 0;
        r3 = r2;
    L_0x0230:
        if (r4 == 0) goto L_0x02a6;
    L_0x0232:
        r2 = java.lang.Math.abs(r0);
        r5 = r13.ai;
        if (r2 >= r5) goto L_0x02a4;
    L_0x023a:
        r0 = 0;
        r2 = r0;
    L_0x023c:
        if (r3 != 0) goto L_0x0240;
    L_0x023e:
        if (r2 == 0) goto L_0x02a1;
    L_0x0240:
        r5 = (float) r3;
        r6 = (float) r2;
        r0 = r13.dispatchNestedPreFling(r5, r6);
        if (r0 != 0) goto L_0x029e;
    L_0x0248:
        if (r1 == 0) goto L_0x0298;
    L_0x024a:
        r0 = 1;
    L_0x024b:
        r13.dispatchNestedFling(r5, r6, r0);
        if (r0 == 0) goto L_0x0295;
    L_0x0250:
        if (r4 == 0) goto L_0x0293;
    L_0x0252:
        r0 = r1 | 2;
    L_0x0254:
        r1 = 1;
        r13.m430d(r0, r1);
        r0 = r13.aj;
        r1 = java.lang.Math.min(r3, r0);
        r0 = -r0;
        r3 = java.lang.Math.max(r0, r1);
        r0 = r13.aj;
        r1 = java.lang.Math.min(r2, r0);
        r0 = -r0;
        r4 = java.lang.Math.max(r0, r1);
        r10 = r13.an;
        r0 = r10.f9365e;
        r1 = 2;
        r0.m459b(r1);
        r0 = 0;
        r10.f9362b = r0;
        r0 = 0;
        r10.f9361a = r0;
        r0 = r10.f9363c;
        r1 = 0;
        r2 = 0;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r8 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0.fling(r1, r2, r3, r4, r5, r6, r7, r8);
        r10.m6011a();
        r0 = 1;
        goto L_0x020e;
    L_0x0293:
        r0 = r1;
        goto L_0x0254;
    L_0x0295:
        r0 = 0;
        goto L_0x020e;
    L_0x0298:
        if (r4 != 0) goto L_0x029c;
    L_0x029a:
        r0 = 0;
        goto L_0x024b;
    L_0x029c:
        r0 = 1;
        goto L_0x024b;
    L_0x029e:
        r0 = 0;
        goto L_0x020e;
    L_0x02a1:
        r0 = 0;
        goto L_0x020e;
    L_0x02a4:
        r2 = r0;
        goto L_0x023c;
    L_0x02a6:
        r0 = 0;
        r2 = r0;
        goto L_0x023c;
    L_0x02a9:
        r3 = r2;
        goto L_0x0230;
    L_0x02ab:
        r2 = 0;
        r3 = r2;
        goto L_0x0230;
    L_0x02ae:
        r2 = 0;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x0210;
    L_0x02b3:
        goto L_0x0200;
    L_0x02b5:
        r0 = 0;
        goto L_0x01fb;
    L_0x02b8:
        r0 = 0;
        r1 = r0;
        goto L_0x01f0;
    L_0x02bc:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0017;
    L_0x02c1:
        r0 = 0;
        goto L_0x002a;
    L_0x02c4:
        r0 = 0;
        goto L_0x002a;
    L_0x02c7:
        r1.mo2459b(r14);
        r1 = 3;
        if (r0 == r1) goto L_0x02d0;
    L_0x02cd:
        r1 = 1;
        if (r0 != r1) goto L_0x02d6;
    L_0x02d0:
        r0 = 0;
        r13.f687o = r0;
        r0 = 1;
        goto L_0x002a;
    L_0x02d6:
        r0 = 1;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: n */
    public final void m477n() {
        if (!this.f660E && this.f688p) {
            jm.m4556a((View) this, this.au);
            this.f660E = true;
        }
    }

    /* renamed from: y */
    private final boolean m441y() {
        return this.f696x != null && this.f683k.mo2468g();
    }

    /* renamed from: b */
    public final void m461b(boolean z) {
        int i;
        this.f672U |= z;
        this.f691s = true;
        int b = this.f678f.m5763b();
        for (i = 0; i < b; i++) {
            ux c = m428c(this.f678f.m5768d(i));
            if (!(c == null || c.m6035p())) {
                c.m6014a(6);
            }
        }
        m475l();
        up upVar = this.f676d;
        int size = upVar.f9336c.size();
        for (i = 0; i < size; i++) {
            ux uxVar = (ux) upVar.f9336c.get(i);
            if (uxVar != null) {
                uxVar.m6014a(6);
                uxVar.m6017a(null);
            }
        }
        tx txVar = upVar.f9338e.f682j;
        if (txVar != null) {
            if (txVar.f9296b) {
                return;
            }
        }
        upVar.m6006c();
    }

    /* renamed from: a */
    public final void m453a(ux uxVar, ue ueVar) {
        uxVar.m6015a(0, 8192);
        if (this.f656A.f9354h && uxVar.m6032m() && !uxVar.m6029j() && !uxVar.m6035p()) {
            this.f679g.m6146a(m429d(uxVar), uxVar);
        }
        this.f679g.m6149b(uxVar, ueVar);
    }

    /* renamed from: o */
    public final void m478o() {
        ub ubVar = this.f696x;
        if (ubVar != null) {
            ubVar.mo3334b();
        }
        ug ugVar = this.f683k;
        if (ugVar != null) {
            ugVar.m5940a(this.f676d);
            this.f683k.m5952b(this.f676d);
        }
        this.f676d.m5998a();
    }

    public void removeDetachedView(View view, boolean z) {
        ux c = m428c(view);
        if (c != null) {
            if (c.m6031l()) {
                c.m6023d();
            } else if (!c.m6035p()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                stringBuilder.append(c);
                stringBuilder.append(m471g());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        view.clearAnimation();
        m428c(view);
        super.removeDetachedView(view, z);
    }

    /* renamed from: a */
    public final void m450a(uf ufVar) {
        ug ugVar = this.f683k;
        if (ugVar != null) {
            ugVar.mo2466a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f685m.remove(ufVar);
        if (this.f685m.isEmpty()) {
            boolean z;
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        m475l();
        requestLayout();
    }

    public void requestChildFocus(View view, View view2) {
        if (!(m440x() || view2 == null)) {
            m422a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* renamed from: a */
    private final void m422a(View view, View view2) {
        View view3;
        boolean z = false;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f680h.set(0, 0, view3.getWidth(), view3.getHeight());
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof uk) {
            uk ukVar = (uk) layoutParams;
            if (!ukVar.f9326e) {
                Rect rect = ukVar.f9325d;
                Rect rect2 = this.f680h;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom = rect.bottom + rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f680h);
            offsetRectIntoDescendantCoords(view, this.f680h);
        }
        ug ugVar = this.f683k;
        Rect rect3 = this.f680h;
        boolean z2 = this.f689q ^ 1;
        if (view2 == null) {
            z = true;
        }
        ugVar.m5943a(this, view, rect3, z2, z);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f683k.m5943a(this, view, rect, z, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f686n.size();
        for (int i = 0; i < size; i++) {
            ((ul) this.f686n.get(i)).mo2456a();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f668Q == 0) {
            super.requestLayout();
        } else {
            this.f669R = true;
        }
    }

    /* renamed from: z */
    private final void m442z() {
        uv uvVar = this.f656A;
        uvVar.f9359m = -1;
        uvVar.f9358l = -1;
        uvVar.f9360n = -1;
    }

    /* renamed from: A */
    private final void m415A() {
        int i = 0;
        VelocityTracker velocityTracker = this.ac;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m464c(0);
        EdgeEffect edgeEffect = this.f692t;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i = this.f692t.isFinished();
        }
        edgeEffect = this.f693u;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i |= this.f693u.isFinished();
        }
        edgeEffect = this.f694v;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i |= this.f694v.isFinished();
        }
        edgeEffect = this.f695w;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i |= this.f695w.isFinished();
        }
        if (i != 0) {
            jm.m4542A(this);
        }
    }

    public void scrollBy(int i, int i2) {
        ug ugVar = this.f683k;
        if (ugVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        boolean h = ugVar.mo821h();
        boolean i3 = this.f683k.mo822i();
        if (h || i3) {
            if (!h) {
                i = 0;
            }
            if (!i3) {
                i2 = 0;
            }
            m424a(i, i2, null);
        }
    }

    /* renamed from: a */
    private final boolean m424a(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        m445a();
        if (this.f682j != null) {
            m448a(i, i2, this.f663H);
            int[] iArr = this.f663H;
            i3 = iArr[0];
            i4 = iArr[1];
            i5 = i - i3;
            i6 = i2 - i4;
        } else {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (!this.f685m.isEmpty()) {
            invalidate();
        }
        if (m455a(i3, i4, i5, i6, this.ar, 0)) {
            int i7 = this.af;
            int[] iArr2 = this.ar;
            i6 = iArr2[0];
            this.af = i7 - i6;
            i7 = this.ag;
            i5 = iArr2[1];
            this.ag = i7 - i5;
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) i6, (float) i5);
            }
            iArr = this.as;
            i5 = iArr[0];
            int[] iArr3 = this.ar;
            iArr[0] = i5 + iArr3[0];
            iArr[1] = iArr3[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (!(motionEvent == null || (motionEvent.getSource() & FragmentTransaction.TRANSIT_FRAGMENT_CLOSE) == FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)) {
                Object obj;
                float x = motionEvent.getX();
                float f = (float) i5;
                float y = motionEvent.getY();
                float f2 = (float) i6;
                if (f < 0.0f) {
                    m468d();
                    this.f692t.onPull((-f) / ((float) getWidth()), 1.0f - (y / ((float) getHeight())));
                    obj = 1;
                } else if (f > 0.0f) {
                    m469e();
                    this.f694v.onPull(f / ((float) getWidth()), y / ((float) getHeight()));
                    obj = 1;
                } else {
                    obj = null;
                }
                if (f2 < 0.0f) {
                    m470f();
                    this.f693u.onPull((-f2) / ((float) getHeight()), x / ((float) getWidth()));
                    obj = 1;
                } else if (f2 > 0.0f) {
                    m463c();
                    this.f695w.onPull(f2 / ((float) getHeight()), 1.0f - (x / ((float) getWidth())));
                    obj = 1;
                }
                if (!(obj == null && f == 0.0f && f2 == 0.0f)) {
                    jm.m4542A(this);
                }
            }
            m446a(i, i2);
        }
        if (!(i3 == 0 && i4 == 0)) {
            m458b();
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void m448a(int i, int i2, int[] iArr) {
        int b;
        m479p();
        m476m();
        Trace.beginSection("RV Scroll");
        m438v();
        if (i != 0) {
            int a = this.f683k.mo803a(i, this.f676d, this.f656A);
        } else {
            boolean z = false;
        }
        if (i2 != 0) {
            b = this.f683k.mo809b(i2, this.f676d, this.f656A);
        } else {
            b = 0;
        }
        Trace.endSection();
        int a2 = this.f678f.m5758a();
        for (int i3 = 0; i3 < a2; i3++) {
            View b2 = this.f678f.m5765b(i3);
            ux e = m431e(b2);
            if (e != null) {
                e = e.f9377i;
                if (e != null) {
                    View view = e.f9369a;
                    int left = b2.getLeft();
                    int top = b2.getTop();
                    if (left != view.getLeft() || top != view.getTop()) {
                        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    }
                }
            }
        }
        m454a(true);
        m466c(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (m440x()) {
            int i2;
            if (accessibilityEvent == null) {
                i2 = 0;
            } else {
                i2 = accessibilityEvent.getContentChangeTypes();
            }
            if (i2 != 0) {
                i = i2;
            }
            this.f670S = i | this.f670S;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    /* renamed from: a */
    public final boolean m457a(ux uxVar, int i) {
        if (m440x()) {
            uxVar.f9382n = i;
            this.at.add(uxVar);
            return false;
        }
        jm.m4568c(uxVar.f9369a, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f665N) {
            m439w();
        }
        this.f665N = z;
        super.setClipToPadding(z);
        if (this.f689q) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void m451a(ug ugVar) {
        if (ugVar != this.f683k) {
            m416B();
            if (this.f683k != null) {
                ub ubVar = this.f696x;
                if (ubVar != null) {
                    ubVar.mo3334b();
                }
                this.f683k.m5940a(this.f676d);
                this.f683k.m5952b(this.f676d);
                this.f676d.m5998a();
                if (this.f688p) {
                    this.f683k.mo826w();
                }
                this.f683k.m5951b(null);
                this.f683k = null;
            } else {
                this.f676d.m5998a();
            }
            rp rpVar = this.f678f;
            rq rqVar = rpVar.f9140b;
            do {
                rqVar.f9142a = 0;
                rqVar = rqVar.f9143b;
            } while (rqVar != null);
            for (int size = rpVar.f9141c.size() - 1; size >= 0; size--) {
                rpVar.f9139a.m5780b((View) rpVar.f9141c.get(size));
                rpVar.f9141c.remove(size);
            }
            rr rrVar = rpVar.f9139a;
            int childCount = rrVar.f9144a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = rrVar.m5778a(i);
                m428c(a);
                a.clearAnimation();
            }
            rrVar.f9144a.removeAllViews();
            this.f683k = ugVar;
            if (ugVar != null) {
                if (ugVar.f9309g != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("LayoutManager ");
                    stringBuilder.append(ugVar);
                    stringBuilder.append(" is already attached to a RecyclerView:");
                    stringBuilder.append(ugVar.f9309g.m471g());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                this.f683k.m5951b(this);
                if (this.f688p) {
                    this.f683k.mo825v();
                }
            }
            this.f676d.m6008d();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        m472i().m4481a(z);
    }

    /* renamed from: b */
    public final void m459b(int i) {
        if (i != this.aa) {
            this.aa = i;
            if (i != 2) {
                this.an.m6012b();
            }
            List list = this.f657B;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f657B.get(size);
                }
            }
        }
    }

    /* renamed from: c */
    public final void m465c(int i, int i2) {
        ug ugVar = this.f683k;
        if (ugVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        int i3;
        int i4;
        if (ugVar.mo821h()) {
            i3 = i;
        } else {
            i3 = 0;
        }
        if (this.f683k.mo822i()) {
            i4 = i2;
        } else {
            i4 = 0;
        }
        if (i3 != 0 || i4 != 0) {
            int height;
            uw uwVar = this.an;
            int abs = Math.abs(i3);
            int abs2 = Math.abs(i4);
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            if (abs <= abs2) {
                height = uwVar.f9365e.getHeight();
            } else {
                height = uwVar.f9365e.getWidth();
            }
            float f = (float) height;
            float f2 = (float) (height / 2);
            f2 += ((float) Math.sin((double) ((Math.min(1.0f, ((float) sqrt2) / f) - 8.0f) * 0.47123894f))) * f2;
            if (sqrt > 0) {
                height = Math.round(Math.abs(f2 / ((float) sqrt)) * 1000.0f) << 2;
            } else {
                if (abs > abs2) {
                    height = abs;
                } else {
                    height = abs2;
                }
                height = (int) (((((float) height) / f) + 1.0f) * 300.0f);
            }
            abs2 = Math.min(height, BlockingCameraManager.OPEN_TIME_OUT_MS);
            Interpolator interpolator = f650I;
            if (uwVar.f9364d != interpolator) {
                uwVar.f9364d = interpolator;
                uwVar.f9363c = new OverScroller(uwVar.f9365e.getContext(), interpolator);
            }
            uwVar.f9365e.m459b(2);
            uwVar.f9362b = 0;
            uwVar.f9361a = 0;
            uwVar.f9363c.startScroll(0, 0, i3, i4, abs2);
            uwVar.m6011a();
        }
    }

    /* renamed from: p */
    public final void m479p() {
        this.f668Q++;
        if (this.f668Q == 1) {
            this.f669R = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return m472i().m4485a(i, 0);
    }

    /* renamed from: d */
    private final boolean m430d(int i, int i2) {
        return m472i().m4485a(i, i2);
    }

    /* renamed from: c */
    public final void m466c(boolean z) {
        if (this.f668Q <= 0) {
            this.f668Q = 1;
        }
        if (!z) {
            this.f669R = false;
        }
        if (this.f668Q == 1) {
            if (z && this.f669R && this.f683k != null && this.f682j != null) {
                m435s();
            }
            this.f669R = false;
        }
        this.f668Q--;
    }

    public void stopNestedScroll() {
        m472i().m4488b(0);
    }

    /* renamed from: c */
    public final void m464c(int i) {
        m472i().m4488b(i);
    }

    /* renamed from: B */
    private final void m416B() {
        m459b(0);
        this.an.m6012b();
    }
}

package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: tg */
public class tg implements pj {
    /* renamed from: a */
    private static Method f19610a;
    /* renamed from: b */
    private static Method f19611b;
    /* renamed from: c */
    private static Method f19612c;
    /* renamed from: A */
    private final tj f19613A;
    /* renamed from: B */
    private final Rect f19614B;
    /* renamed from: d */
    private Context f19615d;
    /* renamed from: e */
    public sh f19616e;
    /* renamed from: f */
    public int f19617f;
    /* renamed from: g */
    public int f19618g;
    /* renamed from: h */
    public boolean f19619h;
    /* renamed from: i */
    public boolean f19620i;
    /* renamed from: j */
    public int f19621j;
    /* renamed from: k */
    public int f19622k;
    /* renamed from: l */
    public View f19623l;
    /* renamed from: m */
    public OnItemClickListener f19624m;
    /* renamed from: n */
    public final tn f19625n;
    /* renamed from: o */
    public final Handler f19626o;
    /* renamed from: p */
    public Rect f19627p;
    /* renamed from: q */
    public boolean f19628q;
    /* renamed from: r */
    public PopupWindow f19629r;
    /* renamed from: s */
    private ListAdapter f19630s;
    /* renamed from: t */
    private int f19631t;
    /* renamed from: u */
    private int f19632u;
    /* renamed from: v */
    private int f19633v;
    /* renamed from: w */
    private boolean f19634w;
    /* renamed from: x */
    private DataSetObserver f19635x;
    /* renamed from: y */
    private final tm f19636y;
    /* renamed from: z */
    private final tl f19637z;

    static {
        try {
            f19610a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f19611b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f19612c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public tg(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public tg(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f19631t = -2;
        this.f19617f = -2;
        this.f19633v = 1002;
        this.f19621j = 0;
        this.f19622k = LfuScheduler.MAX_PRIORITY;
        this.f19625n = new tn(this);
        this.f19636y = new tm(this);
        this.f19637z = new tl(this);
        this.f19613A = new tj(this);
        this.f19614B = new Rect();
        this.f19615d = context;
        this.f19626o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ni.aU, i, i2);
        this.f19618g = obtainStyledAttributes.getDimensionPixelOffset(ni.aV, 0);
        this.f19632u = obtainStyledAttributes.getDimensionPixelOffset(ni.aW, 0);
        if (this.f19632u != 0) {
            this.f19634w = true;
        }
        obtainStyledAttributes.recycle();
        this.f19629r = new qz(context, attributeSet, i, i2);
        this.f19629r.setInputMethodMode(1);
    }

    /* renamed from: b */
    public final void m14415b() {
        sh shVar = this.f19616e;
        if (shVar != null) {
            shVar.f9201a = true;
            shVar.requestLayout();
        }
    }

    /* renamed from: a */
    sh mo3349a(Context context, boolean z) {
        return new sh(context, z);
    }

    /* renamed from: c */
    public final void mo2471c() {
        this.f19629r.dismiss();
        this.f19629r.setContentView(null);
        this.f19616e = null;
        this.f19626o.removeCallbacks(this.f19625n);
    }

    /* renamed from: d */
    public final ListView mo2472d() {
        return this.f19616e;
    }

    /* renamed from: a */
    private final int m14409a(View view, int i, boolean z) {
        if (f19611b != null) {
            try {
                return ((Integer) f19611b.invoke(this.f19629r, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f19629r.getMaxAvailableHeight(view, i);
    }

    /* renamed from: g */
    public final int m14421g() {
        if (this.f19634w) {
            return this.f19632u;
        }
        return 0;
    }

    /* renamed from: h */
    public final boolean m14422h() {
        return this.f19629r.getInputMethodMode() == 2;
    }

    /* renamed from: e */
    public final boolean mo2473e() {
        return this.f19629r.isShowing();
    }

    /* renamed from: a */
    public void mo3329a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f19635x;
        if (dataSetObserver == null) {
            this.f19635x = new tk(this);
        } else {
            ListAdapter listAdapter2 = this.f19630s;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f19630s = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f19635x);
        }
        sh shVar = this.f19616e;
        if (shVar != null) {
            shVar.setAdapter(this.f19630s);
        }
    }

    /* renamed from: a */
    public final void m14412a(Drawable drawable) {
        this.f19629r.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public final void m14411a(int i) {
        Drawable background = this.f19629r.getBackground();
        if (background != null) {
            background.getPadding(this.f19614B);
            Rect rect = this.f19614B;
            this.f19617f = (rect.right + rect.left) + i;
            return;
        }
        this.f19617f = i;
    }

    /* renamed from: i */
    public final void m14423i() {
        this.f19629r.setInputMethodMode(2);
    }

    /* renamed from: j */
    public final void m14424j() {
        this.f19628q = true;
        this.f19629r.setFocusable(true);
    }

    /* renamed from: a */
    public final void m14414a(OnDismissListener onDismissListener) {
        this.f19629r.setOnDismissListener(onDismissListener);
    }

    /* renamed from: b */
    public final void m14416b(int i) {
        this.f19632u = i;
        this.f19634w = true;
    }

    /* renamed from: f */
    public void mo2474f() {
        Rect rect;
        int i;
        int i2;
        boolean z;
        int makeMeasureSpec;
        int i3 = 0;
        if (this.f19616e == null) {
            Context context = this.f19615d;
            th thVar = new th(this);
            this.f19616e = mo3349a(context, this.f19628q ^ 1);
            this.f19616e.setAdapter(this.f19630s);
            this.f19616e.setOnItemClickListener(this.f19624m);
            this.f19616e.setFocusable(true);
            this.f19616e.setFocusableInTouchMode(true);
            this.f19616e.setOnItemSelectedListener(new ti(this));
            this.f19616e.setOnScrollListener(this.f19637z);
            this.f19629r.setContentView(this.f19616e);
        } else {
            this.f19629r.getContentView();
        }
        Drawable background = this.f19629r.getBackground();
        if (background != null) {
            background.getPadding(this.f19614B);
            rect = this.f19614B;
            i = rect.top + rect.bottom;
            if (this.f19634w) {
                i2 = i;
            } else {
                this.f19632u = -rect.top;
                i2 = i;
            }
        } else {
            this.f19614B.setEmpty();
            i2 = 0;
        }
        if (this.f19629r.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = m14409a(this.f19623l, this.f19632u, z);
        if (this.f19631t == -1) {
            i = a + i2;
        } else {
            i = this.f19617f;
            switch (i) {
                case -2:
                    i = this.f19615d.getResources().getDisplayMetrics().widthPixels;
                    rect = this.f19614B;
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(i - (rect.right + rect.left), kvl.UNSET_ENUM_VALUE);
                    break;
                case -1:
                    i = this.f19615d.getResources().getDisplayMetrics().widthPixels;
                    rect = this.f19614B;
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(i - (rect.right + rect.left), 1073741824);
                    break;
                default:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(i, 1073741824);
                    break;
            }
            makeMeasureSpec = this.f19616e.mo2475a(makeMeasureSpec, 0, -1, a, -1);
            if (makeMeasureSpec > 0) {
                i = (this.f19616e.getPaddingTop() + this.f19616e.getPaddingBottom()) + i2;
            } else {
                i = 0;
            }
            i += makeMeasureSpec;
        }
        boolean h = m14422h();
        this.f19629r.setWindowLayoutType(this.f19633v);
        if (!this.f19629r.isShowing()) {
            makeMeasureSpec = this.f19617f;
            if (makeMeasureSpec == -1) {
                makeMeasureSpec = -1;
            } else if (makeMeasureSpec == -2) {
                makeMeasureSpec = this.f19623l.getWidth();
            }
            i3 = this.f19631t;
            if (i3 == -1) {
                i = -1;
            } else if (i3 != -2) {
                i = i3;
            }
            this.f19629r.setWidth(makeMeasureSpec);
            this.f19629r.setHeight(i);
            if (f19610a != null) {
                try {
                    f19610a.invoke(this.f19629r, new Object[]{Boolean.valueOf(true)});
                } catch (Exception e) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
            this.f19629r.setOutsideTouchable(true);
            this.f19629r.setTouchInterceptor(this.f19636y);
            if (this.f19620i) {
                this.f19629r.setOverlapAnchor(this.f19619h);
            }
            if (f19612c != null) {
                try {
                    f19612c.invoke(this.f19629r, new Object[]{this.f19627p});
                } catch (Throwable e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
            this.f19629r.showAsDropDown(this.f19623l, this.f19618g, this.f19632u, this.f19621j);
            this.f19616e.setSelection(-1);
            if (!this.f19628q || this.f19616e.isInTouchMode()) {
                m14415b();
            }
            if (!this.f19628q) {
                this.f19626o.post(this.f19613A);
            }
        } else if (jm.m4589w(this.f19623l)) {
            PopupWindow popupWindow;
            makeMeasureSpec = this.f19617f;
            a = makeMeasureSpec != -1 ? makeMeasureSpec != -2 ? makeMeasureSpec : this.f19623l.getWidth() : -1;
            int i4 = this.f19631t;
            if (i4 == -1) {
                if (h) {
                    i4 = i;
                } else {
                    i4 = -1;
                }
                if (h) {
                    PopupWindow popupWindow2 = this.f19629r;
                    if (this.f19617f == -1) {
                        i = -1;
                    } else {
                        i = 0;
                    }
                    popupWindow2.setWidth(i);
                    this.f19629r.setHeight(0);
                } else {
                    popupWindow = this.f19629r;
                    if (this.f19617f == -1) {
                        i3 = -1;
                    }
                    popupWindow.setWidth(i3);
                    this.f19629r.setHeight(-1);
                }
            } else if (i4 == -2) {
                i4 = i;
            }
            this.f19629r.setOutsideTouchable(true);
            popupWindow = this.f19629r;
            View view = this.f19623l;
            i3 = this.f19618g;
            int i5 = this.f19632u;
            if (a < 0) {
                a = -1;
            }
            if (i4 < 0) {
                i4 = -1;
            }
            popupWindow.update(view, i3, i5, a, i4);
        }
    }
}

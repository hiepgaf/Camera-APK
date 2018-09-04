package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;
import p000.jm;
import p000.kvl;
import p000.lu;
import p000.ni;
import p000.op;
import p000.ot;
import p000.py;
import p000.qh;
import p000.qv;
import p000.qx;
import p000.rn;
import p000.ru;
import p000.vb;
import p000.vk;
import p000.vl;
import p000.vn;
import p000.vo;
import p000.vp;
import p000.vx;

/* compiled from: PG */
public class Toolbar extends ViewGroup {
    /* renamed from: A */
    private int f699A;
    /* renamed from: B */
    private int f700B;
    /* renamed from: C */
    private int f701C;
    /* renamed from: D */
    private int f702D;
    /* renamed from: E */
    private int f703E;
    /* renamed from: F */
    private boolean f704F;
    /* renamed from: G */
    private boolean f705G;
    /* renamed from: H */
    private final ArrayList f706H;
    /* renamed from: I */
    private final int[] f707I;
    /* renamed from: J */
    private ru f708J;
    /* renamed from: K */
    private final Runnable f709K;
    /* renamed from: a */
    public ActionMenuView f710a;
    /* renamed from: b */
    public TextView f711b;
    /* renamed from: c */
    public TextView f712c;
    /* renamed from: d */
    public ImageButton f713d;
    /* renamed from: e */
    public Drawable f714e;
    /* renamed from: f */
    public CharSequence f715f;
    /* renamed from: g */
    public ImageButton f716g;
    /* renamed from: h */
    public View f717h;
    /* renamed from: i */
    public Context f718i;
    /* renamed from: j */
    public int f719j;
    /* renamed from: k */
    public int f720k;
    /* renamed from: l */
    public int f721l;
    /* renamed from: m */
    public int f722m;
    /* renamed from: n */
    public vb f723n;
    /* renamed from: o */
    public CharSequence f724o;
    /* renamed from: p */
    public CharSequence f725p;
    /* renamed from: q */
    public final ArrayList f726q;
    /* renamed from: r */
    public py f727r;
    /* renamed from: s */
    public vn f728s;
    /* renamed from: t */
    public boolean f729t;
    /* renamed from: u */
    private ImageView f730u;
    /* renamed from: v */
    private int f731v;
    /* renamed from: w */
    private int f732w;
    /* renamed from: x */
    private int f733x;
    /* renamed from: y */
    private int f734y;
    /* renamed from: z */
    private int f735z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        TextView textView;
        super(context, attributeSet, i);
        this.f701C = 8388627;
        this.f706H = new ArrayList();
        this.f726q = new ArrayList();
        this.f707I = new int[2];
        qh qhVar = new qh();
        this.f709K = new vl(this);
        vk a = vk.m6047a(getContext(), attributeSet, ni.cc, i, 0);
        this.f720k = a.m6061g(ni.cB, 0);
        this.f721l = a.m6061g(ni.cs, 0);
        this.f701C = a.m6057e(ni.cd, this.f701C);
        this.f722m = a.m6057e(ni.ce, 48);
        int b = a.m6051b(ni.cv, 0);
        if (a.m6060f(ni.cA)) {
            b = a.m6051b(ni.cA, b);
        }
        this.f735z = b;
        this.f734y = b;
        this.f733x = b;
        this.f732w = b;
        b = a.m6051b(ni.cy, -1);
        if (b >= 0) {
            this.f732w = b;
        }
        b = a.m6051b(ni.cx, -1);
        if (b >= 0) {
            this.f733x = b;
        }
        b = a.m6051b(ni.cz, -1);
        if (b >= 0) {
            this.f734y = b;
        }
        b = a.m6051b(ni.cw, -1);
        if (b >= 0) {
            this.f735z = b;
        }
        this.f731v = a.m6053c(ni.cn, -1);
        b = a.m6051b(ni.cj, kvl.UNSET_ENUM_VALUE);
        int b2 = a.m6051b(ni.ch, kvl.UNSET_ENUM_VALUE);
        int c = a.m6053c(7, 0);
        int c2 = a.m6053c(8, 0);
        m503b();
        vb vbVar = this.f723n;
        vbVar.f9402h = false;
        if (c != kvl.UNSET_ENUM_VALUE) {
            vbVar.f9399e = c;
            vbVar.f9395a = c;
        }
        if (c2 != kvl.UNSET_ENUM_VALUE) {
            vbVar.f9400f = c2;
            vbVar.f9396b = c2;
        }
        if (!(b == kvl.UNSET_ENUM_VALUE && b2 == kvl.UNSET_ENUM_VALUE)) {
            vbVar.m6038a(b, b2);
        }
        this.f699A = a.m6051b(ni.ck, kvl.UNSET_ENUM_VALUE);
        this.f700B = a.m6051b(ni.ci, kvl.UNSET_ENUM_VALUE);
        this.f714e = a.m6052b(ni.cg);
        this.f715f = a.m6058e(ni.cf);
        CharSequence e = a.m6058e(ni.cu);
        if (!TextUtils.isEmpty(e)) {
            m507c(e);
        }
        e = a.m6058e(ni.cr);
        if (!TextUtils.isEmpty(e)) {
            m505b(e);
        }
        this.f718i = getContext();
        m499a(a.m6061g(ni.cq, 0));
        Drawable b3 = a.m6052b(ni.cp);
        if (b3 != null) {
            m504b(b3);
        }
        e = a.m6058e(ni.co);
        if (!TextUtils.isEmpty(e)) {
            m502a(e);
        }
        b3 = a.m6052b(ni.cl);
        if (b3 != null) {
            m500a(b3);
        }
        e = a.m6058e(ni.cm);
        if (!TextUtils.isEmpty(e)) {
            if (!TextUtils.isEmpty(e)) {
                m493j();
            }
            ImageView imageView = this.f730u;
            if (imageView != null) {
                imageView.setContentDescription(e);
            }
        }
        if (a.m6060f(ni.cC)) {
            b = a.m6048a(ni.cC, -1);
            this.f702D = b;
            textView = this.f711b;
            if (textView != null) {
                textView.setTextColor(b);
            }
        }
        if (a.m6060f(ni.ct)) {
            b = a.m6048a(ni.ct, -1);
            this.f703E = b;
            textView = this.f712c;
            if (textView != null) {
                textView.setTextColor(b);
            }
        }
        a.f9419b.recycle();
    }

    /* renamed from: a */
    private final void m486a(List list, int i) {
        int j = jm.m4576j(this);
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, jm.m4576j(this));
        list.clear();
        int i2;
        vo voVar;
        if (j == 1) {
            for (i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                voVar = (vo) childAt.getLayoutParams();
                if (voVar.f19653b == 0 && m492d(childAt) && m487b(voVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (i2 = 0; i2 < childCount; i2++) {
            View childAt2 = getChildAt(i2);
            voVar = (vo) childAt2.getLayoutParams();
            if (voVar.f19653b == 0 && m492d(childAt2) && m487b(voVar.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    final void m501a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = m491d();
        } else if (checkLayoutParams(layoutParams)) {
            vo voVar = (vo) layoutParams;
        } else {
            layoutParams = m484a(layoutParams);
        }
        layoutParams.f19653b = 1;
        if (!z || this.f717h == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f726q.add(view);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof vo);
    }

    /* renamed from: a */
    public final void m498a() {
        ot otVar;
        vn vnVar = this.f728s;
        if (vnVar != null) {
            otVar = vnVar.f19650a;
        } else {
            otVar = null;
        }
        if (otVar != null) {
            otVar.collapseActionView();
        }
    }

    /* renamed from: b */
    public final void m503b() {
        if (this.f723n == null) {
            this.f723n = new vb();
        }
    }

    /* renamed from: j */
    private final void m493j() {
        if (this.f730u == null) {
            this.f730u = new qx(getContext());
        }
    }

    /* renamed from: c */
    public final void m506c() {
        if (this.f713d == null) {
            this.f713d = new qv(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams d = m491d();
            d.a = (this.f722m & 112) | 8388611;
            this.f713d.setLayoutParams(d);
        }
    }

    /* renamed from: d */
    public static vo m491d() {
        return new vo();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m491d();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new vo(getContext(), attributeSet);
    }

    /* renamed from: a */
    private static vo m484a(LayoutParams layoutParams) {
        if (layoutParams instanceof vo) {
            return new vo((vo) layoutParams);
        }
        if (layoutParams instanceof lu) {
            return new vo((lu) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new vo((MarginLayoutParams) layoutParams);
        }
        return new vo(layoutParams);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m484a(layoutParams);
    }

    /* renamed from: b */
    private final int m487b(int i) {
        int j = jm.m4576j(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, j) & 7;
        switch (absoluteGravity) {
            case 1:
            case 3:
            case 5:
                return absoluteGravity;
            default:
                return j == 1 ? 5 : 3;
        }
    }

    /* renamed from: a */
    private final int m481a(View view, int i) {
        int i2;
        vo voVar = (vo) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = voVar.a & 112;
        switch (i3) {
            case 16:
            case 48:
            case 80:
                break;
            default:
                i3 = this.f701C & 112;
                break;
        }
        switch (i3) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - voVar.bottomMargin) - i2;
            default:
                int i4;
                i3 = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                i2 = (((height - i3) - paddingBottom) - measuredHeight) / 2;
                if (i2 < voVar.topMargin) {
                    i4 = voVar.topMargin;
                } else {
                    measuredHeight = (((height - paddingBottom) - measuredHeight) - i2) - i3;
                    i4 = measuredHeight < voVar.bottomMargin ? Math.max(0, i2 - (voVar.bottomMargin - measuredHeight)) : i2;
                }
                return i4 + i3;
        }
    }

    /* renamed from: k */
    private final int m494k() {
        vb vbVar = this.f723n;
        if (vbVar != null) {
            return !vbVar.f9401g ? vbVar.f9396b : vbVar.f9395a;
        } else {
            return 0;
        }
    }

    /* renamed from: l */
    private final int m495l() {
        vb vbVar = this.f723n;
        if (vbVar != null) {
            return !vbVar.f9401g ? vbVar.f9395a : vbVar.f9396b;
        } else {
            return 0;
        }
    }

    /* renamed from: m */
    private final int m496m() {
        int i;
        ActionMenuView actionMenuView = this.f710a;
        if (actionMenuView == null) {
            i = 0;
        } else {
            op opVar = actionMenuView.f10072a;
            i = opVar != null ? opVar.hasVisibleItems() ? 1 : 0 : 0;
        }
        if (i != 0) {
            return Math.max(m494k(), Math.max(this.f700B, 0));
        }
        return m494k();
    }

    /* renamed from: n */
    private final int m497n() {
        if (m509f() != null) {
            return Math.max(m495l(), Math.max(this.f699A, 0));
        }
        return m495l();
    }

    /* renamed from: a */
    private static int m480a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: e */
    public final CharSequence m508e() {
        ImageButton imageButton = this.f713d;
        return imageButton != null ? imageButton.getContentDescription() : null;
    }

    /* renamed from: f */
    public final Drawable m509f() {
        ImageButton imageButton = this.f713d;
        return imageButton != null ? imageButton.getDrawable() : null;
    }

    /* renamed from: b */
    private static int m488b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    /* renamed from: g */
    public final ru m510g() {
        if (this.f708J == null) {
            this.f708J = new ru(this);
        }
        return this.f708J;
    }

    /* renamed from: c */
    private final boolean m490c(View view) {
        return view.getParent() == this || this.f726q.contains(view);
    }

    /* renamed from: h */
    public final boolean m511h() {
        ActionMenuView actionMenuView = this.f710a;
        if (actionMenuView != null) {
            boolean z;
            py pyVar = actionMenuView.f10074c;
            if (pyVar == null) {
                z = false;
            } else if (pyVar.m16769e()) {
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
    private final int m483a(View view, int i, int[] iArr, int i2) {
        vo voVar = (vo) view.getLayoutParams();
        int i3 = voVar.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        i3 = m481a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i3, max + measuredWidth, view.getMeasuredHeight() + i3);
        return (voVar.rightMargin + measuredWidth) + max;
    }

    /* renamed from: b */
    private final int m489b(View view, int i, int[] iArr, int i2) {
        vo voVar = (vo) view.getLayoutParams();
        int i3 = voVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        i3 = m481a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i3, max, view.getMeasuredHeight() + i3);
        return max - (voVar.leftMargin + measuredWidth);
    }

    /* renamed from: a */
    private final int m482a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private final void m485a(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, ((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f709K);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f705G = false;
        }
        if (!this.f705G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f705G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f705G = false;
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int min;
        int i6;
        int m;
        int n;
        int measuredHeight;
        vo voVar;
        int i7;
        if (jm.m4576j(this) != 1) {
            Object obj = null;
        } else {
            i5 = 1;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = width - paddingRight;
        int[] iArr = this.f707I;
        iArr[1] = 0;
        iArr[0] = 0;
        int k = jm.m4577k(this);
        if (k >= 0) {
            min = Math.min(k, i4 - i2);
        } else {
            min = 0;
        }
        if (!m492d(this.f713d)) {
            k = paddingLeft;
            i6 = i8;
        } else if (obj != null) {
            i6 = m489b(this.f713d, i8, iArr, min);
            k = paddingLeft;
        } else {
            k = m483a(this.f713d, paddingLeft, iArr, min);
            i6 = i8;
        }
        if (m492d(this.f716g)) {
            if (obj != null) {
                i6 = m489b(this.f716g, i6, iArr, min);
            } else {
                k = m483a(this.f716g, k, iArr, min);
            }
        }
        if (m492d(this.f710a)) {
            if (obj != null) {
                k = m483a(this.f710a, k, iArr, min);
            } else {
                i6 = m489b(this.f710a, i6, iArr, min);
            }
        }
        if (jm.m4576j(this) == 1) {
            m = m496m();
        } else {
            m = m497n();
        }
        if (jm.m4576j(this) == 1) {
            n = m497n();
        } else {
            n = m496m();
        }
        iArr[0] = Math.max(0, m - k);
        iArr[1] = Math.max(0, n - (i8 - i6));
        k = Math.max(k, m);
        i6 = Math.min(i6, i8 - n);
        if (m492d(this.f717h)) {
            if (obj != null) {
                i6 = m489b(this.f717h, i6, iArr, min);
            } else {
                k = m483a(this.f717h, k, iArr, min);
            }
        }
        if (!m492d(this.f730u)) {
            i8 = k;
            m = i6;
        } else if (obj != null) {
            i8 = k;
            m = m489b(this.f730u, i6, iArr, min);
        } else {
            i8 = m483a(this.f730u, k, iArr, min);
            m = i6;
        }
        boolean d = m492d(this.f711b);
        boolean d2 = m492d(this.f712c);
        if (d) {
            vo voVar2 = (vo) this.f711b.getLayoutParams();
            i6 = (voVar2.topMargin + this.f711b.getMeasuredHeight()) + voVar2.bottomMargin;
        } else {
            i6 = 0;
        }
        if (d2) {
            voVar2 = (vo) this.f712c.getLayoutParams();
            measuredHeight = (voVar2.bottomMargin + (voVar2.topMargin + this.f712c.getMeasuredHeight())) + i6;
        } else {
            measuredHeight = i6;
        }
        if (d || d2) {
            View view;
            View view2;
            Object obj2;
            if (d) {
                view = this.f711b;
            } else {
                view = this.f712c;
            }
            if (d2) {
                view2 = this.f712c;
            } else {
                view2 = this.f711b;
            }
            voVar2 = (vo) view.getLayoutParams();
            voVar = (vo) view2.getLayoutParams();
            if (d && this.f711b.getMeasuredWidth() > 0) {
                obj2 = 1;
            } else if (!d2) {
                obj2 = null;
            } else if (this.f712c.getMeasuredWidth() <= 0) {
                obj2 = null;
            } else {
                obj2 = 1;
            }
            switch (this.f701C & 112) {
                case 48:
                    i6 = this.f734y + (voVar2.topMargin + getPaddingTop());
                    break;
                case 80:
                    i6 = (((height - paddingBottom) - voVar.bottomMargin) - this.f735z) - measuredHeight;
                    break;
                default:
                    i7 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                    int i9 = voVar2.topMargin;
                    int i10 = this.f734y;
                    if (i7 < i9 + i10) {
                        k = voVar2.topMargin + i10;
                    } else {
                        measuredHeight = (((height - paddingBottom) - measuredHeight) - i7) - paddingTop;
                        k = voVar2.bottomMargin;
                        height = this.f735z;
                        k = measuredHeight < k + height ? Math.max(0, i7 - ((voVar.bottomMargin + height) - measuredHeight)) : i7;
                    }
                    i6 = paddingTop + k;
                    break;
            }
            if (obj != null) {
                if (obj2 != null) {
                    k = this.f732w;
                } else {
                    k = 0;
                }
                k -= iArr[1];
                m -= Math.max(0, k);
                iArr[1] = Math.max(0, -k);
                if (d) {
                    voVar2 = (vo) this.f711b.getLayoutParams();
                    i5 = m - this.f711b.getMeasuredWidth();
                    i7 = this.f711b.getMeasuredHeight() + i6;
                    this.f711b.layout(i5, i6, m, i7);
                    i5 -= this.f733x;
                    i6 = voVar2.bottomMargin + i7;
                } else {
                    i5 = m;
                }
                if (d2) {
                    voVar2 = (vo) this.f712c.getLayoutParams();
                    i6 += voVar2.topMargin;
                    this.f712c.layout(m - this.f712c.getMeasuredWidth(), i6, m, this.f712c.getMeasuredHeight() + i6);
                    i6 = m - this.f733x;
                    k = voVar2.bottomMargin;
                    k = i6;
                } else {
                    k = m;
                }
                if (obj2 != null) {
                    m = Math.min(i5, k);
                }
            } else {
                if (obj2 != null) {
                    k = this.f732w;
                } else {
                    k = 0;
                }
                k -= iArr[0];
                i8 += Math.max(0, k);
                iArr[0] = Math.max(0, -k);
                if (d) {
                    voVar2 = (vo) this.f711b.getLayoutParams();
                    i5 = this.f711b.getMeasuredWidth() + i8;
                    i7 = this.f711b.getMeasuredHeight() + i6;
                    this.f711b.layout(i8, i6, i5, i7);
                    i5 = this.f733x + i5;
                    i6 = voVar2.bottomMargin + i7;
                } else {
                    i5 = i8;
                }
                if (d2) {
                    voVar2 = (vo) this.f712c.getLayoutParams();
                    i6 += voVar2.topMargin;
                    i7 = this.f712c.getMeasuredWidth() + i8;
                    this.f712c.layout(i8, i6, i7, this.f712c.getMeasuredHeight() + i6);
                    i6 = this.f733x + i7;
                    k = voVar2.bottomMargin;
                    k = i6;
                } else {
                    k = i8;
                }
                if (obj2 != null) {
                    i8 = Math.max(i5, k);
                }
            }
        }
        m486a(this.f706H, 3);
        n = this.f706H.size();
        i5 = i8;
        for (i6 = 0; i6 < n; i6++) {
            i5 = m483a((View) this.f706H.get(i6), i5, iArr, min);
        }
        m486a(this.f706H, 5);
        i8 = this.f706H.size();
        i6 = 0;
        measuredHeight = m;
        while (i6 < i8) {
            m = m489b((View) this.f706H.get(i6), measuredHeight, iArr, min);
            i6++;
            measuredHeight = m;
        }
        m486a(this.f706H, 1);
        List list = this.f706H;
        i8 = iArr[0];
        m = iArr[1];
        paddingTop = list.size();
        n = i8;
        i7 = m;
        i8 = 0;
        m = 0;
        while (i8 < paddingTop) {
            View view3 = (View) list.get(i8);
            voVar = (vo) view3.getLayoutParams();
            n = voVar.leftMargin - n;
            i6 = voVar.rightMargin - i7;
            paddingBottom = Math.max(0, n);
            int max = Math.max(0, i6);
            n = Math.max(0, -n);
            i7 = Math.max(0, -i6);
            i8++;
            m += (view3.getMeasuredWidth() + paddingBottom) + max;
        }
        k = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (m / 2);
        i6 = k + m;
        if (k < i5) {
            k = i5;
        } else if (i6 > measuredHeight) {
            k -= i6 - measuredHeight;
        }
        paddingLeft = this.f706H.size();
        i5 = k;
        for (i6 = 0; i6 < paddingLeft; i6++) {
            i5 = m483a((View) this.f706H.get(i6), i5, iArr, min);
        }
        this.f706H.clear();
    }

    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        int max;
        int combineMeasuredStates;
        int i3;
        int[] iArr = this.f707I;
        boolean a = vx.m6076a(this);
        int i4 = a ^ 1;
        if (m492d(this.f713d)) {
            m485a(this.f713d, i, 0, i2, this.f731v);
            measuredWidth = this.f713d.getMeasuredWidth() + m480a(this.f713d);
            max = Math.max(0, this.f713d.getMeasuredHeight() + m488b(this.f713d));
            combineMeasuredStates = View.combineMeasuredStates(0, this.f713d.getMeasuredState());
            i3 = max;
        } else {
            measuredWidth = 0;
            combineMeasuredStates = 0;
            i3 = 0;
        }
        if (m492d(this.f716g)) {
            m485a(this.f716g, i, 0, i2, this.f731v);
            measuredWidth = this.f716g.getMeasuredWidth() + m480a(this.f716g);
            i3 = Math.max(i3, this.f716g.getMeasuredHeight() + m488b(this.f716g));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f716g.getMeasuredState());
        }
        int n = m497n();
        int max2 = Math.max(n, measuredWidth);
        iArr[a] = Math.max(0, n - measuredWidth);
        if (m492d(this.f710a)) {
            m485a(this.f710a, i, max2, i2, this.f731v);
            measuredWidth = this.f710a.getMeasuredWidth() + m480a(this.f710a);
            i3 = Math.max(i3, this.f710a.getMeasuredHeight() + m488b(this.f710a));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f710a.getMeasuredState());
        } else {
            measuredWidth = 0;
        }
        n = m496m();
        max2 += Math.max(n, measuredWidth);
        iArr[i4] = Math.max(0, n - measuredWidth);
        if (m492d(this.f717h)) {
            max2 += m482a(this.f717h, i, max2, i2, 0, iArr);
            i3 = Math.max(i3, this.f717h.getMeasuredHeight() + m488b(this.f717h));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f717h.getMeasuredState());
        }
        if (m492d(this.f730u)) {
            max2 += m482a(this.f730u, i, max2, i2, 0, iArr);
            i3 = Math.max(i3, this.f730u.getMeasuredHeight() + m488b(this.f730u));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f730u.getMeasuredState());
        }
        int childCount = getChildCount();
        int i5 = combineMeasuredStates;
        int i6 = i3;
        combineMeasuredStates = 0;
        while (combineMeasuredStates < childCount) {
            View childAt = getChildAt(combineMeasuredStates);
            if (((vo) childAt.getLayoutParams()).f19653b != 0) {
                measuredWidth = i5;
                n = i6;
            } else if (m492d(childAt)) {
                max2 += m482a(childAt, i, max2, i2, 0, iArr);
                max = Math.max(i6, childAt.getMeasuredHeight() + m488b(childAt));
                measuredWidth = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                n = max;
            } else {
                measuredWidth = i5;
                n = i6;
            }
            combineMeasuredStates++;
            i5 = measuredWidth;
            i6 = n;
        }
        int i7 = this.f734y + this.f735z;
        max = this.f732w + this.f733x;
        if (m492d(this.f711b)) {
            m482a(this.f711b, i, max2 + max, i2, i7, iArr);
            n = m480a(this.f711b) + this.f711b.getMeasuredWidth();
            measuredWidth = this.f711b.getMeasuredHeight() + m488b(this.f711b);
            i5 = View.combineMeasuredStates(i5, this.f711b.getMeasuredState());
        } else {
            n = 0;
            measuredWidth = 0;
        }
        if (m492d(this.f712c)) {
            n = Math.max(n, m482a(this.f712c, i, max2 + max, i2, i7 + measuredWidth, iArr));
            measuredWidth += this.f712c.getMeasuredHeight() + m488b(this.f712c);
            i5 = View.combineMeasuredStates(i5, this.f712c.getMeasuredState());
        }
        measuredWidth = Math.max(i6, measuredWidth);
        max = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max((n + max2) + (max + paddingRight), getSuggestedMinimumWidth()), i, -16777216 & i5), View.resolveSizeAndState(Math.max(measuredWidth + (paddingTop + paddingBottom), getSuggestedMinimumHeight()), i2, i5 << 16));
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof vp) {
            Menu menu;
            vp vpVar = (vp) parcelable;
            super.onRestoreInstanceState(vpVar.f7631e);
            ActionMenuView actionMenuView = this.f710a;
            if (actionMenuView == null) {
                menu = null;
            } else {
                menu = actionMenuView.f10072a;
            }
            int i = vpVar.f19654a;
            if (!(i == 0 || this.f728s == null || menu == null)) {
                MenuItem findItem = menu.findItem(i);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
            if (vpVar.f19655b) {
                removeCallbacks(this.f709K);
                post(this.f709K);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        super.onRtlPropertiesChanged(i);
        m503b();
        vb vbVar = this.f723n;
        if (i != 1) {
            z = false;
        }
        if (z != vbVar.f9401g) {
            vbVar.f9401g = z;
            if (!vbVar.f9402h) {
                vbVar.f9395a = vbVar.f9399e;
                vbVar.f9396b = vbVar.f9400f;
            } else if (z) {
                r0 = vbVar.f9398d;
                if (r0 == kvl.UNSET_ENUM_VALUE) {
                    r0 = vbVar.f9399e;
                }
                vbVar.f9395a = r0;
                r0 = vbVar.f9397c;
                if (r0 == kvl.UNSET_ENUM_VALUE) {
                    r0 = vbVar.f9400f;
                }
                vbVar.f9396b = r0;
            } else {
                r0 = vbVar.f9397c;
                if (r0 == kvl.UNSET_ENUM_VALUE) {
                    r0 = vbVar.f9399e;
                }
                vbVar.f9395a = r0;
                r0 = vbVar.f9398d;
                if (r0 == kvl.UNSET_ENUM_VALUE) {
                    r0 = vbVar.f9400f;
                }
                vbVar.f9396b = r0;
            }
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable vpVar = new vp(super.onSaveInstanceState());
        vn vnVar = this.f728s;
        if (vnVar != null) {
            ot otVar = vnVar.f19650a;
            if (otVar != null) {
                vpVar.f19654a = otVar.getItemId();
            }
        }
        vpVar.f19655b = m511h();
        return vpVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f704F = false;
        }
        if (!this.f704F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f704F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f704F = false;
        }
        return true;
    }

    /* renamed from: a */
    public final void m500a(Drawable drawable) {
        if (drawable != null) {
            m493j();
            if (!m490c(this.f730u)) {
                m501a(this.f730u, true);
            }
        } else {
            View view = this.f730u;
            if (view != null && m490c(view)) {
                removeView(this.f730u);
                this.f726q.remove(this.f730u);
            }
        }
        ImageView imageView = this.f730u;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public final void m502a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m506c();
        }
        ImageButton imageButton = this.f713d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public final void m504b(Drawable drawable) {
        if (drawable != null) {
            m506c();
            if (!m490c(this.f713d)) {
                m501a(this.f713d, true);
            }
        } else {
            View view = this.f713d;
            if (view != null && m490c(view)) {
                removeView(this.f713d);
                this.f726q.remove(this.f713d);
            }
        }
        ImageButton imageButton = this.f713d;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public final void m499a(int i) {
        if (this.f719j != i) {
            this.f719j = i;
            if (i == 0) {
                this.f718i = getContext();
            } else {
                this.f718i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* renamed from: b */
    public final void m505b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            View view = this.f712c;
            if (view != null && m490c(view)) {
                removeView(this.f712c);
                this.f726q.remove(this.f712c);
            }
        } else {
            if (this.f712c == null) {
                Context context = getContext();
                this.f712c = new rn(context);
                this.f712c.setSingleLine();
                this.f712c.setEllipsize(TruncateAt.END);
                int i = this.f721l;
                if (i != 0) {
                    this.f712c.setTextAppearance(context, i);
                }
                int i2 = this.f703E;
                if (i2 != 0) {
                    this.f712c.setTextColor(i2);
                }
            }
            if (!m490c(this.f712c)) {
                m501a(this.f712c, true);
            }
        }
        TextView textView = this.f712c;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.f725p = charSequence;
    }

    /* renamed from: c */
    public final void m507c(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            View view = this.f711b;
            if (view != null && m490c(view)) {
                removeView(this.f711b);
                this.f726q.remove(this.f711b);
            }
        } else {
            if (this.f711b == null) {
                Context context = getContext();
                this.f711b = new rn(context);
                this.f711b.setSingleLine();
                this.f711b.setEllipsize(TruncateAt.END);
                int i = this.f720k;
                if (i != 0) {
                    this.f711b.setTextAppearance(context, i);
                }
                int i2 = this.f702D;
                if (i2 != 0) {
                    this.f711b.setTextColor(i2);
                }
            }
            if (!m490c(this.f711b)) {
                m501a(this.f711b, true);
            }
        }
        TextView textView = this.f711b;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.f724o = charSequence;
    }

    /* renamed from: d */
    private final boolean m492d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: i */
    public final boolean m512i() {
        ActionMenuView actionMenuView = this.f710a;
        if (actionMenuView != null) {
            boolean z;
            py pyVar = actionMenuView.f10074c;
            if (pyVar == null) {
                z = false;
            } else if (pyVar.m16770f()) {
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
}

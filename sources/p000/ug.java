package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ug */
public abstract class ug {
    /* renamed from: a */
    private final vv f9306a = new uh(this);
    /* renamed from: b */
    private final vv f9307b = new ui(this);
    /* renamed from: f */
    public rp f9308f;
    /* renamed from: g */
    public RecyclerView f9309g;
    /* renamed from: h */
    public vt f9310h = new vt(this.f9306a);
    /* renamed from: i */
    public vt f9311i = new vt(this.f9307b);
    /* renamed from: j */
    public boolean f9312j = true;
    /* renamed from: k */
    public boolean f9313k = true;
    /* renamed from: l */
    public int f9314l;
    /* renamed from: m */
    public boolean f9315m;
    /* renamed from: n */
    public int f9316n;
    /* renamed from: o */
    public int f9317o;
    /* renamed from: p */
    public int f9318p;
    /* renamed from: q */
    public int f9319q;

    /* renamed from: a */
    public abstract uk mo804a();

    /* renamed from: a */
    final void m5935a(View view, int i, boolean z) {
        ux c = RecyclerView.m428c(view);
        if (z || c.m6029j()) {
            this.f9309g.f679g.m6147a(c);
        } else {
            this.f9309g.f679g.m6151c(c);
        }
        uk ukVar = (uk) view.getLayoutParams();
        if (c.m6037r() || c.m6030k()) {
            if (c.m6030k()) {
                c.m6036q();
            } else {
                c.m6022c();
            }
            this.f9308f.m5761a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f9309g) {
            int b = this.f9308f.m5764b(view);
            if (i == -1) {
                i = this.f9308f.m5758a();
            }
            if (b == -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                stringBuilder.append(this.f9309g.indexOfChild(view));
                stringBuilder.append(this.f9309g.m471g());
                throw new IllegalStateException(stringBuilder.toString());
            } else if (b != i) {
                ug ugVar = this.f9309g.f683k;
                View e = ugVar.m5963e(b);
                if (e == null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Cannot move a child from non-existing index:");
                    stringBuilder2.append(b);
                    stringBuilder2.append(ugVar.f9309g.toString());
                    throw new IllegalArgumentException(stringBuilder2.toString());
                }
                ugVar.m5960d(b);
                uk ukVar2 = (uk) e.getLayoutParams();
                ux c2 = RecyclerView.m428c(e);
                if (c2.m6029j()) {
                    ugVar.f9309g.f679g.m6147a(c2);
                } else {
                    ugVar.f9309g.f679g.m6151c(c2);
                }
                ugVar.f9308f.m5761a(e, i, ukVar2, c2.m6029j());
            }
        } else {
            this.f9308f.m5762a(view, i, false);
            ukVar.f9326e = true;
        }
        if (ukVar.f9327f) {
            c.f9369a.invalidate();
            ukVar.f9327f = false;
        }
    }

    /* renamed from: a */
    public void mo2466a(String str) {
        RecyclerView recyclerView = this.f9309g;
        if (recyclerView != null) {
            recyclerView.m449a(str);
        }
    }

    /* renamed from: h */
    public boolean mo821h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo822i() {
        return false;
    }

    /* renamed from: a */
    public boolean mo808a(uk ukVar) {
        return ukVar != null;
    }

    /* renamed from: a */
    public static int m5915a(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case kvl.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(size, Math.max(i2, i3));
            case 1073741824:
                return size;
            default:
                return Math.max(i2, i3);
        }
    }

    /* renamed from: a */
    public void mo2463a(int i, int i2, uv uvVar, uj ujVar) {
    }

    /* renamed from: a */
    public void mo2464a(int i, uj ujVar) {
    }

    /* renamed from: b */
    public int mo810b(uv uvVar) {
        return 0;
    }

    /* renamed from: c */
    public int mo812c(uv uvVar) {
        return 0;
    }

    /* renamed from: d */
    public int mo814d(uv uvVar) {
        return 0;
    }

    /* renamed from: e */
    public int mo816e(uv uvVar) {
        return 0;
    }

    /* renamed from: f */
    public int mo818f(uv uvVar) {
        return 0;
    }

    /* renamed from: g */
    public int mo820g(uv uvVar) {
        return 0;
    }

    /* renamed from: d */
    public final void m5960d(int i) {
        m5963e(i);
        this.f9308f.m5759a(i);
    }

    /* renamed from: c */
    public View mo2467c(int i) {
        int o = m5975o();
        for (int i2 = 0; i2 < o; i2++) {
            View e = m5963e(i2);
            ux c = RecyclerView.m428c(e);
            if (c != null && c.m6025f() == i && !c.m6035p() && (this.f9309g.f656A.f9353g || !c.m6029j())) {
                return e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public uk mo805a(Context context, AttributeSet attributeSet) {
        return new uk(context, attributeSet);
    }

    /* renamed from: a */
    public uk mo3341a(LayoutParams layoutParams) {
        if (layoutParams instanceof uk) {
            return new uk((uk) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new uk((MarginLayoutParams) layoutParams);
        }
        return new uk(layoutParams);
    }

    /* renamed from: e */
    public final View m5963e(int i) {
        rp rpVar = this.f9308f;
        return rpVar != null ? rpVar.m5765b(i) : null;
    }

    /* renamed from: o */
    public final int m5975o() {
        rp rpVar = this.f9308f;
        return rpVar != null ? rpVar.m5758a() : 0;
    }

    /* renamed from: a */
    public static int m5916a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = 0;
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i5 = 1073741824;
                max = i4;
            } else if (i4 == -1) {
                switch (i2) {
                    case kvl.UNSET_ENUM_VALUE /*-2147483648*/:
                    case 1073741824:
                        i5 = max;
                        break;
                    case 0:
                        i2 = 0;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                max = i5;
                i5 = i2;
            } else {
                max = i4 == -2 ? 0 : 0;
            }
        } else if (i4 >= 0) {
            i5 = 1073741824;
            max = i4;
        } else if (i4 == -1) {
            i5 = i2;
        } else if (i4 != -2) {
            max = 0;
        } else if (i2 == kvl.UNSET_ENUM_VALUE) {
            i5 = kvl.UNSET_ENUM_VALUE;
        } else if (i2 == 1073741824) {
            i5 = kvl.UNSET_ENUM_VALUE;
        }
        return MeasureSpec.makeMeasureSpec(max, i5);
    }

    /* renamed from: a */
    public int mo3339a(up upVar, uv uvVar) {
        RecyclerView recyclerView = this.f9309g;
        if (recyclerView == null || recyclerView.f682j == null || !mo821h()) {
            return 1;
        }
        return this.f9309g.f682j.mo728a();
    }

    /* renamed from: a */
    public static int m5917a(View view) {
        return ((uk) view.getLayoutParams()).f9325d.bottom + view.getBottom();
    }

    /* renamed from: b */
    public static int m5919b(View view) {
        return view.getTop() - ((uk) view.getLayoutParams()).f9325d.top;
    }

    /* renamed from: p */
    public final View m5976p() {
        RecyclerView recyclerView = this.f9309g;
        if (recyclerView == null) {
            return null;
        }
        View focusedChild = recyclerView.getFocusedChild();
        if (focusedChild == null || this.f9308f.m5767c(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    /* renamed from: q */
    public final int m5977q() {
        RecyclerView recyclerView = this.f9309g;
        return recyclerView != null ? recyclerView.getPaddingBottom() : 0;
    }

    /* renamed from: r */
    public final int m5978r() {
        RecyclerView recyclerView = this.f9309g;
        return recyclerView != null ? recyclerView.getPaddingLeft() : 0;
    }

    /* renamed from: s */
    public final int m5979s() {
        RecyclerView recyclerView = this.f9309g;
        return recyclerView != null ? recyclerView.getPaddingRight() : 0;
    }

    /* renamed from: t */
    public final int m5980t() {
        RecyclerView recyclerView = this.f9309g;
        return recyclerView != null ? recyclerView.getPaddingTop() : 0;
    }

    /* renamed from: c */
    public static int m5921c(View view) {
        return ((uk) view.getLayoutParams()).f9324c.m6025f();
    }

    /* renamed from: b */
    public int mo3347b(up upVar, uv uvVar) {
        RecyclerView recyclerView = this.f9309g;
        if (recyclerView == null || recyclerView.f682j == null || !mo822i()) {
            return 1;
        }
        return this.f9309g.f682j.mo728a();
    }

    /* renamed from: a */
    public final void m5936a(View view, Rect rect) {
        Rect rect2 = ((uk) view.getLayoutParams()).f9325d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
        if (this.f9309g != null) {
            Matrix matrix = view.getMatrix();
            if (!(matrix == null || matrix.isIdentity())) {
                RectF rectF = this.f9309g.f681i;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: k */
    public boolean mo2469k() {
        return false;
    }

    /* renamed from: b */
    static boolean m5920b(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case kvl.UNSET_ENUM_VALUE /*-2147483648*/:
                if (size >= i) {
                    return true;
                }
                return false;
            case 0:
                return true;
            case 1073741824:
                if (size == i) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m5918a(View view, int i, int i2, int i3, int i4) {
        uk ukVar = (uk) view.getLayoutParams();
        Rect rect = ukVar.f9325d;
        view.layout((rect.left + i) + ukVar.leftMargin, (rect.top + i2) + ukVar.topMargin, (i3 - rect.right) - ukVar.rightMargin, (i4 - rect.bottom) - ukVar.bottomMargin);
    }

    /* renamed from: u */
    public void mo824u() {
    }

    /* renamed from: v */
    public void mo825v() {
    }

    /* renamed from: w */
    public void mo826w() {
    }

    /* renamed from: a */
    public View mo2462a(View view, int i, up upVar, uv uvVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2465a(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        RecyclerView recyclerView = this.f9309g;
        up upVar = recyclerView.f676d;
        uv uvVar = recyclerView.f656A;
        if (recyclerView != null && accessibilityEvent != null) {
            if (!(recyclerView.canScrollVertically(1) || this.f9309g.canScrollVertically(-1) || this.f9309g.canScrollHorizontally(-1) || this.f9309g.canScrollHorizontally(1))) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            tx txVar = this.f9309g.f682j;
            if (txVar != null) {
                accessibilityEvent.setItemCount(txVar.mo728a());
            }
        }
    }

    /* renamed from: a */
    public void mo3343a(up upVar, uv uvVar, View view, kk kkVar) {
        int c;
        int c2;
        if (mo822i()) {
            c = ug.m5921c(view);
        } else {
            c = 0;
        }
        if (mo821h()) {
            c2 = ug.m5921c(view);
        } else {
            c2 = 0;
        }
        kkVar.m4987a(kn.m5012a(c, 1, c2, 1, false));
    }

    /* renamed from: a */
    final void m5937a(View view, kk kkVar) {
        ux c = RecyclerView.m428c(view);
        if (c != null && !c.m6029j() && !this.f9308f.m5767c(c.f9369a)) {
            RecyclerView recyclerView = this.f9309g;
            mo3343a(recyclerView.f676d, recyclerView.f656A, view, kkVar);
        }
    }

    /* renamed from: b */
    public void mo811b() {
    }

    /* renamed from: c */
    public void mo3348c() {
    }

    /* renamed from: d */
    public void mo815d() {
    }

    /* renamed from: e */
    public void mo817e() {
    }

    /* renamed from: x */
    public void mo827x() {
    }

    /* renamed from: f */
    public void mo819f() {
        mo827x();
    }

    /* renamed from: c */
    public void mo813c(up upVar, uv uvVar) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    /* renamed from: a */
    public void mo807a(uv uvVar) {
    }

    /* renamed from: a */
    public final void m5928a(int i, int i2) {
        this.f9309g.m460b(i, i2);
    }

    /* renamed from: a */
    public void mo806a(Parcelable parcelable) {
    }

    /* renamed from: m */
    public Parcelable mo823m() {
        return null;
    }

    /* renamed from: a */
    public final void m5940a(up upVar) {
        for (int o = m5975o() - 1; o >= 0; o--) {
            if (!RecyclerView.m428c(m5963e(o)).m6035p()) {
                m5931a(o, upVar);
            }
        }
    }

    /* renamed from: b */
    public final void m5952b(up upVar) {
        int size = upVar.f9334a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((ux) upVar.f9334a.get(i)).f9369a;
            ux c = RecyclerView.m428c(view);
            if (!c.m6035p()) {
                c.m6019a(false);
                if (c.m6031l()) {
                    this.f9309g.removeDetachedView(view, false);
                }
                ub ubVar = this.f9309g.f696x;
                if (ubVar != null) {
                    ubVar.mo3336c(c);
                }
                c.m6019a(true);
                upVar.m5999a(view);
            }
        }
        upVar.f9334a.clear();
        ArrayList arrayList = upVar.f9335b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f9309g.invalidate();
        }
    }

    /* renamed from: a */
    public final void m5931a(int i, up upVar) {
        View e = m5963e(i);
        m5967f(i);
        upVar.m6004b(e);
    }

    /* renamed from: f */
    public final void m5967f(int i) {
        if (m5963e(i) != null) {
            rp rpVar = this.f9308f;
            int c = rpVar.m5766c(i);
            View a = rpVar.f9139a.m5778a(c);
            if (a != null) {
                if (rpVar.f9140b.m5775d(c)) {
                    rpVar.m5769d(a);
                }
                rpVar.f9139a.m5779b(c);
            }
        }
    }

    /* renamed from: a */
    public final boolean m5943a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int[] iArr = new int[2];
        int r = m5978r();
        int t = m5980t();
        int i = this.f9318p;
        int s = m5979s();
        int i2 = this.f9319q;
        int q = m5977q();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width();
        int height = rect.height();
        int i3 = left - r;
        int min = Math.min(0, i3);
        int i4 = top - t;
        r = Math.min(0, i4);
        i = (left + width) - (i - s);
        t = Math.max(0, i);
        s = Math.max(0, (top + height) - (i2 - q));
        if (jm.m4576j(this.f9309g) != 1) {
            t = min == 0 ? Math.min(i3, t) : min;
        } else if (t == 0) {
            t = Math.max(min, i);
        }
        if (r == 0) {
            r = Math.min(i4, s);
        }
        iArr[0] = t;
        iArr[1] = r;
        t = iArr[0];
        min = iArr[1];
        if (z2) {
            Object obj;
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int r2 = m5978r();
                i = m5980t();
                s = this.f9318p;
                i2 = m5979s();
                q = this.f9319q - m5977q();
                Rect rect2 = this.f9309g.f680h;
                RecyclerView.m421a(focusedChild, rect2);
                obj = rect2.left - t < s - i2 ? rect2.right - t > r2 ? rect2.top - min < q ? rect2.bottom - min > i ? 1 : null : null : null : null;
            } else {
                obj = null;
            }
            if (obj != null) {
            }
            return false;
        }
        if (!(t == 0 && min == 0)) {
            if (z) {
                recyclerView.scrollBy(t, min);
            } else {
                recyclerView.m465c(t, min);
            }
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final void m5985y() {
        RecyclerView recyclerView = this.f9309g;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: a */
    public int mo803a(int i, up upVar, uv uvVar) {
        return 0;
    }

    /* renamed from: b */
    public int mo809b(int i, up upVar, uv uvVar) {
        return 0;
    }

    /* renamed from: a */
    public final void m5934a(RecyclerView recyclerView) {
        m5950b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: b */
    public final void m5950b(int i, int i2) {
        this.f9318p = MeasureSpec.getSize(i);
        this.f9316n = MeasureSpec.getMode(i);
        if (this.f9316n == 0 && !RecyclerView.f654a) {
            this.f9318p = 0;
        }
        this.f9319q = MeasureSpec.getSize(i2);
        this.f9317o = MeasureSpec.getMode(i2);
        if (this.f9317o == 0 && !RecyclerView.f654a) {
            this.f9319q = 0;
        }
    }

    /* renamed from: c */
    public final void m5956c(int i, int i2) {
        this.f9309g.setMeasuredDimension(i, i2);
    }

    /* renamed from: a */
    public void mo3342a(Rect rect, int i, int i2) {
        int width = rect.width();
        int r = m5978r();
        int s = m5979s();
        int height = rect.height();
        int t = m5980t();
        m5956c(ug.m5915a(i, (width + r) + s, jm.m4578l(this.f9309g)), ug.m5915a(i2, (height + t) + m5977q(), jm.m4577k(this.f9309g)));
    }

    /* renamed from: d */
    public final void m5961d(int i, int i2) {
        int i3 = LfuScheduler.MAX_PRIORITY;
        int i4 = kvl.UNSET_ENUM_VALUE;
        int o = m5975o();
        if (o != 0) {
            int i5 = kvl.UNSET_ENUM_VALUE;
            int i6 = LfuScheduler.MAX_PRIORITY;
            for (int i7 = 0; i7 < o; i7++) {
                View e = m5963e(i7);
                Rect rect = this.f9309g.f680h;
                RecyclerView.m421a(e, rect);
                if (rect.left < i6) {
                    i6 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i3) {
                    i3 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.f9309g.f680h.set(i6, i3, i5, i4);
            mo3342a(this.f9309g.f680h, i, i2);
            return;
        }
        this.f9309g.m460b(i, i2);
    }

    /* renamed from: b */
    public final void m5951b(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f9309g = null;
            this.f9308f = null;
            this.f9318p = 0;
            this.f9319q = 0;
        } else {
            this.f9309g = recyclerView;
            this.f9308f = recyclerView.f678f;
            this.f9318p = recyclerView.getWidth();
            this.f9319q = recyclerView.getHeight();
        }
        this.f9316n = 1073741824;
        this.f9317o = 1073741824;
    }

    /* renamed from: a */
    final boolean m5944a(View view, int i, int i2, uk ukVar) {
        return (!view.isLayoutRequested() && this.f9312j && ug.m5920b(view.getWidth(), i, ukVar.width) && ug.m5920b(view.getHeight(), i2, ukVar.height)) ? false : true;
    }

    /* renamed from: n */
    public boolean mo2470n() {
        return false;
    }

    /* renamed from: g */
    public boolean mo2468g() {
        return false;
    }
}

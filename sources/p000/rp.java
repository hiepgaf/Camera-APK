package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: rp */
public final class rp {
    /* renamed from: a */
    public final rr f9139a;
    /* renamed from: b */
    public final rq f9140b = new rq();
    /* renamed from: c */
    public final List f9141c = new ArrayList();

    public rp(rr rrVar) {
        this.f9139a = rrVar;
    }

    /* renamed from: a */
    public final void m5762a(View view, int i, boolean z) {
        int childCount;
        if (i < 0) {
            childCount = this.f9139a.f9144a.getChildCount();
        } else {
            childCount = m5766c(i);
        }
        this.f9140b.m5772a(childCount, z);
        if (z) {
            m5760a(view);
        }
        rr rrVar = this.f9139a;
        rrVar.f9144a.addView(view, childCount);
        RecyclerView recyclerView = rrVar.f9144a;
        ux c = RecyclerView.m428c(view);
        tx txVar = recyclerView.f682j;
        if (txVar != null && c != null) {
            txVar.mo730a(c);
        }
    }

    /* renamed from: a */
    public final void m5761a(View view, int i, LayoutParams layoutParams, boolean z) {
        int childCount;
        if (i < 0) {
            childCount = this.f9139a.f9144a.getChildCount();
        } else {
            childCount = m5766c(i);
        }
        this.f9140b.m5772a(childCount, z);
        if (z) {
            m5760a(view);
        }
        rr rrVar = this.f9139a;
        ux c = RecyclerView.m428c(view);
        if (c != null) {
            if (c.m6031l() || c.m6035p()) {
                c.m6023d();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Called attach on a child which is not detached: ");
                stringBuilder.append(c);
                stringBuilder.append(rrVar.f9144a.m471g());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        rrVar.f9144a.attachViewToParent(view, childCount, layoutParams);
    }

    /* renamed from: a */
    final void m5759a(int i) {
        int c = m5766c(i);
        this.f9140b.m5775d(c);
        rr rrVar = this.f9139a;
        View a = rrVar.m5778a(c);
        if (a != null) {
            ux c2 = RecyclerView.m428c(a);
            if (c2 != null) {
                if (!c2.m6031l() || c2.m6035p()) {
                    c2.m6014a(256);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("called detach on an already detached child ");
                    stringBuilder.append(c2);
                    stringBuilder.append(rrVar.f9144a.m471g());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        rrVar.f9144a.detachViewFromParent(c);
    }

    /* renamed from: b */
    public final View m5765b(int i) {
        return this.f9139a.m5778a(m5766c(i));
    }

    /* renamed from: a */
    public final int m5758a() {
        return this.f9139a.f9144a.getChildCount() - this.f9141c.size();
    }

    /* renamed from: c */
    final int m5766c(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f9139a.f9144a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b = i - (i2 - this.f9140b.m5773b(i2));
            if (b == 0) {
                while (this.f9140b.m5774c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: d */
    public final View m5768d(int i) {
        return this.f9139a.m5778a(i);
    }

    /* renamed from: b */
    public final int m5763b() {
        return this.f9139a.f9144a.getChildCount();
    }

    /* renamed from: a */
    public final void m5760a(View view) {
        this.f9141c.add(view);
        rr rrVar = this.f9139a;
        ux c = RecyclerView.m428c(view);
        if (c != null) {
            RecyclerView recyclerView = rrVar.f9144a;
            int i = c.f9382n;
            if (i != -1) {
                c.f9381m = i;
            } else {
                c.f9381m = jm.m4574h(c.f9369a);
            }
            recyclerView.m457a(c, 4);
        }
    }

    /* renamed from: b */
    final int m5764b(View view) {
        int a = this.f9139a.m5777a(view);
        if (a == -1 || this.f9140b.m5774c(a)) {
            return -1;
        }
        return a - this.f9140b.m5773b(a);
    }

    /* renamed from: c */
    public final boolean m5767c(View view) {
        return this.f9141c.contains(view);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f9140b.toString());
        stringBuilder.append(", hidden list:");
        stringBuilder.append(this.f9141c.size());
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public final boolean m5769d(View view) {
        if (!this.f9141c.remove(view)) {
            return false;
        }
        this.f9139a.m5780b(view);
        return true;
    }
}

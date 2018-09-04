package p000;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: tt */
public class tt {
    /* renamed from: a */
    public final ug f9290a;
    /* renamed from: b */
    public int f9291b;
    /* renamed from: c */
    public final Rect f9292c;

    private tt(ug ugVar) {
        this.f9291b = kvl.UNSET_ENUM_VALUE;
        this.f9292c = new Rect();
        this.f9290a = ugVar;
    }

    /* renamed from: a */
    public int m5852a(View view) {
        uk ukVar = (uk) view.getLayoutParams();
        return ukVar.bottomMargin + ug.m5917a(view);
    }

    /* renamed from: b */
    public int m5855b(View view) {
        uk ukVar = (uk) view.getLayoutParams();
        Rect rect = ((uk) view.getLayoutParams()).f9325d;
        return ukVar.bottomMargin + ((rect.bottom + (view.getMeasuredHeight() + rect.top)) + ukVar.topMargin);
    }

    /* renamed from: c */
    public int m5857c(View view) {
        uk ukVar = (uk) view.getLayoutParams();
        Rect rect = ((uk) view.getLayoutParams()).f9325d;
        return ukVar.rightMargin + ((rect.right + (view.getMeasuredWidth() + rect.left)) + ukVar.leftMargin);
    }

    /* renamed from: d */
    public int m5859d(View view) {
        return ug.m5919b(view) - ((uk) view.getLayoutParams()).topMargin;
    }

    /* renamed from: a */
    public int m5851a() {
        return this.f9290a.f9319q;
    }

    /* renamed from: b */
    public int m5854b() {
        return this.f9290a.f9319q - this.f9290a.m5977q();
    }

    /* renamed from: c */
    public int m5856c() {
        return this.f9290a.m5977q();
    }

    /* renamed from: d */
    public int m5858d() {
        return this.f9290a.f9317o;
    }

    /* renamed from: e */
    public int m5860e() {
        return this.f9290a.f9316n;
    }

    /* renamed from: f */
    public int m5862f() {
        return this.f9290a.m5980t();
    }

    /* renamed from: g */
    public int m5864g() {
        return (this.f9290a.f9319q - this.f9290a.m5980t()) - this.f9290a.m5977q();
    }

    /* renamed from: h */
    public final int m5865h() {
        return this.f9291b != kvl.UNSET_ENUM_VALUE ? m5864g() - this.f9291b : 0;
    }

    /* renamed from: e */
    public int m5861e(View view) {
        this.f9290a.m5936a(view, this.f9292c);
        return this.f9292c.bottom;
    }

    /* renamed from: f */
    public int m5863f(View view) {
        this.f9290a.m5936a(view, this.f9292c);
        return this.f9292c.top;
    }

    /* renamed from: a */
    public void m5853a(int i) {
        RecyclerView recyclerView = this.f9290a.f9309g;
        if (recyclerView != null) {
            int a = recyclerView.f678f.m5758a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.f678f.m5765b(i2).offsetTopAndBottom(i);
            }
        }
    }

    tt(ug ugVar, char c) {
        this(ugVar);
    }
}

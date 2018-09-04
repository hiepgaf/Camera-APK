package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: uh */
final class uh implements vv {
    /* renamed from: a */
    private final /* synthetic */ ug f19642a;

    uh(ug ugVar) {
        this.f19642a = ugVar;
    }

    /* renamed from: a */
    public final View mo2486a(int i) {
        return this.f19642a.m5963e(i);
    }

    /* renamed from: a */
    public final int mo2485a(View view) {
        return ((uk) view.getLayoutParams()).rightMargin + (((uk) view.getLayoutParams()).f9325d.right + view.getRight());
    }

    /* renamed from: b */
    public final int mo2488b(View view) {
        return (view.getLeft() - ((uk) view.getLayoutParams()).f9325d.left) - ((uk) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: a */
    public final int mo2484a() {
        ug ugVar = this.f19642a;
        return ugVar.f9318p - ugVar.m5979s();
    }

    /* renamed from: b */
    public final int mo2487b() {
        return this.f19642a.m5978r();
    }
}

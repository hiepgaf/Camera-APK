package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: ui */
final class ui implements vv {
    /* renamed from: a */
    private final /* synthetic */ ug f19643a;

    ui(ug ugVar) {
        this.f19643a = ugVar;
    }

    /* renamed from: a */
    public final View mo2486a(int i) {
        return this.f19643a.m5963e(i);
    }

    /* renamed from: a */
    public final int mo2485a(View view) {
        uk ukVar = (uk) view.getLayoutParams();
        return ukVar.bottomMargin + ug.m5917a(view);
    }

    /* renamed from: b */
    public final int mo2488b(View view) {
        return ug.m5919b(view) - ((uk) view.getLayoutParams()).topMargin;
    }

    /* renamed from: a */
    public final int mo2484a() {
        ug ugVar = this.f19643a;
        return ugVar.f9319q - ugVar.m5977q();
    }

    /* renamed from: b */
    public final int mo2487b() {
        return this.f19643a.m5980t();
    }
}

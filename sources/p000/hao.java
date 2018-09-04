package p000;

import android.graphics.Matrix;
import android.view.View.OnLayoutChangeListener;

/* compiled from: PG */
/* renamed from: hao */
public final class hao implements han {
    /* renamed from: a */
    private static final String f17605a = bli.m862a("PrevConAdaptLogger");
    /* renamed from: b */
    private final han f17606b;
    /* renamed from: c */
    private final String f17607c;

    public hao(String str, han han) {
        this.f17606b = han;
        this.f17607c = str;
    }

    /* renamed from: a */
    public final void mo1213a(ham ham) {
        String str = f17605a;
        String str2 = this.f17607c;
        String valueOf = String.valueOf(ham);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 47) + String.valueOf(valueOf).length());
        stringBuilder.append(str2);
        stringBuilder.append("addPreviewAreaSizeChangedListener(listener = ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" )");
        bli.m871d(str, stringBuilder.toString());
        this.f17606b.mo1213a(ham);
    }

    /* renamed from: a */
    public final void mo1209a() {
        bli.m871d(f17605a, String.valueOf(this.f17607c).concat("clearTransform()"));
        this.f17606b.mo1209a();
    }

    /* renamed from: b */
    public final int mo1214b() {
        int b = this.f17606b.mo1214b();
        String str = f17605a;
        String str2 = this.f17607c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 41);
        stringBuilder.append(str2);
        stringBuilder.append("getViewHeight() returns int = ");
        stringBuilder.append(b);
        bli.m871d(str, stringBuilder.toString());
        return b;
    }

    /* renamed from: c */
    public final int mo1216c() {
        int c = this.f17606b.mo1216c();
        String str = f17605a;
        String str2 = this.f17607c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 40);
        stringBuilder.append(str2);
        stringBuilder.append("getViewWidth() returns int = ");
        stringBuilder.append(c);
        bli.m871d(str, stringBuilder.toString());
        return c;
    }

    /* renamed from: d */
    public final kpk mo1217d() {
        bli.m871d(f17605a, String.valueOf(this.f17607c).concat("onModuleActivate()"));
        return this.f17606b.mo1217d();
    }

    /* renamed from: e */
    public final kpk mo1218e() {
        bli.m871d(f17605a, String.valueOf(this.f17607c).concat("onModuleDeactivate()"));
        return this.f17606b.mo1218e();
    }

    /* renamed from: b */
    public final void mo1215b(ham ham) {
        String str = f17605a;
        String str2 = this.f17607c;
        String valueOf = String.valueOf(ham);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 50) + String.valueOf(valueOf).length());
        stringBuilder.append(str2);
        stringBuilder.append("removePreviewAreaSizeChangedListener(listener = ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" )");
        bli.m871d(str, stringBuilder.toString());
        this.f17606b.mo1215b(ham);
    }

    /* renamed from: f */
    public final void mo1219f() {
        bli.m871d(f17605a, String.valueOf(this.f17607c).concat("requestLayout()"));
        this.f17606b.mo1219f();
    }

    /* renamed from: a */
    public final void mo1212a(OnLayoutChangeListener onLayoutChangeListener) {
        String str = f17605a;
        String str2 = this.f17607c;
        String valueOf = String.valueOf(onLayoutChangeListener);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 39) + String.valueOf(valueOf).length());
        stringBuilder.append(str2);
        stringBuilder.append("setOnLayoutChangeListener(listener = ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" )");
        bli.m871d(str, stringBuilder.toString());
        this.f17606b.mo1212a(onLayoutChangeListener);
    }

    /* renamed from: a */
    public final void mo1210a(float f) {
        String str = f17605a;
        String str2 = this.f17607c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 49);
        stringBuilder.append(str2);
        stringBuilder.append("updateAspectRatio(aspectRatio = ");
        stringBuilder.append(f);
        stringBuilder.append(" )");
        bli.m871d(str, stringBuilder.toString());
        this.f17606b.mo1210a(f);
    }

    /* renamed from: a */
    public final void mo1211a(Matrix matrix) {
        String str = f17605a;
        String str2 = this.f17607c;
        String valueOf = String.valueOf(matrix);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 25) + String.valueOf(valueOf).length());
        stringBuilder.append(str2);
        stringBuilder.append("updateTransform(matrix =");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        bli.m871d(str, stringBuilder.toString());
        this.f17606b.mo1211a(matrix);
    }
}

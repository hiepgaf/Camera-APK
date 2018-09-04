package p000;

import android.util.DisplayMetrics;
import android.view.WindowManager;

/* compiled from: PG */
/* renamed from: cbs */
public final class cbs implements kwk {
    /* renamed from: a */
    private final kwk f11621a;

    public cbs(kwk kwk) {
        this.f11621a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        WindowManager windowManager = (WindowManager) this.f11621a.mo345a();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (DisplayMetrics) ktm.m13963a(displayMetrics, "Cannot return null from a non-@Nullable @Provides method");
    }
}

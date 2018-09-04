package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dyd */
public final class dyd implements kwk {
    /* renamed from: a */
    private final kwk f14726a;
    /* renamed from: b */
    private final kwk f14727b;

    public dyd(kwk kwk, kwk kwk2) {
        this.f14726a = kwk;
        this.f14727b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(((gor) this.f14726a.mo345a()).m2665a("default_scope", "pref_double_tap_key", ((Resources) this.f14727b.mo345a()).getString(R.string.preference_double_tap_zoom)), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* renamed from: cca */
public final class cca implements kwk {
    /* renamed from: a */
    private final kwk f11628a;

    private cca(kwk kwk) {
        this.f11628a = kwk;
    }

    /* renamed from: a */
    public static cca m7975a(kwk kwk) {
        return new cca(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (SharedPreferences) ktm.m13963a(PreferenceManager.getDefaultSharedPreferences((Context) this.f11628a.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

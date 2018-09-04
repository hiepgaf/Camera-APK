package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: dyy */
public final class dyy implements kwk {
    /* renamed from: a */
    private final kwk f14754a;
    /* renamed from: b */
    private final kwk f14755b;
    /* renamed from: c */
    private final kwk f14756c;

    private dyy(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f14754a = kwk;
        this.f14755b = kwk2;
        this.f14756c = kwk3;
    }

    /* renamed from: a */
    public static dyy m9559a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new dyy(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (gos) ktm.m13963a(new got((Context) this.f14754a.mo345a(), (SharedPreferences) this.f14755b.mo345a(), (irs) this.f14756c.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

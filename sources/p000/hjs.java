package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* renamed from: hjs */
public final class hjs implements kwk {
    /* renamed from: a */
    private final kwk f17913a;

    private hjs(kwk kwk) {
        this.f17913a = kwk;
    }

    /* renamed from: a */
    public static hjs m11866a(kwk kwk) {
        return new hjs(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (PackageManager) ktm.m13963a(((Context) this.f17913a.mo345a()).getPackageManager(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

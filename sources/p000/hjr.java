package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* renamed from: hjr */
public final class hjr implements kwk {
    /* renamed from: a */
    private final kwk f17911a;
    /* renamed from: b */
    private final kwk f17912b;

    private hjr(kwk kwk, kwk kwk2) {
        this.f17911a = kwk;
        this.f17912b = kwk2;
    }

    /* renamed from: a */
    public static hjr m11864a(kwk kwk, kwk kwk2) {
        return new hjr(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (PackageInfo) ktm.m13963a(hhz.m3154a((PackageManager) this.f17911a.mo345a(), (Context) this.f17912b.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

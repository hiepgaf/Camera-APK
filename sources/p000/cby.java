package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: cby */
public final class cby implements kwk {
    /* renamed from: a */
    private final cbw f11625a;

    private cby(cbw cbw) {
        this.f11625a = cbw;
    }

    /* renamed from: a */
    public static cby m7970a(cbw cbw) {
        return new cby(cbw);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return cby.m7971b(this.f11625a);
    }

    /* renamed from: b */
    public static Context m7971b(cbw cbw) {
        return (Context) ktm.m13963a(cbw.f1839b, "Cannot return null from a non-@Nullable @Provides method");
    }
}

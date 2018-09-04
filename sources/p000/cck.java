package p000;

import android.app.NotificationManager;

/* compiled from: PG */
/* renamed from: cck */
public final class cck implements kwk {
    /* renamed from: a */
    private final kwk f11640a;

    public cck(kwk kwk) {
        this.f11640a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return cck.m7993a(this.f11640a.mo345a());
    }

    /* renamed from: a */
    public static NotificationManager m7993a(Object obj) {
        return (NotificationManager) ktm.m13963a((NotificationManager) ((ccb) obj).m1103a("notification"), "Cannot return null from a non-@Nullable @Provides method");
    }
}

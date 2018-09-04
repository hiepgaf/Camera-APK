package p000;

import android.os.storage.StorageManager;

/* compiled from: PG */
/* renamed from: ccn */
public final class ccn implements kwk {
    /* renamed from: a */
    private final kwk f11652a;

    private ccn(kwk kwk) {
        this.f11652a = kwk;
    }

    /* renamed from: a */
    public static ccn m8002a(kwk kwk) {
        return new ccn(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (StorageManager) ktm.m13963a((StorageManager) ((ccb) this.f11652a.mo345a()).m1103a("storage"), "Cannot return null from a non-@Nullable @Provides method");
    }
}

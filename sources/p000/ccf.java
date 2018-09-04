package p000;

import android.media.AudioManager;

/* compiled from: PG */
/* renamed from: ccf */
public final class ccf implements kwk {
    /* renamed from: a */
    private final kwk f11632a;

    private ccf(kwk kwk) {
        this.f11632a = kwk;
    }

    /* renamed from: a */
    public static ccf m7982a(kwk kwk) {
        return new ccf(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (AudioManager) ktm.m13963a((AudioManager) ((ccb) this.f11632a.mo345a()).m1103a("audio"), "Cannot return null from a non-@Nullable @Provides method");
    }
}

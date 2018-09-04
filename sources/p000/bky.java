package p000;

import android.content.ContentResolver;
import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: bky */
public final class bky implements kwk {
    /* renamed from: a */
    private final kwk f10997a;
    /* renamed from: b */
    private final kwk f10998b;
    /* renamed from: c */
    private final kwk f10999c;

    private bky(bkx bkx, kwk kwk, kwk kwk2, kwk kwk3) {
        this.f10997a = kwk;
        this.f10998b = kwk2;
        this.f10999c = kwk3;
    }

    /* renamed from: a */
    public static bky m7506a(bkx bkx, kwk kwk, kwk kwk2, kwk kwk3) {
        return new bky(bkx, kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (bkw) ktm.m13963a(new bkw((ContentResolver) this.f10997a.mo345a(), (hjf) this.f10998b.mo345a(), (SharedPreferences) this.f10999c.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

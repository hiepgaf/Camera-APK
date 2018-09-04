package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: foe */
public final class foe implements kwk {
    /* renamed from: a */
    private final kwk f16256a;

    private foe(kwk kwk) {
        this.f16256a = kwk;
    }

    /* renamed from: a */
    public static foe m10571a(kwk kwk) {
        return new foe(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (Surface) ktm.m13963a((Surface) this.f16256a.mo345a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

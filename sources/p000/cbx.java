package p000;

import android.content.ContentResolver;

/* compiled from: PG */
/* renamed from: cbx */
public final class cbx implements kwk {
    /* renamed from: a */
    private final cbw f11624a;

    private cbx(cbw cbw) {
        this.f11624a = cbw;
    }

    /* renamed from: a */
    public static cbx m7967a(cbw cbw) {
        return new cbx(cbw);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return cbx.m7968b(this.f11624a);
    }

    /* renamed from: b */
    public static ContentResolver m7968b(cbw cbw) {
        return (ContentResolver) ktm.m13963a(cbw.f1838a.getContentResolver(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

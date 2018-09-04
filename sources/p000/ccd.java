package p000;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* renamed from: ccd */
public final class ccd implements kwk {
    /* renamed from: a */
    private final kwk f11630a;

    public ccd(kwk kwk) {
        this.f11630a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return ccd.m7979a(this.f11630a.mo345a());
    }

    /* renamed from: a */
    public static AccessibilityManager m7979a(Object obj) {
        return (AccessibilityManager) ktm.m13963a((AccessibilityManager) ((ccb) obj).m1103a("accessibility"), "Cannot return null from a non-@Nullable @Provides method");
    }
}

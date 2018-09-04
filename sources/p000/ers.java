package p000;

import java.util.EnumSet;

/* compiled from: PG */
/* renamed from: ers */
public final class ers {
    /* renamed from: a */
    public final EnumSet f4133a;

    static {
        new exb().m10036d();
    }

    public ers(EnumSet enumSet) {
        this.f4133a = enumSet;
    }

    /* renamed from: a */
    public final boolean m2072a() {
        return this.f4133a.contains(ert.CAN_DELETE);
    }

    /* renamed from: b */
    public final boolean m2073b() {
        return this.f4133a.contains(ert.CAN_SHARE);
    }

    /* renamed from: c */
    public final boolean m2074c() {
        return this.f4133a.contains(ert.CAN_SWIPE_AWAY);
    }

    /* renamed from: d */
    public final boolean m2075d() {
        return this.f4133a.contains(ert.CAN_ZOOM_IN_PLACE);
    }

    /* renamed from: e */
    public final boolean m2076e() {
        return this.f4133a.contains(ert.IS_RENDERING);
    }
}

package p000;

import java.util.UUID;

/* compiled from: PG */
/* renamed from: fqu */
public final class fqu implements fuw {
    /* renamed from: a */
    public static final String f16401a = bli.m862a("RawModeImageSaver");
    /* renamed from: b */
    public final hju f16402b;
    /* renamed from: c */
    public final ixv f16403c;

    public fqu(hju hju, ixv ixv) {
        this.f16402b = hju;
        this.f16403c = ixv;
    }

    /* renamed from: a */
    public final fux mo404a(fwa fwa) {
        bli.m863a(f16401a, "Created new RAW session in acquireSession()");
        return new fqv(this, fwa.f4753b, UUID.randomUUID());
    }

    /* renamed from: a */
    public final ilp mo405a() {
        return ilq.m3818a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final fuy mo407b() {
        return fuy.m2400a();
    }

    /* renamed from: c */
    public final fqv m10673c(fwa fwa) {
        bli.m863a(f16401a, "Created new RAW session in tryAcquireSession()");
        return new fqv(this, fwa.f4753b, UUID.randomUUID());
    }

    /* renamed from: b */
    public final /* synthetic */ fux mo406b(fwa fwa) {
        return m10673c(fwa);
    }
}

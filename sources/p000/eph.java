package p000;

/* compiled from: PG */
/* renamed from: eph */
public final class eph {
    /* renamed from: c */
    public static final eph f4009c = new eph(epi.INIT, ken.m13464e());
    /* renamed from: d */
    public static final eph f4010d = new eph(epi.CREATED, ken.m13454a(epi.INIT, epi.STOPPED));
    /* renamed from: e */
    public static final eph f4011e = new eph(epi.STARTED, ken.m13455a(epi.INIT, epi.STOPPED, epi.CREATED));
    /* renamed from: f */
    public static final eph f4012f = new eph(epi.SHUTTER_BUTTON_DRAWN, ken.m13453a(epi.STARTED));
    /* renamed from: g */
    public static final eph f4013g = new eph(epi.SHUTTER_BUTTON_ENABLED, ken.m13453a(epi.SHUTTER_BUTTON_DRAWN));
    /* renamed from: h */
    public static final eph f4014h = new eph(epi.STOPPED, ken.m13453a(epi.ANY));
    /* renamed from: a */
    public final epi f4015a;
    /* renamed from: b */
    public final ken f4016b;

    static {
        eph eph = new eph(epi.INVALID, ken.m13464e());
    }

    private eph(epi epi, ken ken) {
        this.f4015a = epi;
        this.f4016b = ken;
    }

    public final String toString() {
        return this.f4015a.name();
    }
}

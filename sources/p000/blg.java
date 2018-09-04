package p000;

/* compiled from: PG */
/* renamed from: blg */
public final class blg implements kwk {
    /* renamed from: a */
    private final kwk f11000a;

    private blg(ble ble, kwk kwk) {
        this.f11000a = kwk;
    }

    /* renamed from: a */
    public static blg m7510a(ble ble, kwk kwk) {
        return new blg(ble, kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return blg.m7511a((iqz) this.f11000a.mo345a());
    }

    /* renamed from: a */
    public static ira m7511a(iqz iqz) {
        if (iqz instanceof ira) {
            iqz = (ira) iqz;
        } else {
            Object blk = new blk(iqz);
        }
        return (ira) ktm.m13963a(iqz, "Cannot return null from a non-@Nullable @Provides method");
    }
}

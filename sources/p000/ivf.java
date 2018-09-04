package p000;

/* compiled from: PG */
/* renamed from: ivf */
public final class ivf extends iwx {
    /* renamed from: a */
    public final Object f23375a = new Object();
    /* renamed from: b */
    public int f23376b = 0;

    public ivf(ixb ixb) {
        super(ixb);
    }

    /* renamed from: a */
    public final iwz mo3147a() {
        synchronized (this.f23375a) {
            if (this.f23376b == mo3153f()) {
                return null;
            }
            iwz a = m17601a(super.mo3147a());
            return a;
        }
    }

    /* renamed from: b */
    public final iwz mo3149b() {
        synchronized (this.f23375a) {
            if (this.f23376b == mo3153f()) {
                return null;
            }
            iwz a = m17601a(super.mo3149b());
            return a;
        }
    }

    /* renamed from: a */
    private final iwz m17601a(iwz iwz) {
        if (iwz == null) {
            return null;
        }
        this.f23376b++;
        return new ivg(this, iwz);
    }
}

package p000;

/* compiled from: PG */
/* renamed from: gdz */
public final class gdz {
    /* renamed from: a */
    private kbg f5107a;
    /* renamed from: b */
    private kbg f5108b;

    gdz(byte b) {
        this();
        this.f5107a = kau.f19138a;
        this.f5108b = kau.f19138a;
    }

    /* renamed from: a */
    public final gdy m2501a() {
        return new gdi(this.f5107a, this.f5108b);
    }

    /* renamed from: a */
    public final gdz m2502a(kbg kbg) {
        if (kbg == null) {
            throw new NullPointerException("Null extended");
        }
        this.f5108b = kbg;
        return this;
    }

    /* renamed from: b */
    public final gdz m2503b(kbg kbg) {
        if (kbg == null) {
            throw new NullPointerException("Null main");
        }
        this.f5107a = kbg;
        return this;
    }
}

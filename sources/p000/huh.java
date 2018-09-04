package p000;

/* renamed from: huh */
public final class huh {
    /* renamed from: a */
    public final String f6675a;
    /* renamed from: b */
    private final huk f6676b;
    /* renamed from: c */
    private final hum f6677c;

    public huh(String str, huk huk, hum hum) {
        htl.m3432b((Object) huk, (Object) "Cannot construct an Api with a null ClientBuilder");
        htl.m3432b((Object) hum, (Object) "Cannot construct an Api with a null ClientKey");
        this.f6675a = str;
        this.f6676b = huk;
        this.f6677c = hum;
    }

    /* renamed from: a */
    public final huk m3470a() {
        htl.m3422a(this.f6676b != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f6676b;
    }

    /* renamed from: b */
    public final hum m3471b() {
        hum hum = this.f6677c;
        if (hum != null) {
            return hum;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}

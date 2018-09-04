package p000;

/* compiled from: PG */
/* renamed from: inl */
final class inl extends inp {
    /* renamed from: a */
    private final ind f18382a;
    /* renamed from: b */
    private final ine f18383b;
    /* renamed from: c */
    private final int f18384c;
    /* renamed from: d */
    private final inc f18385d;
    /* renamed from: e */
    private final int f18386e;
    /* renamed from: f */
    private final int f18387f;
    /* renamed from: g */
    private final int f18388g;

    inl(ind ind, ine ine, int i, inc inc, int i2, int i3, int i4) {
        if (ind == null) {
            throw new NullPointerException("Null videoFileFormat");
        }
        this.f18382a = ind;
        if (ine == null) {
            throw new NullPointerException("Null videoResolution");
        }
        this.f18383b = ine;
        this.f18384c = i;
        if (inc == null) {
            throw new NullPointerException("Null camcorderCaptureRate");
        }
        this.f18385d = inc;
        this.f18386e = i2;
        this.f18387f = i3;
        this.f18388g = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof inp)) {
            return false;
        }
        inp inp = (inp) obj;
        if (this.f18382a.equals(inp.mo1896f()) && this.f18383b.equals(inp.mo1897g()) && this.f18384c == inp.mo1892b() && this.f18385d.equals(inp.mo1891a()) && this.f18386e == inp.mo1893c() && this.f18387f == inp.mo1895e() && this.f18388g == inp.mo1894d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final inc mo1891a() {
        return this.f18385d;
    }

    /* renamed from: b */
    public final int mo1892b() {
        return this.f18384c;
    }

    /* renamed from: c */
    public final int mo1893c() {
        return this.f18386e;
    }

    /* renamed from: d */
    public final int mo1894d() {
        return this.f18388g;
    }

    /* renamed from: e */
    public final int mo1895e() {
        return this.f18387f;
    }

    /* renamed from: f */
    public final ind mo1896f() {
        return this.f18382a;
    }

    /* renamed from: g */
    public final ine mo1897g() {
        return this.f18383b;
    }

    public final int hashCode() {
        return ((((((((((((this.f18382a.hashCode() ^ 1000003) * 1000003) ^ this.f18383b.hashCode()) * 1000003) ^ this.f18384c) * 1000003) ^ this.f18385d.hashCode()) * 1000003) ^ this.f18386e) * 1000003) ^ this.f18387f) * 1000003) ^ this.f18388g;
    }
}

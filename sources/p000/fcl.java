package p000;

/* compiled from: PG */
/* renamed from: fcl */
public final class fcl {
    /* renamed from: a */
    public final gig f4470a;
    /* renamed from: b */
    public final gih f4471b;
    /* renamed from: c */
    public final float f4472c;
    /* renamed from: d */
    public final boolean f4473d;
    /* renamed from: e */
    public final kbg f4474e;

    public fcl(gig gig, gih gih, float f, boolean z, kbg kbg) {
        this.f4470a = gig;
        this.f4471b = gih;
        this.f4472c = f;
        this.f4473d = z;
        this.f4474e = kbg;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fcl)) {
            return false;
        }
        fcl fcl = (fcl) obj;
        boolean z2 = this.f4470a == fcl.f4470a ? this.f4471b == fcl.f4471b ? this.f4472c == fcl.f4472c ? this.f4473d == fcl.f4473d : false : false : false;
        if (!this.f4474e.mo2084b()) {
            z = z2;
        } else if (!fcl.f4474e.mo2084b()) {
            z = z2;
        } else if (z2 && ((fcj) this.f4474e.mo2081a()).equals(fcl.f4474e.mo2081a())) {
            return true;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((this.f4470a.f5233e + 527) * 31) + this.f4471b.f5243i) * 31) + Float.floatToIntBits(this.f4472c)) * 31) + this.f4473d;
    }

    /* renamed from: a */
    public static fcl m2252a() {
        return new fcl(gig.OFF, gih.INACTIVE, 0.0f, false, kau.f19138a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4470a);
        String valueOf2 = String.valueOf(this.f4471b);
        float f = this.f4472c;
        boolean z = this.f4473d;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 97) + String.valueOf(valueOf2).length());
        stringBuilder.append("{controlAfMode=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", controlAfState=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", lensFocusDistance=");
        stringBuilder.append(f);
        stringBuilder.append(", isSceneChangeDetected=");
        stringBuilder.append(z);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

package p000;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: aez */
final class aez implements adl {
    /* renamed from: b */
    private final adl f9668b;
    /* renamed from: c */
    private final adl f9669c;

    aez(adl adl, adl adl2) {
        this.f9668b = adl;
        this.f9669c = adl2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aez)) {
            return false;
        }
        aez aez = (aez) obj;
        if (this.f9668b.equals(aez.f9668b) && this.f9669c.equals(aez.f9669c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9668b.hashCode() * 31) + this.f9669c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9668b);
        String valueOf2 = String.valueOf(this.f9669c);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length());
        stringBuilder.append("DataCacheKey{sourceKey=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", signature=");
        stringBuilder.append(valueOf2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo21a(MessageDigest messageDigest) {
        this.f9668b.mo21a(messageDigest);
        this.f9669c.mo21a(messageDigest);
    }
}

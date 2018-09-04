package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: agp */
final class agp implements adl {
    /* renamed from: b */
    private static final arn f9765b = new arn(50);
    /* renamed from: c */
    private final agu f9766c;
    /* renamed from: d */
    private final adl f9767d;
    /* renamed from: e */
    private final adl f9768e;
    /* renamed from: f */
    private final int f9769f;
    /* renamed from: g */
    private final int f9770g;
    /* renamed from: h */
    private final Class f9771h;
    /* renamed from: i */
    private final adp f9772i;
    /* renamed from: j */
    private final ads f9773j;

    agp(agu agu, adl adl, adl adl2, int i, int i2, ads ads, Class cls, adp adp) {
        this.f9766c = agu;
        this.f9767d = adl;
        this.f9768e = adl2;
        this.f9769f = i;
        this.f9770g = i2;
        this.f9773j = ads;
        this.f9771h = cls;
        this.f9772i = adp;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agp)) {
            return false;
        }
        agp agp = (agp) obj;
        if (this.f9770g == agp.f9770g && this.f9769f == agp.f9769f && arq.m658b(this.f9773j, agp.f9773j) && this.f9771h.equals(agp.f9771h) && this.f9767d.equals(agp.f9767d) && this.f9768e.equals(agp.f9768e) && this.f9772i.equals(agp.f9772i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f9767d.hashCode() * 31) + this.f9768e.hashCode()) * 31) + this.f9769f) * 31) + this.f9770g;
        ads ads = this.f9773j;
        if (ads != null) {
            hashCode = (hashCode * 31) + ads.hashCode();
        }
        return (((hashCode * 31) + this.f9771h.hashCode()) * 31) + this.f9772i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9767d);
        String valueOf2 = String.valueOf(this.f9768e);
        int i = this.f9769f;
        int i2 = this.f9770g;
        String valueOf3 = String.valueOf(this.f9771h);
        String valueOf4 = String.valueOf(this.f9773j);
        String valueOf5 = String.valueOf(this.f9772i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 131) + length2) + length3) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length());
        stringBuilder.append("ResourceCacheKey{sourceKey=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", signature=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", width=");
        stringBuilder.append(i);
        stringBuilder.append(", height=");
        stringBuilder.append(i2);
        stringBuilder.append(", decodedResourceClass=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", transformation='");
        stringBuilder.append(valueOf4);
        stringBuilder.append('\'');
        stringBuilder.append(", options=");
        stringBuilder.append(valueOf5);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo21a(MessageDigest messageDigest) {
        Object obj = (byte[]) this.f9766c.m259a(byte[].class);
        ByteBuffer.wrap(obj).putInt(this.f9769f).putInt(this.f9770g).array();
        this.f9768e.mo21a(messageDigest);
        this.f9767d.mo21a(messageDigest);
        messageDigest.update(obj);
        ads ads = this.f9773j;
        if (ads != null) {
            ads.mo21a(messageDigest);
        }
        this.f9772i.mo21a(messageDigest);
        byte[] bArr = (byte[]) f9765b.m638b(this.f9771h);
        if (bArr == null) {
            bArr = this.f9771h.getName().getBytes(a);
            f9765b.m639b(this.f9771h, bArr);
        }
        messageDigest.update(bArr);
        this.f9766c.m262a(obj);
    }
}

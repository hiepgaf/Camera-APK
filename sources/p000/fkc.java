package p000;

/* compiled from: PG */
/* renamed from: fkc */
final class fkc implements koj {
    /* renamed from: a */
    private final /* synthetic */ fhq f16092a;
    /* renamed from: b */
    private final /* synthetic */ fjz f16093b;

    fkc(fjz fjz, fhq fhq) {
        this.f16093b = fjz;
        this.f16092a = fhq;
    }

    /* renamed from: a */
    public final kpk mo419a(Object obj) {
        fjz fjz = this.f16093b;
        fhq fhq = this.f16092a;
        iqz iqz = fjz.f16080b;
        String b = ion.m3961b(fjz.f16079a.mo3152e());
        String toHexString = Integer.toHexString(fjz.f16079a.hashCode());
        String valueOf = String.valueOf(fhq);
        int length = String.valueOf(b).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 35) + String.valueOf(toHexString).length()) + String.valueOf(valueOf).length());
        stringBuilder.append("Missing ImageId from ");
        stringBuilder.append(b);
        stringBuilder.append("ImageReader@");
        stringBuilder.append(toHexString);
        stringBuilder.append("! ");
        stringBuilder.append(valueOf);
        iqz.mo520f(stringBuilder.toString());
        return this.f16093b.m10445a(new iux(this.f16092a.f4562a), this.f16092a);
    }
}

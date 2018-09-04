package p000;

/* compiled from: PG */
/* renamed from: jwm */
final class jwm {
    /* renamed from: a */
    private final long f8036a;
    /* renamed from: b */
    private final long f8037b;
    /* renamed from: c */
    private final int f8038c;
    /* renamed from: d */
    private final /* synthetic */ jwl f8039d;

    public jwm(jwl jwl, jky jky, jky jky2) {
        this.f8039d = jwl;
        this.f8036a = jky.m4527b();
        this.f8037b = jky2.m4527b();
        long j = this.f8036a;
        long j2 = this.f8037b;
        this.f8038c = ((int) (j ^ (j >>> 32))) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jwm)) {
            return false;
        }
        jwm jwm = (jwm) obj;
        long j = this.f8036a;
        long j2 = this.f8037b;
        long j3 = jwm.f8036a;
        long j4 = jwm.f8037b;
        long j5;
        if (this.f8039d.f19084a) {
            if (j > j2) {
                j5 = j;
            } else {
                j5 = j2;
            }
            if (j <= j2) {
                j2 = j;
            }
            if (j3 > j4) {
                j = j3;
                j3 = j4;
            } else {
                j = j4;
            }
        } else {
            j5 = j2;
            j2 = j;
            j = j4;
        }
        if (j2 == j3 && r2 == r6) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8038c;
    }
}

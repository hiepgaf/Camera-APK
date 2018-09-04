package p000;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: adp */
public final class adp implements adl {
    /* renamed from: b */
    private final ih f9636b = new arj();

    public final boolean equals(Object obj) {
        if (!(obj instanceof adp)) {
            return false;
        }
        return this.f9636b.equals(((adp) obj).f9636b);
    }

    /* renamed from: a */
    public final Object m6303a(adm adm) {
        return this.f9636b.containsKey(adm) ? this.f9636b.get(adm) : adm.f336a;
    }

    public final int hashCode() {
        return this.f9636b.hashCode();
    }

    /* renamed from: a */
    public final void m6304a(adp adp) {
        this.f9636b.mo2634a(adp.f9636b);
    }

    /* renamed from: a */
    public final adp m6302a(adm adm, Object obj) {
        this.f9636b.put(adm, obj);
        return this;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9636b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("Options{values=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo21a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f9636b.size(); i++) {
            adm adm = (adm) this.f9636b.m4356b(i);
            Object d = this.f9636b.m4358d(i);
            ado ado = adm.f337b;
            if (adm.f339d == null) {
                adm.f339d = adm.f338c.getBytes(adl.f334a);
            }
            ado.mo20a(adm.f339d, d, messageDigest);
        }
    }
}

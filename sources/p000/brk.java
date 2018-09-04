package p000;

/* compiled from: PG */
/* renamed from: brk */
final class brk extends brl {
    /* renamed from: a */
    private final long f11227a;
    /* renamed from: b */
    private final ken f11228b;

    brk(long j, ken ken) {
        this.f11227a = j;
        if (ken == null) {
            throw new NullPointerException("Null faces");
        }
        this.f11228b = ken;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brl)) {
            return false;
        }
        brl brl = (brl) obj;
        if (this.f11227a == brl.mo571b() && this.f11228b.equals(brl.mo570a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final ken mo570a() {
        return this.f11228b;
    }

    /* renamed from: b */
    public final long mo571b() {
        return this.f11227a;
    }

    public final int hashCode() {
        long j = this.f11227a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f11228b.hashCode();
    }

    public final String toString() {
        long j = this.f11227a;
        String valueOf = String.valueOf(this.f11228b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
        stringBuilder.append("FaceMetadata{timestampNs=");
        stringBuilder.append(j);
        stringBuilder.append(", faces=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

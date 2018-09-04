package p000;

/* compiled from: PG */
/* renamed from: gdi */
final class gdi extends gdy {
    /* renamed from: a */
    private final kbg f16820a;
    /* renamed from: b */
    private final kbg f16821b;

    gdi(kbg kbg, kbg kbg2) {
        this.f16820a = kbg;
        this.f16821b = kbg2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gdy)) {
            return false;
        }
        gdy gdy = (gdy) obj;
        if (this.f16820a.equals(gdy.mo1465b()) && this.f16821b.equals(gdy.mo1464a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final kbg mo1464a() {
        return this.f16821b;
    }

    public final int hashCode() {
        return ((this.f16820a.hashCode() ^ 1000003) * 1000003) ^ this.f16821b.hashCode();
    }

    /* renamed from: b */
    public final kbg mo1465b() {
        return this.f16820a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16820a);
        String valueOf2 = String.valueOf(this.f16821b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length());
        stringBuilder.append("XmpMetadataPair{main=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", extended=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

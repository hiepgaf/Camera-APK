package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: dhr */
final class dhr extends djm {
    /* renamed from: a */
    private final Uri f13310a;
    /* renamed from: b */
    private final eqi f13311b;
    /* renamed from: c */
    private final kpw f13312c;

    dhr(Uri uri, eqi eqi, kpw kpw) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f13310a = uri;
        if (eqi == null) {
            throw new NullPointerException("Null mediaStoreRecord");
        }
        this.f13311b = eqi;
        if (kpw == null) {
            throw new NullPointerException("Null processingVideoRecordResult");
        }
        this.f13312c = kpw;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof djm)) {
            return false;
        }
        djm djm = (djm) obj;
        if (this.f13310a.equals(djm.mo1149c()) && this.f13311b.equals(djm.mo1147a()) && this.f13312c.equals(djm.mo1148b())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    final eqi mo1147a() {
        return this.f13311b;
    }

    /* renamed from: b */
    final kpw mo1148b() {
        return this.f13312c;
    }

    /* renamed from: c */
    final Uri mo1149c() {
        return this.f13310a;
    }

    public final int hashCode() {
        return ((((this.f13310a.hashCode() ^ 1000003) * 1000003) ^ this.f13311b.hashCode()) * 1000003) ^ this.f13312c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13310a);
        String valueOf2 = String.valueOf(this.f13311b);
        String valueOf3 = String.valueOf(this.f13312c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 70) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("ProcessingVideo{uri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", mediaStoreRecord=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", processingVideoRecordResult=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

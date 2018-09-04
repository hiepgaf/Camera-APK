package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: are */
public final class are implements adl {
    /* renamed from: b */
    private final String f10169b;
    /* renamed from: c */
    private final long f10170c;
    /* renamed from: d */
    private final int f10171d;

    public are(String str, long j, int i) {
        if (str == null) {
            str = "";
        }
        this.f10169b = str;
        this.f10170c = j;
        this.f10171d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        are are = (are) obj;
        if (this.f10170c != are.f10170c) {
            return false;
        }
        if (this.f10171d != are.f10171d) {
            return false;
        }
        if (this.f10169b.equals(are.f10169b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10169b.hashCode();
        long j = this.f10170c;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f10171d;
    }

    /* renamed from: a */
    public final void mo21a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f10170c).putInt(this.f10171d).array());
        messageDigest.update(this.f10169b.getBytes(a));
    }
}

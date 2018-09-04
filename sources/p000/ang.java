package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: ang */
final class ang implements ado {
    /* renamed from: a */
    private final ByteBuffer f10090a = ByteBuffer.allocate(8);

    ang() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo20a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f10090a) {
            this.f10090a.position(0);
            messageDigest.update(this.f10090a.putLong(l.longValue()).array());
        }
    }
}

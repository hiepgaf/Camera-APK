package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: anh */
final class anh implements ado {
    /* renamed from: a */
    private final ByteBuffer f10091a = ByteBuffer.allocate(4);

    anh() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo20a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.f10091a) {
                this.f10091a.position(0);
                messageDigest.update(this.f10091a.putInt(num.intValue()).array());
            }
        }
    }
}

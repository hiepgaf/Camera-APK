package p000;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ghc */
public final class ghc extends ghf {
    public ghc() {
        super(2);
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo1483a(Object obj) {
        return ByteBuffer.allocateDirect(((Integer) obj).intValue());
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo1484b(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.rewind();
        byteBuffer.limit(byteBuffer.capacity());
        return byteBuffer;
    }
}

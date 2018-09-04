package p000;

import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jgy */
final class jgy {
    /* renamed from: a */
    public final ByteBuffer f7818a;
    /* renamed from: b */
    public final BufferInfo f7819b;

    jgy(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        this.f7818a = byteBuffer;
        this.f7819b = bufferInfo;
    }

    /* renamed from: a */
    public final boolean m4478a() {
        BufferInfo bufferInfo = this.f7819b;
        return bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0;
    }

    /* renamed from: a */
    public static jgy m4477a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        BufferInfo bufferInfo2 = new BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(bufferInfo.offset);
        duplicate.limit(bufferInfo.size + bufferInfo.offset);
        return new jgy(duplicate, bufferInfo2);
    }
}

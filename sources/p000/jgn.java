package p000;

import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jgn */
public final class jgn implements jhf {
    /* renamed from: a */
    private final jhf f18772a;

    private jgn(jhf jhf) {
        this.f18772a = jhf;
    }

    public final void close() {
        this.f18772a.close();
    }

    /* renamed from: a */
    public static jgn m12825a(jhf jhf) {
        return new jgn(jhf);
    }

    /* renamed from: a */
    public final void mo1295a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        BufferInfo bufferInfo2 = new BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(bufferInfo.offset);
        duplicate.limit(bufferInfo.size + bufferInfo.offset);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        allocateDirect.put(duplicate);
        allocateDirect.rewind();
        jgy jgy = new jgy(allocateDirect, bufferInfo2);
        this.f18772a.mo1295a(jgy.f7818a, jgy.f7819b);
    }
}

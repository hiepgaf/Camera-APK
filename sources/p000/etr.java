package p000;

import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: etr */
final class etr implements jhf {
    /* renamed from: a */
    private final jhf f15530a;
    /* renamed from: b */
    private final kpw f15531b;

    public etr(jhf jhf, kpw kpw) {
        this.f15530a = jhf;
        this.f15531b = kpw;
    }

    public final void close() {
        try {
            this.f15530a.close();
        } catch (Throwable th) {
            this.f15531b.cancel(false);
        }
    }

    /* renamed from: a */
    public final void mo1295a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        try {
            this.f15530a.mo1295a(byteBuffer, bufferInfo);
            if ((bufferInfo.flags & 1) != 0) {
                this.f15531b.mo3557a(Long.valueOf(bufferInfo.presentationTimeUs));
            }
        } catch (Throwable th) {
            this.f15531b.cancel(false);
        }
    }
}

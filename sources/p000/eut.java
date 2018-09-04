package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: eut */
final class eut implements jhf {
    /* renamed from: a */
    private final /* synthetic */ jhf f15587a;
    /* renamed from: b */
    private final /* synthetic */ jhe f15588b;
    /* renamed from: c */
    private final /* synthetic */ eus f15589c;

    eut(eus eus, jhf jhf, jhe jhe) {
        this.f15589c = eus;
        this.f15587a = jhf;
        this.f15588b = jhe;
    }

    public final void close() {
        euv euv = new euv(this.f15588b);
        this.f15587a.close();
    }

    /* renamed from: a */
    public final void mo1295a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        this.f15587a.mo1295a(byteBuffer, bufferInfo);
        MediaFormat mediaFormat = this.f15588b.f7833b;
        euu euu = new euu(bufferInfo, mediaFormat);
        if (mediaFormat.getString("mime").startsWith("video/")) {
            synchronized (this.f15589c.f15585a) {
                euw euw = this.f15589c.f15585a;
                int i = euw.f4256a;
                if (i == 0) {
                    euw.f4257b = Long.MAX_VALUE;
                }
                euw.f4256a = i + 1;
                euw.f4257b = Math.min(bufferInfo.presentationTimeUs, euw.f4257b);
                euw = this.f15589c.f15585a;
                euw.f4258c = Math.max(bufferInfo.presentationTimeUs, euw.f4258c);
            }
        }
    }
}

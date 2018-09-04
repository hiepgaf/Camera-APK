package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jho */
public final class jho implements AutoCloseable {
    /* renamed from: a */
    public final /* synthetic */ ByteBuffer f7839a;
    /* renamed from: b */
    public final /* synthetic */ BufferInfo f7840b;
    /* renamed from: c */
    private final /* synthetic */ MediaCodec f7841c;
    /* renamed from: d */
    private final /* synthetic */ int f7842d;
    /* renamed from: e */
    private final /* synthetic */ jft f7843e;

    public jho(jft jft, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i) {
        this.f7843e = jft;
        this.f7841c = mediaCodec;
        this.f7839a = byteBuffer;
        this.f7840b = bufferInfo;
        this.f7842d = i;
    }

    public final void close() {
        this.f7841c.releaseOutputBuffer(this.f7842d, false);
        this.f7843e.f7776a.f7792l.mo1303a(this.f7840b.presentationTimeUs);
        this.f7843e.m4452a(this.f7840b);
    }
}

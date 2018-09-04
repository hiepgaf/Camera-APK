package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jhg */
final class jhg implements jhf {
    /* renamed from: a */
    public final kpk f18797a;
    /* renamed from: b */
    public final kpk f18798b;
    /* renamed from: c */
    public final jhe f18799c;
    /* renamed from: d */
    public final kpw f18800d = kpw.m18056d();
    /* renamed from: e */
    public final kpw f18801e;
    /* renamed from: f */
    public final kpk f18802f;
    /* renamed from: g */
    public final ConcurrentLinkedDeque f18803g;
    /* renamed from: h */
    public final Object f18804h;
    /* renamed from: i */
    public long f18805i;
    /* renamed from: j */
    private final Executor f18806j;
    /* renamed from: k */
    private final AtomicBoolean f18807k;
    /* renamed from: l */
    private final AtomicBoolean f18808l;

    jhg(kpk kpk, kpk kpk2, kpk kpk3, jhe jhe, Executor executor) {
        this.f18802f = kpk;
        this.f18797a = kpk2;
        this.f18806j = executor;
        this.f18799c = jhe;
        this.f18801e = kpw.m18056d();
        this.f18798b = kpk3;
        this.f18807k = new AtomicBoolean();
        this.f18808l = new AtomicBoolean();
        this.f18803g = new ConcurrentLinkedDeque();
        this.f18805i = 0;
        this.f18804h = new Object();
    }

    /* renamed from: a */
    final void m12839a() {
        this.f18801e.cancel(false);
        this.f18798b.cancel(false);
        this.f18800d.mo3557a(null);
    }

    public final void close() {
        if (!this.f18807k.getAndSet(true)) {
            BufferInfo bufferInfo = new BufferInfo();
            bufferInfo.size = 0;
            bufferInfo.flags = 4;
            m12837a(new jgy(ByteBuffer.wrap(new byte[0]), bufferInfo));
        }
    }

    /* renamed from: a */
    private final void m12837a(jgy jgy) {
        boolean a = jgy.m4478a();
        if (this.f18808l.get() || !jhg.m12838a(this.f18799c.f7833b, "oo.muxer.drop_initial_non_keyframes") || (jgy.f7819b.flags & 1) != 0 || a) {
            this.f18803g.addLast(jgy);
            if (a) {
                this.f18807k.set(true);
                if (!this.f18801e.isDone()) {
                    m12839a();
                    return;
                }
            }
            this.f18808l.set(true);
            this.f18801e.mo3557a(Long.valueOf(jgy.f7819b.presentationTimeUs));
            this.f18798b.mo1985a(new jhh(this), this.f18806j);
        }
    }

    /* renamed from: a */
    static boolean m12838a(MediaFormat mediaFormat, String str) {
        return mediaFormat.containsKey(str) && mediaFormat.getInteger(str) > 0;
    }

    /* renamed from: a */
    public final void mo1295a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        if (this.f18807k.get()) {
            Log.w("MuxerTrackStreamImpl", "WriteSampleData called after close called. Packet dropped.");
        } else {
            m12837a(jgy.m4477a(byteBuffer, bufferInfo));
        }
    }
}

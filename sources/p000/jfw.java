package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.Callback;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: jfw */
public final class jfw {
    /* renamed from: a */
    public final MediaCodec f7781a;
    /* renamed from: b */
    public final AtomicInteger f7782b = new AtomicInteger(3);
    /* renamed from: c */
    public final Surface f7783c;
    /* renamed from: d */
    public final Surface f7784d;
    /* renamed from: e */
    public final Deque f7785e = new ConcurrentLinkedDeque();
    /* renamed from: f */
    public final kpw f7786f;
    /* renamed from: g */
    public final AtomicBoolean f7787g;
    /* renamed from: h */
    public final AtomicBoolean f7788h;
    /* renamed from: i */
    public final AtomicBoolean f7789i = new AtomicBoolean(false);
    /* renamed from: j */
    public final AtomicBoolean f7790j;
    /* renamed from: k */
    public volatile jhm f7791k = jhm.f7838a;
    /* renamed from: l */
    public volatile jgk f7792l = jgk.f7809b;
    /* renamed from: m */
    private final boolean f7793m;
    /* renamed from: n */
    private final jft f7794n;

    public jfw(MediaCodec mediaCodec, MediaFormat mediaFormat, kaw kaw, boolean z, Handler handler) {
        Surface surface = null;
        this.f7781a = mediaCodec;
        this.f7793m = z;
        this.f7783c = null;
        this.f7786f = kpw.m18056d();
        this.f7788h = new AtomicBoolean(false);
        this.f7787g = new AtomicBoolean(false);
        this.f7790j = new AtomicBoolean(false);
        this.f7794n = new jft(this);
        Callback callback = this.f7794n;
        if (handler == null) {
            mediaCodec.setCallback(callback);
        } else {
            mediaCodec.setCallback(callback, handler);
        }
        try {
            mediaCodec.configure(mediaFormat, null, null, mediaCodec.getCodecInfo().isEncoder());
            if (kaw != null) {
                surface = (Surface) kaw.mo370a(mediaCodec);
            }
            this.f7784d = surface;
        } catch (Throwable e) {
            String valueOf = String.valueOf(e.getDiagnosticInfo());
            String str = "Error while configuring codec: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.w("AsynchMediaCodec", valueOf, e);
            throw e;
        }
    }

    /* renamed from: a */
    public final int m4453a() {
        synchronized (this) {
            if (this.f7785e.isEmpty()) {
                return -1;
            }
            int intValue = ((Integer) this.f7785e.removeFirst()).intValue();
            return intValue;
        }
    }

    /* renamed from: b */
    public final void m4455b() {
        if (this.f7790j.getAndSet(false)) {
            this.f7781a.stop();
        }
        if (!this.f7786f.isDone()) {
            this.f7781a.release();
            Surface surface = this.f7784d;
            if (surface != null && this.f7793m) {
                surface.release();
            }
            this.f7786f.mo3557a(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public final void m4454a(int i) {
        this.f7782b.set(2);
        if (this.f7784d == null) {
            this.f7781a.queueInputBuffer(i, 0, 0, 0, 4);
        } else {
            this.f7781a.signalEndOfInputStream();
        }
    }
}

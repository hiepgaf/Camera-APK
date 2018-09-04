package p000;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.util.Log;

/* compiled from: PG */
/* renamed from: jfp */
public final class jfp implements AutoCloseable {
    /* renamed from: a */
    private final AudioRecord f7765a;
    /* renamed from: b */
    private final AudioFormat f7766b;
    /* renamed from: c */
    private final jfq f7767c;
    /* renamed from: d */
    private final int f7768d = 1;
    /* renamed from: e */
    private final AudioTimestamp f7769e;
    /* renamed from: f */
    private long f7770f;

    public jfp(AudioRecord audioRecord) {
        this.f7765a = audioRecord;
        this.f7766b = audioRecord.getFormat();
        this.f7767c = new jfq(this.f7766b);
        this.f7769e = new AudioTimestamp();
    }

    public final synchronized void close() {
        this.f7765a.release();
    }

    /* renamed from: a */
    public final synchronized void m4450a() {
        this.f7770f = 0;
        jfq jfq = this.f7767c;
        synchronized (jfq.f7771a) {
            jfq.f7772b = 0;
        }
        this.f7765a.startRecording();
    }

    /* renamed from: b */
    public final synchronized void m4451b() {
        try {
            this.f7765a.stop();
        } catch (Throwable e) {
            Log.w("AudioStreamImpl", "Error while closing AudioStream.", e);
        }
    }
}

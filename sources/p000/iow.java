package p000;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* renamed from: iow */
public final class iow implements iqo {
    /* renamed from: a */
    public final Object f18486a = new Object();
    /* renamed from: b */
    public final int f18487b;
    /* renamed from: c */
    public final AudioRecord f18488c;
    /* renamed from: d */
    public final MediaCodec f18489d;
    /* renamed from: e */
    public final ioo f18490e;
    /* renamed from: f */
    public final int f18491f;
    /* renamed from: g */
    public final Deque f18492g = new ArrayDeque();
    /* renamed from: h */
    public long f18493h = -1;
    /* renamed from: i */
    public long f18494i = Long.MAX_VALUE;
    /* renamed from: j */
    public long f18495j;
    /* renamed from: k */
    public long f18496k = 0;
    /* renamed from: l */
    public Thread f18497l;
    /* renamed from: m */
    public Thread f18498m;
    /* renamed from: n */
    public ipa f18499n;
    /* renamed from: o */
    private final ird f18500o;

    public iow(inm inm, AudioRecord audioRecord, ioo ioo, ird ird) {
        this.f18488c = audioRecord;
        this.f18491f = inm.f7166c;
        int encoding = audioRecord.getFormat().getEncoding();
        ina[] values = ina.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            ina ina = values[i];
            if (encoding != ina.f7128a) {
                i++;
            } else {
                this.f18487b = ina.f7129b * inm.f7167d;
                inu a = inq.m12309a(inm.f7164a.f7115a);
                String str = a.f18396a;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str);
                if (a.f18396a.equals("audio/mp4a-latm")) {
                    Log.v("AudioEncoder", "Setting AAC profile");
                    mediaFormat.setInteger("aac-profile", ioj.LC.f7230b);
                }
                mediaFormat.setInteger("sample-rate", inm.f7166c);
                mediaFormat.setInteger("channel-count", inm.f7167d);
                mediaFormat.setInteger("bitrate", inm.f7165b);
                this.f18489d = ins.m3897a(a);
                jri.m13152b(this.f18489d);
                this.f18489d.configure(mediaFormat, null, null, 1);
                this.f18490e = ioo;
                this.f18500o = ird;
                this.f18499n = ipa.READY;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(87);
        stringBuilder.append("Unable to find out number of bytes per sample for the provided audio format ");
        stringBuilder.append(encoding);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void close() {
        m12345a(SystemClock.uptimeMillis() * 1000);
        m12344a();
    }

    /* renamed from: a */
    public final void m12344a() {
        synchronized (this.f18486a) {
            if (this.f18499n != ipa.CLOSED) {
                this.f18489d.release();
                this.f18488c.release();
                this.f18499n = ipa.CLOSED;
            }
        }
    }

    /* renamed from: a */
    public final void m12345a(long j) {
        synchronized (this.f18486a) {
            if (this.f18499n == ipa.STARTED || this.f18499n == ipa.PAUSED) {
                this.f18499n = ipa.STOPPED;
                this.f18494i = j - this.f18495j;
                long j2 = this.f18494i;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("request to stop at ");
                stringBuilder.append(j2);
                Log.d("AudioEncoder", stringBuilder.toString());
                this.f18500o.mo1903a("AudioEncoder#stop");
                try {
                    jri.m13152b(this.f18498m);
                    this.f18498m.join();
                    Log.d("AudioEncoder", "encoding thread stopped");
                    this.f18488c.stop();
                    Log.d("AudioEncoder", "AudioRecord stopped");
                    jri.m13152b(this.f18497l);
                    this.f18497l.join();
                    Log.d("AudioEncoder", "reading thread stopped");
                    this.f18489d.stop();
                    Log.d("AudioEncoder", "MediaCodec stopped");
                    this.f18500o.mo1904b();
                    this.f18499n = ipa.STOPPED;
                } catch (Throwable e) {
                    throw new RuntimeException("Unable to stop input thread AudioEncoder", e);
                } catch (Throwable e2) {
                    throw new RuntimeException("Unable to stop output thread AudioEncoder", e2);
                }
            }
        }
    }
}

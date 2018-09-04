package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Range;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: ior */
public final class ior implements iqo {
    /* renamed from: a */
    public final Object f18428a;
    /* renamed from: b */
    public final MediaCodec f18429b;
    /* renamed from: c */
    public final Surface f18430c;
    /* renamed from: d */
    public final ioo f18431d;
    /* renamed from: e */
    public Thread f18432e;
    /* renamed from: f */
    public float f18433f;
    /* renamed from: g */
    public long f18434g;
    /* renamed from: h */
    public final float f18435h;
    /* renamed from: i */
    public long f18436i = Long.MAX_VALUE;
    /* renamed from: j */
    public ipk f18437j;
    /* renamed from: k */
    private final boolean f18438k;
    /* renamed from: l */
    private final ird f18439l;
    /* renamed from: m */
    private final int f18440m;
    /* renamed from: n */
    private final Range f18441n;

    public ior(inp inp, iok iok, ioo ioo, kbg kbg, ird ird) {
        inu a = inv.m12311a(inp.mo1893c());
        String str = a.f18402a;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, inp.mo1897g().m3881c().f7329a, inp.mo1897g().m3881c().f7330b);
        createVideoFormat.setInteger("color-format", iok.f7234b);
        createVideoFormat.setInteger("bitrate", inp.m3895h());
        createVideoFormat.setInteger("frame-rate", inp.mo1891a().f7143g);
        createVideoFormat.setInteger("i-frame-interval", 1);
        String valueOf = String.valueOf(createVideoFormat);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
        stringBuilder.append("configure video encoding format: ");
        stringBuilder.append(valueOf);
        Log.i("VideoEncoder", stringBuilder.toString());
        this.f18429b = ins.m3897a(a);
        jri.m13152b(this.f18429b);
        this.f18429b.configure(createVideoFormat, null, null, 1);
        this.f18438k = kbg.mo2084b();
        if (kbg.mo2084b()) {
            Log.d("VideoEncoder", "persistent surface will be used");
            this.f18430c = (Surface) kbg.mo2081a();
            this.f18429b.setInputSurface(this.f18430c);
        } else if (iok == iok.SURFACE) {
            Log.d("VideoEncoder", "surface will be used");
            this.f18430c = this.f18429b.createInputSurface();
        } else {
            Log.d("VideoEncoder", "no surface will be used");
            this.f18430c = null;
        }
        this.f18431d = ioo;
        this.f18439l = ird;
        this.f18440m = inp.m3895h();
        this.f18441n = this.f18429b.getCodecInfo().getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange();
        this.f18428a = new Object();
        this.f18437j = ipk.READY;
        this.f18433f = 0.0f;
        this.f18434g = 0;
        this.f18435h = ((float) inp.mo1891a().f7142f) / ((float) inp.mo1891a().f7143g);
    }

    /* renamed from: a */
    public final int m12332a(float f) {
        synchronized (this.f18428a) {
            if (this.f18437j != ipk.STARTED) {
                String valueOf = String.valueOf(this.f18437j);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                stringBuilder.append("illegal state as ");
                stringBuilder.append(valueOf);
                Log.e("VideoEncoder", stringBuilder.toString());
                return -1;
            }
            int intValue = ((Integer) this.f18441n.clamp(Integer.valueOf((int) (((float) this.f18440m) * f)))).intValue();
            float f2 = ((float) this.f18440m) * f;
            stringBuilder = new StringBuilder(52);
            stringBuilder.append("Request bit rate ");
            stringBuilder.append(f2);
            stringBuilder.append(" but get ");
            stringBuilder.append(intValue);
            Log.d("VideoEncoder", stringBuilder.toString());
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", intValue);
            this.f18429b.setParameters(bundle);
            return intValue;
        }
    }

    public final void close() {
        m12333a(SystemClock.uptimeMillis() * 1000);
    }

    /* renamed from: a */
    private final boolean m12331a() {
        synchronized (this.f18428a) {
            if (this.f18437j != ipk.STARTED) {
                throw new IllegalStateException("encoding is not yet started.");
            }
        }
        if (this.f18430c != null) {
            String valueOf = String.valueOf(iok.SURFACE);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 64);
            stringBuilder.append("As ");
            stringBuilder.append(valueOf);
            stringBuilder.append("is used as color format, you are not allowed to add data here");
            throw new IllegalStateException(stringBuilder.toString());
        }
        int dequeueInputBuffer = this.f18429b.dequeueInputBuffer(10000);
        if (dequeueInputBuffer < 0) {
            return false;
        }
        this.f18429b.getInputBuffer(dequeueInputBuffer).clear();
        this.f18429b.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
        return true;
    }

    /* renamed from: a */
    public final void m12333a(long j) {
        synchronized (this.f18428a) {
            if (this.f18437j == ipk.STARTED || this.f18437j == ipk.PAUSED) {
                this.f18436i = j - ((long) this.f18433f);
                long j2 = this.f18436i;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("request to stop at ");
                stringBuilder.append(j2);
                Log.d("VideoEncoder", stringBuilder.toString());
                this.f18439l.mo1903a("VideoEncoder#stop");
                if (this.f18437j == ipk.PAUSED) {
                    Log.d("VideoEncoder", "firing signal of end of input stream because current state is PAUSE");
                    this.f18429b.signalEndOfInputStream();
                }
                if (this.f18430c == null) {
                    if (m12331a()) {
                        Log.d("VideoEncoder", "write a video frame with EOS signal");
                    } else {
                        Log.d("VideoEncoder", "fails to write a video frame with EOS signal");
                    }
                }
                try {
                    jri.m13152b(this.f18432e);
                    this.f18432e.join();
                    Log.d("VideoEncoder", "encoding thread stopped");
                    this.f18429b.stop();
                    Log.d("VideoEncoder", "mediaCodec resources stopped");
                    this.f18437j = ipk.STOPPED;
                    this.f18439l.mo1904b();
                } catch (Throwable e) {
                    throw new RuntimeException("Unable to stop VideoEncoder", e);
                }
            }
            if (this.f18437j != ipk.CLOSED) {
                this.f18429b.release();
                Surface surface = this.f18430c;
                if (!(surface == null || this.f18438k)) {
                    surface.release();
                }
                this.f18437j = ipk.CLOSED;
            }
        }
    }
}

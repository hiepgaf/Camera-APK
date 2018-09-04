package p000;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import android.media.MediaRecorder.OnInfoListener;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.FileDescriptor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ips */
public final class ips implements ipy {
    /* renamed from: c */
    private static final AtomicInteger f18503c = new AtomicInteger(0);
    /* renamed from: a */
    private final MediaRecorder f18504a;
    /* renamed from: b */
    private boolean f18505b = false;
    /* renamed from: d */
    private final int f18506d;

    public ips(MediaRecorder mediaRecorder) {
        this.f18504a = mediaRecorder;
        this.f18506d = f18503c.getAndIncrement();
        int i = this.f18506d;
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(i);
        stringBuilder.append(" created.");
        Log.d("AMedRec", stringBuilder.toString());
    }

    /* renamed from: a */
    public final MediaRecorder mo471a() {
        return this.f18504a;
    }

    /* renamed from: b */
    public final synchronized Surface mo483b() {
        return !this.f18505b ? this.f18504a.getSurface() : null;
    }

    /* renamed from: c */
    public final synchronized void mo485c() {
        if (!this.f18505b) {
            try {
                this.f18504a.pause();
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo487d() {
        if (!this.f18505b) {
            try {
                this.f18504a.prepare();
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }

    /* renamed from: e */
    public final synchronized void mo489e() {
        if (!this.f18505b) {
            this.f18504a.release();
            this.f18505b = true;
            int i = this.f18506d;
            StringBuilder stringBuilder = new StringBuilder(20);
            stringBuilder.append(i);
            stringBuilder.append(" released");
            Log.d("AMedRec", stringBuilder.toString());
        }
    }

    /* renamed from: f */
    public final synchronized void mo491f() {
        if (!this.f18505b) {
            this.f18504a.reset();
        }
    }

    /* renamed from: g */
    public final synchronized void mo493g() {
        if (!this.f18505b) {
            try {
                this.f18504a.resume();
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo474a(int i) {
        if (!this.f18505b) {
            this.f18504a.setAudioChannels(i);
        }
    }

    /* renamed from: b */
    public final synchronized void mo484b(int i) {
        if (!this.f18505b) {
            this.f18504a.setAudioEncoder(i);
        }
    }

    /* renamed from: c */
    public final synchronized void mo486c(int i) {
        if (!this.f18505b) {
            this.f18504a.setAudioEncodingBitRate(i);
        }
    }

    /* renamed from: d */
    public final synchronized void mo488d(int i) {
        if (!this.f18505b) {
            this.f18504a.setAudioSamplingRate(i);
        }
    }

    /* renamed from: e */
    public final synchronized void mo490e(int i) {
        if (!this.f18505b) {
            this.f18504a.setAudioSource(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo472a(double d) {
        if (!this.f18505b) {
            this.f18504a.setCaptureRate(d);
        }
    }

    /* renamed from: a */
    public final synchronized void mo479a(Surface surface) {
        if (!this.f18505b) {
            this.f18504a.setInputSurface(surface);
        }
    }

    /* renamed from: a */
    public final synchronized void mo473a(float f, float f2) {
        if (!this.f18505b) {
            this.f18504a.setLocation(f, f2);
        }
    }

    /* renamed from: f */
    public final synchronized void mo492f(int i) {
        if (!this.f18505b) {
            this.f18504a.setMaxDuration(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo476a(long j) {
        if (!this.f18505b) {
            this.f18504a.setMaxFileSize(j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo480a(File file) {
        if (!this.f18505b) {
            try {
                this.f18504a.setNextOutputFile(file);
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo477a(OnErrorListener onErrorListener) {
        if (!this.f18505b) {
            this.f18504a.setOnErrorListener(onErrorListener);
        }
    }

    /* renamed from: a */
    public final synchronized void mo478a(OnInfoListener onInfoListener) {
        if (!this.f18505b) {
            this.f18504a.setOnInfoListener(onInfoListener);
        }
    }

    /* renamed from: g */
    public final synchronized void mo494g(int i) {
        if (!this.f18505b) {
            this.f18504a.setOrientationHint(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo481a(FileDescriptor fileDescriptor) {
        if (!this.f18505b) {
            this.f18504a.setOutputFile(fileDescriptor);
        }
    }

    /* renamed from: a */
    public final synchronized void mo482a(String str) {
        if (!this.f18505b) {
            this.f18504a.setOutputFile(str);
        }
    }

    /* renamed from: h */
    public final synchronized void mo496h(int i) {
        if (!this.f18505b) {
            this.f18504a.setOutputFormat(i);
        }
    }

    /* renamed from: i */
    public final synchronized void mo498i(int i) {
        if (!this.f18505b) {
            this.f18504a.setVideoEncoder(i);
        }
    }

    /* renamed from: j */
    public final synchronized void mo499j(int i) {
        if (!this.f18505b) {
            this.f18504a.setVideoEncodingBitRate(i);
        }
    }

    /* renamed from: k */
    public final synchronized void mo500k(int i) {
        if (!this.f18505b) {
            this.f18504a.setVideoFrameRate(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo475a(int i, int i2) {
        if (!this.f18505b) {
            this.f18504a.setVideoSize(i, i2);
        }
    }

    /* renamed from: l */
    public final synchronized void mo501l(int i) {
        if (!this.f18505b) {
            this.f18504a.setVideoSource(i);
        }
    }

    /* renamed from: h */
    public final synchronized void mo495h() {
        if (!this.f18505b) {
            try {
                this.f18504a.start();
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }

    /* renamed from: i */
    public final synchronized void mo497i() {
        if (!this.f18505b) {
            try {
                this.f18504a.stop();
            } catch (Throwable e) {
                throw new ipu(e);
            }
        }
    }
}

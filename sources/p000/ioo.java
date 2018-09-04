package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: ioo */
public final class ioo implements iqo {
    /* renamed from: a */
    public MediaMuxer f18408a;
    /* renamed from: b */
    public MediaMuxer f18409b = null;
    /* renamed from: c */
    public final Object f18410c;
    /* renamed from: d */
    public final ConcurrentLinkedQueue f18411d;
    /* renamed from: e */
    public ipi f18412e;
    /* renamed from: f */
    public final ioq f18413f;
    /* renamed from: g */
    public final ioq f18414g;
    /* renamed from: h */
    public final ioq f18415h;
    /* renamed from: i */
    public final iol f18416i;
    /* renamed from: j */
    public boolean f18417j;
    /* renamed from: k */
    public boolean f18418k;
    /* renamed from: l */
    public final int f18419l;
    /* renamed from: m */
    public final float f18420m;
    /* renamed from: n */
    public final float f18421n;
    /* renamed from: o */
    public final int f18422o;
    /* renamed from: p */
    public boolean f18423p = false;
    /* renamed from: q */
    private final Handler f18424q;
    /* renamed from: r */
    private final kpw f18425r;
    /* renamed from: s */
    private long f18426s = 0;
    /* renamed from: t */
    private final ExecutorService f18427t;

    public ioo(String str, FileDescriptor fileDescriptor, int i, int i2, float f, float f2, long j, long j2, boolean z, boolean z2, ion ion, Handler handler, ExecutorService executorService) {
        this.f18422o = i2;
        this.f18419l = i;
        this.f18420m = f;
        this.f18421n = f2;
        this.f18408a = ioo.m12321a(str, fileDescriptor, i, i2, f, f2);
        this.f18410c = new Object();
        this.f18412e = ipi.READY;
        if (z || z2) {
            this.f18413f = new ioq(z);
            this.f18414g = new ioq(z2);
            this.f18415h = new ioq(false);
            if (j <= 0) {
                j = Long.MAX_VALUE;
            }
            if (j2 <= 0) {
                j2 = Long.MAX_VALUE;
            }
            this.f18416i = new iol(j2, j);
            this.f18424q = handler;
            this.f18425r = kpw.m18056d();
            this.f18411d = new ConcurrentLinkedQueue();
            this.f18417j = false;
            this.f18418k = false;
            this.f18427t = executorService;
            return;
        }
        throw new IllegalArgumentException("add least audio or video is required.");
    }

    public final void close() {
        m12328b();
        this.f18427t.shutdown();
    }

    /* renamed from: a */
    public final boolean m12327a() {
        boolean z;
        synchronized (this.f18410c) {
            z = this.f18412e == ipi.STARTED;
        }
        return z;
    }

    /* renamed from: a */
    public final void m12325a(File file) {
        try {
            this.f18409b = ioo.m12321a(file.getPath(), null, this.f18419l, this.f18422o, this.f18420m, this.f18421n);
            String str = "MediaMuxerMul";
            String str2 = "Create a new media muxer: ";
            String valueOf = String.valueOf(file.getPath());
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            Log.d(str, valueOf);
            ArrayList arrayList = new ArrayList();
            ioq ioq = this.f18414g;
            if (ioq.f7239a) {
                arrayList.add(ioq);
            }
            ioq = this.f18413f;
            if (ioq.f7239a) {
                arrayList.add(ioq);
            }
            ioq = this.f18415h;
            if (ioq.f7239a) {
                arrayList.add(ioq);
            }
            Collections.sort(arrayList);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                boolean z;
                int i2 = i + 1;
                ioq = (ioq) arrayList.get(i);
                if (((MediaMuxer) jri.m13152b(this.f18409b)).addTrack((MediaFormat) jri.m13152b(ioq.f7242d)) == ioq.m3971a()) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13143a(z);
                i = i2;
            }
            this.f18423p = true;
        } catch (Throwable e) {
            Log.e("MediaMuxerMul", "Fail to create next video file", e);
            throw new IllegalStateException("Fail to create next video file", e);
        }
    }

    /* renamed from: a */
    public static MediaMuxer m12321a(String str, FileDescriptor fileDescriptor, int i, int i2, float f, float f2) {
        if (str == null && fileDescriptor == null) {
            throw new IllegalArgumentException("Either outputFilePath or outputFilePath should be provided.");
        }
        MediaMuxer a;
        if (fileDescriptor != null) {
            a = ion.m3937a(fileDescriptor, i);
            if (str != null) {
                Log.w("MediaMuxerMul", String.valueOf(str).concat(" is provided as output path but will be ignored as outputFilePathDescriptor is also provided."));
            }
        } else {
            a = ion.m3938a((String) jri.m13152b((Object) str), i);
        }
        a.setOrientationHint(i2);
        if (i == 0) {
            a.setLocation(f, f2);
        }
        return a;
    }

    /* renamed from: b */
    public final void m12328b() {
        synchronized (this.f18410c) {
            if (this.f18412e == ipi.STARTED) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1);
                allocateDirect.put((byte) 0);
                BufferInfo bufferInfo = new BufferInfo();
                bufferInfo.set(0, 1, 0, 4);
                ioq ioq = this.f18415h;
                if (ioq.f7241c) {
                    if (ioq.f7240b) {
                        m12322a(allocateDirect, bufferInfo, ioq.m3971a());
                        if (bufferInfo.size > 0) {
                            this.f18415h.f7241c = false;
                        }
                    } else {
                        Log.e("MediaMuxerMul", "metadata track is not supported");
                    }
                }
                if (this.f18414g.f7241c) {
                    m12329b(allocateDirect, bufferInfo);
                }
                if (this.f18413f.f7241c) {
                    m12326a(allocateDirect, bufferInfo);
                }
                try {
                    this.f18408a.stop();
                } catch (IllegalStateException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    stringBuilder.append("Failed to stop mediamuxer ");
                    stringBuilder.append(valueOf);
                    Log.e("MediaMuxerMul", stringBuilder.toString());
                }
                Log.d("MediaMuxerMul", "stopped");
                this.f18412e = ipi.STOPPED;
            }
            if (this.f18412e != ipi.CLOSED) {
                try {
                    this.f18408a.release();
                } catch (IllegalStateException e2) {
                    valueOf = String.valueOf(e2);
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 29);
                    stringBuilder2.append("Failed to release mediamuxer ");
                    stringBuilder2.append(valueOf);
                    Log.e("MediaMuxerMul", stringBuilder2.toString());
                }
                this.f18412e = ipi.CLOSED;
            }
        }
    }

    /* renamed from: d */
    private final void m12323d() {
        synchronized (this.f18410c) {
            Log.d("MediaMuxerMul", "switch to new media muxer");
            MediaMuxer mediaMuxer = this.f18408a;
            this.f18408a = (MediaMuxer) jri.m13152b(this.f18409b);
            this.f18408a.start();
            this.f18423p = false;
            this.f18427t.submit(new ipg(mediaMuxer));
            this.f18424q.post(new iph(this));
        }
    }

    /* renamed from: a */
    public final void m12324a(long j) {
        Throwable e;
        try {
            this.f18425r.get(j, TimeUnit.MILLISECONDS);
            Log.d("MediaMuxerMul", "wait and started");
        } catch (InterruptedException e2) {
            e = e2;
            throw new RuntimeException("Wait for Muxer start is interrupted", e);
        } catch (ExecutionException e3) {
            e = e3;
            throw new RuntimeException("Wait for Muxer start is interrupted", e);
        } catch (TimeoutException e4) {
            StringBuilder stringBuilder = new StringBuilder(68);
            stringBuilder.append("Wait for muxer to start times out in ");
            stringBuilder.append(j);
            stringBuilder.append(" Milisecond");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public final void m12330c() {
        Object obj = null;
        synchronized (this.f18410c) {
            if (this.f18412e == ipi.READY) {
                Object obj2;
                ioq ioq = this.f18413f;
                if (!ioq.f7239a) {
                    obj2 = 1;
                } else if (ioq.f7240b) {
                    int i = 1;
                } else {
                    obj2 = null;
                }
                ioq = this.f18414g;
                Object obj3;
                if (!ioq.f7239a) {
                    obj3 = 1;
                } else if (ioq.f7240b) {
                    int i2 = 1;
                } else {
                    obj3 = null;
                }
                ioq = this.f18415h;
                Object obj4;
                if (!ioq.f7239a) {
                    obj4 = 1;
                } else if (ioq.f7240b) {
                    int i3 = 1;
                } else {
                    obj4 = null;
                }
                if (!(obj2 == null || r3 == null || r2 == null)) {
                    int i4 = 1;
                }
                if (obj != null) {
                    this.f18408a.start();
                    this.f18412e = ipi.STARTED;
                    this.f18425r.mo3557a(null);
                    Log.d("MediaMuxerMul", "started");
                }
            } else if (this.f18412e == ipi.STOPPED) {
                Log.e("MediaMuxerMul", "Muxer is already stopped and it cannot be reused");
            }
        }
    }

    /* renamed from: a */
    private final void m12322a(ByteBuffer byteBuffer, BufferInfo bufferInfo, int i) {
        iol iol;
        Throwable e;
        synchronized (this.f18410c) {
            if (this.f18412e != ipi.STARTED) {
                String valueOf = String.valueOf(ipi.STARTED);
                String valueOf2 = String.valueOf(this.f18412e);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 25) + String.valueOf(valueOf2).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(" is expected, but we get ");
                stringBuilder.append(valueOf2);
                Log.e("MediaMuxerMul", stringBuilder.toString());
                return;
            }
            synchronized (this.f18410c) {
                long j = this.f18426s;
                if (j >= 3700000000L) {
                    StringBuilder stringBuilder2 = new StringBuilder(65);
                    stringBuilder2.append("Need to switch to new media muxer: file size=");
                    stringBuilder2.append(j);
                    Log.d("MediaMuxerMul", stringBuilder2.toString());
                    this.f18424q.post(new ipc(this));
                    this.f18426s = 0;
                }
                if (this.f18423p) {
                    if (!this.f18414g.f7239a) {
                        m12323d();
                    }
                    if (i == this.f18414g.m3971a() && (bufferInfo.flags & 1) != 0) {
                        m12323d();
                    }
                }
            }
            if (bufferInfo.presentationTimeUs < 0) {
                return;
            }
            try {
                this.f18408a.writeSampleData(i, byteBuffer, bufferInfo);
                iol = this.f18416i;
                iol.f7237c = ((long) bufferInfo.size) + iol.f7237c;
                this.f18426s += (long) bufferInfo.size;
            } catch (IllegalArgumentException e2) {
                e = e2;
                Log.e("MediaMuxerMul", "Fail to write data to muxer", e);
                this.f18424q.post(new ipd(this));
                iol = this.f18416i;
                if (iol.f7237c >= iol.f7235a) {
                    this.f18424q.post(new ipe(this));
                }
                iol = this.f18416i;
                if (iol.f7238d >= iol.f7236b) {
                    this.f18424q.post(new ipf(this));
                }
            } catch (IllegalStateException e3) {
                e = e3;
                Log.e("MediaMuxerMul", "Fail to write data to muxer", e);
                this.f18424q.post(new ipd(this));
                iol = this.f18416i;
                if (iol.f7237c >= iol.f7235a) {
                    this.f18424q.post(new ipe(this));
                }
                iol = this.f18416i;
                if (iol.f7238d >= iol.f7236b) {
                    this.f18424q.post(new ipf(this));
                }
            }
        }
    }

    /* renamed from: a */
    public final void m12326a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        ioq ioq = this.f18413f;
        if (ioq.f7240b) {
            m12322a(byteBuffer, bufferInfo, ioq.m3971a());
            if (bufferInfo.size > 0) {
                this.f18413f.f7241c = false;
                return;
            }
            return;
        }
        Log.e("MediaMuxerMul", "Audio track is not supported");
    }

    /* renamed from: b */
    public final void m12329b(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        ioq ioq = this.f18414g;
        if (ioq.f7240b) {
            m12322a(byteBuffer, bufferInfo, ioq.m3971a());
            if (bufferInfo.size > 0) {
                this.f18414g.f7241c = false;
                this.f18424q.post(new ipb(this, bufferInfo));
                return;
            }
            return;
        }
        Log.e("MediaMuxerMul", "Video track is not supported");
    }
}

package p000;

import android.location.Location;
import android.media.AudioRecord;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: ios */
public final class ios implements iqo {
    /* renamed from: a */
    public final Object f18442a = new Object();
    /* renamed from: b */
    public ipr f18443b;
    /* renamed from: c */
    public final File f18444c;
    /* renamed from: d */
    public final FileDescriptor f18445d;
    /* renamed from: e */
    public final ioo f18446e;
    /* renamed from: f */
    public final ior f18447f;
    /* renamed from: g */
    public final iow f18448g;
    /* renamed from: h */
    public final int f18449h;
    /* renamed from: i */
    public iop f18450i = null;
    /* renamed from: j */
    public AudioRecord f18451j;
    /* renamed from: k */
    public iov f18452k;
    /* renamed from: l */
    private final kpm f18453l;
    /* renamed from: m */
    private final Location f18454m;
    /* renamed from: n */
    private final ExecutorService f18455n;

    public ios(iot iot) {
        float latitude;
        float longitude;
        Throwable e;
        this.f18453l = iot.f7244a;
        this.f18444c = iot.f7254k;
        this.f18445d = iot.f7255l;
        this.f18449h = iot.f7253j;
        this.f18454m = iot.f7259p;
        this.f18455n = khx.m4940a();
        int i = iot.f7247d.mo1891a().f7143g;
        Location location = this.f18454m;
        if (location != null) {
            latitude = (float) location.getLatitude();
            longitude = (float) this.f18454m.getLongitude();
        } else {
            latitude = 0.0f;
            longitude = 0.0f;
        }
        try {
            int i2;
            String path;
            boolean z;
            boolean z2;
            inp inp = iot.f7247d;
            if (inp == null) {
                i2 = 0;
            } else {
                i2 = inp.mo1896f().f7149b;
            }
            File file = this.f18444c;
            if (file != null) {
                path = file.getPath();
            } else {
                path = null;
            }
            FileDescriptor fileDescriptor = iot.f7255l;
            int i3 = iot.f7253j;
            long j = iot.f7252i;
            long j2 = (long) iot.f7251h;
            if (iot.f7246c != null) {
                z = true;
            } else {
                z = false;
            }
            if (iot.f7247d != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f18446e = new ioo(path, fileDescriptor, i2, i3, latitude, longitude, j, j2, z, z2, iot.f7257n, iot.f7250g, this.f18455n);
            inp inp2 = iot.f7247d;
            if (inp2 != null) {
                this.f18447f = new ior(inp2, iot.f7248e, this.f18446e, kbg.m4744b(iot.f7258o), iot.f7245b);
            } else {
                this.f18447f = null;
            }
            inm inm = iot.f7246c;
            if (inm == null) {
                this.f18448g = null;
            } else {
                int i4;
                inr inr = iot.f7249f;
                String valueOf = String.valueOf(inm);
                String valueOf2 = String.valueOf(inr);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 16) + String.valueOf(valueOf2).length());
                stringBuilder.append("profile ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" source ");
                stringBuilder.append(valueOf2);
                Log.v("AudioRecordFactory", stringBuilder.toString());
                if (inm.f7167d == 2) {
                    i4 = 12;
                } else {
                    i4 = 16;
                }
                i3 = AudioRecord.getMinBufferSize(inm.f7166c, i4, 2) * 10;
                valueOf = String.valueOf(inr);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append(valueOf);
                stringBuilder.append(":");
                stringBuilder.append(i3);
                stringBuilder.append("x");
                stringBuilder.append(i4);
                Log.v("AudioRecordFactory", stringBuilder.toString());
                this.f18451j = new AudioRecord(inr.f7181b, inm.f7166c, i4, 2, i3);
                valueOf = String.valueOf(iot.f7246c);
                String valueOf3 = String.valueOf(iot.f7249f);
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf3).length());
                stringBuilder2.append("Create a AudioRecorder object with profile=");
                stringBuilder2.append(valueOf);
                stringBuilder2.append(" and source=");
                stringBuilder2.append(valueOf3);
                Log.v("VideoRecorderImpl", stringBuilder2.toString());
                this.f18448g = new iow(iot.f7246c, this.f18451j, this.f18446e, iot.f7245b);
            }
            iov iov = iot.f7260q;
            if (iov != null) {
                this.f18452k = iov;
            }
            this.f18443b = ipr.READY;
        } catch (iom e2) {
            e = e2;
            Log.e("VideoRecorderImpl", "Fail to create muxer processor", e);
            throw e;
        } catch (IllegalArgumentException e3) {
            e = e3;
            Log.e("VideoRecorderImpl", "Fail to create muxer processor", e);
            throw e;
        }
    }

    /* renamed from: a */
    public final int m12334a(float f) {
        int i = -1;
        synchronized (this.f18442a) {
            if (this.f18443b == ipr.CLOSED) {
            } else {
                ior ior = this.f18447f;
                if (ior == null) {
                    Log.w("VideoRecorderImpl", "video encoder is not enabled here, so ignored.");
                } else {
                    i = ior.m12332a(f);
                }
            }
        }
        return i;
    }

    public final void close() {
        try {
            m12340e().get();
            return;
        } catch (ExecutionException e) {
        } catch (InterruptedException e2) {
        }
        Log.e("VideoRecorderImpl", "Fail to stop the video recorder at close");
    }

    /* renamed from: a */
    public final kbg m12335a() {
        kbg c;
        synchronized (this.f18442a) {
            boolean z;
            Object obj;
            if (this.f18443b != ipr.CLOSED) {
                z = true;
            } else {
                z = false;
            }
            jri.m13153b(z);
            ior ior = this.f18447f;
            if (ior != null) {
                obj = ior.f18430c;
            } else {
                obj = null;
            }
            if (obj != null) {
                c = kbg.m4745c(obj);
            } else {
                c = kau.f19138a;
            }
        }
        return c;
    }

    /* renamed from: b */
    public final /* synthetic */ kpk m12337b() {
        synchronized (this.f18442a) {
            this.f18443b = ipr.STARTED;
        }
        return kow.m13617a(this.f18444c);
    }

    /* renamed from: c */
    public final kpk m12338c() {
        kpk a;
        synchronized (this.f18442a) {
            if (this.f18443b != ipr.STARTED) {
                String valueOf = String.valueOf(ipr.STARTED);
                String valueOf2 = String.valueOf(this.f18443b);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(" is expected but we get ");
                stringBuilder.append(valueOf2);
                Log.e("VideoRecorderImpl", stringBuilder.toString());
                a = kow.m13617a(null);
            } else {
                long uptimeMillis = SystemClock.uptimeMillis() * 1000;
                StringBuilder stringBuilder2 = new StringBuilder(39);
                stringBuilder2.append("pause at timestamp=");
                stringBuilder2.append(uptimeMillis);
                Log.d("VideoRecorderImpl", stringBuilder2.toString());
                ior ior = this.f18447f;
                if (ior != null) {
                    synchronized (ior.f18428a) {
                        if (ior.f18437j != ipk.STARTED) {
                            Log.e("VideoEncoder", "VideoEncoder is not recording now");
                        } else {
                            if (ior.f18430c != null) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("drop-input-frames", 1);
                                bundle.putLong("drop-start-time-us", uptimeMillis);
                                ior.f18429b.setParameters(bundle);
                            }
                            ior.f18434g = uptimeMillis;
                            ior.f18437j = ipk.PAUSED;
                        }
                    }
                }
                iow iow = this.f18448g;
                if (iow != null) {
                    synchronized (iow.f18486a) {
                        if (iow.f18499n != ipa.STARTED) {
                            Log.e("AudioEncoder", "It is not recording now");
                        } else {
                            iow.f18499n = ipa.PAUSED;
                            iow.f18492g.add(kge.m13494a(Long.valueOf(uptimeMillis)));
                        }
                    }
                }
                this.f18443b = ipr.PAUSED;
                a = kow.m13617a(null);
            }
        }
        return a;
    }

    /* renamed from: d */
    public final kpk m12339d() {
        kpk a;
        synchronized (this.f18442a) {
            if (this.f18443b != ipr.PAUSED) {
                String valueOf = String.valueOf(ipr.PAUSED);
                String valueOf2 = String.valueOf(this.f18443b);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(" is expected but we get ");
                stringBuilder.append(valueOf2);
                Log.e("VideoRecorderImpl", stringBuilder.toString());
                a = kow.m13617a(null);
            } else {
                long uptimeMillis = 1000 * SystemClock.uptimeMillis();
                StringBuilder stringBuilder2 = new StringBuilder(40);
                stringBuilder2.append("resume at timestamp=");
                stringBuilder2.append(uptimeMillis);
                Log.d("VideoRecorderImpl", stringBuilder2.toString());
                ior ior = this.f18447f;
                if (ior != null) {
                    synchronized (ior.f18428a) {
                        if (ior.f18437j != ipk.PAUSED) {
                            Log.e("VideoEncoder", "It is not recording now");
                        } else {
                            ior.f18433f += ((float) (uptimeMillis - ior.f18434g)) * ior.f18435h;
                            float f = ior.f18433f;
                            StringBuilder stringBuilder3 = new StringBuilder(33);
                            stringBuilder3.append("Total paused time ");
                            stringBuilder3.append(f);
                            Log.d("VideoEncoder", stringBuilder3.toString());
                            if (ior.f18430c != null) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("drop-input-frames", 0);
                                bundle.putLong("drop-start-time-us", uptimeMillis);
                                bundle.putLong("time-offset-us", (long) (-ior.f18433f));
                                ior.f18429b.setParameters(bundle);
                            }
                            ior.f18437j = ipk.STARTED;
                        }
                    }
                }
                iow iow = this.f18448g;
                if (iow != null) {
                    synchronized (iow.f18486a) {
                        if (iow.f18499n != ipa.PAUSED) {
                            Log.e("AudioEncoder", "It is not recording now");
                        } else {
                            iow.f18499n = ipa.STARTED;
                            kge kge = (kge) iow.f18492g.removeLast();
                            iow.f18492g.add(kge.m13495a((Long) kge.f19198a.mo2123a(), Long.valueOf(uptimeMillis)));
                            iow.f18495j = (uptimeMillis - ((Long) kge.f19198a.mo2123a()).longValue()) + iow.f18495j;
                            uptimeMillis = iow.f18495j;
                            stringBuilder2 = new StringBuilder(38);
                            stringBuilder2.append("Total paused time ");
                            stringBuilder2.append(uptimeMillis);
                            Log.d("AudioEncoder", stringBuilder2.toString());
                        }
                    }
                }
                this.f18443b = ipr.STARTED;
                a = kow.m13617a(null);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final kpk m12336a(iop iop) {
        kpk a;
        synchronized (this.f18442a) {
            boolean z;
            if (this.f18443b == ipr.READY) {
                z = true;
            } else {
                z = false;
            }
            jri.m13153b(z);
            this.f18450i = iop;
            ioo ioo = this.f18446e;
            ioo.f18411d.add(this.f18450i);
            SystemClock.elapsedRealtime();
            a = iel.m3717a(this.f18453l.mo2198a(new ipl(this)), this.f18453l.mo2198a(new ipm(this)), new ipn(this), this.f18453l);
        }
        return a;
    }

    /* renamed from: e */
    public final kpk m12340e() {
        kpk a;
        synchronized (this.f18442a) {
            if (this.f18443b == ipr.STARTED || this.f18443b == ipr.PAUSED) {
                long uptimeMillis = SystemClock.uptimeMillis() * 1000;
                a = iel.m3717a(this.f18453l.mo2198a(new ipo(this, uptimeMillis)), this.f18453l.mo2198a(new ipp(this, uptimeMillis)), new ipq(this), this.f18453l);
            } else {
                String valueOf = String.valueOf(ipr.STARTED);
                String valueOf2 = String.valueOf(ipr.PAUSED);
                String valueOf3 = String.valueOf(this.f18443b);
                StringBuilder stringBuilder = new StringBuilder(((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(" or ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(" is expected but we get ");
                stringBuilder.append(valueOf3);
                Log.e("VideoRecorderImpl", stringBuilder.toString());
                a = kow.m13617a(null);
            }
        }
        return a;
    }
}

package p000;

import android.annotation.TargetApi;
import android.location.Location;
import android.media.MediaCodec;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Executor;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: bis */
public final class bis implements biq {
    /* renamed from: a */
    public static final String f20066a = bli.m862a("MediaRecPreparer");
    /* renamed from: b */
    public final ipv f20067b;
    /* renamed from: c */
    private final inm f20068c;
    /* renamed from: d */
    private final inp f20069d;
    /* renamed from: e */
    private final Executor f20070e;
    /* renamed from: f */
    private final gtf f20071f;
    /* renamed from: g */
    private final ipy f20072g;
    /* renamed from: h */
    private final ilp f20073h;
    /* renamed from: i */
    private final ilp f20074i;
    /* renamed from: j */
    private final kbg f20075j;
    /* renamed from: k */
    private final boolean f20076k;
    /* renamed from: l */
    private final guf f20077l;
    /* renamed from: m */
    private final int f20078m;
    /* renamed from: n */
    private final int f20079n;
    /* renamed from: o */
    private final ird f20080o;
    /* renamed from: p */
    private Surface f20081p;
    /* renamed from: q */
    private final kbg f20082q;
    /* renamed from: r */
    private final kbg f20083r;
    /* renamed from: s */
    private final Object f20084s = new Object();
    /* renamed from: t */
    private final kbg f20085t;
    /* renamed from: u */
    private boolean f20086u = false;

    public bis(ipy ipy, Executor executor, inm inm, inp inp, ipv ipv, gtf gtf, guf guf, kbg kbg, ilp ilp, ilp ilp2, kbg kbg2, boolean z, int i, int i2, kbg kbg3, ird ird) {
        kbg c;
        this.f20072g = ipy;
        this.f20070e = executor;
        this.f20068c = inm;
        this.f20069d = inp;
        this.f20067b = ipv;
        this.f20071f = gtf;
        this.f20077l = guf;
        this.f20082q = kbg;
        this.f20073h = ilp;
        this.f20074i = ilp2;
        this.f20075j = kbg2;
        this.f20076k = z;
        this.f20078m = i;
        this.f20079n = i2;
        this.f20083r = kbg3;
        this.f20080o = ird;
        if (z) {
            c = kbg.m4745c(MediaCodec.createPersistentInputSurface());
        } else {
            c = kau.f19138a;
        }
        this.f20085t = c;
    }

    public final void close() {
        synchronized (this.f20084s) {
            if (this.f20086u) {
                bli.m866b(f20066a, "close twice!");
                return;
            }
            bli.m863a(f20066a, "close");
            this.f20086u = true;
            if (this.f20085t.mo2084b()) {
                bli.m863a(f20066a, "Release persistent recording surface.");
                ((Surface) this.f20085t.mo2081a()).release();
            } else {
                Surface surface = this.f20081p;
                if (surface != null) {
                    surface.release();
                }
            }
            bli.m863a(f20066a, "Release MediaRecorder.");
            this.f20072g.mo489e();
            if (this.f20082q.mo2084b()) {
                bli.m863a(f20066a, "Close video intent file descriptor.");
                try {
                    ((ParcelFileDescriptor) this.f20082q.mo2081a()).close();
                } catch (IOException e) {
                    String str = f20066a;
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    stringBuilder.append("Error on closing intentFileDescriptor: ");
                    stringBuilder.append(valueOf);
                    bli.m866b(str, stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ kpk m14843a(Long l) {
        if (l.longValue() < 0) {
            String str = f20066a;
            String valueOf = String.valueOf(l);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
            stringBuilder.append("The storage space is too low. available space (byte)=");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            return kow.m13618a(new gso());
        }
        synchronized (this.f20084s) {
            if (this.f20086u) {
                kpk a = kow.m13618a(new IllegalStateException("MediaRecorderDevice has been closed."));
                return a;
            }
            File a2;
            Object obj;
            int i;
            int a3;
            str = f20066a;
            boolean z = this.f20076k;
            StringBuilder stringBuilder2 = new StringBuilder(33);
            stringBuilder2.append("Persistent Surface Enabled: ");
            stringBuilder2.append(z);
            bli.m863a(str, stringBuilder2.toString());
            this.f20080o.mo1903a(String.valueOf(f20066a).concat("#prepare"));
            if (!this.f20082q.mo2084b() || this.f20082q.mo2081a() == null) {
                a2 = this.f20071f.m2811a(this.f20071f.m2814b(System.currentTimeMillis()), this.f20069d.mo1896f().f7150c);
                obj = null;
            } else {
                a2 = null;
                obj = ((ParcelFileDescriptor) this.f20082q.mo2081a()).getFileDescriptor();
            }
            int intValue = ((Integer) this.f20074i.mo2860b()).intValue();
            str = f20066a;
            StringBuilder stringBuilder3 = new StringBuilder(44);
            stringBuilder3.append("MediaRecorder.setOrientationHint=");
            stringBuilder3.append(intValue);
            bli.m863a(str, stringBuilder3.toString());
            if (((Boolean) this.f20073h.mo2860b()).booleanValue()) {
                i = this.f20079n;
            } else {
                i = this.f20078m;
            }
            if (this.f20069d.mo1891a().m3876d()) {
                a3 = i * this.f20069d.mo1891a().m3874a();
            } else {
                a3 = i;
            }
            str = f20066a;
            stringBuilder3 = new StringBuilder(49);
            stringBuilder3.append("MediaRecorder.setMaxDuration=");
            stringBuilder3.append(a3);
            stringBuilder3.append("(seconds)");
            bli.m863a(str, stringBuilder3.toString());
            long longValue = l.longValue();
            long longValue2 = this.f20083r.mo2084b() ? ((Long) this.f20083r.mo2081a()).longValue() < longValue ? ((Long) this.f20083r.mo2081a()).longValue() : longValue : longValue;
            str = f20066a;
            stringBuilder3 = new StringBuilder(55);
            stringBuilder3.append("MediaRecorder.setMaxFileSize=");
            stringBuilder3.append(longValue2);
            stringBuilder3.append("(Byte)");
            bli.m863a(str, stringBuilder3.toString());
            kbg kbg = kau.f19138a;
            if (this.f20075j.mo2084b()) {
                Location d = ((hjw) this.f20075j.mo2081a()).mo1244d();
                if (d != null) {
                    bli.m863a(f20066a, "MediaRecorder.setLocation");
                    kbg = kbg.m4745c(d);
                }
            }
            try {
                StringBuilder stringBuilder4;
                ipy ipy = this.f20072g;
                kbg kbg2 = this.f20085t;
                inp inp = this.f20069d;
                inm inm = this.f20068c;
                kbg b = kbg.m4744b(obj);
                kbg b2 = kbg.m4744b(a2);
                a3 *= 1000;
                ipy.mo491f();
                if (b.mo2084b() && b.mo2081a() != null) {
                    ipy.mo481a((FileDescriptor) b.mo2081a());
                } else if (!b2.mo2084b() || b2.mo2081a() == null) {
                    Log.e("MedRecPrep", "Either output file path or descriptor should present");
                    throw new IllegalArgumentException("Either output file path or descriptor should present");
                } else {
                    ipy.mo482a(((File) b2.mo2081a()).getAbsolutePath());
                }
                if (kbg2.mo2084b() && kbg2.mo2081a() != null) {
                    ipy.mo479a((Surface) kbg2.mo2081a());
                }
                ipy.mo490e(5);
                ipy.mo501l(2);
                ipy.mo496h(inp.mo1896f().f7148a);
                i = inp.mo1893c();
                StringBuilder stringBuilder5 = new StringBuilder(41);
                stringBuilder5.append("MediaRecorder.setVideoEncoder=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo498i(inp.mo1893c());
                if (!(inp.mo1895e() == -1 || inp.mo1894d() == -1)) {
                    i = inp.mo1895e();
                    int d2 = inp.mo1894d();
                    stringBuilder4 = new StringBuilder(80);
                    stringBuilder4.append("MediaRecorder.setVideoEncodingProfileLevel profile=");
                    stringBuilder4.append(i);
                    stringBuilder4.append(" level=");
                    stringBuilder4.append(d2);
                    Log.d("MedRecPrep", stringBuilder4.toString());
                    hsx.m3355a(ipy.mo471a(), inp.mo1895e(), inp.mo1894d());
                }
                str = String.valueOf(inp.mo1897g());
                stringBuilder4 = new StringBuilder(String.valueOf(str).length() + 27);
                stringBuilder4.append("MediaRecorder.setVideoSize=");
                stringBuilder4.append(str);
                Log.d("MedRecPrep", stringBuilder4.toString());
                ipy.mo475a(inp.mo1897g().m3881c().f7329a, inp.mo1897g().m3881c().f7330b);
                i = inp.m3895h();
                stringBuilder5 = new StringBuilder(49);
                stringBuilder5.append("MediaRecorder.setVideoEncodingBitRate=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo499j(inp.m3895h());
                i = inp.mo1891a().f7143g;
                stringBuilder5 = new StringBuilder(43);
                stringBuilder5.append("MediaRecorder.setVideoFrameRate=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo500k(inp.mo1891a().f7143g);
                i = inp.mo1891a().f7142f;
                stringBuilder5 = new StringBuilder(40);
                stringBuilder5.append("MediaRecorder.setCaptureRate=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo472a((double) inp.mo1891a().f7142f);
                i = inm.f7165b;
                stringBuilder5 = new StringBuilder(49);
                stringBuilder5.append("MediaRecorder.setAudioEncodingBitRate=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo486c(inm.f7165b);
                i = inm.f7167d;
                stringBuilder5 = new StringBuilder(42);
                stringBuilder5.append("MediaRecorder.setAudioChannels=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo474a(inm.f7167d);
                i = inm.f7166c;
                stringBuilder5 = new StringBuilder(46);
                stringBuilder5.append("MediaRecorder.setAudioSamplingRate=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo488d(inm.f7166c);
                str = String.valueOf(inm.f7164a);
                stringBuilder4 = new StringBuilder(String.valueOf(str).length() + 30);
                stringBuilder4.append("MediaRecorder.setAudioEncoder=");
                stringBuilder4.append(str);
                Log.d("MedRecPrep", stringBuilder4.toString());
                ipy.mo484b(inm.f7164a.f7115a);
                if (kbg.mo2084b() && kbg.mo2081a() != null) {
                    Log.d("MedRecPrep", "MediaRecorder.setLocation");
                    ipy.mo473a((float) ((Location) kbg.mo2081a()).getLatitude(), (float) ((Location) kbg.mo2081a()).getLongitude());
                }
                StringBuilder stringBuilder6 = new StringBuilder(44);
                stringBuilder6.append("MediaRecorder.setOrientationHint=");
                stringBuilder6.append(intValue);
                Log.d("MedRecPrep", stringBuilder6.toString());
                ipy.mo494g(intValue);
                if (a3 > 0) {
                    stringBuilder6 = new StringBuilder(54);
                    stringBuilder6.append("MediaRecorder.setMaxDuration=");
                    stringBuilder6.append(a3);
                    stringBuilder6.append("(milliseconds)");
                    Log.d("MedRecPrep", stringBuilder6.toString());
                    ipy.mo492f(a3);
                }
                if (longValue2 > 0) {
                    stringBuilder6 = new StringBuilder(55);
                    stringBuilder6.append("MediaRecorder.setMaxFileSize=");
                    stringBuilder6.append(longValue2);
                    stringBuilder6.append("(Byte)");
                    Log.d("MedRecPrep", stringBuilder6.toString());
                    ipy.mo476a(longValue2);
                }
                Log.d("MedRecPrep", "MediaRecorder.prepare() BEGIN");
                ipy.mo487d();
                Log.d("MedRecPrep", "MediaRecorder.prepare() END");
            } catch (ipu e) {
                valueOf = String.valueOf(e);
                StringBuilder stringBuilder7 = new StringBuilder(String.valueOf(valueOf).length() + 58);
                stringBuilder7.append("immediateFailedFuture: MediaRecorder.prepare() exception: ");
                stringBuilder7.append(valueOf);
                Log.e("MedRecPrep", stringBuilder7.toString());
                throw e;
            } catch (Throwable e2) {
                if (e2.getCause() instanceof FileNotFoundException) {
                    bli.m866b(f20066a, e2.getMessage());
                    return kow.m13618a(new gso(e2));
                }
            }
            this.f20080o.mo1904b();
            this.f20072g.mo477a(new biu(this));
            this.f20081p = null;
            if (this.f20085t.mo2084b()) {
                this.f20081p = (Surface) this.f20085t.mo2081a();
            }
            if (this.f20081p == null) {
                this.f20081p = this.f20072g.mo483b();
            }
            jri.m13152b(this.f20081p);
            a = kow.m13617a(new bix(this.f20076k, a2, intValue, this.f20072g, kbg, this.f20081p, this.f20082q));
            return a;
        }
    }

    /* renamed from: a */
    public final kpk mo2682a() {
        synchronized (this.f20084s) {
            if (this.f20086u) {
                kpk a = kow.m13618a(new IllegalStateException("MediaRecorderDevice has been closed."));
                return a;
            }
            bli.m863a(f20066a, "prepare");
            return kny.m18046a(this.f20077l.mo1650a(true), new bit(this), this.f20070e);
        }
    }

    /* renamed from: b */
    public final boolean mo2683b() {
        return this.f20076k;
    }
}

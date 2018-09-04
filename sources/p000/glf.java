package p000;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: glf */
public final class glf implements gkr {
    /* renamed from: a */
    public static final String f21514a = bli.m862a("CaptureSessionImpl");
    /* renamed from: A */
    private int f21515A = 0;
    /* renamed from: b */
    public final goe f21516b;
    /* renamed from: c */
    public final gsl f21517c;
    /* renamed from: d */
    public final gnh f21518d;
    /* renamed from: e */
    public final gmp f21519e;
    /* renamed from: f */
    public gmq f21520f;
    /* renamed from: g */
    public final Uri f21521g;
    /* renamed from: h */
    public volatile glk f21522h;
    /* renamed from: i */
    public final grg f21523i;
    /* renamed from: j */
    public final Map f21524j = new ConcurrentHashMap();
    /* renamed from: k */
    public int f21525k = 0;
    /* renamed from: l */
    public volatile god f21526l;
    /* renamed from: m */
    private final gny f21527m;
    /* renamed from: n */
    private final Executor f21528n;
    /* renamed from: o */
    private final gsq f21529o;
    /* renamed from: p */
    private final glt f21530p;
    /* renamed from: q */
    private final String f21531q;
    /* renamed from: r */
    private final long f21532r;
    /* renamed from: s */
    private final hju f21533s;
    /* renamed from: t */
    private gew f21534t;
    /* renamed from: u */
    private kbg f21535u = kau.f19138a;
    /* renamed from: v */
    private int f21536v = -1;
    /* renamed from: w */
    private hec f21537w = hci.m11747a();
    /* renamed from: x */
    private glw f21538x;
    /* renamed from: y */
    private boolean f21539y = false;
    /* renamed from: z */
    private int f21540z = 0;

    public glf(gnh gnh, gmp gmp, Executor executor, gsp gsp, gsl gsl, hju hju, grg grg, gny gny, gnu gnu, String str, long j, kbg kbg) {
        m15819a("CaptureSessionImpl(#1)");
        this.f21531q = (String) jri.m13152b((Object) str);
        this.f21532r = j;
        this.f21535u = (kbg) jri.m13152b((Object) kbg);
        this.f21516b = new goe(gnu, "TEMP_SESSIONS", str);
        this.f21518d = (gnh) jri.m13152b((Object) gnh);
        this.f21519e = (gmp) jri.m13152b((Object) gmp);
        this.f21522h = glk.NOT_STARTED;
        this.f21527m = gny;
        this.f21528n = (Executor) jri.m13152b((Object) executor);
        this.f21530p = new glt();
        this.f21529o = gsp.mo1643b();
        this.f21517c = (gsl) jri.m13152b((Object) gsl);
        this.f21533s = hju;
        this.f21523i = grg;
        this.f21521g = gsp.mo1633a();
    }

    /* renamed from: a */
    public final void mo2870a(glm glm) {
        this.f21530p.m11177a(glm);
    }

    /* renamed from: a */
    public final void mo2868a(bnl bnl) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final synchronized void mo2861a() {
        if (this.f21539y) {
            m15819a("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            mo1481a(hci.m11747a(), true, "Session canceled.");
        } else {
            m15819a("cancel");
            this.f21522h = glk.FINISHED_CANCELED;
            Uri uri = this.f21521g;
            if (uri != null) {
                this.f21518d.m2640b(uri);
            }
            gmq gmq = this.f21520f;
            if (gmq != null) {
                this.f21519e.m2626b(gmq);
                this.f21520f = null;
            }
            this.f21530p.onCaptureCanceled(this.f21540z, this.f21515A);
        }
    }

    /* renamed from: b */
    public final void mo2874b() {
        this.f21530p.onCaptureStartCommitted(this.f21540z, this.f21515A);
    }

    /* renamed from: a */
    private final void m15801a(glk... glkArr) {
        boolean z = false;
        glk glk = this.f21522h;
        for (glk glk2 : glkArr) {
            if (glk2 == glk) {
                z = true;
                break;
            }
        }
        String valueOf = String.valueOf(this.f21522h);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
        stringBuilder.append("Invalid session state: ");
        stringBuilder.append(valueOf);
        jri.m13154b(z, stringBuilder.toString());
    }

    /* renamed from: c */
    public final gob mo2876c() {
        m15801a(glk.STARTED);
        gob a = ((gnx) jri.m13152b(this.f21527m.m2646a(this, this.f21531q, this.f21535u))).mo1509a(this.f21529o, new god(this));
        String valueOf = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("createStackedSession -> ");
        stringBuilder.append(valueOf);
        m15819a(stringBuilder.toString());
        this.f21524j.put(a.f17151b, a);
        god god = this.f21526l;
        return a;
    }

    /* renamed from: d */
    public final synchronized void mo2877d() {
        m15819a("delete");
        this.f21522h = glk.FINISHED_CANCELED;
        Uri uri = this.f21521g;
        if (uri != null) {
            this.f21518d.m2640b(uri);
        }
        this.f21530p.onCaptureDeleted();
    }

    /* renamed from: a */
    public final void mo2869a(gft gft) {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final void mo2878e() {
        m15819a("finalizeSession");
        this.f21519e.m2626b(this.f21520f);
        this.f21530p.onCaptureFinalized();
    }

    /* renamed from: f */
    public final void mo2879f() {
        m15819a("finish");
        m15801a(glk.STARTED);
        if (this.f21520f == null) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        } else if (this.f21538x == glw.BURST || this.f21538x == glw.PORTRAIT || this.f21538x == glw.RAW) {
            mo2871a(hci.m11749a((int) R.string.burst_process_done, new Object[0]));
            m15839r();
            m15819a("capturePersisted");
            this.f21518d.m2638a((Uri) jri.m13152b(this.f21521g), this.f21529o.m2798a());
            this.f21522h = glk.FINISHED_CANCELED;
        } else {
            this.f21522h = glk.FINISHING;
            this.f21528n.execute(new glh(this));
        }
    }

    /* renamed from: a */
    public final void mo1481a(hec hec, boolean z, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "finishWithFailure, throwable message = ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        m15819a(valueOf);
        m15801a(glk.STARTED, glk.FINISHED_CANCELED);
        if (this.f21520f == null) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        this.f21537w = hec;
        this.f21518d.m2637a((Uri) jri.m13152b(this.f21521g), hec, z);
        this.f21519e.m2626b(this.f21520f);
        m15838q();
    }

    /* renamed from: g */
    public final void mo2880g() {
        this.f21518d.m2642c((Uri) jri.m13152b(this.f21521g));
    }

    /* renamed from: h */
    public final grg mo1482h() {
        return this.f21523i;
    }

    /* renamed from: i */
    public final synchronized int mo2881i() {
        return this.f21536v;
    }

    /* renamed from: j */
    public final synchronized hec mo2882j() {
        return this.f21537w;
    }

    /* renamed from: k */
    public final glw mo2883k() {
        return this.f21538x;
    }

    /* renamed from: l */
    public final long mo2884l() {
        return this.f21532r;
    }

    /* renamed from: m */
    public final goe mo2885m() {
        return this.f21516b;
    }

    /* renamed from: n */
    public final String mo2886n() {
        return this.f21531q;
    }

    /* renamed from: o */
    public final Uri mo2887o() {
        return (Uri) jri.m13152b(this.f21521g);
    }

    /* renamed from: a */
    final void m15819a(String str) {
        String toHexString = Integer.toHexString(hashCode());
        String str2 = f21514a;
        String str3 = this.f21531q;
        int length = String.valueOf(toHexString).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str3).length()) + String.valueOf(str).length());
        stringBuilder.append("[");
        stringBuilder.append(toHexString);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        bli.m869c(str2, stringBuilder.toString());
    }

    /* renamed from: q */
    final void m15838q() {
        this.f21530p.onCaptureFailed(this.f21540z, this.f21515A);
    }

    /* renamed from: r */
    final void m15839r() {
        this.f21530p.onCapturePersisted(this.f21540z, this.f21515A);
    }

    /* renamed from: b */
    private final void m15802b(Bitmap bitmap, int i) {
        this.f21539y = true;
        this.f21518d.m2632a(bitmap, i);
        this.f21530p.onTinyThumb();
    }

    /* renamed from: b */
    private final void m15803b(anq anq) {
        m15802b(hid.m3168a(anq.m6850f()), 0);
    }

    /* renamed from: a */
    public final synchronized kpk mo1479a(InputStream inputStream, glz glz) {
        kpk a;
        jri.m13152b((Object) inputStream);
        jri.m13152b((Object) glz);
        ixx ixx = glz.f5405b;
        ExifInterface exifInterface = (ExifInterface) glz.f5407d.mo2085c();
        m15819a("saveAndFinish");
        if (this.f21522h == glk.FINISHED_CANCELED) {
            m15823b("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            a = kow.m13617a(kau.f19138a);
        } else {
            m15801a(glk.STARTED, glk.FINISHING);
            glz.m2613a((Location) this.f21535u.mo2085c());
            this.f21522h = glk.FINISHED_CANCELED;
            a = kpw.m18056d();
            if (this.f21535u.mo2084b() && ixx == ixx.JPEG && exifInterface != null) {
                itg itg = new itg(exifInterface);
                itg.m4200a((Location) this.f21535u.mo2081a());
                exifInterface = itg.f7455a;
            }
            if (exifInterface != null) {
                this.f21533s.m3211a(exifInterface);
                this.f21523i.mo1512a(exifInterface);
            }
            jri.m13152b(this.f21520f);
            this.f21528n.execute(new glg(this, this.f21520f, glz, inputStream, a));
        }
        return a;
    }

    /* renamed from: a */
    public final void mo2862a(int i) {
        if (this.f21540z == 0) {
            this.f21540z = i;
        }
        this.f21515A = i;
    }

    /* renamed from: a */
    public final void mo2865a(Location location) {
        this.f21535u = kbg.m4744b(location);
    }

    /* renamed from: b */
    public final synchronized void mo2875b(int i) {
        if (this.f21522h != glk.STARTED) {
            m15823b("Ignoring setProgress. CaptureSession is not started.");
        } else if (i != 0) {
            int i2;
            boolean z = this.f21539y;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f21539y = i2 | z;
            this.f21536v = i;
            this.f21518d.m2634a(this.f21521g, this.f21536v);
            gew gew = this.f21534t;
            if (gew != null) {
                gew.mo775a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo1480a(gew gew) {
        if (!hci.m11752a(this.f21537w)) {
            gew.mo776a(this.f21537w);
        }
        gew.mo775a(this.f21536v);
        this.f21534t = gew;
    }

    /* renamed from: a */
    public final synchronized void mo2871a(hec hec) {
        m15819a("setProgressMessage");
        if (this.f21522h != glk.STARTED) {
            m15823b("Ignoring setProgressMessage. CaptureSession is not started.");
        } else {
            this.f21537w = hec;
            if (!hci.m11752a(hec) && this.f21536v < 0) {
                this.f21536v = 0;
            }
            this.f21518d.m2636a(this.f21521g, hec);
            gew gew = this.f21534t;
            if (gew != null) {
                gew.mo776a(hec);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo2872a(iqp iqp, glw glw) {
        m15819a("startEmpty");
        m15801a(glk.NOT_STARTED);
        this.f21522h = glk.STARTED;
        this.f21538x = glw;
        this.f21537w = hci.m11747a();
        this.f21536v = -1;
        this.f21520f = this.f21519e.m2621a(this.f21531q, iqp, this.f21532r, mo2887o());
        this.f21518d.m2635a(this.f21521g, this.f21538x, null);
        this.f21530p.onCaptureStarted(glw);
    }

    /* renamed from: a */
    public final synchronized void mo2867a(anq anq, hec hec, glw glw) {
        int i = 0;
        synchronized (this) {
            m15819a("startSession(DrawableResource)");
            m15801a(glk.NOT_STARTED);
            this.f21522h = glk.STARTED;
            this.f21538x = glw;
            this.f21537w = hec;
            if (hci.m11752a(hec)) {
                i = -1;
            }
            this.f21536v = i;
            this.f21520f = this.f21519e.m2620a(this.f21531q, anq, this.f21532r, mo2887o());
            this.f21518d.m2635a(this.f21521g, this.f21538x, null);
            this.f21530p.onCaptureStarted(glw);
            m15803b(anq);
        }
    }

    /* renamed from: a */
    public final synchronized void mo2873a(byte[] bArr, hec hec, glw glw) {
        int i = 0;
        synchronized (this) {
            m15819a("startSession(byte[])");
            m15801a(glk.NOT_STARTED);
            this.f21522h = glk.STARTED;
            this.f21538x = glw;
            this.f21537w = hec;
            if (hci.m11752a(hec)) {
                i = -1;
            }
            this.f21536v = i;
            this.f21520f = this.f21519e.m2622a(this.f21531q, bArr, this.f21532r, this.f21521g);
            this.f21518d.m2635a(this.f21521g, this.f21538x, null);
            this.f21530p.onCaptureStarted(glw);
            kbg a = this.f21519e.m2623a((gmq) jri.m13152b(this.f21520f));
            if (a.mo2084b()) {
                m15803b((anq) a.mo2081a());
            }
        }
    }

    /* renamed from: a */
    public final void mo2864a(Bitmap bitmap, int i) {
        m15819a("updateCaptureIndicatorThumbnail");
        m15802b(bitmap, i);
    }

    /* renamed from: p */
    public final void mo2888p() {
        m15819a("updatePreview");
        if (this.f21522h != glk.STARTED) {
            m15823b("Ignoring updatePreview. CaptureSession is not started.");
        } else {
            this.f21528n.execute(new gli(this));
        }
    }

    /* renamed from: a */
    public final void mo2863a(Bitmap bitmap) {
        m15819a("updateThumbnail");
        if (this.f21520f == null || this.f21522h != glk.STARTED) {
            m15823b("Ignoring updateThumbnail. CaptureSession is not started or placeholder has already been set.");
            return;
        }
        this.f21539y = true;
        this.f21519e.m2624a(this.f21520f, bitmap);
        this.f21518d.m2633a(this.f21521g);
        this.f21530p.onMediumThumb();
    }

    /* renamed from: a */
    public final void mo2866a(anq anq) {
        m15819a("updateThumbnail]");
        if (this.f21520f == null || this.f21522h != glk.STARTED) {
            m15823b("Ignoring updateThumbnail. CaptureSession is not started or placeholder has already been set.");
            return;
        }
        this.f21539y = true;
        this.f21519e.m2625a(this.f21520f, anq);
        this.f21518d.m2633a(this.f21521g);
        this.f21530p.onMediumThumb();
    }

    /* renamed from: b */
    final void m15823b(String str) {
        String toHexString = Integer.toHexString(hashCode());
        String str2 = f21514a;
        String str3 = this.f21531q;
        int length = String.valueOf(toHexString).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str3).length()) + String.valueOf(str).length());
        stringBuilder.append("[");
        stringBuilder.append(toHexString);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        bli.m873e(str2, stringBuilder.toString());
    }
}

package p000;

import android.graphics.Bitmap;
import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmi */
public final class gmi extends gkt {
    /* renamed from: a */
    public static final String f23266a = bli.m862a("PhtsphrCapSess");
    /* renamed from: b */
    public final goe f23267b;
    /* renamed from: c */
    public final gsl f23268c;

    public gmi(gmp gmp, glt glt, Executor executor, gsl gsl, eqa eqa, gsp gsp, gtf gtf, gsi gsi, grg grg, bcv bcv, goe goe, gnh gnh, String str, kbg kbg, long j, hju hju, gev gev) {
        super(executor, gmp, glt, eqa, gsi, gtf, gsp, grg, bcv, null, null, gnh, str, kbg, j, hju, gev, new glv(true));
        this.f23267b = (goe) jri.m13152b((Object) goe);
        this.f23268c = (gsl) jri.m13152b((Object) gsl);
    }

    /* renamed from: a */
    public final synchronized void mo2861a() {
        if (this.B) {
            m15777a("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            mo1481a(hci.m11747a(), true, "Session canceled.");
        } else {
            m15777a("cancel");
            this.h.m2607a(go.bb);
            m15796w();
            m15782b(this.f21506s);
            if (this.n != null) {
                this.f21508u.m2626b(this.n);
                this.n = null;
            }
            this.f21507t.onCaptureCanceled(this.C, this.D);
        }
    }

    /* renamed from: c */
    public final gob mo2876c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final synchronized void mo2877d() {
        m15777a("delete");
        this.h.m2607a(go.bb);
        m15796w();
        m15782b(this.f21506s);
        this.f21507t.onCaptureDeleted();
    }

    /* renamed from: a */
    public final void mo2869a(gft gft) {
        this.E = gft;
        m15758A().m2510a(gft);
        String str = f23266a;
        String valueOf = String.valueOf(gft);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
        stringBuilder.append("Enqueue file saving task ");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
    }

    /* renamed from: e */
    public final void mo2878e() {
        m15777a("finalizeSession");
        this.f21508u.m2626b(this.n);
        this.f21507t.onCaptureFinalized();
    }

    /* renamed from: f */
    public final void mo2879f() {
        m15777a("finish");
        if (this.n == null) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        this.h.m2608a(go.aZ, go.ba, f23266a);
        this.f21503p.execute(new gml(this));
    }

    /* renamed from: a */
    public final void mo1481a(hec hec, boolean z, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "finishWithFailure, throwable message  = ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        m15783b(valueOf);
        this.h.m2609a(go.aZ, go.bb);
        if (this.n == null) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        this.l = hec;
        m15796w();
        m15768a(this.f21506s, hec, z);
        this.f21508u.m2626b(this.n);
        m17436q();
    }

    /* renamed from: g */
    public final void mo2880g() {
        m15784c(this.f21506s);
    }

    /* renamed from: s */
    final String mo3449s() {
        return f23266a;
    }

    /* renamed from: m */
    public final goe mo2885m() {
        return this.f23267b;
    }

    /* renamed from: q */
    final void m17436q() {
        this.f21507t.onCaptureFailed(this.C, this.D);
    }

    /* renamed from: a */
    public final kpk mo1479a(InputStream inputStream, glz glz) {
        jri.m13152b((Object) inputStream);
        jri.m13152b((Object) glz);
        ixx ixx = glz.f5405b;
        ExifInterface exifInterface = (ExifInterface) glz.f5407d.mo2085c();
        m15777a("saveAndFinish");
        if (this.h.m2610a()) {
            m15783b("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return kow.m13617a(kau.f19138a);
        }
        this.h.m2609a(go.aZ, go.ba);
        glz.m2613a((Location) this.v.mo2085c());
        this.h.m2607a(go.bb);
        kpw d = kpw.m18056d();
        if (this.v.mo2084b() && ixx == ixx.JPEG && exifInterface != null) {
            itg itg = new itg(exifInterface);
            itg.m4200a((Location) this.v.mo2081a());
            exifInterface = itg.f7455a;
        }
        if (exifInterface != null) {
            m15799z().m3211a(exifInterface);
            this.f21511x.mo1512a(exifInterface);
        }
        this.f21503p.execute(new gmj(this, ixx, inputStream, kbg.m4744b(exifInterface), glz));
        kow.m13622a(m15761D(), new gmk(this, d), this.f21503p);
        return d;
    }

    /* renamed from: a */
    public final void mo2865a(Location location) {
        this.v = kbg.m4744b(location);
    }

    /* renamed from: a */
    public final void mo2872a(iqp iqp, glw glw) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final synchronized void mo2873a(byte[] bArr, hec hec, glw glw) {
        boolean z = true;
        int i = 0;
        synchronized (this) {
            int length;
            if (bArr != null) {
                length = bArr.length;
            } else {
                length = 0;
            }
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("startSession(byte[]): ");
            stringBuilder.append(length);
            m15777a(stringBuilder.toString());
            this.h.m2608a(go.aY, go.aZ, f23266a);
            this.k = glw;
            if (!(glw == glw.PHOTOSPHERE || glw == glw.PANORAMA)) {
                z = false;
            }
            jri.m13143a(z);
            m15762E();
            this.l = hec;
            if (hci.m11752a(hec)) {
                i = -1;
            }
            this.m = i;
            this.n = this.f21508u.m2622a(this.f21496i, (byte[]) jri.m13152b((Object) bArr), this.f21510w, this.f21506s);
            m15766a(this.f21506s, glw);
            this.f21507t.onCaptureStarted(glw);
            kbg a = this.f21508u.m2623a((gmq) jri.m13152b(this.n));
            if (a.mo2084b()) {
                Bitmap a2 = hid.m3168a(((anq) a.mo2081a()).m6850f());
                this.B = true;
                m15781b(a2, 0);
                this.f21507t.onTinyThumb();
            }
        }
    }

    /* renamed from: a */
    public final void mo2864a(Bitmap bitmap, int i) {
        m15777a("updateCaptureIndicatorThumbnail");
        m15781b(bitmap, i);
        this.f21507t.onTinyThumb();
    }

    /* renamed from: p */
    public final void mo2888p() {
        m15777a("updatePreview");
        if (this.h.m2611b()) {
            this.f21503p.execute(new gmm(this));
        } else {
            m15783b("Ignoring updatePreview. CaptureSession is not started.");
        }
    }

    /* renamed from: a */
    public final void mo2863a(Bitmap bitmap) {
        m15777a("updateThumbnail");
        if (this.n == null || !this.h.m2611b()) {
            m15783b("Ignoring updateThumbnail. CaptureSession is not started or placeholder has already been set.");
            return;
        }
        this.B = true;
        this.f21508u.m2624a((gmq) jri.m13152b(this.n), bitmap);
        m15765a(this.f21506s);
        this.f21507t.onMediumThumb();
    }
}

package p000;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmz */
public final class gmz extends gkt {
    /* renamed from: a */
    public static final String f23269a = bli.m862a("RefocusCaptSess");
    /* renamed from: b */
    public final goe f23270b;
    /* renamed from: c */
    public final gsl f23271c;
    /* renamed from: d */
    public eql f23272d;

    public gmz(Executor executor, gmp gmp, glt glt, eqa eqa, gsi gsi, gtf gtf, gsp gsp, gsl gsl, grg grg, bcv bcv, gnh gnh, String str, kbg kbg, long j, goe goe, hju hju) {
        super(executor, gmp, glt, eqa, gsi, gtf, gsp, grg, bcv, null, null, gnh, str, kbg, j, hju, null, new glv(true));
        this.f23271c = (gsl) jri.m13152b((Object) gsl);
        this.f23270b = (goe) jri.m13152b((Object) goe);
    }

    /* renamed from: a */
    public final synchronized void mo2861a() {
        if (this.B) {
            m15777a("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            mo1481a(hci.m11747a(), true, "");
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
        this.h.m2608a(go.aZ, go.ba, f23269a);
        this.f21503p.execute(new gne(this));
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
        m15783b(valueOf);
        this.h.m2609a(go.aZ, go.bb);
        if (this.n == null) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        this.l = hec;
        m15796w();
        m15768a(this.f21506s, hec, z);
        this.f21508u.m2626b(this.n);
        this.f21507t.onCaptureFailed(this.C, this.D);
    }

    /* renamed from: g */
    public final void mo2880g() {
        m15784c(this.f21506s);
    }

    /* renamed from: s */
    final String mo3449s() {
        return f23269a;
    }

    /* renamed from: m */
    public final goe mo2885m() {
        return this.f23270b;
    }

    /* renamed from: a */
    public final synchronized kpk mo1479a(InputStream inputStream, glz glz) {
        kpk a;
        jri.m13152b((Object) inputStream);
        jri.m13152b((Object) glz);
        ixx ixx = glz.f5405b;
        ExifInterface exifInterface = (ExifInterface) glz.f5407d.mo2085c();
        m15777a("saveAndFinish");
        if (this.h.m2610a()) {
            m15783b("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            a = kow.m13617a(kau.f19138a);
        } else {
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
            this.f21503p.execute(new gnb(this, ixx, inputStream, kbg.m4744b(exifInterface), glz));
            kow.m13622a(m15761D(), new gnc(this, d), this.f21503p);
            Object obj = d;
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized void mo2872a(iqp iqp, glw glw) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final synchronized void m17442a(Uri uri, hec hec, glw glw) {
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
        stringBuilder.append("startReprocessingSession(Uri)");
        stringBuilder.append(valueOf);
        m15777a(stringBuilder.toString());
        if (glw.equals(glw.LENS_BLUR_RERENDER)) {
            this.h.m2608a(go.aY, go.aZ, f23269a);
            this.n = this.f21508u.m2619a(uri);
            this.f23272d = this.f21502o.mo1259a(uri, this.f21510w, this.f21496i, glw, this.A);
            this.z = kow.m13617a(this.f23272d);
            m17443a(hec, glw, this.f23272d);
        } else {
            String valueOf2 = String.valueOf(glw.LENS_BLUR_RERENDER);
            String valueOf3 = String.valueOf(glw);
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf2).length() + 33) + String.valueOf(valueOf3).length());
            stringBuilder2.append("sessionType must be ");
            stringBuilder2.append(valueOf2);
            stringBuilder2.append(", but we get ");
            stringBuilder2.append(valueOf3);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    public final synchronized void mo2873a(byte[] bArr, hec hec, glw glw) {
        m15777a("startSession(byte[])");
        if (glw.equals(glw.LENS_BLUR) || glw.equals(glw.NORMAL) || glw.equals(glw.CYCLOPS_PANO)) {
            this.h.m2608a(go.aY, go.aZ, f23269a);
            this.n = this.f21508u.m2622a(this.f21496i, bArr, this.f21510w, this.f21506s);
            kbg a = this.f21508u.m2623a((gmq) jri.m13152b(this.n));
            if (a.mo2084b()) {
                Bitmap a2 = hid.m3168a(((anq) a.mo2081a()).m6850f());
                this.B = true;
                m15781b(a2, 0);
                this.f21507t.onTinyThumb();
            }
            this.k = glw;
            m15762E();
            jri.m13152b(this.z);
            this.z.mo1985a(new gna(this, hec, glw), this.f21503p);
        } else {
            String valueOf = String.valueOf(glw.LENS_BLUR);
            String valueOf2 = String.valueOf(glw.NORMAL);
            String valueOf3 = String.valueOf(glw);
            int length = String.valueOf(valueOf).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 37) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
            stringBuilder.append("sessionType must be ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" or ");
            stringBuilder.append(valueOf2);
            stringBuilder.append(", but we get ");
            stringBuilder.append(valueOf3);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    final void m17443a(hec hec, glw glw, eql eql) {
        int i;
        this.k = glw;
        this.l = hec;
        if (!(this.y == null || hci.m11752a(hec))) {
            ((gew) jri.m13152b(this.y)).mo776a(hec);
        }
        if (hci.m11752a(hec)) {
            i = -1;
        } else {
            i = 0;
        }
        this.m = i;
        m15767a(this.f21506s, this.k, (eqi) eql);
        this.f21507t.onCaptureStarted(glw);
    }

    /* renamed from: a */
    public final void mo2864a(Bitmap bitmap, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo2863a(Bitmap bitmap) {
        throw new UnsupportedOperationException();
    }
}

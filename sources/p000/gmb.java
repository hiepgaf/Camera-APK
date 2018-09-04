package p000;

import android.graphics.Bitmap;
import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmb */
public final class gmb extends gkt {
    /* renamed from: b */
    private static final String f23262b = bli.m862a("PhotoCaptureSession");
    /* renamed from: a */
    public final kbg f23263a;
    /* renamed from: c */
    private final ilp f23264c;
    /* renamed from: d */
    private boolean f23265d = false;

    public gmb(Executor executor, gmp gmp, glt glt, eqa eqa, gsi gsi, gtf gtf, gsp gsp, grg grg, bcv bcv, ird ird, bls bls, hju hju, gev gev, gnh gnh, String str, kbg kbg, long j, kbg kbg2, ilp ilp) {
        super(executor, gmp, glt, eqa, gsi, gtf, gsp, grg, bcv, ird, bls, gnh, str, kbg, j, hju, gev, new glv(true));
        this.f23263a = kbg2;
        this.E = new gfu(this);
        this.f23264c = ilp;
    }

    /* renamed from: a */
    public final void mo2861a() {
        if (this.B) {
            m15777a("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            mo1481a(hci.m11747a(), true, "Session canceled.");
            return;
        }
        if (this.f23263a.mo2084b()) {
            ((etc) this.f23263a.mo2081a()).mo1280a(this.f21506s);
        }
        m15777a("cancel");
        m17408q();
        jri.m13152b(this.n);
        this.f21508u.m2626b(this.n);
        this.f21507t.onCaptureCanceled(this.C, this.D);
        m15759B().mo561a(this.f21496i);
    }

    /* renamed from: c */
    public final gob mo2876c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo2877d() {
        m15777a("delete");
        m17408q();
        this.f21507t.onCaptureDeleted();
        m15759B().mo563b(this.f21496i);
    }

    /* renamed from: q */
    private final void m17408q() {
        this.h.m2607a(go.bb);
        jri.m13152b(this.f21506s);
        m15796w();
        m15782b(this.f21506s);
    }

    /* renamed from: e */
    public final void mo2878e() {
        m15777a("finalizeSession");
        this.f21508u.m2626b(this.n);
        this.f21507t.onCaptureFinalized();
        this.E.mo3058a();
    }

    /* renamed from: f */
    public final void mo2879f() {
        throw new UnsupportedOperationException();
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
        jri.m13152b(this.n);
        if (this.f23263a.mo2084b()) {
            ((etc) this.f23263a.mo2081a()).mo1280a(this.f21506s);
        }
        this.l = hec;
        m15796w();
        m15768a(this.f21506s, hec, z);
        this.f21508u.m2626b(this.n);
        this.f21507t.onCaptureFailed(this.C, this.D);
    }

    /* renamed from: s */
    final String mo3449s() {
        return f23262b;
    }

    /* renamed from: a */
    public final kpk mo1479a(InputStream inputStream, glz glz) {
        jri.m13152b((Object) inputStream);
        jri.m13152b((Object) glz);
        ixx ixx = glz.f5405b;
        m15777a("saveAndFinish");
        if (this.h.m2610a()) {
            m15783b("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return kow.m13617a(kau.f19138a);
        }
        this.h.m2609a(go.aZ, go.ba);
        glz.m2613a((Location) this.v.mo2085c());
        this.h.m2607a(go.bb);
        Object obj = (ExifInterface) glz.f5407d.mo2085c();
        if (obj != null) {
            if (ixx == ixx.JPEG) {
                itg itg = new itg(obj);
                if (((Boolean) this.f23264c.mo2860b()).booleanValue()) {
                    ite e = itg.f7455a.m8491e(ExifInterface.f12409u);
                    if (e != null) {
                        int i;
                        int[] b = e.m4186b();
                        if (b == null) {
                            i = 0;
                        } else if (b.length > 0) {
                            i = b[0];
                        } else {
                            i = 0;
                        }
                        e.m4188c(i | 1);
                        itg.f7455a.m8480a(e);
                    }
                }
                if (this.v.mo2084b()) {
                    itg.m4200a((Location) this.v.mo2081a());
                }
                obj = itg.f7455a;
            }
            m15799z().m3211a(obj);
            this.f21511x.mo1512a((ExifInterface) obj);
        }
        this.f21503p.execute(new gmc(this, glz, inputStream, kbg.m4744b(obj), ixx));
        kpk d = kpw.m18056d();
        kow.m13622a(m15761D(), new gmf(this, d), this.f21503p);
        return d;
    }

    /* renamed from: a */
    public final void mo2872a(iqp iqp, glw glw) {
        boolean z = true;
        m15760C().mo1903a("PhotoCaptureSession#startEmpty");
        m15777a("startEmpty");
        if (!(glw == glw.NORMAL || glw == glw.HDR_PLUS || glw == glw.HDR_PLUS_AUTO)) {
            z = false;
        }
        jri.m13143a(z);
        m15759B().mo566d(this.f21496i);
        m15758A().m2510a(this.E);
        this.h.m2608a(go.aY, go.aZ, f23262b);
        this.k = glw;
        m15762E();
        this.m = -1;
        m15760C().mo1905b("insertEmptyPlaceholder");
        this.n = this.f21508u.m2621a(this.f21496i, iqp, this.f21510w, this.f21506s);
        m15760C().mo1904b();
        m15766a(this.f21506s, glw);
        this.f21507t.onCaptureStarted(glw);
        m15760C().mo1904b();
    }

    /* renamed from: a */
    public final void mo2864a(Bitmap bitmap, int i) {
        m15777a("updateCaptureIndicatorThumbnail");
        if (!this.f23265d) {
            this.B = true;
            this.f23265d = true;
            m15781b(bitmap, i);
            this.f21507t.onTinyThumb();
        }
    }

    /* renamed from: a */
    public final void mo2863a(Bitmap bitmap) {
        m15777a("updateThumbnail");
        this.B = true;
        this.f21508u.m2624a((gmq) jri.m13152b(this.n), bitmap);
        m15765a(this.f21506s);
        this.f21507t.onMediumThumb();
    }
}

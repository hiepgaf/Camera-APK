package p000;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gkt */
public abstract class gkt implements gkr {
    /* renamed from: A */
    public kpw f21484A = kpw.m18056d();
    /* renamed from: B */
    public boolean f21485B = false;
    /* renamed from: C */
    public int f21486C = 0;
    /* renamed from: D */
    public int f21487D = 0;
    /* renamed from: E */
    public gft f21488E;
    /* renamed from: a */
    private bls f21489a;
    /* renamed from: b */
    private final gsi f21490b;
    /* renamed from: c */
    private final gtf f21491c;
    /* renamed from: d */
    private final hju f21492d;
    /* renamed from: e */
    private final gev f21493e;
    /* renamed from: f */
    private final ird f21494f;
    /* renamed from: h */
    public final glv f21495h;
    /* renamed from: i */
    public String f21496i;
    /* renamed from: j */
    public final bcv f21497j;
    /* renamed from: k */
    public glw f21498k;
    /* renamed from: l */
    public hec f21499l = hci.m11747a();
    /* renamed from: m */
    public int f21500m = -1;
    /* renamed from: n */
    public gmq f21501n;
    /* renamed from: o */
    public final eqa f21502o;
    /* renamed from: p */
    public final Executor f21503p;
    /* renamed from: q */
    public final gsp f21504q;
    /* renamed from: r */
    public final gnh f21505r;
    /* renamed from: s */
    public final Uri f21506s;
    /* renamed from: t */
    public final glt f21507t;
    /* renamed from: u */
    public final gmp f21508u;
    /* renamed from: v */
    public kbg f21509v;
    /* renamed from: w */
    public long f21510w;
    /* renamed from: x */
    public final grg f21511x;
    /* renamed from: y */
    public gew f21512y;
    /* renamed from: z */
    public volatile kpk f21513z;

    gkt(Executor executor, gmp gmp, glt glt, eqa eqa, gsi gsi, gtf gtf, gsp gsp, grg grg, bcv bcv, ird ird, bls bls, gnh gnh, String str, kbg kbg, long j, hju hju, gev gev, glv glv) {
        this.f21503p = executor;
        this.f21505r = gnh;
        this.f21502o = eqa;
        this.f21490b = gsi;
        this.f21491c = gtf;
        this.f21504q = gsp;
        this.f21507t = glt;
        this.f21508u = gmp;
        this.f21496i = str;
        this.f21509v = kbg;
        this.f21510w = j;
        this.f21492d = hju;
        this.f21511x = grg;
        this.f21497j = bcv;
        this.f21494f = ird;
        this.f21489a = bls;
        this.f21493e = gev;
        this.f21495h = glv;
        this.f21506s = gsp.mo1633a();
    }

    /* renamed from: s */
    abstract String mo3449s();

    /* renamed from: a */
    public final void mo2870a(glm glm) {
        this.f21507t.m11177a(glm);
    }

    /* renamed from: a */
    public void mo2868a(bnl bnl) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo2874b() {
        this.f21507t.onCaptureStartCommitted(this.f21486C, this.f21487D);
    }

    /* renamed from: w */
    final synchronized void m15796w() {
        if (this.f21513z != null) {
            iel.m3719a(this.f21513z, new gle(this), this.f21503p);
        } else {
            m15783b("Tried to delete but the future is null");
        }
    }

    /* renamed from: a */
    public void mo2869a(gft gft) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public void mo2880g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: x */
    final gsi m15797x() {
        return (gsi) jri.m13152b(this.f21490b);
    }

    /* renamed from: h */
    public final grg mo1482h() {
        return this.f21511x;
    }

    /* renamed from: y */
    final gtf m15798y() {
        return (gtf) jri.m13152b(this.f21491c);
    }

    /* renamed from: z */
    final hju m15799z() {
        return (hju) jri.m13152b(this.f21492d);
    }

    /* renamed from: A */
    final gev m15758A() {
        return (gev) jri.m13152b(this.f21493e);
    }

    /* renamed from: i */
    public final int mo2881i() {
        return this.f21500m;
    }

    /* renamed from: j */
    public final hec mo2882j() {
        return this.f21499l;
    }

    /* renamed from: k */
    public glw mo2883k() {
        return this.f21498k;
    }

    /* renamed from: B */
    final bls m15759B() {
        return (bls) jri.m13152b(this.f21489a);
    }

    /* renamed from: l */
    public final long mo2884l() {
        return this.f21510w;
    }

    /* renamed from: m */
    public goe mo2885m() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    public final String mo2886n() {
        return this.f21496i;
    }

    /* renamed from: C */
    final ird m15760C() {
        return (ird) jri.m13152b(this.f21494f);
    }

    /* renamed from: o */
    public final Uri mo2887o() {
        return this.f21506s;
    }

    /* renamed from: D */
    final kpk m15761D() {
        jri.m13152b(this.f21513z);
        return kny.m18046a(this.f21513z, gkw.f17013a, this.f21503p);
    }

    /* renamed from: E */
    final synchronized void m15762E() {
        if (this.f21513z == null) {
            this.f21513z = this.f21502o.mo1260a(this.f21510w, this.f21496i, this.f21498k, this.f21484A, ixx.JPEG);
        }
    }

    /* renamed from: a */
    final void m15777a(String str) {
        String toHexString = Integer.toHexString(hashCode());
        String s = mo3449s();
        String str2 = this.f21496i;
        int length = String.valueOf(toHexString).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str2).length()) + String.valueOf(str).length());
        stringBuilder.append("[");
        stringBuilder.append(toHexString);
        stringBuilder.append("|");
        stringBuilder.append(str2);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        bli.m869c(s, stringBuilder.toString());
        bls bls = this.f21489a;
        if (bls != null) {
            bls.mo562a(this.f21496i, str);
        }
    }

    /* renamed from: b */
    final void m15783b(String str) {
        String toHexString = Integer.toHexString(hashCode());
        String s = mo3449s();
        String str2 = this.f21496i;
        int length = String.valueOf(toHexString).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str2).length()) + String.valueOf(str).length());
        stringBuilder.append("[");
        stringBuilder.append(toHexString);
        stringBuilder.append("|");
        stringBuilder.append(str2);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        bli.m873e(s, stringBuilder.toString());
    }

    /* renamed from: b */
    final synchronized void m15781b(Bitmap bitmap, int i) {
        if (this.f21513z != null) {
            this.f21513z.mo1985a(new gla(this, bitmap, i), this.f21503p);
        }
    }

    /* renamed from: a */
    final synchronized void m15765a(Uri uri) {
        if (this.f21513z != null) {
            this.f21513z.mo1985a(new gkx(this, uri), this.f21503p);
        }
    }

    /* renamed from: b */
    final synchronized void m15782b(Uri uri) {
        if (this.f21513z != null) {
            this.f21513z.mo1985a(new glb(this, uri), this.f21503p);
        }
    }

    /* renamed from: a */
    public final synchronized void m15769a(Uri uri, List list) {
        if (this.f21513z != null) {
            this.f21513z.mo1985a(new gld(this, uri, list), this.f21503p);
        }
    }

    /* renamed from: a */
    final synchronized void m15768a(Uri uri, hec hec, boolean z) {
        if (this.f21513z != null) {
            this.f21513z.mo1985a(new glc(this, uri, hec, z), this.f21503p);
        }
    }

    /* renamed from: c */
    final synchronized void m15784c(Uri uri) {
        this.f21505r.m2642c(uri);
    }

    /* renamed from: a */
    private final synchronized void m15756a(Uri uri, int i) {
        if (this.f21513z != null) {
            this.f21513z.mo1985a(new gky(this, uri, i), this.f21503p);
        }
    }

    /* renamed from: a */
    private final synchronized void m15757a(Uri uri, hec hec) {
        if (this.f21513z != null) {
            this.f21513z.mo1985a(new gkz(this, uri, hec), this.f21503p);
        }
    }

    /* renamed from: a */
    final synchronized void m15766a(Uri uri, glw glw) {
        if (this.f21513z != null) {
            kny.m18046a(this.f21513z, new gkv(this, uri, glw), this.f21503p);
        }
    }

    /* renamed from: a */
    final synchronized void m15767a(Uri uri, glw glw, eqi eqi) {
        if (this.f21513z != null) {
            this.f21513z.mo1985a(new gku(this, uri, glw, eqi), this.f21503p);
        }
    }

    /* renamed from: a */
    public final void mo2862a(int i) {
        if (this.f21486C == 0) {
            this.f21486C = i;
        }
        this.f21487D = i;
    }

    /* renamed from: a */
    public void mo2865a(Location location) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final synchronized void mo2875b(int i) {
        if (!this.f21495h.m2611b()) {
            String toHexString = Integer.toHexString(hashCode());
            String s = mo3449s();
            String str = this.f21496i;
            int length = String.valueOf(toHexString).length();
            String str2 = "Ignoring setProgress. CaptureSession is not started.";
            StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str).length()) + String.valueOf(str2).length());
            stringBuilder.append("[");
            stringBuilder.append(toHexString);
            stringBuilder.append("|");
            stringBuilder.append(str);
            stringBuilder.append("] ");
            stringBuilder.append(str2);
            bli.m866b(s, stringBuilder.toString());
        } else if (i != 0) {
            int i2;
            boolean z = this.f21485B;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f21485B = i2 | z;
            this.f21500m = i;
            m15756a(this.f21506s, this.f21500m);
            gew gew = this.f21512y;
            if (gew != null) {
                gew.mo775a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo1480a(gew gew) {
        if (!hci.m11752a(this.f21499l)) {
            gew.mo776a(this.f21499l);
        }
        gew.mo775a(this.f21500m);
        this.f21512y = gew;
    }

    /* renamed from: a */
    public final synchronized void mo2871a(hec hec) {
        m15777a("setProgressMessage");
        if (this.f21495h.m2611b()) {
            this.f21499l = hec;
            if (!hci.m11752a(hec) && this.f21500m < 0) {
                this.f21500m = 0;
            }
            m15757a(this.f21506s, hec);
            gew gew = this.f21512y;
            if (gew != null) {
                gew.mo776a(hec);
            }
        } else {
            m15783b("Ignoring setProgressMessage. CaptureSession is not started.");
        }
    }

    /* renamed from: a */
    public final void mo2867a(anq anq, hec hec, glw glw) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo2873a(byte[] bArr, hec hec, glw glw) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: p */
    public void mo2888p() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo2866a(anq anq) {
        throw new UnsupportedOperationException();
    }
}

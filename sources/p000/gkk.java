package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import com.google.android.apps.camera.stats.Instrumentation;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: gkk */
public class gkk extends gkt {
    /* renamed from: F */
    private static final String f23251F = bli.m862a("BurstCaptureSession");
    /* renamed from: G */
    private final gtg f23252G;
    /* renamed from: H */
    private final gsl f23253H;
    /* renamed from: I */
    private final ContentResolver f23254I;
    /* renamed from: a */
    public final List f23255a = Collections.synchronizedList(new ArrayList());
    /* renamed from: b */
    public final iut f23256b;
    /* renamed from: c */
    public final gsx f23257c;
    /* renamed from: d */
    public final ixv f23258d;
    /* renamed from: e */
    public final BurstSessionStatistics f23259e;
    /* renamed from: f */
    public final irs f23260f;
    /* renamed from: g */
    public volatile boe f23261g;

    public gkk(ContentResolver contentResolver, glt glt, gmp gmp, eqa eqa, gsi gsi, gtf gtf, gsp gsp, gtg gtg, gsx gsx, gsl gsl, grg grg, bcv bcv, ixv ixv, ird ird, bls bls, hju hju, gnh gnh, irs irs, String str, kbg kbg, iut iut, long j, Executor executor, gev gev) {
        super(executor, gmp, glt, eqa, gsi, gtf, gsp, grg, bcv, ird, bls, gnh, str, kbg, j, hju, gev, new glv(false));
        this.f23256b = iut;
        this.f23252G = gtg;
        this.f23257c = gsx.mo1622a(str);
        this.f23253H = gsl;
        this.f23254I = contentResolver;
        this.f23258d = ixv;
        this.f23259e = (BurstSessionStatistics) Instrumentation.instance().burstStats().getCurrentSession();
        this.f23260f = irs;
        this.E = new gfu(this);
    }

    /* renamed from: a */
    public final void mo2868a(bnl bnl) {
        if (this.h.m2611b()) {
            if (bnl.mo543h()) {
                m17389b(bnl);
            }
            this.f23255a.add(bnl);
            return;
        }
        bnl.mo537a();
    }

    /* renamed from: a */
    public final void mo2861a() {
        this.h.m2608a(go.aZ, go.bb, mo3449s());
        m17386F();
        m15796w();
        Uri uri = this.f21506s;
        if (uri != null) {
            m15782b(uri);
        }
        gmq gmq = this.n;
        if (gmq != null) {
            this.f21508u.m2626b(gmq);
            this.n = null;
        }
        this.f21507t.onCaptureCanceled(this.C, this.D);
    }

    /* renamed from: c */
    public final gob mo2876c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo2877d() {
        this.h.m2608a(go.aZ, go.bb, mo3449s());
        m17386F();
        m15796w();
        m15782b(this.f21506s);
        this.f21507t.onCaptureDeleted();
    }

    /* renamed from: F */
    private final void m17386F() {
        String s;
        Set<File> hashSet = new HashSet();
        synchronized (this.f23255a) {
            for (bnl bnl : this.f23255a) {
                if (bnl.mo540d() != null) {
                    hashSet.add((File) jri.m13152b(bnl.mo540d().getParentFile()));
                }
            }
        }
        for (File file : hashSet) {
            try {
                s = mo3449s();
                String valueOf = String.valueOf(file);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
                stringBuilder.append("Deleting burst directory ");
                stringBuilder.append(valueOf);
                bli.m863a(s, stringBuilder.toString());
                this.f23253H.mo1618b(file);
            } catch (IOException e) {
                s = mo3449s();
                String valueOf2 = String.valueOf(file);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
                stringBuilder2.append("Error attempting to delete burst directory ");
                stringBuilder2.append(valueOf2);
                bli.m866b(s, stringBuilder2.toString());
            }
        }
    }

    /* renamed from: q */
    protected void mo3565q() {
    }

    /* renamed from: r */
    protected void mo3566r() {
    }

    /* renamed from: e */
    public final void mo2878e() {
        this.f21508u.m2626b(this.n);
        this.f21507t.onCaptureFinalized();
        mo3565q();
    }

    /* renamed from: f */
    public final void mo2879f() {
        this.h.m2608a(go.aZ, go.ba, mo3449s());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        grw grw = new grw();
        int size = this.f23255a.size();
        grw.m2768a(size, size);
        grw.m2767a(1000);
        BurstSessionStatistics burstSessionStatistics = this.f23259e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(grw.m2763a("DBSC", burstSessionStatistics.getScoredFrameCount()));
        grw.m2769b().f22423a = burstSessionStatistics.getAcquiredFrameCount();
        grw.m2769b().f22424b = (kma[]) arrayList.toArray(new kma[0]);
        grw.f5655a.f22417a = burstSessionStatistics.getBurstDurationS();
        grw.f5655a.f22418b = burstSessionStatistics.getBurstSavedFrameCount();
        this.f21503p.execute(new gkl(this, grw, elapsedRealtime));
    }

    /* renamed from: a */
    public final void mo1481a(hec hec, boolean z, String str) {
        String s = mo3449s();
        String valueOf = String.valueOf(str);
        String str2 = "Error persisting burst: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m866b(s, valueOf);
        m15768a(this.f21506s, hci.m11747a(), z);
    }

    /* renamed from: a */
    private final File m17387a(bnl bnl, gsx gsx, String str) {
        return this.f23252G.m2815a(gsx).m2811a(str, bnl.mo538b());
    }

    /* renamed from: k */
    public final glw mo2883k() {
        return this.k;
    }

    /* renamed from: s */
    String mo3449s() {
        return f23251F;
    }

    /* renamed from: t */
    protected void mo3567t() {
    }

    /* renamed from: u */
    final List m17406u() {
        gsq b = this.f21504q.mo1643b();
        synchronized (this.f23255a) {
            if (this.f23255a.isEmpty()) {
                throw new IllegalStateException("No burst images available to save!");
            }
            Object obj;
            Object obj2 = this.f23255a;
            List arrayList = new ArrayList(obj2);
            Collections.sort(arrayList, new gkm(this));
            List subList = arrayList.subList(0, Math.min(8, obj2.size()));
            if (subList.isEmpty()) {
                obj = null;
            } else {
                obj = (bnl) subList.get(0);
            }
            mo3567t();
            for (bnl bnl : this.f23255a) {
                boolean contains = subList.contains(bnl) ^ 1;
                m17388a(b, bnl, this.f23257c, bnl.equals(obj), contains);
            }
        }
        m17386F();
        mo2875b(100);
        return b.m2798a();
    }

    /* renamed from: a */
    private final synchronized void m17388a(gsq gsq, bnl bnl, gsx gsx, boolean z, boolean z2) {
        String a = bnl.mo536a(z, z2);
        ird C = m15760C();
        String valueOf = String.valueOf(a);
        String str = "Save ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        C.mo1903a(valueOf);
        try {
            File a2 = m17387a(bnl, gsx, a);
            String s = mo3449s();
            str = String.valueOf(a2);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 21) + String.valueOf(str).length());
            stringBuilder.append("Persisting image ");
            stringBuilder.append(a);
            stringBuilder.append(" to ");
            stringBuilder.append(str);
            bli.m863a(s, stringBuilder.toString());
            boe a3 = bnl.mo535a(this.f23253H, a2, z, z2);
            if (z) {
                this.f23261g = a3;
            } else if (a2.length() > 0) {
                gsq.m2799a(this.f23254I, a, this.f21510w, this.v, bnl.mo539c().f7326e, a2.getAbsolutePath(), bnl.mo544i(), bnl.mo542f(), bnl.mo538b());
            }
            m15760C().mo1904b();
        } catch (Throwable e) {
            bli.m867b(mo3449s(), String.format("Unable to persist image %s!", new Object[]{bnl}), e);
            m15760C().mo1904b();
        } catch (Throwable th) {
            m15760C().mo1904b();
        }
    }

    /* renamed from: b */
    private final synchronized void m17389b(bnl bnl) {
        String a = bnl.mo536a(false, false);
        String s;
        try {
            File a2 = m17387a(bnl, this.f23257c, a);
            s = mo3449s();
            String valueOf = String.valueOf(a2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
            stringBuilder.append("Persisting image without notification to ");
            stringBuilder.append(valueOf);
            bli.m863a(s, stringBuilder.toString());
            bnl.mo535a(this.f23253H, a2, false, false);
        } catch (IOException e) {
            String s2 = mo3449s();
            a = String.valueOf(a);
            s = "Error persisting image: ";
            if (a.length() == 0) {
                a = new String(s);
            } else {
                a = s.concat(a);
            }
            bli.m866b(s2, a);
        }
    }

    /* renamed from: a */
    public final kpk mo1479a(InputStream inputStream, glz glz) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo2872a(iqp iqp, glw glw) {
        m15760C().mo1903a("BurstCaptureSession#startEmpty");
        this.h.m2608a(go.aY, go.aZ, mo3449s());
        this.k = glw;
        mo3568v();
        mo3566r();
        this.m = -1;
        this.n = this.f21508u.m2621a(this.f21496i, iqp, this.f21510w, this.f21506s);
        m15762E();
        String s = mo3449s();
        String valueOf = String.valueOf(this.f21506s);
        String str = this.f21496i;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(str).length());
        stringBuilder.append("Starting empty with URI=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", TITLE=");
        stringBuilder.append(str);
        bli.m863a(s, stringBuilder.toString());
        m15766a(this.f21506s, this.k);
        this.f21507t.onCaptureStarted(this.k);
        m15760C().mo1904b();
    }

    /* renamed from: a */
    public final void mo2864a(Bitmap bitmap, int i) {
        bli.m863a(mo3449s(), "Updating burst capture indicator thumbnail");
        m15781b(bitmap, i);
        this.f21507t.onTinyThumb();
    }

    /* renamed from: a */
    public final void mo2863a(Bitmap bitmap) {
        if (!this.h.m2610a()) {
            jri.m13152b(this.n);
            bli.m863a(mo3449s(), "Updating burst thumbnail");
            this.f23259e.m8416h();
            this.f21508u.m2624a((gmq) jri.m13152b(this.n), bitmap);
            m15765a(this.f21506s);
            this.f21507t.onMediumThumb();
        }
    }

    /* renamed from: v */
    protected void mo3568v() {
        boolean z;
        if (this.k == glw.BURST) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
    }
}

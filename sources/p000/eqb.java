package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* renamed from: eqb */
public final class eqb implements eqa {
    /* renamed from: e */
    private static final String f15360e = bli.m862a("MediaStoreManager");
    /* renamed from: a */
    public final Uri f15361a;
    /* renamed from: b */
    public final ContentResolver f15362b;
    /* renamed from: c */
    public final eqm f15363c;
    /* renamed from: d */
    public final kpm f15364d;
    /* renamed from: f */
    private final gtf f15365f;
    /* renamed from: g */
    private final eqq f15366g;
    /* renamed from: h */
    private final kwk f15367h;
    /* renamed from: i */
    private final ird f15368i;

    eqb(Uri uri, ContentResolver contentResolver, gtf gtf, eqm eqm, eqq eqq, kwk kwk, ird ird, kpm kpm) {
        this.f15361a = uri;
        this.f15362b = contentResolver;
        this.f15365f = gtf;
        this.f15363c = eqm;
        this.f15366g = eqq;
        this.f15367h = kwk;
        this.f15368i = ird;
        this.f15364d = kpm;
    }

    /* renamed from: a */
    public final kpk mo1260a(long j, String str, glw glw, kpk kpk, ixx ixx) {
        this.f15368i.mo1903a("insertProcessingImage");
        File a = this.f15365f.m2811a(str, ixx);
        eqj eqj = (eqj) this.f15367h.mo345a();
        eqj.f4079a = a.getAbsolutePath();
        epv a2 = eqj.m2005a(j).m2004a();
        String str2 = f15360e;
        String valueOf = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 61);
        stringBuilder.append("insertProcessingImg: filePath=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" takenTime=");
        stringBuilder.append(j);
        bli.m863a(str2, stringBuilder.toString());
        kpk a3 = kny.m18045a(this.f15364d.mo2198a(new eqc(this, a2)), new eqd(this, j, str, glw, kpk), this.f15364d);
        this.f15368i.mo1904b();
        return a3;
    }

    /* renamed from: b */
    public final /* synthetic */ eqi mo1261b(long j, String str, glw glw, kpk kpk, ixx ixx) {
        this.f15368i.mo1903a("insertProcessingVideo");
        eqj eqj = (eqj) this.f15367h.mo345a();
        eqj.f4079a = this.f15365f.m2811a(str, ixx).getAbsolutePath();
        Uri insert = this.f15362b.insert(this.f15361a, eqj.m2005a(j).m2004a().f4066a);
        eqq eqq = this.f15366g;
        Object eqp = new eqp((ContentResolver) eqq.m2014a((ContentResolver) eqq.f4085a.mo345a(), 1), (Uri) eqq.m2014a((Uri) eqq.f4086b.mo345a(), 2), eqq.f4087c, (Uri) eqq.m2014a(insert, 4), j, (String) eqq.m2014a(str, 6), (glw) eqq.m2014a(glw, 7));
        kow.m13622a(kpk, eqp, kpq.f8410a);
        this.f15368i.mo1904b();
        return eqp;
    }

    /* renamed from: a */
    public final eql mo1259a(Uri uri, long j, String str, glw glw, kpk kpk) {
        this.f15368i.mo1903a("updateProcessingImage");
        jri.m13143a("content".equals(uri.getScheme()));
        Object a = this.f15363c.m2007a(uri, j, str, glw);
        kow.m13622a(kpk, a, kpq.f8410a);
        this.f15368i.mo1904b();
        return a;
    }
}

package p000;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: coy */
public final class coy implements hfz {
    /* renamed from: a */
    public static final String f12446a = bli.m862a("CameraDataAdapter");
    /* renamed from: b */
    public final cpw f12447b = new cpw();
    /* renamed from: c */
    public final Context f12448c;
    /* renamed from: d */
    public final aws f12449d;
    /* renamed from: e */
    public final cqm f12450e;
    /* renamed from: f */
    public final cqx f12451f;
    /* renamed from: g */
    public final gsp f12452g;
    /* renamed from: h */
    public final cqf f12453h;
    /* renamed from: i */
    public crb f12454i;
    /* renamed from: j */
    public cqc f12455j;
    /* renamed from: k */
    public long f12456k = -1;
    /* renamed from: l */
    public final ird f12457l;
    /* renamed from: m */
    public cqo f12458m;
    /* renamed from: n */
    public AtomicBoolean f12459n;
    /* renamed from: o */
    private final ExecutorService f12460o;
    /* renamed from: p */
    private int f12461p = 1600;
    /* renamed from: q */
    private int f12462q = 1600;
    /* renamed from: r */
    private err f12463r;
    /* renamed from: s */
    private final ikd f12464s;
    /* renamed from: t */
    private final crj f12465t;

    static {
        bsb bsb = new bsb("camera.partial_load");
    }

    public coy(Context context, aws aws, cqm cqm, cqx cqx, gsp gsp, cqf cqf, ird ird, ExecutorService executorService, ikd ikd, bsn bsn, crj crj) {
        this.f12448c = context;
        this.f12449d = aws;
        this.f12450e = cqm;
        this.f12451f = cqx;
        this.f12452g = gsp;
        this.f12453h = cqf;
        this.f12457l = ird;
        this.f12460o = executorService;
        this.f12464s = ikd;
        this.f12454i = new crb();
        this.f12465t = crj;
        this.f12459n = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public final void mo1006a(csj csj) {
        boolean z;
        String str = f12446a;
        String valueOf = String.valueOf(csj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder.append("adding filmstrip data listener: ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        cpw cpw = this.f12447b;
        int size = cpw.f12509a.size();
        int i = cpw.f12510b;
        if (size < i) {
            z = true;
        } else {
            z = false;
        }
        stringBuilder = new StringBuilder(72);
        stringBuilder.append("More listeners added than is allowed in configured capacity: ");
        stringBuilder.append(i);
        jri.m13154b(z, stringBuilder.toString());
        cpw.f12509a.add(csj);
        if (this.f12454i.f2583d.f2576c != 0) {
            csj.mo665a();
        }
    }

    /* renamed from: a */
    public final boolean mo1009a(err err, boolean z) {
        jri.m13152b((Object) err);
        String str = f12446a;
        String valueOf = String.valueOf(err);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
        stringBuilder.append("addOrUpdate ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        Uri uri = err.mo1033g().f4155h;
        int a = mo997a(uri);
        if (a != crb.f2579a) {
            String str2 = f12446a;
            str = String.valueOf(uri);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 22);
            stringBuilder2.append("found duplicate data: ");
            stringBuilder2.append(str);
            bli.m871d(str2, stringBuilder2.toString());
            m8535a(a, err);
            return false;
        }
        m8527a(err);
        return true;
    }

    /* renamed from: a */
    public final void mo1008a(List list) {
        for (AsyncTask asyncTask : list) {
            if (asyncTask != null) {
                asyncTask.cancel(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo1002a() {
        m8538a(new crb());
        this.f12447b.mo665a();
    }

    /* renamed from: b */
    public final boolean mo1015b() {
        if (this.f12463r == null) {
            return false;
        }
        new cpg().execute(new err[]{this.f12463r});
        this.f12463r = null;
        return true;
    }

    /* renamed from: a */
    public final int mo997a(Uri uri) {
        return this.f12454i.m1427b(uri);
    }

    /* renamed from: b */
    public final cre mo1011b(Uri uri) {
        return this.f12454i.m1425a(uri);
    }

    /* renamed from: c */
    public final int mo1016c() {
        return this.f12454i.f2583d.f2576c;
    }

    /* renamed from: a */
    public final err mo1000a(int i) {
        return m8528g(i);
    }

    /* renamed from: b */
    public final cre mo1010b(int i) {
        return mo1020d(i);
    }

    /* renamed from: a */
    public final int mo998a(cre cre) {
        return mo997a(cre.mo1066e().mo1033g().f4155h);
    }

    /* renamed from: g */
    private final err m8528g(int i) {
        if (i >= 0) {
            crb crb = this.f12454i;
            if (i < crb.f2583d.f2576c) {
                return crb.m1424a(i).mo1066e();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final int mo1017c(int i) {
        if (i >= 0) {
            crb crb = this.f12454i;
            if (i < crb.f2583d.f2576c) {
                return crb.m1424a(i).mo1066e().mo1048e() - 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final List mo1001a(int i, int i2) {
        List arrayList = new ArrayList();
        for (int max = Math.max(0, i); max < i2; max++) {
            arrayList.add(Integer.valueOf(max));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final cre mo1020d(int i) {
        return this.f12454i.m1424a(i);
    }

    /* renamed from: d */
    public final int mo1019d() {
        return this.f12454i.f2583d.f2576c;
    }

    /* renamed from: a */
    public final View mo999a(View view, cre cre, cpx cpx) {
        jri.m13152b((Object) cre);
        if (cre == cre.f2587c) {
            return null;
        }
        err e = cre.mo1066e();
        e.mo1031b(this.f12461p, this.f12462q);
        return e.mo1041a(kbg.m4744b(view), this, false, cpx);
    }

    /* renamed from: a */
    private final void m8527a(err err) {
        jri.m13152b((Object) err);
        cre a = this.f12454i.m1426a(err);
        int b = this.f12454i.m1427b(a.mo1066e().mo1033g().f4155h);
        cpd cpd = new cpd();
        err.mo1039m();
        this.f12447b.mo666a(b, a);
    }

    /* renamed from: e */
    public final boolean mo1023e(int i) {
        if (i >= 0) {
            crb crb = this.f12454i;
            if (i < crb.f2583d.f2576c) {
                return crb.m1424a(i).mo1066e().mo1037k().f4114b.f4115a;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final List mo1012b(List list) {
        List arrayList = new ArrayList();
        for (Integer num : list) {
            if (!mo1023e(num.intValue())) {
                arrayList.add(mo1024f(num.intValue()));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo1018c(Uri uri) {
        m8526a(uri, kpq.f8410a, kpq.f8410a);
    }

    /* renamed from: d */
    public final void mo1021d(Uri uri) {
        m8526a(uri, this.f12460o, this.f12464s);
    }

    /* renamed from: a */
    private final void m8526a(Uri uri, Executor executor, Executor executor2) {
        ikd.m12259a();
        int a = mo997a(uri);
        if (a != crb.f2579a) {
            err e = this.f12454i.m1424a(a).mo1066e();
            e.getClass();
            jli.m12939a(executor, new coz(e)).mo1973a(executor2, new cpb(this, uri));
        }
    }

    /* renamed from: b */
    public final void mo1014b(cre cre) {
        err e = cre.mo1066e();
        int a = mo998a(cre);
        cre.mo1065d();
        mo1015b();
        if (!e.mo1032f().m2076e()) {
            this.f12463r = e;
        }
        this.f12447b.mo668b(a, cre);
    }

    /* renamed from: a */
    final void m8538a(crb crb) {
        if (crb.f2583d.f2576c != 0 || this.f12454i.f2583d.f2576c != 0) {
            this.f12454i = crb;
            String str = f12446a;
            int i = crb.f2583d.f2576c;
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("Replacing filmstrip item list with new list of size: ");
            stringBuilder.append(i);
            bli.m869c(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void mo1007a(iqb iqb) {
        this.f12459n.set(true);
        bli.m863a(f12446a, "resetPartialLoading");
        Object crb = new crb();
        crj crj = this.f12465t;
        crj.f12575g.set(true);
        crj.f12576h.set(false);
        crj.f12579k = (crb) jri.m13152b(crb);
        crj.f12579k.f2581b = crj;
        jri.m13152b((Object) this);
        kpk d = kpw.m18056d();
        crj.f12577i.execute(new crk(crj, d));
        kow.m13622a(d, new cpe(this, crb, iqb), kpq.f8410a);
    }

    /* renamed from: e */
    public final kpk mo1022e() {
        kpk d = kpw.m18056d();
        new cph(this, this.f12456k, d).execute(new Void[0]);
        return d;
    }

    /* renamed from: f */
    public final void mo1025f() {
        cpj cpj = new cpj(this);
        cpj.execute(new crb[]{this.f12454i});
        this.f12449d.mo373a().mo1879a(new cpa(cpj));
    }

    /* renamed from: a */
    public final void mo1004a(cqo cqo) {
        this.f12454i.m1426a((err) cqo);
        this.f12458m = cqo;
    }

    /* renamed from: a */
    public final void mo1003a(cqc cqc) {
        this.f12455j = cqc;
    }

    /* renamed from: b */
    public final void mo1013b(int i, int i2) {
        this.f12461p = i;
        this.f12462q = i2;
    }

    /* renamed from: g */
    public final boolean mo1026g() {
        err err = this.f12463r;
        if (err == null) {
            return false;
        }
        this.f12463r = null;
        m8527a(err);
        return true;
    }

    /* renamed from: a */
    public final void m8535a(int i, err err) {
        mo1005a(this.f12454i.m1424a(i), err);
    }

    /* renamed from: f */
    public final AsyncTask mo1024f(int i) {
        return m8525a(m8528g(i).mo1033g().f4155h, false);
    }

    /* renamed from: a */
    private final AsyncTask m8525a(Uri uri, boolean z) {
        AsyncTask cpi = new cpi(this, z);
        cpi.execute(new Uri[]{uri});
        return cpi;
    }

    /* renamed from: a */
    public final void mo1005a(cre cre, err err) {
        jri.m13152b((Object) err);
        if (!cov.m8503a(err)) {
            cre.mo1061a(err);
            cpc cpc = new cpc();
            err.mo1039m();
            m8525a(err.mo1033g().f4155h, true);
        }
    }
}

package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: dnl */
public final class dnl extends doc {
    /* renamed from: c */
    public static final String f21132c = bli.m862a("StateReviewVid");
    /* renamed from: d */
    public bgl f21133d;
    /* renamed from: e */
    public kbg f21134e;
    /* renamed from: f */
    private djo f21135f = ((doa) m991d()).f13626s;

    public dnl(doc doc, bgl bgl) {
        super((bug) doc);
        this.f21133d = bgl;
        m988a(dbd.class, new dnm());
        m988a(dbe.class, new dnn(this));
        m988a(dls.class, new dno(this));
        m988a(dbi.class, new dnp(this));
        m988a(dlr.class, new dnq(this));
        m988a(dbc.class, new dns(this));
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2971e();
    }

    /* renamed from: e */
    public final doc mo2971e() {
        this.f21134e = ((doa) m991d()).f13604I;
        if (!this.f21134e.mo2084b()) {
            djo djo = this.f21135f;
            bgl bgl = this.f21133d;
            eqt a = new eqt(djo.f3105b).m2020a(bgl.f1133a.getName());
            a.f4089a = bgl.f1133a;
            a = a.m2021b(bgl.f1138f).m2017a(bgl.f1137e).m2019a(bgl.m814b()).m2018a(bgl.f1134b.mo1897g().m3881c());
            a.f4090b = bgl.f1135c;
            epv a2 = a.m2016a();
            this.f21134e = kbg.m4744b(djo.f3104a.insert(Uri.parse("content://media/external/video/media"), a2.f4066a));
            ((doa) m991d()).m9188a((Uri) this.f21134e.mo2081a());
        }
        m15466f();
        ((doa) m991d()).f13609b.f3124c.f21086a.setVisibility(0);
        irs irs = ((doa) m991d()).f13600E;
        String name = this.f21133d.f1133a.getName();
        iut a3 = ((doa) m991d()).f13615h.m1694a();
        iqp c = this.f21133d.f1134b.mo1897g().m3881c();
        bgl bgl2 = this.f21133d;
        irs.mo1593a(true, name, a3, c, bgl2.f1137e, bgl2.f1133a.length(), (float) this.f21133d.m813a(), this.f21133d.f1136d, ((doa) m991d()).f13617j.m1641a(), ((doa) m991d()).f13617j.m1644b(), this.f21133d.f1139g);
        return null;
    }

    /* renamed from: c */
    public final void mo2953c() {
        ((doa) m991d()).f13614g.mo1449g();
    }

    /* renamed from: f */
    final void m15466f() {
        Throwable e;
        try {
            Bitmap a = aqe.m578a(((doa) m991d()).f13622o.openFileDescriptor((Uri) this.f21134e.mo2081a(), "r").getFileDescriptor(), this.f21133d.f1134b.mo1897g().m3881c().f7329a);
            dlj dlj = ((doa) m991d()).f13609b.f3124c;
            dlj.f21086a.setImageBitmap(a);
            dlj.f21086a.setVisibility(0);
            return;
        } catch (FileNotFoundException e2) {
            e = e2;
        } catch (SecurityException e3) {
            e = e3;
        }
        bli.m867b(f21132c, "Error showing review image", e);
    }
}

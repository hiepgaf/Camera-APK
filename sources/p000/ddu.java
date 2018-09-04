package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: ddu */
public final class ddu extends dbx {
    /* renamed from: c */
    public final iqo f20949c;
    /* renamed from: d */
    public Bitmap f20950d;
    /* renamed from: e */
    public final boolean f20951e;
    /* renamed from: f */
    public kbg f20952f;
    /* renamed from: g */
    public boolean f20953g;
    /* renamed from: h */
    private final glq f20954h = new ddw(this);

    public ddu(dbx dbx, Bitmap bitmap, kbg kbg, boolean z, bco bco) {
        super((bug) dbx);
        this.f20950d = bitmap;
        this.f20952f = kbg;
        this.f20951e = z;
        this.f20949c = bco;
        this.f20953g = false;
        m988a(dbd.class, new ddv());
        m988a(dbe.class, new ddx(this));
        m988a(dbf.class, new ddy(this));
        m988a(dbi.class, new ddz(this));
        m988a(dbh.class, new dea(this));
        m988a(dba.class, new dec(this));
        m988a(dbb.class, new dee(this));
        m988a(dau.class, new def(this));
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2952e();
    }

    /* renamed from: e */
    public final dbx mo2952e() {
        ((dbu) m991d()).mo2918Q().m2639a(this.f20954h);
        m15369a(this.f20950d);
        return null;
    }

    /* renamed from: c */
    public final void mo2953c() {
        ((dbu) m991d()).mo2918Q().m2641b(this.f20954h);
    }

    /* renamed from: a */
    final void m15369a(Bitmap bitmap) {
        this.f20950d = bitmap;
        ((dbu) m991d()).mo2908G().execute(new deg(this));
    }
}

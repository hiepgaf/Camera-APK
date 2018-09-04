package p000;

import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: atd */
public final class atd implements atc, iqo {
    /* renamed from: a */
    public final bpt f10202a;
    /* renamed from: b */
    public final fbg f10203b;
    /* renamed from: c */
    public final kpw f10204c = kpw.m18056d();
    /* renamed from: d */
    public final kpw f10205d = kpw.m18056d();
    /* renamed from: e */
    public final OnClickListener f10206e = new ate(this);
    /* renamed from: f */
    private final iqo f10207f;
    /* renamed from: g */
    private boolean f10208g;
    /* renamed from: h */
    private final OnClickListener f10209h = new atf(this);

    public atd(bpt bpt, bps bps, fbg fbg) {
        this.f10202a = bpt;
        this.f10203b = fbg;
        bpt.m937a(this.f10209h);
        this.f10207f = bps.f1416b.mo2859a(new atg(this), kpq.f8410a);
    }

    public final void close() {
        if (!this.f10208g) {
            this.f10208g = true;
            this.f10207f.close();
            this.f10202a.m937a(null);
            if (!this.f10204c.isDone()) {
                this.f10204c.mo3557a(Boolean.valueOf(false));
            }
            if (!this.f10205d.isDone()) {
                this.f10205d.mo3557a(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: a */
    public final kpk mo351a() {
        return this.f10204c;
    }

    /* renamed from: b */
    public final kpk mo352b() {
        return this.f10205d;
    }
}

package p000;

import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: cwz */
public final class cwz implements cwy {
    /* renamed from: a */
    public static final String f12758a = bli.m862a("CptrCamDvOpener");
    /* renamed from: b */
    public ikb f12759b;
    /* renamed from: c */
    public kpk f12760c;
    /* renamed from: d */
    public fbj f12761d;
    /* renamed from: e */
    public czg f12762e;
    /* renamed from: f */
    public cwc f12763f;
    /* renamed from: g */
    public ffc f12764g;
    /* renamed from: h */
    private final ise f12765h;
    /* renamed from: i */
    private final czb f12766i;
    /* renamed from: j */
    private final fbn f12767j;
    /* renamed from: k */
    private final gjk f12768k;
    /* renamed from: l */
    private final hek f12769l;
    /* renamed from: m */
    private final hjf f12770m;
    /* renamed from: n */
    private final bsn f12771n;
    /* renamed from: o */
    private final Runnable f12772o = new cxb(this);

    public cwz(ise ise, czb czb, fbn fbn, gjk gjk, hek hek, hjf hjf, bsn bsn) {
        this.f12765h = ise;
        this.f12766i = czb;
        this.f12767j = fbn;
        this.f12768k = gjk;
        this.f12769l = hek;
        this.f12770m = hjf;
        this.f12771n = bsn;
        this.f12759b = ise.m4140b();
    }

    /* renamed from: a */
    public final cwi mo1114a(dzh dzh, czg czg) {
        jri.m13152b((Object) czg);
        cwi cwi = new cwi(this.f12772o);
        this.f12763f = this.f12766i.m1553a(bmt.m894a(this.f12767j, this.f12770m, dzh.m1696b()));
        this.f12762e = czg;
        cwc cwc = this.f12763f;
        this.f12759b.close();
        ikb b = this.f12765h.m4140b();
        this.f12759b = b;
        this.f12764g = this.f12767j.m10176b(cwc.f2815a);
        bcl bcl = (bcl) b.mo1879a(new bcl());
        this.f12760c = this.f12762e.m1559a(cwc, kow.m13617a(this.f12769l), this.f12768k, new etg(false));
        kow.m13622a(this.f12760c, new cxa(this, bcl, cwi, b), Executors.newSingleThreadExecutor(iel.m3721c("CCDevMngr", 0)));
        return cwi;
    }
}

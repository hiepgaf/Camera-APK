package p000;

import android.view.Surface;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bgo */
final class bgo implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f10783a;
    /* renamed from: b */
    private final /* synthetic */ ios f10784b;
    /* renamed from: c */
    private final /* synthetic */ bhs f10785c;
    /* renamed from: d */
    private final /* synthetic */ bhr f10786d;
    /* renamed from: e */
    private final /* synthetic */ bhu f10787e;
    /* renamed from: f */
    private final /* synthetic */ Surface f10788f;
    /* renamed from: g */
    private final /* synthetic */ ffc f10789g;
    /* renamed from: h */
    private final /* synthetic */ ilb f10790h;
    /* renamed from: i */
    private final /* synthetic */ ilb f10791i;
    /* renamed from: j */
    private final /* synthetic */ ilp f10792j;
    /* renamed from: k */
    private final /* synthetic */ imw f10793k;
    /* renamed from: l */
    private final /* synthetic */ ilp f10794l;
    /* renamed from: m */
    private final /* synthetic */ ilb f10795m;
    /* renamed from: n */
    private final /* synthetic */ kwk f10796n;
    /* renamed from: o */
    private final /* synthetic */ bhl f10797o;
    /* renamed from: p */
    private final /* synthetic */ ilp f10798p;
    /* renamed from: q */
    private final /* synthetic */ ilp f10799q;
    /* renamed from: r */
    private final /* synthetic */ ilp f10800r;
    /* renamed from: s */
    private final /* synthetic */ iqt f10801s;
    /* renamed from: t */
    private final /* synthetic */ fiw f10802t;
    /* renamed from: u */
    private final /* synthetic */ bgm f10803u;

    bgo(bgm bgm, kpw kpw, ios ios, bhs bhs, bhr bhr, bhu bhu, Surface surface, ffc ffc, ilb ilb, ilb ilb2, ilp ilp, imw imw, ilp ilp2, ilp ilp3, ilb ilb3, kwk kwk, bhl bhl, ilp ilp4, ilp ilp5, ilp ilp6, iqt iqt, fiw fiw) {
        this.f10803u = bgm;
        this.f10783a = kpw;
        this.f10784b = ios;
        this.f10785c = bhs;
        this.f10786d = bhr;
        this.f10787e = bhu;
        this.f10788f = surface;
        this.f10789g = ffc;
        this.f10790h = ilb;
        this.f10791i = ilb2;
        this.f10792j = ilp;
        this.f10793k = imw;
        this.f10794l = ilp2;
        this.f10795m = ilb3;
        this.f10796n = kwk;
        this.f10797o = bhl;
        this.f10798p = ilp4;
        this.f10799q = ilp5;
        this.f10800r = ilp6;
        this.f10801s = iqt;
        this.f10802t = fiw;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        String str = bgm.f20018a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 55);
        stringBuilder.append("CamcorderCaptureSession-initialization sequence fails: ");
        stringBuilder.append(valueOf);
        bli.m869c(str, stringBuilder.toString());
        this.f10783a.m17780a(th);
    }

    public final /* synthetic */ void b_(Object obj) {
        bhj bhj = (bhj) obj;
        if (bhj != null) {
            synchronized (this.f10803u.f20030m) {
                bli.m869c(bgm.f20018a, "Preview-starting task is done successfully.");
                boolean z = this.f10803u.f20032o;
                if (z) {
                    bli.m873e(bgm.f20018a, "CamcorderDevice has been closed.");
                    this.f10784b.close();
                    this.f10783a.mo3557a(kau.f19138a);
                    return;
                }
                bhe bie;
                jri.m13153b(z ^ 1);
                jri.m13152b(this.f10784b);
                jri.m13152b(this.f10785c);
                bic bic = new bic(this.f10786d, this.f10787e, this.f10803u.f20022e, this.f10788f);
                bgw bgx = new bgx(this.f10786d, this.f10787e, this.f10803u.f20022e, this.f10789g, new fdy(), this.f10790h, this.f10791i, this.f10792j);
                if (this.f10793k.mo1887d()) {
                    bgw bgw = bgx;
                    bie = new bie(bgw, this.f10803u.f20028k, new ikp(iel.m3723e("CamcorderEx", 1), 2, TimeUnit.SECONDS), this.f10790h, this.f10791i, this.f10794l, this.f10792j, this.f10795m, (aug) this.f10796n.mo345a());
                } else {
                    bie = new bhf(bgx, new ikp(iel.m3723e("CamcorderEx", 1), 8, TimeUnit.SECONDS), this.f10790h, this.f10791i);
                }
                this.f10803u.f20029l.mo1903a(String.valueOf(bgm.f20018a).concat("#CamcorderCaptureSessionImpl"));
                Object obj2 = this.f10803u;
                obj2.f20031n = new bem(obj2, bie, obj2.f20019b, this.f10797o, obj2.f20020c, obj2.f20021d, obj2.f20023f, this.f10798p, this.f10799q, obj2.f20024g, obj2.f20025h, this.f10800r, obj2.f20026i, obj2.f20027j, bic, this.f10788f, this.f10801s, bhj, this.f10785c, this.f10784b, this.f10802t);
                this.f10803u.f20029l.mo1904b();
                this.f10783a.mo3557a(kbg.m4745c(this.f10803u.f20031n));
                return;
            }
        }
        bli.m873e(bgm.f20018a, "Preview-starting task is failed.");
        this.f10783a.mo3557a(kau.f19138a);
    }
}

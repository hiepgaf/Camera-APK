package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jgz */
class jgz implements jgx {
    /* renamed from: a */
    public final int f18781a;
    /* renamed from: b */
    public final kpk f18782b;
    /* renamed from: c */
    public final kpk f18783c;
    /* renamed from: d */
    public final kpk f18784d;
    /* renamed from: e */
    public final kpk f18785e;
    /* renamed from: f */
    public final kpw f18786f;
    /* renamed from: g */
    public final kpw f18787g;
    /* renamed from: h */
    public final kpw f18788h;
    /* renamed from: i */
    public final List f18789i = new ArrayList();
    /* renamed from: j */
    private final List f18790j = new ArrayList();
    /* renamed from: k */
    private final List f18791k = new ArrayList();
    /* renamed from: l */
    private final List f18792l = new ArrayList();
    /* renamed from: m */
    private final List f18793m = new ArrayList();
    /* renamed from: n */
    private final Executor f18794n;
    /* renamed from: o */
    private final boolean f18795o;
    /* renamed from: p */
    private boolean f18796p;

    public jgz(kpk kpk, kpk kpk2, kpk kpk3, kpk kpk4, boolean z, Executor executor) {
        this.f18782b = kpk;
        this.f18783c = kpk2;
        this.f18784d = kpk3;
        this.f18785e = kpk4;
        this.f18781a = 0;
        this.f18795o = z;
        this.f18794n = executor;
        this.f18786f = kpw.m18056d();
        this.f18787g = kpw.m18056d();
        this.f18788h = kpw.m18056d();
    }

    /* renamed from: a */
    public final synchronized jhf mo1292a(jhe jhe) {
        jhf jhg;
        if (this.f18796p) {
            throw new IllegalStateException("Muxer already started. No tracks can be added now.");
        }
        kpk d = kpw.m18056d();
        this.f18791k.add(jhe.f7832a);
        this.f18789i.add(new jha(this, jhe, d));
        jhg = new jhg(d, this.f18786f, this.f18787g, jhe, this.f18794n);
        this.f18793m.add(jhg.f18801e);
        this.f18790j.add(jhg.f18800d);
        this.f18792l.add(jhg);
        if (this.f18795o) {
            jhg = jgn.m12825a(jhg);
        }
        return jhg;
    }

    /* renamed from: a */
    public final synchronized void mo1293a() {
        if (this.f18796p) {
            throw new IllegalStateException("Muxer already started. Cannot call start twice.");
        }
        this.f18796p = true;
        kow.m13621a(this.f18782b, this.f18783c, this.f18784d, this.f18785e).mo1985a(new jhb(this), this.f18794n);
        Iterable c = khb.m4895c(this.f18791k);
        c.addAll(this.f18793m);
        kpk a = kow.m13616a(c);
        a.mo1985a(new jhc(this, a), this.f18794n);
        kow.m13616a(this.f18790j).mo1985a(new jhd(this), this.f18794n);
    }

    /* renamed from: b */
    public final kpk mo1294b() {
        return this.f18788h;
    }
}

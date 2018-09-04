package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: afy */
public final class afy implements afe, ary {
    /* renamed from: t */
    private static final afz f9710t = new afz();
    /* renamed from: u */
    private static final Handler f9711u = new Handler(Looper.getMainLooper(), new aga());
    /* renamed from: a */
    public final List f9712a;
    /* renamed from: b */
    public final asa f9713b;
    /* renamed from: c */
    public final iw f9714c;
    /* renamed from: d */
    public final agb f9715d;
    /* renamed from: e */
    public final aie f9716e;
    /* renamed from: f */
    public adl f9717f;
    /* renamed from: g */
    public boolean f9718g;
    /* renamed from: h */
    public boolean f9719h;
    /* renamed from: i */
    public boolean f9720i;
    /* renamed from: j */
    public boolean f9721j;
    /* renamed from: k */
    public agn f9722k;
    /* renamed from: l */
    public adf f9723l;
    /* renamed from: m */
    public boolean f9724m;
    /* renamed from: n */
    public agg f9725n;
    /* renamed from: o */
    public boolean f9726o;
    /* renamed from: p */
    public List f9727p;
    /* renamed from: q */
    public age f9728q;
    /* renamed from: r */
    public afd f9729r;
    /* renamed from: s */
    public volatile boolean f9730s;
    /* renamed from: v */
    private final aie f9731v;
    /* renamed from: w */
    private final aie f9732w;
    /* renamed from: x */
    private final aie f9733x;

    afy(aie aie, aie aie2, aie aie3, aie aie4, agb agb, iw iwVar) {
        this(aie, aie2, aie3, aie4, agb, iwVar, (byte) 0);
    }

    private afy(aie aie, aie aie2, aie aie3, aie aie4, agb agb, iw iwVar, byte b) {
        this.f9712a = new ArrayList(2);
        this.f9713b = asa.m667a();
        this.f9716e = aie;
        this.f9731v = aie2;
        this.f9732w = aie3;
        this.f9733x = aie4;
        this.f9715d = agb;
        this.f9714c = iwVar;
    }

    /* renamed from: a */
    public final void m6395a(aqh aqh) {
        arq.m653a();
        this.f9713b.mo344b();
        if (this.f9724m) {
            aqh.mo322a(this.f9728q, this.f9723l);
        } else if (this.f9726o) {
            aqh.mo321a(this.f9725n);
        } else {
            this.f9712a.add(aqh);
        }
    }

    /* renamed from: b */
    public final aie m6396b() {
        if (this.f9719h) {
            return this.f9732w;
        }
        if (this.f9720i) {
            return this.f9733x;
        }
        return this.f9731v;
    }

    /* renamed from: a */
    public final asa mo39a() {
        return this.f9713b;
    }

    /* renamed from: b */
    final boolean m6397b(aqh aqh) {
        List list = this.f9727p;
        return list != null && list.contains(aqh);
    }

    /* renamed from: a */
    public final void mo53a(agg agg) {
        this.f9725n = agg;
        f9711u.obtainMessage(2, this).sendToTarget();
    }

    /* renamed from: a */
    public final void mo54a(agn agn, adf adf) {
        this.f9722k = agn;
        this.f9723l = adf;
        f9711u.obtainMessage(1, this).sendToTarget();
    }

    /* renamed from: a */
    public final void mo52a(afd afd) {
        m6396b().execute(afd);
    }
}

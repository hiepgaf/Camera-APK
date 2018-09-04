package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kct */
abstract class kct extends kcp implements kgx {
    /* renamed from: a */
    private final Comparator f22009a;
    /* renamed from: b */
    private transient kgx f22010b;

    kct() {
        this(kgc.f19196a);
    }

    /* renamed from: h */
    abstract Iterator mo3527h();

    kct(Comparator comparator) {
        this.f22009a = (Comparator) jri.m13152b((Object) comparator);
    }

    /* renamed from: a */
    public Comparator mo3216a() {
        return this.f22009a;
    }

    /* renamed from: b */
    final /* synthetic */ Set mo3218b() {
        return new kha(this);
    }

    /* renamed from: i */
    public kgx mo3219i() {
        kgx kgx = this.f22010b;
        if (kgx != null) {
            return kgx;
        }
        kgx = new kcu(this);
        this.f22010b = kgx;
        return kgx;
    }

    /* renamed from: j */
    public NavigableSet mo3220j() {
        return (NavigableSet) super.mo2112e();
    }

    /* renamed from: e */
    public /* synthetic */ Set mo2112e() {
        return mo3220j();
    }

    /* renamed from: k */
    public kfu mo3221k() {
        Iterator f = mo3526f();
        return f.hasNext() ? (kfu) f.next() : null;
    }

    /* renamed from: l */
    public kfu mo3222l() {
        Iterator h = mo3527h();
        return h.hasNext() ? (kfu) h.next() : null;
    }

    /* renamed from: m */
    public kfu mo3223m() {
        Iterator f = mo3526f();
        if (!f.hasNext()) {
            return null;
        }
        kfu kfu = (kfu) f.next();
        kfu = khb.m4891b(kfu.mo3240b(), kfu.mo3239a());
        f.remove();
        return kfu;
    }

    /* renamed from: n */
    public kfu mo3224n() {
        Iterator h = mo3527h();
        if (!h.hasNext()) {
            return null;
        }
        kfu kfu = (kfu) h.next();
        kfu = khb.m4891b(kfu.mo3240b(), kfu.mo3239a());
        h.remove();
        return kfu;
    }

    /* renamed from: a */
    public kgx mo3217a(Object obj, kcy kcy, Object obj2, kcy kcy2) {
        jri.m13152b((Object) kcy);
        jri.m13152b((Object) kcy2);
        return mo3508b(obj, kcy).mo3507a(obj2, kcy2);
    }
}

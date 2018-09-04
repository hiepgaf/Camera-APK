package p000;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: dqf */
public final class dqf implements fbj {
    /* renamed from: f */
    private static final AtomicInteger f21151f = new AtomicInteger(0);
    /* renamed from: a */
    public final ikb f21152a;
    /* renamed from: b */
    public final ikv f21153b;
    /* renamed from: c */
    public final kpk f21154c;
    /* renamed from: d */
    public final iqz f21155d;
    /* renamed from: e */
    public kpk f21156e;
    /* renamed from: g */
    private final AtomicBoolean f21157g = new AtomicBoolean(false);
    /* renamed from: h */
    private final dqn f21158h;
    /* renamed from: i */
    private final asn f21159i;
    /* renamed from: j */
    private final fva f21160j;
    /* renamed from: k */
    private final fbp f21161k;
    /* renamed from: l */
    private final Executor f21162l;

    public dqf(ikb ikb, ikv ikv, ikd ikd, fvy fvy, bpn bpn, asn asn, kpk kpk, ilp ilp, ilp ilp2, fva fva, ilp ilp3, ilp ilp4, ilp ilp5, fcm fcm, iqz iqz, Executor executor, ilp ilp6) {
        this.f21152a = ikb;
        this.f21153b = ikv;
        this.f21159i = asn;
        this.f21154c = kpk;
        this.f21160j = fva;
        this.f21158h = new dqn(fvy, ikd, bpn);
        int incrementAndGet = f21151f.incrementAndGet();
        StringBuilder stringBuilder = new StringBuilder(21);
        stringBuilder.append("OneCamera-");
        stringBuilder.append(incrementAndGet);
        this.f21155d = iqz.mo512a(stringBuilder.toString());
        this.f21162l = executor;
        this.f21156e = null;
        this.f21161k = new fbp(fvy, ilp2, fcm.f15862a, ilp, ilp3, ilp4, ilp5, ilp6);
        this.f21155d.mo518d("OneCamera created.");
    }

    public final void close() {
        if (this.f21157g.compareAndSet(false, true)) {
            this.f21162l.execute(new dqg(this));
        }
    }

    /* renamed from: a */
    public final fbp mo2855a() {
        return this.f21161k;
    }

    /* renamed from: c */
    public final boolean mo2857c() {
        return this.f21152a.mo3049a();
    }

    /* renamed from: d */
    public final kpk mo2858d() {
        this.f21155d.mo518d("One camera starting.");
        fva fva = this.f21160j;
        Iterable arrayList = new ArrayList();
        for (ijk a : fva.f4731a) {
            arrayList.add(a.mo385a());
        }
        kpk a2 = kow.m13620a(kny.m18045a(kow.m13616a(arrayList), fvb.f16554a, kpq.f8410a));
        synchronized (this) {
            this.f21156e = bbz.m787a(this.f21155d, a2, "OneCamera started.", "OneCamera failed to start!");
            a2 = this.f21156e;
        }
        return a2;
    }

    /* renamed from: a */
    public final kpk mo2856a(fbk fbk, gkr gkr) {
        dqn dqn = this.f21158h;
        fvy fvy = dqn.f3200a;
        ikd ikd = dqn.f3201b;
        fwa fwa = new fwa(fbk, gkr, new fvz(fbk, ikd, gkr), new fwd(fbk, gkr, ikd, dqn.f3202c));
        if (!((Boolean) fvy.f4740b.mo1170a().mo2860b()).booleanValue() || fvy.f4739a.m2274a()) {
            iqz iqz = fvy.f4741c;
            String valueOf = String.valueOf(fvy.f4740b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 74);
            stringBuilder.append("Take picture was invoked, but the picture taker is not available! Command ");
            stringBuilder.append(valueOf);
            iqz.mo516c(stringBuilder.toString());
            fwa.f4755d.close();
            fwa.f4754c.m2405a();
            return kow.m13617a(Boolean.valueOf(false));
        }
        boolean z;
        kpw d = kpw.m18056d();
        ilb ilb = fvy.f4743e;
        if (fvy.f4744f.incrementAndGet() > 0) {
            z = true;
        } else {
            z = false;
        }
        ilb.mo348a(Boolean.valueOf(z));
        fvy.f4742d.m16083a();
        fvy.f4739a.m2273a(new fwp(fvy, new fwm(fvy, d), fwa));
        return d;
    }

    /* renamed from: a */
    public final aub mo363a(asw asw) {
        return this.f21159i.mo363a(asw);
    }
}

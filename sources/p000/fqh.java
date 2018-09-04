package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: fqh */
final class fqh implements fux {
    /* renamed from: a */
    public final fwb f21394a;
    /* renamed from: b */
    public final ikb f21395b;
    /* renamed from: c */
    public final grg f21396c;
    /* renamed from: d */
    public iqm f21397d;
    /* renamed from: e */
    public final /* synthetic */ fqg f21398e;
    /* renamed from: f */
    private final fsa f21399f;
    /* renamed from: g */
    private final List f21400g;
    /* renamed from: h */
    private final fbk f21401h;

    private fqh(fqg fqg, fsa fsa, fwb fwb, grg grg, fbk fbk) {
        this.f21398e = fqg;
        this.f21399f = fsa;
        this.f21394a = fwb;
        this.f21396c = grg;
        this.f21401h = fbk;
        this.f21400g = new ArrayList();
        this.f21395b = new ikb();
        this.f21395b.mo1879a(this.f21394a);
    }

    /* renamed from: a */
    private final void m15717a() {
        this.f21395b.close();
        for (iwz close : this.f21400g) {
            close.close();
        }
    }

    /* renamed from: a */
    public final void mo2642a(iwz iwz, kpk kpk) {
        this.f21397d = iqm.m4037a(((Integer) this.f21398e.f16378e.m736b().mo2860b()).intValue());
        this.f21400g.add(new fkp(iwz, kpk));
    }

    public final void close() {
        Object obj = null;
        if (this.f21400g.isEmpty()) {
            this.f21395b.close();
            return;
        }
        boolean z;
        if (this.f21400g.size() == this.f21398e.f16380g) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        jri.m13152b(this.f21397d);
        try {
            this.f21396c.mo1517a((iwp) ((kpk) jri.m13152b(((fkp) this.f21400g.get(0)).m17318h())).get((long) fqg.f16374a, TimeUnit.MILLISECONDS));
            List arrayList = new ArrayList();
            for (fkp fkp : this.f21400g) {
                if (fkp.m17319i()) {
                    arrayList.add(new iuz(fkp, 3));
                } else {
                    iqz iqz = this.f21398e.f16375b;
                    String valueOf = String.valueOf(fkp.m17317a(fkr.f4602b));
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                    stringBuilder.append("Ignoring and closing image ");
                    stringBuilder.append(valueOf);
                    iqz.mo520f(stringBuilder.toString());
                    fkp.close();
                }
            }
            List a = m15715a(arrayList);
            List a2 = m15715a(arrayList);
            arrayList = m15715a(arrayList);
            kpk a3 = this.f21399f.mo1421a(a, (iqm) jri.m13152b(this.f21397d));
            if (this.f21397d != null) {
                z = true;
            } else {
                z = false;
            }
            jri.m13153b(z);
            kpk a4 = kny.m18045a(a3, new fqm(this, a2), kpq.f8410a);
            jri.m13152b(this.f21397d);
            kow.m13622a(a4, new fqp(this), kpq.f8410a);
            kpk a5 = kny.m18045a(a3, new fqi(this, arrayList), kpq.f8410a);
            if (((Boolean) this.f21398e.f16383j.mo2860b()).booleanValue() && this.f21398e.f16382i.mo2084b() && this.f21401h.f4449e == iut.FRONT) {
                obj = 1;
            }
            if (obj == null) {
                a4 = m15716a(a5);
            } else {
                a4 = m15716a(kny.m18046a(a5, new fqk(this), kpq.f8410a));
            }
            a4 = kny.m18046a(a4, new fqj(this), kpq.f8410a);
            kow.m13622a(a4, new fqs(this), kpq.f8410a);
            kow.m13622a(a4, new fqo(this), kpq.f8410a);
        } catch (Throwable e) {
            this.f21398e.f16375b.mo517c("Unable to save image.  Camera likely shutdown.", e);
            m15717a();
        } catch (Throwable e2) {
            this.f21398e.f16375b.mo517c("Interrupted before image could be saved", e2);
            m15717a();
            Thread.currentThread().interrupt();
        } catch (Throwable e22) {
            this.f21398e.f16375b.mo517c("Timeout retrieving image metadata, aborting the shot", e22);
            m15717a();
        }
    }

    /* renamed from: a */
    private final kpk m15716a(kpk kpk) {
        return kny.m18046a(kpk, new fql(this), kpq.f8410a);
    }

    /* renamed from: a */
    private final List m15715a(List list) {
        boolean z;
        int i = 0;
        if (list.size() == this.f21400g.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        List arrayList = new ArrayList();
        while (i < list.size()) {
            arrayList.add(new fkp(new iva((iwz) list.get(i)), ((fkp) this.f21400g.get(i)).m17318h()));
            i++;
        }
        return arrayList;
    }
}

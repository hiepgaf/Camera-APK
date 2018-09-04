package p000;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: fmg */
public final class fmg {
    /* renamed from: a */
    public final fjk f4622a;
    /* renamed from: b */
    private final fjm f4623b;

    public fmg(fjm fjm) {
        this.f4623b = fjm;
        this.f4622a = fjm.mo1397a(new fjm[0]);
    }

    /* renamed from: a */
    public final fko m2336a(int i) {
        Throwable e;
        fjl a = this.f4622a.mo1398a();
        try {
            a.mo3437a(i).get();
            return new fmi(a);
        } catch (InterruptedException e2) {
            e = e2;
            a.close();
            throw new isr(e);
        } catch (ExecutionException e3) {
            e = e3;
            a.close();
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final ilp m2337a() {
        return this.f4622a.mo1400b();
    }

    /* renamed from: b */
    public final int m2338b() {
        return this.f4623b.mo1396a();
    }
}

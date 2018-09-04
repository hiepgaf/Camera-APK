package p000;

import java.util.concurrent.Callable;

/* renamed from: eqc */
final /* synthetic */ class eqc implements Callable {
    /* renamed from: a */
    private final eqb f4077a;
    /* renamed from: b */
    private final epv f4078b;

    eqc(eqb eqb, epv epv) {
        this.f4077a = eqb;
        this.f4078b = epv;
    }

    public final Object call() {
        eqb eqb = this.f4077a;
        return eqb.f15362b.insert(eqb.f15361a, this.f4078b.f4066a);
    }
}

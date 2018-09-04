package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: esk */
final /* synthetic */ class esk implements Runnable {
    /* renamed from: a */
    private final eso f4199a;
    /* renamed from: b */
    private final grg f4200b;

    esk(esd esd, eso eso, grg grg) {
        this.f4199a = eso;
        this.f4200b = grg;
    }

    public final void run() {
        eso eso = this.f4199a;
        grg grg = this.f4200b;
        if (!eso.f4205a.f15558e.isCancelled()) {
            long currentTimeMillis = System.currentTimeMillis();
            euw a = eso.f4207c.m2137a();
            klg klg = new klg();
            klg.f22345a = (int) (currentTimeMillis - eso.f4209e);
            klg.f22346b = (int) TimeUnit.MILLISECONDS.convert(eso.f4208d - a.f4257b, TimeUnit.MICROSECONDS);
            klg.f22347c = (int) TimeUnit.MILLISECONDS.convert(a.f4258c - eso.f4208d, TimeUnit.MICROSECONDS);
            klg.f22349e = true;
            klg.f22348d = a.f4256a;
            klg.f22350f = false;
            klg.f22351g = esd.m9873b(eso.f4210f);
            grg.mo1519a(klg);
        }
    }
}

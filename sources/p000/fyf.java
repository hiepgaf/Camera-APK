package p000;

import java.util.Collection;

/* renamed from: fyf */
final /* synthetic */ class fyf implements Runnable {
    /* renamed from: a */
    private final fyd f4821a;
    /* renamed from: b */
    private final bbi f4822b;
    /* renamed from: c */
    private final kpw f4823c;

    fyf(fyd fyd, bbi bbi, kpw kpw) {
        this.f4821a = fyd;
        this.f4822b = bbi;
        this.f4823c = kpw;
    }

    public final void run() {
        fyd fyd = this.f4821a;
        bbi bbi = this.f4822b;
        knk knk = this.f4823c;
        Collection collection = (bbo) bbi.mo2657c();
        if (collection != null) {
            fyd.m10878a(collection);
        } else if (bbi.mo2654a() != null) {
            Throwable a = bbi.mo2654a();
            jri.m13152b((Object) a);
            knk.m17780a(a);
        } else {
            knk.m17780a(new isr());
        }
        synchronized (fyd.f16630a) {
            fyd.f16631b.remove(bbi);
        }
        knk.mo3557a(Boolean.valueOf(true));
    }
}

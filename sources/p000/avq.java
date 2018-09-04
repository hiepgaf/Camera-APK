package p000;

import java.util.concurrent.Future;

/* renamed from: avq */
final /* synthetic */ class avq implements iqb {
    /* renamed from: a */
    private final kpk f10387a;
    /* renamed from: b */
    private final aub f10388b;

    avq(kpk kpk, aub aub) {
        this.f10387a = kpk;
        this.f10388b = aub;
    }

    /* renamed from: a */
    public final void mo369a(Object obj) {
        Future future = this.f10387a;
        aub aub = this.f10388b;
        if (!future.isDone() || !((Boolean) kow.m13625c(future)).booleanValue()) {
            aub.mo359e();
        }
    }
}

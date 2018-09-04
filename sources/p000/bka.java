package p000;

import java.util.TimerTask;

/* compiled from: PG */
/* renamed from: bka */
final class bka extends TimerTask {
    /* renamed from: a */
    private final /* synthetic */ kpw f1229a;
    /* renamed from: b */
    private final /* synthetic */ bjz f1230b;

    bka(bjz bjz, kpw kpw) {
        this.f1230b = bjz;
        this.f1229a = kpw;
    }

    public final void run() {
        bli.m866b(bjz.f20095a, "onCaptureFailed: Timeout waiting for the jpeg image");
        this.f1229a.m17780a(new IllegalStateException("Timeout"));
        this.f1230b.m14849b();
    }
}

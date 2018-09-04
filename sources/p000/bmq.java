package p000;

/* compiled from: PG */
/* renamed from: bmq */
final class bmq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bmp f1324a;

    bmq(bmp bmp) {
        this.f1324a = bmp;
    }

    public final void run() {
        Object obj;
        boolean b = this.f1324a.m891b();
        synchronized (this.f1324a.f1319a) {
            bmp bmp = this.f1324a;
            obj = bmp.f1320b;
            bmp.f1320b = null;
        }
        ((kpw) jri.m13152b(obj)).mo3557a(Boolean.valueOf(b));
    }
}

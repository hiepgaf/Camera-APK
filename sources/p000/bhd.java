package p000;

/* compiled from: PG */
/* renamed from: bhd */
final class bhd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bhc f1147a;

    bhd(bhc bhc) {
        this.f1147a = bhc;
    }

    public final void run() {
        synchronized (this.f1147a.f10858e) {
            bhc bhc = this.f1147a;
            if (bhc.f10859f) {
                return;
            }
            bhc.f10857d.m7406a(bhc.f10854a, bhc.f10856c, bhc.f10855b);
        }
    }
}

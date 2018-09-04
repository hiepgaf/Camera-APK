package p000;

/* renamed from: evc */
final /* synthetic */ class evc implements Runnable {
    /* renamed from: a */
    private final evb f4265a;

    evc(evb evb) {
        this.f4265a = evb;
    }

    public final void run() {
        evb evb = this.f4265a;
        evb.f15600h = true;
        evb.m9975a();
    }
}

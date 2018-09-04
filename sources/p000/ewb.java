package p000;

/* renamed from: ewb */
public final /* synthetic */ class ewb implements Runnable {
    /* renamed from: a */
    private final evb f4294a;

    public ewb(evb evb) {
        this.f4294a = evb;
    }

    public final void run() {
        evb evb = this.f4294a;
        evb.f15596d.post(new evd(evb));
    }
}

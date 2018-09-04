package p000;

/* renamed from: eve */
final /* synthetic */ class eve implements Runnable {
    /* renamed from: a */
    private final evb f4267a;

    eve(evb evb) {
        this.f4267a = evb;
    }

    public final void run() {
        evb evb = this.f4267a;
        evb.f15599g = true;
        if (evb.f15600h) {
            evb.f15596d.post(new evi(evb));
        } else {
            evb.f15594b.mo3557a(izg.f7590a);
        }
    }
}

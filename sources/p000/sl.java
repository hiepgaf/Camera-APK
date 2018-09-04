package p000;

/* compiled from: PG */
/* renamed from: sl */
final class sl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ sk f9215a;

    sl(sk skVar) {
        this.f9215a = skVar;
    }

    public final void run() {
        sk skVar = this.f9215a;
        switch (skVar.f19585o) {
            case 1:
                skVar.f19584n.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        skVar.f19585o = 3;
        skVar.f19584n.setFloatValues(new float[]{((Float) skVar.f19584n.getAnimatedValue()).floatValue(), 0.0f});
        skVar.f19584n.setDuration(500);
        skVar.f19584n.start();
    }
}

package p000;

/* compiled from: PG */
/* renamed from: ad */
final class ad implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ac f290a;

    ad(ac acVar) {
        this.f290a = acVar;
    }

    public final void run() {
        Object access$100;
        synchronized (this.f290a.mDataLock) {
            access$100 = this.f290a.mPendingData;
            this.f290a.mPendingData = ac.NOT_SET;
        }
        this.f290a.setValue(access$100);
    }
}

package p000;

/* renamed from: idl */
abstract class idl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ idb f6940a;

    idl(idb idb) {
        this.f6940a = idb;
    }

    /* renamed from: a */
    protected abstract void mo1844a();

    public void run() {
        this.f6940a.f18227b.lock();
        try {
            if (!Thread.interrupted()) {
                mo1844a();
                this.f6940a.f18227b.unlock();
            }
        } catch (RuntimeException e) {
            idr idr = this.f6940a.f18226a;
            idr.f21706e.sendMessage(idr.f21706e.obtainMessage(2, e));
        } finally {
            this.f6940a.f18227b.unlock();
        }
    }
}

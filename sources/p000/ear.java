package p000;

import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: ear */
final class ear implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ eaq f3469a;

    ear(eaq eaq) {
        this.f3469a = eaq;
    }

    public final void run() {
        synchronized (this.f3469a.f14872k) {
            if (this.f3469a.f14872k.booleanValue()) {
                this.f3469a.f14873l = Boolean.valueOf(true);
                return;
            }
            this.f3469a.f14872k = Boolean.valueOf(true);
            new eas(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}

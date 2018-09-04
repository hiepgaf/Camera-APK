package p000;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* renamed from: gm */
final class gm extends FutureTask {
    /* renamed from: a */
    private final /* synthetic */ gk f5410a;

    gm(gk gkVar, Callable callable) {
        this.f5410a = gkVar;
        super(callable);
    }

    protected final void done() {
        try {
            this.f5410a.m2578c(get());
        } catch (Throwable e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException e3) {
            this.f5410a.m2578c(null);
        } catch (Throwable e4) {
            RuntimeException runtimeException = new RuntimeException("An error occurred while executing doInBackground()", e4);
        }
    }
}

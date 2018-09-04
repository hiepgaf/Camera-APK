package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: hzz */
public final class hzz implements Executor {
    /* renamed from: a */
    private final Handler f6858a;

    public hzz(Looper looper) {
        this.f6858a = new Handler(looper);
    }

    public final void execute(Runnable runnable) {
        this.f6858a.post(runnable);
    }
}

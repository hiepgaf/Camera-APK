package p000;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hu */
final class hu implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ hx f6662a;
    /* renamed from: b */
    private final /* synthetic */ Callable f6663b;
    /* renamed from: c */
    private final /* synthetic */ Handler f6664c;

    hu(Callable callable, Handler handler, hx hxVar) {
        this.f6663b = callable;
        this.f6664c = handler;
        this.f6662a = hxVar;
    }

    public final void run() {
        Object call;
        try {
            call = this.f6663b.call();
        } catch (Exception e) {
            call = null;
        }
        this.f6664c.post(new hv(this, call));
    }
}

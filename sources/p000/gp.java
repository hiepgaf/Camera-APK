package p000;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: gp */
final class gp implements Callable {
    /* renamed from: a */
    private final /* synthetic */ gk f5612a;

    gp() {
    }

    gp(gk gkVar) {
        this.f5612a = gkVar;
        this();
    }

    public final Object call() {
        Throwable th;
        Object obj;
        this.f5612a.f5279g.set(true);
        try {
            Process.setThreadPriority(10);
            Object a = this.f5612a.mo1457a();
            try {
                Binder.flushPendingCommands();
                this.f5612a.m2576b(a);
                return a;
            } catch (Throwable th2) {
                Object obj2 = a;
                th = th2;
                obj = obj2;
                try {
                    this.f5612a.f5278f.set(true);
                    throw th;
                } catch (Throwable th3) {
                    this.f5612a.m2576b(obj);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            obj = null;
            this.f5612a.f5278f.set(true);
            throw th;
        }
    }
}

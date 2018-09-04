package p000;

import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: PG */
/* renamed from: bas */
public abstract class bas implements UncaughtExceptionHandler {
    /* renamed from: a */
    private static final String f1045a = bli.m862a("UncaughtExHndlrBase");
    /* renamed from: b */
    private final UncaughtExceptionHandler f1046b;
    /* renamed from: c */
    private final ikd f1047c = new ikd();

    /* renamed from: a */
    protected abstract void mo418a(Throwable th);

    public bas(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f1046b = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    final void m778a(Thread thread, Throwable th) {
        UncaughtExceptionHandler uncaughtExceptionHandler = this.f1046b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        mo418a(th);
        if (ikd.m12260b()) {
            m778a(thread, th);
            return;
        }
        String str = f1045a;
        String valueOf = String.valueOf(thread);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
        stringBuilder.append("Uncaught exception in background thread ");
        stringBuilder.append(valueOf);
        bli.m867b(str, stringBuilder.toString(), th);
        this.f1047c.execute(new bat(this, thread, th));
    }
}

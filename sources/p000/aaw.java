package p000;

import android.os.Message;

/* compiled from: PG */
/* renamed from: aaw */
public final class aaw {
    /* renamed from: a */
    public final Runnable f38a = new aax(this);
    /* renamed from: b */
    public final Object f39b = new Object();

    aaw() {
    }

    /* renamed from: a */
    static void m27a(Message message) {
        if (message != null && (message.obj instanceof aaw)) {
            ((aaw) message.obj).f38a.run();
        }
    }
}

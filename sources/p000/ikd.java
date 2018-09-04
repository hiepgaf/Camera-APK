package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: ikd */
public final class ikd extends ijx {
    /* renamed from: a */
    private static final ThreadLocal f18326a = new ike();

    public ikd() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static void m12259a() {
        jri.m13154b(ikd.m12260b(), (Object) "Not main thread.");
    }

    /* renamed from: b */
    public static boolean m12260b() {
        Boolean bool = (Boolean) f18326a.get();
        return bool != null && bool.booleanValue();
    }

    /* renamed from: a */
    public final void m12261a(Runnable runnable) {
        if (ikd.m12260b()) {
            runnable.run();
        } else {
            execute(runnable);
        }
    }
}

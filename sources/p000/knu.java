package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: knu */
final class knu extends knl {
    /* renamed from: a */
    public static final Unsafe f19234a;
    /* renamed from: b */
    public static final long f19235b;
    /* renamed from: c */
    public static final long f19236c;
    /* renamed from: d */
    public static final long f19237d;
    /* renamed from: e */
    public static final long f19238e;
    /* renamed from: f */
    public static final long f19239f;

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new knv());
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
        try {
            Class cls = knk.class;
            f19236c = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
            f19235b = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
            f19237d = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
            f19238e = unsafe.objectFieldOffset(knw.class.getDeclaredField("thread"));
            f19239f = unsafe.objectFieldOffset(knw.class.getDeclaredField("next"));
            f19234a = unsafe;
        } catch (Throwable e3) {
            kbr.m4760b(e3);
            throw new RuntimeException(e3);
        }
    }

    knu() {
    }

    /* renamed from: a */
    final boolean mo2195a(knk knk, knp knp, knp knp2) {
        return f19234a.compareAndSwapObject(knk, f19235b, knp, knp2);
    }

    /* renamed from: a */
    final boolean mo2194a(knk knk, Object obj, Object obj2) {
        return f19234a.compareAndSwapObject(knk, f19237d, obj, obj2);
    }

    /* renamed from: a */
    final boolean mo2196a(knk knk, knw knw, knw knw2) {
        return f19234a.compareAndSwapObject(knk, f19236c, knw, knw2);
    }

    /* renamed from: a */
    final void mo2193a(knw knw, knw knw2) {
        f19234a.putObject(knw, f19239f, knw2);
    }

    /* renamed from: a */
    final void mo2192a(knw knw, Thread thread) {
        f19234a.putObject(knw, f19238e, thread);
    }
}

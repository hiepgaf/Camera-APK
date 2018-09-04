package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: kbr */
public final class kbr {
    /* renamed from: a */
    private static final Object f8187a;

    static {
        Object a = kbr.m4755a();
        f8187a = a;
        if (a != null) {
            kbr.m4757a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (f8187a != null) {
            kbr.m4759b();
        }
    }

    /* renamed from: a */
    private static Object m4755a() {
        Object obj = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
        }
        return obj;
    }

    /* renamed from: a */
    private static Method m4757a(String str, Class... clsArr) {
        Method method = null;
        try {
            method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
        }
        return method;
    }

    /* renamed from: b */
    private static Method m4759b() {
        try {
            Method a = kbr.m4757a("getStackTraceDepth", Throwable.class);
            if (a == null) {
                return null;
            }
            a.invoke(kbr.m4755a(), new Object[]{new Throwable()});
            return a;
        } catch (UnsupportedOperationException e) {
            return null;
        } catch (IllegalAccessException e2) {
            return null;
        } catch (InvocationTargetException e3) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static RuntimeException m4756a(Throwable th) {
        kbr.m4760b(th);
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    public static void m4758a(Throwable th, Class cls) {
        if (th != null) {
            jri.m13152b((Object) th);
            if (cls.isInstance(th)) {
                throw ((Throwable) cls.cast(th));
            }
        }
        if (th != null) {
            kbr.m4760b(th);
        }
    }

    /* renamed from: b */
    public static void m4760b(Throwable th) {
        jri.m13152b((Object) th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}

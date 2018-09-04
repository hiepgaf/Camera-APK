package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

/* compiled from: PG */
/* renamed from: knb */
enum knb extends kmy {
    knb(String str) {
        super(str, 2);
    }

    /* renamed from: a */
    final Type mo2188a(Type type) {
        return a.mo2188a(type);
    }

    /* renamed from: b */
    final String mo2190b(Type type) {
        Throwable e;
        try {
            return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
        } catch (NoSuchMethodException e2) {
            throw new AssertionError("Type.getTypeName should be available in Java 8");
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (IllegalAccessException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    final Type mo2189c(Type type) {
        return a.mo2189c(type);
    }
}

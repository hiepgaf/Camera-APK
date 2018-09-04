package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: koz */
public final class koz {
    /* renamed from: a */
    private static final kgd f8400a = new kcz(new kpa(), kgc.f19196a).mo2152a();

    /* renamed from: a */
    static void m5030a(Class cls) {
        jri.m13148a(RuntimeException.class.isAssignableFrom(cls) ^ 1, "Futures.getChecked exception type (%s) must not be a RuntimeException", (Object) cls);
        jri.m13148a(koz.m5031b(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", (Object) cls);
    }

    /* renamed from: a */
    public static Object m5028a(Future future, Class cls, TimeUnit timeUnit) {
        Throwable e;
        kpc.f8401a.mo2202a(cls);
        try {
            return future.get(1000, timeUnit);
        } catch (Throwable e2) {
            Thread.currentThread().interrupt();
            throw koz.m5026a(cls, e2);
        } catch (Throwable e22) {
            throw koz.m5026a(cls, e22);
        } catch (ExecutionException e3) {
            e22 = e3.getCause();
            if (e22 instanceof Error) {
                throw new kon((Error) e22);
            } else if (e22 instanceof RuntimeException) {
                throw new kqe(e22);
            } else {
                throw koz.m5026a(cls, e22);
            }
        }
    }

    /* renamed from: b */
    private static boolean m5031b(Class cls) {
        try {
            koz.m5026a(cls, new Exception());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    private static Object m5027a(Constructor constructor, Throwable th) {
        Class[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Object obj = parameterTypes[i];
            if (obj.equals(String.class)) {
                objArr[i] = th.toString();
            } else if (!obj.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalArgumentException e) {
            return null;
        } catch (InstantiationException e2) {
            return null;
        } catch (IllegalAccessException e3) {
            return null;
        } catch (InvocationTargetException e4) {
            return null;
        }
    }

    /* renamed from: a */
    private static Exception m5026a(Class cls, Throwable th) {
        Collection collection;
        Iterable asList = Arrays.asList(cls.getConstructors());
        Comparator comparator = f8400a;
        if (asList instanceof Collection) {
            collection = (Collection) asList;
        } else {
            collection = khb.m4896c(asList.iterator());
        }
        Object[] toArray = collection.toArray();
        Arrays.sort(toArray, comparator);
        ArrayList c = khb.m4895c(Arrays.asList(toArray));
        int size = c.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Exception exception = (Exception) koz.m5027a((Constructor) c.get(i), th);
            if (exception != null) {
                if (exception.getCause() == null) {
                    exception.initCause(th);
                }
                return exception;
            }
            i = i2;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 82);
        stringBuilder.append("No appropriate constructor for exception of type ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" in response to chained exception");
        throw new IllegalArgumentException(stringBuilder.toString(), th);
    }

    /* renamed from: a */
    static kpb m5029a() {
        return kpd.f19246a;
    }
}

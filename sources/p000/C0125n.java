package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: n */
final class C0125n {
    /* renamed from: a */
    public static C0125n f8860a = new C0125n();
    /* renamed from: b */
    public final Map f8861b = new HashMap();
    /* renamed from: c */
    private final Map f8862c = new HashMap();

    C0125n() {
    }

    /* renamed from: a */
    final cx m5614a(Class cls, Method[] methodArr) {
        cx b;
        Class superclass = cls.getSuperclass();
        Map hashMap = new HashMap();
        if (superclass != null) {
            b = m5615b(superclass);
            if (b != null) {
                hashMap.putAll(b.f2831b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : m5615b(b2).f2831b.entrySet()) {
                C0125n.m5612a(hashMap, (C0126o) entry.getKey(), (C0129v) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = C0125n.m5613a(cls);
        }
        int length = methodArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            boolean z2;
            Method method = methodArr[i];
            aj ajVar = (aj) method.getAnnotation(aj.class);
            if (ajVar == null) {
                z2 = z;
            } else {
                int i2;
                Class[] parameterTypes = method.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0132y.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0129v a = ajVar.m307a();
                if (length2 > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0129v.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == C0129v.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (length2 > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                C0125n.m5612a(hashMap, new C0126o(i2, method), a, cls);
                z2 = true;
            }
            i++;
            z = z2;
        }
        b = new cx(hashMap);
        this.f8862c.put(cls, b);
        this.f8861b.put(cls, Boolean.valueOf(z));
        return b;
    }

    /* renamed from: a */
    static Method[] m5613a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (Throwable e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: b */
    final cx m5615b(Class cls) {
        cx cxVar = (cx) this.f8862c.get(cls);
        if (cxVar != null) {
            return cxVar;
        }
        return m5614a(cls, null);
    }

    /* renamed from: a */
    private static void m5612a(Map map, C0126o c0126o, C0129v c0129v, Class cls) {
        C0129v c0129v2 = (C0129v) map.get(c0126o);
        if (c0129v2 != null && c0129v != c0129v2) {
            Method method = c0126o.f8992b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Method ");
            stringBuilder.append(method.getName());
            stringBuilder.append(" in ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous");
            stringBuilder.append(" value ");
            stringBuilder.append(c0129v2);
            stringBuilder.append(", new value ");
            stringBuilder.append(c0129v);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (c0129v2 == null) {
            map.put(c0126o, c0129v);
        }
    }
}

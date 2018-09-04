package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ab */
public final class ab {
    /* renamed from: a */
    private static Map f70a = new HashMap();
    /* renamed from: b */
    private static Map f71b = new HashMap();

    /* renamed from: a */
    private static C0127s m39a(Constructor constructor, Object obj) {
        try {
            return (C0127s) constructor.newInstance(new Object[]{obj});
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        } catch (Throwable e22) {
            throw new RuntimeException(e22);
        }
    }

    /* renamed from: a */
    private static Constructor m38a(Class cls) {
        try {
            String str;
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (packageR == null) {
                str = "";
            } else {
                str = packageR.getName();
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(canonicalName.replace(".", "_"));
            stringBuilder.append("_LifecycleAdapter");
            canonicalName = stringBuilder.toString();
            if (!str.isEmpty()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".");
                stringBuilder.append(canonicalName);
                canonicalName = stringBuilder.toString();
            }
            Constructor declaredConstructor = Class.forName(canonicalName).getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public static C0159t m40a(Object obj) {
        if (obj instanceof C0158q) {
            return new C0166r((C0158q) obj);
        }
        if (obj instanceof C0159t) {
            return (C0159t) obj;
        }
        Class cls = obj.getClass();
        if (ab.m41b(cls) != 2) {
            return new ak(obj);
        }
        List list = (List) f71b.get(cls);
        if (list.size() == 1) {
            return new am(ab.m39a((Constructor) list.get(0), obj));
        }
        C0127s[] c0127sArr = new C0127s[list.size()];
        for (int i = 0; i < list.size(); i++) {
            c0127sArr[i] = ab.m39a((Constructor) list.get(i), obj);
        }
        return new C0165p(c0127sArr);
    }

    /* renamed from: b */
    private static int m41b(Class cls) {
        int i = 0;
        if (f70a.containsKey(cls)) {
            return ((Integer) f70a.get(cls)).intValue();
        }
        int i2;
        if (cls.getCanonicalName() != null) {
            Constructor a = ab.m38a(cls);
            if (a != null) {
                f71b.put(cls, Collections.singletonList(a));
                i2 = 2;
            } else {
                boolean booleanValue;
                C0125n c0125n = C0125n.f8860a;
                if (c0125n.f8861b.containsKey(cls)) {
                    booleanValue = ((Boolean) c0125n.f8861b.get(cls)).booleanValue();
                } else {
                    Method[] a2 = C0125n.m5613a(cls);
                    for (Method annotation : a2) {
                        if (((aj) annotation.getAnnotation(aj.class)) != null) {
                            c0125n.m5614a(cls, a2);
                            booleanValue = true;
                            break;
                        }
                    }
                    c0125n.f8861b.put(cls, Boolean.valueOf(false));
                    booleanValue = false;
                }
                if (booleanValue) {
                    i2 = 1;
                } else {
                    List list;
                    Class superclass = cls.getSuperclass();
                    if (!ab.m42c(superclass)) {
                        list = null;
                    } else if (ab.m41b(superclass) != 1) {
                        list = new ArrayList((Collection) f71b.get(superclass));
                    } else {
                        i2 = 1;
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (i < length) {
                        Class cls2 = interfaces[i];
                        if (ab.m42c(cls2)) {
                            if (ab.m41b(cls2) == 1) {
                                i2 = 1;
                                break;
                            }
                            List arrayList;
                            if (list == null) {
                                arrayList = new ArrayList();
                            } else {
                                arrayList = list;
                            }
                            arrayList.addAll((Collection) f71b.get(cls2));
                            list = arrayList;
                        }
                        i++;
                    }
                    if (list != null) {
                        f71b.put(cls, list);
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                }
            }
        } else {
            i2 = 1;
        }
        f70a.put(cls, Integer.valueOf(i2));
        return i2;
    }

    /* renamed from: c */
    private static boolean m42c(Class cls) {
        return cls != null && C0131x.class.isAssignableFrom(cls);
    }
}

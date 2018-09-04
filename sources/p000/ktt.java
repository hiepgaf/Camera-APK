package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ktt */
final class ktt {
    /* renamed from: a */
    public static final kug f8545a = ktt.m5237a(false);
    /* renamed from: b */
    public static final kug f8546b = ktt.m5237a(true);
    /* renamed from: c */
    public static final kug f8547c = new kug((byte) 0);
    /* renamed from: d */
    private static final Class f8548d = ktt.m5234a();

    /* renamed from: a */
    static int m5231a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * krh.m13802a(i);
    }

    /* renamed from: a */
    static int m5233a(List list) {
        return list.size();
    }

    /* renamed from: b */
    static int m5246b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k = size * krh.m13846k(i);
        for (size = 0; size < list.size(); size++) {
            k += krh.m13812a((kqx) list.get(size));
        }
        return k;
    }

    /* renamed from: c */
    static int m5253c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m13846k(i)) + ktt.m5248b(list);
    }

    /* renamed from: b */
    static int m5248b(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            i2 = 0;
            while (i2 < size) {
                int c = krh.m13828c(ksc.m16679c(i2)) + i;
                i2++;
                i = c;
            }
            return i;
        }
        i2 = 0;
        for (c = 0; c < size; c++) {
            i2 += krh.m13828c(((Integer) list.get(c)).intValue());
        }
        return i2;
    }

    /* renamed from: d */
    static int m5256d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * krh.m13833d(i);
    }

    /* renamed from: c */
    static int m5254c(List list) {
        return list.size() << 2;
    }

    /* renamed from: e */
    static int m5259e(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * krh.m13836e(i);
    }

    /* renamed from: d */
    static int m5257d(List list) {
        return list.size() << 3;
    }

    /* renamed from: a */
    static int m5232a(int i, List list, ktr ktr) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += krh.m13809a(i, (kte) list.get(i3), ktr);
        }
        return i2;
    }

    /* renamed from: f */
    static int m5262f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m13846k(i)) + ktt.m5260e(list);
    }

    /* renamed from: e */
    static int m5260e(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            i2 = 0;
            while (i2 < size) {
                int g = krh.m13840g(ksc.m16679c(i2)) + i;
                i2++;
                i = g;
            }
            return i;
        }
        i2 = 0;
        for (g = 0; g < size; g++) {
            i2 += krh.m13840g(((Integer) list.get(g)).intValue());
        }
        return i2;
    }

    /* renamed from: g */
    static int m5265g(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return ktt.m5263f(list) + (list.size() * krh.m13846k(i));
    }

    /* renamed from: f */
    static int m5263f(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof kst) {
            kst kst = (kst) list;
            i2 = 0;
            while (i2 < size) {
                int a = krh.m13810a(kst.m16692b(i2)) + i;
                i2++;
                i = a;
            }
            return i;
        }
        i2 = 0;
        for (a = 0; a < size; a++) {
            i2 += krh.m13810a(((Long) list.get(a)).longValue());
        }
        return i2;
    }

    /* renamed from: a */
    static int m5230a(int i, Object obj, ktr ktr) {
        if (obj instanceof ksn) {
            return krh.m13822b(i, (ksn) obj);
        }
        return krh.m13823b(i, (kte) obj, ktr);
    }

    /* renamed from: b */
    static int m5247b(int i, List list, ktr ktr) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k = krh.m13846k(i) * size;
        int i2 = 0;
        while (i2 < size) {
            int a;
            Object obj = list.get(i2);
            if (obj instanceof ksn) {
                a = krh.m13813a((ksn) obj) + k;
            } else {
                a = krh.m13815a((kte) obj, ktr) + k;
            }
            i2++;
            k = a;
        }
        return k;
    }

    /* renamed from: h */
    static int m5268h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m13846k(i)) + ktt.m5266g(list);
    }

    /* renamed from: g */
    static int m5266g(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            i2 = 0;
            while (i2 < size) {
                int j = krh.m13845j(ksc.m16679c(i2)) + i;
                i2++;
                i = j;
            }
            return i;
        }
        i2 = 0;
        for (j = 0; j < size; j++) {
            i2 += krh.m13845j(((Integer) list.get(j)).intValue());
        }
        return i2;
    }

    /* renamed from: i */
    static int m5271i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m13846k(i)) + ktt.m5269h(list);
    }

    /* renamed from: h */
    static int m5269h(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof kst) {
            kst kst = (kst) list;
            i2 = 0;
            while (i2 < size) {
                int b = krh.m13824b(kst.m16692b(i2)) + i;
                i2++;
                i = b;
            }
            return i;
        }
        i2 = 0;
        for (b = 0; b < size; b++) {
            i2 += krh.m13824b(((Long) list.get(b)).longValue());
        }
        return i2;
    }

    /* renamed from: j */
    static int m5274j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k = krh.m13846k(i) * size;
        int i2;
        Object b;
        int a;
        if (list instanceof ksp) {
            ksp ksp = (ksp) list;
            i2 = 0;
            while (i2 < size) {
                b = ksp.mo2308b(i2);
                if (b instanceof kqx) {
                    a = krh.m13812a((kqx) b) + k;
                } else {
                    a = krh.m13811a((String) b) + k;
                }
                i2++;
                k = a;
            }
            return k;
        }
        i2 = 0;
        while (i2 < size) {
            b = list.get(i2);
            if (b instanceof kqx) {
                a = krh.m13812a((kqx) b) + k;
            } else {
                a = krh.m13811a((String) b) + k;
            }
            i2++;
            k = a;
        }
        return k;
    }

    /* renamed from: k */
    static int m5277k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m13846k(i)) + ktt.m5272i(list);
    }

    /* renamed from: i */
    static int m5272i(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            i2 = 0;
            while (i2 < size) {
                int l = krh.m13847l(ksc.m16679c(i2)) + i;
                i2++;
                i = l;
            }
            return i;
        }
        i2 = 0;
        for (l = 0; l < size; l++) {
            i2 += krh.m13847l(((Integer) list.get(l)).intValue());
        }
        return i2;
    }

    /* renamed from: l */
    static int m5279l(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m13846k(i)) + ktt.m5275j(list);
    }

    /* renamed from: j */
    static int m5275j(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof kst) {
            kst kst = (kst) list;
            i2 = 0;
            while (i2 < size) {
                int c = krh.m13831c(kst.m16692b(i2)) + i;
                i2++;
                i = c;
            }
            return i;
        }
        i2 = 0;
        for (c = 0; c < size; c++) {
            i2 += krh.m13831c(((Long) list.get(c)).longValue());
        }
        return i2;
    }

    /* renamed from: a */
    static Object m5236a(int i, List list, ksf ksf, Object obj, kug kug) {
        if (ksf == null) {
            return obj;
        }
        int intValue;
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            Object obj2 = obj;
            while (i2 < size) {
                Object obj3;
                intValue = ((Integer) list.get(i2)).intValue();
                if (ksf.mo1772a(intValue) != null) {
                    if (i2 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    intValue = i3 + 1;
                    obj3 = obj2;
                } else {
                    int i4 = i3;
                    obj3 = ktt.m5235a(i, intValue, obj2, kug);
                    intValue = i4;
                }
                i2++;
                obj2 = obj3;
                i3 = intValue;
            }
            if (i3 == size) {
                return obj2;
            }
            list.subList(i3, size).clear();
            return obj2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            intValue = ((Integer) it.next()).intValue();
            if (ksf.mo1772a(intValue) == null) {
                obj = ktt.m5235a(i, intValue, obj, kug);
                it.remove();
            }
        }
        return obj;
    }

    /* renamed from: a */
    private static Class m5234a() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    private static kug m5237a(boolean z) {
        try {
            Class b = ktt.m5249b();
            if (b == null) {
                return null;
            }
            return (kug) b.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: b */
    private static Class m5249b() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    static void m5243a(krp krp, Object obj, Object obj2) {
        krr krr = ((ksb) obj2).f23582g;
        if (!krr.f8452a.isEmpty()) {
            krr a = krp.m5108a(obj);
            for (int i = 0; i < krr.f8452a.m5290c(); i++) {
                a.m5122b(krr.f8452a.m5287a(i));
            }
            for (Entry b : krr.f8452a.m5292d()) {
                a.m5122b(b);
            }
        }
    }

    /* renamed from: a */
    static void m5242a(Object obj, Object obj2, long j) {
        kul.m5320a(obj, j, kta.m5162a(kul.m5340j(obj, j), kul.m5340j(obj2, j)));
    }

    /* renamed from: a */
    static void m5244a(kug kug, Object obj, Object obj2) {
        kuh kuh = ((kry) obj).f23439e;
        kuh kuh2 = ((kry) obj2).f23439e;
        if (!kuh2.equals(kuh.f8572a)) {
            kuh = kuh.m5304a(kuh, kuh2);
        }
        kug.m5301a(obj, kuh);
    }

    /* renamed from: a */
    public static void m5241a(Class cls) {
        if (!kry.class.isAssignableFrom(cls) && f8548d != null && !f8548d.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    static boolean m5245a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj == null) {
                z = false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    static Object m5235a(int i, int i2, Object obj, kug kug) {
        if (obj == null) {
            obj = kuh.m5306b();
        }
        ((kuh) obj).m5308a(i << 3, Long.valueOf((long) i2));
        return obj;
    }

    /* renamed from: a */
    public static void m5240a(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    i3 += krh.m13817b();
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.mo3271a(((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3272a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m5238a(int i, List list, kvb kvb) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                kvb.f8633a.mo3278c(i, (kqx) list.get(i2));
            }
        }
    }

    /* renamed from: b */
    public static void m5252b(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    i3 += krh.m13827c();
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.m13851a(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.m13853a(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static void m5255c(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m13828c(((Integer) list.get(i4)).intValue());
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.mo3292n(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3285f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: d */
    public static void m5258d(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += krh.m13832d();
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.mo3291m(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3284e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: e */
    public static void m5261e(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += krh.m13835e();
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.mo3283d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3281d(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m5264f(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    i3 += krh.m13837f();
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.m13852a(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.m13854a(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m5239a(int i, List list, kvb kvb, ktr ktr) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                kvb.m5378a(i, list.get(i2), ktr);
            }
        }
    }

    /* renamed from: g */
    public static void m5267g(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m13840g(((Integer) list.get(i4)).intValue());
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.mo3292n(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3285f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: h */
    public static void m5270h(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m13810a(((Long) list.get(i4)).longValue());
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.mo3287f(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3286f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m5251b(int i, List list, kvb kvb, ktr ktr) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                kvb.m5385b(i, list.get(i2), ktr);
            }
        }
    }

    /* renamed from: i */
    public static void m5273i(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += krh.m13839g();
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.mo3291m(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3284e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m5276j(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += krh.m13842h();
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.mo3283d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3281d(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: k */
    public static void m5278k(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m13845j(((Integer) list.get(i4)).intValue());
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.m13880o(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.m13874g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: l */
    public static void m5280l(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m13824b(((Long) list.get(i4)).longValue());
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.m13870e(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.m13869e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m5250b(int i, List list, kvb kvb) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (list instanceof ksp) {
                ksp ksp = (ksp) list;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    Object b = ksp.mo2308b(i3);
                    if (b instanceof String) {
                        kvb.f8633a.mo3274b(i, (String) b);
                    } else {
                        kvb.f8633a.mo3278c(i, (kqx) b);
                    }
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3274b(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static void m5281m(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m13847l(((Integer) list.get(i4)).intValue());
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.mo3293p(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3290i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: n */
    public static void m5282n(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f8633a.mo3288h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m13831c(((Long) list.get(i4)).longValue());
                }
                kvb.f8633a.mo3293p(i3);
                while (i2 < list.size()) {
                    kvb.f8633a.mo3287f(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f8633a.mo3286f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }
}

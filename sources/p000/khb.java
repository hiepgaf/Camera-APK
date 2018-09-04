package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: khb */
public class khb {
    /* renamed from: a */
    public Object[] f8285a;
    /* renamed from: b */
    public int f8286b;

    public khb() {
        this(4);
    }

    khb(int i) {
        this.f8285a = new Object[(i + i)];
        this.f8286b = 0;
    }

    /* renamed from: a */
    public static boolean m4878a(Collection collection, Iterator it) {
        jri.m13152b((Object) collection);
        jri.m13152b((Object) it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: a */
    public kes mo2135a() {
        return kgi.m13503a(this.f8286b, this.f8285a);
    }

    /* renamed from: a */
    static Object m4862a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("at index ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static void m4892b(Object obj, Object obj2) {
        String valueOf;
        StringBuilder stringBuilder;
        if (obj == null) {
            valueOf = String.valueOf(obj2);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
            stringBuilder.append("null key in entry: null=");
            stringBuilder.append(valueOf);
            throw new NullPointerException(stringBuilder.toString());
        } else if (obj2 == null) {
            valueOf = String.valueOf(obj);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("null value in entry: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("=null");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static int m4859a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 40);
        stringBuilder.append(str);
        stringBuilder.append(" cannot be negative but was: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    static void m4876a(Iterator it) {
        jri.m13152b((Object) it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: a */
    static int m4858a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (1.0d * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        highestOneBit += highestOneBit;
        if (highestOneBit <= 0) {
            return 1073741824;
        }
        return highestOneBit;
    }

    /* renamed from: a */
    public static kgu m4873a(Set set, Set set2) {
        jri.m13139a((Object) set, (Object) "set1");
        jri.m13139a((Object) set2, (Object) "set2");
        return new kgr(set, set2);
    }

    /* renamed from: b */
    static Iterator m4887b(Iterator it) {
        return new kfv(it);
    }

    /* renamed from: d */
    private final void m4902d(int i) {
        int i2 = i + i;
        Object[] objArr = this.f8285a;
        int length = objArr.length;
        if (i2 > length) {
            this.f8285a = Arrays.copyOf(objArr, kej.m4801a(length, i2));
        }
    }

    /* renamed from: a */
    static boolean m4880a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size() && set.containsAll(set2)) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    /* renamed from: a */
    public static Object m4861a(Iterable iterable, int i) {
        int i2 = 0;
        jri.m13152b((Object) iterable);
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        Object it = iterable.iterator();
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("position (");
            stringBuilder.append(i);
            stringBuilder.append(") must not be negative");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        boolean z;
        jri.m13152b(it);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        if (it.hasNext()) {
            return it.next();
        }
        StringBuilder stringBuilder2 = new StringBuilder(91);
        stringBuilder2.append("position (");
        stringBuilder2.append(i);
        stringBuilder2.append(") must be less than the number of elements that remained (");
        stringBuilder2.append(i2);
        stringBuilder2.append(")");
        throw new IndexOutOfBoundsException(stringBuilder2.toString());
    }

    /* renamed from: a */
    static int m4860a(Set set) {
        int i = 0;
        for (Object next : set) {
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            } else {
                hashCode = 0;
            }
            i = ((i + hashCode) ^ -1) ^ -1;
        }
        return i;
    }

    /* renamed from: b */
    public static kfu m4891b(Object obj, int i) {
        return new kfz(obj, i);
    }

    /* renamed from: c */
    public static Entry m4897c(Object obj, Object obj2) {
        return new kek(obj, obj2);
    }

    /* renamed from: a */
    public static keu m4872a(Enum enumR, Enum... enumArr) {
        return kel.m16484a(EnumSet.of(enumR, enumArr));
    }

    /* renamed from: b */
    public static keu m4890b(Iterable iterable) {
        if (iterable instanceof kel) {
            return (kel) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return kgn.f22045a;
            }
            return kel.m16484a(EnumSet.copyOf(collection));
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return kgn.f22045a;
        }
        Collection of = EnumSet.of((Enum) it.next());
        khb.m4878a(of, it);
        return kel.m16484a(of);
    }

    /* renamed from: a */
    static Iterator m4866a(kft kft) {
        return new kga(kft, kft.mo2114g().iterator());
    }

    /* renamed from: a */
    public static NavigableMap m4868a(NavigableMap navigableMap, Object obj) {
        return new khg(navigableMap, obj);
    }

    /* renamed from: a */
    static NavigableSet m4870a(NavigableSet navigableSet, Object obj) {
        return new khh(navigableSet, obj);
    }

    /* renamed from: b */
    public static ArrayList m4885b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public static ArrayList m4895c(Iterable iterable) {
        jri.m13152b((Object) iterable);
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        return khb.m4896c(iterable.iterator());
    }

    /* renamed from: c */
    public static ArrayList m4896c(Iterator it) {
        Collection b = khb.m4885b();
        khb.m4878a(b, it);
        return b;
    }

    @SafeVarargs
    /* renamed from: a */
    public static ArrayList m4864a(Object... objArr) {
        jri.m13152b((Object) objArr);
        int length = objArr.length;
        khb.m4859a(length, "arraySize");
        Object arrayList = new ArrayList(khx.m4934a(((long) (length / 10)) + (((long) length) + 5)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList m4863a(int i) {
        khb.m4859a(i, "initialArraySize");
        return new ArrayList(i);
    }

    /* renamed from: c */
    public static ConcurrentMap m4898c() {
        return new ConcurrentHashMap();
    }

    /* renamed from: d */
    public static HashMap m4899d() {
        return new HashMap();
    }

    /* renamed from: e */
    public static HashSet m4903e() {
        return new HashSet();
    }

    /* renamed from: d */
    public static HashSet m4900d(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        Collection e = khb.m4903e();
        khb.m4878a(e, it);
        return e;
    }

    /* renamed from: b */
    public static HashSet m4886b(int i) {
        int i2;
        if (i < 3) {
            khb.m4859a(i, "expectedSize");
            i2 = i + 1;
        } else {
            i2 = i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : LfuScheduler.MAX_PRIORITY;
        }
        return new HashSet(i2);
    }

    /* renamed from: f */
    public static TreeSet m4905f() {
        return new TreeSet();
    }

    /* renamed from: a */
    public khb mo2137a(Object obj, Object obj2) {
        m4902d(this.f8286b + 1);
        khb.m4892b(obj, obj2);
        Object[] objArr = this.f8285a;
        int i = this.f8286b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f8286b = i + 1;
        return this;
    }

    /* renamed from: a */
    public khb mo2138a(Entry entry) {
        return mo2137a(entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    public khb mo2136a(Iterable iterable) {
        if (iterable instanceof Collection) {
            m4902d(((Collection) iterable).size() + this.f8286b);
        }
        for (Entry a : iterable) {
            mo2138a(a);
        }
        return this;
    }

    /* renamed from: a */
    static boolean m4881a(Set set, Collection collection) {
        jri.m13152b((Object) collection);
        if (collection instanceof kft) {
            Object e = ((kft) collection).mo2112e();
        }
        if (!(e instanceof Set) || e.size() <= set.size()) {
            return khb.m4882a(set, e.iterator());
        }
        Iterator it = set.iterator();
        jri.m13152b(e);
        boolean z = false;
        while (it.hasNext()) {
            if (e.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    static boolean m4882a(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: a */
    public static List m4867a(List list) {
        if (list instanceof ken) {
            return ((ken) list).mo3234f();
        }
        if (list instanceof kff) {
            return ((kff) list).f8265a;
        }
        if (list instanceof RandomAccess) {
            return new kfe(list);
        }
        return new kff(list);
    }

    /* renamed from: a */
    static boolean m4877a(Collection collection, Object obj) {
        jri.m13152b((Object) collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m4879a(Map map, Object obj) {
        jri.m13152b((Object) map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }

    /* renamed from: b */
    static Object m4884b(Map map, Object obj) {
        jri.m13152b((Object) map);
        try {
            return map.get(obj);
        } catch (ClassCastException e) {
            return null;
        } catch (NullPointerException e2) {
            return null;
        }
    }

    /* renamed from: c */
    static Object m4894c(Map map, Object obj) {
        jri.m13152b((Object) map);
        try {
            return map.remove(obj);
        } catch (ClassCastException e) {
            return null;
        } catch (NullPointerException e2) {
            return null;
        }
    }

    /* renamed from: b */
    static Set m4888b(Set set, Object obj) {
        return new khj(set, obj);
    }

    /* renamed from: a */
    public static khy m4875a(Object obj) {
        return new kfc(obj);
    }

    /* renamed from: c */
    static int m4893c(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    static int m4883b(Object obj) {
        return khb.m4893c(obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: a */
    static SortedMap m4871a(SortedMap sortedMap, Object obj) {
        return new khk(sortedMap, obj);
    }

    /* renamed from: a */
    public static Iterator m4865a(Iterator it, kaw kaw) {
        jri.m13152b((Object) kaw);
        return new kfb(it, kaw);
    }

    /* renamed from: b */
    public static kes m4889b(Iterator it, kaw kaw) {
        jri.m13152b((Object) kaw);
        khb e = kes.m4809e();
        while (it.hasNext()) {
            Object next = it.next();
            e.mo2137a(kaw.mo370a(next), next);
        }
        try {
            return e.mo2135a();
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(String.valueOf(e2.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    /* renamed from: d */
    public static khy m4901d(Iterator it) {
        jri.m13152b((Object) it);
        if (it instanceof khy) {
            return (khy) it;
        }
        return new kez(it);
    }

    /* renamed from: a */
    public static NavigableSet m4869a(NavigableSet navigableSet) {
        return ((navigableSet instanceof keh) || (navigableSet instanceof kgv)) ? navigableSet : new kgv(navigableSet);
    }

    /* renamed from: a */
    public static kgx m4874a(kgx kgx) {
        return new kia((kgx) jri.m13152b((Object) kgx));
    }

    /* renamed from: e */
    static Iterator m4904e(Iterator it) {
        return new kfm(it);
    }
}

package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: keu */
public abstract class keu extends keh implements Set {
    /* renamed from: a */
    private transient ken f19186a;

    keu() {
    }

    /* renamed from: c */
    public abstract khy mo2144c();

    /* renamed from: a */
    public ken mo2143a() {
        ken ken = this.f19186a;
        if (ken != null) {
            return ken;
        }
        ken = mo3242e();
        this.f19186a = ken;
        return ken;
    }

    /* renamed from: a */
    public static kev m13479a(int i) {
        khb.m4859a(i, "expectedSize");
        return new kev(i);
    }

    /* renamed from: b */
    static int m13481b(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            highestOneBit += highestOneBit;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit += highestOneBit;
            }
            return highestOneBit;
        }
        boolean z;
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "collection too large");
        return 1073741824;
    }

    /* renamed from: a */
    static keu m13471a(int i, Object... objArr) {
        while (true) {
            switch (i) {
                case 0:
                    return kgn.f22045a;
                case 1:
                    return keu.m13472a(objArr[0]);
                default:
                    int b = keu.m13481b(i);
                    Object[] objArr2 = new Object[b];
                    int i2 = b - 1;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        Object a = khb.m4862a(objArr[i5], i5);
                        int hashCode = a.hashCode();
                        int c = khb.m4893c(hashCode);
                        while (true) {
                            int i6 = c & i2;
                            Object obj = objArr2[i6];
                            if (obj == null) {
                                c = i3 + 1;
                                objArr[i3] = a;
                                objArr2[i6] = a;
                                i4 += hashCode;
                                i3 = c;
                            } else if (!obj.equals(a)) {
                                c++;
                            }
                        }
                    }
                    Arrays.fill(objArr, i3, i, null);
                    if (i3 == 1) {
                        return new kgw(objArr[0], i4);
                    }
                    if (keu.m13481b(i3) >= b / 2) {
                        Object[] copyOf;
                        if (keu.m13480a(i3, objArr.length)) {
                            copyOf = Arrays.copyOf(objArr, i3);
                        } else {
                            copyOf = objArr;
                        }
                        return new kgn(copyOf, i4, objArr2, i2, i3);
                    }
                    i = i3;
            }
        }
    }

    /* renamed from: a */
    public static keu m13477a(Collection collection) {
        if ((collection instanceof keu) && !(collection instanceof SortedSet)) {
            keu keu = (keu) collection;
            if (!keu.mo3227b()) {
                return keu;
            }
        }
        Object[] toArray = collection.toArray();
        return keu.m13471a(toArray.length, toArray);
    }

    /* renamed from: a */
    public static keu m13478a(Object[] objArr) {
        int length = objArr.length;
        switch (length) {
            case 0:
                return kgn.f22045a;
            case 1:
                return keu.m13472a(objArr[0]);
            default:
                return keu.m13471a(length, (Object[]) objArr.clone());
        }
    }

    /* renamed from: e */
    ken mo3242e() {
        return ken.m13459a(toArray());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof keu) && mo3228d() && ((keu) obj).mo3228d() && hashCode() != obj.hashCode()) {
            return false;
        }
        return khb.m4880a((Set) this, obj);
    }

    public int hashCode() {
        return khb.m4860a((Set) this);
    }

    /* renamed from: d */
    boolean mo3228d() {
        return false;
    }

    public /* synthetic */ Iterator iterator() {
        return mo2144c();
    }

    /* renamed from: a */
    public static keu m13472a(Object obj) {
        return new kgw(obj);
    }

    /* renamed from: a */
    public static keu m13473a(Object obj, Object obj2) {
        return keu.m13471a(2, obj, obj2);
    }

    /* renamed from: a */
    public static keu m13474a(Object obj, Object obj2, Object obj3) {
        return keu.m13471a(3, obj, obj2, obj3);
    }

    /* renamed from: a */
    public static keu m13475a(Object obj, Object obj2, Object obj3, Object obj4) {
        return keu.m13471a(4, obj, obj2, obj3, obj4);
    }

    @SafeVarargs
    /* renamed from: a */
    public static keu m13476a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z;
        int length = objArr.length;
        if (length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[(length + 6)];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return keu.m13471a(objArr2.length, objArr2);
    }

    /* renamed from: a */
    static boolean m13480a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    Object writeReplace() {
        return new kew(toArray());
    }
}

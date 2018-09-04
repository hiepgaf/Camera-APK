package p000;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: eag */
public final class eag {
    /* renamed from: a */
    public static iqp f3449a = new iqp(3264, 1836);
    /* renamed from: b */
    private static Float[] f3450b = new Float[]{Float.valueOf(1.7777778f), Float.valueOf(1.3333334f)};
    /* renamed from: c */
    private static iqp[] f3451c = new iqp[]{new iqp(16, 9), new iqp(4, 3)};

    static {
        iqn iqn = new iqn(16, 9);
        iqn = new iqn(4, 3);
    }

    /* renamed from: d */
    private static int m1731d(iqp iqp) {
        if (iqp == null) {
            return 0;
        }
        return iqp.f7329a * iqp.f7330b;
    }

    /* renamed from: a */
    public static int m1726a(iqp iqp) {
        BigInteger valueOf = BigInteger.valueOf((long) iqp.f7329a);
        BigInteger valueOf2 = BigInteger.valueOf((long) iqp.f7330b);
        return Math.min(valueOf.intValue(), valueOf2.intValue()) / valueOf.gcd(valueOf2).intValue();
    }

    /* renamed from: b */
    public static int m1729b(iqp iqp) {
        return eag.m1732e(iqp).f7329a;
    }

    /* renamed from: a */
    private static float m1725a(float f) {
        for (Float floatValue : f3450b) {
            float floatValue2 = floatValue.floatValue();
            if (((double) Math.abs(f - floatValue2)) < 0.05d) {
                return floatValue2;
            }
        }
        return f;
    }

    /* renamed from: c */
    public static iqp m1730c(iqp iqp) {
        iqp e = eag.m1732e(iqp);
        int indexOf = Arrays.asList(f3450b).indexOf(Float.valueOf(eag.m1725a(((float) iqp.f7329a) / ((float) iqp.f7330b))));
        if (indexOf != -1) {
            return f3451c[indexOf];
        }
        return e;
    }

    /* renamed from: a */
    public static DisplayMetrics m1727a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    /* renamed from: a */
    public static List m1728a(List list) {
        HashMap hashMap = new HashMap();
        for (iqp iqp : list) {
            Float valueOf = Float.valueOf(eag.m1725a(Float.valueOf(((float) iqp.f7329a) / ((float) iqp.f7330b)).floatValue()));
            eai eai = (eai) hashMap.get(valueOf);
            if (eai == null) {
                eai = new eai();
                eai.f3452a = valueOf;
                hashMap.put(valueOf, eai);
            }
            eai.f3453b.add(iqp);
            Collections.sort(eai.f3453b, new eaj());
            eai.f3454c = Integer.valueOf(((iqp) eai.f3453b.get(0)).f7330b * ((iqp) eai.f3453b.get(0)).f7329a);
        }
        ArrayList arrayList = new ArrayList(hashMap.values());
        Collections.sort(arrayList, new eah());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Float.valueOf(((eai) arrayList.get(0)).f3452a.floatValue()));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Float f = ((eai) arrayList.get(i)).f3452a;
            if (!Arrays.asList(f3450b).contains(f)) {
                i = i2;
            } else if (arrayList2.contains(f)) {
                i = i2;
            } else {
                arrayList2.add(f);
                i = i2;
            }
        }
        List arrayList3 = new ArrayList(list.size());
        int size2 = arrayList2.size();
        i = 0;
        while (i < size2) {
            int i3 = i + 1;
            f = (Float) arrayList2.get(i);
            int size3 = arrayList.size();
            i2 = 0;
            while (i2 < size3) {
                int i4 = i2 + 1;
                eai = (eai) arrayList.get(i2);
                if (((double) Math.abs(eai.f3452a.floatValue() - f.floatValue())) <= 0.05d) {
                    List<iqp> list2 = eai.f3453b;
                    Collection arrayList4 = new ArrayList();
                    iqp iqp2 = (iqp) list2.get(0);
                    arrayList4.add(iqp2);
                    iqp iqp3 = iqp2;
                    for (iqp iqp4 : list2) {
                        double pow = Math.pow(0.5d, (double) arrayList4.size()) * ((double) eag.m1731d(iqp2));
                        if (((double) eag.m1731d(iqp4)) < pow) {
                            if (arrayList4.contains(iqp3) || pow - ((double) eag.m1731d(iqp3)) >= ((double) eag.m1731d(iqp4)) - pow) {
                                arrayList4.add(iqp4);
                            } else {
                                arrayList4.add(iqp3);
                            }
                        }
                        if (arrayList4.size() == 3) {
                            break;
                        }
                        iqp3 = iqp4;
                    }
                    iqp iqp42 = iqp3;
                    if (arrayList4.size() < 3 && !arrayList4.contains(r4)) {
                        arrayList4.add(r4);
                    }
                    arrayList3.addAll(arrayList4);
                    i2 = i4;
                } else {
                    i2 = i4;
                }
            }
            i = i3;
        }
        return arrayList3;
    }

    /* renamed from: e */
    private static iqp m1732e(iqp iqp) {
        BigInteger valueOf = BigInteger.valueOf((long) iqp.f7329a);
        BigInteger valueOf2 = BigInteger.valueOf((long) iqp.f7330b);
        BigInteger gcd = valueOf.gcd(valueOf2);
        return new iqp(Math.max(valueOf.intValue(), valueOf2.intValue()) / gcd.intValue(), Math.min(valueOf.intValue(), valueOf2.intValue()) / gcd.intValue());
    }
}

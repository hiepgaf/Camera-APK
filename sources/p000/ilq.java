package p000;

import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: ilq */
public final class ilq {
    /* renamed from: a */
    public static final iqo f7087a = new iql();

    /* renamed from: a */
    public static iqo m3824a(ilp ilp, Runnable runnable, Executor executor) {
        jri.m13152b((Object) ilp);
        jri.m13152b((Object) runnable);
        jri.m13152b((Object) executor);
        return ilp.mo2859a(new ilu(runnable), executor);
    }

    /* renamed from: a */
    public static iqo m3823a(ilp ilp, iqt iqt) {
        return ilp.mo2859a(iqt, khx.m4940a());
    }

    /* renamed from: a */
    public static ilp m3820a(Collection collection) {
        return new ilk(collection);
    }

    @SafeVarargs
    /* renamed from: a */
    public static ilp m3822a(ilp... ilpArr) {
        Collection arrayList = new ArrayList();
        for (Object add : ilpArr) {
            arrayList.add(add);
        }
        return ilq.m3820a(arrayList);
    }

    /* renamed from: b */
    public static ilp m3833b(Collection collection) {
        return ilq.m3817a(ilq.m3820a(collection), ilr.f18352a);
    }

    @SafeVarargs
    /* renamed from: b */
    public static ilp m3834b(ilp... ilpArr) {
        return ilq.m3833b(Arrays.asList(ilpArr));
    }

    /* renamed from: a */
    public static ilp m3814a(ilp ilp) {
        return new ilh(new ilf(ilp));
    }

    /* renamed from: a */
    public static ilp m3816a(ilp ilp, Comparable comparable) {
        return ilq.m3817a(ilp, new ilw(comparable));
    }

    /* renamed from: b */
    public static ilp m3831b(ilp ilp) {
        return new ilh(ilp);
    }

    /* renamed from: a */
    public static ilp m3819a(Object obj, kpk kpk) {
        ilp ilb = new ilb(ilq.m3818a(obj));
        kow.m13622a(kpk, new imf(ilb), kpq.f8410a);
        return ilq.m3814a(ilb);
    }

    /* renamed from: c */
    public static List m3838c(Collection collection) {
        List arrayList = new ArrayList();
        for (ilp b : collection) {
            arrayList.add(b.mo2860b());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static ilp m3832b(ilp ilp, Comparable comparable) {
        return ilq.m3817a(ilp, new ilv(comparable));
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m3826a(List list) {
        for (Boolean booleanValue : list) {
            if (!booleanValue.booleanValue()) {
                return Boolean.valueOf(false);
            }
        }
        return Boolean.valueOf(true);
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m3825a(Comparable comparable, Comparable comparable2) {
        jri.m13152b((Object) comparable2);
        return Boolean.valueOf(comparable2.compareTo(comparable) == 0);
    }

    /* renamed from: b */
    static final /* synthetic */ Boolean m3835b(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable2.compareTo(comparable) >= 0);
    }

    /* renamed from: b */
    static final /* synthetic */ Integer m3836b(List list) {
        Integer num = (Integer) list.get(0);
        Integer num2 = num;
        for (Integer num3 : list) {
            num2 = Integer.valueOf(Math.min(num2.intValue(), num3.intValue()));
        }
        return num2;
    }

    /* renamed from: c */
    static final /* synthetic */ Boolean m3837c(List list) {
        for (Boolean booleanValue : list) {
            if (booleanValue.booleanValue()) {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: e */
    static final /* synthetic */ Integer m3842e(List list) {
        int i = 0;
        for (Integer intValue : list) {
            i = intValue.intValue() + i;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    static final /* synthetic */ void m3829a(AtomicBoolean atomicBoolean, ikb ikb, Boolean bool) {
        if (bool.booleanValue()) {
            atomicBoolean.set(true);
            ikb.close();
        }
    }

    /* renamed from: d */
    public static ilp m3839d(Collection collection) {
        jri.m13143a(collection.isEmpty() ^ 1);
        return ilq.m3817a(ilq.m3820a(collection), ilz.f18361a);
    }

    /* renamed from: a */
    public static ilp m3818a(Object obj) {
        return new imc(obj);
    }

    /* renamed from: a */
    public static ilp m3821a(kpk kpk) {
        ilp ilb = new ilb(Boolean.valueOf(false));
        kow.m13622a(kpk, new ime(ilb), kpq.f8410a);
        return ilb;
    }

    /* renamed from: e */
    public static ilp m3841e(Collection collection) {
        jri.m13143a(collection.isEmpty() ^ 1);
        return ilq.m3817a(ilq.m3820a(collection), ils.f18353a);
    }

    /* renamed from: a */
    public static ilp m3815a(ilp ilp, ilp ilp2) {
        return ilq.m3817a(ilq.m3822a(ilp, ilp2), ily.f18360a);
    }

    /* renamed from: f */
    public static ilp m3843f(Collection collection) {
        return ilq.m3817a(ilq.m3820a(collection), ilx.f18359a);
    }

    /* renamed from: a */
    public static ilp m3817a(ilp ilp, kaw kaw) {
        return ilq.m3831b(new imb(ilp, kaw, ilp));
    }

    /* renamed from: a */
    public static kpk m3827a(ilp ilp, ikb ikb) {
        kpk d = kpw.m18056d();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ikb b = ikb.mo1880b();
        b.mo1879a(ilp.mo2859a(new ima(atomicBoolean, b), kpq.f8410a));
        b.mo1879a(new ilt(d, atomicBoolean));
        return d;
    }
}

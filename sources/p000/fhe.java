package p000;

import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fhe */
final class fhe implements fip {
    /* renamed from: a */
    public final AtomicInteger f16013a;
    /* renamed from: b */
    public final ird f16014b;
    /* renamed from: c */
    private final iwg f16015c;
    /* renamed from: d */
    private final ivr f16016d;
    /* renamed from: e */
    private final Handler f16017e;
    /* renamed from: f */
    private final fje f16018f = new fje();

    public fhe(iwg iwg, ivr ivr, Handler handler, ird ird) {
        this.f16015c = iwg;
        this.f16016d = ivr;
        this.f16017e = handler;
        this.f16014b = ird;
        this.f16013a = new AtomicInteger(0);
    }

    /* renamed from: a */
    public final synchronized void mo1381a(List list, fiv fiv) {
        this.f16014b.mo1903a("submitRequest");
        Map hashMap = new HashMap();
        List arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (fim fim : list) {
            iwn a;
            Object obj;
            Object a2 = this.f16018f.m2320a();
            Collection arrayList4 = new ArrayList();
            arrayList4.addAll(fim.f4568c);
            if (fim.f4570e.mo2084b()) {
                jri.m13144a(fiv.equals(fiv.REPEATING) ^ 1, (Object) "Repeating reprocessing requests are not supported.");
                a = this.f16015c.mo2983b().mo2987a((iwp) fim.f4570e.mo2081a());
            } else {
                a = this.f16015c.mo2983b().mo2986a(fim.f4566a);
            }
            Set<Surface> hashSet = new HashSet();
            for (fhz fhz : fim.f4569d) {
                fia b;
                if (fiv == fiv.NON_REPEATING) {
                    b = fhz.mo706b();
                } else {
                    try {
                        b = fhz.mo705a();
                    } catch (Throwable e) {
                        throw new isr(e);
                    } catch (Throwable th) {
                        this.f16014b.mo1904b();
                    }
                }
                arrayList2.add(b);
                arrayList4.add(b.mo1385b());
                hashSet.addAll(b.mo1386c());
            }
            if (!hashSet.isEmpty()) {
                for (Surface a3 : hashSet) {
                    if (!this.f16016d.m4260a(a3)) {
                        obj = null;
                        break;
                    }
                }
                obj = 1;
                if (obj != null) {
                    for (Surface a32 : hashSet) {
                        a.m4293a(a32);
                    }
                    for (fin fin : fim.f4567b) {
                        a.m4292a(fin.f4571a, fin.f4572b);
                    }
                    hashMap.put(a2, fds.m10250b(arrayList4));
                    a.m4294a(a2);
                    arrayList.add(a.m4291a());
                }
            }
            arrayList3.add(fim);
        }
        int size;
        try {
            if (!arrayList.isEmpty()) {
                if (fiv == fiv.REPEATING) {
                    this.f16015c.mo2982b(arrayList, new fhf(this, hashMap), this.f16017e);
                } else {
                    this.f16015c.mo2979a(arrayList, new fhf(this, hashMap), this.f16017e);
                }
            }
            size = arrayList3.size();
            int i = 0;
            while (i < size) {
                obj = arrayList3.get(i);
                i++;
                for (fiw a4 : ((fim) obj).f4568c) {
                    a4.mo1388a(-1);
                }
            }
            this.f16014b.mo1904b();
        } catch (Throwable e2) {
            throw new isr(e2);
        } catch (Throwable e22) {
            Throwable th2 = e22;
            int size2 = arrayList2.size();
            size = 0;
            while (size < size2) {
                obj = arrayList2.get(size);
                size++;
                ((fia) obj).mo1384a();
            }
            size2 = arrayList3.size();
            size = 0;
            while (size < size2) {
                obj = arrayList3.get(size);
                size++;
                for (fiw a42 : ((fim) obj).f4568c) {
                    a42.mo1388a(-1);
                }
            }
        }
    }
}

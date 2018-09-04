package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fma */
final class fma extends flc {
    /* renamed from: a */
    private final fjj f23199a;

    private fma(fjj fjj) {
        this.f23199a = fjj;
    }

    /* renamed from: a */
    static fjj m17345a(fjj fjj, fyr fyr) {
        List arrayList = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(fjj.mo3041a());
        iwz f = fjj.mo3045f();
        while (f != null) {
            arrayList.add(new fmb(f, atomicInteger, fyr));
            f = fjj.mo3045f();
        }
        if (atomicInteger.get() == 0) {
            fyr.close();
        }
        fjj.close();
        return new fma(new fld(fjj.mo3044e(), fjj.mo3043d(), arrayList));
    }

    /* renamed from: b */
    static fjj m17346b(fjj fjj, fyr fyr) {
        List arrayList = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(fjj.mo3041a());
        LinkedList b = fjj.mo3042b();
        synchronized (fjj.mo3046c()) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(new fmc((iwz) it.next(), atomicInteger, fyr));
            }
        }
        if (atomicInteger.get() == 0) {
            fyr.close();
        }
        return new fma(new fld(fjj.mo3044e(), fjj.mo3043d(), arrayList));
    }

    /* renamed from: g */
    protected final fjj mo3442g() {
        return this.f23199a;
    }

    /* renamed from: c */
    public final Object mo3046c() {
        return this.f23199a.mo3046c();
    }
}

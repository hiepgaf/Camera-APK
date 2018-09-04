package p000;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fld */
public class fld implements fjj {
    /* renamed from: a */
    public final kpk f21373a;
    /* renamed from: b */
    public final Object f21374b;
    /* renamed from: c */
    private final long f21375c;
    /* renamed from: d */
    private final LinkedList f21376d;

    public fld(long j, kpk kpk, List list) {
        for (iwz f : list) {
            boolean z;
            if (f.mo2719f() == j) {
                z = true;
            } else {
                z = false;
            }
            jri.m13143a(z);
        }
        this.f21374b = new Object();
        this.f21375c = j;
        this.f21373a = kpk;
        this.f21376d = new LinkedList(list);
    }

    public synchronized void close() {
        synchronized (this.f21374b) {
            Iterator it = this.f21376d.iterator();
            while (it.hasNext()) {
                ((iwz) it.next()).close();
            }
            this.f21376d.clear();
        }
    }

    /* renamed from: a */
    public final synchronized int mo3041a() {
        int size;
        synchronized (this.f21374b) {
            size = this.f21376d.size();
        }
        return size;
    }

    /* renamed from: b */
    public final synchronized LinkedList mo3042b() {
        LinkedList linkedList;
        synchronized (this.f21374b) {
            linkedList = this.f21376d;
        }
        return linkedList;
    }

    /* renamed from: c */
    public final Object mo3046c() {
        return this.f21374b;
    }

    /* renamed from: d */
    public final kpk mo3043d() {
        return this.f21373a;
    }

    /* renamed from: e */
    public final synchronized long mo3044e() {
        return this.f21375c;
    }

    /* renamed from: f */
    public final synchronized iwz mo3045f() {
        iwz iwz;
        synchronized (this.f21374b) {
            iwz = (iwz) this.f21376d.pollFirst();
        }
        return iwz;
    }
}

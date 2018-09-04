package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jjb */
public class jjb {
    /* renamed from: a */
    public final TreeSet f7877a;

    public jjb() {
        this.f7877a = new TreeSet(mo2010a());
    }

    public jjb(byte b) {
        this();
    }

    /* renamed from: a */
    public final void m4521a(jja jja) {
        synchronized (this.f7877a) {
            this.f7877a.add(jja);
        }
    }

    /* renamed from: b */
    public final List m4522b() {
        List arrayList;
        synchronized (this.f7877a) {
            arrayList = new ArrayList(this.f7877a);
        }
        return arrayList;
    }

    /* renamed from: a */
    protected Comparator mo2010a() {
        return new jjc();
    }
}

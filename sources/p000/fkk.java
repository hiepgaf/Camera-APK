package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: fkk */
public final class fkk implements fjv, iqo {
    /* renamed from: a */
    private final Object f16104a = new Object();
    /* renamed from: b */
    private final fjv f16105b;
    /* renamed from: c */
    private final List f16106c = new ArrayList();

    public fkk(fjv fjv) {
        this.f16105b = fjv;
    }

    /* renamed from: a */
    public final fiw mo1393a(fjw fjw) {
        iqt fkm = new fkm();
        fiw a = fds.m10242a(fkm);
        fiw a2 = this.f16105b.mo1393a(new fkl(fjw, fkm));
        synchronized (this.f16104a) {
            this.f16106c.add(fkm);
        }
        return fds.m10243a(a, a2);
    }

    public final void close() {
        synchronized (this.f16104a) {
            ListIterator listIterator = this.f16106c.listIterator();
            while (listIterator.hasNext()) {
                ((fkm) listIterator.next()).close();
                listIterator.remove();
            }
        }
    }
}

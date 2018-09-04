package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: PG */
/* renamed from: cpw */
public final class cpw implements csj {
    /* renamed from: a */
    public final ConcurrentLinkedQueue f12509a = new ConcurrentLinkedQueue();
    /* renamed from: b */
    public final int f12510b = 3;

    /* renamed from: a */
    public final void mo666a(int i, cre cre) {
        Iterator it = this.f12509a.iterator();
        while (it.hasNext()) {
            ((csj) it.next()).mo666a(i, cre);
        }
    }

    /* renamed from: b */
    public final void mo668b(int i, cre cre) {
        Iterator it = this.f12509a.iterator();
        while (it.hasNext()) {
            ((csj) it.next()).mo668b(i, cre);
        }
    }

    /* renamed from: a */
    public final void mo667a(csk csk) {
        Iterator it = this.f12509a.iterator();
        while (it.hasNext()) {
            ((csj) it.next()).mo667a(csk);
        }
    }

    /* renamed from: a */
    public final void mo665a() {
        Iterator it = this.f12509a.iterator();
        while (it.hasNext()) {
            ((csj) it.next()).mo665a();
        }
    }
}

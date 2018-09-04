package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bcn */
public final class bcn {
    /* renamed from: a */
    private final List f1074a = new ArrayList();

    /* renamed from: a */
    public final void m792a(ilp ilp, Object obj) {
        synchronized (this.f1074a) {
            this.f1074a.add(new bcm(ilp, obj));
        }
    }

    /* renamed from: a */
    public final void m791a() {
        synchronized (this.f1074a) {
            for (bcm bcm : this.f1074a) {
                bcm.f1072a.mo348a(bcm.f1073b);
            }
        }
    }
}

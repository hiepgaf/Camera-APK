package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: apy */
public final class apy {
    /* renamed from: a */
    private final List f849a = new ArrayList();

    /* renamed from: a */
    public final synchronized void m562a(Class cls, adr adr) {
        this.f849a.add(new apz(cls, adr));
    }

    /* renamed from: a */
    public final synchronized adr m561a(Class cls) {
        adr adr;
        int size = this.f849a.size();
        for (int i = 0; i < size; i++) {
            apz apz = (apz) this.f849a.get(i);
            if (apz.f850a.isAssignableFrom(cls)) {
                adr = apz.f851b;
                break;
            }
        }
        adr = null;
        return adr;
    }
}

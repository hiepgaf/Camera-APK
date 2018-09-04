package p000;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: fjo */
public final class fjo implements fjs {
    /* renamed from: a */
    private final List f16072a;

    public fjo(fjs... fjsArr) {
        this.f16072a = Arrays.asList(fjsArr);
    }

    /* renamed from: a */
    public final boolean mo1392a(iwp iwp) {
        boolean z = false;
        for (fjs a : this.f16072a) {
            if (a.mo1392a(iwp)) {
                z = true;
            } else if (z) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}

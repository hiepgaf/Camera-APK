package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: apr */
public final class apr {
    /* renamed from: a */
    private final List f835a = new ArrayList();

    /* renamed from: a */
    public final synchronized void m550a(Class cls, adi adi) {
        this.f835a.add(new aps(cls, adi));
    }

    /* renamed from: a */
    public final synchronized adi m549a(Class cls) {
        adi adi;
        for (aps aps : this.f835a) {
            if (aps.f836a.isAssignableFrom(cls)) {
                adi = aps.f837b;
                break;
            }
        }
        adi = null;
        return adi;
    }
}

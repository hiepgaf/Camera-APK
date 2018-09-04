package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hco */
public final class hco {
    /* renamed from: a */
    public final goy f5987a;
    /* renamed from: b */
    public final Set f5988b = Collections.synchronizedSet(new HashSet());
    /* renamed from: c */
    private volatile gbv f5989c;

    public hco(goy goy, gbv gbv) {
        this.f5987a = goy;
        this.f5989c = gbv;
    }

    /* renamed from: a */
    public final hcy m3074a(String str) {
        return new hcx(this, str);
    }
}

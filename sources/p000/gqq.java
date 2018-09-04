package p000;

import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gqq */
public final class gqq {
    /* renamed from: a */
    public final HashMap f5635a = new HashMap();
    /* renamed from: b */
    private final gqi f5636b;
    /* renamed from: c */
    private boolean f5637c;

    public gqq(gqi gqi, Set set) {
        this.f5636b = gqi;
        for (Class put : set) {
            this.f5635a.put(put, Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    public final void m2738a(Class cls, boolean z) {
        boolean containsKey = this.f5635a.containsKey(cls);
        String cls2 = cls.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(cls2).length() + 50);
        stringBuilder.append("active state ");
        stringBuilder.append(cls2);
        stringBuilder.append(" must be one of the predicate states.");
        jri.m13144a(containsKey, stringBuilder.toString());
        this.f5635a.put(cls, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void m2739a(boolean z) {
        if (z != this.f5637c) {
            this.f5637c = z;
            if (this.f5637c) {
                this.f5636b.mo1562a();
            } else {
                this.f5636b.mo1563b();
            }
        }
    }
}

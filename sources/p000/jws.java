package p000;

import java.util.HashMap;

/* compiled from: PG */
/* renamed from: jws */
public final class jws {
    /* renamed from: a */
    private final HashMap f8042a = khb.m4899d();

    /* renamed from: a */
    public final void m4660a(jza jza, jwo jwo, float f) {
        this.f8042a.put(new jww(jza, jwo), Float.valueOf(f));
    }

    /* renamed from: a */
    public final jwr m4659a() {
        return new jwr(this.f8042a);
    }
}

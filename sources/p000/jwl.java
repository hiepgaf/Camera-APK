package p000;

import android.util.LruCache;

/* compiled from: PG */
/* renamed from: jwl */
public final class jwl implements jwp {
    /* renamed from: a */
    public final boolean f19084a = true;
    /* renamed from: b */
    private final LruCache f19085b;
    /* renamed from: c */
    private final jwp f19086c;

    public jwl(jwp jwp, int i) {
        this.f19086c = jwp;
        this.f19085b = new LruCache(i);
    }

    /* renamed from: a */
    public final float mo2059a(jky jky, jky jky2) {
        jwm jwm = new jwm(this, jky, jky2);
        Float f = (Float) this.f19085b.get(jwm);
        if (f == null) {
            f = Float.valueOf(this.f19086c.mo2059a(jky, jky2));
            this.f19085b.put(jwm, f);
        }
        return f.floatValue();
    }
}

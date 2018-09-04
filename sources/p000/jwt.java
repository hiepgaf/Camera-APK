package p000;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jwt */
public final class jwt implements jwp {
    /* renamed from: a */
    public Map f19089a = new HashMap();
    /* renamed from: b */
    private final jwp f19090b;

    public jwt(jwp jwp) {
        this.f19090b = jwp;
    }

    /* renamed from: a */
    public final float mo2059a(jky jky, jky jky2) {
        float a = this.f19090b.mo2059a(jky, jky2);
        this.f19089a.put(new Pair(Long.valueOf(jky.m4527b()), Long.valueOf(jky2.m4527b())), Float.valueOf(a));
        return a;
    }
}

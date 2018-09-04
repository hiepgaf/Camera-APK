package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jvc */
public final class jvc extends jum {
    /* renamed from: a */
    private final Set f21943a;

    public jvc(jum... jumArr) {
        Object b = khb.m4886b(jumArr.length);
        Collections.addAll(b, jumArr);
        this.f21943a = b;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        Collection hashSet = new HashSet();
        for (jum a : this.f21943a) {
            hashSet.addAll(ken.m13458a(a.mo3176a(juh).f7984a));
        }
        return new juh(hashSet);
    }

    public final String toString() {
        String a = kaz.m4732a(" | ").m4735a(this.f21943a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 2);
        stringBuilder.append("(");
        stringBuilder.append(a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

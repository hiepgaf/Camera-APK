package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: agz */
final class agz {
    /* renamed from: a */
    private final aha f452a = new aha();
    /* renamed from: b */
    private final Map f453b = new HashMap();

    agz() {
    }

    /* renamed from: a */
    public final Object m275a(ahh ahh) {
        aha aha = (aha) this.f453b.get(ahh);
        if (aha == null) {
            aha = new aha(ahh);
            this.f453b.put(ahh, aha);
        } else {
            ahh.mo71a();
        }
        agz.m272a(aha);
        aha aha2 = this.f452a;
        aha.f457d = aha2;
        aha.f456c = aha2.f456c;
        agz.m273b(aha);
        return aha.m277a();
    }

    /* renamed from: a */
    public final void m276a(ahh ahh, Object obj) {
        aha aha = (aha) this.f453b.get(ahh);
        if (aha == null) {
            aha = new aha(ahh);
            agz.m272a(aha);
            aha aha2 = this.f452a;
            aha.f457d = aha2.f457d;
            aha.f456c = aha2;
            agz.m273b(aha);
            this.f453b.put(ahh, aha);
        } else {
            ahh.mo71a();
        }
        if (aha.f455b == null) {
            aha.f455b = new ArrayList();
        }
        aha.f455b.add(obj);
    }

    /* renamed from: a */
    private static void m272a(aha aha) {
        aha aha2 = aha.f457d;
        aha2.f456c = aha.f456c;
        aha.f456c.f457d = aha2;
    }

    /* renamed from: a */
    public final Object m274a() {
        for (aha aha = this.f452a.f457d; !aha.equals(this.f452a); aha = aha.f457d) {
            Object a = aha.m277a();
            if (a != null) {
                return a;
            }
            agz.m272a(aha);
            this.f453b.remove(aha.f454a);
            ((ahh) aha.f454a).mo71a();
        }
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        aha aha = this.f452a.f456c;
        Object obj = null;
        while (!aha.equals(this.f452a)) {
            stringBuilder.append('{');
            stringBuilder.append(aha.f454a);
            stringBuilder.append(':');
            stringBuilder.append(aha.m278b());
            stringBuilder.append("}, ");
            aha = aha.f456c;
            obj = 1;
        }
        if (obj != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static void m273b(aha aha) {
        aha.f456c.f457d = aha;
        aha.f457d.f456c = aha;
    }
}

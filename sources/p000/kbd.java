package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kbd */
public final class kbd {
    /* renamed from: a */
    private final String f8181a;
    /* renamed from: b */
    private final kbe f8182b = new kbe();
    /* renamed from: c */
    private kbe f8183c = this.f8182b;

    public kbd(String str) {
        this.f8181a = (String) jri.m13152b((Object) str);
    }

    /* renamed from: a */
    public final kbd m4740a(String str, int i) {
        return m4742a(str, String.valueOf(i));
    }

    /* renamed from: a */
    public final kbd m4741a(String str, long j) {
        return m4742a(str, String.valueOf(j));
    }

    /* renamed from: a */
    public final kbe m4743a() {
        kbe kbe = new kbe();
        this.f8183c.f8186c = kbe;
        this.f8183c = kbe;
        return kbe;
    }

    /* renamed from: a */
    public final kbd m4742a(String str, Object obj) {
        kbe a = m4743a();
        a.f8185b = obj;
        a.f8184a = (String) jri.m13152b((Object) str);
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(this.f8181a);
        stringBuilder.append('{');
        kbe kbe = this.f8182b.f8186c;
        String str = "";
        while (kbe != null) {
            Object obj = kbe.f8185b;
            stringBuilder.append(str);
            str = kbe.f8184a;
            if (str != null) {
                stringBuilder.append(str);
                stringBuilder.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                stringBuilder.append(obj);
            } else {
                CharSequence deepToString = Arrays.deepToString(new Object[]{obj});
                stringBuilder.append(deepToString, 1, deepToString.length() - 1);
            }
            kbe = kbe.f8186c;
            str = ", ";
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

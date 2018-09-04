package p000;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jvi */
public final class jvi implements juk {
    /* renamed from: a */
    public final juk f19070a;
    /* renamed from: b */
    private final Map f19071b = khb.m4898c();

    public jvi(juk juk) {
        this.f19070a = juk;
    }

    /* renamed from: a */
    public final List mo2054a(List list) {
        List list2 = (List) this.f19071b.get(list);
        if (list2 != null) {
            return list2;
        }
        list2 = this.f19070a.mo2054a(list);
        this.f19071b.put(list, list2);
        return list2;
    }

    public final String toString() {
        String obj = this.f19070a.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 8);
        stringBuilder.append("cached[");
        stringBuilder.append(obj);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

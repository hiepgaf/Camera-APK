package p000;

import java.util.List;

/* renamed from: fqm */
final /* synthetic */ class fqm implements kaw {
    /* renamed from: a */
    private final fqh f16390a;
    /* renamed from: b */
    private final List f16391b;

    fqm(fqh fqh, List list) {
        this.f16390a = fqh;
        this.f16391b = list;
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        fqh fqh = this.f16390a;
        List list = this.f16391b;
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        int size = list.size();
        if (intValue >= 0 && intValue < size) {
            Object obj2 = null;
            size = 0;
            while (size < list.size()) {
                iwz iwz;
                if (size == num.intValue()) {
                    iwz = (iwz) list.get(size);
                } else {
                    ((fkp) list.get(size)).close();
                    iwz = obj2;
                }
                size++;
                iwz iwz2 = iwz;
            }
            jri.m13152b(obj2);
            return fqh.f21398e.f16379f.m2368a(obj2, (iqm) jri.m13152b(fqh.f21397d));
        }
        String a;
        String str = "index";
        if (intValue < 0) {
            a = jri.m13141a("%s (%s) must not be negative", str, Integer.valueOf(intValue));
        } else if (size < 0) {
            StringBuilder stringBuilder = new StringBuilder(26);
            stringBuilder.append("negative size: ");
            stringBuilder.append(size);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            a = jri.m13141a("%s (%s) must be less than size (%s)", str, Integer.valueOf(intValue), Integer.valueOf(size));
        }
        throw new IndexOutOfBoundsException(a);
    }
}

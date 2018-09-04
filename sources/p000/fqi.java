package p000;

import java.util.List;

/* renamed from: fqi */
final /* synthetic */ class fqi implements kaw {
    /* renamed from: a */
    private final fqh f16385a;
    /* renamed from: b */
    private final List f16386b;

    fqi(fqh fqh, List list) {
        this.f16385a = fqh;
        this.f16386b = list;
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        fqh fqh = this.f16385a;
        List list = this.f16386b;
        Integer num = (Integer) obj;
        for (int i = 0; i < list.size(); i++) {
            if (i != num.intValue()) {
                ((fkp) list.get(i)).close();
            }
        }
        frj a = fri.m10697a((fkp) list.get(num.intValue())).m2364a(fqh.f21398e.f16376c);
        a.f4666a = (iqm) jri.m13152b(fqh.f21397d);
        return a.m2363a();
    }
}

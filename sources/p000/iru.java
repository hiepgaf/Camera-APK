package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: iru */
public final class iru {
    /* renamed from: a */
    public List f7381a;

    public iru(List list) {
        this.f7381a = list;
    }

    /* renamed from: a */
    public static List m4135a(List list, iqf iqf) {
        List b = khb.m4885b();
        for (Object next : list) {
            if (((Boolean) iqf.mo1906a(next)).booleanValue()) {
                b.add(next);
            }
        }
        return !b.isEmpty() ? b : list;
    }
}

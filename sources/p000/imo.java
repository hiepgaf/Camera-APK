package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: imo */
final class imo implements kaw {
    /* renamed from: a */
    private Object f18367a;

    imo() {
    }

    /* renamed from: a */
    private final synchronized Object m12287a(List list) {
        Object obj;
        Object obj2 = list.get(0);
        int intValue = ((Integer) list.get(1)).intValue();
        obj = this.f18367a;
        if (obj == null || intValue == 0) {
            this.f18367a = obj2;
            obj = obj2;
        }
        return obj;
    }
}

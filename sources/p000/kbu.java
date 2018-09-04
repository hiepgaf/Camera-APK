package p000;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: kbu */
abstract class kbu extends kbv implements kfr {
    public static final long serialVersionUID = 6588350623831699109L;

    protected kbu(Map map) {
        super(map);
    }

    /* renamed from: b */
    abstract List mo3603b();

    /* renamed from: a */
    /* synthetic */ Collection mo3504a() {
        return mo3603b();
    }

    /* renamed from: a */
    public /* synthetic */ Collection mo3199a(Object obj) {
        return mo3604b(obj);
    }

    /* renamed from: b */
    public List mo3604b(Object obj) {
        return (List) super.mo3199a(obj);
    }

    /* renamed from: a */
    final Collection mo3505a(Object obj, Collection collection) {
        return m16444a(obj, (List) collection, null);
    }
}

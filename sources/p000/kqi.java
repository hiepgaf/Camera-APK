package p000;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: kqi */
final class kqi {
    /* renamed from: a */
    private final ConcurrentHashMap f8422a = new ConcurrentHashMap(16, 0.75f, 10);
    /* renamed from: b */
    private final ReferenceQueue f8423b = new ReferenceQueue();

    kqi() {
    }

    /* renamed from: a */
    public final List m5049a(Throwable th, boolean z) {
        Object poll = this.f8423b.poll();
        while (poll != null) {
            this.f8422a.remove(poll);
            poll = this.f8423b.poll();
        }
        List list = (List) this.f8422a.get(new kqj(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        list = (List) this.f8422a.putIfAbsent(new kqj(th, this.f8423b), vector);
        return list == null ? vector : list;
    }
}

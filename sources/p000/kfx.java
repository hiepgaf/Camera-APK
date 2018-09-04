package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: kfx */
abstract class kfx extends kgt {
    kfx() {
    }

    /* renamed from: a */
    abstract kft mo3214a();

    public void clear() {
        mo3214a().clear();
    }

    public boolean contains(Object obj) {
        return mo3214a().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return mo3214a().containsAll(collection);
    }

    public boolean isEmpty() {
        return mo3214a().isEmpty();
    }

    public boolean remove(Object obj) {
        return mo3214a().mo2109b(obj, LfuScheduler.MAX_PRIORITY) > 0;
    }

    public int size() {
        return mo3214a().mo2114g().size();
    }
}

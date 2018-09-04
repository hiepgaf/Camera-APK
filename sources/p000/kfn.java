package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kfn */
abstract class kfn extends kgt {
    kfn() {
    }

    /* renamed from: a */
    abstract Map mo3208a();

    public void clear() {
        mo3208a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object key = entry.getKey();
        Object b = khb.m4884b(mo3208a(), key);
        if (!kbf.m16436b(b, entry.getValue())) {
            return false;
        }
        if (b != null) {
            return true;
        }
        if (mo3208a().containsKey(key)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return mo3208a().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        return mo3208a().keySet().remove(((Entry) obj).getKey());
    }

    public boolean removeAll(Collection collection) {
        try {
            return super.removeAll((Collection) jri.m13152b((Object) collection));
        } catch (UnsupportedOperationException e) {
            return khb.m4882a((Set) this, collection.iterator());
        }
    }

    public boolean retainAll(Collection collection) {
        try {
            return super.retainAll((Collection) jri.m13152b((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection b = khb.m4886b(collection.size());
            for (Object next : collection) {
                if (contains(next)) {
                    b.add(((Entry) next).getKey());
                }
            }
            return mo3208a().keySet().retainAll(b);
        }
    }

    public int size() {
        return mo3208a().size();
    }
}

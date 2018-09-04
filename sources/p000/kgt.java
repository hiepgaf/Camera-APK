package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kgt */
abstract class kgt extends AbstractSet {
    kgt() {
    }

    public boolean removeAll(Collection collection) {
        return khb.m4881a((Set) this, collection);
    }

    public boolean retainAll(Collection collection) {
        return super.retainAll((Collection) jri.m13152b((Object) collection));
    }
}

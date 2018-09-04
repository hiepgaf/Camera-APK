package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kda */
public final class kda extends AbstractCollection {
    /* renamed from: a */
    private final Collection f8212a;
    /* renamed from: b */
    private final kaw f8213b;

    public kda(Collection collection, kaw kaw) {
        this.f8212a = (Collection) jri.m13152b((Object) collection);
        this.f8213b = (kaw) jri.m13152b((Object) kaw);
    }

    public final void clear() {
        this.f8212a.clear();
    }

    public final boolean isEmpty() {
        return this.f8212a.isEmpty();
    }

    public final Iterator iterator() {
        return khb.m4865a(this.f8212a.iterator(), this.f8213b);
    }

    public final int size() {
        return this.f8212a.size();
    }
}

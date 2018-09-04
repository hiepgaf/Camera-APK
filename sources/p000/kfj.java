package p000;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kfj */
public final class kfj extends AbstractSequentialList implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final kaw f8271a;
    /* renamed from: b */
    private final List f8272b;

    public kfj(List list, kaw kaw) {
        this.f8272b = (List) jri.m13152b((Object) list);
        this.f8271a = (kaw) jri.m13152b((Object) kaw);
    }

    public final void clear() {
        this.f8272b.clear();
    }

    public final ListIterator listIterator(int i) {
        return new kfk(this, this.f8272b.listIterator(i));
    }

    public final int size() {
        return this.f8272b.size();
    }
}

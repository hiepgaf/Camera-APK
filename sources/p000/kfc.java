package p000;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kfc */
final class kfc extends khy {
    /* renamed from: a */
    private boolean f19193a;
    /* renamed from: b */
    private final /* synthetic */ Object f19194b;

    kfc(Object obj) {
        this.f19194b = obj;
    }

    public final boolean hasNext() {
        return this.f19193a ^ 1;
    }

    public final Object next() {
        if (this.f19193a) {
            throw new NoSuchElementException();
        }
        this.f19193a = true;
        return this.f19194b;
    }
}

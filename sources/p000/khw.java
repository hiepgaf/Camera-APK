package p000;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* renamed from: khw */
final class khw {
    /* renamed from: a */
    public Object f8308a;

    khw() {
    }

    /* renamed from: a */
    public final void m4933a(Object obj, Object obj2) {
        if (this.f8308a != obj) {
            throw new ConcurrentModificationException();
        }
        this.f8308a = obj2;
    }
}

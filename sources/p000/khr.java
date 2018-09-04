package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: khr */
final class khr implements Iterator {
    /* renamed from: a */
    private khv f8293a = this.f8295c.m17768p();
    /* renamed from: b */
    private kfu f8294b = null;
    /* renamed from: c */
    private final /* synthetic */ kho f8295c;

    khr(kho kho) {
        this.f8295c = kho;
    }

    public final boolean hasNext() {
        khv khv = this.f8293a;
        if (khv == null) {
            return false;
        }
        if (!this.f8295c.f23424a.m4796c(khv.f8299a)) {
            return true;
        }
        this.f8293a = null;
        return false;
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            kfu khp = new khp(this.f8295c, this.f8293a);
            this.f8294b = khp;
            khv khv = this.f8293a.f8305g;
            if (khv == this.f8295c.f23425b) {
                this.f8293a = null;
            } else {
                this.f8293a = khv;
            }
            return khp;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        if (this.f8294b != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "no calls to next() since the last call to remove()");
        this.f8295c.mo2110c(this.f8294b.mo3240b(), 0);
        this.f8294b = null;
    }
}

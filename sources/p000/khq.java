package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: khq */
final class khq implements Iterator {
    /* renamed from: a */
    private khv f8290a = this.f8292c.m17767o();
    /* renamed from: b */
    private kfu f8291b;
    /* renamed from: c */
    private final /* synthetic */ kho f8292c;

    khq(kho kho) {
        this.f8292c = kho;
    }

    public final boolean hasNext() {
        khv khv = this.f8290a;
        if (khv == null) {
            return false;
        }
        if (!this.f8292c.f23424a.m4795b(khv.f8299a)) {
            return true;
        }
        this.f8290a = null;
        return false;
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            kfu khp = new khp(this.f8292c, this.f8290a);
            this.f8291b = khp;
            khv khv = this.f8290a.f8306h;
            if (khv == this.f8292c.f23425b) {
                this.f8290a = null;
            } else {
                this.f8290a = khv;
            }
            return khp;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        if (this.f8291b != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "no calls to next() since the last call to remove()");
        this.f8292c.mo2110c(this.f8291b.mo3240b(), 0);
        this.f8291b = null;
    }
}

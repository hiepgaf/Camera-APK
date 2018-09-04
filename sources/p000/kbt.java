package p000;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kbt */
public abstract class kbt extends khy {
    /* renamed from: a */
    private int f19156a = go.bS;
    /* renamed from: b */
    private Object f19157b;

    protected kbt() {
    }

    /* renamed from: a */
    protected abstract Object mo3238a();

    /* renamed from: b */
    protected final Object m13387b() {
        this.f19156a = go.bT;
        return null;
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f19156a != go.bU) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        switch (this.f19156a - 1) {
            case 0:
                return true;
            case 2:
                return false;
            default:
                this.f19156a = go.bU;
                this.f19157b = mo3238a();
                if (this.f19156a == go.bT) {
                    return false;
                }
                this.f19156a = go.bR;
                return true;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f19156a = go.bS;
            Object obj = this.f19157b;
            this.f19157b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}

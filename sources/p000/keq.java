package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: keq */
final class keq implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object[] f8255a;

    keq(Object[] objArr) {
        this.f8255a = objArr;
    }

    final Object readResolve() {
        return ken.m13460b(this.f8255a);
    }
}

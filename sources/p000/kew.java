package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kew */
final class kew implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object[] f8261a;

    kew(Object[] objArr) {
        this.f8261a = objArr;
    }

    final Object readResolve() {
        return keu.m13478a(this.f8261a);
    }
}

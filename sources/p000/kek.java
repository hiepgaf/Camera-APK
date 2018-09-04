package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kek */
final class kek extends kcl implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object f19183a;
    /* renamed from: b */
    private final Object f19184b;

    kek(Object obj, Object obj2) {
        this.f19183a = obj;
        this.f19184b = obj2;
    }

    public final Object getKey() {
        return this.f19183a;
    }

    public final Object getValue() {
        return this.f19184b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

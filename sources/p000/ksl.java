package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ksl */
final class ksl implements Entry {
    /* renamed from: a */
    public Entry f8529a;

    ksl(Entry entry) {
        this.f8529a = entry;
    }

    public final Object getKey() {
        return this.f8529a.getKey();
    }

    public final Object getValue() {
        if (((ksk) this.f8529a.getValue()) == null) {
            return null;
        }
        return ksk.m13884a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof kte) {
            ksk ksk = (ksk) this.f8529a.getValue();
            kte kte = (kte) obj;
            kte kte2 = ksk.f8532b;
            ksk.f8531a = null;
            ksk.f8533c = null;
            ksk.f8532b = kte;
            return kte2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

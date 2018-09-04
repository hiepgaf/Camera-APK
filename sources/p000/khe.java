package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: khe */
final class khe extends khi implements Entry {
    public static final long serialVersionUID = 0;

    khe(Entry entry, Object obj) {
        super(entry, obj);
    }

    /* renamed from: a */
    final /* synthetic */ Object mo2169a() {
        return (Entry) super.mo2169a();
    }

    public final boolean equals(Object obj) {
        boolean equals;
        synchronized (this.a) {
            equals = ((Entry) super.mo2169a()).equals(obj);
        }
        return equals;
    }

    public final Object getKey() {
        Object key;
        synchronized (this.a) {
            key = ((Entry) super.mo2169a()).getKey();
        }
        return key;
    }

    public final Object getValue() {
        Object value;
        synchronized (this.a) {
            value = ((Entry) super.mo2169a()).getValue();
        }
        return value;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.a) {
            hashCode = ((Entry) super.mo2169a()).hashCode();
        }
        return hashCode;
    }

    public final Object setValue(Object obj) {
        Object value;
        synchronized (this.a) {
            value = ((Entry) super.mo2169a()).setValue(obj);
        }
        return value;
    }
}

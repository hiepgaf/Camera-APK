package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kub */
final class kub implements Comparable, Entry {
    /* renamed from: a */
    public final Comparable f8563a;
    /* renamed from: b */
    private Object f8564b;
    /* renamed from: c */
    private final /* synthetic */ ktu f8565c;

    kub(ktu ktu, Comparable comparable, Object obj) {
        this.f8565c = ktu;
        this.f8563a = comparable;
        this.f8564b = obj;
    }

    kub(ktu ktu, Entry entry) {
        this(ktu, (Comparable) entry.getKey(), entry.getValue());
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f8563a.compareTo(((kub) obj).f8563a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (kub.m5295a(this.f8563a, entry.getKey()) && kub.m5295a(this.f8564b, entry.getValue())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5295a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    public final /* synthetic */ Object getKey() {
        return this.f8563a;
    }

    public final Object getValue() {
        return this.f8564b;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Comparable comparable = this.f8563a;
        if (comparable != null) {
            hashCode = comparable.hashCode();
        } else {
            hashCode = 0;
        }
        Object obj = this.f8564b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f8565c.m5288a();
        Object obj2 = this.f8564b;
        this.f8564b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8563a);
        String valueOf2 = String.valueOf(this.f8564b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("=");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }
}

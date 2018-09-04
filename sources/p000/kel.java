package p000;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kel */
final class kel extends keu {
    /* renamed from: a */
    private final transient EnumSet f22012a;
    /* renamed from: b */
    private transient int f22013b;

    kel(EnumSet enumSet) {
        this.f22012a = enumSet;
    }

    /* renamed from: a */
    static keu m16484a(EnumSet enumSet) {
        switch (enumSet.size()) {
            case 0:
                return kgn.f22045a;
            case 1:
                Iterator it = enumSet.iterator();
                Object next = it.next();
                if (!it.hasNext()) {
                    return keu.m13472a(next);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("expected one element but was: <");
                stringBuilder.append(next);
                for (int i = 0; i < 4 && it.hasNext(); i++) {
                    stringBuilder.append(", ");
                    stringBuilder.append(it.next());
                }
                if (it.hasNext()) {
                    stringBuilder.append(", ...");
                }
                stringBuilder.append('>');
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                return new kel(enumSet);
        }
    }

    public final boolean contains(Object obj) {
        return this.f22012a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof kel) {
            collection = ((kel) collection).f22012a;
        }
        return this.f22012a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kel) {
            obj = ((kel) obj).f22012a;
        }
        return this.f22012a.equals(obj);
    }

    public final int hashCode() {
        int i = this.f22013b;
        if (i != 0) {
            return i;
        }
        i = this.f22012a.hashCode();
        this.f22013b = i;
        return i;
    }

    public final boolean isEmpty() {
        return this.f22012a.isEmpty();
    }

    /* renamed from: d */
    final boolean mo3228d() {
        return true;
    }

    /* renamed from: b */
    final boolean mo3227b() {
        return false;
    }

    /* renamed from: c */
    public final khy mo2144c() {
        return khb.m4901d(this.f22012a.iterator());
    }

    public final /* synthetic */ Iterator iterator() {
        return mo2144c();
    }

    public final int size() {
        return this.f22012a.size();
    }

    public final String toString() {
        return this.f22012a.toString();
    }

    final Object writeReplace() {
        return new kem(this.f22012a);
    }
}

package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kso */
public final class kso extends kqr implements RandomAccess, ksp {
    /* renamed from: b */
    private final List f22474b;

    static {
        new kso().f19255a = false;
    }

    public kso() {
        this(10);
    }

    public kso(int i) {
        this(new ArrayList(i));
    }

    private kso(ArrayList arrayList) {
        this.f22474b = arrayList;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        m13650a();
        this.f22474b.add(i, str);
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo2307a(kqx kqx) {
        m13650a();
        this.f22474b.add(kqx);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        m13650a();
        if (collection instanceof ksp) {
            collection = ((ksp) collection).mo2309d();
        }
        boolean addAll = this.f22474b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: a */
    private static String m16680a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof kqx) {
            return ((kqx) obj).m5068d();
        }
        return ksd.m5136c((byte[]) obj);
    }

    public final void clear() {
        m13650a();
        this.f22474b.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f22474b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String d;
        if (obj instanceof kqx) {
            kqx kqx = (kqx) obj;
            d = kqx.m5068d();
            if (kqx.mo3267a()) {
                this.f22474b.set(i, d);
            }
            return d;
        }
        byte[] bArr = (byte[]) obj;
        d = ksd.m5136c(bArr);
        if (ksd.m5135b(bArr)) {
            this.f22474b.set(i, d);
        }
        return d;
    }

    /* renamed from: b */
    public final Object mo2308b(int i) {
        return this.f22474b.get(i);
    }

    /* renamed from: d */
    public final List mo2309d() {
        return Collections.unmodifiableList(this.f22474b);
    }

    /* renamed from: e */
    public final ksp mo2310e() {
        if (super.mo2211b()) {
            return new kui(this);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo2211b() {
        return super.mo2211b();
    }

    /* renamed from: a */
    public final /* synthetic */ ksg mo3254a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f22474b);
        return new kso(arrayList);
    }

    public final /* synthetic */ Object remove(int i) {
        m13650a();
        Object remove = this.f22474b.remove(i);
        this.modCount++;
        return kso.m16680a(remove);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        m13650a();
        return kso.m16680a(this.f22474b.set(i, str));
    }

    public final int size() {
        return this.f22474b.size();
    }
}

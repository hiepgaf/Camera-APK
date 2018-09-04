package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgw */
final class kgw extends keu {
    /* renamed from: a */
    private final transient Object f22053a;
    /* renamed from: b */
    private transient int f22054b;

    kgw(Object obj) {
        this.f22053a = jri.m13152b(obj);
    }

    kgw(Object obj, int i) {
        this.f22053a = obj;
        this.f22054b = i;
    }

    public final boolean contains(Object obj) {
        return this.f22053a.equals(obj);
    }

    /* renamed from: a */
    final int mo2142a(Object[] objArr, int i) {
        objArr[i] = this.f22053a;
        return i + 1;
    }

    /* renamed from: e */
    final ken mo3242e() {
        return ken.m13453a(this.f22053a);
    }

    public final int hashCode() {
        int i = this.f22054b;
        if (i != 0) {
            return i;
        }
        i = this.f22053a.hashCode();
        this.f22054b = i;
        return i;
    }

    /* renamed from: d */
    final boolean mo3228d() {
        return this.f22054b != 0;
    }

    /* renamed from: b */
    final boolean mo3227b() {
        return false;
    }

    /* renamed from: c */
    public final khy mo2144c() {
        return khb.m4875a(this.f22053a);
    }

    public final /* synthetic */ Iterator iterator() {
        return khb.m4875a(this.f22053a);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f22053a.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 2);
        stringBuilder.append('[');
        stringBuilder.append(obj);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

package p000;

import java.util.AbstractMap.SimpleImmutableEntry;

/* compiled from: PG */
/* renamed from: kgk */
final class kgk extends ken {
    /* renamed from: a */
    private final /* synthetic */ kgj f22039a;

    kgk(kgj kgj) {
        this.f22039a = kgj;
    }

    public final /* synthetic */ Object get(int i) {
        jri.m13138a(i, this.f22039a.f22037c);
        kgj kgj = this.f22039a;
        Object[] objArr = kgj.f22035a;
        int i2 = i + i;
        int i3 = kgj.f22036b;
        return new SimpleImmutableEntry(objArr[i2 + i3], objArr[(i3 ^ 1) + i2]);
    }

    /* renamed from: b */
    public final boolean mo3227b() {
        return true;
    }

    public final int size() {
        return this.f22039a.f22037c;
    }
}

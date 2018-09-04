package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: ker */
final class ker extends ken {
    /* renamed from: a */
    private final transient int f22015a;
    /* renamed from: b */
    private final transient int f22016b;
    /* renamed from: c */
    private final /* synthetic */ ken f22017c;

    ker(ken ken, int i, int i2) {
        this.f22017c = ken;
        this.f22015a = i;
        this.f22016b = i2;
    }

    public final Object get(int i) {
        jri.m13138a(i, this.f22016b);
        return this.f22017c.get(this.f22015a + i);
    }

    /* renamed from: b */
    final boolean mo3227b() {
        return true;
    }

    public final int size() {
        return this.f22016b;
    }

    /* renamed from: a */
    public final ken mo3233a(int i, int i2) {
        jri.m13142a(i, i2, this.f22016b);
        ken ken = this.f22017c;
        int i3 = this.f22015a;
        return ken.mo3233a(i + i3, i3 + i2);
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return mo3233a(i, i2);
    }
}

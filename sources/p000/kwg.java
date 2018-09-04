package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: kwg */
public final class kwg {
    /* renamed from: a */
    private final List f8734a;
    /* renamed from: b */
    private final List f8735b;

    kwg(int i, int i2) {
        this.f8734a = ktm.m13967a(i);
        this.f8735b = ktm.m13967a(i2);
    }

    /* renamed from: a */
    public final kwg m5477a(kwk kwk) {
        this.f8735b.add(kwk);
        return this;
    }

    /* renamed from: b */
    public final kwg m5478b(kwk kwk) {
        this.f8734a.add(kwk);
        return this;
    }

    /* renamed from: a */
    public final kwf m5476a() {
        return new kwf(this.f8734a, this.f8735b);
    }
}

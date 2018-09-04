package p000;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: iqr */
public final class iqr {
    /* renamed from: a */
    private final iqs f7333a;
    /* renamed from: b */
    private final ArrayList f7334b;
    /* renamed from: c */
    private int f7335c;
    /* renamed from: d */
    private int f7336d;

    public iqr(iqs iqs, int i) {
        this.f7333a = iqs;
        this.f7334b = new ArrayList(i);
        this.f7335c = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7334b.add(iqs.mo594a());
        }
        this.f7336d = i;
    }

    /* renamed from: a */
    public final Object m4053a() {
        int i = this.f7335c;
        if (i <= 0) {
            return this.f7333a.mo594a();
        }
        int i2 = i - 1;
        Object obj = this.f7334b.get(i2);
        this.f7334b.remove(i2);
        this.f7335c--;
        return obj;
    }

    /* renamed from: a */
    public final void m4054a(Object obj) {
        int i = this.f7335c;
        int i2 = this.f7336d;
        if (i == i2) {
            this.f7334b.ensureCapacity(i2 + i2);
            i = this.f7336d;
            this.f7336d = i + i;
        }
        this.f7334b.add(obj);
        this.f7335c++;
    }
}

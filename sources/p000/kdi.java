package p000;

/* compiled from: PG */
/* renamed from: kdi */
final class kdi extends kcl {
    /* renamed from: a */
    private final Object f19174a;
    /* renamed from: b */
    private int f19175b;
    /* renamed from: c */
    private final /* synthetic */ kdb f19176c;

    kdi(kdb kdb, int i) {
        this.f19176c = kdb;
        this.f19174a = kdb.f8215b[i];
        this.f19175b = i;
    }

    public final Object getKey() {
        return this.f19174a;
    }

    public final Object getValue() {
        m13420a();
        int i = this.f19175b;
        return i != -1 ? this.f19176c.f8216c[i] : null;
    }

    public final Object setValue(Object obj) {
        m13420a();
        int i = this.f19175b;
        if (i == -1) {
            this.f19176c.put(this.f19174a, obj);
            return null;
        }
        Object[] objArr = this.f19176c.f8216c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* renamed from: a */
    private final void m13420a() {
        int i = this.f19175b;
        if (i == -1 || i >= this.f19176c.size() || !kbf.m16436b(this.f19174a, this.f19176c.f8215b[this.f19175b])) {
            this.f19175b = this.f19176c.m4777a(this.f19174a);
        }
    }
}

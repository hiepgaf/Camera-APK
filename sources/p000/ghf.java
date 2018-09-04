package p000;

/* compiled from: PG */
/* renamed from: ghf */
public abstract class ghf {
    /* renamed from: a */
    public final ghd f5195a = new ghd(2);
    /* renamed from: b */
    public final Object f5196b = new Object();

    public ghf(int i) {
        jri.m13143a(true);
    }

    /* renamed from: a */
    protected abstract Object mo1483a(Object obj);

    /* renamed from: c */
    public final ghg m2551c(Object obj) {
        Object a;
        synchronized (this.f5196b) {
            a = this.f5195a.m2548a(obj);
        }
        if (a == null) {
            a = mo1483a(obj);
        }
        return new ghg(this, obj, a);
    }

    /* renamed from: b */
    protected Object mo1484b(Object obj) {
        return obj;
    }
}

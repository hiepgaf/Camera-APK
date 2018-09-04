package p000;

/* compiled from: PG */
/* renamed from: kwh */
public final class kwh implements kwa, kwk {
    /* renamed from: a */
    private static final Object f19325a = new Object();
    /* renamed from: b */
    private volatile kwk f19326b;
    /* renamed from: c */
    private volatile Object f19327c = f19325a;

    private kwh(kwk kwk) {
        this.f19326b = kwk;
    }

    /* renamed from: a */
    public final Object mo345a() {
        Object obj = this.f19327c;
        if (obj != f19325a) {
            return obj;
        }
        kwk kwk = this.f19326b;
        if (kwk == null) {
            return this.f19327c;
        }
        obj = kwk.mo345a();
        this.f19327c = obj;
        this.f19326b = null;
        return obj;
    }

    /* renamed from: a */
    public static kwk m14023a(kwk kwk) {
        return ((kwk instanceof kwh) || (kwk instanceof kwc)) ? kwk : new kwh((kwk) ktm.m13962a((Object) kwk));
    }
}

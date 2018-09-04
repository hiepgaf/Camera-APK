package p000;

/* compiled from: PG */
/* renamed from: kwc */
public final class kwc implements kwa, kwk {
    /* renamed from: a */
    private static final Object f19318a = new Object();
    /* renamed from: b */
    private volatile kwk f19319b;
    /* renamed from: c */
    private volatile Object f19320c = f19318a;

    private kwc(kwk kwk) {
        this.f19319b = kwk;
    }

    /* renamed from: a */
    public final Object mo345a() {
        Object obj = null;
        Object obj2 = this.f19320c;
        if (obj2 == f19318a) {
            synchronized (this) {
                obj2 = this.f19320c;
                if (obj2 == f19318a) {
                    obj2 = this.f19319b.mo345a();
                    Object obj3 = this.f19320c;
                    if (!(obj3 == f19318a || (obj3 instanceof kwe))) {
                        obj = 1;
                    }
                    if (obj == null || obj3 == obj2) {
                        this.f19320c = obj2;
                        this.f19319b = null;
                    } else {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj2);
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 118) + String.valueOf(valueOf2).length());
                        stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" & ");
                        stringBuilder.append(valueOf2);
                        stringBuilder.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
        }
        return obj2;
    }

    /* renamed from: a */
    public static kwa m14016a(kwk kwk) {
        if (kwk instanceof kwa) {
            return (kwa) kwk;
        }
        return new kwc((kwk) ktm.m13962a((Object) kwk));
    }

    /* renamed from: b */
    public static kwk m14017b(kwk kwk) {
        ktm.m13962a((Object) kwk);
        return kwk instanceof kwc ? kwk : new kwc(kwk);
    }
}

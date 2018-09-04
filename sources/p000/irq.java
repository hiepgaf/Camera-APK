package p000;

/* compiled from: PG */
/* renamed from: irq */
public final class irq {
    /* renamed from: a */
    public final kwk f7370a;
    /* renamed from: b */
    public final kwk f7371b;
    /* renamed from: c */
    public final kwk f7372c;
    /* renamed from: d */
    public final kwk f7373d;
    /* renamed from: e */
    public final kwk f7374e;
    /* renamed from: f */
    public final kwk f7375f;

    public irq(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f7370a = (kwk) irq.m4088a(kwk, 1);
        this.f7371b = (kwk) irq.m4088a(kwk2, 2);
        this.f7372c = (kwk) irq.m4088a(kwk3, 3);
        this.f7373d = (kwk) irq.m4088a(kwk4, 4);
        this.f7374e = (kwk) irq.m4088a(kwk5, 5);
        this.f7375f = (kwk) irq.m4088a(kwk6, 6);
    }

    /* renamed from: a */
    static Object m4088a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}

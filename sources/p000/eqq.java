package p000;

/* compiled from: PG */
/* renamed from: eqq */
public final class eqq {
    /* renamed from: a */
    public final kwk f4085a;
    /* renamed from: b */
    public final kwk f4086b;
    /* renamed from: c */
    public final kwk f4087c;

    public eqq(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f4085a = (kwk) eqq.m2014a(kwk, 1);
        this.f4086b = (kwk) eqq.m2014a(kwk2, 2);
        this.f4087c = (kwk) eqq.m2014a(kwk3, 3);
    }

    /* renamed from: a */
    static Object m2014a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}

package p000;

/* compiled from: PG */
/* renamed from: gmn */
public final class gmn {
    /* renamed from: a */
    public final kwk f5441a;
    /* renamed from: b */
    public final kwk f5442b;
    /* renamed from: c */
    public final kwk f5443c;
    /* renamed from: d */
    public final kwk f5444d;
    /* renamed from: e */
    public final kwk f5445e;
    /* renamed from: f */
    public final kwk f5446f;
    /* renamed from: g */
    public final kwk f5447g;
    /* renamed from: h */
    public final kwk f5448h;
    /* renamed from: i */
    public final kwk f5449i;
    /* renamed from: j */
    public final kwk f5450j;
    /* renamed from: k */
    public final kwk f5451k;
    /* renamed from: l */
    public final kwk f5452l;
    /* renamed from: m */
    public final kwk f5453m;

    public gmn(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13) {
        this.f5441a = (kwk) gmn.m2617a(kwk, 1);
        this.f5442b = (kwk) gmn.m2617a(kwk2, 2);
        this.f5443c = (kwk) gmn.m2617a(kwk3, 3);
        this.f5444d = (kwk) gmn.m2617a(kwk4, 4);
        this.f5445e = (kwk) gmn.m2617a(kwk5, 5);
        this.f5446f = (kwk) gmn.m2617a(kwk6, 6);
        this.f5447g = (kwk) gmn.m2617a(kwk7, 7);
        this.f5448h = (kwk) gmn.m2617a(kwk8, 8);
        this.f5449i = (kwk) gmn.m2617a(kwk9, 9);
        this.f5450j = (kwk) gmn.m2617a(kwk10, 10);
        this.f5451k = (kwk) gmn.m2617a(kwk11, 11);
        this.f5452l = (kwk) gmn.m2617a(kwk12, 12);
        this.f5453m = (kwk) gmn.m2617a(kwk13, 13);
    }

    /* renamed from: a */
    public static Object m2617a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}

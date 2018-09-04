package p000;

/* compiled from: PG */
/* renamed from: gmg */
public final class gmg {
    /* renamed from: a */
    public final kwk f5420a;
    /* renamed from: b */
    public final kwk f5421b;
    /* renamed from: c */
    public final kwk f5422c;
    /* renamed from: d */
    public final kwk f5423d;
    /* renamed from: e */
    public final kwk f5424e;
    /* renamed from: f */
    public final kwk f5425f;
    /* renamed from: g */
    public final kwk f5426g;
    /* renamed from: h */
    public final kwk f5427h;
    /* renamed from: i */
    public final kwk f5428i;
    /* renamed from: j */
    public final kwk f5429j;
    /* renamed from: k */
    public final kwk f5430k;
    /* renamed from: l */
    public final kwk f5431l;
    /* renamed from: m */
    public final kwk f5432m;
    /* renamed from: n */
    public final kwk f5433n;

    public gmg(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13, kwk kwk14) {
        this.f5420a = (kwk) gmg.m2616a(kwk, 1);
        this.f5421b = (kwk) gmg.m2616a(kwk2, 2);
        this.f5422c = (kwk) gmg.m2616a(kwk3, 3);
        this.f5423d = (kwk) gmg.m2616a(kwk4, 4);
        this.f5424e = (kwk) gmg.m2616a(kwk5, 5);
        this.f5425f = (kwk) gmg.m2616a(kwk6, 6);
        this.f5426g = (kwk) gmg.m2616a(kwk7, 7);
        this.f5427h = (kwk) gmg.m2616a(kwk8, 8);
        this.f5428i = (kwk) gmg.m2616a(kwk9, 9);
        this.f5429j = (kwk) gmg.m2616a(kwk10, 10);
        this.f5430k = (kwk) gmg.m2616a(kwk11, 11);
        this.f5431l = (kwk) gmg.m2616a(kwk12, 12);
        this.f5432m = (kwk) gmg.m2616a(kwk13, 13);
        this.f5433n = (kwk) gmg.m2616a(kwk14, 14);
    }

    /* renamed from: a */
    public static Object m2616a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}

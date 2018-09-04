package p000;

/* compiled from: PG */
/* renamed from: bkf */
public final class bkf {
    /* renamed from: a */
    public final kwk f1236a;
    /* renamed from: b */
    public final kwk f1237b;
    /* renamed from: c */
    public final kwk f1238c;
    /* renamed from: d */
    public final kwk f1239d;

    public bkf(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f1236a = (kwk) bkf.m845a(kwk, 1);
        this.f1237b = (kwk) bkf.m845a(kwk2, 2);
        this.f1238c = (kwk) bkf.m845a(kwk3, 3);
        this.f1239d = (kwk) bkf.m845a(kwk4, 4);
    }

    /* renamed from: a */
    public static Object m845a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}

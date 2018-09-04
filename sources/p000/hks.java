package p000;

/* compiled from: PG */
/* renamed from: hks */
public final class hks {
    /* renamed from: a */
    public final kwk f6309a;
    /* renamed from: b */
    public final kwk f6310b;
    /* renamed from: c */
    public final kwk f6311c;
    /* renamed from: d */
    public final kwk f6312d;

    public hks(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f6309a = (kwk) hks.m3231a(kwk, 1);
        this.f6310b = (kwk) hks.m3231a(kwk2, 2);
        this.f6311c = (kwk) hks.m3231a(kwk3, 3);
        this.f6312d = (kwk) hks.m3231a(kwk4, 4);
    }

    /* renamed from: a */
    public static Object m3231a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}

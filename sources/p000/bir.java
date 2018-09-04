package p000;

/* compiled from: PG */
/* renamed from: bir */
public final class bir {
    /* renamed from: a */
    public final kwk f1194a;
    /* renamed from: b */
    public final kwk f1195b;

    public bir(kwk kwk, kwk kwk2) {
        this.f1194a = (kwk) bir.m826a(kwk, 1);
        this.f1195b = (kwk) bir.m826a(kwk2, 2);
    }

    /* renamed from: a */
    public static Object m826a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}

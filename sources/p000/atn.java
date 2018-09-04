package p000;

/* compiled from: PG */
/* renamed from: atn */
public final class atn {
    /* renamed from: a */
    private final kwk f963a;
    /* renamed from: b */
    private final kwk f964b;

    public atn(kwk kwk, kwk kwk2) {
        this.f963a = (kwk) atn.m692a(kwk, 1);
        this.f964b = (kwk) atn.m692a(kwk2, 2);
    }

    /* renamed from: a */
    private static Object m692a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ atm m693a(ilp ilp) {
        return new aux((ikd) atn.m692a((ikd) this.f963a.mo345a(), 1), (atb) atn.m692a((atb) this.f964b.mo345a(), 2), (ilp) atn.m692a(ilp, 3));
    }
}

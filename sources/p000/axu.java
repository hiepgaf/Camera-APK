package p000;

/* compiled from: PG */
/* renamed from: axu */
public final class axu implements ayw {
    /* renamed from: a */
    private final kwk f10503a;

    public axu(kwk kwk) {
        this.f10503a = (kwk) axu.m7140a(kwk, 1);
    }

    /* renamed from: a */
    private static Object m7140a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ ayv mo391a(axp axp) {
        return new axt((fbg) axu.m7140a((fbg) this.f10503a.mo345a(), 1), (axp) axu.m7140a(axp, 2));
    }
}

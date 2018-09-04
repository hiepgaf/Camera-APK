package p000;

/* compiled from: PG */
/* renamed from: atj */
public final class atj implements asu {
    /* renamed from: a */
    private final kwk f10215a;

    public atj(kwk kwk) {
        this.f10215a = (kwk) atj.m6977a(kwk, 1);
    }

    /* renamed from: a */
    private static Object m6977a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ ast mo354a(asn asn, ffc ffc, ilp ilp, kbg kbg, ilp ilp2) {
        aso aso = (aso) atj.m6977a((aso) this.f10215a.mo345a(), 1);
        atj.m6977a(asn, 2);
        atj.m6977a(ffc, 3);
        atj.m6977a(ilp, 4);
        atj.m6977a(kbg, 5);
        atj.m6977a(ilp2, 6);
        return new ati(aso);
    }
}

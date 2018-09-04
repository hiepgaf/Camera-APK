package p000;

/* compiled from: PG */
/* renamed from: jyf */
public final class jyf implements jmu {
    /* renamed from: a */
    private final /* synthetic */ jyt f19111a;

    public jyf(jyt jyt) {
        this.f19111a = jyt;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2075a(Object obj, String str) {
        jwt jwt = new jwt((jwp) obj);
        this.f19111a.m4701a(String.format("row_distance_%s.csv", new Object[]{str}), new jwu(jwt));
        return jwt;
    }
}

package p000;

/* compiled from: PG */
/* renamed from: eoz */
public final class eoz implements kwk {
    /* renamed from: a */
    private final kwk f15322a;
    /* renamed from: b */
    private final kwk f15323b;
    /* renamed from: c */
    private final kwk f15324c;

    public eoz(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f15322a = kwk;
        this.f15323b = kwk2;
        this.f15324c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15322a;
        kwk kwk2 = this.f15323b;
        kwk kwk3 = this.f15324c;
        Object a = kwk.mo345a();
        Object obj = (enf) kwk2.mo345a();
        Object obj2 = (ikd) kwk3.mo345a();
        eol eol = (epa) a;
        jri.m13152b(obj2);
        jri.m13152b(obj);
        jri.m13152b((Object) eol);
        if (ikd.m12260b()) {
            obj.m9762a(eol);
        } else {
            obj2.execute(new eoo(obj, eol));
        }
        return (hjw) ktm.m13963a(eol, "Cannot return null from a non-@Nullable @Provides method");
    }
}

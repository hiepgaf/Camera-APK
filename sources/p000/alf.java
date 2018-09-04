package p000;

/* compiled from: PG */
/* renamed from: alf */
public final class alf implements ajz {
    /* renamed from: a */
    private static final adm f9873a = adm.m169a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
    /* renamed from: b */
    private final ajw f9874b;

    public alf() {
        this(null);
    }

    public alf(ajw ajw) {
        this.f9874b = ajw;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo88a(Object obj, int i, int i2, adp adp) {
        obj = (ajl) obj;
        ajw ajw = this.f9874b;
        if (ajw != null) {
            ajl ajl = (ajl) ajw.m314a(obj);
            if (ajl == null) {
                ajw = this.f9874b;
                ajw.f501a.m639b(ajy.m315a(obj), obj);
            } else {
                ajl ajl2 = ajl;
            }
        }
        return new aka(obj, new aeg(obj, ((Integer) adp.m6303a(f9873a)).intValue()));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo89a(Object obj) {
        return true;
    }
}

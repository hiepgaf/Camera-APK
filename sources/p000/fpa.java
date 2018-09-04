package p000;

/* compiled from: PG */
/* renamed from: fpa */
public final class fpa implements fre {
    /* renamed from: a */
    public static final String f16288a = bli.m862a("FBImgSavr");
    /* renamed from: b */
    public final Object f16289b = new Object();
    /* renamed from: c */
    public final img f16290c = new img(new fpb(this));
    /* renamed from: d */
    public int f16291d;
    /* renamed from: e */
    private final fre f16292e;
    /* renamed from: f */
    private final fre f16293f;
    /* renamed from: g */
    private final ilp f16294g;

    public fpa(fre fre, fre fre2) {
        this.f16292e = fre;
        this.f16293f = fre2;
        this.f16294g = ilq.m3814a(ilq.m3817a(fre.mo1413b(), new fpc(fre, fre2)));
    }

    /* renamed from: a */
    final void m10597a(Object obj, kpw kpw) {
        jri.m13152b(obj);
        synchronized (this.f16289b) {
            this.f16291d--;
        }
        kpw.mo3557a(obj);
        this.f16290c.m16083a();
    }

    /* renamed from: a */
    final /* synthetic */ Integer m10595a() {
        Integer valueOf;
        synchronized (this.f16289b) {
            valueOf = Integer.valueOf(this.f16291d);
        }
        return valueOf;
    }

    /* renamed from: b */
    public final ilp mo1413b() {
        return this.f16294g;
    }

    /* renamed from: a */
    public final kpk mo1412a(Object obj) {
        Object obj2;
        synchronized (this.f16289b) {
            this.f16291d++;
        }
        kpk d = kpw.m18056d();
        if (((Integer) this.f16292e.mo1413b().mo2860b()).intValue() > 0) {
            kow.m13622a(this.f16292e.mo1412a(obj), new fpd(this, d, obj), kpq.f8410a);
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            m10599b(obj, d);
        }
        this.f16290c.m16083a();
        return d;
    }

    /* renamed from: b */
    final void m10599b(Object obj, kpw kpw) {
        kow.m13622a(this.f16293f.mo1412a(obj), new fpe(this, kpw), kpq.f8410a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16292e);
        String valueOf2 = String.valueOf(this.f16293f);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length());
        stringBuilder.append("FallbackSingleImageSaver{primary: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", secondary: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

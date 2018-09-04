package p000;

/* compiled from: PG */
/* renamed from: cbb */
final class cbb implements kov {
    /* renamed from: a */
    private final /* synthetic */ int f11596a;
    /* renamed from: b */
    private final /* synthetic */ boolean f11597b;
    /* renamed from: c */
    private final /* synthetic */ String f11598c;
    /* renamed from: d */
    private final /* synthetic */ gdy f11599d;
    /* renamed from: e */
    private final /* synthetic */ kpw f11600e;
    /* renamed from: f */
    private final /* synthetic */ cau f11601f;

    cbb(cau cau, int i, boolean z, String str, gdy gdy, kpw kpw) {
        this.f11601f = cau;
        this.f11596a = i;
        this.f11597b = z;
        this.f11598c = str;
        this.f11599d = gdy;
        this.f11600e = kpw;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m866b(car.f20175a, "Error encoding jpeg image");
        this.f11600e.mo3557a(Boolean.valueOf(false));
    }

    public final /* synthetic */ void b_(Object obj) {
        try {
            this.f11601f.m16917a((foz) jri.m13152b((foz) obj), this.f11596a, this.f11597b, this.f11598c, null, this.f11599d);
            this.f11600e.mo3557a(Boolean.valueOf(true));
        } catch (Exception e) {
            String str = car.f20175a;
            String valueOf = String.valueOf(e.getMessage());
            String str2 = "Error attaching jpeg image to the session: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m866b(str, valueOf);
            this.f11600e.mo3557a(Boolean.valueOf(false));
        }
    }
}

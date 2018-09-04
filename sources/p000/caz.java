package p000;

/* compiled from: PG */
/* renamed from: caz */
final class caz implements kov {
    /* renamed from: a */
    private final /* synthetic */ cat f11589a;
    /* renamed from: b */
    private final /* synthetic */ hjo f11590b;
    /* renamed from: c */
    private final /* synthetic */ long f11591c;
    /* renamed from: d */
    private final /* synthetic */ cau f11592d;

    caz(cau cau, cat cat, hjo hjo, long j) {
        this.f11592d = cau;
        this.f11589a = cat;
        this.f11590b = hjo;
        this.f11591c = j;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f11590b.close();
        this.f11592d.m16918a(this.f11591c);
    }

    public final /* synthetic */ void b_(Object obj) {
        Boolean bool = (Boolean) obj;
        cau cau = this.f11592d;
        cau.f22634j = Boolean.TRUE.equals(bool) | cau.f22634j;
        if (!Boolean.TRUE.equals(bool)) {
            String str = car.f20175a;
            String valueOf = String.valueOf(this.f11589a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("Error encoding the image: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
        }
        this.f11590b.close();
        this.f11592d.m16918a(this.f11591c);
    }
}

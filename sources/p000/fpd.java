package p000;

/* compiled from: PG */
/* renamed from: fpd */
final class fpd implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f16298a;
    /* renamed from: b */
    private final /* synthetic */ Object f16299b;
    /* renamed from: c */
    private final /* synthetic */ fpa f16300c;

    fpd(fpa fpa, kpw kpw, Object obj) {
        this.f16300c = fpa;
        this.f16298a = kpw;
        this.f16299b = obj;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        String str = fpa.f16288a;
        String valueOf = String.valueOf(this.f16300c.f16292e);
        String valueOf2 = String.valueOf(this.f16300c.f16293f);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 56) + String.valueOf(valueOf2).length());
        stringBuilder.append("Primary image saver ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" failed, falling back to secondary: ");
        stringBuilder.append(valueOf2);
        bli.m874e(str, stringBuilder.toString(), th);
        this.f16300c.m10599b(this.f16299b, this.f16298a);
    }

    public final void b_(Object obj) {
        this.f16300c.m10597a(obj, this.f16298a);
    }
}

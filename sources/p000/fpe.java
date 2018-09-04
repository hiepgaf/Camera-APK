package p000;

/* compiled from: PG */
/* renamed from: fpe */
final class fpe implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f16301a;
    /* renamed from: b */
    private final /* synthetic */ fpa f16302b;

    fpe(fpa fpa, kpw kpw) {
        this.f16302b = fpa;
        this.f16301a = kpw;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        synchronized (this.f16302b.f16289b) {
            fpa fpa = this.f16302b;
            fpa.f16291d--;
        }
        String str = fpa.f16288a;
        String valueOf = String.valueOf(this.f16302b.f16293f);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
        stringBuilder.append("Secondary image saver ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" failed!");
        bli.m867b(str, stringBuilder.toString(), th);
        this.f16301a.m17780a(th);
        this.f16302b.f16290c.m16083a();
    }

    public final void b_(Object obj) {
        bli.m869c(fpa.f16288a, "secondary onSuccess");
        this.f16302b.m10597a(obj, this.f16301a);
    }
}

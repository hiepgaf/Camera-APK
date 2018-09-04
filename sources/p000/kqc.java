package p000;

/* compiled from: PG */
/* renamed from: kqc */
final class kqc extends kpi {
    /* renamed from: c */
    private final koi f19250c;
    /* renamed from: d */
    private final /* synthetic */ kqb f19251d;

    kqc(kqb kqb, koi koi) {
        this.f19251d = kqb;
        this.f19250c = (koi) jri.m13152b((Object) koi);
    }

    /* renamed from: a */
    final /* synthetic */ void mo2203a(Object obj, Throwable th) {
        kpk kpk = (kpk) obj;
        if (th == null) {
            this.f19251d.mo3616b(kpk);
        } else {
            this.f19251d.m17780a(th);
        }
    }

    /* renamed from: a */
    final boolean mo2204a() {
        return this.f19251d.isDone();
    }

    /* renamed from: b */
    final /* synthetic */ Object mo2205b() {
        return (kpk) jri.m13139a(this.f19250c.mo1128a(), (Object) "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)?");
    }

    /* renamed from: c */
    final String mo2206c() {
        return this.f19250c.toString();
    }
}

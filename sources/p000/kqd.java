package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: kqd */
final class kqd extends kpi {
    /* renamed from: c */
    private final Callable f19252c;
    /* renamed from: d */
    private final /* synthetic */ kqb f19253d;

    kqd(kqb kqb, Callable callable) {
        this.f19253d = kqb;
        this.f19252c = (Callable) jri.m13152b((Object) callable);
    }

    /* renamed from: a */
    final void mo2203a(Object obj, Throwable th) {
        if (th == null) {
            this.f19253d.mo3557a(obj);
        } else {
            this.f19253d.m17780a(th);
        }
    }

    /* renamed from: a */
    final boolean mo2204a() {
        return this.f19253d.isDone();
    }

    /* renamed from: b */
    final Object mo2205b() {
        return this.f19252c.call();
    }

    /* renamed from: c */
    final String mo2206c() {
        return this.f19252c.toString();
    }
}

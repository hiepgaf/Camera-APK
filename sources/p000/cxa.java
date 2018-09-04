package p000;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: cxa */
final class cxa implements kov {
    /* renamed from: a */
    private final /* synthetic */ bcl f12773a;
    /* renamed from: b */
    private final /* synthetic */ cwi f12774b;
    /* renamed from: c */
    private final /* synthetic */ ikb f12775c;
    /* renamed from: d */
    private final /* synthetic */ cwz f12776d;

    cxa(cwz cwz, bcl bcl, cwi cwi, ikb ikb) {
        this.f12776d = cwz;
        this.f12773a = bcl;
        this.f12774b = cwi;
        this.f12775c = ikb;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        if (th instanceof CancellationException) {
            bli.m869c(cwz.f12758a, "OneCamera open sequence was canceled, shutting down lifetime.");
        } else {
            bli.m874e(cwz.f12758a, "OneCamera failed to open, closing lifetime.", th);
        }
        this.f12775c.close();
        this.f12774b.m17780a(new isr("OneCamera failed to open"));
    }

    public final /* synthetic */ void b_(Object obj) {
        obj = (fbj) obj;
        jri.m13152b(obj);
        bli.m869c(cwz.f12758a, "OneCamera started!");
        cwz cwz = this.f12776d;
        cwz.f12761d = obj;
        cwz.f12760c = null;
        if (!this.f12773a.f10662a.get()) {
            cwi cwi = this.f12774b;
            cwz cwz2 = this.f12776d;
            cwi.m17848a(new cwh(cwz2.f12761d, this.f12775c, cwz2.f12763f, cwz2.f12764g));
        }
    }
}

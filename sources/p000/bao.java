package p000;

import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: PG */
/* renamed from: bao */
public final class bao extends bas {
    /* renamed from: a */
    private final kwk f10616a;
    /* renamed from: b */
    private final irs f10617b;

    public bao(kwk kwk, UncaughtExceptionHandler uncaughtExceptionHandler, irs irs) {
        super(uncaughtExceptionHandler);
        this.f10616a = kwk;
        this.f10617b = irs;
    }

    /* renamed from: a */
    protected final void mo418a(Throwable th) {
        grk grk = (grk) this.f10616a.mo345a();
        int i = grk == null ? 0 : grk.f5651b.size() > 0 ? ((epq) grk.f5651b.getLast()).f4046b : 0;
        this.f10617b.mo1595b(i);
    }
}

package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: csz */
public final class csz implements csj {
    /* renamed from: a */
    public final csj f12621a;
    /* renamed from: b */
    private final Executor f12622b = new cte();

    public csz(csj csj) {
        this.f12621a = csj;
    }

    /* renamed from: a */
    public final void mo666a(int i, cre cre) {
        this.f12622b.execute(new ctc(this, i, cre));
    }

    /* renamed from: b */
    public final void mo668b(int i, cre cre) {
        this.f12622b.execute(new ctd(this, i, cre));
    }

    /* renamed from: a */
    public final void mo667a(csk csk) {
        this.f12622b.execute(new ctb(this, csk));
    }

    /* renamed from: a */
    public final void mo665a() {
        this.f12622b.execute(new cta(this));
    }
}

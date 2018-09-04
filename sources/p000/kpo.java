package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kpo */
public final class kpo implements Executor {
    /* renamed from: a */
    public boolean f8405a = true;
    /* renamed from: b */
    private final /* synthetic */ Executor f8406b;
    /* renamed from: c */
    private final /* synthetic */ knk f8407c;

    public kpo(Executor executor, knk knk) {
        this.f8406b = executor;
        this.f8407c = knk;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f8406b.execute(new kpp(this, runnable));
        } catch (Throwable e) {
            if (this.f8405a) {
                this.f8407c.m17780a(e);
            }
        }
    }
}

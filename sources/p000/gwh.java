package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gwh */
public final class gwh implements kwk {
    /* renamed from: a */
    private final kwk f17463a;
    /* renamed from: b */
    private final kwk f17464b;

    public gwh(kwk kwk, kwk kwk2) {
        this.f17463a = kwk;
        this.f17464b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f17463a;
        Context context = (Context) kwk.mo345a();
        Executor executor = (Executor) this.f17464b.mo345a();
        kpw d = kpw.m18056d();
        executor.execute(new gwf(context, d));
        return (kpk) ktm.m13963a(d, "Cannot return null from a non-@Nullable @Provides method");
    }
}

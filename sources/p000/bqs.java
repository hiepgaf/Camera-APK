package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: bqs */
public final class bqs implements kwk {
    /* renamed from: a */
    private final kwk f11193a;

    public bqs(kwk kwk) {
        this.f11193a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (Executor) ktm.m13963a(new ikh((ikd) this.f11193a.mo345a(), Executors.newCachedThreadPool(iel.m3722d("FaceBeau", 0))), "Cannot return null from a non-@Nullable @Provides method");
    }
}

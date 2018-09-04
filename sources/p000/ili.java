package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ili */
final class ili implements iqt {
    /* renamed from: a */
    private Object f18347a = null;
    /* renamed from: b */
    private final /* synthetic */ Executor f18348b;
    /* renamed from: c */
    private final /* synthetic */ iqt f18349c;

    ili(Executor executor, iqt iqt) {
        this.f18348b = executor;
        this.f18349c = iqt;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        if (!kbf.m16436b(this.f18347a, obj)) {
            this.f18347a = obj;
            this.f18348b.execute(new ilj(this.f18349c, obj));
        }
    }
}

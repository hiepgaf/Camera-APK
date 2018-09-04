package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gcf */
final class gcf implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ iqt f5068a;
    /* renamed from: b */
    private final /* synthetic */ Executor f5069b;
    /* renamed from: c */
    private final /* synthetic */ gcc f5070c;

    gcf(gcc gcc, Executor executor, iqt iqt) {
        this.f5070c = gcc;
        this.f5069b = executor;
        this.f5068a = iqt;
    }

    public final void run() {
        this.f5069b.execute(new gcg(this, this.f5070c.f21440a.f5045e));
    }
}

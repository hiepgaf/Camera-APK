package p000;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: clx */
final class clx extends izy {
    /* renamed from: a */
    private final /* synthetic */ ExecutorService f20323a;
    /* renamed from: b */
    private final /* synthetic */ cls f20324b;

    clx(cls cls, ExecutorService executorService) {
        this.f20324b = cls;
        this.f20323a = executorService;
    }

    public final /* synthetic */ void a_(Object obj) {
        this.f20324b.f12162f.mo709b();
        this.f20323a.shutdown();
    }
}

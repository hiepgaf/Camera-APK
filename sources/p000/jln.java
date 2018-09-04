package p000;

/* compiled from: PG */
/* renamed from: jln */
final class jln implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Runnable f7916a;
    /* renamed from: b */
    private final /* synthetic */ jlm f7917b;

    jln(jlm jlm, Runnable runnable) {
        this.f7917b = jlm;
        this.f7916a = runnable;
    }

    public final void run() {
        if (this.f7917b.m12958a(this.f7916a)) {
            this.f7916a.run();
        }
    }
}

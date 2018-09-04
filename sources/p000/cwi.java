package p000;

/* compiled from: PG */
/* renamed from: cwi */
public final class cwi extends knk {
    /* renamed from: e */
    private final Runnable f23454e;

    public cwi(Runnable runnable) {
        this.f23454e = runnable;
    }

    public final boolean cancel(boolean z) {
        Runnable runnable = this.f23454e;
        if (runnable != null) {
            runnable.run();
        }
        return super.cancel(z);
    }

    /* renamed from: a */
    public final boolean m17848a(cwh cwh) {
        return super.mo3557a((Object) cwh);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo3557a(Object obj) {
        return super.mo3557a((cwh) obj);
    }
}

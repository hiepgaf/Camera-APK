package p000;

/* compiled from: PG */
/* renamed from: cpa */
final class cpa implements iqo {
    /* renamed from: a */
    private final /* synthetic */ cpj f12466a;

    cpa(cpj cpj) {
        this.f12466a = cpj;
    }

    public final void close() {
        this.f12466a.cancel(true);
    }
}

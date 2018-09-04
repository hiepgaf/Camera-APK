package p000;

/* compiled from: PG */
/* renamed from: hjo */
public final class hjo implements iqo {
    /* renamed from: a */
    private final /* synthetic */ hjn f17908a;

    hjo(hjn hjn) {
        this.f17908a = hjn;
        hjn.f6277a.incrementAndGet();
    }

    public final void close() {
        this.f17908a.f6277a.decrementAndGet();
    }
}

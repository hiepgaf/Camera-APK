package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ivk */
final class ivk extends iww {
    /* renamed from: a */
    private final AtomicBoolean f23383a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ ivj f23384b;

    ivk(ivj ivj, iwz iwz) {
        this.f23384b = ivj;
        super(iwz);
    }

    public final void close() {
        if (!this.f23383a.getAndSet(true)) {
            super.close();
            this.f23384b.m17605b();
        }
    }
}

package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fou */
public final class fou extends fkp {
    /* renamed from: a */
    private final fyr f23477a;
    /* renamed from: c */
    private final AtomicBoolean f23478c = new AtomicBoolean(false);

    public fou(fkp fkp, fyr fyr) {
        super(fkp);
        this.f23477a = fyr;
    }

    public final void close() {
        if (!this.f23478c.getAndSet(true)) {
            super.close();
            this.f23477a.close();
        }
    }
}

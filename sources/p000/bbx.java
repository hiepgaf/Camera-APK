package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bbx */
public final class bbx implements iqo {
    /* renamed from: a */
    public final ikb f10650a;
    /* renamed from: b */
    private final bbv f10651b;
    /* renamed from: c */
    private final AtomicBoolean f10652c = new AtomicBoolean(false);

    public bbx(bbv bbv, ikb ikb) {
        this.f10651b = bbv;
        this.f10650a = ikb;
    }

    public final void close() {
        if (!this.f10652c.getAndSet(true)) {
            this.f10651b.execute(new bby(this));
            this.f10651b.close();
        }
    }
}

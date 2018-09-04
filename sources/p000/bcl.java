package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bcl */
public final class bcl implements iqo {
    /* renamed from: a */
    public AtomicBoolean f10662a = new AtomicBoolean(false);

    public final void close() {
        this.f10662a.set(true);
    }
}

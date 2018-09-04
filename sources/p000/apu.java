package p000;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: apu */
public final class apu {
    /* renamed from: a */
    public static final agk f839a = new agk(Object.class, Object.class, Object.class, Collections.singletonList(new afk(Object.class, Object.class, Object.class, Collections.emptyList(), new aor(), null)), null);
    /* renamed from: b */
    public final ih f840b = new ih();
    /* renamed from: c */
    private final AtomicReference f841c = new AtomicReference();

    /* renamed from: a */
    public final agk m553a(Class cls, Class cls2, Class cls3) {
        arp arp;
        agk agk;
        arp arp2 = (arp) this.f841c.getAndSet(null);
        if (arp2 == null) {
            arp = new arp();
        } else {
            arp = arp2;
        }
        arp.m643a(cls, cls2, cls3);
        synchronized (this.f840b) {
            agk = (agk) this.f840b.get(arp);
        }
        this.f841c.set(arp);
        return agk;
    }
}

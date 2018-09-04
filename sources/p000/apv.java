package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: apv */
public final class apv {
    /* renamed from: a */
    public final ih f842a = new ih();
    /* renamed from: b */
    private final AtomicReference f843b = new AtomicReference();

    /* renamed from: a */
    public final List m554a(Class cls, Class cls2) {
        Object arp;
        List list;
        arp arp2 = (arp) this.f843b.getAndSet(null);
        if (arp2 == null) {
            arp = new arp(cls, cls2);
        } else {
            arp2.m643a(cls, cls2, null);
            arp arp3 = arp2;
        }
        synchronized (this.f842a) {
            list = (List) this.f842a.get(arp);
        }
        this.f843b.set(arp);
        return list;
    }
}

package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: jzo */
public final class jzo implements jzt {
    /* renamed from: a */
    private final AtomicInteger f19129a = new AtomicInteger(0);
    /* renamed from: b */
    private final jzt f19130b;

    public jzo(jzt jzt) {
        jri.m13152b((Object) jzt);
        this.f19130b = jzt;
    }

    /* renamed from: a */
    public final void mo2045a(Exception exception) {
        this.f19130b.mo2045a(exception);
    }

    /* renamed from: a */
    public final void mo2044a() {
        if (this.f19129a.getAndIncrement() == 0) {
            this.f19130b.mo2044a();
        }
    }

    /* renamed from: b */
    public final void mo2046b() {
        if (this.f19129a.decrementAndGet() == 0) {
            this.f19130b.mo2046b();
        }
    }
}

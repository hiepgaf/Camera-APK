package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: kac */
abstract class kac implements kai {
    /* renamed from: a */
    private final kad f21997a;
    /* renamed from: b */
    private final AtomicInteger f21998b = new AtomicInteger(0);

    public kac(jzx jzx) {
        jri.m13152b((Object) jzx);
        this.f21997a = new kad(jzx);
        jzu.f8162a.m4721b(this);
    }

    /* renamed from: a */
    protected abstract void mo3502a(jzx jzx);

    protected kac(kac kac) {
        if (kac.f21998b.get() != 0) {
            throw new IllegalStateException("Attempting to interact with an invalid handle!");
        }
        this.f21997a = kac.f21997a;
        this.f21997a.f8165a.incrementAndGet();
        jzu.f8162a.m4721b(this);
    }

    public void close() {
        this.f21998b.compareAndSet(0, 1);
        if (this.f21998b.compareAndSet(1, 2)) {
            jzu.f8162a.m4720a(this);
            kad kad = this.f21997a;
            int decrementAndGet = kad.f8165a.decrementAndGet();
            if (decrementAndGet == 0) {
                if (kad.f8167c) {
                    kad.f8166b.mo3190d();
                }
                mo3502a(kad.f8166b);
            } else if (decrementAndGet < 0) {
                throw new IllegalStateException("Reference count dropped below zero");
            }
        }
    }

    /* renamed from: d */
    public Object mo3190d() {
        if (this.f21998b.compareAndSet(0, 1)) {
            kad kad = this.f21997a;
            kad.f8167c = true;
            return kad.f8166b.mo3191e();
        }
        throw new IllegalStateException("Attempting to interact with an invalid handle!");
    }

    /* renamed from: e */
    public Object mo3191e() {
        if (this.f21998b.get() == 0) {
            return this.f21997a.f8166b.mo3191e();
        }
        throw new IllegalStateException("Attempting to interact with an invalid handle!");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f21997a.f8166b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 13);
        stringBuilder.append("ref-counted[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

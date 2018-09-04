package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jzw */
public abstract class jzw implements jzx, kae {
    /* renamed from: a */
    private final AtomicReference f21995a;

    public jzw(Object obj) {
        jri.m13152b(obj);
        this.f21995a = new AtomicReference(obj);
        jzu.f8162a.m4721b(this);
    }

    /* renamed from: a */
    public abstract void mo3497a(Object obj);

    public jzw(Object obj, byte b) {
        this(obj);
    }

    public void close() {
        Object andSet = this.f21995a.getAndSet(null);
        if (andSet != null) {
            jzu.f8162a.m4720a(this);
            mo3497a(andSet);
        }
    }

    /* renamed from: d */
    public final Object mo3190d() {
        Object andSet = this.f21995a.getAndSet(null);
        if (andSet == null) {
            throw new IllegalStateException("Attempting to interact with disposed value!");
        }
        jzu.f8162a.m4720a(this);
        return andSet;
    }

    /* renamed from: e */
    public final Object mo3191e() {
        Object obj = this.f21995a.get();
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Attempting to interact with disposed value!");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f21995a.get());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append("single-owner[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

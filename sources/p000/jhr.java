package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jhr */
public abstract class jhr implements jhs {
    /* renamed from: a */
    private final AtomicReference f23399a;

    public jhr(Object obj) {
        jri.m13152b(obj);
        this.f23399a = new AtomicReference(obj);
    }

    /* renamed from: a */
    public abstract void mo3588a(Object obj);

    public final void close() {
        Object d = m17661d();
        if (d != null) {
            mo3588a(d);
        }
    }

    /* renamed from: a */
    public final jas mo3162a() {
        close();
        return jas.m12717d();
    }

    /* renamed from: b */
    public final Object mo3494b() {
        Object d = m17661d();
        if (d != null) {
            return d;
        }
        throw new jhu();
    }

    /* renamed from: c */
    public final Object mo3495c() {
        Object obj = this.f23399a.get();
        if (obj != null) {
            return obj;
        }
        throw new jhu();
    }

    /* renamed from: d */
    public final Object m17661d() {
        return this.f23399a.getAndSet(null);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f23399a.get());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append("single-owner[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

package p000;

import java.util.Queue;

/* compiled from: PG */
/* renamed from: ajy */
public final class ajy {
    /* renamed from: a */
    private static final Queue f502a = arq.m652a(0);
    /* renamed from: b */
    private int f503b;
    /* renamed from: c */
    private int f504c;
    /* renamed from: d */
    private Object f505d;

    private ajy() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajy)) {
            return false;
        }
        if (this.f505d.equals(((ajy) obj).f505d)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static ajy m315a(Object obj) {
        ajy ajy;
        synchronized (f502a) {
            ajy = (ajy) f502a.poll();
        }
        if (ajy == null) {
            ajy = new ajy();
        }
        ajy.f505d = obj;
        ajy.f504c = 0;
        ajy.f503b = 0;
        return ajy;
    }

    public final int hashCode() {
        return this.f505d.hashCode() + 0;
    }

    /* renamed from: a */
    public final void m316a() {
        synchronized (f502a) {
            f502a.offer(this);
        }
    }
}

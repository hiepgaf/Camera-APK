package p000;

import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jtq */
public abstract class jtq implements jtv {
    /* renamed from: a */
    public final TreeSet f19041a = new TreeSet();
    /* renamed from: b */
    public final TreeSet f19042b = new TreeSet();
    /* renamed from: c */
    public final Object f19043c = new Object();
    /* renamed from: d */
    private final jvx f19044d;
    /* renamed from: e */
    private final jtr f19045e = new jtr(this);

    public jtq(jvx jvx) {
        jri.m13152b((Object) jvx);
        this.f19044d = jvx;
        this.f19044d.m16375a(this.f19045e);
    }

    /* renamed from: b */
    public final void mo2051b(long j) {
    }

    /* renamed from: c */
    public final void mo2052c(long j) {
    }

    /* renamed from: a */
    public final void mo2050a() {
        synchronized (this.f19043c) {
            this.f19041a.clear();
            this.f19042b.clear();
        }
    }
}

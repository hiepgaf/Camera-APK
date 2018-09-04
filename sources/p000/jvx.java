package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jvx */
public class jvx implements jwa {
    /* renamed from: a */
    private final jwa f21971a;
    /* renamed from: b */
    private final Set f21972b = new HashSet();

    public jvx(jwa jwa) {
        jri.m13152b((Object) jwa);
        this.f21971a = jwa;
    }

    /* renamed from: a */
    public final synchronized void m16375a(jwc jwc) {
        this.f21972b.add(jwc);
    }

    /* renamed from: a */
    public final Set mo3186a() {
        return this.f21971a.mo3186a();
    }

    /* renamed from: a */
    public final void mo2034a(long j) {
        this.f21971a.mo2034a(j);
        synchronized (this) {
            for (jwc a : this.f21972b) {
                a.mo2034a(j);
            }
        }
    }

    /* renamed from: b */
    public final void mo2035b(long j) {
        this.f21971a.mo2035b(j);
        synchronized (this) {
            for (jwc b : this.f21972b) {
                b.mo2035b(j);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m16378b(jwc jwc) {
        this.f21972b.remove(jwc);
    }

    /* renamed from: b */
    public final kbg mo3187b() {
        return this.f21971a.mo3187b();
    }

    /* renamed from: c */
    public final void mo3188c() {
        this.f21971a.mo3188c();
    }

    /* renamed from: d */
    public final long mo3189d() {
        return this.f21971a.mo3189d();
    }
}

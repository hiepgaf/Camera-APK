package p000;

import java.io.Writer;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: jwf */
public final class jwf implements jwa {
    /* renamed from: a */
    public final Writer f21987a;
    /* renamed from: b */
    private final jwa f21988b;
    /* renamed from: c */
    private final ExecutorService f21989c = Executors.newSingleThreadExecutor();

    public jwf(jwa jwa, Writer writer) {
        this.f21988b = jwa;
        this.f21987a = writer;
    }

    /* renamed from: a */
    public final Set mo3186a() {
        return this.f21988b.mo3186a();
    }

    /* renamed from: a */
    private final void m16402a(String str, long j) {
        this.f21989c.execute(new jwg(this, str, j));
    }

    /* renamed from: a */
    public final void mo2034a(long j) {
        this.f21988b.mo2034a(j);
        m16402a("ON_DROPPED", j);
    }

    /* renamed from: b */
    public final void mo2035b(long j) {
        m16402a("ON_INSERTED", j);
        this.f21988b.mo2035b(j);
    }

    /* renamed from: b */
    public final kbg mo3187b() {
        return this.f21988b.mo3187b();
    }

    /* renamed from: c */
    public final void mo3188c() {
        m16402a("RESET", 0);
        this.f21988b.mo3188c();
    }

    /* renamed from: d */
    public final long mo3189d() {
        long d = this.f21988b.mo3189d();
        m16402a("SELECT", d);
        return d;
    }
}

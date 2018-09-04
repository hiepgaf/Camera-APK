package p000;

/* compiled from: PG */
/* renamed from: gql */
public final class gql {
    /* renamed from: a */
    public int f5629a = go.be;
    /* renamed from: b */
    private final gqn f5630b;
    /* renamed from: c */
    private gqn f5631c;
    /* renamed from: d */
    private boolean f5632d;

    public gql(gqn gqn, boolean z) {
        this.f5631c = gqn;
        this.f5630b = gqn;
        this.f5632d = z;
    }

    /* renamed from: a */
    public final void m2729a() {
        boolean z;
        if (this.f5629a == go.bg) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        this.f5631c = this.f5630b;
    }

    /* renamed from: b */
    public final void m2731b() {
        if (this.f5629a == go.bg) {
            if (!this.f5632d) {
                this.f5631c = this.f5630b;
            }
            ((gqn) jqk.m13102c(this.f5631c)).mo1562a();
            this.f5629a = go.bf;
        }
    }

    /* renamed from: c */
    public final void m2732c() {
        if (this.f5629a == go.bf) {
            ((gqn) jqk.m13102c(this.f5631c)).mo1563b();
            this.f5629a = go.bg;
        }
    }

    /* renamed from: d */
    public final void m2733d() {
        jri.m13139a(this.f5631c, (Object) "A state must be set before exiting it");
        this.f5631c.mo1563b();
        this.f5631c = null;
    }

    /* renamed from: e */
    public final gqn m2734e() {
        if (this.f5629a != go.bf) {
            return null;
        }
        return this.f5631c;
    }

    /* renamed from: f */
    public final boolean m2735f() {
        return this.f5629a != go.be;
    }

    /* renamed from: a */
    public final void m2730a(gqn gqn) {
        boolean z;
        jri.m13152b((Object) gqn);
        if (this.f5631c == null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Setting new state without first exiting current state");
        if (this.f5629a == go.be) {
            this.f5629a = go.bf;
        }
        this.f5631c = gqn;
        this.f5631c.mo1562a();
    }
}

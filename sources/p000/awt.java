package p000;

/* compiled from: PG */
/* renamed from: awt */
public final class awt implements aws, eoc, eof, eoh, eoj, eok {
    /* renamed from: a */
    public static final String f10449a = bli.m862a("ActivityLifetime");
    /* renamed from: b */
    public final Object f10450b = new Object();
    /* renamed from: c */
    public final bam f10451c;
    /* renamed from: d */
    public ikb f10452d = this.f10451c.mo413a(this.f10453e);
    /* renamed from: e */
    public ikb f10453e = this.f10451c.mo415b(this.f10454f);
    /* renamed from: f */
    public ikb f10454f = this.f10451c.mo412a();
    /* renamed from: g */
    public bcl f10455g = ((bcl) this.f10452d.mo1879a(new bcl()));
    /* renamed from: h */
    public bcl f10456h = ((bcl) this.f10453e.mo1879a(new bcl()));
    /* renamed from: i */
    public bcl f10457i = ((bcl) this.f10454f.mo1879a(new bcl()));

    private awt(bam bam) {
        this.f10451c = bam;
    }

    /* renamed from: a */
    public static awt m7100a(ivw ivw) {
        jri.m13152b((Object) ivw);
        jri.m13143a(ivw instanceof bam);
        return new awt((bam) ivw);
    }

    /* renamed from: a */
    public final iji mo373a() {
        iji iji;
        synchronized (this.f10450b) {
            iji = this.f10454f;
        }
        return iji;
    }

    /* renamed from: b */
    public final iji mo374b() {
        iji iji;
        synchronized (this.f10450b) {
            iji = this.f10453e;
        }
        return iji;
    }

    /* renamed from: c */
    public final boolean mo375c() {
        boolean z;
        synchronized (this.f10450b) {
            z = this.f10455g.f10662a.get();
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo376d() {
        boolean z;
        synchronized (this.f10450b) {
            z = this.f10457i.f10662a.get();
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo377e() {
        boolean z;
        synchronized (this.f10450b) {
            z = this.f10456h.f10662a.get();
        }
        return z;
    }

    /* renamed from: f */
    public final void mo378f() {
        synchronized (this.f10450b) {
            bli.m863a(f10449a, "onDestroy()");
            this.f10454f.close();
        }
    }

    /* renamed from: g */
    public final void mo379g() {
        synchronized (this.f10450b) {
            bli.m863a(f10449a, "onPause()");
            this.f10452d.close();
        }
    }

    /* renamed from: h */
    public final void mo380h() {
        synchronized (this.f10450b) {
            bli.m863a(f10449a, "onResume()");
            if (mo375c()) {
                this.f10452d = this.f10451c.mo413a(this.f10453e);
                this.f10455g = (bcl) this.f10452d.mo1879a(new bcl());
            }
        }
    }

    /* renamed from: i */
    public final void mo381i() {
        synchronized (this.f10450b) {
            bli.m863a(f10449a, "onStart()");
            if (mo377e()) {
                this.f10453e = this.f10451c.mo415b(this.f10454f);
                this.f10456h = (bcl) this.f10453e.mo1879a(new bcl());
                this.f10452d = this.f10451c.mo413a(this.f10453e);
                this.f10455g = (bcl) this.f10452d.mo1879a(new bcl());
            }
        }
    }

    /* renamed from: j */
    public final void mo382j() {
        synchronized (this.f10450b) {
            bli.m863a(f10449a, "onStop()");
            this.f10453e.close();
        }
    }
}

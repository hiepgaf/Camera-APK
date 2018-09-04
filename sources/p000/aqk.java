package p000;

/* compiled from: PG */
/* renamed from: aqk */
public final class aqk implements aqb, aqc {
    /* renamed from: a */
    public aqb f10157a;
    /* renamed from: b */
    public aqb f10158b;
    /* renamed from: c */
    private final aqc f10159c;
    /* renamed from: d */
    private boolean f10160d;

    aqk() {
        this(null);
    }

    public aqk(aqc aqc) {
        this.f10159c = aqc;
    }

    /* renamed from: b */
    public final void mo324b() {
        this.f10160d = true;
        if (!(this.f10157a.mo327e() || this.f10158b.mo329g())) {
            this.f10158b.mo324b();
        }
        if (this.f10160d && !this.f10157a.mo329g()) {
            this.f10157a.mo324b();
        }
    }

    /* renamed from: b */
    public final boolean mo333b(aqb aqb) {
        aqc aqc = this.f10159c;
        boolean z = aqc != null ? aqc.mo333b(this) : true;
        if (z && aqb.equals(this.f10157a)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo334c(aqb aqb) {
        aqc aqc = this.f10159c;
        boolean z = aqc != null ? aqc.mo334c(this) : true;
        if (z && aqb.equals(this.f10157a) && !mo332a()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo335d(aqb aqb) {
        boolean z = false;
        aqc aqc = this.f10159c;
        boolean z2 = aqc != null ? aqc.mo335d(this) : true;
        if (z2) {
            if (aqb.equals(this.f10157a)) {
                z = true;
            } else if (!this.f10157a.mo328f()) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void mo325c() {
        this.f10160d = false;
        this.f10158b.mo325c();
        this.f10157a.mo325c();
    }

    /* renamed from: a */
    public final boolean mo332a() {
        boolean z;
        aqc aqc = this.f10159c;
        if (aqc == null) {
            z = false;
        } else if (aqc.mo332a()) {
            z = true;
        } else {
            z = false;
        }
        if (z || mo328f()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo326d() {
        return this.f10157a.mo326d();
    }

    /* renamed from: e */
    public final boolean mo327e() {
        return this.f10157a.mo327e() || this.f10158b.mo327e();
    }

    /* renamed from: a */
    public final boolean mo323a(aqb aqb) {
        if (!(aqb instanceof aqk)) {
            return false;
        }
        aqk aqk = (aqk) aqb;
        aqb aqb2 = this.f10157a;
        if (aqb2 != null) {
            if (!aqb2.mo323a(aqk.f10157a)) {
                return false;
            }
        } else if (aqk.f10157a != null) {
            return false;
        }
        aqb2 = this.f10158b;
        if (aqb2 != null) {
            if (!aqb2.mo323a(aqk.f10158b)) {
                return false;
            }
        } else if (aqk.f10158b != null) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo328f() {
        return this.f10157a.mo328f() || this.f10158b.mo328f();
    }

    /* renamed from: g */
    public final boolean mo329g() {
        return this.f10157a.mo329g();
    }

    /* renamed from: e */
    public final void mo336e(aqb aqb) {
        if (aqb.equals(this.f10157a)) {
            aqc aqc = this.f10159c;
            if (aqc != null) {
                aqc.mo336e(this);
            }
        }
    }

    /* renamed from: f */
    public final void mo337f(aqb aqb) {
        if (!aqb.equals(this.f10158b)) {
            aqc aqc = this.f10159c;
            if (aqc != null) {
                aqc.mo337f(this);
            }
            if (!this.f10158b.mo327e()) {
                this.f10158b.mo325c();
            }
        }
    }

    /* renamed from: h */
    public final void mo330h() {
        this.f10160d = false;
        this.f10157a.mo330h();
        this.f10158b.mo330h();
    }

    /* renamed from: i */
    public final void mo331i() {
        this.f10157a.mo331i();
        this.f10158b.mo331i();
    }
}

package p000;

/* compiled from: PG */
/* renamed from: esq */
public final class esq implements eof, eoh, eth {
    /* renamed from: a */
    private final etc f21320a;
    /* renamed from: b */
    private volatile eti f21321b = eti.MICROVIDEO_MODE_OFF;
    /* renamed from: c */
    private final bmb f21322c;
    /* renamed from: d */
    private Runnable f21323d;
    /* renamed from: e */
    private Runnable f21324e;

    public esq(etc etc, bmb bmb) {
        this.f21320a = etc;
        this.f21322c = bmb;
    }

    /* renamed from: a */
    public final eti mo3022a() {
        return this.f21321b;
    }

    /* renamed from: g */
    public final void mo379g() {
        this.f21320a.mo1288b((eth) this);
        mo3026c();
    }

    /* renamed from: h */
    public final void mo380h() {
        this.f21320a.mo1283a((eth) this);
        this.f21320a.mo1285a(this.f21321b.m2111a());
    }

    /* renamed from: a */
    public final void mo3023a(eti eti) {
        this.f21321b = eti;
        this.f21320a.mo1285a(eti.m2111a());
        if (eti.m2111a()) {
            switch (eti.ordinal()) {
                case 1:
                    this.f21320a.mo1284a(ezj.TRIMMING_MODE_AUTO);
                    return;
                case 2:
                    this.f21320a.mo1284a(ezj.TRIMMING_MODE_NEVER_DROP);
                    return;
                default:
                    String valueOf = String.valueOf(eti);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    stringBuilder.append("Unknown enabled microvideo mode: ");
                    stringBuilder.append(valueOf);
                    throw new RuntimeException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo3025b() {
        if (this.f21321b != eti.MICROVIDEO_MODE_OFF) {
            Runnable runnable = this.f21323d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: c */
    public final void mo3026c() {
        Runnable runnable = this.f21324e;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: d */
    public final boolean mo3027d() {
        bsn bsn = this.f21322c.f1307a;
        return true;
    }

    /* renamed from: a */
    public final void mo3024a(Runnable runnable, Runnable runnable2) {
        this.f21323d = runnable;
        this.f21324e = runnable2;
    }
}

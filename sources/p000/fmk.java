package p000;

/* compiled from: PG */
/* renamed from: fmk */
public final class fmk {
    /* renamed from: a */
    public fmd f4624a;
    /* renamed from: b */
    public fmn f4625b;
    /* renamed from: c */
    public ble f4626c;
    /* renamed from: d */
    public bbz f4627d;
    /* renamed from: e */
    public fln f4628e;

    fmk() {
    }

    /* renamed from: a */
    public final fmm m2342a() {
        if (this.f4624a == null) {
            throw new IllegalStateException(String.valueOf(fmd.class.getCanonicalName()).concat(" must be set"));
        } else if (this.f4625b == null) {
            throw new IllegalStateException(String.valueOf(fmn.class.getCanonicalName()).concat(" must be set"));
        } else {
            if (this.f4626c == null) {
                this.f4626c = new ble();
            }
            if (this.f4627d == null) {
                this.f4627d = new bbz();
            }
            if (this.f4628e != null) {
                return new fmj(this);
            }
            throw new IllegalStateException(String.valueOf(fln.class.getCanonicalName()).concat(" must be set"));
        }
    }

    /* renamed from: a */
    public final fmk m2339a(fln fln) {
        this.f4628e = (fln) ktm.m13962a((Object) fln);
        return this;
    }

    /* renamed from: a */
    public final fmk m2340a(fmd fmd) {
        this.f4624a = (fmd) ktm.m13962a((Object) fmd);
        return this;
    }

    /* renamed from: a */
    public final fmk m2341a(fmn fmn) {
        this.f4625b = (fmn) ktm.m13962a((Object) fmn);
        return this;
    }
}

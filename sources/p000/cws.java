package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cws */
public final class cws implements ilp, iqo {
    /* renamed from: f */
    private static final String f20808f = bli.m862a("CptrBtnReadiness");
    /* renamed from: a */
    public final ilb f20809a;
    /* renamed from: b */
    public final Executor f20810b;
    /* renamed from: c */
    public iqo f20811c;
    /* renamed from: d */
    public iqo f20812d;
    /* renamed from: e */
    public boolean f20813e;
    /* renamed from: g */
    private ilp f20814g;
    /* renamed from: h */
    private ilp f20815h;

    public cws() {
        this(new ikd());
    }

    private cws(Executor executor) {
        this.f20813e = false;
        Object valueOf = Boolean.valueOf(false);
        this.f20809a = new ilb(valueOf);
        this.f20810b = executor;
        m15232a(new ilb(valueOf));
        m15234b(new ilb(valueOf));
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        return this.f20809a.mo2859a(iqt, executor);
    }

    /* renamed from: a */
    final void m15232a(ilp ilp) {
        this.f20814g = ilp;
        iqo iqo = this.f20811c;
        if (iqo != null) {
            iqo.close();
        }
        this.f20811c = this.f20814g.mo2859a(new cww(this), this.f20810b);
    }

    /* renamed from: b */
    final void m15234b(ilp ilp) {
        this.f20815h = ilp;
        iqo iqo = this.f20812d;
        if (iqo != null) {
            iqo.close();
        }
        this.f20812d = ilp.mo2859a(new cwx(this), this.f20810b);
    }

    public final void close() {
        this.f20810b.execute(new cwv(this));
    }

    /* renamed from: a */
    public final Boolean m15231a() {
        return (Boolean) this.f20809a.f21734c;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2860b() {
        return m15231a();
    }

    /* renamed from: c */
    public final void m15236c(ilp ilp) {
        this.f20810b.execute(new cwt(this, ilp));
    }

    /* renamed from: c */
    final void m15235c() {
        boolean booleanValue;
        boolean booleanValue2;
        boolean z = false;
        ilp ilp = this.f20814g;
        if (ilp != null) {
            booleanValue = ((Boolean) ilp.mo2860b()).booleanValue();
        } else {
            booleanValue = false;
        }
        ilp = this.f20815h;
        if (ilp != null) {
            booleanValue2 = ((Boolean) ilp.mo2860b()).booleanValue();
        } else {
            booleanValue2 = false;
        }
        String str = f20808f;
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("Camera: ");
        stringBuilder.append(booleanValue);
        stringBuilder.append(", Secondary: ");
        stringBuilder.append(booleanValue2);
        bli.m863a(str, stringBuilder.toString());
        ilb ilb = this.f20809a;
        if (booleanValue && booleanValue2) {
            z = true;
        }
        ilb.mo348a(Boolean.valueOf(z));
    }
}

package p000;

/* compiled from: PG */
/* renamed from: irg */
public final class irg implements iri {
    /* renamed from: a */
    public final kpw f18518a = kpw.m18056d();
    /* renamed from: b */
    private final ikb f18519b = new ikb();
    /* renamed from: c */
    private final iur f18520c;

    public irg(iur iur) {
        this.f18520c = iur;
    }

    public irg(iur iur, iqo iqo) {
        this.f18520c = iur;
        this.f18519b.mo1879a(iqo);
    }

    /* renamed from: a */
    public final void mo1150a() {
        if (!this.f18518a.isDone()) {
            knk knk = this.f18518a;
            String valueOf = String.valueOf(this.f18520c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been closed.");
            knk.m17780a(new isr(stringBuilder.toString()));
        }
        this.f18519b.close();
    }

    /* renamed from: b */
    public final void mo1153b() {
        if (!this.f18518a.isDone()) {
            knk knk = this.f18518a;
            String valueOf = String.valueOf(this.f18520c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been disconnected.");
            knk.m17780a(new isr(stringBuilder.toString()));
        }
        this.f18519b.close();
    }

    /* renamed from: a */
    public final void mo1151a(int i) {
        if (!this.f18518a.isDone()) {
            knk knk = this.f18518a;
            String valueOf = String.valueOf(this.f18520c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 45);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" encountered error: ");
            stringBuilder.append(i);
            knk.m17780a(new isr(stringBuilder.toString()));
        }
        this.f18519b.close();
    }

    /* renamed from: a */
    public final void mo1152a(iwl iwl) {
        this.f18518a.mo3557a((Object) iwl);
    }
}

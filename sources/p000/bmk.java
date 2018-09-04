package p000;

/* compiled from: PG */
/* renamed from: bmk */
public final class bmk implements ire {
    /* renamed from: a */
    private static final String f11022a = bli.m862a("ActvCamDevTrckr");
    /* renamed from: b */
    private final Object f11023b = new Object();
    /* renamed from: c */
    private iur f11024c;
    /* renamed from: d */
    private iur f11025d;

    bmk() {
    }

    /* renamed from: a */
    public final iur mo521a() {
        iur iur;
        synchronized (this.f11023b) {
            iur = this.f11024c;
            if (iur != null) {
            } else {
                String str = f11022a;
                String valueOf = String.valueOf(this.f11025d);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("Returning previously active camera: ");
                stringBuilder.append(valueOf);
                bli.m871d(str, stringBuilder.toString());
                iur = this.f11025d;
            }
        }
        return iur;
    }

    @Deprecated
    /* renamed from: b */
    public static ire m7543b() {
        return bml.f1318a;
    }

    /* renamed from: a */
    public final void mo522a(iur iur) {
        synchronized (this.f11023b) {
            iur iur2 = this.f11024c;
            if (iur2 != null && iur2.equals(iur)) {
                this.f11025d = this.f11024c;
                this.f11024c = null;
            }
        }
    }

    /* renamed from: b */
    public final void mo523b(iur iur) {
        synchronized (this.f11023b) {
            iur iur2 = this.f11024c;
            if (!(iur2 == null || iur2.equals(iur))) {
                this.f11025d = this.f11024c;
            }
            String str = f11022a;
            String valueOf = String.valueOf(this.f11024c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
            stringBuilder.append("Tracking active camera: ");
            stringBuilder.append(valueOf);
            bli.m871d(str, stringBuilder.toString());
            this.f11024c = iur;
        }
    }
}

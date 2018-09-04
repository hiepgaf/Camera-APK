package p000;

/* renamed from: esh */
final /* synthetic */ class esh implements Runnable {
    /* renamed from: a */
    private final esd f4195a;
    /* renamed from: b */
    private final eso f4196b;

    esh(esd esd, eso eso) {
        this.f4195a = esd;
        this.f4196b = eso;
    }

    public final void run() {
        esd esd = this.f4195a;
        eso eso = this.f4196b;
        if (eso != null) {
            try {
                esd.f15446d.mo1618b(eso.f4206b);
            } catch (Throwable e) {
                String str = esd.f15443a;
                String valueOf = String.valueOf(eso.f4206b);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
                stringBuilder.append("Couldn't delete temp microvideo file after cancellation: ");
                stringBuilder.append(valueOf);
                bli.m867b(str, stringBuilder.toString(), e);
            }
        }
    }
}

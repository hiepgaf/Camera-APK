package p000;

/* renamed from: hkl */
final /* synthetic */ class hkl implements gua {
    /* renamed from: a */
    private final hkk f17921a;

    hkl(hkk hkk) {
        this.f17921a = hkk;
    }

    /* renamed from: a */
    public final void mo1131a(long j) {
        hkk hkk = this.f17921a;
        if (j <= 209715200) {
            String str = hkk.f6290a;
            StringBuilder stringBuilder = new StringBuilder(75);
            stringBuilder.append("Stopping recording due to low storage. Remaining bytes=");
            stringBuilder.append(j);
            bli.m869c(str, stringBuilder.toString());
            dix dix = hkk.f6298i.f6327a;
            dix.f13463d.execute(new djb(dix));
        }
    }
}

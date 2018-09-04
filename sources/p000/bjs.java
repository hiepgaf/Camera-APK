package p000;

/* compiled from: PG */
/* renamed from: bjs */
final class bjs implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ kpw f1211a;
    /* renamed from: b */
    private final /* synthetic */ bjr f1212b;

    bjs(bjr bjr, kpw kpw) {
        this.f1212b = bjr;
        this.f1211a = kpw;
    }

    public final void run() {
        try {
            this.f1212b.f10967b.mo470i();
            this.f1211a.mo3557a(Boolean.TRUE);
        } catch (ipu e) {
            String str = bjr.f10966a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Failed when call MediaRecorder#stop: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            this.f1211a.mo3557a(Boolean.FALSE);
        }
    }
}

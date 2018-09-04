package p000;

/* compiled from: PG */
/* renamed from: bjq */
final class bjq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bjp f1210a;

    bjq(bjp bjp) {
        this.f1210a = bjp;
    }

    public final void run() {
        try {
            this.f1210a.f1208b.f10964c.mo470i();
            this.f1210a.f1207a.mo3557a(Boolean.TRUE);
        } catch (ipu e) {
            String str = bjo.f10962a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Failed when call MediaRecorder#stop: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            this.f1210a.f1207a.mo3557a(Boolean.FALSE);
        }
    }
}

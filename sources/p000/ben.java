package p000;

/* renamed from: ben */
final /* synthetic */ class ben implements Runnable {
    /* renamed from: a */
    private final bem f1106a;

    ben(bem bem) {
        this.f1106a = bem;
    }

    public final void run() {
        bem bem = this.f1106a;
        synchronized (bem.f19931s) {
            if (bem.f19930r != bey.READY) {
                String str = bem.f19912a;
                String valueOf = String.valueOf(bem.f19930r);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
                stringBuilder.append("Ignore restartPreview: state=");
                stringBuilder.append(valueOf);
                bli.m871d(str, stringBuilder.toString());
                return;
            }
            bem.f19923k.m7404a(bem.f19927o, bem.f19925m, bem.f19928p);
        }
    }
}

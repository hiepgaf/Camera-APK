package p000;

/* renamed from: beb */
final /* synthetic */ class beb implements Runnable {
    /* renamed from: a */
    private final bea f1100a;

    beb(bea bea) {
        this.f1100a = bea;
    }

    public final void run() {
        bea bea = this.f1100a;
        synchronized (bea.f19908w) {
            if (bea.f19907v != bel.READY) {
                String str = bea.f19881a;
                String valueOf = String.valueOf(bea.f19907v);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
                stringBuilder.append("Ignore restartPreview: state=");
                stringBuilder.append(valueOf);
                bli.m871d(str, stringBuilder.toString());
                return;
            }
            bea.f19900o.m7404a(bea.f19904s, bea.f19902q, bea.f19905t);
        }
    }
}

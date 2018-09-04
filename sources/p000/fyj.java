package p000;

/* compiled from: PG */
/* renamed from: fyj */
final class fyj extends bck {
    /* renamed from: a */
    private final /* synthetic */ fyi f23222a;

    fyj(fyi fyi, bbi bbi) {
        this.f23222a = fyi;
        super(bbi);
    }

    public final void close() {
        super.close();
        synchronized (this.f23222a.f4827d.f16630a) {
            fyi fyi = this.f23222a;
            fyi.f4827d.f16632c.remove(fyi);
        }
    }
}

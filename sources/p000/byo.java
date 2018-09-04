package p000;

/* renamed from: byo */
final /* synthetic */ class byo implements iqo {
    /* renamed from: a */
    private final byn f11485a;
    /* renamed from: b */
    private final int f11486b;

    byo(byn byn, int i) {
        this.f11485a = byn;
        this.f11486b = i;
    }

    public final void close() {
        this.f11485a.f11462a.f1722c.remove(Integer.valueOf(this.f11486b));
    }
}

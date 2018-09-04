package p000;

/* compiled from: PG */
/* renamed from: fxu */
final class fxu extends bck {
    /* renamed from: a */
    private final /* synthetic */ fxt f23219a;

    fxu(fxt fxt, bbi bbi) {
        this.f23219a = fxt;
        super(bbi);
    }

    public final void close() {
        super.close();
        synchronized (this.f23219a.f4810e.f16620b) {
            fxt fxt = this.f23219a;
            fxt.f4810e.f16621c.remove(fxt);
            fxr fxr = this.f23219a.f4810e;
            fxr.f16622d.f21744b = Integer.valueOf(fxr.m10862b());
        }
        this.f23219a.f4810e.m10865e();
        this.f23219a.f4810e.f16622d.f21743a.m16083a();
    }
}

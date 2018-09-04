package p000;

/* compiled from: PG */
/* renamed from: dde */
final class dde implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f3000a;
    /* renamed from: b */
    private final /* synthetic */ int f3001b;
    /* renamed from: c */
    private final /* synthetic */ ddc f3002c;

    dde(ddc ddc, byte[] bArr, int i) {
        this.f3002c = ddc;
        this.f3000a = bArr;
        this.f3001b = i;
    }

    public final void run() {
        this.f3002c.f13095a.f1595a.mo573a(new dba(this.f3000a, this.f3001b));
    }
}

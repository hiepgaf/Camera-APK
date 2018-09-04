package p000;

/* compiled from: PG */
/* renamed from: ddn */
final class ddn implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f3007a;
    /* renamed from: b */
    private final /* synthetic */ int f3008b;
    /* renamed from: c */
    private final /* synthetic */ ddm f3009c;

    ddn(ddm ddm, byte[] bArr, int i) {
        this.f3009c = ddm;
        this.f3007a = bArr;
        this.f3008b = i;
    }

    public final void run() {
        this.f3009c.f20945a.f1595a.mo573a(new dbb(cwe.m1548a(this.f3007a, this.f3008b), this.f3007a));
    }
}

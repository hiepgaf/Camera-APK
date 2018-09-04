package p000;

/* compiled from: PG */
/* renamed from: ded */
final class ded implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f3014a;
    /* renamed from: b */
    private final /* synthetic */ int f3015b;
    /* renamed from: c */
    private final /* synthetic */ dec f3016c;

    ded(dec dec, byte[] bArr, int i) {
        this.f3016c = dec;
        this.f3014a = bArr;
        this.f3015b = i;
    }

    public final void run() {
        this.f3016c.f20959a.f1595a.mo573a(new dbb(cwe.m1548a(this.f3014a, this.f3015b), this.f3014a));
    }
}

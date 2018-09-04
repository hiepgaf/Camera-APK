package p000;

/* compiled from: PG */
/* renamed from: zl */
final class zl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f9586a;
    /* renamed from: b */
    private final /* synthetic */ zk f9587b;

    zl(zk zkVar, byte[] bArr) {
        this.f9587b = zkVar;
        this.f9586a = bArr;
    }

    public final void run() {
        zk zkVar = this.f9587b;
        zkVar.f9583a.mo1203a(this.f9586a, zkVar.f9584b);
    }
}

package p000;

/* compiled from: PG */
/* renamed from: aaj */
final class aaj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f16a;
    /* renamed from: b */
    private final /* synthetic */ aah f17b;

    aaj(aah aah, byte[] bArr) {
        this.f17b = aah;
        this.f16a = bArr;
    }

    public final void run() {
        this.f17b.mo2563b().obtainMessage(105, this.f16a).sendToTarget();
    }
}

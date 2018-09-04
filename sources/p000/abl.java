package p000;

/* compiled from: PG */
/* renamed from: abl */
final class abl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ RuntimeException f128a;
    /* renamed from: b */
    private final /* synthetic */ String f129b;
    /* renamed from: c */
    private final /* synthetic */ int f130c;
    /* renamed from: d */
    private final /* synthetic */ int f131d;
    /* renamed from: e */
    private final /* synthetic */ abi f132e;

    abl(abi abi, RuntimeException runtimeException, String str, int i, int i2) {
        this.f132e = abi;
        this.f128a = runtimeException;
        this.f129b = str;
        this.f130c = i;
        this.f131d = i2;
    }

    public final void run() {
        this.f132e.f124a.mo7a(this.f128a, this.f129b, this.f130c, this.f131d);
    }
}

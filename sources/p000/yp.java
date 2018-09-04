package p000;

/* compiled from: PG */
/* renamed from: yp */
final class yp extends abi {
    yp() {
        super(null);
    }

    /* renamed from: a */
    public final void mo2578a(int i) {
        aby aby = yo.f19743a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onCameraError called with no handler set: ");
        stringBuilder.append(i);
        abx.m91e(aby, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo2580a(RuntimeException runtimeException, String str, int i, int i2) {
        abx.m88b(yo.f19743a, "onCameraException called with no handler set", runtimeException);
    }

    /* renamed from: a */
    public final void mo2579a(RuntimeException runtimeException) {
        abx.m88b(yo.f19743a, "onDispatchThreadException called with no handler set", runtimeException);
    }
}

package p000;

/* compiled from: PG */
/* renamed from: irm */
final class irm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ irl f7363a;

    irm(irl irl) {
        this.f7363a = irl;
    }

    public final void run() {
        irl irl = this.f7363a;
        ird ird = irl.f18524b;
        String valueOf = String.valueOf(irl.f18523a);
        String str = "OpenCamera#";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        ird.mo1903a(valueOf);
        this.f7363a.m12418a().m12431a(this.f7363a.f18526d);
        this.f7363a.f18524b.mo1904b();
    }
}

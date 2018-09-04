package p000;

/* compiled from: PG */
/* renamed from: knr */
final class knr implements Runnable {
    /* renamed from: a */
    public final knk f8382a;
    /* renamed from: b */
    public final kpk f8383b;

    knr(knk knk, kpk kpk) {
        this.f8382a = knk;
        this.f8383b = kpk;
    }

    public final void run() {
        if (this.f8382a.value == this) {
            if (knk.f23429c.mo2194a(this.f8382a, (Object) this, knk.m17769a(this.f8383b))) {
                knk.m17771a(this.f8382a);
            }
        }
    }
}

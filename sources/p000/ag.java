package p000;

/* compiled from: PG */
/* renamed from: ag */
abstract class ag {
    /* renamed from: a */
    public final ai f426a;
    /* renamed from: b */
    public boolean f427b;
    /* renamed from: c */
    public int f428c = -1;
    /* renamed from: d */
    private final /* synthetic */ ac f429d;

    ag(ac acVar, ai aiVar) {
        this.f429d = acVar;
        this.f426a = aiVar;
    }

    /* renamed from: a */
    abstract boolean mo28a();

    /* renamed from: a */
    final void m226a(boolean z) {
        if (z != this.f427b) {
            int i;
            this.f427b = z;
            int access$300 = this.f429d.mActiveCount;
            ac acVar = this.f429d;
            int access$3002 = acVar.mActiveCount;
            if (this.f427b) {
                i = 1;
            } else {
                i = -1;
            }
            acVar.mActiveCount = i + access$3002;
            if (access$300 == 0 && this.f427b) {
                this.f429d.onActive();
            }
            if (this.f429d.mActiveCount == 0 && !this.f427b) {
                this.f429d.onInactive();
            }
            if (this.f427b) {
                this.f429d.dispatchingValue(this);
            }
        }
    }

    /* renamed from: b */
    void mo2590b() {
    }

    /* renamed from: a */
    boolean mo2589a(C0132y c0132y) {
        return false;
    }
}

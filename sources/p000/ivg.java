package p000;

/* compiled from: PG */
/* renamed from: ivg */
final class ivg extends iww {
    /* renamed from: a */
    private boolean f23377a = false;
    /* renamed from: b */
    private final /* synthetic */ ivf f23378b;

    ivg(ivf ivf, iwz iwz) {
        this.f23378b = ivf;
        super(iwz);
    }

    public final void close() {
        Object obj = 1;
        synchronized (this.f23378b.f23375a) {
            if (this.f23377a) {
                obj = null;
            } else {
                this.f23377a = true;
            }
        }
        if (obj != null) {
            super.close();
            synchronized (this.f23378b.f23375a) {
                ivf ivf = this.f23378b;
                ivf.f23376b--;
            }
        }
    }
}

package p000;

/* compiled from: PG */
/* renamed from: iry */
final class iry extends iwq {
    /* renamed from: a */
    private final irx f23363a;
    /* renamed from: b */
    private boolean f23364b = false;

    iry(iwl iwl, irx irx) {
        super(iwl);
        this.f23363a = irx;
    }

    public final void close() {
        synchronized (this) {
            if (this.f23364b) {
                return;
            }
            this.f23364b = true;
            this.f23363a.close();
            super.close();
        }
    }
}

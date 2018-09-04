package p000;

/* compiled from: PG */
/* renamed from: afh */
final class afh {
    /* renamed from: a */
    private boolean f391a;
    /* renamed from: b */
    private boolean f392b;
    /* renamed from: c */
    private boolean f393c;

    afh() {
    }

    /* renamed from: a */
    private final boolean m215a(boolean z) {
        if (!this.f393c) {
            if (this.f392b) {
            }
            return false;
        }
        if (this.f391a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    final synchronized boolean m216a() {
        this.f392b = true;
        return m215a(false);
    }

    /* renamed from: b */
    final synchronized boolean m217b() {
        this.f393c = true;
        return m215a(false);
    }

    /* renamed from: c */
    final synchronized boolean m218c() {
        this.f391a = true;
        return m215a(false);
    }

    /* renamed from: d */
    final synchronized void m219d() {
        this.f392b = false;
        this.f391a = false;
        this.f393c = false;
    }
}

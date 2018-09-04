package p000;

/* compiled from: PG */
/* renamed from: ksn */
public class ksn {
    /* renamed from: a */
    public kqx f8531a;
    /* renamed from: b */
    public volatile kte f8532b;
    /* renamed from: c */
    public volatile kqx f8533c;

    static {
        krn.m5103a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksn)) {
            return false;
        }
        ksn ksn = (ksn) obj;
        kte kte = this.f8532b;
        kte kte2 = ksn.f8532b;
        if (kte == null && kte2 == null) {
            return m5150b().equals(ksn.m5150b());
        }
        if (kte != null && kte2 != null) {
            return kte.equals(kte2);
        }
        if (kte != null) {
            return kte.equals(ksn.m5149a(kte.mo3535d()));
        }
        return m5149a(kte2.mo3535d()).equals(kte2);
    }

    /* renamed from: a */
    private final kte m5149a(kte kte) {
        if (this.f8532b == null) {
            synchronized (this) {
                if (this.f8532b != null) {
                } else {
                    try {
                        this.f8532b = kte;
                        this.f8533c = kqx.f8429a;
                    } catch (ksh e) {
                        this.f8532b = kte;
                        this.f8533c = kqx.f8429a;
                    }
                }
            }
        }
        return this.f8532b;
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: b */
    public final kqx m5150b() {
        if (this.f8533c != null) {
            return this.f8533c;
        }
        synchronized (this) {
            if (this.f8533c != null) {
                kqx kqx = this.f8533c;
                return kqx;
            }
            if (this.f8532b == null) {
                this.f8533c = kqx.f8429a;
            } else {
                this.f8533c = this.f8532b.mo3252c();
            }
            kqx = this.f8533c;
            return kqx;
        }
    }
}

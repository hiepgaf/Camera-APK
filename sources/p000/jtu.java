package p000;

/* compiled from: PG */
/* renamed from: jtu */
public final class jtu extends jtq {
    /* renamed from: d */
    private final long f21909d = 1000000000;

    public jtu(jvx jvx) {
        super(jvx);
        jri.m13143a(true);
        jri.m13143a(true);
    }

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        jzf jzc;
        synchronized (this.c) {
            if (this.a.isEmpty() || j < ((Long) this.a.first()).longValue() || j > ((Long) this.a.last()).longValue() + this.f21909d) {
                jzc = new jzc(0.0f);
            } else {
                jzc = new jzc(1.0f);
            }
        }
        return jzc;
    }
}

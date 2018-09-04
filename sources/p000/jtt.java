package p000;

/* compiled from: PG */
/* renamed from: jtt */
public final class jtt extends jtq {
    public jtt(jvx jvx) {
        super(jvx);
    }

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        jzf jzc;
        synchronized (this.c) {
            if (this.a.contains(Long.valueOf(j))) {
                jzc = new jzc(1.0f);
            } else {
                jzc = new jzc(0.0f);
            }
        }
        return jzc;
    }
}

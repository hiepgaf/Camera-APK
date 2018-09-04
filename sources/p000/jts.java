package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jts */
public final class jts extends jtq {
    /* renamed from: d */
    private final float f21908d = ((float) (Math.sqrt(2.0d) * 7.0E9d));

    public jts(jvx jvx) {
        super(jvx);
        jri.m13143a(true);
    }

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        float f;
        synchronized (this.c) {
            Iterator it = this.a.iterator();
            f = 0.0f;
            while (it.hasNext()) {
                float longValue = ((float) (((Long) it.next()).longValue() - j)) / this.f21908d;
                f = (float) (Math.exp((double) (longValue * (-longValue))) + ((double) f));
            }
        }
        return new jzc(f);
    }
}

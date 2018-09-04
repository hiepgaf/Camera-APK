package p000;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: jvb */
public final class jvb extends jum {
    /* renamed from: a */
    private final jxm f21941a;
    /* renamed from: b */
    private final int f21942b;

    public jvb(jxm jxm) {
        this(jxm, 1);
    }

    public jvb(jxm jxm, int i) {
        jri.m13152b((Object) jxm);
        this.f21941a = jxm;
        this.f21942b = i;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        jri.m13152b((Object) juh);
        Collection b = khb.m4885b();
        ken a = ken.m13458a(juh.f7984a);
        int size = a.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            long longValue = ((Long) a.get(i)).longValue();
            jxa a2 = this.f21941a.m4672a(longValue);
            if (!a2.m4668b(jxa.f8046c)) {
                i = i2;
            } else if (((List) a2.m4665a(jxa.f8046c)).size() >= this.f21942b) {
                b.add(Long.valueOf(longValue));
                i = i2;
            } else {
                i = i2;
            }
        }
        return new juh(b);
    }

    public final String toString() {
        return "MinFaceCountSegmentFilter";
    }
}

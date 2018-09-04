package p000;

import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jud */
public final class jud implements jtv {
    /* renamed from: a */
    private final float f19061a;
    /* renamed from: b */
    private final float f19062b;
    /* renamed from: c */
    private final TreeSet f19063c;

    public jud() {
        this((byte) 0);
    }

    private jud(byte b) {
        this.f19063c = khb.m4905f();
        this.f19061a = 30.0f;
        this.f19062b = 1.99999996E11f / this.f19061a;
    }

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        boolean z;
        int i;
        long longValue;
        long j2 = 0;
        if (this.f19063c.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        TreeSet treeSet = this.f19063c;
        Long valueOf = Long.valueOf(j);
        Long l = (Long) treeSet.lower(valueOf);
        valueOf = (Long) this.f19063c.higher(valueOf);
        if (l != null) {
            i = 1;
            longValue = j - l.longValue();
        } else {
            i = 0;
            longValue = 0;
        }
        if (valueOf != null) {
            j2 = valueOf.longValue() - j;
            i++;
        }
        if (i == 0) {
            return new jzc(0.0f);
        }
        return new jzc(((float) ((longValue + j2) / ((long) i))) / this.f19062b);
    }

    /* renamed from: b */
    public final void mo2051b(long j) {
        this.f19063c.remove(Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo2052c(long j) {
        this.f19063c.add(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo2050a() {
        this.f19063c.clear();
    }

    public final String toString() {
        float f = this.f19061a;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("TimestampGapScorer[rate=");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

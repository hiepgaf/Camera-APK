package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: cot */
public final class cot extends cqn implements Comparable {
    /* renamed from: a */
    public kbg f20762a = kau.f19138a;
    /* renamed from: b */
    public Boolean f20763b;
    /* renamed from: d */
    private int f20764d = -1;

    public cot(cql cql) {
        super((cql) jri.m13152b((Object) cql));
    }

    /* renamed from: a */
    private final int m15131a(cot cot) {
        int d_;
        int i = LfuScheduler.MAX_PRIORITY;
        try {
            d_ = d_();
        } catch (jya e) {
            d_ = i;
        }
        try {
            i = cot.d_();
        } catch (jya e2) {
        }
        if (d_ != i) {
            return Integer.compare(d_, i);
        }
        String str = this.f12527c.f12515e.f4154g;
        return str.compareTo(str);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return m15131a((cot) obj);
    }

    public final int d_() {
        if (this.f20764d == -1) {
            this.f20764d = jxr.m4678a().mo2062a(new File(this.f12527c.f12515e.f4154g));
        }
        return this.f20764d;
    }

    /* renamed from: b */
    public final cot m15132b() {
        err c = this.f12527c.mo1045c();
        if (c == null) {
            return null;
        }
        if (c instanceof cot) {
            return (cot) c;
        }
        return new cot((cql) c);
    }

    /* renamed from: c */
    public final /* synthetic */ err mo1045c() {
        return m15132b();
    }
}

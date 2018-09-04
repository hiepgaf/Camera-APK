package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bvf */
public final class bvf {
    /* renamed from: a */
    public static final String f1622a = bli.m862a("SpecTypeDb");
    /* renamed from: e */
    public static final String[] f1623e = new String[]{"special_type_id"};
    /* renamed from: b */
    public final kpw f1624b = kpw.m18056d();
    /* renamed from: c */
    public final kpw f1625c = kpw.m18056d();
    /* renamed from: d */
    public final Executor f1626d;

    public bvf(bvk bvk, Executor executor) {
        this.f1626d = executor;
        this.f1626d.execute(new bvg(this, bvk));
    }

    /* renamed from: a */
    public final kbg m1010a(long j) {
        try {
            return (kbg) kny.m18045a(this.f1624b, new bvh(j), this.f1626d).get();
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        return kau.f19138a;
    }
}

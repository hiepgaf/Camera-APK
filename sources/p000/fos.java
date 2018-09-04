package p000;

import android.view.Surface;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fos */
public final class fos implements kwk {
    /* renamed from: a */
    private final kwk f16272a;
    /* renamed from: b */
    private final kwk f16273b;
    /* renamed from: c */
    private final kwk f16274c;
    /* renamed from: d */
    private final kwk f16275d;

    private fos(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f16272a = kwk;
        this.f16273b = kwk2;
        this.f16274c = kwk3;
        this.f16275d = kwk4;
    }

    /* renamed from: a */
    public static fos m10585a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new fos(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16272a;
        kwk kwk2 = this.f16273b;
        kwk kwk3 = this.f16274c;
        Set<Object> set = (Set) kwk.mo345a();
        Set<ivs> set2 = (Set) kwk2.mo345a();
        Object obj = (Surface) kwk3.mo345a();
        Object obj2 = (Surface) this.f16275d.mo345a();
        Collection a = khb.m4863a(set.size());
        for (ivs add : set2) {
            a.add(add);
        }
        jri.m13152b(obj);
        jri.m13152b(obj2);
        jri.m13143a(set.contains(obj));
        jri.m13143a(set.contains(obj2));
        for (Object obj3 : set) {
            if (obj3.equals(obj) || obj3.equals(obj2)) {
                a.add(new ivs(ivs.m4262a(1, kow.m13617a(obj3))));
            } else {
                a.add(ivs.m4261a(kow.m13617a(obj3)));
            }
        }
        return (Set) ktm.m13963a(keu.m13477a(a), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package p000;

import android.util.ArraySet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bxv */
public final class bxv implements kwk {
    /* renamed from: a */
    private final kwk f11429a;

    private bxv(kwk kwk) {
        this.f11429a = kwk;
    }

    /* renamed from: a */
    public static bxv m7858a(kwk kwk) {
        return new bxv(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        ilp ilp = (ilp) this.f11429a.mo345a();
        Set arraySet = new ArraySet();
        arraySet.add(ilq.m3818a(bxh.POSTVIEW));
        arraySet.add(ilq.m3817a(ilp, bxp.f11417a));
        return (Set) ktm.m13963a(arraySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}

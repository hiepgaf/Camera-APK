package p000;

import android.content.pm.PackageManager;
import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: dzi */
public final class dzi {
    /* renamed from: a */
    private final kwk f3387a;
    /* renamed from: b */
    private final kwk f3388b;
    /* renamed from: c */
    private final kwk f3389c;
    /* renamed from: d */
    private final kwk f3390d;

    public dzi(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f3387a = (kwk) dzi.m1698a(kwk, 1);
        this.f3388b = (kwk) dzi.m1698a(kwk2, 2);
        this.f3389c = (kwk) dzi.m1698a(kwk3, 3);
        this.f3390d = (kwk) dzi.m1698a(kwk4, 4);
    }

    /* renamed from: a */
    private static Object m1698a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final dzh m1699a(String str) {
        Resources resources = (Resources) dzi.m1698a((Resources) this.f3387a.mo345a(), 1);
        gos gos = (gos) dzi.m1698a((gos) this.f3388b.mo345a(), 2);
        dzi.m1698a((hjf) this.f3389c.mo345a(), 3);
        return new dzh(resources, gos, (PackageManager) dzi.m1698a((PackageManager) this.f3390d.mo345a(), 4), (String) dzi.m1698a(str, 5));
    }
}

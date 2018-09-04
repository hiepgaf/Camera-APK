package p000;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: cow */
public final class cow {
    /* renamed from: a */
    public static final String f2527a = bli.m862a("BurstItemFactory");
    /* renamed from: b */
    public final Context f2528b;
    /* renamed from: c */
    public final gln f2529c;
    /* renamed from: d */
    public final cqb f2530d;
    /* renamed from: e */
    public final gev f2531e;
    /* renamed from: f */
    public final gsp f2532f;

    public cow(Context context, gln gln, gev gev, cqb cqb, gsp gsp) {
        this.f2528b = (Context) jri.m13152b((Object) context);
        this.f2529c = (gln) jri.m13152b((Object) gln);
        this.f2531e = (gev) jri.m13152b((Object) gev);
        this.f2530d = (cqb) jri.m13152b((Object) cqb);
        this.f2532f = (gsp) jri.m13152b((Object) gsp);
    }

    /* renamed from: a */
    public static boolean m1390a(err err) {
        return cov.m8505a(new File(err.mo1033g().f4154g).getName());
    }
}

package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: eqm */
public final class eqm {
    /* renamed from: a */
    private final kwk f4082a;
    /* renamed from: b */
    private final kwk f4083b;
    /* renamed from: c */
    private final kwk f4084c;

    public eqm(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f4082a = (kwk) eqm.m2006a(kwk, 1);
        this.f4083b = (kwk) eqm.m2006a(kwk2, 2);
        this.f4084c = (kwk) eqm.m2006a(kwk3, 3);
    }

    /* renamed from: a */
    private static Object m2006a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final eql m2007a(Uri uri, long j, String str, glw glw) {
        return new eql((ContentResolver) eqm.m2006a((ContentResolver) this.f4082a.mo345a(), 1), (Uri) eqm.m2006a((Uri) this.f4083b.mo345a(), 2), this.f4084c, (Uri) eqm.m2006a(uri, 4), j, (String) eqm.m2006a(str, 6), (glw) eqm.m2006a(glw, 7));
    }
}

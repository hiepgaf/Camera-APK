package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: goa */
public final class goa implements gnx {
    /* renamed from: a */
    private static final String f17144a = bli.m862a("StackSaverImpl");
    /* renamed from: b */
    private final gkr f17145b;
    /* renamed from: c */
    private final gtf f17146c;
    /* renamed from: d */
    private final gsl f17147d;
    /* renamed from: e */
    private final ContentResolver f17148e;
    /* renamed from: f */
    private final kbg f17149f;

    public goa(gkr gkr, gtf gtf, gsl gsl, kbg kbg, ContentResolver contentResolver) {
        this.f17145b = (gkr) jri.m13152b((Object) gkr);
        this.f17146c = (gtf) jri.m13152b((Object) gtf);
        this.f17147d = (gsl) jri.m13152b((Object) gsl);
        this.f17149f = kbg;
        this.f17148e = (ContentResolver) jri.m13152b((Object) contentResolver);
    }

    /* renamed from: a */
    public final gob mo1509a(gsq gsq, god god) {
        Uri o = this.f17145b.mo2887o();
        Builder builder = new Builder();
        builder.scheme(o.getScheme()).authority(o.getAuthority()).appendPath(o.getLastPathSegment()).appendPath(UUID.randomUUID().toString());
        Uri build = builder.build();
        String str = f17144a;
        String valueOf = String.valueOf(build);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
        stringBuilder.append("Stacked ID generated: ");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        return new gob(build, this.f17146c, this.f17147d, this.f17148e, this.f17149f, god, gsq);
    }
}

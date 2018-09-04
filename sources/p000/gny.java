package p000;

import android.content.ContentResolver;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gny */
public final class gny {
    /* renamed from: a */
    private static final String f5532a = bli.m862a("StackSaverFactory");
    /* renamed from: b */
    private final ContentResolver f5533b;
    /* renamed from: c */
    private final gsx f5534c;
    /* renamed from: d */
    private final gtg f5535d;
    /* renamed from: e */
    private final gsl f5536e;

    public gny(ContentResolver contentResolver, gsx gsx, gtg gtg, gsl gsl) {
        this.f5533b = (ContentResolver) jri.m13152b((Object) contentResolver);
        this.f5534c = (gsx) jri.m13152b((Object) gsx);
        this.f5535d = (gtg) jri.m13152b((Object) gtg);
        this.f5536e = (gsl) jri.m13152b((Object) gsl);
    }

    /* renamed from: a */
    public final gnx m2646a(gkr gkr, String str, kbg kbg) {
        try {
            return new goa(gkr, this.f5535d.m2815a(this.f5534c.mo1622a(str)), this.f5536e, kbg, this.f5533b);
        } catch (IOException e) {
            String str2 = f5532a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("Failed to get FileNamer: ");
            stringBuilder.append(valueOf);
            bli.m866b(str2, stringBuilder.toString());
            return null;
        }
    }
}

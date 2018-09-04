package p000;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: gti */
public final class gti {
    /* renamed from: a */
    private static final String f5686a = bli.m862a("FileNamerModule");

    /* renamed from: a */
    public static gtf m2816a(gtg gtg, gsx gsx) {
        try {
            return gtg.m2815a(gsx);
        } catch (IOException e) {
            String str = f5686a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("Unable to get FileNamer: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            throw new AssertionError(e);
        }
    }
}

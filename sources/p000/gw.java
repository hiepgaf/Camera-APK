package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: gw */
public final class gw {
    /* renamed from: a */
    public static final ha f5716a = new gz();
    /* renamed from: b */
    public static final io f5717b = new io(16);

    /* renamed from: a */
    public static Typeface m2850a(Context context, gq gqVar, Resources resources, int i, int i2, mz mzVar, Handler handler, boolean z) {
        Typeface a;
        if (gqVar instanceof gr) {
            gr grVar = (gr) gqVar;
            a = hk.m3216a(context, grVar.f5647a, mzVar, null, grVar.f5649c == 0, grVar.f5648b, i2);
        } else {
            a = f5716a.mo3067a(context, (na) gqVar, resources, i2);
            if (mzVar != null) {
                if (a != null) {
                    mzVar.m14128a(a, null);
                } else {
                    mzVar.m14126a(-3, null);
                }
            }
        }
        if (a != null) {
            f5717b.m3904a(gw.m2851a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m2849a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f5716a.mo3066a(context, resources, i, str, i2);
        if (a != null) {
            f5717b.m3904a(gw.m2851a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static String m2851a(Resources resources, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(i));
        stringBuilder.append("-");
        stringBuilder.append(i);
        stringBuilder.append("-");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }
}

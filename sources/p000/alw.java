package p000;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: alw */
public abstract class alw implements ads {
    /* renamed from: a */
    protected abstract Bitmap mo3350a(agw agw, Bitmap bitmap, int i, int i2);

    /* renamed from: a */
    public final agn mo2591a(Context context, agn agn, int i, int i2) {
        if (arq.m657b(i, i2)) {
            agw agw = acc.m98a(context).f187a;
            Bitmap bitmap = (Bitmap) agn.mo55b();
            if (i == kvl.UNSET_ENUM_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == kvl.UNSET_ENUM_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = mo3350a(agw, bitmap, i, i2);
            if (bitmap.equals(a)) {
                return agn;
            }
            return alv.m6617a(a, agw);
        }
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("Cannot apply transformation on width: ");
        stringBuilder.append(i);
        stringBuilder.append(" or height: ");
        stringBuilder.append(i2);
        stringBuilder.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

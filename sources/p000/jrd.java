package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* compiled from: PG */
/* renamed from: jrd */
public final class jrd implements jqo {
    /* renamed from: a */
    private final agw f18970a;

    public jrd() {
        this(new ahe(52428800));
    }

    public jrd(agw agw) {
        jri.m13152b((Object) agw);
        this.f18970a = agw;
    }

    /* renamed from: a */
    public final jqr mo2041a(String str, int i, int i2, Config config) {
        Bitmap a = this.f18970a.mo59a(i, i2, config);
        if (a == null) {
            a = Bitmap.createBitmap(i, i2, config);
        }
        return new jre(a, this.f18970a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18970a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
        stringBuilder.append("PoolBitmapAllocator[pool=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final jqr mo2042a(String str, Bitmap bitmap) {
        return new jre(bitmap, this.f18970a);
    }
}

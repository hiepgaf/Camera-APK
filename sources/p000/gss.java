package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: gss */
public final class gss {
    /* renamed from: a */
    public final Bitmap f5670a;
    /* renamed from: b */
    public final iqm f5671b;

    public gss(Bitmap bitmap, iqm iqm) {
        jri.m13152b((Object) bitmap);
        jri.m13152b((Object) iqm);
        this.f5670a = bitmap;
        this.f5671b = iqm;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5670a);
        String valueOf2 = String.valueOf(this.f5671b);
        int hashCode = hashCode();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length());
        stringBuilder.append("OrientationBitmap[Bitmap: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("][rotation: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]: ");
        stringBuilder.append(hashCode);
        return stringBuilder.toString();
    }
}

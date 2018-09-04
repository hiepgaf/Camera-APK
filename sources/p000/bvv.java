package p000;

import android.content.ContentProvider.PipeDataWriter;
import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* renamed from: bvv */
public final class bvv implements bvu {
    /* renamed from: b */
    private static int f11338b = -1;
    /* renamed from: a */
    public final ird f11339a;
    /* renamed from: c */
    private final bus f11340c;
    /* renamed from: d */
    private final bvy f11341d;
    /* renamed from: e */
    private final bvt f11342e;

    public bvv(bus bus, ird ird, bvy bvy, bvt bvt) {
        this.f11340c = bus;
        this.f11339a = ird;
        this.f11341d = bvy;
        this.f11342e = bvt;
    }

    /* renamed from: a */
    public final PipeDataWriter mo593a(Uri uri) {
        kbg kbg;
        int i = f11338b + 1;
        f11338b = i;
        StringBuilder stringBuilder = new StringBuilder(14);
        stringBuilder.append("[r");
        stringBuilder.append(i);
        stringBuilder.append("]");
        String stringBuilder2 = stringBuilder.toString();
        String str = buk.f1597a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(stringBuilder2).length() + 33) + String.valueOf(valueOf).length());
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("processing thumbnail request uri=");
        stringBuilder3.append(valueOf);
        bli.m869c(str, stringBuilder3.toString());
        long parseId = ContentUris.parseId(uri);
        str = buk.f1597a;
        stringBuilder3 = new StringBuilder(String.valueOf(stringBuilder2).length() + 62);
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("processing thumbnail request mediaStoreId=");
        stringBuilder3.append(parseId);
        bli.m871d(str, stringBuilder3.toString());
        StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(stringBuilder2).length() + 24);
        stringBuilder4.append(stringBuilder2);
        stringBuilder4.append("[m");
        stringBuilder4.append(parseId);
        stringBuilder4.append("] ");
        String stringBuilder5 = stringBuilder4.toString();
        kbg kbg2 = kau.f19138a;
        str = uri.getQueryParameter("width");
        String queryParameter = uri.getQueryParameter("height");
        if (str == null) {
            kbg = kbg2;
        } else if (queryParameter != null) {
            Size size = new Size(Integer.parseInt(str), Integer.parseInt(queryParameter));
            str = buk.f1597a;
            queryParameter = String.valueOf(size);
            StringBuilder stringBuilder6 = new StringBuilder((String.valueOf(stringBuilder5).length() + 43) + String.valueOf(queryParameter).length());
            stringBuilder6.append(stringBuilder5);
            stringBuilder6.append("processing thumbnail request thumbnailSize=");
            stringBuilder6.append(queryParameter);
            bli.m871d(str, stringBuilder6.toString());
            kbg = kbg.m4745c(size);
        } else {
            kbg = kbg2;
        }
        kbg2 = this.f11340c.mo576a(parseId);
        if (kbg2.mo2084b()) {
            agn a = ((buo) kbg2.mo2081a()).mo2705a();
            if (a == null) {
                bli.m866b(buk.f1597a, String.valueOf(stringBuilder5).concat("DrawableResource is not set in ProcessingMedia"));
                throw new bvz("DrawableResource is not set in ProcessingMedia");
            }
            Bitmap a2;
            ird ird = this.f11339a;
            String str2 = buk.f1597a;
            StringBuilder stringBuilder7 = new StringBuilder((String.valueOf(str2).length() + 26) + String.valueOf(stringBuilder5).length());
            stringBuilder7.append(str2);
            stringBuilder7.append(stringBuilder5);
            stringBuilder7.append("BitmapDrawable.getBitmap()");
            ird.mo1903a(stringBuilder7.toString());
            Bitmap b = hid.m3170b((Drawable) a.mo55b());
            this.f11339a.mo1904b();
            if (kbg.mo2084b()) {
                ird ird2 = this.f11339a;
                str2 = buk.f1597a;
                queryParameter = String.valueOf(kbg.mo2081a());
                int length = String.valueOf(str2).length();
                StringBuilder stringBuilder8 = new StringBuilder(((length + 31) + String.valueOf(stringBuilder5).length()) + String.valueOf(queryParameter).length());
                stringBuilder8.append(str2);
                stringBuilder8.append(stringBuilder5);
                stringBuilder8.append("Bitmap.createScaledBitmap#size=");
                stringBuilder8.append(queryParameter);
                ird2.mo1903a(stringBuilder8.toString());
                a2 = hid.m3167a(b, (Size) kbg.mo2081a());
                this.f11339a.mo1904b();
            } else {
                a2 = b;
            }
            ird = this.f11339a;
            str2 = buk.f1597a;
            stringBuilder7 = new StringBuilder((String.valueOf(str2).length() + 26) + String.valueOf(stringBuilder5).length());
            stringBuilder7.append(str2);
            stringBuilder7.append(stringBuilder5);
            stringBuilder7.append("BitmapSerializer.serialize");
            ird.mo1903a(stringBuilder7.toString());
            try {
                bvs bvs;
                bvy bvy = this.f11341d;
                if (kbg.mo2084b()) {
                    Object obj = bvy;
                } else {
                    bvs = this.f11342e;
                }
                Object a3 = bvs.mo592a(a2);
                this.f11339a.mo1904b();
                jri.m13152b(a3);
                return new bvw(this, stringBuilder5, a3);
            } catch (Throwable e) {
                throw new bvz(e);
            } catch (Throwable th) {
                this.f11339a.mo1904b();
            }
        } else {
            bli.m866b(buk.f1597a, String.valueOf(stringBuilder5).concat("ProcessingMedia does not exist in ProcessingMediaManager"));
            throw new bvz("ProcessingMedia does not exist in ProcessingMediaManager");
        }
    }
}

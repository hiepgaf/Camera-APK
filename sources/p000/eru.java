package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import java.util.Date;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eru */
public class eru {
    /* renamed from: a */
    private iqp f4148a;
    /* renamed from: b */
    public final long f4149b;
    /* renamed from: c */
    public final String f4150c;
    /* renamed from: d */
    public final String f4151d;
    /* renamed from: e */
    public final Date f4152e;
    /* renamed from: f */
    public final Date f4153f;
    /* renamed from: g */
    public final String f4154g;
    /* renamed from: h */
    public final Uri f4155h;
    /* renamed from: i */
    public final boolean f4156i;
    /* renamed from: j */
    public final long f4157j;
    /* renamed from: k */
    public final int f4158k;
    /* renamed from: l */
    public final erx f4159l;
    /* renamed from: m */
    public final boolean f4160m;

    public eru(long j, String str, String str2, Date date, Date date2, String str3, Uri uri, boolean z, kbg kbg, long j2, int i, erx erx, boolean z2) {
        this.f4149b = j;
        this.f4150c = str;
        this.f4151d = str2;
        this.f4152e = date;
        this.f4153f = date2;
        this.f4154g = str3;
        this.f4155h = uri;
        this.f4156i = z;
        this.f4148a = (iqp) kbg.mo2085c();
        this.f4157j = j2;
        this.f4158k = i;
        this.f4159l = erx;
        this.f4160m = z2;
    }

    /* renamed from: a */
    public boolean mo996a(Set set) {
        return set.contains(this.f4155h);
    }

    /* renamed from: a */
    public ken mo995a() {
        return ken.m13453a(Long.valueOf(this.f4149b));
    }

    public Uri e_() {
        return Media.EXTERNAL_CONTENT_URI.buildUpon().appendPath(Long.toString(((Long) mo995a().get(0)).longValue())).build();
    }

    /* renamed from: g */
    public final iqp m2079g() {
        if (this.f4148a == null) {
            iqp iqp;
            int width;
            int height;
            String str = this.f4154g;
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth <= 0 || options.outHeight <= 0) {
                String valueOf = String.valueOf(str);
                String str2 = "Dimension decode failed for ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m873e("FilmstripItemData", valueOf);
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                if (decodeFile == null) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
                    stringBuilder.append("PhotoData skipped. Decoding ");
                    stringBuilder.append(str);
                    stringBuilder.append(" failed.");
                    bli.m873e("FilmstripItemData", stringBuilder.toString());
                    iqp = null;
                } else {
                    width = decodeFile.getWidth();
                    height = decodeFile.getHeight();
                    if (width == 0 || height == 0) {
                        valueOf = String.valueOf(str);
                        str2 = "PhotoData skipped. Bitmap size 0 for ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        bli.m873e("FilmstripItemData", valueOf);
                        iqp = null;
                    }
                }
                this.f4148a = iqp;
                if (this.f4148a == null) {
                    this.f4148a = new iqp(0, 0);
                }
            } else {
                width = options.outWidth;
                height = options.outHeight;
            }
            iqp = new iqp(width, height);
            this.f4148a = iqp;
            if (this.f4148a == null) {
                this.f4148a = new iqp(0, 0);
            }
        }
        return (iqp) jri.m13152b(this.f4148a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FilmstripItemData {");
        stringBuilder.append("id:");
        stringBuilder.append(this.f4149b);
        stringBuilder.append(",title:");
        stringBuilder.append(this.f4150c);
        stringBuilder.append(",mimeType:");
        stringBuilder.append(this.f4151d);
        stringBuilder.append(",creationDate:");
        stringBuilder.append(this.f4152e);
        stringBuilder.append(",lastModifiedDate:");
        stringBuilder.append(this.f4153f);
        stringBuilder.append(",filePath:");
        stringBuilder.append(this.f4154g);
        stringBuilder.append(",uri:");
        stringBuilder.append(this.f4155h);
        stringBuilder.append(",inProgress:");
        stringBuilder.append(this.f4156i);
        stringBuilder.append(",dimensions:");
        stringBuilder.append(this.f4148a);
        stringBuilder.append(",sizeInBytes:");
        stringBuilder.append(this.f4157j);
        stringBuilder.append(",orientation:");
        stringBuilder.append(this.f4158k);
        stringBuilder.append(",location:");
        stringBuilder.append(this.f4159l);
        stringBuilder.append(",cancellable:");
        stringBuilder.append(this.f4160m);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

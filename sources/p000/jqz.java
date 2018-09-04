package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import java.io.File;

/* compiled from: PG */
/* renamed from: jqz */
public final class jqz implements jqs {
    /* renamed from: a */
    public final int f21886a;
    /* renamed from: b */
    public final int f21887b;
    /* renamed from: c */
    private final File f21888c;

    public jqz(File file) {
        this.f21888c = file;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            throw new jra();
        }
        this.f21886a = options.outWidth;
        this.f21887b = options.outHeight;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final int mo703a() {
        return this.f21887b;
    }

    /* renamed from: b */
    public final int mo704b() {
        return this.f21886a;
    }

    /* renamed from: a */
    public final jqr mo3173a(jqo jqo) {
        return mo3174b(jqo);
    }

    /* renamed from: b */
    public final jqr mo3174b(jqo jqo) {
        return jqp.m4608a(jqo, this.f21888c.getAbsolutePath(), new Options());
    }

    /* renamed from: a */
    public final jqr mo3172a(Rect rect, jqo jqo) {
        boolean z;
        boolean z2 = true;
        jri.m13152b((Object) rect);
        if (rect.width() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (rect.height() <= 0) {
            z2 = false;
        }
        jri.m13143a(z2);
        return jqp.m4609a(jqo, this.f21888c.getAbsolutePath(), rect);
    }

    /* renamed from: a */
    public final jqr mo3171a(int i, int i2, jqo jqo) {
        boolean z;
        boolean z2 = false;
        int i3 = 1;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "width must be > 0.");
        if (i2 > 0) {
            z2 = true;
        }
        jri.m13144a(z2, (Object) "height must be > 0.");
        int i4 = this.f21886a;
        int i5 = this.f21887b;
        if (i5 > i2 || i4 > i) {
            i5 /= 2;
            i4 /= 2;
            while (i5 / i3 > i2 && i4 / i3 > i) {
                i3 += i3;
            }
        }
        Options options = new Options();
        options.inSampleSize = i3;
        jqr a = jqp.m4608a(jqo, this.f21888c.getAbsolutePath(), options);
        if (a.mo3498b() == i && a.mo3496a() == i2) {
            return a;
        }
        jqr a2 = jqp.m4606a(jqo, "jpeg", (Bitmap) a.mo3191e(), i, i2);
        a.close();
        return a2;
    }
}

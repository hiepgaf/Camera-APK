package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.PostviewCallback;
import com.google.googlex.gcam.YuvReadView;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: bzi */
final class bzi extends PostviewCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f11535a;
    /* renamed from: b */
    private final /* synthetic */ bze f11536b;

    bzi(bze bze, bzx bzx) {
        this.f11536b = bze;
        this.f11535a = bzx;
    }

    public final void RgbReady(int i, InterleavedReadViewU8 interleavedReadViewU8, int i2) {
        boolean z;
        bli.m863a(bze.f1734a, String.format(null, "Got postview (shotId = %d, pixelFormat = %s)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        if (this.f11536b.f1752s == go.f5588z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        if (i != GcamModule.getKInvalidShotId()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        jri.m13152b((Object) interleavedReadViewU8);
        kbg bitmap = this.f11536b.f1746m.getBitmap();
        jri.m13153b(bitmap.mo2084b());
        Bitmap bitmap2 = (Bitmap) bitmap.mo2081a();
        if (this.f11535a.mo600f().mo2084b()) {
            Bitmap createBitmap;
            bzz bzz = (bzz) this.f11535a.mo600f().mo2081a();
            if (bzz.f1770a.mo2084b()) {
                eyh eyh = (eyh) bzz.f1770a.mo2081a();
                eyh.f4353e.mo3557a(bitmap2.copy(Config.ARGB_8888, false));
            }
            if (bzz.f1771b != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) bzz.f1771b);
                createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            } else {
                createBitmap = bitmap2;
            }
            fwb fwb = bzz.f1772c.f4755d;
            fwb.mo3051a(createBitmap);
            fwb.mo3052a(createBitmap, 0);
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap2.compress(CompressFormat.JPEG, 90, byteArrayOutputStream);
            fwb.mo3055a(byteArrayOutputStream.toByteArray());
        }
    }

    public final void YuvReady(int i, YuvReadView yuvReadView, int i2) {
        boolean z;
        boolean z2 = true;
        if (this.f11536b.f1752s == go.f5588z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        if (i == GcamModule.getKInvalidShotId()) {
            z2 = false;
        }
        jri.m13143a(z2);
        jri.m13152b((Object) yuvReadView);
    }
}

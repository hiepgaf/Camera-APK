package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import com.google.android.GoogleCamera.R;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: dfh */
final class dfh extends Thread {
    /* renamed from: a */
    private final /* synthetic */ des f3029a;

    dfh(des des) {
        this.f3029a = des;
    }

    public final void run() {
        int i;
        if (this.f3029a.f22815X == go.ag) {
            i = R.drawable.ic_photosphere_processing;
        } else {
            i = R.drawable.ic_panorama_processing;
        }
        Bitmap bitmap = ((BitmapDrawable) this.f3029a.f22830p.mo2756k().getResources().getDrawable(i)).getBitmap();
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
            byteArrayOutputStream.close();
            des des = this.f3029a;
            int i2 = !des.f22819e ? R.string.processing_photo_sphere : R.string.processing_panorama;
            gkr gkr = des.f22829o.f3936b;
            glw glw = glw.PANORAMA;
            if (!this.f3029a.f22819e) {
                glw = glw.PHOTOSPHERE;
            }
            gkr.mo2873a(byteArrayOutputStream.toByteArray(), hci.m11749a(i2, new Object[0]), glw);
            this.f3029a.f20801a.f1041a.mo1504a(gkr);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3029a.f22807O;
            goe m = gkr.mo2885m();
            if (m.m2654b()) {
                new FileOutputStream(m.m2653a()).write(byteArrayOutputStream.toByteArray());
                this.f3029a.f22829o.f3936b.mo2888p();
                des des2 = this.f3029a;
                if (des2.f22819e) {
                    i2 = 11;
                } else {
                    i2 = 5;
                }
                irs f = des2.ag;
                des des3 = this.f3029a;
                f.mo1569a(i2, des3.f22833s, des3.f22806N, ((float) elapsedRealtime) * 0.001f, des3.m17026w());
                return;
            }
            throw new IOException("Temporary session file not usable.");
        } catch (IOException e) {
            bli.m866b(des.f22792c, "Could not write temporary panorama image.");
        }
    }
}

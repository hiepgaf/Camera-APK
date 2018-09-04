package p000;

import android.hardware.camera2.TotalCaptureResult;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bke */
final class bke implements iju {
    /* renamed from: a */
    private final /* synthetic */ long f10979a;
    /* renamed from: b */
    private final /* synthetic */ Boolean f10980b;
    /* renamed from: c */
    private final /* synthetic */ Float f10981c;
    /* renamed from: d */
    private final /* synthetic */ bjz f10982d;

    bke(bjz bjz, long j, Boolean bool, Float f) {
        this.f10982d = bjz;
        this.f10979a = j;
        this.f10980b = bool;
        this.f10981c = f;
    }

    /* renamed from: a */
    private final kpk m7494a(iwp iwp, iwz iwz) {
        boolean z;
        long f = iwz.mo2719f();
        Object obj = (Long) iwp.mo3143a(TotalCaptureResult.SENSOR_TIMESTAMP);
        jri.m13152b(obj);
        if (f == obj.longValue()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        long currentTimeMillis = System.currentTimeMillis();
        jri.m13152b((Integer) iwp.mo3143a(TotalCaptureResult.JPEG_ORIENTATION));
        ByteBuffer a = ((ixa) iwz.mo2718e().get(0)).mo637a();
        byte[] bArr = new byte[a.capacity()];
        a.get(bArr);
        iwz.close();
        ExifInterface exifInterface = new ExifInterface();
        try {
            int intValue;
            int intValue2;
            exifInterface.m8485a(bArr);
            Integer a2 = exifInterface.mo828a(ExifInterface.f12412x);
            if (a2 != null) {
                intValue = a2.intValue();
            } else {
                intValue = 0;
            }
            Integer a3 = exifInterface.mo828a(ExifInterface.f12413y);
            if (a3 != null) {
                intValue2 = a3.intValue();
            } else {
                intValue2 = 0;
            }
            if (exifInterface.m8491e(ExifInterface.f12390b) == null || exifInterface.m8491e(ExifInterface.f12389a) == null) {
                exifInterface.m8480a(exifInterface.m8479a(ExifInterface.f12389a, Integer.valueOf(intValue)));
                exifInterface.m8480a(exifInterface.m8479a(ExifInterface.f12390b, Integer.valueOf(intValue2)));
            }
            File a4 = this.f10982d.f20098d.m2811a(this.f10982d.f20098d.m2812a(currentTimeMillis), ixx.JPEG);
            if (a4.exists()) {
                return kow.m13618a(new IOException("snapshot file already exists."));
            }
            this.f10982d.f20099e.mo1613a(a4, new ByteArrayInputStream(bArr), kbg.m4745c(exifInterface));
            iqm a5 = isx.m4158a(isx.m4159a(exifInterface));
            iqp iqp = new iqp(intValue, intValue2);
            kbg kbg = kau.f19138a;
            if (this.f10982d.f20101g.mo2084b()) {
                kbg = kbg.m4744b(((hjw) this.f10982d.f20101g.mo2081a()).mo1244d());
            }
            Object bju = new bju(exifInterface, a4, kbg, ixx.JPEG, iqp, this.f10980b.booleanValue(), this.f10981c.floatValue(), a5.f7326e, currentTimeMillis, System.currentTimeMillis() - this.f10979a);
            this.f10982d.m14849b();
            return kow.m13617a(bju);
        } catch (IOException e) {
            bli.m866b(bjz.f20095a, "fail to read EXIF from JPEG byte array.");
            throw e;
        }
    }
}

package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.jni.microvideotonemap.MicrovideoToneMapNative;
import java.nio.ByteBuffer;
import java.util.concurrent.Future;

/* renamed from: eye */
final /* synthetic */ class eye implements Runnable {
    /* renamed from: a */
    private final eyl f4343a;
    /* renamed from: b */
    private final kpk f4344b;
    /* renamed from: c */
    private final kpk f4345c;

    eye(eyl eyl, kpk kpk, kpk kpk2, int i) {
        this.f4343a = eyl;
        this.f4344b = kpk;
        this.f4345c = kpk2;
    }

    public final void run() {
        eyl eyl = this.f4343a;
        Future future = this.f4344b;
        iwz iwz = (iwz) kow.m13625c(future);
        Bitmap bitmap = (Bitmap) kow.m13625c(this.f4345c);
        if (bitmap == null || iwz == null) {
            bli.m873e("MeanVarianceToneMapParameterExtractor", "Skip tone mapping extraction, either shutter frame or postview bitmap is null.");
            return;
        }
        Object iyq = new iyq();
        iyp iyp = new iyp();
        int g = iwz.mo2720g();
        int d = iwz.mo2717d();
        ixa ixa = (ixa) iwz.mo2718e().get(1);
        ixa ixa2 = (ixa) iwz.mo2718e().get(2);
        ByteBuffer a = cdn.m1118a(g, d, (ixa) iwz.mo2718e().get(0));
        int i = g / 2;
        int i2 = d / 2;
        ByteBuffer a2 = cdn.m1118a(i, i2, ixa);
        ByteBuffer a3 = cdn.m1118a(i, i2, ixa2);
        int width = bitmap.getWidth();
        i = bitmap.getHeight();
        int i3 = width * i;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3);
        int i4 = i3 / 4;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i4);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i4);
        MicrovideoToneMapNative.argbToYuv(bitmap, allocateDirect, allocateDirect2, allocateDirect3);
        MicrovideoToneMapNative.extractMeanVarianceMappingNative(g, d, a, a2, a3, width, i, allocateDirect, allocateDirect2, allocateDirect3, iyp);
        iyq.f21825a = iyp;
        eyl.f4356a.mo3557a(iyq);
        ((iwz) kow.m13625c(future)).close();
    }
}

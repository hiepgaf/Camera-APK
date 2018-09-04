package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.CameraProfile;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.android.libraries.camera.jpegutil.JpegUtilNative;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ggk */
public final class ggk extends ggx {
    /* renamed from: a */
    private static final String f21456a = bli.m862a("TaskCompImg2Jpg");
    /* renamed from: b */
    private final ghf f21457b;

    ggk(gfw gfw, Executor executor, gfv gfv, get get, ghf ghf) {
        super(gfw, executor, gfv, go.aU, get);
        this.f21457b = ghf;
    }

    public final void run() {
        ghg c;
        Object obj;
        ggt ggt;
        int i;
        ggt ggt2;
        Object obj2;
        int i2 = 0;
        gfw gfw = (gfw) jri.m13152b(this.g);
        ((grg) jri.m13152b(this.h.mo1482h())).mo1522b();
        int i3;
        ByteBuffer byteBuffer;
        switch (gfw.f5149b.mo2716c()) {
            case 35:
                Rect a = ggr.m2545a(gfw.f5149b, gfw.f5153f);
                try {
                    ggt ggt3 = new ggt(gfw.f5150c, gfw.f5149b.mo2720g(), gfw.f5149b.mo2717d());
                    iqp iqp = new iqp(a.width(), a.height());
                    ggt ggt4 = new ggt(gfw.f5150c, iqp.f7329a, iqp.f7330b);
                    m2546a(this.e, ggt4, go.aX);
                    i3 = (ggt4.f5172c * 3) * ggt4.f5171b;
                    i2 = i3 / 2;
                    c = this.f21457b.m2551c(Integer.valueOf(i2));
                    byteBuffer = (ByteBuffer) c.m11082a();
                    if (byteBuffer != null) {
                        int a2 = JpegUtilNative.m1353a(gfw.f5149b, byteBuffer, CameraProfile.getJpegEncodingQualityParameter(2), gfw.f5153f);
                        if (a2 > i2) {
                            c.close();
                            this.f21457b.m2551c(Integer.valueOf(i3));
                            byteBuffer = (ByteBuffer) c.m11082a();
                            if (byteBuffer == null) {
                                this.h.mo1481a(hci.m11747a(), true, "Failed to allocate jpeg buffer for encoding.");
                                c.close();
                                this.c.mo1472a(gfw.f5149b, this.d);
                                return;
                            }
                            a2 = JpegUtilNative.m1353a(gfw.f5149b, byteBuffer, CameraProfile.getJpegEncodingQualityParameter(2), gfw.f5153f);
                            obj = byteBuffer;
                        } else {
                            ByteBuffer byteBuffer2 = byteBuffer;
                        }
                        if (a2 >= 0) {
                            obj.limit(a2);
                            this.c.mo1472a(gfw.f5149b, this.d);
                            ExifInterface exifInterface = itg.m4197a().f7455a;
                            exifInterface.m8486a(ExifInterface.f12397i, this.g.f5154g, TimeZone.getDefault());
                            ExifInterface exifInterface2 = exifInterface;
                            ggt = ggt3;
                            i = a2;
                            ggt2 = ggt4;
                            break;
                        }
                        c.close();
                        throw new RuntimeException("Error compressing jpeg.");
                    }
                    this.h.mo1481a(hci.m11747a(), true, "Failed to allocate jpeg buffer for encoding.");
                    c.close();
                    return;
                } finally {
                    this.c.mo1472a(gfw.f5149b, this.d);
                }
            case 256:
                try {
                    byteBuffer = ((ixa) gfw.f5149b.mo2718e().get(0)).mo637a();
                    Object allocate = ByteBuffer.allocate(byteBuffer.limit());
                    if (allocate != null) {
                        ExifInterface a3;
                        isx isx;
                        Integer valueOf;
                        Integer valueOf2;
                        Rect a4;
                        ggt ggt5;
                        byteBuffer.rewind();
                        allocate.put(byteBuffer);
                        byteBuffer.rewind();
                        allocate.rewind();
                        if (allocate.array() != null) {
                            a3 = itg.m4194a(allocate.array());
                            ggm ggm = new ggm(isx.m4159a(a3), ((Integer) jri.m13152b(a3.mo828a(ExifInterface.f12412x))).intValue(), ((Integer) jri.m13152b(a3.mo828a(ExifInterface.f12413y))).intValue());
                            isx = ggm.f5160a;
                            valueOf = Integer.valueOf(ggm.f5161b);
                            valueOf2 = Integer.valueOf(ggm.f5162c);
                        } else {
                            a3 = null;
                            valueOf2 = null;
                            valueOf = null;
                            isx = null;
                        }
                        iqm a5 = isx.m4158a(isx);
                        iqm a6 = iqm.m4037a(gfw.f5150c.f7326e + a5.f7326e);
                        if (valueOf == null || valueOf2 == null) {
                            bli.m873e(f21456a, "Cannot parse EXIF for image dimensions, passing 0x0 dimensions");
                            i3 = 0;
                            a4 = ggr.m2545a(gfw.f5149b, ggr.m2544a(gfw.f5153f, a6));
                            i = 0;
                        } else {
                            i3 = valueOf.intValue();
                            i = valueOf2.intValue();
                            a4 = ggr.m2543a(i3, i, ggr.m2544a(gfw.f5153f, a6));
                        }
                        ggt2 = new ggt(a5, i3, i);
                        iwz iwz = gfw.f5149b;
                        if (a4 != null) {
                            i2 = a4.equals(new Rect(0, 0, iwz.mo2720g(), iwz.mo2717d())) ^ 1;
                        }
                        if (i2 != 0) {
                            ggt5 = new ggt(a5, a4.width(), a4.height());
                            byte[] array = allocate.array();
                            int jpegEncodingQualityParameter = CameraProfile.getJpegEncodingQualityParameter(2);
                            Bitmap createBitmap = Bitmap.createBitmap(BitmapFactory.decodeByteArray(array, 0, array.length), a4.left, a4.top, a4.width(), a4.height());
                            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            createBitmap.compress(CompressFormat.JPEG, jpegEncodingQualityParameter, byteArrayOutputStream);
                            byte[] toByteArray = byteArrayOutputStream.toByteArray();
                            byteBuffer = ByteBuffer.allocate(toByteArray.length);
                            byteBuffer.put(ByteBuffer.wrap(toByteArray));
                            byteBuffer.rewind();
                            allocate = byteBuffer;
                        } else {
                            ggt5 = ggt2;
                        }
                        this.c.mo1472a(gfw.f5149b, this.d);
                        long j = this.e;
                        jri.m13152b((Object) ggt2);
                        m2546a(j, (ggt) jri.m13152b((Object) ggt5), go.aX);
                        i = ((ByteBuffer) jri.m13152b(allocate)).limit();
                        obj2 = a3;
                        ggt = ggt2;
                        ggt2 = ggt5;
                        obj = allocate;
                        c = null;
                        break;
                    }
                    this.h.mo1481a(hci.m11747a(), true, "Failed to allocate jpeg buffer for encoding.");
                    return;
                } finally {
                    this.c.mo1472a(gfw.f5149b, this.d);
                }
                break;
            default:
                this.c.mo1472a(gfw.f5149b, this.d);
                throw new IllegalArgumentException("Unsupported input image format for TaskCompressImageToJpeg");
        }
        byte[] bArr = new byte[i];
        ((ByteBuffer) jri.m13152b(obj)).get(bArr);
        obj.rewind();
        if (c != null) {
            c.close();
        }
        m11077a(this.e, ggt2, bArr, go.aX);
        ExifInterface a7 = m11075a(kbg.m4744b(obj2), ggt2, gfw.f5151d);
        ((grg) jri.m13152b(this.h.mo1482h())).mo1512a(a7);
        kow.m13622a(glx.m11180a(this.h, bArr, ggt2.f5172c, ggt2.f5171b, ((iqm) jri.m13152b(ggt2.f5170a)).f7326e, a7), new ggl(this, ggt, ggt2), kpq.f8410a);
        kpk kpk = gfw.f5151d;
        if (kpk.isDone()) {
            try {
                ((grg) jri.m13152b(this.h.mo1482h())).mo1517a((iwp) kpk.get());
                ((grg) jri.m13152b(this.h.mo1482h())).mo1524c();
            } catch (InterruptedException e) {
                bli.m866b(f21456a, "CaptureResults not added to photoCaptureDoneEvent event due to Interrupted Exception.");
                ((grg) jri.m13152b(this.h.mo1482h())).mo1524c();
            } catch (ExecutionException e2) {
                bli.m873e(f21456a, "CaptureResults not added to photoCaptureDoneEvent event due to Execution Exception.");
                ((grg) jri.m13152b(this.h.mo1482h())).mo1524c();
            } catch (Throwable th) {
                Throwable th2 = th;
                ((grg) jri.m13152b(this.h.mo1482h())).mo1524c();
            }
        } else {
            bli.m873e(f21456a, "CaptureResults unavailable to photoCaptureDoneEvent event.");
            ((grg) jri.m13152b(this.h.mo1482h())).mo1524c();
        }
    }
}

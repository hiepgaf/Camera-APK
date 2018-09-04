package p000;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.CameraProfile;
import android.net.Uri;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ggx */
public abstract class ggx extends ggr {
    /* renamed from: a */
    private final iqb f16904a;

    static {
        bli.m862a("TaskJpegEnc");
    }

    public ggx(gfw gfw, Executor executor, gfv gfv, int i, get get) {
        super(gfw, executor, gfv, i, get);
        this.f16904a = ggz.f16906a;
    }

    public ggx(ggr ggr, int i) {
        super(ggr, i);
        this.f16904a = ggy.f16905a;
    }

    /* renamed from: a */
    public static byte[] m11073a(byte[] bArr, int i, int i2, int[] iArr) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, iArr);
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), CameraProfile.getJpegEncodingQualityParameter(2), byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    protected final ExifInterface m11075a(kbg kbg, ggt ggt, kpk kpk) {
        itg itg;
        if (kbg.mo2084b()) {
            itg = new itg((ExifInterface) kbg.mo2081a());
        } else {
            itg = itg.m4197a();
        }
        itg.m4199a(ggt.f5172c, ggt.f5171b, ggt.f5170a, kbg.m4744b((iwp) iel.m3713a(kpk)));
        this.f16904a.mo369a(itg);
        return itg.f7455a;
    }

    /* renamed from: a */
    static final /* synthetic */ void m11072a() {
    }

    /* renamed from: b */
    static final /* synthetic */ void m11074b() {
    }

    /* renamed from: a */
    public final void m11077a(long j, ggt ggt, byte[] bArr, int i) {
        this.c.mo1477b().mo1417a(new ggu(j, ggt, i), new ggs(bArr));
    }

    /* renamed from: a */
    public final void m11076a(long j, ggt ggt, Uri uri, int i) {
        this.c.mo1477b().mo1416a(new ggu(j, ggt, i), uri);
    }
}

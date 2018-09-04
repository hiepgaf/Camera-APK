package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.imageio.JpgHelper;

/* compiled from: PG */
/* renamed from: cas */
final class cas implements Runnable {
    /* renamed from: a */
    private final InterleavedReadViewU8 f1817a;
    /* renamed from: b */
    private final kpw f1818b;
    /* renamed from: c */
    private final int f1819c;
    /* renamed from: d */
    private final ExifMetadata f1820d;
    /* renamed from: e */
    private final int f1821e;
    /* renamed from: f */
    private final /* synthetic */ car f1822f;

    public cas(car car, InterleavedReadViewU8 interleavedReadViewU8, kpw kpw, GoudaRequest goudaRequest, ExifMetadata exifMetadata, int i) {
        this.f1822f = car;
        this.f1817a = interleavedReadViewU8;
        this.f1818b = kpw;
        this.f1819c = goudaRequest.getImage_rotation();
        this.f1820d = exifMetadata;
        this.f1821e = i;
    }

    public final void run() {
        int width = this.f1817a.width();
        int height = this.f1817a.height();
        kbg encodeToJpegAsByteArray = JpgHelper.encodeToJpegAsByteArray(this.f1817a);
        if (encodeToJpegAsByteArray.mo2084b()) {
            int i;
            bli.m863a(car.f20175a, "Gouda image encoded successfully");
            switch (this.f1819c) {
                case 0:
                    i = MediaDecoder.ROTATE_90_LEFT;
                    break;
                case 1:
                    i = MediaDecoder.ROTATE_180;
                    break;
                case 2:
                    i = 90;
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    i = 0;
                    break;
            }
            itg itg = new itg(itg.m4194a((byte[]) encodeToJpegAsByteArray.mo2081a()));
            itg.m4199a(width, height, iqm.m4037a(i), kau.f19138a);
            long timestamp_unix_us = this.f1820d.getTimestamp_unix_us();
            this.f1818b.mo3557a(foz.m2358a(((long) this.f1821e) + (timestamp_unix_us / 1000), (byte[]) encodeToJpegAsByteArray.mo2081a(), new iqp(width, height), i, itg.f7455a, this.f1822f.f20176b, false));
            return;
        }
        bli.m866b(car.f20175a, "Error encoding gouda image");
        this.f1818b.m17780a(new RuntimeException("Image couldn't be encoded."));
    }
}

package p000;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.YuvReadView;

/* compiled from: PG */
/* renamed from: gdv */
public final class gdv {
    /* renamed from: a */
    public final /* synthetic */ fwb f5099a;
    /* renamed from: b */
    public final /* synthetic */ cau f5100b;
    /* renamed from: c */
    private final /* synthetic */ gkr f5101c;

    public gdv(cau cau, fwb fwb, gkr gkr) {
        this.f5100b = cau;
        this.f5099a = fwb;
        this.f5101c = gkr;
    }

    /* renamed from: a */
    public final void m2497a(long j, hjl hjl, gdy gdy, String str) {
        if (hjl.f6272a.mo2084b()) {
            InterleavedReadViewU8 interleavedReadViewU8 = (InterleavedReadViewU8) hjl.f6272a.mo2081a();
            hjo a = ((hjn) jri.m13152b(this.f5100b.f22625a)).m3209a();
            if (interleavedReadViewU8.width() <= 0 || interleavedReadViewU8.height() <= 0) {
                bli.m871d(car.f20175a, "Received an invalid primary image, ignoring");
                cau cau = this.f5100b;
                a.close();
                cau.m16918a(j);
                return;
            }
            bli.m871d(car.f20175a, "Received a valid primary image, saving");
            this.f5100b.m16914a(j, interleavedReadViewU8, gdy, 100, cat.PRIMARY, str, a);
            return;
        }
        YuvReadView yuvReadView = (YuvReadView) hjl.f6273b.mo2081a();
        hjo a2 = ((hjn) jri.m13152b(this.f5100b.f22625a)).m3209a();
        String str2;
        if (yuvReadView.width() <= 0 || yuvReadView.height() <= 0) {
            str2 = car.f20175a;
            StringBuilder stringBuilder = new StringBuilder(73);
            stringBuilder.append("Received an invalid primary image, ignoring for shot ");
            stringBuilder.append(j);
            bli.m866b(str2, stringBuilder.toString());
            cau = this.f5100b;
            a2.close();
            cau.m16918a(j);
        } else if (!this.f5100b.f22629e.mo2084b()) {
            bli.m866b(car.f20175a, "Received a YUV image without FxImageSaver associated with it. Ignoring.");
            cau = this.f5100b;
            a2.close();
            cau.m16918a(j);
        } else if (this.f5100b.f22631g != null) {
            ExifInterface a3 = bxe.m1032a(yuvReadView.width(), yuvReadView.height(), this.f5100b.f22628d);
            iwz cak = new cak(yuvReadView, this.f5100b.f22632h);
            kow.m13622a(this.f5100b.f22638n.f20177c.m10590a(new cav(this, new gfw(cak, iqm.m4037a(this.f5100b.f22636l), kow.m13617a(this.f5100b.f22631g), new Rect(0, 0, cak.mo2720g(), cak.mo2717d()), a3, this.f5101c.mo1482h()))), new caw(this, cak, a3, str, gdy, a2, j), this.f5100b.f22638n.f20180f);
        } else {
            str2 = car.f20175a;
            int i = this.f5100b.f22630f;
            StringBuilder stringBuilder2 = new StringBuilder(57);
            stringBuilder2.append("Not metadata associated with frame ");
            stringBuilder2.append(i);
            stringBuilder2.append(", ignoring.");
            bli.m873e(str2, stringBuilder2.toString());
            cau = this.f5100b;
            a2.close();
            cau.m16918a(j);
        }
    }
}

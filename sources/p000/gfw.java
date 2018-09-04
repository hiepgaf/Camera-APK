package p000;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: gfw */
public class gfw {
    /* renamed from: b */
    public final iwz f5149b;
    /* renamed from: c */
    public final iqm f5150c;
    /* renamed from: d */
    public final kpk f5151d;
    /* renamed from: e */
    public final grg f5152e;
    /* renamed from: f */
    public final Rect f5153f;
    /* renamed from: g */
    public final long f5154g;
    /* renamed from: h */
    public final ExifInterface f5155h;

    public gfw(iwz iwz, iqm iqm, kpk kpk) {
        this(iwz, iqm, kpk, new Rect(0, 0, iwz.mo2720g(), iwz.mo2717d()));
    }

    public gfw(iwz iwz, iqm iqm, kpk kpk, Rect rect) {
        this(iwz, iqm, kpk, rect, iwz.mo2719f(), null, null);
    }

    public gfw(iwz iwz, iqm iqm, kpk kpk, Rect rect, long j, ExifInterface exifInterface, grg grg) {
        this.f5149b = iwz;
        this.f5150c = iqm;
        this.f5151d = kpk;
        this.f5153f = rect;
        this.f5154g = j;
        this.f5155h = exifInterface;
        this.f5152e = grg;
    }

    public gfw(iwz iwz, iqm iqm, kpk kpk, Rect rect, ExifInterface exifInterface, grg grg) {
        this(iwz, iqm, kpk, rect, iwz.mo2719f(), exifInterface, grg);
    }
}

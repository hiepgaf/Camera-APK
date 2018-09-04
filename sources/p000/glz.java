package p000;

import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;

/* compiled from: PG */
/* renamed from: glz */
public final class glz {
    /* renamed from: a */
    public final iqp f5404a;
    /* renamed from: b */
    public final ixx f5405b;
    /* renamed from: c */
    public kbg f5406c = kau.f19138a;
    /* renamed from: d */
    public kbg f5407d = kau.f19138a;
    /* renamed from: e */
    public kbg f5408e = kau.f19138a;
    /* renamed from: f */
    public kbg f5409f = kau.f19138a;

    public glz(iqp iqp, ixx ixx) {
        this.f5404a = iqp;
        this.f5405b = ixx;
    }

    /* renamed from: a */
    public final eqn m2612a(File file) {
        return new gma(this, file);
    }

    /* renamed from: a */
    public final glz m2614a(ExifInterface exifInterface) {
        this.f5407d = kbg.m4744b(exifInterface);
        return this;
    }

    /* renamed from: a */
    public final glz m2613a(Location location) {
        this.f5409f = kbg.m4744b(location);
        return this;
    }

    /* renamed from: a */
    public final glz m2615a(Integer num) {
        this.f5406c = kbg.m4744b(num);
        return this;
    }
}

package p000;

import android.media.CamcorderProfile;

/* compiled from: PG */
/* renamed from: inx */
public final class inx {
    /* renamed from: a */
    public static ioa m3899a(iur iur, inz inz) {
        return ioc.m12314a(CamcorderProfile.get(Integer.parseInt(iur.f7482b), inz.f7189a)).m3919a();
    }

    /* renamed from: a */
    public static ioa m3900a(iur iur, iob iob) {
        return ioc.m12314a(CamcorderProfile.get(Integer.parseInt(iur.f7482b), iob.f7208a)).m3919a();
    }

    /* renamed from: b */
    public static boolean m3901b(iur iur, inz inz) {
        return CamcorderProfile.hasProfile(Integer.parseInt(iur.f7482b), inz.f7189a);
    }
}

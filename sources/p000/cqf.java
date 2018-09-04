package p000;

import android.content.Context;
import com.google.android.apps.camera.metadata.refocus.RgbzMetadataLoader;

/* compiled from: PG */
/* renamed from: cqf */
public final class cqf {
    /* renamed from: a */
    public static boolean m1406a(Context context, err err) {
        boolean z = false;
        erj erj = new erj();
        if (err.mo1032f().f4133a.contains(ert.IS_IMAGE)) {
            int i;
            int i2;
            ezk a = erz.m2094a(context, err.mo1033g().f4155h);
            if (a == null) {
                i = 0;
            } else if (a == erz.f4185a) {
                i = 0;
            } else {
                erj.f4120f = true;
                erj.f4121g = a.f4382b;
                erj.f4122h = a.f4381a;
                erj.f4129o = a.f4383c;
                i = 1;
            }
            i |= RgbzMetadataLoader.loadRgbzMetadata(context, err.mo1033g().f4155h, erj);
            String str = err.mo1033g().f4154g;
            String str2 = err.mo1033g().f4150c;
            if (err.mo1032f().f4133a.contains(ert.IS_ANIMATION) && str2.startsWith("Burst_Cover_GIF_Action_")) {
                erj.f4126l = true;
                i2 = 1;
            } else if (eio.m1757a(str) && str2.startsWith("Burst_Cover_Collage_")) {
                erj.f4127m = true;
                i2 = 1;
            }
            z = dgd.m9046a(erj, err) | (i | i2);
        } else if (err.mo1032f().f4133a.contains(ert.IS_VIDEO)) {
            z = erk.m2031a(erj, err.mo1033g().f4154g);
        } else if (err.mo1032f().f4133a.contains(ert.IS_BURST) && err.mo1048e() == go.aq) {
            erj.f4124j = true;
            erj.f4125k = ((cou) err).m15146d();
            dgd.m9046a(erj, err);
            z = true;
        }
        erj.f4115a = true;
        err.mo1028a(erj.m2030a());
        return z;
    }
}

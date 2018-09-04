package p000;

import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dta */
public final class dta implements kaw {
    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        return ((fwl) obj).mo1170a();
    }

    /* renamed from: a */
    public static String m9346a(Context context, int i) {
        switch (i) {
            case 1:
                return context.getString(R.string.title);
            case 2:
                return context.getString(R.string.description);
            case 3:
                return context.getString(R.string.time);
            case 4:
                return context.getString(R.string.location);
            case 5:
                return context.getString(R.string.width);
            case 6:
                return context.getString(R.string.height);
            case 7:
                return context.getString(R.string.orientation);
            case 8:
                return context.getString(R.string.duration);
            case 9:
                return context.getString(R.string.mimetype);
            case 10:
                return context.getString(R.string.file_size);
            case 100:
                return context.getString(R.string.maker);
            case 101:
                return context.getString(R.string.model);
            case 102:
                return context.getString(R.string.flash);
            case 103:
                return context.getString(R.string.focal_length);
            case 104:
                return context.getString(R.string.white_balance);
            case 105:
                return context.getString(R.string.aperture);
            case 107:
                return context.getString(R.string.exposure_time);
            case 108:
                return context.getString(R.string.iso);
            case 200:
                return context.getString(R.string.path);
            default:
                StringBuilder stringBuilder = new StringBuilder(22);
                stringBuilder.append("Unknown key");
                stringBuilder.append(i);
                return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static bcn m9345a(fer fer, fxe fxe, ilp ilp, hjf hjf) {
        bcn bcn = new bcn();
        bcn.m792a(fer, feq.AUTO);
        ivy ivy = hjf.f6267b;
        if (!(ivy.f7508d || ivy.f7509e || hjf.m3195c())) {
            if (hjf.m3196d()) {
            }
            ivy = hjf.f6267b;
            if (!ivy.f7508d) {
                if (ivy.f7509e) {
                }
                return bcn;
            }
            bcn.m792a(fxe, fxj.AUTO);
            return bcn;
        }
        bcn.m792a(ilp, "off");
        ivy = hjf.f6267b;
        if (ivy.f7508d) {
            if (ivy.f7509e) {
            }
            return bcn;
        }
        bcn.m792a(fxe, fxj.AUTO);
        return bcn;
    }
}

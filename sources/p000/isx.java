package p000;

import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: isx */
public enum isx {
    TOP_LEFT((short) 1),
    TOP_RIGHT((short) 2),
    BOTTOM_RIGHT((short) 3),
    BOTTOM_LEFT((short) 4),
    LEFT_TOP((short) 5),
    RIGHT_TOP((short) 6),
    RIGHT_BOTTOM((short) 7),
    LEFT_BOTTOM((short) 8);
    
    /* renamed from: j */
    private static final kes f7406j = null;
    /* renamed from: b */
    public final short f7408b;

    static {
        Iterable asList = Arrays.asList(isx.values());
        f7406j = khb.m4889b(asList.iterator(), new isy());
    }

    private isx(short s) {
        this.f7408b = s;
    }

    /* renamed from: a */
    public static isx m4160a(iqm iqm) {
        jri.m13139a((Object) iqm, (Object) "must supply a valid orientation to convert to exif");
        switch (iqm.ordinal()) {
            case 0:
                return TOP_LEFT;
            case 1:
                return RIGHT_TOP;
            case 2:
                return BOTTOM_RIGHT;
            case 3:
                return LEFT_BOTTOM;
            default:
                throw new IllegalArgumentException("Orientation must be one of 4 defined values!");
        }
    }

    /* renamed from: a */
    public static iqm m4158a(isx isx) {
        if (isx == null) {
            Log.w("CAM_ExifOrientation", "Computing rotation for an null exif orientation, returning 0");
            return iqm.CLOCKWISE_0;
        }
        switch (isx.ordinal()) {
            case 0:
                return iqm.CLOCKWISE_0;
            case 2:
                return iqm.CLOCKWISE_180;
            case 5:
                return iqm.CLOCKWISE_90;
            case 7:
                return iqm.CLOCKWISE_270;
            default:
                String valueOf = String.valueOf(isx);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                stringBuilder.append("Computing rotation for an invalid orientation: ");
                stringBuilder.append(valueOf);
                Log.w("CAM_ExifOrientation", stringBuilder.toString());
                return iqm.CLOCKWISE_0;
        }
    }

    /* renamed from: a */
    public static isx m4159a(ExifInterface exifInterface) {
        if (exifInterface == null) {
            return null;
        }
        Integer a = exifInterface.mo828a(ExifInterface.f12395g);
        if (a == null) {
            return null;
        }
        return (isx) f7406j.get(Short.valueOf(a.shortValue()));
    }

    /* renamed from: a */
    public static isx m4161a(byte[] bArr) {
        jri.m13139a((Object) bArr, (Object) "byte array must be present and should contain jpeg data");
        return isx.m4159a(itg.m4194a(bArr));
    }
}

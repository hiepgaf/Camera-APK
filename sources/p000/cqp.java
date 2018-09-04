package p000;

import android.database.Cursor;
import android.media.CamcorderProfile;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import java.util.Date;

/* compiled from: PG */
/* renamed from: cqp */
public final class cqp {
    /* renamed from: a */
    private static final String f2566a = bli.m862a("VideoDataFact");
    /* renamed from: b */
    private static final iqp f2567b = new iqp(-2, -2);

    cqp() {
    }

    /* renamed from: a */
    public static cqv m1409a(Cursor cursor) {
        iqp iqp;
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        String string2 = cursor.getString(2);
        long j2 = cursor.getLong(3);
        long j3 = cursor.getLong(4);
        Date date = new Date(j2);
        Date date2 = new Date(1000 * j3);
        String string3 = cursor.getString(5);
        int i = cursor.getInt(6);
        int i2 = cursor.getInt(7);
        if (i == 0 || i2 == 0) {
            String str = f2566a;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(string3).length() + ScriptIntrinsicBLAS.RsBlas_zsyr2k);
            stringBuilder.append("Zero dimension in ContentResolver for ");
            stringBuilder.append(string3);
            stringBuilder.append(": ");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            stringBuilder.append(", defaulting to high quality CamcorderProfile dimensions as a fallback.");
            bli.m873e(str, stringBuilder.toString());
            CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
            if (camcorderProfile != null) {
                iqp = new iqp(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            } else {
                bli.m873e(f2566a, "Video profile was null, defaulting to unknown width and height.");
                iqp = f2567b;
            }
        } else {
            iqp = new iqp(i, i2);
        }
        long j4 = cursor.getLong(8);
        double d = cursor.getDouble(9);
        double d2 = cursor.getDouble(10);
        long j5 = cursor.getLong(11);
        return new cqv(j, string, string2, date, date2, string3, cqr.f2568a.buildUpon().appendPath(String.valueOf(j)).build(), false, iqp, j4, erx.m2086a(d, d2), j5);
    }
}

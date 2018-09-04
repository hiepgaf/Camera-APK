package p000;

import android.annotation.TargetApi;
import android.location.Location;
import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.util.concurrent.Executor;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: cnz */
public final class cnz {
    /* renamed from: a */
    public static final String f2219a = bli.m862a("BurstExif");

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static com.google.android.libraries.camera.exif.ExifInterface m1207a(java.io.File r3) {
        /*
        p000.jri.m13152b(r3);
        r1 = new java.io.BufferedInputStream;	 Catch:{ Exception -> 0x0019 }
        r0 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0019 }
        r0.<init>(r3);	 Catch:{ Exception -> 0x0019 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0019 }
        r0 = new com.google.android.libraries.camera.exif.ExifInterface;	 Catch:{ all -> 0x0020 }
        r0.<init>();	 Catch:{ all -> 0x0020 }
        r0.m8484a(r1);	 Catch:{ all -> 0x0020 }
        r1.close();	 Catch:{ Exception -> 0x0019 }
        return r0;
    L_0x0019:
        r0 = move-exception;
        r1 = new cob;
        r1.<init>(r0);
        throw r1;
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0022 }
    L_0x0022:
        r2 = move-exception;
        r1.close();	 Catch:{ all -> 0x0027 }
    L_0x0026:
        throw r2;	 Catch:{ Exception -> 0x0019 }
    L_0x0027:
        r1 = move-exception;
        p000.kqg.m5044a(r0, r1);	 Catch:{ Exception -> 0x0019 }
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: cnz.a(java.io.File):com.google.android.libraries.camera.exif.ExifInterface");
    }

    /* renamed from: a */
    public static Location m1206a(ExifInterface exifInterface) {
        double[] dArr;
        Location location = null;
        jri.m13152b((Object) exifInterface);
        iqn[] f = exifInterface.m8492f(ExifInterface.f12371E);
        String tagStringValue = exifInterface.getTagStringValue(ExifInterface.f12370D);
        iqn[] f2 = exifInterface.m8492f(ExifInterface.f12373G);
        String tagStringValue2 = exifInterface.getTagStringValue(ExifInterface.f12372F);
        if (f == null) {
            dArr = null;
        } else if (f2 == null) {
            dArr = null;
        } else if (tagStringValue == null) {
            dArr = null;
        } else if (tagStringValue2 == null) {
            dArr = null;
        } else if (f.length >= 3) {
            dArr = f2.length >= 3 ? new double[]{ExifInterface.m8468a(f, tagStringValue), ExifInterface.m8468a(f2, tagStringValue2)} : null;
        } else {
            dArr = null;
        }
        if (dArr != null) {
            location = new Location("exif-provider");
            location.setLatitude(dArr[0]);
            location.setLongitude(dArr[1]);
            if (location.getTime() == 0) {
                location.setTime(System.currentTimeMillis());
            }
            if (location.getElapsedRealtimeNanos() == 0) {
                location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
            }
        }
        return location;
    }

    /* renamed from: a */
    public static jaq m1208a(jip jip, File file, Executor executor) {
        jri.m13152b((Object) jip);
        jri.m13152b((Object) file);
        jri.m13152b((Object) executor);
        return jli.m12939a(executor, new coa(file));
    }
}

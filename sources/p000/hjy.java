package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

/* compiled from: PG */
/* renamed from: hjy */
public final class hjy {
    /* renamed from: a */
    private final Context f6283a;

    public hjy(Context context) {
        this.f6283a = context;
    }

    /* renamed from: a */
    public final boolean m3215a(String str) {
        jri.m13152b((Object) str);
        try {
            PackageInfo packageInfo = this.f6283a.getPackageManager().getPackageInfo("com.google.android.apps.photos", 0);
            if (packageInfo == null) {
                return false;
            }
            String str2 = packageInfo.versionName;
            if (str2.equals("DEVELOPMENT")) {
                return true;
            }
            return hjy.m3214a(str2, str);
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m3214a(String str, String str2) {
        try {
            if (new hjx(str).m3213a(new hjx(str2)) >= 0) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 39) + String.valueOf(str2).length());
            stringBuilder.append("Fail to check the version between ");
            stringBuilder.append(str);
            stringBuilder.append(" and ");
            stringBuilder.append(str2);
            bli.m866b("PhotosPkgDtr", stringBuilder.toString());
            return false;
        }
    }
}

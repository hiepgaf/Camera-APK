package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.GoogleCamera.R;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hue */
public class hue {
    @Deprecated
    /* renamed from: a */
    public static final int f6668a = 10298000;
    /* renamed from: b */
    public static final AtomicBoolean f6669b = new AtomicBoolean();
    /* renamed from: c */
    private static boolean f6670c = false;
    /* renamed from: d */
    private static boolean f6671d = false;
    /* renamed from: e */
    private static final AtomicBoolean f6672e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static String m3461a(int i) {
        return ConnectionResult.m15092a(i);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m3462a(Context context, int i) {
        return i != 18 ? i == 1 ? hue.m3463a(context, "com.google.android.gms") : false : true;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m3464b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public static Resources m3465c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    public static boolean m3466d(android.content.Context r6) {
        /*
        r0 = 0;
        r1 = 1;
        r2 = f6671d;
        if (r2 != 0) goto L_0x002f;
    L_0x0006:
        r2 = p000.iad.f6871a;	 Catch:{ NameNotFoundException -> 0x0044 }
        r2 = r2.m3601a(r6);	 Catch:{ NameNotFoundException -> 0x0044 }
        r3 = "com.google.android.gms";
        r4 = 64;
        r2 = r2.m3600b(r3, r4);	 Catch:{ NameNotFoundException -> 0x0044 }
        if (r2 == 0) goto L_0x002a;
    L_0x0016:
        p000.huf.m3468a(r6);	 Catch:{ NameNotFoundException -> 0x0044 }
        r3 = 1;
        r3 = new p000.hxa[r3];	 Catch:{ NameNotFoundException -> 0x0044 }
        r4 = p000.hxd.f6791a;	 Catch:{ NameNotFoundException -> 0x0044 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ NameNotFoundException -> 0x0044 }
        r5 = 0;
        r3[r5] = r4;	 Catch:{ NameNotFoundException -> 0x0044 }
        r2 = p000.huf.m3469a(r2, r3);	 Catch:{ NameNotFoundException -> 0x0044 }
        if (r2 != 0) goto L_0x0040;
    L_0x002a:
        r2 = 0;
        f6670c = r2;	 Catch:{ NameNotFoundException -> 0x0044 }
    L_0x002d:
        f6671d = r1;
    L_0x002f:
        r2 = f6670c;
        if (r2 != 0) goto L_0x003e;
    L_0x0033:
        r2 = "user";
        r3 = android.os.Build.TYPE;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x003e;
    L_0x003d:
        return r0;
    L_0x003e:
        r0 = r1;
        goto L_0x003d;
    L_0x0040:
        r2 = 1;
        f6670c = r2;	 Catch:{ NameNotFoundException -> 0x0044 }
        goto L_0x002d;
    L_0x0044:
        r2 = move-exception;
        r3 = "GooglePlayServicesUtil";
        r4 = "Cannot find Google Play services package name.";
        android.util.Log.w(r3, r4, r2);	 Catch:{ all -> 0x004f }
        f6671d = r1;
        goto L_0x002f;
    L_0x004f:
        r0 = move-exception;
        f6671d = r1;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: hue.d(android.content.Context):boolean");
    }

    @Deprecated
    /* renamed from: e */
    public static int m3467e(Context context) {
        int i;
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!("com.google.android.gms".equals(context.getPackageName()) || f6672e.get())) {
            int a = hws.m3566a(context);
            if (a == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (a != f6668a) {
                int i2 = f6668a;
                String valueOf = String.valueOf("com.google.android.gms.version");
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 290);
                stringBuilder.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                stringBuilder.append(i2);
                stringBuilder.append(" but found ");
                stringBuilder.append(a);
                stringBuilder.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"");
                stringBuilder.append(valueOf);
                stringBuilder.append("\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        if (htl.m3424a(context)) {
            i = 0;
        } else {
            if (htl.f6652a == null) {
                htl.f6652a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            i = !htl.f6652a.booleanValue() ? 1 : 0;
        }
        if (i != 0) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        packageInfo = null;
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            huf.m3468a(context);
            if (i != 0) {
                if (huf.m3469a(packageInfo, hxd.f6791a) != null) {
                    if (huf.m3469a(packageInfo2, huf.m3469a(packageInfo, hxd.f6791a)) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                }
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            } else if (huf.m3469a(packageInfo2, hxd.f6791a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (packageInfo2.versionCode / 1000 < f6668a / 1000) {
                int i3 = f6668a;
                i2 = packageInfo2.versionCode;
                StringBuilder stringBuilder2 = new StringBuilder(77);
                stringBuilder2.append("Google Play services out of date.  Requires ");
                stringBuilder2.append(i3);
                stringBuilder2.append(" but found ");
                stringBuilder2.append(i2);
                Log.w("GooglePlayServicesUtil", stringBuilder2.toString());
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (Throwable e2) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    static boolean m3463a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
            if (str.equals(appPackageName.getAppPackageName())) {
                return true;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled) {
                Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
                Object obj = applicationRestrictions != null ? "true".equals(applicationRestrictions.getString("restricted_profile")) ? 1 : null : null;
                if (obj == null) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}

package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bld */
public final class bld {
    /* renamed from: a */
    private final Set f1262a;
    /* renamed from: b */
    private final PackageManager f1263b;

    public bld(Context context, Set set) {
        this.f1263b = context.getPackageManager();
        this.f1262a = set;
    }

    /* renamed from: a */
    public final boolean m861a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Log.w("TrustedPartners", "null or empty package name; do not trust");
        } else {
            try {
                PackageInfo packageInfo = this.f1263b.getPackageInfo(str, 64);
                if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                    int length = packageInfo.signatures.length;
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 57);
                    stringBuilder.append(length);
                    stringBuilder.append(" signatures found for package (");
                    stringBuilder.append(str);
                    stringBuilder.append("); do not trust");
                    Log.w("TrustedPartners", stringBuilder.toString());
                } else {
                    try {
                        MessageDigest instance = MessageDigest.getInstance("SHA1");
                        instance.update(packageInfo.signatures[0].toByteArray());
                        z = this.f1262a.contains(iyl.m4340a(instance.digest()));
                    } catch (NoSuchAlgorithmException e) {
                        Log.e("TrustedPartners", "unable to compute hash using SHA1; do not trust");
                    }
                }
            } catch (NameNotFoundException e2) {
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 34);
                stringBuilder2.append("package not found (");
                stringBuilder2.append(str);
                stringBuilder2.append("); do not trust");
                Log.w("TrustedPartners", stringBuilder2.toString());
            }
        }
        return z;
    }
}

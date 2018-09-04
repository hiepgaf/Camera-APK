package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;

/* renamed from: huf */
public class huf {
    /* renamed from: a */
    private static huf f6673a;
    /* renamed from: b */
    private final Context f6674b;

    private huf(Context context) {
        this.f6674b = context.getApplicationContext();
        iad.f6871a.m3601a(this.f6674b);
    }

    /* renamed from: a */
    public static huf m3468a(Context context) {
        htl.m3431b((Object) context);
        synchronized (huf.class) {
            if (f6673a == null) {
                hwz.m3574a(context);
                f6673a = new huf(context);
            }
        }
        return f6673a;
    }

    /* renamed from: a */
    static hxa m3469a(PackageInfo packageInfo, hxa... hxaArr) {
        int i = 0;
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length == 1) {
            hxb hxb = new hxb(packageInfo.signatures[0].toByteArray());
            while (i < hxaArr.length) {
                if (hxaArr[i].equals(hxb)) {
                    return hxaArr[i];
                }
                i++;
            }
            return null;
        }
        Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        return null;
    }
}

package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: iac */
public final class iac {
    /* renamed from: a */
    public final Context f6870a;

    public iac(Context context) {
        this.f6870a = context;
    }

    /* renamed from: a */
    public final ApplicationInfo m3599a(String str, int i) {
        return this.f6870a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: b */
    public final PackageInfo m3600b(String str, int i) {
        return this.f6870a.getPackageManager().getPackageInfo(str, i);
    }
}

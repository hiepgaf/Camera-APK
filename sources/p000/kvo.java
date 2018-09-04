package p000;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.Log;

/* compiled from: PG */
/* renamed from: kvo */
public class kvo {
    /* renamed from: a */
    public static final String f8667a = kvo.class.getSimpleName();
    /* renamed from: b */
    public final PackageManager f8668b;

    public kvo(PackageManager packageManager) {
        jri.m13152b((Object) packageManager);
        this.f8668b = packageManager;
    }

    /* renamed from: a */
    public final String m5458a(String str, String str2) {
        String str3 = null;
        try {
            Resources resourcesForApplication = this.f8668b.getResourcesForApplication(str);
            str3 = resourcesForApplication.getString(resourcesForApplication.getIdentifier(str2, "string", str));
        } catch (NameNotFoundException e) {
            Log.w(f8667a, String.format("Application package name '%s' not found.", new Object[]{str}));
        } catch (NotFoundException e2) {
            Log.w(f8667a, String.format("String resource name '%s' not found in package '%s'.", new Object[]{str2, str}));
        }
        return str3;
    }
}

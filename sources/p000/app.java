package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* compiled from: PG */
/* renamed from: app */
public final class app {
    /* renamed from: a */
    private final Context f834a;

    public app(Context context) {
        this.f834a = context;
    }

    /* renamed from: a */
    public final List m547a() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        List arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f834a.getPackageManager().getApplicationInfo(this.f834a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                String valueOf = String.valueOf(applicationInfo.metaData);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                stringBuilder.append("Got app info metadata: ");
                stringBuilder.append(valueOf);
                Log.v("ManifestParser", stringBuilder.toString());
            }
            for (String str : applicationInfo.metaData.keySet()) {
                String str2;
                if ("GlideModule".equals(applicationInfo.metaData.get(str2))) {
                    arrayList.add(app.m545a(str2));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        String str3 = "ManifestParser";
                        String str4 = "Loaded Glide module: ";
                        str2 = String.valueOf(str2);
                        if (str2.length() == 0) {
                            str2 = new String(str4);
                        } else {
                            str2 = str4.concat(str2);
                        }
                        Log.d(str3, str2);
                    } else {
                        continue;
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        } catch (Throwable e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    /* renamed from: a */
    private static apn m545a(String str) {
        Object obj = null;
        try {
            Class cls = Class.forName(str);
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                app.m546a(cls, e);
            } catch (Exception e2) {
                app.m546a(cls, e2);
            } catch (Exception e22) {
                app.m546a(cls, e22);
            } catch (Exception e222) {
                app.m546a(cls, e222);
            }
            if (obj instanceof apn) {
                return (apn) obj;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 44);
            stringBuilder.append("Expected instanceof GlideModule, but found: ");
            stringBuilder.append(valueOf);
            throw new RuntimeException(stringBuilder.toString());
        } catch (Throwable e3) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e3);
        }
    }

    /* renamed from: a */
    private static void m546a(Class cls, Exception exception) {
        String valueOf = String.valueOf(cls);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
        stringBuilder.append("Unable to instantiate GlideModule implementation for ");
        stringBuilder.append(valueOf);
        throw new RuntimeException(stringBuilder.toString(), exception);
    }
}

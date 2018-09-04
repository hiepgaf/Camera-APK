package p000;

import android.annotation.TargetApi;
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageStats;
import android.graphics.PointF;
import android.media.MediaFormat;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;

@TargetApi(26)
/* compiled from: PG */
/* renamed from: jcc */
public class jcc {
    /* renamed from: a */
    public static jiv[] f7688a;

    /* renamed from: a */
    public static void m4403a(String str, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (mediaFormat.containsKey(str)) {
            mediaFormat2.setInteger(str, mediaFormat.getInteger(str));
        }
    }

    /* renamed from: a */
    public static void m4404a(String str, String str2, Throwable th, Object... objArr) {
        jcc.m4401a(3, str, th, str2, objArr);
    }

    /* renamed from: a */
    private static void m4405a(String str, String str2, Object... objArr) {
        jcc.m4400a(6, str, str2, objArr);
    }

    /* renamed from: a */
    public static String m4395a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Throwable e) {
            Log.e("SystemProperties", "Exception while getting system property: ", e);
            return str2;
        }
    }

    /* renamed from: a */
    public static PackageStats m4393a(Context context) {
        Throwable e;
        jqk.m13092a();
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        if (storageManager == null) {
            jcc.m4405a("PackageStatsO", "StorageManager is not available", new Object[0]);
            return null;
        }
        try {
            StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
            String packageName = context.getPackageName();
            PackageStats packageStats = new PackageStats(packageName);
            for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                if (storageVolume.getState().equals("mounted")) {
                    UUID a = jcc.m4397a(storageVolume);
                    if (a != null) {
                        try {
                            StorageStats queryStatsForPackage = storageStatsManager.queryStatsForPackage(a, packageName, Process.myUserHandle());
                            if (StorageManager.UUID_DEFAULT.equals(a)) {
                                packageStats.codeSize += queryStatsForPackage.getAppBytes();
                                packageStats.dataSize += queryStatsForPackage.getDataBytes() - queryStatsForPackage.getCacheBytes();
                                packageStats.cacheSize = queryStatsForPackage.getCacheBytes() + packageStats.cacheSize;
                            } else {
                                packageStats.externalCodeSize += queryStatsForPackage.getAppBytes();
                                packageStats.externalDataSize += queryStatsForPackage.getDataBytes() - queryStatsForPackage.getCacheBytes();
                                packageStats.externalCacheSize = queryStatsForPackage.getCacheBytes() + packageStats.externalCacheSize;
                            }
                        } catch (NameNotFoundException e2) {
                            e = e2;
                            jcc.m4401a(6, "PackageStatsO", e, "queryStatsForPackage() call failed", new Object[0]);
                        } catch (IOException e3) {
                            e = e3;
                            jcc.m4401a(6, "PackageStatsO", e, "queryStatsForPackage() call failed", new Object[0]);
                        } catch (RuntimeException e4) {
                            e = e4;
                            jcc.m4401a(6, "PackageStatsO", e, "queryStatsForPackage() call failed", new Object[0]);
                        } catch (Error e5) {
                            e = e5;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return packageStats;
        } catch (RuntimeException e6) {
            e = e6;
        } catch (Error e52) {
            e = e52;
        }
        jcc.m4401a(5, "PackageStatsO", e, "StorageStatsManager is not available", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static UUID m4397a(StorageVolume storageVolume) {
        String uuid = storageVolume.getUuid();
        try {
            jcc.m4400a(3, "PackageStatsO", "UUID for %s", uuid);
            return uuid != null ? UUID.fromString(uuid) : StorageManager.UUID_DEFAULT;
        } catch (IllegalArgumentException e) {
            jcc.m4405a("PackageStatsO", "Invalid UUID format: '%s'", uuid);
            return null;
        }
    }

    /* renamed from: a */
    public static void m4400a(int i, String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            Log.println(i, str, jcc.m4396a(str2, objArr));
        }
    }

    /* renamed from: a */
    private static void m4401a(int i, String str, Throwable th, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            switch (i) {
                case 2:
                    Log.v(str, jcc.m4396a(str2, objArr), th);
                    return;
                case 3:
                    Log.d(str, jcc.m4396a(str2, objArr), th);
                    return;
                case 4:
                    Log.i(str, jcc.m4396a(str2, objArr), th);
                    return;
                case 5:
                    Log.w(str, jcc.m4396a(str2, objArr), th);
                    return;
                case 6:
                    Log.e(str, jcc.m4396a(str2, objArr), th);
                    return;
                default:
                    jcc.m4400a(5, "PrimesLog", "unexpected priority: %d for log %s: %s", Integer.valueOf(i), str, jcc.m4396a(str2, objArr));
                    return;
            }
        }
    }

    /* renamed from: a */
    private static String m4396a(String str, Object... objArr) {
        return objArr.length != 0 ? String.format(Locale.US, str, objArr) : str;
    }

    /* renamed from: a */
    public static PointF m4394a(DataInputStream dataInputStream) {
        return new PointF(dataInputStream.readFloat(), dataInputStream.readFloat());
    }

    /* renamed from: a */
    public static jcf m4398a(jcf jcf, izu izu) {
        try {
            return jcf.mo3166a(izu);
        } catch (Throwable e) {
            throw new AssertionError("Resizable layout returns wrong type!", e);
        }
    }

    /* renamed from: a */
    public static jhs m4399a(ize ize) {
        return new jhq(ize);
    }

    /* renamed from: a */
    public static void m4402a(PointF pointF, DataOutputStream dataOutputStream) {
        dataOutputStream.writeFloat(pointF.x);
        dataOutputStream.writeFloat(pointF.y);
    }
}

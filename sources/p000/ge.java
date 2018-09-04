package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;

/* compiled from: PG */
/* renamed from: ge */
public class ge {
    public static final String TAG = "ContextCompat";
    public static final Object sLock = new Object();
    public static TypedValue sTempValue;

    private static File buildPath(File file, String... strArr) {
        int length = strArr.length;
        int i = 0;
        File file2 = file;
        while (i < length) {
            File file3;
            String str = strArr[i];
            if (file2 == null) {
                file3 = new File(str);
            } else if (str != null) {
                file3 = new File(file2, str);
            } else {
                file3 = file2;
            }
            i++;
            file2 = file3;
        }
        return file2;
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    private static synchronized File createFilesDir(File file) {
        synchronized (ge.class) {
            if (!(file.exists() || file.mkdirs() || file.exists())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to create files subdir ");
                stringBuilder.append(file.getPath());
                Log.w(TAG, stringBuilder.toString());
                file = null;
            }
        }
        return file;
    }

    public static File getCodeCacheDir(Context context) {
        return context.getCodeCacheDir();
    }

    public static int getColor(Context context, int i) {
        return context.getColor(i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return context.getColorStateList(i);
    }

    public static File getDataDir(Context context) {
        return context.getDataDir();
    }

    public static Drawable getDrawable(Context context, int i) {
        return context.getDrawable(i);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static File getNoBackupFilesDir(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static Object getSystemService(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    public static String getSystemServiceName(Context context, Class cls) {
        return context.getSystemServiceName(cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return ge.startActivities(context, intentArr, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}

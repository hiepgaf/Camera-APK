package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* compiled from: PG */
public final class NavUtils {
    public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    public static final String TAG = "NavUtils";

    private NavUtils() {
    }

    public static Intent getParentActivityIntent(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String parentActivityName = getParentActivityName(activity);
        if (parentActivityName == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, parentActivityName);
        try {
            if (getParentActivityName(activity, componentName) != null) {
                return new Intent().setComponent(componentName);
            }
            return Intent.makeMainActivity(componentName);
        } catch (NameNotFoundException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getParentActivityIntent: bad parentActivityName '");
            stringBuilder.append(parentActivityName);
            stringBuilder.append("' in manifest");
            Log.e(TAG, stringBuilder.toString());
            return null;
        }
    }

    public static Intent getParentActivityIntent(Context context, ComponentName componentName) {
        String parentActivityName = getParentActivityName(context, componentName);
        if (parentActivityName == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), parentActivityName);
        if (getParentActivityName(context, componentName2) != null) {
            return new Intent().setComponent(componentName2);
        }
        return Intent.makeMainActivity(componentName2);
    }

    public static Intent getParentActivityIntent(Context context, Class cls) {
        String parentActivityName = getParentActivityName(context, new ComponentName(context, cls));
        if (parentActivityName == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, parentActivityName);
        if (getParentActivityName(context, componentName) != null) {
            return new Intent().setComponent(componentName);
        }
        return Intent.makeMainActivity(componentName);
    }

    public static String getParentActivityName(Activity activity) {
        try {
            return getParentActivityName(activity, activity.getComponentName());
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String getParentActivityName(Context context, ComponentName componentName) {
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        str = activityInfo.metaData.getString(PARENT_ACTIVITY);
        if (str == null) {
            return null;
        }
        if (str.charAt(0) != '.') {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public static void navigateUpFromSameTask(Activity activity) {
        Intent parentActivityIntent = getParentActivityIntent(activity);
        if (parentActivityIntent == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Activity ");
            stringBuilder.append(activity.getClass().getSimpleName());
            stringBuilder.append(" does not have a parent activity name specified.");
            stringBuilder.append(" (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ");
            stringBuilder.append(" element in your manifest?)");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        navigateUpTo(activity, parentActivityIntent);
    }

    public static void navigateUpTo(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static boolean shouldUpRecreateTask(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}

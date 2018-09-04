package android.support.v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.DragEvent;
import android.view.View;
import java.util.List;
import java.util.Map;
import p000.gb;
import p000.ge;

/* compiled from: PG */
public class ActivityCompat extends ge {
    public static PermissionCompatDelegate sDelegate;

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.ActivityCompat$1 */
    final class C00001 implements Runnable {
        public final /* synthetic */ Activity val$activity;
        public final /* synthetic */ String[] val$permissions;
        public final /* synthetic */ int val$requestCode;

        C00001(String[] strArr, Activity activity, int i) {
            this.val$permissions = strArr;
            this.val$activity = activity;
            this.val$requestCode = i;
        }

        public final void run() {
            int[] iArr = new int[this.val$permissions.length];
            PackageManager packageManager = this.val$activity.getPackageManager();
            String packageName = this.val$activity.getPackageName();
            int length = this.val$permissions.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.val$permissions[i], packageName);
            }
            ((OnRequestPermissionsResultCallback) this.val$activity).onRequestPermissionsResult(this.val$requestCode, this.val$permissions, iArr);
        }
    }

    /* compiled from: PG */
    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* compiled from: PG */
    public interface PermissionCompatDelegate {
        boolean onActivityResult(Activity activity, int i, int i2, Intent intent);

        boolean requestPermissions(Activity activity, String[] strArr, int i);
    }

    /* compiled from: PG */
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* compiled from: PG */
    class SharedElementCallback21Impl extends SharedElementCallback {
        public SharedElementCallback mCallback;

        SharedElementCallback21Impl(SharedElementCallback sharedElementCallback) {
            this.mCallback = sharedElementCallback;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.mCallback.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.mCallback.onCreateSnapshotView(context, parcelable);
        }

        public void onMapSharedElements(List list, Map map) {
            this.mCallback.onMapSharedElements(list, map);
        }

        public void onRejectSharedElements(List list) {
            this.mCallback.onRejectSharedElements(list);
        }

        public void onSharedElementEnd(List list, List list2, List list3) {
            this.mCallback.onSharedElementEnd(list, list2, list3);
        }

        public void onSharedElementStart(List list, List list2, List list3) {
            this.mCallback.onSharedElementStart(list, list2, list3);
        }
    }

    /* compiled from: PG */
    class SharedElementCallback23Impl extends SharedElementCallback21Impl {
        SharedElementCallback23Impl(SharedElementCallback sharedElementCallback) {
            super(sharedElementCallback);
        }

        public void onSharedElementsArrived(List list, List list2, final OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.mCallback.onSharedElementsArrived(list, list2, new SharedElementCallback.OnSharedElementsReadyListener() {
                public void onSharedElementsReady() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            });
        }
    }

    protected ActivityCompat() {
    }

    public static void finishAffinity(Activity activity) {
        activity.finishAffinity();
    }

    public static void finishAfterTransition(Activity activity) {
        activity.finishAfterTransition();
    }

    public static PermissionCompatDelegate getPermissionCompatDelegate() {
        return sDelegate;
    }

    public static Uri getReferrer(Activity activity) {
        return activity.getReferrer();
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void postponeEnterTransition(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static gb requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
        return activity.requestDragAndDropPermissions(dragEvent) != null ? new gb() : null;
    }

    public static void requestPermissions(Activity activity, String[] strArr, int i) {
        if (sDelegate == null || !sDelegate.requestPermissions(activity, strArr, i)) {
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(strArr, i);
        }
    }

    public static View requireViewById(Activity activity, int i) {
        View findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
        SharedElementCallback sharedElementCallback23Impl;
        if (sharedElementCallback != null) {
            sharedElementCallback23Impl = new SharedElementCallback23Impl(sharedElementCallback);
        } else {
            sharedElementCallback23Impl = null;
        }
        activity.setEnterSharedElementCallback(sharedElementCallback23Impl);
    }

    public static void setExitSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
        SharedElementCallback sharedElementCallback23Impl;
        if (sharedElementCallback != null) {
            sharedElementCallback23Impl = new SharedElementCallback23Impl(sharedElementCallback);
        } else {
            sharedElementCallback23Impl = null;
        }
        activity.setExitSharedElementCallback(sharedElementCallback23Impl);
    }

    public static void setPermissionCompatDelegate(PermissionCompatDelegate permissionCompatDelegate) {
        sDelegate = permissionCompatDelegate;
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void startIntentSenderForResult(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void startPostponedEnterTransition(Activity activity) {
        activity.startPostponedEnterTransition();
    }
}

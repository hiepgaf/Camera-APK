package android.support.v4.app;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
public final class BundleCompat {

    /* compiled from: PG */
    class BundleCompatBaseImpl {
        public static final String TAG = "BundleCompatBaseImpl";
        public static Method sGetIBinderMethod;
        public static boolean sGetIBinderMethodFetched;
        public static Method sPutIBinderMethod;
        public static boolean sPutIBinderMethodFetched;

        private BundleCompatBaseImpl() {
        }

        public static IBinder getBinder(Bundle bundle, String str) {
            if (!sGetIBinderMethodFetched) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    sGetIBinderMethod = method;
                    method.setAccessible(true);
                } catch (Throwable e) {
                    Throwable e2;
                    Log.i(TAG, "Failed to retrieve getIBinder method", e2);
                }
                sGetIBinderMethodFetched = true;
            }
            if (sGetIBinderMethod != null) {
                try {
                    return (IBinder) sGetIBinderMethod.invoke(bundle, new Object[]{str});
                } catch (InvocationTargetException e3) {
                    e2 = e3;
                } catch (IllegalAccessException e4) {
                    e2 = e4;
                } catch (IllegalArgumentException e5) {
                    e2 = e5;
                }
            }
            return null;
            Log.i(TAG, "Failed to invoke getIBinder via reflection", e2);
            sGetIBinderMethod = null;
            return null;
        }

        public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
            Throwable e;
            if (!sPutIBinderMethodFetched) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    sPutIBinderMethod = method;
                    method.setAccessible(true);
                } catch (Throwable e2) {
                    Log.i(TAG, "Failed to retrieve putIBinder method", e2);
                }
                sPutIBinderMethodFetched = true;
            }
            if (sPutIBinderMethod != null) {
                try {
                    sPutIBinderMethod.invoke(bundle, new Object[]{str, iBinder});
                    return;
                } catch (InvocationTargetException e3) {
                    e2 = e3;
                } catch (IllegalAccessException e4) {
                    e2 = e4;
                } catch (IllegalArgumentException e5) {
                    e2 = e5;
                }
            } else {
                return;
            }
            Log.i(TAG, "Failed to invoke putIBinder via reflection", e2);
            sPutIBinderMethod = null;
        }
    }

    private BundleCompat() {
    }

    public static IBinder getBinder(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}

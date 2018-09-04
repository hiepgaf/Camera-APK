package p000;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: fs */
class fs extends fr {
    /* renamed from: a */
    private static Method f21408a;
    /* renamed from: b */
    private static boolean f21409b;
    /* renamed from: c */
    private static Method f21410c;
    /* renamed from: d */
    private static boolean f21411d;

    fs() {
    }

    /* renamed from: a */
    public final void mo3047a(View view, Matrix matrix) {
        if (!f21409b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f21408a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f21409b = true;
        }
        if (f21408a != null) {
            try {
                f21408a.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    /* renamed from: b */
    public final void mo3048b(View view, Matrix matrix) {
        if (!f21411d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f21410c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f21411d = true;
        }
        if (f21410c != null) {
            try {
                f21410c.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}

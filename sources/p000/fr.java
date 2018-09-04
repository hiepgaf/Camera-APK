package p000;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: fr */
class fr extends fu {
    /* renamed from: a */
    private static Method f16415a;
    /* renamed from: b */
    private static boolean f16416b;
    /* renamed from: c */
    private static Method f16417c;
    /* renamed from: d */
    private static boolean f16418d;

    fr() {
    }

    /* renamed from: a */
    public final float mo1419a(View view) {
        if (!f16418d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f16417c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f16418d = true;
        }
        if (f16417c != null) {
            try {
                return ((Float) f16417c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return super.mo1419a(view);
    }

    /* renamed from: a */
    public final void mo1420a(View view, float f) {
        if (!f16416b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f16415a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f16416b = true;
        }
        if (f16415a != null) {
            try {
                f16415a.invoke(view, new Object[]{Float.valueOf(f)});
                return;
            } catch (IllegalAccessException e2) {
                return;
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        view.setAlpha(f);
    }
}

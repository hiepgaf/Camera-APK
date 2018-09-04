package p000;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: gz */
public final class gz extends gy {
    /* renamed from: a */
    protected final Typeface mo3451a(Object obj) {
        Throwable e;
        try {
            Array.set(Array.newInstance(this.a, 1), 0, obj);
            Method method = this.b;
            r2 = new Object[4];
            Integer valueOf = Integer.valueOf(-1);
            r2[2] = valueOf;
            r2[3] = valueOf;
            return (Typeface) method.invoke(null, r2);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    protected final Method mo3452a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

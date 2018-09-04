package p000;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: hxj */
public final class hxj extends hxh {
    /* renamed from: a */
    private final Object f21628a;

    public hxj(Object obj) {
        this.f21628a = obj;
    }

    /* renamed from: a */
    public static Object m15950a(hxg hxg) {
        int i = 0;
        if (hxg instanceof hxj) {
            return ((hxj) hxg).f21628a;
        }
        IBinder asBinder = hxg.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        Field field = null;
        int i2 = 0;
        while (i2 < length) {
            Field field2 = declaredFields[i2];
            if (field2.isSynthetic()) {
                field2 = field;
            } else {
                i++;
            }
            i2++;
            field = field2;
        }
        if (i != 1) {
            int length2 = declaredFields.length;
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("Unexpected number of IObjectWrapper declared fields: ");
            stringBuilder.append(length2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        } else {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        }
    }
}

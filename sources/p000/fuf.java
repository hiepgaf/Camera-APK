package p000;

import android.hardware.camera2.CaptureResult.Key;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: fuf */
final class fuf {
    /* renamed from: a */
    private static Key m2394a(String str, Class cls) {
        Throwable e;
        try {
            Constructor[] constructors = Class.forName("android.hardware.camera2.CaptureResult$Key").getConstructors();
            int length = constructors.length;
            Object obj = null;
            int i = 0;
            while (i < length) {
                Constructor constructor = constructors[i];
                if (constructor.getParameterTypes().length != 2) {
                    constructor = obj;
                } else if (!"java.lang.String".equals(constructor.getParameterTypes()[0].getCanonicalName())) {
                    constructor = obj;
                } else if (!"java.lang.Class".equals(constructor.getParameterTypes()[1].getCanonicalName())) {
                    constructor = obj;
                }
                i++;
                Constructor constructor2 = constructor;
            }
            jri.m13139a(obj, (Object) "Constructor not found for CaptureResult.Key.<init>(java.lang.String)");
            return (Key) obj.newInstance(new Object[]{str, cls});
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new IllegalStateException(e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new IllegalStateException(e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m2395a(iwp iwp) {
        try {
            Object a = iwp.mo3143a(fuf.m2394a("org.codeaurora.qcamera3.tuning_meta_data.tuning_meta_data_blob", int[].class));
            if (a == null) {
                return null;
            }
            int[] iArr = (int[]) a;
            ByteBuffer allocate = ByteBuffer.allocate(iArr.length << 2);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.asIntBuffer().put(iArr);
            return allocate.array();
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}

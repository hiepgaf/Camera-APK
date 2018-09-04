package p000;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: iwc */
public final class iwc {
    /* renamed from: a */
    private final Method f7515a;
    /* renamed from: b */
    private final Method f7516b;
    /* renamed from: c */
    private final Method f7517c;

    iwc() {
        Method method;
        Method method2;
        Throwable th;
        Method method3 = null;
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", new Class[]{String.class, String.class});
            try {
                method2 = cls.getMethod("set", new Class[]{String.class, String.class});
            } catch (Throwable e) {
                th = e;
                method2 = method3;
                try {
                    throw new IllegalStateException("Unable to reflect SystemProperties.", th);
                } catch (Throwable th2) {
                    th = th2;
                    this.f7515a = method;
                    this.f7516b = method2;
                    this.f7517c = method3;
                    throw th;
                }
            } catch (Throwable e2) {
                th = e2;
                method2 = method3;
                this.f7515a = method;
                this.f7516b = method2;
                this.f7517c = method3;
                throw th;
            }
            try {
                method3 = cls.getMethod("getInt", new Class[]{String.class, Integer.TYPE});
                try {
                    cls.getMethod("getLong", new Class[]{String.class, Long.TYPE});
                    this.f7515a = method;
                    this.f7516b = method2;
                    this.f7517c = method3;
                } catch (Exception e3) {
                    th = e3;
                    throw new IllegalStateException("Unable to reflect SystemProperties.", th);
                } catch (Throwable th3) {
                    th = th3;
                    this.f7515a = method;
                    this.f7516b = method2;
                    this.f7517c = method3;
                    throw th;
                }
            } catch (Exception e4) {
                th = e4;
                throw new IllegalStateException("Unable to reflect SystemProperties.", th);
            } catch (Throwable th4) {
                th = th4;
                this.f7515a = method;
                this.f7516b = method2;
                this.f7517c = method3;
                throw th;
            }
        } catch (Throwable e22) {
            method = method3;
            th = e22;
            method2 = method3;
            throw new IllegalStateException("Unable to reflect SystemProperties.", th);
        } catch (Throwable e222) {
            method = method3;
            th = e222;
            method2 = method3;
            this.f7515a = method;
            this.f7516b = method2;
            this.f7517c = method3;
            throw th;
        }
    }

    /* renamed from: a */
    public final int m4273a(String str, int i) {
        jri.m13139a((Object) str, (Object) "Key cannot be null!");
        try {
            Method method = this.f7517c;
            if (method != null) {
                Integer num = (Integer) method.invoke(null, new Object[]{str, Integer.valueOf(i)});
                if (num != null) {
                    i = num.intValue();
                }
            }
        } catch (Throwable e) {
            Log.e("CAM_SystemProperties", "get error", e);
        }
        return i;
    }

    /* renamed from: a */
    public final String m4274a(String str) {
        jri.m13139a((Object) str, (Object) "Key cannot be null!");
        try {
            String str2;
            Method method = this.f7515a;
            if (method != null) {
                str2 = (String) method.invoke(null, new Object[]{str, null});
                if ("".equals(str2)) {
                    return null;
                }
            }
            str2 = null;
            return str2;
        } catch (Throwable e) {
            Log.e("CAM_SystemProperties", "get error", e);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m4275a(String str, String str2) {
        jri.m13139a((Object) str, (Object) "Key cannot be null!");
        try {
            Method method = this.f7516b;
            if (method != null) {
                method.invoke(null, new Object[]{str, str2});
                return true;
            }
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(str2).length());
            stringBuilder.append("Could not set SystemProperty key: ");
            stringBuilder.append(str);
            stringBuilder.append(" to value: ");
            stringBuilder.append(str2);
            Log.e("CAM_SystemProperties", stringBuilder.toString(), e);
        }
        return false;
    }
}

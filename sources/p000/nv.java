package p000;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: nv */
final class nv implements OnMenuItemClickListener {
    /* renamed from: a */
    private static final Class[] f8949a = new Class[]{MenuItem.class};
    /* renamed from: b */
    private Object f8950b;
    /* renamed from: c */
    private Method f8951c;

    public nv(Object obj, String str) {
        this.f8950b = obj;
        Class cls = obj.getClass();
        try {
            this.f8951c = cls.getMethod(str, f8949a);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't resolve menu item onClick handler ");
            stringBuilder.append(str);
            stringBuilder.append(" in class ");
            stringBuilder.append(cls.getName());
            InflateException inflateException = new InflateException(stringBuilder.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f8951c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f8951c.invoke(this.f8950b, new Object[]{menuItem})).booleanValue();
            }
            this.f8951c.invoke(this.f8950b, new Object[]{menuItem});
            return true;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}

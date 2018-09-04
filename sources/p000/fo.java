package p000;

import android.graphics.Rect;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: PG */
/* renamed from: fo */
final class fo {
    /* renamed from: a */
    public static final fu f4639a = new ft();
    /* renamed from: b */
    public static final Property f4640b = new fp(Float.class, "translationAlpha");
    /* renamed from: c */
    private static Field f4641c;
    /* renamed from: d */
    private static boolean f4642d;

    static {
        fq fqVar = new fq(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    static void m2351a() {
    }

    /* renamed from: a */
    static ga m2350a(View view) {
        return new fz(view);
    }

    /* renamed from: b */
    static void m2355b() {
    }

    /* renamed from: a */
    static void m2354a(View view, int i, int i2, int i3, int i4) {
        f4639a.mo3445a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    static void m2352a(View view, float f) {
        f4639a.mo1420a(view, f);
    }

    /* renamed from: a */
    static void m2353a(View view, int i) {
        if (!f4642d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4641c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f4642d = true;
        }
        if (f4641c != null) {
            try {
                f4641c.setInt(view, (f4641c.getInt(view) & -13) | i);
            } catch (IllegalAccessException e2) {
            }
        }
    }
}

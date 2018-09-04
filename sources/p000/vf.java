package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* compiled from: PG */
/* renamed from: vf */
final class vf {
    /* renamed from: a */
    public static final int[] f9407a = new int[]{-16842910};
    /* renamed from: b */
    public static final int[] f9408b = new int[]{16842908};
    /* renamed from: c */
    public static final int[] f9409c = new int[]{16842919};
    /* renamed from: d */
    public static final int[] f9410d = new int[]{16842912};
    /* renamed from: e */
    public static final int[] f9411e = new int[0];
    /* renamed from: f */
    private static final ThreadLocal f9412f = new ThreadLocal();
    /* renamed from: g */
    private static final int[] f9413g = new int[1];

    /* renamed from: a */
    public static int m6039a(Context context, int i) {
        ColorStateList c = vf.m6041c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f9407a, c.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f9412f.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f9412f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int b = vf.m6040b(context, i);
        return gu.m2831b(b, Math.round(f * ((float) Color.alpha(b))));
    }

    /* renamed from: b */
    public static int m6040b(Context context, int i) {
        f9413g[0] = i;
        vk a = vk.m6046a(context, null, f9413g);
        try {
            int a2 = a.m6048a(0, 0);
            return a2;
        } finally {
            a.f9419b.recycle();
        }
    }

    /* renamed from: c */
    public static ColorStateList m6041c(Context context, int i) {
        f9413g[0] = i;
        vk a = vk.m6046a(context, null, f9413g);
        try {
            ColorStateList a2 = a.m6049a(0);
            return a2;
        } finally {
            a.f9419b.recycle();
        }
    }
}

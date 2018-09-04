package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cr */
public final class cr {
    /* renamed from: a */
    private static final int[] f2577a = new int[]{R.attr.colorPrimary};
    /* renamed from: b */
    private static final int[] f2578b = new int[]{R.attr.colorSecondaryLight};

    /* renamed from: a */
    private static void m1414a(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!hasValue) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 77);
            stringBuilder.append("The style on this component requires your app theme to be ");
            stringBuilder.append(str);
            stringBuilder.append(" (or a descendant).");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static TypedArray m1413a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cn.f2192e, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            cr.m1414a(context, f2578b, "Theme.MaterialComponents");
        }
        cr.m1414a(context, f2577a, "Theme.AppCompat");
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}

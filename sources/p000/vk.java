package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: PG */
/* renamed from: vk */
public final class vk {
    /* renamed from: a */
    public final Context f9418a;
    /* renamed from: b */
    public final TypedArray f9419b;
    /* renamed from: c */
    public TypedValue f9420c;

    private vk(Context context, TypedArray typedArray) {
        this.f9418a = context;
        this.f9419b = typedArray;
    }

    /* renamed from: a */
    public final boolean m6050a(int i, boolean z) {
        return this.f9419b.getBoolean(i, z);
    }

    /* renamed from: a */
    public final int m6048a(int i, int i2) {
        return this.f9419b.getColor(i, i2);
    }

    /* renamed from: a */
    public final ColorStateList m6049a(int i) {
        if (this.f9419b.hasValue(i)) {
            int resourceId = this.f9419b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = nj.m5619a(this.f9418a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f9419b.getColorStateList(i);
    }

    /* renamed from: b */
    public final int m6051b(int i, int i2) {
        return this.f9419b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: c */
    public final int m6053c(int i, int i2) {
        return this.f9419b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: b */
    public final Drawable m6052b(int i) {
        if (this.f9419b.hasValue(i)) {
            int resourceId = this.f9419b.getResourceId(i, 0);
            if (resourceId != 0) {
                return nj.m5620b(this.f9418a, resourceId);
            }
        }
        return this.f9419b.getDrawable(i);
    }

    /* renamed from: c */
    public final Drawable m6054c(int i) {
        if (this.f9419b.hasValue(i)) {
            int resourceId = this.f9419b.getResourceId(i, 0);
            if (resourceId != 0) {
                return qq.m5725a().m5732a(this.f9418a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final int m6055d(int i, int i2) {
        return this.f9419b.getInt(i, i2);
    }

    /* renamed from: e */
    public final int m6057e(int i, int i2) {
        return this.f9419b.getInteger(i, i2);
    }

    /* renamed from: f */
    public final int m6059f(int i, int i2) {
        return this.f9419b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public final int m6061g(int i, int i2) {
        return this.f9419b.getResourceId(i, i2);
    }

    /* renamed from: d */
    public final String m6056d(int i) {
        return this.f9419b.getString(i);
    }

    /* renamed from: e */
    public final CharSequence m6058e(int i) {
        return this.f9419b.getText(i);
    }

    /* renamed from: f */
    public final boolean m6060f(int i) {
        return this.f9419b.hasValue(i);
    }

    /* renamed from: a */
    public static vk m6045a(Context context, int i, int[] iArr) {
        return new vk(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static vk m6046a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new vk(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static vk m6047a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new vk(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}

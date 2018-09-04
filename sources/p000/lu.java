package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
/* renamed from: lu */
public class lu extends MarginLayoutParams {
    /* renamed from: a */
    public int f8808a;

    public lu() {
        super(-2, -2);
        this.f8808a = 0;
        this.f8808a = 8388627;
    }

    public lu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8808a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ni.f8900b);
        this.f8808a = obtainStyledAttributes.getInt(ni.f8901c, 0);
        obtainStyledAttributes.recycle();
    }

    public lu(lu luVar) {
        super(luVar);
        this.f8808a = 0;
        this.f8808a = luVar.f8808a;
    }

    public lu(LayoutParams layoutParams) {
        super(layoutParams);
        this.f8808a = 0;
    }
}

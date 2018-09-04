package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
/* renamed from: sz */
public class sz extends MarginLayoutParams {
    /* renamed from: g */
    public float f9252g;
    /* renamed from: h */
    public int f9253h;

    public sz(int i) {
        super(i, -2);
        this.f9253h = -1;
        this.f9252g = 0.0f;
    }

    public sz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9253h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ni.aJ);
        this.f9252g = obtainStyledAttributes.getFloat(ni.aL, 0.0f);
        this.f9253h = obtainStyledAttributes.getInt(ni.aK, -1);
        obtainStyledAttributes.recycle();
    }

    public sz(LayoutParams layoutParams) {
        super(layoutParams);
        this.f9253h = -1;
    }
}

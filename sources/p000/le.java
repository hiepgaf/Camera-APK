package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
/* renamed from: le */
public final class le extends MarginLayoutParams {
    /* renamed from: a */
    public int f8774a = 0;
    /* renamed from: b */
    public float f8775b;
    /* renamed from: c */
    public boolean f8776c;
    /* renamed from: d */
    public int f8777d;

    public le() {
        super(-1, -1);
    }

    public le(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kz.f8743a);
        this.f8774a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public le(le leVar) {
        super(leVar);
        this.f8774a = leVar.f8774a;
    }

    public le(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public le(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}

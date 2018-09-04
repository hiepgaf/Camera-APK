package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

/* compiled from: PG */
/* renamed from: jv */
public final class jv extends LayoutParams {
    /* renamed from: a */
    public boolean f7994a;
    /* renamed from: b */
    public int f7995b;
    /* renamed from: c */
    public float f7996c = 0.0f;
    /* renamed from: d */
    public boolean f7997d;
    /* renamed from: e */
    public int f7998e;
    /* renamed from: f */
    public int f7999f;

    public jv() {
        super(-1, -1);
    }

    public jv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f557a);
        this.f7995b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}

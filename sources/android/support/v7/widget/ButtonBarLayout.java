package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.GoogleCamera.R;
import p000.jm;
import p000.kvl;
import p000.ni;

/* compiled from: PG */
public class ButtonBarLayout extends LinearLayout {
    /* renamed from: a */
    private boolean f640a;
    /* renamed from: b */
    private int f641b = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ni.aw);
        this.f640a = obtainStyledAttributes.getBoolean(ni.ax, true);
        obtainStyledAttributes.recycle();
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    /* renamed from: a */
    private final int m411a(int i) {
        int childCount = getChildCount();
        for (int i2 = i; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private final boolean m413a() {
        return getOrientation() == 1;
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3 = 0;
        int size = MeasureSpec.getSize(i);
        if (this.f640a) {
            if (size > this.f641b && m413a()) {
                m412a(false);
            }
            this.f641b = size;
        }
        if (m413a()) {
            size = i;
            z = false;
        } else if (MeasureSpec.getMode(i) == 1073741824) {
            size = MeasureSpec.makeMeasureSpec(size, kvl.UNSET_ENUM_VALUE);
            z = true;
        } else {
            size = i;
            z = false;
        }
        super.onMeasure(size, i2);
        if (this.f640a && !m413a() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            m412a(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m411a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            i3 = ((childAt.getMeasuredHeight() + getPaddingTop()) + layoutParams.topMargin) + layoutParams.bottomMargin;
            if (m413a()) {
                size = m411a(a + 1);
                if (size >= 0) {
                    i3 += getChildAt(size).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i3 += getPaddingBottom();
            }
        }
        if (jm.m4577k(this) != i3) {
            setMinimumHeight(i3);
        }
    }

    /* renamed from: a */
    private final void m412a(boolean z) {
        int i;
        setOrientation(z);
        if (z) {
            i = 5;
        } else {
            i = 80;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            findViewById.setVisibility(i);
        }
        for (i = getChildCount() - 2; i >= 0; i--) {
            bringChildToFront(getChildAt(i));
        }
    }
}

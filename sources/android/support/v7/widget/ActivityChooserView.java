package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p000.vk;

/* compiled from: PG */
public final class ActivityChooserView extends ViewGroup {

    /* compiled from: PG */
    public class InnerLayout extends LinearLayout {
        /* renamed from: a */
        private static final int[] f639a = new int[]{16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            vk a = vk.m6046a(context, attributeSet, f639a);
            setBackgroundDrawable(a.m6052b(0));
            a.f9419b.recycle();
        }
    }

    protected final void onAttachedToWindow() {
        throw new NoSuchMethodError();
    }

    protected final void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    protected final void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }
}

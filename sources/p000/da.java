package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

@Deprecated
/* compiled from: PG */
/* renamed from: da */
public class da extends FrameLayout {
    public da(Context context) {
        this(context, null);
    }

    public da(Context context, byte b) {
        this(context);
    }

    public da(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, db.f2919a);
        if (obtainStyledAttributes.hasValue(db.f2921c)) {
            jm.m4549a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(db.f2921c, 0));
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
    }

    public da(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        jm.m4543B(this);
    }
}

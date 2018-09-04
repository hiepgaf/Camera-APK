package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: rc */
public final class rc extends RatingBar {
    /* renamed from: a */
    private final ra f9100a;

    public rc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private rc(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        this.f9100a = new ra(this);
        this.f9100a.mo2451a(attributeSet, (int) R.attr.ratingBarStyle);
    }

    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f9100a.f9096a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}

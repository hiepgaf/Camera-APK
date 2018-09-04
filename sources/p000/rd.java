package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: rd */
public final class rd extends SeekBar {
    /* renamed from: a */
    private final re f9101a;

    public rd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private rd(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.seekBarStyle);
        this.f9101a = new re(this);
        this.f9101a.mo2451a(attributeSet, R.attr.seekBarStyle);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        re reVar = this.f9101a;
        Drawable drawable = reVar.f19556c;
        if (drawable != null && drawable.isStateful() && drawable.setState(reVar.f19555b.getDrawableState())) {
            reVar.f19555b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9101a.f19556c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    protected final synchronized void onDraw(Canvas canvas) {
        int i = 1;
        synchronized (this) {
            super.onDraw(canvas);
            re reVar = this.f9101a;
            if (reVar.f19556c != null) {
                int max = reVar.f19555b.getMax();
                if (max > 1) {
                    int intrinsicWidth = reVar.f19556c.getIntrinsicWidth();
                    int intrinsicHeight = reVar.f19556c.getIntrinsicHeight();
                    if (intrinsicWidth >= 0) {
                        intrinsicWidth /= 2;
                    } else {
                        intrinsicWidth = 1;
                    }
                    if (intrinsicHeight >= 0) {
                        i = intrinsicHeight / 2;
                    }
                    reVar.f19556c.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                    float width = ((float) ((reVar.f19555b.getWidth() - reVar.f19555b.getPaddingLeft()) - reVar.f19555b.getPaddingRight())) / ((float) max);
                    intrinsicHeight = canvas.save();
                    canvas.translate((float) reVar.f19555b.getPaddingLeft(), (float) (reVar.f19555b.getHeight() / 2));
                    for (i = 0; i <= max; i++) {
                        reVar.f19556c.draw(canvas);
                        canvas.translate(width, 0.0f);
                    }
                    canvas.restoreToCount(intrinsicHeight);
                }
            }
        }
    }
}

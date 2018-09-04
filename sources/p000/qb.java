package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qb */
final class qb extends qx implements qf {
    /* renamed from: a */
    public final /* synthetic */ py f19545a;

    public qb(py pyVar, Context context) {
        this.f19545a = pyVar;
        super(context, null, R.attr.actionOverflowButtonStyle);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new qc(this, this));
    }

    /* renamed from: d */
    public final boolean mo283d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo284e() {
        return false;
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.f19545a.m16770f();
        }
        return true;
    }

    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            width = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            height = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            ha.m2969a(background, width - max, height - max, width + max, height + max);
        }
        return frame;
    }
}

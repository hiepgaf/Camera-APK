package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.viewer.RGBZFocusControls;

/* compiled from: PG */
/* renamed from: hso */
public final class hso extends TextView implements gzk, hst {
    /* renamed from: a */
    private final int f18105a = getResources().getDimensionPixelSize(R.dimen.refocus_cling_bottom_triangle_height);
    /* renamed from: b */
    private final int f18106b = getResources().getDimensionPixelSize(R.dimen.refocus_cling_bottom_triangle_width);
    /* renamed from: c */
    private final Drawable f18107c = getResources().getDrawable(R.drawable.settings_cling, null);
    /* renamed from: d */
    private final Path f18108d = new Path();
    /* renamed from: e */
    private final Paint f18109e = new Paint();
    /* renamed from: f */
    private final int f18110f = getResources().getDimensionPixelSize(R.dimen.refocus_cling_text_padding);
    /* renamed from: g */
    private int f18111g = 0;
    /* renamed from: h */
    private boolean f18112h = true;
    /* renamed from: i */
    private final /* synthetic */ RGBZFocusControls f18113i;

    public hso(RGBZFocusControls rGBZFocusControls, Context context) {
        this.f18113i = rGBZFocusControls;
        super(context);
        setText(R.string.refocus_slider_cling_text);
        int i = this.f18110f;
        setPadding(i, i, i, this.f18105a + i);
        setTextAppearance(R.style.refocus_bokeh_control_bar_cling_text);
        this.f18109e.setColor(getResources().getColor(R.color.refocus_control_bar_cling_color, null));
        this.f18109e.setStyle(Style.FILL);
    }

    public final void onDraw(Canvas canvas) {
        if (!this.f18112h) {
            this.f18107c.draw(canvas);
            super.onDraw(canvas);
            canvas.drawPath(this.f18108d, this.f18109e);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        this.f18107c.setBounds(0, 0, i3 - i, i5 - this.f18105a);
        this.f18111g = i5;
    }

    /* renamed from: a */
    public final void mo1776a(int i) {
        RGBZFocusControls rGBZFocusControls = this.f18113i;
        if (rGBZFocusControls.f12361h) {
            setVisibility(8);
            invalidate();
            return;
        }
        this.f18112h = false;
        int i2 = rGBZFocusControls.f12356c / 2;
        setTranslationX((float) (hjg.m3200a(i, i2, rGBZFocusControls.f12357d - i2) - (this.f18113i.f12356c / 2)));
        int translationX = (int) (((float) i) - getTranslationX());
        this.f18108d.reset();
        float f = (float) translationX;
        this.f18108d.moveTo(f, (float) this.f18111g);
        this.f18108d.lineTo((float) (translationX - (this.f18106b / 2)), (float) (this.f18111g - this.f18105a));
        this.f18108d.lineTo((float) (translationX + (this.f18106b / 2)), (float) (this.f18111g - this.f18105a));
        this.f18108d.lineTo(f, (float) this.f18111g);
        invalidate();
        this.f18113i.f12361h = true;
    }
}

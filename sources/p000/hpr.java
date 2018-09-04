package p000;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hpr */
public final class hpr {
    /* renamed from: a */
    public final float f6430a;
    /* renamed from: b */
    public final float f6431b;
    /* renamed from: c */
    public final float f6432c;
    /* renamed from: d */
    public final float f6433d;
    /* renamed from: e */
    public final float f6434e;
    /* renamed from: f */
    public final float f6435f;
    /* renamed from: g */
    public final Paint f6436g;
    /* renamed from: h */
    public final Paint f6437h;
    /* renamed from: i */
    public float f6438i;
    /* renamed from: j */
    public float f6439j = 1.0f;

    public hpr(Resources resources) {
        this.f6430a = (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_width);
        this.f6431b = (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_height);
        this.f6432c = (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_triangle_height);
        this.f6433d = (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_border_radius);
        this.f6434e = (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_text_size);
        this.f6435f = (float) (((resources.getDimensionPixelSize(R.dimen.zoom_button_size) + resources.getDimensionPixelSize(R.dimen.seekbar_padding)) + resources.getDimensionPixelSize(R.dimen.zoom_thumb_offset)) + resources.getDimensionPixelSize(R.dimen.seekbar_margin));
        Paint paint = new Paint();
        paint.setColor(resources.getColor(R.color.zoom_marker_color, null));
        paint.setStyle(Style.FILL_AND_STROKE);
        paint.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.zoom_marker_stroke_width));
        paint.setAntiAlias(true);
        paint.setShadowLayer((float) resources.getDimensionPixelSize(R.dimen.zoom_marker_shadow_radius), (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_shadow_offset_x), (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_shadow_offset_y), resources.getColor(R.color.zoom_marker_shadow_color, null));
        this.f6436g = paint;
        paint = new Paint();
        paint.setColor(resources.getColor(R.color.zoom_marker_text_color, null));
        paint.setTextAlign(Align.CENTER);
        paint.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.f6437h = paint;
    }
}

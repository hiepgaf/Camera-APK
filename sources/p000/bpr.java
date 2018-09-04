package p000;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bpr */
public final class bpr {
    /* renamed from: a */
    public final Paint f1394a;
    /* renamed from: b */
    public final Paint f1395b;
    /* renamed from: c */
    public final Paint f1396c;
    /* renamed from: d */
    public final Drawable f1397d;
    /* renamed from: e */
    public final float f1398e;
    /* renamed from: f */
    public final float f1399f;
    /* renamed from: g */
    public final float f1400g;
    /* renamed from: h */
    public final float f1401h;
    /* renamed from: i */
    public final float f1402i;
    /* renamed from: j */
    public final float f1403j;
    /* renamed from: k */
    public final float f1404k;
    /* renamed from: l */
    public final float f1405l;
    /* renamed from: m */
    public final float f1406m;
    /* renamed from: n */
    public final float f1407n;
    /* renamed from: o */
    public final float f1408o;
    /* renamed from: p */
    public final float f1409p;
    /* renamed from: q */
    public final float f1410q;
    /* renamed from: r */
    public final float f1411r = (this.f1401h / 2.0f);
    /* renamed from: s */
    public int f1412s;
    /* renamed from: t */
    private final float f1413t;
    /* renamed from: u */
    private final float f1414u;

    public bpr(Resources resources) {
        this.f1398e = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerWidth);
        this.f1399f = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerMarginRight);
        this.f1404k = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerMargin);
        this.f1406m = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerWidth);
        this.f1405l = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerHeight);
        this.f1407n = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerTriangleWidth);
        this.f1408o = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerBorderRadius);
        this.f1409p = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerTextSize);
        this.f1400g = (float) resources.getDimensionPixelOffset(R.dimen.evCompRulerDotRadius);
        this.f1402i = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerMarkerWidth);
        this.f1401h = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerMarkerHeight);
        this.f1413t = (float) resources.getDimensionPixelSize(R.dimen.evCompMinVerticalPadding);
        this.f1414u = (float) resources.getDimensionPixelSize(R.dimen.evCompMaxHeight);
        this.f1397d = resources.getDrawable(R.drawable.ic_exposure, null);
        this.f1403j = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerMarkerDistanceFromCenterX);
        this.f1410q = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerDashThickness);
        Paint paint = new Paint();
        paint.setColor(resources.getColor(R.color.evCompRulerColor, null));
        paint.setStyle(Style.FILL);
        this.f1394a = paint;
        paint = new Paint();
        paint.setColor(resources.getColor(R.color.evCompTextColor, null));
        paint.setTextAlign(Align.CENTER);
        paint.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.f1396c = paint;
        paint = new Paint();
        paint.setStyle(Style.STROKE);
        paint.setColor(resources.getColor(R.color.evCompStrokeColor, null));
        paint.setAntiAlias(true);
        paint.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.evCompStrokeWidth));
        this.f1395b = paint;
    }

    /* renamed from: a */
    public final float m933a(int i, Canvas canvas) {
        int height = canvas.getHeight();
        int a = m934a(canvas.getHeight());
        float f = this.f1400g;
        f += f;
        int i2 = this.f1412s;
        float f2 = (float) a;
        float f3 = this.f1411r;
        float f4 = (float) (i2 - 1);
        return (((((float) height) - f2) / 2.0f) + f3) + (((((f2 - (f3 + f3)) - (f * f4)) / f4) + f) * ((float) i));
    }

    /* renamed from: a */
    public final int m935a(Canvas canvas) {
        return (canvas.getWidth() - ((int) this.f1399f)) - ((int) (this.f1398e / 2.0f));
    }

    /* renamed from: a */
    public final int m934a(int i) {
        int i2;
        double d = (double) i;
        float f = this.f1413t;
        if (0.15d * d >= ((double) f)) {
            i2 = (int) (d * 0.7d);
        } else {
            i2 = (int) (((float) i) - (f + f));
        }
        float f2 = this.f1414u;
        if (((float) i2) > f2) {
            return (int) f2;
        }
        return i2;
    }
}

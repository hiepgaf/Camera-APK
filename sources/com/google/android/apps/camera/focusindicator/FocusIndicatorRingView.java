package com.google.android.apps.camera.focusindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import p000.bsy;
import p000.bsz;
import p000.bta;
import p000.hdy;
import p000.hir;
import p000.iqm;

/* compiled from: PG */
public class FocusIndicatorRingView extends View {
    /* renamed from: a */
    public final bsz f2301a;
    /* renamed from: b */
    public final bta f2302b;
    /* renamed from: c */
    private PointF f2303c;
    /* renamed from: d */
    private hir f2304d;
    /* renamed from: e */
    private boolean f2305e;

    public FocusIndicatorRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2301a = new bsz(new bsy());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Style.FILL);
        this.f2302b = new bta(shapeDrawable);
    }

    FocusIndicatorRingView(Context context, bsz bsz, bta bta) {
        super(context);
        this.f2301a = bsz;
        this.f2302b = bta;
    }

    /* renamed from: a */
    public final void m1235a(PointF pointF) {
        this.f2303c = pointF;
        setX(pointF.x - ((float) (getWidth() / 2)));
        setY(pointF.y - ((float) (getHeight() / 2)));
    }

    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        bsz bsz = this.f2301a;
        Drawable drawable = bsz.f1512a;
        if (drawable != null) {
            f = bsz.f1513b;
            if (f > 0.0f) {
                bsy.m956a(canvas, drawable, f);
            }
        }
        bta bta = this.f2302b;
        drawable = bta.f1517a;
        if (drawable != null) {
            f = bta.f1518b;
            if (f > 0.0f) {
                bsy.m956a(canvas, drawable, f);
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = (View) getParent();
        hir hir = this.f2304d;
        Context context = getContext();
        this.f2304d = hir.m3181a(hdy.m3084b(context), hdy.m3085c(context), view.getMeasuredWidth(), view.getMeasuredHeight());
        if (this.f2305e) {
            iqm iqm;
            hir hir2 = this.f2304d;
            PointF pointF = this.f2303c;
            int width = view.getWidth();
            int height = view.getHeight();
            switch (m1234a(hir2) - m1234a(hir)) {
                case -270:
                case 90:
                    iqm = iqm.CLOCKWISE_270;
                    break;
                case -180:
                case MediaDecoder.ROTATE_180 /*180*/:
                    iqm = iqm.CLOCKWISE_180;
                    break;
                case -90:
                case MediaDecoder.ROTATE_90_LEFT /*270*/:
                    iqm = iqm.CLOCKWISE_90;
                    break;
                case 0:
                    iqm = iqm.CLOCKWISE_0;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            if (pointF != null) {
                PointF pointF2 = new PointF();
                switch (iqm.ordinal()) {
                    case 1:
                        pointF2.set(((float) width) - pointF.y, pointF.x);
                        break;
                    case 2:
                        pointF2.set(((float) width) - pointF.x, ((float) height) - pointF.y);
                        break;
                    case 3:
                        pointF2.set(pointF.y, ((float) height) - pointF.x);
                        break;
                    default:
                        pointF2.set(pointF.x, pointF.y);
                        break;
                }
                m1235a(pointF2);
            }
        }
        this.f2305e = true;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2301a.f1512a.setBounds(0, 0, i, i2);
        this.f2302b.f1517a.setBounds(0, 0, i, i2);
    }

    /* renamed from: a */
    private static int m1234a(hir hir) {
        switch (hir.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 90;
            case 2:
                return MediaDecoder.ROTATE_90_LEFT;
            case 3:
                return MediaDecoder.ROTATE_180;
            default:
                throw new IllegalArgumentException();
        }
    }
}

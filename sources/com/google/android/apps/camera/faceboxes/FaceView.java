package com.google.android.apps.camera.faceboxes;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.hardware.camera2.params.Face;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.HashMap;
import java.util.Map;
import p000.bli;
import p000.brq;
import p000.fvk;
import p000.hdy;
import p000.iqm;

/* compiled from: PG */
public class FaceView extends View {
    /* renamed from: a */
    public int f2289a;
    /* renamed from: b */
    public boolean f2290b;
    /* renamed from: c */
    public Matrix f2291c = new Matrix();
    /* renamed from: d */
    public Face[] f2292d;
    /* renamed from: e */
    public RectF f2293e;
    /* renamed from: f */
    public int f2294f;
    /* renamed from: g */
    public int f2295g;
    /* renamed from: h */
    private iqm f2296h;
    /* renamed from: i */
    private Paint f2297i;
    /* renamed from: j */
    private int f2298j = 0;
    /* renamed from: k */
    private final RectF f2299k = new RectF();
    /* renamed from: l */
    private final Map f2300l;

    static {
        bli.m862a("FaceView");
    }

    public FaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.f2297i = new Paint();
        this.f2297i.setAntiAlias(true);
        this.f2297i.setStyle(Style.STROKE);
        this.f2297i.setStrokeWidth(resources.getDimension(R.dimen.face_rectangle_stroke));
        this.f2297i.setColor(resources.getColor(R.color.face_rectangle_color));
        this.f2300l = new HashMap();
    }

    /* renamed from: a */
    public final void m1231a() {
        this.f2292d = null;
        this.f2300l.clear();
        m1232b();
    }

    /* renamed from: d */
    private final int m1230d() {
        Face[] faceArr = this.f2292d;
        return faceArr != null ? faceArr.length : 0;
    }

    /* renamed from: b */
    public final void m1232b() {
        int d = m1230d();
        if (d > 0 || this.f2298j > 0) {
            this.f2298j = m1230d();
            if (d > 0) {
                for (Face face : this.f2292d) {
                    if (face != null && face.getScore() >= 50) {
                        int id = face.getId();
                        if (id >= 0) {
                            Map map = this.f2300l;
                            Integer valueOf = Integer.valueOf(id);
                            brq brq = (brq) map.get(valueOf);
                            if (brq == null) {
                                brq = new brq(face, this.f2291c);
                                this.f2300l.put(valueOf, brq);
                                brq.m949a();
                            } else {
                                brq.m950a(face);
                            }
                        }
                    }
                }
            }
            invalidate();
            if (d == 0) {
                this.f2300l.clear();
            }
        }
    }

    public void layout(int i, int i2, int i3, int i4) {
        iqm b;
        super.layout(i, i2, i3, i4);
        this.f2299k.set((float) i, (float) i2, (float) i3, (float) i4);
        switch (hdy.m3084b(getContext())) {
            case 1:
                b = iqm.m4039b(90);
                break;
            case 2:
                b = iqm.m4039b(MediaDecoder.ROTATE_180);
                break;
            case 3:
                b = iqm.m4039b(MediaDecoder.ROTATE_90_LEFT);
                break;
            default:
                b = iqm.m4039b(0);
                break;
        }
        this.f2296h = b;
        m1233c();
    }

    protected void onDraw(Canvas canvas) {
        if (m1230d() > 0) {
            if (this.f2300l.isEmpty()) {
                for (Face bounds : this.f2292d) {
                    RectF rectF = new RectF(bounds.getBounds());
                    this.f2291c.mapRect(rectF);
                    canvas.drawRect(rectF, this.f2297i);
                }
            } else {
                for (brq brq : this.f2300l.values()) {
                    Paint paint = this.f2297i;
                    int i = brq.f1493f;
                    if (i > 0) {
                        paint.setAlpha(i);
                        canvas.drawCircle(brq.f1488a.f6274a, brq.f1489b.f6274a, brq.f1492e, paint);
                    }
                }
            }
        }
        super.onDraw(canvas);
    }

    /* renamed from: c */
    public final void m1233c() {
        RectF rectF = this.f2293e;
        if (rectF != null) {
            int i = this.f2294f;
            if (i > 0) {
                int i2 = this.f2295g;
                if (i2 > 0) {
                    iqm iqm = this.f2296h;
                    if (iqm != null) {
                        RectF rectF2 = this.f2299k;
                        if (rectF2 != null) {
                            this.f2291c = fvk.m2401a(rectF, i, i2, this.f2289a, iqm, this.f2290b, rectF2.width(), this.f2299k.height());
                        }
                    }
                }
            }
        }
    }
}

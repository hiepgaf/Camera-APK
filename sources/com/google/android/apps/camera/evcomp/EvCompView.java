package com.google.android.apps.camera.evcomp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;
import p000.bpr;
import p000.jri;
import p000.kvl;

/* compiled from: PG */
public class EvCompView extends ViewGroup {
    /* renamed from: a */
    public final bpr f2279a;
    /* renamed from: b */
    public float f2280b;
    /* renamed from: c */
    public float f2281c;
    /* renamed from: d */
    public float f2282d;
    /* renamed from: e */
    public float f2283e;
    /* renamed from: f */
    public boolean f2284f;
    /* renamed from: g */
    public View f2285g;
    /* renamed from: h */
    private boolean f2286h;
    /* renamed from: i */
    private boolean f2287i;
    /* renamed from: j */
    private boolean f2288j;

    public EvCompView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f2279a = new bpr(context.getResources());
    }

    public EvCompView(Context context, bpr bpr) {
        super(context);
        setWillNotDraw(false);
        this.f2279a = bpr;
        this.f2281c = (float) context.getResources().getDimensionPixelSize(R.dimen.evCompRulerShortDashLength);
    }

    /* renamed from: a */
    public static String m1226a(float f) {
        return String.format("%+.1f", new Object[]{Float.valueOf(f)}).replaceFirst("^[-+](0(\\.0*)?)$", "$1");
    }

    protected void onDraw(Canvas canvas) {
        bpr bpr = this.f2279a;
        if (bpr != null) {
            float a;
            int i;
            int i2;
            float a2;
            float a3;
            float f;
            float a4;
            boolean z;
            if (this.f2286h) {
                if (this.f2287i) {
                    a = (float) bpr.m935a(canvas);
                    i = bpr.f1412s / 2;
                    for (i2 = 0; i2 < bpr.f1412s; i2++) {
                        if (i2 != i) {
                            a2 = bpr.m933a(i2, canvas);
                            canvas.drawCircle(a, a2, bpr.f1400g, bpr.f1394a);
                            canvas.drawCircle(a, a2, bpr.f1400g, bpr.f1395b);
                        }
                    }
                    bpr bpr2 = this.f2279a;
                    int intrinsicWidth = bpr2.f1397d.getIntrinsicWidth();
                    int intrinsicHeight = bpr2.f1397d.getIntrinsicHeight();
                    i = (canvas.getHeight() - intrinsicHeight) / 2;
                    int a5 = bpr2.m935a(canvas) - (intrinsicWidth / 2);
                    bpr2.f1397d.setBounds(a5, i, intrinsicWidth + a5, intrinsicHeight + i);
                    bpr2.f1397d.draw(canvas);
                } else {
                    a = (float) bpr.m935a(canvas);
                    for (i2 = 0; i2 < bpr.f1412s; i2++) {
                        if (i2 % 3 != 0) {
                            a3 = bpr.m933a(i2, canvas);
                            canvas.drawCircle(a, a3, bpr.f1400g, bpr.f1394a);
                            canvas.drawCircle(a, a3, bpr.f1400g, bpr.f1395b);
                        }
                    }
                    bpr bpr3 = this.f2279a;
                    f = this.f2281c;
                    float a6 = ((float) bpr3.m935a(canvas)) - (f / 2.0f);
                    for (int i3 = 0; i3 < bpr3.f1412s; i3 += 3) {
                        a4 = bpr3.m933a(i3, canvas);
                        a3 = bpr3.f1410q / 2.0f;
                        a = a4 - a3;
                        a2 = a4 + a3;
                        a3 = a6 + f;
                        canvas.drawRect(a6, a, a3, a2, bpr3.f1394a);
                        canvas.drawRect(a6, a, a3, a2, bpr3.f1395b);
                    }
                }
            }
            if (this.f2288j) {
                bpr = this.f2279a;
                a = this.f2280b;
                if (a >= 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13154b(z, (Object) "position must be in the range (0, 1)");
                if (a <= 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13154b(z, (Object) "position must be in the range (0, 1)");
                i2 = bpr.m934a(canvas.getHeight());
                i = canvas.getHeight();
                a2 = bpr.f1411r;
                a4 = (((float) ((i - i2) / 2)) + ((1.0f - a) * (((float) i2) - (a2 + a2)))) + a2;
                a = bpr.f1401h / 2.0f;
                a3 = ((float) bpr.m935a(canvas)) - bpr.f1403j;
                a2 = a3 - bpr.f1402i;
                Path path = new Path();
                path.moveTo(a3, a4);
                path.lineTo(a2, a4 - a);
                path.lineTo(a2, a + a4);
                path.lineTo(a3, a4);
                path.close();
                canvas.drawPath(path, bpr.f1394a);
                canvas.drawPath(path, bpr.f1395b);
            }
            if (this.f2284f) {
                bpr = this.f2279a;
                a = this.f2280b;
                a3 = this.f2282d;
                a2 = this.f2283e;
                if (a >= 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13144a(z, (Object) "position must be in the range [0, 1]");
                if (a <= 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13144a(z, (Object) "position must be in the range [0, 1]");
                if (a3 >= 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13144a(z, (Object) "scale must be in the range [0, 1]");
                if (a3 <= 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13144a(z, (Object) "scale must be in the range [0, 1]");
                if (a3 != 0.0f) {
                    i2 = bpr.m934a(canvas.getHeight());
                    int height = canvas.getHeight();
                    float f2 = bpr.f1406m;
                    float f3 = f2 * a3;
                    f = bpr.f1405l;
                    float f4 = bpr.f1407n;
                    float f5 = bpr.f1411r;
                    a4 = (((float) ((height - i2) / 2)) + ((1.0f - a) * (((float) i2) - (f5 + f5)))) + f5;
                    a = (f * a3) / 2.0f;
                    float f6 = (bpr.f1404k + f2) - f3;
                    f2 = f6 + f3;
                    f3 = f2 - (f4 * a3);
                    f = a4 - a;
                    a += a4;
                    f4 = bpr.f1408o;
                    Path path2 = new Path();
                    path2.moveTo(f2, a4);
                    path2.lineTo(f3, f);
                    f4 += f6;
                    path2.lineTo(f4, f);
                    path2.quadTo(f6, f, f6, bpr.f1408o + f);
                    path2.lineTo(f6, a - bpr.f1408o);
                    path2.quadTo(f6, a, f4, a);
                    path2.lineTo(f3, a);
                    path2.lineTo(f2, a4);
                    path2.close();
                    canvas.drawPath(path2, bpr.f1394a);
                    canvas.drawPath(path2, bpr.f1395b);
                    String a7 = m1226a(a2);
                    bpr.f1396c.setTextSize(a3 * bpr.f1409p);
                    Rect rect = new Rect();
                    bpr.f1396c.getTextBounds(a7, 0, a7.length(), rect);
                    canvas.drawText(a7, ((f3 - f6) / 2.0f) + f6, a4 + ((float) (rect.height() / 2)), bpr.f1396c);
                }
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2285g != null) {
            bpr bpr = this.f2279a;
            int i5 = i4 - i2;
            int a = bpr.m934a(i5);
            Point point = new Point(((i3 - i) - ((int) bpr.f1399f)) - ((int) (bpr.f1398e / 2.0f)), (i5 - a) / 2);
            point.y -= Math.round(TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()));
            View view = this.f2285g;
            view.layout(point.x - (view.getMeasuredWidth() / 2), point.y - this.f2285g.getMeasuredHeight(), point.x + (this.f2285g.getMeasuredWidth() / 2), point.y);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.f2285g;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), kvl.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), kvl.UNSET_ENUM_VALUE));
        }
    }

    /* renamed from: a */
    public final void m1228a(boolean z) {
        this.f2287i = z;
        invalidate();
    }

    /* renamed from: b */
    public final void m1229b(boolean z) {
        this.f2288j = z;
        invalidate();
    }

    /* renamed from: a */
    public final void m1227a() {
        this.f2286h = true;
        invalidate();
    }
}

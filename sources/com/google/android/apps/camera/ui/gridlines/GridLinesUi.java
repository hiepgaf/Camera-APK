package com.google.android.apps.camera.ui.gridlines;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCamera.R;
import java.util.Map;
import p000.gxi;
import p000.gxj;
import p000.gxk;
import p000.gxl;
import p000.gyf;
import p000.kes;

/* compiled from: PG */
public class GridLinesUi extends View {
    /* renamed from: c */
    private static final gxj f2414c = new gxi();
    /* renamed from: d */
    private static final gxj f2415d = new gxl(new float[]{0.0f, 1.0f}, false, true);
    /* renamed from: e */
    private static final gxj f2416e = new gxl(new float[]{0.33333334f, 0.6666666f}, false, false);
    /* renamed from: f */
    private static final gxj f2417f = new gxl(new float[]{0.25f, 0.5f, 0.75f}, true, false);
    /* renamed from: g */
    private static final gxj f2418g = new gxl(new float[]{0.38196602f, 0.618034f}, false, false);
    /* renamed from: a */
    public final Map f2419a = kes.m4805a(gxk.f5760a, f2415d, gxk.f5761b, f2416e, gxk.f5762c, f2417f, gxk.f5763d, f2418g);
    /* renamed from: b */
    public final gyf f2420b;
    /* renamed from: h */
    private final Paint f2421h = new Paint();
    /* renamed from: i */
    private final Paint f2422i = new Paint();

    public GridLinesUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2421h.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.grid_line_width));
        this.f2421h.setColor(context.getResources().getColor(R.color.grid_line, null));
        this.f2422i.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.grid_line_width));
        this.f2422i.setColor(context.getResources().getColor(R.color.grid_line, null));
        this.f2420b = new gyf(this, this.f2421h, this.f2422i);
        this.f2420b.m2913a(f2414c);
    }

    public void onDraw(Canvas canvas) {
        gyf gyf = this.f2420b;
        if (!gyf.f5792b.f5757g) {
            gyf.f5794d.mo1674a(canvas, gyf.f5791a);
            gyf.f5795e.mo1674a(canvas, gyf.f5791a);
            gyf.f5796f.mo1674a(canvas, gyf.f5791a);
            gyf.f5797g.mo1674a(canvas, gyf.f5791a);
            gyf.f5798h.mo1674a(canvas, gyf.f5791a);
            gyf.f5799i.mo1674a(canvas, gyf.f5791a);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        gyf gyf = this.f2420b;
        gyf.f5791a.set((float) i, (float) i2, (float) i3, (float) i4);
        gyf.m2912a();
        gyf.f5793c.invalidate();
    }
}

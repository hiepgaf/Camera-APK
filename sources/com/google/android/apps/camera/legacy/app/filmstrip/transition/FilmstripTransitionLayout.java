package com.google.android.apps.camera.legacy.app.filmstrip.transition;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import p000.bli;
import p000.cto;
import p000.ctp;
import p000.ctq;
import p000.ctr;
import p000.cts;
import p000.ctt;
import p000.ctu;
import p000.ctv;
import p000.hhz;
import p000.hjf;
import p000.jri;

@TargetApi(23)
/* compiled from: PG */
public class FilmstripTransitionLayout extends FrameLayout {
    /* renamed from: a */
    public static final String f2317a = bli.m862a("FSTransLayout");
    /* renamed from: b */
    public final ValueAnimator f2318b;
    /* renamed from: c */
    public final ValueAnimator f2319c;
    /* renamed from: d */
    public boolean f2320d = false;
    /* renamed from: e */
    public boolean f2321e = false;
    /* renamed from: f */
    public FilmstripTransitionThumbnailView f2322f;
    /* renamed from: g */
    public RoundedThumbnailView f2323g;
    /* renamed from: h */
    public ctt f2324h = null;
    /* renamed from: i */
    public ctt f2325i = null;
    /* renamed from: j */
    public boolean f2326j = true;
    /* renamed from: k */
    public ctu f2327k;
    /* renamed from: l */
    public cto f2328l;

    public FilmstripTransitionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(4);
        m1241a(0.0f);
        TimeInterpolator loadInterpolator = AnimationUtils.loadInterpolator(context, 17563661);
        this.f2318b = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f2318b.setDuration(350);
        this.f2318b.setInterpolator(loadInterpolator);
        this.f2318b.addUpdateListener(new ctp(this));
        this.f2318b.addListener(new ctq(this));
        this.f2319c = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2319c.setDuration(350);
        this.f2319c.setInterpolator(loadInterpolator);
        this.f2319c.addUpdateListener(new ctr(this));
        this.f2319c.addListener(new cts(this));
    }

    /* renamed from: a */
    public final ctv m1240a() {
        int i = 0;
        jri.m13152b(this.f2323g);
        SizeF sizeF = new SizeF((float) this.f2322f.m1248a().getWidth(), (float) this.f2322f.m1248a().getHeight());
        float thumbnailFinalDiameter = this.f2323g.getThumbnailFinalDiameter();
        int a = hhz.m3153a(this.f2323g);
        int b = hhz.m3160b(this.f2323g);
        float rippleRingMaxDiameterDp = this.f2323g.getRippleRingMaxDiameterDp();
        float f = (float) a;
        float f2 = (float) b;
        RectF rectF = new RectF(f, f2, f + rippleRingMaxDiameterDp, rippleRingMaxDiameterDp + f2);
        View rootView = getRootView();
        int[] c = hhz.m3161c(rootView);
        int i2 = c[0];
        RectF rectF2 = new RectF((float) i2, (float) c[1], (float) (i2 + rootView.getWidth()), (float) (rootView.getHeight() + c[1]));
        Context context = getContext();
        Point point = new Point();
        ((Activity) context).getWindowManager().getDefaultDisplay().getRealSize(point);
        RectF rectF3 = new RectF(0.0f, 0.0f, (float) point.x, (float) point.y);
        if (hjf.m3193a().f6268c.f7503d) {
            int i3;
            c = hhz.m3161c(getRootView());
            if (c[0] != 0) {
                i3 = 1;
            } else if (c[1] != 0) {
                i3 = 1;
            } else if (getRootWindowInsets().getDisplayCutout() != null) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                c = hhz.m3161c(getRootView());
                WindowInsets rootWindowInsets = getRootWindowInsets();
                if (getResources().getConfiguration().orientation == 1) {
                    i3 = Math.max(c[1] + rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetBottom());
                } else {
                    int max = Math.max(c[0] + rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetRight());
                    i3 = 0;
                    i = max;
                }
                Point point2 = new Point(i, i3);
                rectF3.inset((float) point2.x, (float) point2.y);
            }
        }
        return new ctv(sizeF, rectF2, rectF3, rectF, thumbnailFinalDiameter);
    }

    /* renamed from: b */
    public final void m1245b() {
        this.f2327k = m1240a().m1520a();
        m1246c();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2322f = (FilmstripTransitionThumbnailView) findViewById(R.id.transition_thumbnail_view);
    }

    /* renamed from: a */
    public final void m1241a(float f) {
        setBackgroundColor(Color.argb((int) (255.0f * f), 0, 0, 0));
    }

    /* renamed from: a */
    public final void m1242a(Bitmap bitmap) {
        FilmstripTransitionThumbnailView filmstripTransitionThumbnailView = this.f2322f;
        synchronized (filmstripTransitionThumbnailView.f2329a) {
            filmstripTransitionThumbnailView.f2330b = bitmap;
            filmstripTransitionThumbnailView.setLayoutParams(new LayoutParams(filmstripTransitionThumbnailView.f2330b.getWidth(), filmstripTransitionThumbnailView.f2330b.getHeight()));
            filmstripTransitionThumbnailView.requestLayout();
            Paint paint = new Paint(1);
            paint.setShader(new BitmapShader(filmstripTransitionThumbnailView.f2330b, TileMode.CLAMP, TileMode.CLAMP));
            filmstripTransitionThumbnailView.f2331c = new Paint(paint);
        }
        if (this.f2318b.isRunning()) {
            this.f2327k = m1240a().m1520a();
        }
    }

    /* renamed from: a */
    public final void m1244a(RoundedThumbnailView roundedThumbnailView) {
        jri.m13152b((Object) roundedThumbnailView);
        this.f2323g = roundedThumbnailView;
    }

    /* renamed from: c */
    public final void m1246c() {
        float c = this.f2327k.m1518c(0.0f);
        this.f2322f.setScaleX(c);
        this.f2322f.setScaleY(c);
        PointF d = this.f2327k.m1519d(0.0f);
        this.f2322f.setTranslationX(d.x);
        this.f2322f.setTranslationY(d.y);
        this.f2322f.m1249a(this.f2327k.m1517b(0.0f));
        m1241a(this.f2327k.m1516a(0.0f));
    }

    /* renamed from: d */
    public final void m1247d() {
        float c = this.f2327k.m1518c(1.0f);
        this.f2322f.setScaleX(c);
        this.f2322f.setScaleY(c);
        PointF d = this.f2327k.m1519d(1.0f);
        this.f2322f.setTranslationX(d.x);
        this.f2322f.setTranslationY(d.y);
        this.f2322f.m1249a(this.f2327k.m1517b(1.0f));
        m1241a(this.f2327k.m1516a(1.0f));
    }

    /* renamed from: a */
    public final void m1243a(Bitmap bitmap, ctt ctt) {
        m1242a(bitmap);
        this.f2324h = ctt;
        this.f2327k = m1240a().m1520a();
        m1247d();
        this.f2318b.start();
        this.f2328l = null;
    }
}

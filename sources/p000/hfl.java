package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: hfl */
public final class hfl extends View {
    /* renamed from: a */
    public final int f6148a;
    /* renamed from: b */
    public final int f6149b;
    /* renamed from: c */
    public final int f6150c;
    /* renamed from: d */
    public final Paint f6151d;
    /* renamed from: e */
    public final Interpolator f6152e;
    /* renamed from: f */
    public int f6153f = go.bv;
    /* renamed from: g */
    public int f6154g;
    /* renamed from: h */
    public float f6155h;
    /* renamed from: i */
    public int f6156i = 0;
    /* renamed from: j */
    public AnimatorSet f6157j = null;
    /* renamed from: k */
    public AnimatorSet f6158k = null;
    /* renamed from: l */
    private final Paint f6159l;
    /* renamed from: m */
    private final Interpolator f6160m;
    /* renamed from: n */
    private int f6161n;
    /* renamed from: o */
    private int f6162o;
    /* renamed from: p */
    private RectF f6163p = new RectF();

    static {
        bli.m862a("ProgressOverlay");
    }

    public hfl(Context context) {
        super(context);
        setVisibility(4);
        this.f6148a = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_radius_max);
        this.f6149b = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_radius);
        this.f6150c = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_width);
        this.f6160m = new LinearInterpolator();
        this.f6152e = AnimationUtils.loadInterpolator(getContext(), 17563661);
        this.f6151d = new Paint();
        this.f6151d.setAntiAlias(true);
        this.f6151d.setStyle(Style.STROKE);
        this.f6151d.setColor(-1);
        this.f6151d.setAlpha(51);
        this.f6159l = new Paint(this.f6151d);
        this.f6159l.setAlpha(Illuminant.kOther);
    }

    /* renamed from: a */
    public final void m3105a() {
        AnimatorSet animatorSet = this.f6158k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f6158k.cancel();
        }
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{(float) this.f6150c, 0.0f});
        ofFloat.setDuration(133);
        ofFloat.setInterpolator(this.f6160m);
        ofFloat.addUpdateListener(new hfp(this));
        this.f6158k = new AnimatorSet();
        this.f6158k.play(ofFloat);
        this.f6158k.addListener(new hfq(this));
        this.f6158k.start();
    }

    public final void onDraw(Canvas canvas) {
        if (this.f6153f != go.bv) {
            canvas.drawCircle((float) this.f6161n, (float) this.f6162o, (float) this.f6154g, this.f6151d);
            if (this.f6153f == go.by || this.f6153f == go.bx) {
                this.f6151d.setStrokeWidth(this.f6155h);
                this.f6159l.setStrokeWidth(this.f6155h);
                RectF rectF = this.f6163p;
                int i = this.f6161n;
                int i2 = this.f6154g;
                int i3 = this.f6162o;
                rectF.set((float) (i - i2), (float) (i3 - i2), (float) (i + i2), (float) (i2 + i3));
                canvas.drawArc(this.f6163p, -90.0f, (float) this.f6156i, false, this.f6159l);
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f6161n = (i3 - i) / 2;
            this.f6162o = (i4 - i2) / 2;
        }
    }
}

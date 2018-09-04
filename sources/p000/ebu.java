package p000;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ebu */
public final class ebu implements SurfaceTextureListener, OnLayoutChangeListener, han {
    /* renamed from: a */
    private static final String f14976a = bli.m862a("TexViewHelper");
    /* renamed from: b */
    private final FrameLayout f14977b;
    /* renamed from: c */
    private final TextureView f14978c;
    /* renamed from: d */
    private final WindowManager f14979d;
    /* renamed from: e */
    private final SurfaceTextureListener f14980e;
    /* renamed from: f */
    private final ArrayList f14981f = new ArrayList();
    /* renamed from: g */
    private final ArrayList f14982g = new ArrayList();
    /* renamed from: h */
    private final cwd f14983h;
    /* renamed from: i */
    private int f14984i = 0;
    /* renamed from: j */
    private int f14985j = 0;
    /* renamed from: k */
    private boolean f14986k;
    /* renamed from: l */
    private RectF f14987l = new RectF();
    /* renamed from: m */
    private float f14988m = 0.0f;
    /* renamed from: n */
    private OnLayoutChangeListener f14989n = null;
    /* renamed from: o */
    private gyi f14990o = null;
    /* renamed from: p */
    private int f14991p = -1;

    private ebu(FrameLayout frameLayout, gyi gyi, WindowManager windowManager, SurfaceTextureListener surfaceTextureListener, cwd cwd) {
        this.f14977b = frameLayout;
        this.f14977b.addOnLayoutChangeListener(this);
        this.f14978c = (TextureView) hhz.m3162d(new TextureView(frameLayout.getContext()));
        this.f14978c.setSurfaceTextureListener(this);
        this.f14979d = windowManager;
        this.f14990o = gyi;
        this.f14980e = surfaceTextureListener;
        this.f14983h = cwd;
    }

    /* renamed from: a */
    public final void mo1213a(ham ham) {
        if (ham != null && !this.f14982g.contains(ham)) {
            this.f14982g.add(ham);
            if (this.f14987l.width() == 0.0f || this.f14987l.height() == 0.0f) {
                ham.mo1132a(new RectF(0.0f, 0.0f, (float) this.f14984i, (float) this.f14985j));
            } else {
                ham.mo1132a(new RectF(this.f14987l));
            }
        }
    }

    /* renamed from: a */
    public final void mo1209a() {
        this.f14978c.setTransform(new Matrix());
        this.f14987l.set(0.0f, 0.0f, (float) this.f14984i, (float) this.f14985j);
        m9642a(this.f14987l);
        int i = this.f14984i;
        if (i > 0) {
            int i2 = this.f14985j;
            if (i2 > 0) {
                this.f14990o.m11679a(i, i2, true);
            }
        }
        m9643b(0.0f);
    }

    /* renamed from: a */
    public static han m9641a(View view, SurfaceTextureListener surfaceTextureListener, WindowManager windowManager, gyi gyi, cwd cwd) {
        return new hao("TextureViewLegacy --", new ebu((FrameLayout) view.findViewById(R.id.activity_root_view), gyi, windowManager, surfaceTextureListener, cwd));
    }

    /* renamed from: b */
    public final int mo1214b() {
        return this.f14978c.getHeight();
    }

    /* renamed from: c */
    public final int mo1216c() {
        return this.f14978c.getWidth();
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f14978c.getParent() != null) {
            iqm b;
            int i9 = i3 - i;
            int i10 = i4 - i2;
            String str = f14976a;
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("onLayoutChange: ");
            stringBuilder.append(i9);
            stringBuilder.append("x");
            stringBuilder.append(i10);
            bli.m871d(str, stringBuilder.toString());
            boolean isInMultiWindowMode = this.f14990o.f17564a.isInMultiWindowMode();
            switch (this.f14979d.getDefaultDisplay().getRotation()) {
                case 0:
                    b = iqm.m4039b(0);
                    break;
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
                    b = iqm.CLOCKWISE_0;
                    break;
            }
            int a = b.m4041a();
            if (!(this.f14984i == i9 && this.f14985j == i10 && this.f14991p == a && this.f14986k == isInMultiWindowMode)) {
                this.f14984i = i9;
                this.f14985j = i10;
                this.f14991p = a;
                m9645g();
                this.f14986k = isInMultiWindowMode;
            }
            OnLayoutChangeListener onLayoutChangeListener = this.f14989n;
            if (onLayoutChangeListener != null) {
                onLayoutChangeListener.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        }
    }

    /* renamed from: d */
    public final kpk mo1217d() {
        this.f14977b.addView(this.f14978c, 0);
        return kow.m13617a(null);
    }

    /* renamed from: e */
    public final kpk mo1218e() {
        jri.m13154b(true, (Object) "Last Create Synchronization has not finished yet.");
        this.f14977b.removeView(this.f14978c);
        return kow.m13617a(null);
    }

    /* renamed from: a */
    private final void m9642a(RectF rectF) {
        this.f14978c.post(new ebv(new ArrayList(this.f14982g), rectF));
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        if (!(this.f14984i == 0 || this.f14985j == 0)) {
            m9645g();
        }
        this.f14980e.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f14980e.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f14980e.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f14980e.onSurfaceTextureUpdated(surfaceTexture);
    }

    /* renamed from: b */
    public final void mo1215b(ham ham) {
        if (ham != null && this.f14982g.contains(ham)) {
            this.f14982g.remove(ham);
        }
    }

    /* renamed from: f */
    public final void mo1219f() {
        this.f14978c.requestLayout();
    }

    /* renamed from: b */
    private final void m9643b(float f) {
        String str = f14976a;
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("setAspectRatio: ");
        stringBuilder.append(f);
        bli.m871d(str, stringBuilder.toString());
        if (this.f14988m != f) {
            str = f14976a;
            float f2 = this.f14988m;
            StringBuilder stringBuilder2 = new StringBuilder(42);
            stringBuilder2.append("aspect ratio changed from: ");
            stringBuilder2.append(f2);
            bli.m871d(str, stringBuilder2.toString());
            this.f14988m = f;
            ArrayList arrayList = this.f14981f;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((har) arrayList.get(i)).m2997a();
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo1212a(OnLayoutChangeListener onLayoutChangeListener) {
        this.f14989n = onLayoutChangeListener;
    }

    /* renamed from: a */
    public final void mo1210a(float f) {
        String str = f14976a;
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("updateAspectRatio ");
        stringBuilder.append(f);
        bli.m871d(str, stringBuilder.toString());
        if (f <= 0.0f) {
            str = f14976a;
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("Invalid aspect ratio: ");
            stringBuilder.append(f);
            bli.m863a(str, stringBuilder.toString());
            return;
        }
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        m9643b(f);
        m9645g();
    }

    /* renamed from: b */
    private final void m9644b(Matrix matrix) {
        this.f14987l.set(0.0f, 0.0f, (float) this.f14984i, (float) this.f14985j);
        if (!this.f14990o.f17564a.isInMultiWindowMode()) {
            matrix.mapRect(this.f14987l);
        }
        m9642a(this.f14987l);
    }

    /* renamed from: g */
    private final boolean m9645g() {
        bli.m871d(f14976a, "updateTransform");
        float f = this.f14988m;
        if (!(f == 0.0f || f < 0.0f || this.f14984i == 0 || this.f14985j == 0)) {
            iqm b;
            Matrix matrix;
            switch (this.f14979d.getDefaultDisplay().getRotation()) {
                case 0:
                    b = iqm.m4039b(0);
                    break;
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
                    b = iqm.CLOCKWISE_0;
                    break;
            }
            this.f14991p = b.m4041a();
            if (!this.f14990o.f17564a.isInMultiWindowMode()) {
                int i = this.f14991p;
                RectF rectF = new RectF(0.0f, 0.0f, (float) this.f14984i, (float) this.f14985j);
                RectF a = this.f14990o.mo1696a();
                if (!rectF.equals(a)) {
                    matrix = new Matrix();
                    matrix.setRectToRect(rectF, a, ScaleToFit.FILL);
                    RectF rectF2 = new RectF((rectF.width() / 2.0f) - (rectF.height() / 2.0f), (rectF.height() / 2.0f) - (rectF.width() / 2.0f), (rectF.width() / 2.0f) + (rectF.height() / 2.0f), (rectF.height() / 2.0f) + (rectF.width() / 2.0f));
                    switch (iqm.m4037a(i).ordinal()) {
                        case 1:
                            matrix.setRectToRect(rectF2, a, ScaleToFit.FILL);
                            matrix.preRotate(270.0f, (float) (this.f14984i / 2), (float) (this.f14985j / 2));
                            break;
                        case 2:
                            matrix.setRectToRect(rectF, a, ScaleToFit.FILL);
                            matrix.preRotate(180.0f, (float) (this.f14984i / 2), (float) (this.f14985j / 2));
                            break;
                        case 3:
                            matrix.setRectToRect(rectF2, a, ScaleToFit.FILL);
                            matrix.preRotate(90.0f, (float) (this.f14984i / 2), (float) (this.f14985j / 2));
                            break;
                        default:
                            matrix.setRectToRect(rectF, a, ScaleToFit.FILL);
                            break;
                    }
                }
                matrix = new Matrix();
            } else {
                cwd cwd = this.f14983h;
                iqp iqp = new iqp(this.f14984i, this.f14985j);
                iqp iqp2 = cwd.f2821a;
                matrix = iqp2 != null ? cwd.m1547a(iqp, iqp2) : new Matrix();
            }
            this.f14978c.setTransform(matrix);
            m9644b(matrix);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1211a(Matrix matrix) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f14984i, (float) this.f14985j);
        matrix.mapRect(rectF);
        float width = rectF.width();
        float height = rectF.height();
        if (height == 0.0f || width == 0.0f) {
            String str = f14976a;
            StringBuilder stringBuilder = new StringBuilder(55);
            stringBuilder.append("Invalid preview size: ");
            stringBuilder.append(width);
            stringBuilder.append(" x ");
            stringBuilder.append(height);
            bli.m863a(str, stringBuilder.toString());
            return;
        }
        float f = width / height;
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        if (f != this.f14988m) {
            m9643b(f);
            this.f14990o.m11679a((int) width, (int) height, false);
        }
        RectF a = this.f14990o.mo1696a();
        Matrix matrix2 = new Matrix();
        if (!this.f14990o.f17564a.isInMultiWindowMode()) {
            matrix2.setRectToRect(rectF, a, ScaleToFit.CENTER);
            matrix.postConcat(matrix2);
        }
        this.f14978c.setTransform(matrix);
        m9644b(matrix);
    }
}

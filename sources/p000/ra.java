package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.googlex.gcam.hdrplus.MetadataConverter;

/* compiled from: PG */
/* renamed from: ra */
class ra {
    /* renamed from: b */
    private static final int[] f9095b = new int[]{16843067, 16843068};
    /* renamed from: a */
    public Bitmap f9096a;
    /* renamed from: c */
    private final ProgressBar f9097c;

    ra(ProgressBar progressBar) {
        this.f9097c = progressBar;
    }

    /* renamed from: a */
    void mo2451a(AttributeSet attributeSet, int i) {
        vk a = vk.m6047a(this.f9097c.getContext(), attributeSet, f9095b, i, 0);
        Drawable c = a.m6054c(0);
        if (c != null) {
            ProgressBar progressBar = this.f9097c;
            if (c instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) c;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                Drawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a2 = m5746a(animationDrawable.getFrame(i2), true);
                    a2.setLevel(MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR);
                    animationDrawable2.addFrame(a2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR);
                c = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(c);
        }
        c = a.m6054c(1);
        if (c != null) {
            this.f9097c.setProgressDrawable(m5746a(c, false));
        }
        a.f9419b.recycle();
    }

    /* renamed from: a */
    private final Drawable m5746a(Drawable drawable, boolean z) {
        int i = 0;
        if (drawable instanceof he) {
            he heVar = (he) drawable;
            Drawable a = heVar.m3090a();
            if (a == null) {
                return drawable;
            }
            m5746a(a, z);
            heVar.m3091b();
            return drawable;
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                boolean z2;
                int id = layerDrawable.getId(i2);
                Drawable drawable2 = layerDrawable.getDrawable(i2);
                if (id == 16908301) {
                    z2 = true;
                } else if (id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i2] = m5746a(drawable2, z2);
            }
            r0 = new LayerDrawable(drawableArr);
            while (i < numberOfLayers) {
                r0.setId(i, layerDrawable.getId(i));
                i++;
            }
            return r0;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f9096a == null) {
                this.f9096a = bitmap;
            }
            r0 = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            r0.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            r0.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(r0, 3, 1) : r0;
        }
    }
}

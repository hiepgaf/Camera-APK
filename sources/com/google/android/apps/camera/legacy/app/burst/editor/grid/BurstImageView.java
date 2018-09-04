package com.google.android.apps.camera.legacy.app.burst.editor.grid;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
public class BurstImageView extends ImageView {
    /* renamed from: b */
    private static Bitmap f2315b;
    /* renamed from: a */
    public boolean f2316a;

    public BurstImageView(Context context) {
        super(context);
        m1239a(context.getApplicationContext().getResources());
    }

    public BurstImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1239a(context.getApplicationContext().getResources());
    }

    public BurstImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1239a(context.getApplicationContext().getResources());
    }

    public BurstImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1239a(context.getApplicationContext().getResources());
    }

    /* renamed from: a */
    private static void m1239a(Resources resources) {
        if (f2315b == null) {
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.ic_star_white_18dp);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.burst_grid_icon_background_gradient_radius);
            float f = (float) dimensionPixelSize;
            Shader radialGradient = new RadialGradient(f, f, f, resources.getColor(R.color.burst_grid_icon_background_gradient_color), 0, TileMode.CLAMP);
            Paint paint = new Paint();
            paint.setShader(radialGradient);
            int i = dimensionPixelSize + dimensionPixelSize;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(f, f, f, paint);
            canvas.drawBitmap(decodeResource, (float) ((i - decodeResource.getWidth()) / 2), (float) ((i - decodeResource.getHeight()) / 2), null);
            f2315b = createBitmap;
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2316a) {
            float[] fArr;
            int width = canvas.getWidth();
            if (getDrawable() != null) {
                fArr = new float[]{(float) getDrawable().getIntrinsicWidth(), 0.0f};
                getImageMatrix().mapPoints(fArr);
                float f = (float) width;
                if (fArr[0] > f) {
                    fArr[0] = f;
                }
                if (fArr[1] < 0.0f) {
                    fArr[1] = 0.0f;
                }
            } else {
                fArr = new float[]{(float) width, 0.0f};
            }
            canvas.drawBitmap(f2315b, fArr[0] - ((float) f2315b.getWidth()), fArr[1], null);
        }
    }
}

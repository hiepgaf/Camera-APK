package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* compiled from: PG */
/* renamed from: fk */
final class fk {
    /* renamed from: a */
    private static final boolean f4594a = true;
    /* renamed from: b */
    private static final boolean f4595b = true;
    /* renamed from: c */
    private static final boolean f4596c = true;

    /* renamed from: a */
    static View m2331a(ViewGroup viewGroup, View view, View view2) {
        boolean isAttachedToWindow;
        int i;
        ViewGroup viewGroup2;
        int i2;
        Bitmap bitmap;
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        fo.f4639a.mo3047a(view, matrix);
        fo.f4639a.mo3048b(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        View imageView = new ImageView(view.getContext());
        imageView.setScaleType(ScaleType.CENTER_CROP);
        if (f4594a) {
            int isAttachedToWindow2 = view.isAttachedToWindow() ^ 1;
            if (viewGroup != null) {
                isAttachedToWindow = viewGroup.isAttachedToWindow();
            } else {
                isAttachedToWindow = false;
            }
            i = isAttachedToWindow2;
        } else {
            isAttachedToWindow = false;
            i = 0;
        }
        if (!f4595b) {
            viewGroup2 = null;
            i2 = 0;
        } else if (i == 0) {
            viewGroup2 = null;
            i2 = 0;
        } else if (isAttachedToWindow) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            isAttachedToWindow2 = viewGroup3.indexOfChild(view);
            viewGroup.getOverlay().add(view);
            int i3 = isAttachedToWindow2;
            viewGroup2 = viewGroup3;
            i2 = i3;
        } else {
            bitmap = null;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
            imageView.measure(MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
            imageView.layout(round, round2, round3, round4);
            return imageView;
        }
        int round5 = Math.round(rectF.width());
        int round6 = Math.round(rectF.height());
        if (round5 <= 0) {
            bitmap = null;
        } else if (round6 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
            round5 = Math.round(((float) round5) * min);
            round6 = Math.round(((float) round6) * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            Canvas beginRecording;
            if (f4596c) {
                Picture picture = new Picture();
                beginRecording = picture.beginRecording(round5, round6);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round5, round6, Config.ARGB_8888);
                beginRecording = new Canvas(bitmap);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
            }
        } else {
            bitmap = null;
        }
        if (f4595b && i != 0) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i2);
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        imageView.measure(MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }
}

package com.google.android.libraries.smartburst.filterfw;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
public class FrameImage2D extends FrameBuffer2D {
    FrameImage2D(BackingStore backingStore) {
        super(backingStore);
    }

    static void assertCanCreate(BackingStore backingStore) {
        FrameBuffer2D.assertCanCreate(backingStore);
    }

    private static Bitmap convertToFrameType(Bitmap bitmap, FrameType frameType) {
        Config config = bitmap.getConfig();
        switch (frameType.getElementId()) {
            case FrameType.ELEMENT_RGBA8888 /*301*/:
                if (config != Config.ARGB_8888) {
                    bitmap = bitmap.copy(Config.ARGB_8888, false);
                    if (bitmap == null) {
                        throw new RuntimeException("Could not convert bitmap to frame-type RGBA8888!");
                    }
                }
                return bitmap;
            default:
                String valueOf = String.valueOf(frameType);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                stringBuilder.append("Unsupported frame type '");
                stringBuilder.append(valueOf);
                stringBuilder.append("' for bitmap assignment!");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public void copyToFrame(FrameImage2D frameImage2D, RectF rectF, RectF rectF2) {
        if (GraphRunner.current().isOpenGLSupported()) {
            gpuImageCopy(this, frameImage2D, rectF, rectF2);
        } else {
            cpuImageCopy(this, frameImage2D, rectF, rectF2);
        }
    }

    private static void cpuImageCopy(FrameImage2D frameImage2D, FrameImage2D frameImage2D2, RectF rectF, RectF rectF2) {
        Rect rect = new Rect((int) (rectF.left * ((float) frameImage2D.getWidth())), (int) (rectF.top * ((float) frameImage2D.getHeight())), (int) (rectF.right * ((float) frameImage2D.getWidth())), (int) (rectF.bottom * ((float) frameImage2D.getHeight())));
        Rect rect2 = new Rect((int) (rectF2.left * ((float) frameImage2D2.getWidth())), (int) (rectF2.top * ((float) frameImage2D2.getHeight())), (int) (rectF2.right * ((float) frameImage2D2.getWidth())), (int) (rectF2.bottom * ((float) frameImage2D2.getHeight())));
        Bitmap toBitmap = frameImage2D2.toBitmap();
        if (toBitmap == null) {
            toBitmap = Bitmap.createBitmap(frameImage2D2.getWidth(), frameImage2D2.getHeight(), Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(toBitmap);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        canvas.drawBitmap(frameImage2D.toBitmap(), rect, rect2, paint);
        frameImage2D2.setBitmap(toBitmap);
    }

    static FrameImage2D create(BackingStore backingStore) {
        assertCanCreate(backingStore);
        return new FrameImage2D(backingStore);
    }

    private static void gpuImageCopy(FrameImage2D frameImage2D, FrameImage2D frameImage2D2, RectF rectF, RectF rectF2) {
        ImageShader identityShader = RenderTarget.currentTarget().getIdentityShader();
        identityShader.setSourceRect(rectF);
        identityShader.setTargetRect(rectF2);
        identityShader.process(frameImage2D, frameImage2D2);
        identityShader.setSourceRect(0.0f, 0.0f, 1.0f, 1.0f);
        identityShader.setTargetRect(0.0f, 0.0f, 1.0f, 1.0f);
    }

    public RenderTarget lockRenderTarget() {
        return (RenderTarget) this.mBackingStore.lockData(2, 4);
    }

    public TextureSource lockTextureSource() {
        return (TextureSource) this.mBackingStore.lockData(1, 2);
    }

    public void setBitmap(Bitmap bitmap) {
        Bitmap convertToFrameType = convertToFrameType(bitmap, this.mBackingStore.getFrameType());
        validateBitmapSize(convertToFrameType, this.mBackingStore.getDimensions());
        this.mBackingStore.lockBacking(2, 16).setData(convertToFrameType);
        this.mBackingStore.unlock();
    }

    public Bitmap toBitmap() {
        Bitmap bitmap = (Bitmap) this.mBackingStore.lockData(1, 16);
        this.mBackingStore.unlock();
        return bitmap;
    }

    private void validateBitmapSize(Bitmap bitmap, int[] iArr) {
        if (bitmap.getWidth() != iArr[0] || bitmap.getHeight() != iArr[1]) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = iArr[0];
            int i2 = iArr[1];
            StringBuilder stringBuilder = new StringBuilder(94);
            stringBuilder.append("Cannot assign bitmap of size ");
            stringBuilder.append(width);
            stringBuilder.append("x");
            stringBuilder.append(height);
            stringBuilder.append(" to frame of size ");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            stringBuilder.append("!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

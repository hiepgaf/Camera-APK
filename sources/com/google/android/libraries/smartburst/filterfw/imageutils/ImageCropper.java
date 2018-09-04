package com.google.android.libraries.smartburst.filterfw.imageutils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.FilterModes;

/* compiled from: PG */
public class ImageCropper {
    public FrameImage2D mPow2Frame = null;
    public ImageShader mShader;
    public final boolean mUseOpenGL;

    public ImageCropper(boolean z) {
        this.mUseOpenGL = z;
        if (this.mUseOpenGL) {
            this.mShader = ImageShader.createIdentity();
        }
    }

    public static int[] computeCropDimensions(int[] iArr, Quad quad) {
        return new int[]{(int) Math.ceil((double) (quad.xEdge().length() * ((float) iArr[0]))), (int) Math.ceil((double) (quad.yEdge().length() * ((float) iArr[1])))};
    }

    public void cropImage(FrameImage2D frameImage2D, Quad quad, FrameImage2D frameImage2D2, boolean z) {
        cropImage(frameImage2D, quad, frameImage2D2, z, true);
    }

    public void cropImage(FrameImage2D frameImage2D, Quad quad, FrameImage2D frameImage2D2, boolean z, boolean z2) {
        if (quad.topLeft().x < 0.0f || quad.topLeft().y < 0.0f || quad.topRight().x > 1.0f || quad.topRight().y < 0.0f || quad.bottomLeft().x < 0.0f || quad.bottomLeft().y > 1.0f || quad.bottomRight().x > 1.0f || quad.bottomRight().y > 1.0f) {
            throw new IllegalArgumentException("cropQuad must use normalized coordinates");
        }
        int[] dimensions = frameImage2D.getDimensions();
        int[] computeCropDimensions = computeCropDimensions(dimensions, quad);
        int width = frameImage2D2.getWidth();
        int height = frameImage2D2.getHeight();
        if (this.mUseOpenGL) {
            int i;
            FrameImage2D frameImage2D3;
            if (!z2) {
                frameImage2D.lockTextureSource().setParameter(10240, FilterModes.NEAREST);
            }
            if (width < computeCropDimensions[0]) {
                i = 1;
            } else if (height >= computeCropDimensions[1]) {
                i = 0;
            } else {
                i = 1;
            }
            if (i == 0) {
                frameImage2D3 = frameImage2D;
            } else if (z) {
                this.mPow2Frame = MipMapUtils.makeMipMappedFrame(this.mPow2Frame, computeCropDimensions);
                dimensions = this.mPow2Frame.getDimensions();
                Quad fromRect = Quad.fromRect(0.0f, 0.0f, ((float) computeCropDimensions[0]) / ((float) dimensions[0]), ((float) computeCropDimensions[1]) / ((float) dimensions[1]));
                this.mShader.setSourceQuad(quad);
                this.mShader.setTargetQuad(fromRect);
                this.mShader.process(frameImage2D, this.mPow2Frame);
                MipMapUtils.generateMipMaps(this.mPow2Frame);
                quad = fromRect;
                frameImage2D3 = this.mPow2Frame;
            } else {
                frameImage2D3 = frameImage2D;
            }
            this.mShader.setSourceQuad(quad);
            this.mShader.setTargetRect(0.0f, 0.0f, 1.0f, 1.0f);
            this.mShader.process(frameImage2D3, frameImage2D2);
            if (!z2) {
                frameImage2D.lockTextureSource().setDefaultParams();
                return;
            }
            return;
        }
        Matrix transform = Quad.getTransform(quad.scale2((float) dimensions[0], (float) dimensions[1]), Quad.fromRect(0.0f, 0.0f, (float) dimensions[0], (float) dimensions[1]));
        transform.postScale(((float) width) / ((float) dimensions[0]), ((float) height) / ((float) dimensions[1]));
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setFilterBitmap(z);
        canvas.drawBitmap(frameImage2D.toBitmap(), transform, paint);
        frameImage2D2.setBitmap(createBitmap);
    }

    public void release() {
        FrameImage2D frameImage2D = this.mPow2Frame;
        if (frameImage2D != null) {
            frameImage2D.release();
            this.mPow2Frame = null;
            this.mShader = null;
        }
    }
}

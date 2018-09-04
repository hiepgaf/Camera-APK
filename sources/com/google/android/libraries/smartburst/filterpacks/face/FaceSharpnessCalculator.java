package com.google.android.libraries.smartburst.filterpacks.face;

import android.graphics.RectF;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameBuffer2D;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.libraries.smartburst.filterfw.imageutils.FastBoxBlur;
import com.google.android.libraries.smartburst.filterfw.imageutils.GrayValuesExtractor;
import com.google.android.libraries.smartburst.filterfw.imageutils.ImageCropper;
import com.google.android.libraries.smartburst.filterfw.imageutils.PerceptualSharpnessCalculator;
import com.google.android.libraries.smartburst.filterfw.imageutils.RegionStatsCalculator;
import com.google.android.libraries.smartburst.filterfw.imageutils.RegionStatsCalculator.Statistics;
import com.google.android.libraries.smartburst.filterfw.imageutils.SobelOperator;
import com.google.android.vision.face.Face;

/* compiled from: PG */
public class FaceSharpnessCalculator {
    public static final int BOX_FILTER_SIZE = 7;
    public static final Quad STATS_CROP_RECT = Quad.fromRect(0.0f, 0.0f, 1.0f, 1.0f);
    public static final boolean USE_LINEAR = false;
    public static final boolean USE_MIPMAPS = false;
    public final FastBoxBlur mBoxBlurOperatorX;
    public final FastBoxBlur mBoxBlurOperatorY;
    public final GrayValuesExtractor mGrayValuesExtractor;
    public ImageCropper mImageCropper = null;
    public final RegionStatsCalculator mRegionStatsCalculator;
    public final SobelOperator mSobelOperator;

    public FaceSharpnessCalculator(boolean z) {
        this.mImageCropper = new ImageCropper(z);
        this.mSobelOperator = new SobelOperator(z);
        this.mGrayValuesExtractor = new GrayValuesExtractor(z);
        this.mRegionStatsCalculator = new RegionStatsCalculator();
        this.mBoxBlurOperatorX = new FastBoxBlur(z, 7, 1);
        this.mBoxBlurOperatorY = new FastBoxBlur(z, 1, 7);
    }

    public float computeFaceImagePerceptualSharpness(FrameImage2D frameImage2D) {
        FrameImage2D asFrameImage2D = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), frameImage2D.getDimensions()).asFrameImage2D();
        FrameImage2D asFrameImage2D2 = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), frameImage2D.getDimensions()).asFrameImage2D();
        this.mBoxBlurOperatorX.computeBlur(frameImage2D, asFrameImage2D);
        this.mBoxBlurOperatorY.computeBlur(frameImage2D, asFrameImage2D2);
        float computeSharpness = PerceptualSharpnessCalculator.computeSharpness(frameImage2D, asFrameImage2D, asFrameImage2D2);
        asFrameImage2D.release();
        asFrameImage2D2.release();
        return computeSharpness;
    }

    public float computeFaceImageShapness(FrameImage2D frameImage2D) {
        FrameImage2D asFrameImage2D = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), frameImage2D.getDimensions()).asFrameImage2D();
        this.mSobelOperator.calculate(frameImage2D, null, null, asFrameImage2D, null);
        FrameBuffer2D asFrameBuffer2D = Frame.create(FrameType.buffer2D(100), this.mGrayValuesExtractor.getOutputFrameDimensions(asFrameImage2D.getDimensions())).asFrameBuffer2D();
        this.mGrayValuesExtractor.toGrayValues(asFrameImage2D, asFrameBuffer2D);
        Statistics calcMeanAndStd = this.mRegionStatsCalculator.calcMeanAndStd(asFrameBuffer2D, STATS_CROP_RECT, false);
        asFrameBuffer2D.release();
        asFrameImage2D.release();
        return (float) Math.hypot((double) calcMeanAndStd.mean, (double) calcMeanAndStd.stdDev);
    }

    public float computeFaceSharpness(FrameImage2D frameImage2D, Face face) {
        RectF coreFeaturesBoundingBox = face.getCoreFeaturesBoundingBox();
        int round = Math.round(coreFeaturesBoundingBox.width() * 1.5f);
        int round2 = Math.round(coreFeaturesBoundingBox.height() * 1.5f);
        FrameImage2D asFrameImage2D = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), new int[]{round, round2}).asFrameImage2D();
        cropFace(frameImage2D, face, asFrameImage2D);
        float computeFaceImagePerceptualSharpness = computeFaceImagePerceptualSharpness(asFrameImage2D);
        asFrameImage2D.release();
        return computeFaceImagePerceptualSharpness;
    }

    public void cropFace(FrameImage2D frameImage2D, Face face, FrameImage2D frameImage2D2) {
        if (this.mImageCropper == null) {
            throw new IllegalStateException("Image cropper has already been released");
        }
        this.mImageCropper.cropImage(frameImage2D, FaceUtils.getFaceQuad(face, frameImage2D.getWidth(), frameImage2D.getHeight()), frameImage2D2, false, false);
    }

    public void release() {
        ImageCropper imageCropper = this.mImageCropper;
        if (imageCropper != null) {
            imageCropper.release();
            this.mImageCropper = null;
        }
    }
}

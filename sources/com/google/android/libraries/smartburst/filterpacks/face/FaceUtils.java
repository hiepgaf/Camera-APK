package com.google.android.libraries.smartburst.filterpacks.face;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.libraries.smartburst.filterfw.imageutils.ImageCropper;
import com.google.android.vision.face.Face;
import com.google.android.vision.face.Landmark;
import java.nio.ByteBuffer;
import java.util.List;
import p000.jri;
import p000.jzp;

/* compiled from: PG */
public class FaceUtils {
    public static final float FACE_GROW_SCALE = 1.5f;
    public static final int FULL_LANDMARK_SET_SIZE = 8;
    public static final ImageCropper IMAGE_CROPPER = new ImageCropper(false);
    public static final float LEFT_EYE_OPEN_SCORE_WEIGHT = 0.4f;
    public static final float RIGHT_EYE_OPEN_SCORE_WEIGHT = 0.4f;
    public static final float SMILING_SCORE_WEIGHT = 0.2f;
    public static final String TAG = "FaceUtils";
    public static final boolean USE_LINEAR = false;
    public static final boolean USE_MIPMAPS = false;

    static {
        System.loadLibrary("smartburst-jni");
    }

    private static native float calculatePatchDistance(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public static void cropFace(FrameImage2D frameImage2D, Face face, FrameImage2D frameImage2D2) {
        if (IMAGE_CROPPER == null) {
            throw new IllegalStateException("Image cropper has already been released");
        }
        IMAGE_CROPPER.cropImage(frameImage2D, getFaceQuad(face, frameImage2D.getWidth(), frameImage2D.getHeight()), frameImage2D2, false, false);
    }

    public static float getAverageFaceImageDistance(List list, List list2, List list3, List list4, int i, int i2) {
        boolean z;
        jri.m13152b((Object) list);
        jri.m13152b((Object) list2);
        jri.m13152b((Object) list3);
        jri.m13152b((Object) list4);
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        if (list.size() == list3.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        if (list2.size() == list4.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        int i3 = 0;
        float f = 0.0f;
        while (i3 < list.size()) {
            float faceImageDistance;
            Object obj;
            Face face = (Face) list.get(i3);
            jzp faceDimension = getFaceDimension(i, i2, face);
            for (int i4 = 0; i4 < list2.size(); i4++) {
                Face face2 = (Face) list2.get(i4);
                if (face.getTrackId() == face2.getTrackId()) {
                    faceImageDistance = f + getFaceImageDistance((ByteBuffer) list3.get(i3), faceDimension, (ByteBuffer) list4.get(i4), getFaceDimension(i, i2, face2));
                    obj = 1;
                    break;
                }
            }
            obj = null;
            faceImageDistance = f;
            if (obj == null) {
                return Float.POSITIVE_INFINITY;
            }
            i3++;
            f = faceImageDistance;
        }
        if (list.isEmpty()) {
            return 0.0f;
        }
        return f / ((float) list.size());
    }

    public static float getAverageFacialExpressionScoreDistance(List list, List list2) {
        boolean z;
        jri.m13152b((Object) list);
        jri.m13152b((Object) list2);
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        int i = 0;
        float f = 0.0f;
        while (i < list.size()) {
            float facialExpressionScoreDistance;
            Object obj;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (((Face) list.get(i)).getTrackId() == ((Face) list2.get(i2)).getTrackId()) {
                    facialExpressionScoreDistance = f + getFacialExpressionScoreDistance((Face) list.get(i), (Face) list2.get(i2));
                    obj = 1;
                    break;
                }
            }
            obj = null;
            facialExpressionScoreDistance = f;
            if (obj == null) {
                return Float.MAX_VALUE;
            }
            i++;
            f = facialExpressionScoreDistance;
        }
        if (list.isEmpty()) {
            return 0.0f;
        }
        return f / ((float) list.size());
    }

    public static float getAverageJoyScore(List list, float f, float f2, float f3) {
        jri.m13152b((Object) list);
        float f4 = 0.0f;
        for (Face joyScore : list) {
            f4 = getJoyScore(joyScore, f, f2, f3) + f4;
        }
        if (list.isEmpty()) {
            return f4;
        }
        return f4 / ((float) list.size());
    }

    private static jzp getFaceDimension(int i, int i2, Face face) {
        int[] iArr = new int[]{i, i2};
        int[] computeCropDimensions = ImageCropper.computeCropDimensions(iArr, getFaceQuad(face, i, i2));
        return jzp.m4713a(computeCropDimensions[0], computeCropDimensions[1]);
    }

    public static float getFaceImageDistance(ByteBuffer byteBuffer, jzp jzp, ByteBuffer byteBuffer2, jzp jzp2) {
        jri.m13152b((Object) byteBuffer);
        jri.m13152b((Object) byteBuffer2);
        jri.m13152b((Object) jzp);
        jri.m13152b((Object) jzp2);
        int i = jzp.f8149a;
        if (i > 0) {
            int i2 = jzp.f8150b;
            if (i2 > 0) {
                int i3 = jzp2.f8149a;
                if (i3 > 0) {
                    int i4 = jzp2.f8150b;
                    if (i4 > 0) {
                        return calculatePatchDistance(byteBuffer, i, i2, byteBuffer2, i3, i4);
                    }
                }
            }
        }
        Log.e(TAG, String.format("Face dimensions must be positive. Current dimensions are (%d, %d) and (%d %d).", new Object[]{Integer.valueOf(i), Integer.valueOf(jzp.f8150b), Integer.valueOf(jzp2.f8149a), Integer.valueOf(jzp2.f8150b)}));
        return Float.POSITIVE_INFINITY;
    }

    public static Quad getFaceQuad(Face face, int i, int i2) {
        return Quad.fromRect(getFaceRect(face, i, i2));
    }

    public static RectF getFaceRect(Face face, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i2 <= 0) {
            z2 = false;
        }
        jri.m13143a(z2);
        RectF rectF = new RectF(face.getCoreFeaturesBoundingBox());
        float f = (float) i;
        rectF.left /= f;
        rectF.right /= f;
        f = (float) i2;
        rectF.top /= f;
        rectF.bottom /= f;
        Quad grow = Quad.fromRect(rectF).grow(1.5f);
        return new RectF(limitToInRange(grow.topLeft().x, 0.0f, 1.0f), limitToInRange(grow.topLeft().y, 0.0f, 1.0f), limitToInRange(grow.bottomRight().x, 0.0f, 1.0f), limitToInRange(grow.bottomRight().y, 0.0f, 1.0f));
    }

    public static float getFacialExpressionScoreDistance(Face face, Face face2) {
        float f;
        float f2;
        float f3 = 0.0f;
        jri.m13152b((Object) face);
        jri.m13152b((Object) face2);
        if (face.getIsLeftEyeOpenScore() <= 0.0f) {
            f = 0.0f;
        } else if (face2.getIsLeftEyeOpenScore() > 0.0f) {
            f = face.getIsLeftEyeOpenScore() - face2.getIsLeftEyeOpenScore();
        } else {
            f = 0.0f;
        }
        if (face.getIsRightEyeOpenScore() <= 0.0f) {
            f2 = 0.0f;
        } else if (face2.getIsRightEyeOpenScore() > 0.0f) {
            f2 = face.getIsRightEyeOpenScore() - face2.getIsRightEyeOpenScore();
        } else {
            f2 = 0.0f;
        }
        if (face.getIsSmilingScore() > 0.0f && face2.getIsSmilingScore() > 0.0f) {
            f3 = face.getIsSmilingScore() - face2.getIsSmilingScore();
        }
        return (float) Math.sqrt((double) ((((f * f) * 0.4f) + ((f2 * f2) * 0.4f)) + ((f3 * f3) * 0.2f)));
    }

    public static float getJoyScore(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f) {
            return 0.0f;
        }
        return ((f * f4) + (f2 * f5)) + (f3 * f6);
    }

    public static float getJoyScore(Face face, float f, float f2, float f3) {
        jri.m13152b((Object) face);
        return getJoyScore(face.getIsLeftEyeOpenScore(), face.getIsRightEyeOpenScore(), face.getIsSmilingScore(), f, f2, f3);
    }

    public static Rect getScaledBoundingBox(Face face, float f) {
        RectF scaledBoundingBoxF = getScaledBoundingBoxF(face, f);
        return new Rect(Math.round(scaledBoundingBoxF.left), Math.round(scaledBoundingBoxF.top), Math.round(scaledBoundingBoxF.right), Math.round(scaledBoundingBoxF.bottom));
    }

    public static RectF getScaledBoundingBoxF(Face face, float f) {
        return new RectF((face.getPosition().x - (face.getWidth() / 2.0f)) * f, (face.getPosition().y - (face.getHeight() / 2.0f)) * f, ((face.getWidth() / 2.0f) + face.getPosition().x) * f, ((face.getHeight() / 2.0f) + face.getPosition().y) * f);
    }

    public static PointF getScaledLandmarkPosition(Landmark landmark, float f) {
        return new PointF(landmark.getPosition().x * f, landmark.getPosition().y * f);
    }

    public static boolean hasAllLandmarks(Face face) {
        return face.getLandmarks().size() == 8;
    }

    public static boolean hasAllProbabilities(Face face) {
        if (face.getIsLeftEyeOpenScore() < 0.0f || face.getIsRightEyeOpenScore() < 0.0f || face.getIsSmilingScore() < 0.0f) {
            return false;
        }
        return true;
    }

    private static float limitToInRange(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }
}

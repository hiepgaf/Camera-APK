package com.google.android.apps.refocus.processing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.vision.face.Detector;
import com.google.android.vision.face.Detector.ClassificationSettings;
import com.google.android.vision.face.Detector.DetectionSettings;
import com.google.android.vision.face.DetectorFactory;
import com.google.android.vision.face.Face;
import com.google.android.vision.face.ImmediateDetectorFuture;
import com.google.android.vision.face.ModelManager;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p000.bkw;
import p000.bli;

/* compiled from: PG */
public class FaceDetector {
    public static final boolean DEBUG = false;
    public static final int MAX_IMAGE_DIMENSION = 640;
    public static final String TAG = bli.m862a("FaceDetector");
    public final Context context;
    public final bkw gservicesHelper;

    public FaceDetector(Context context, bkw bkw) {
        this.context = context;
        this.gservicesHelper = bkw;
    }

    boolean computeFaceFocus(RGBZ rgbz, FocusSettings focusSettings) {
        bkw bkw = this.gservicesHelper;
        if (!bkw.m849a(bkw.f1255a, "camera:refocus_face_enabled", true)) {
            bli.m863a(TAG, "Refocus face detection is disabled.");
            return false;
        } else if (rgbz.hasDepthmap()) {
            Bitmap scaleDown = scaleDown(rgbz.getBitmap(), 640);
            Face findLargestFace = findLargestFace(scaleDown);
            if (findLargestFace == null) {
                return false;
            }
            PointF position = findLargestFace.getPosition();
            focusSettings.focalPointX = position.x / ((float) scaleDown.getWidth());
            focusSettings.focalPointY = position.y / ((float) scaleDown.getHeight());
            focusSettings.focalDistance = rgbz.getDepth((int) (((float) rgbz.getWidth()) * focusSettings.focalPointX), (int) (((float) rgbz.getHeight()) * focusSettings.focalPointY));
            return true;
        } else {
            bli.m873e(TAG, "No depthmap set for supplied rgbz");
            return false;
        }
    }

    private Face findLargestFace(Bitmap bitmap) {
        Detector detector;
        Detector detector2;
        Throwable th;
        Detector detector3;
        Throwable th2;
        try {
            DetectorFactory detectorFactory = new DetectorFactory(this.context);
            detectorFactory.f2480b.getDetectionSettings().setDetectorType(0);
            detectorFactory.f2480b.getDetectionSettings().setLandmarkDetectorType(0);
            detectorFactory.f2480b.getDetectionSettings().setProportionalMinFaceSize(0.1f);
            detectorFactory.f2480b.getDetectionSettings().setMaxNumFaces(1);
            detectorFactory = detectorFactory.m1361a();
            detectorFactory.f2480b.setModelFilesLocation(1);
            ClassificationSettings classificationSettings = detectorFactory.f2480b.getClassificationSettings();
            boolean classifyingEyesOpen = classificationSettings.classifyingEyesOpen();
            boolean classifyingSmiling = classificationSettings.classifyingSmiling();
            DetectionSettings detectionSettings = detectorFactory.f2480b.getDetectionSettings();
            int landmarkDetectorType = detectionSettings.getLandmarkDetectorType();
            if (!classifyingEyesOpen || classifyingSmiling) {
                if (classifyingSmiling && (landmarkDetectorType == 0 || landmarkDetectorType == 2)) {
                    detectionSettings.setLandmarkDetectorType(1);
                }
            } else if (landmarkDetectorType == 0) {
                detectionSettings.setLandmarkDetectorType(2);
            }
            if (ModelManager.areApkModelsInstalled(detectorFactory.f2479a, detectorFactory.f2480b)) {
                detector = (Detector) new ImmediateDetectorFuture(new Detector(detectorFactory.f2479a, detectorFactory.f2480b)).get();
                try {
                    List detectFaces = detector.detectFaces(bitmap);
                    if (detector != null) {
                        detector.release();
                    }
                    if (!detectFaces.isEmpty()) {
                        return (Face) detectFaces.get(0);
                    }
                    bli.m863a(TAG, "No face detected.");
                    return null;
                } catch (Throwable e) {
                    detector2 = detector;
                    th = e;
                    detector3 = detector2;
                    try {
                        bli.m864a(TAG, "Face detection interrupted.  Skipping face detection.", th);
                        if (detector3 != null) {
                            detector3.release();
                        }
                        return null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        detector = detector3;
                        if (detector != null) {
                            detector.release();
                        }
                        throw th2;
                    }
                } catch (Throwable e2) {
                    detector2 = detector;
                    th3 = e2;
                    detector3 = detector2;
                    try {
                        bli.m864a(TAG, "Face detection execution failed.  Skipping face detection.", th3);
                        if (detector3 != null) {
                            detector3.release();
                        }
                        return null;
                    } catch (Throwable th32) {
                        th2 = th32;
                        detector = detector3;
                        if (detector != null) {
                            detector.release();
                        }
                        throw th2;
                    }
                } catch (Throwable e22) {
                    detector2 = detector;
                    th32 = e22;
                    detector3 = detector2;
                    try {
                        bli.m864a(TAG, "Face models missing.  Skipping face detection.", th32);
                        if (detector3 != null) {
                            detector3.release();
                        }
                        return null;
                    } catch (Throwable th322) {
                        th2 = th322;
                        detector = detector3;
                        if (detector != null) {
                            detector.release();
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (detector != null) {
                        detector.release();
                    }
                    throw th2;
                }
            }
            throw new IllegalStateException("APK lacks required face model files.  Execute the 'setup_project' script from the SDK to add model files to your app.");
        } catch (InterruptedException e3) {
            th322 = e3;
            detector3 = null;
            bli.m864a(TAG, "Face detection interrupted.  Skipping face detection.", th322);
            if (detector3 != null) {
                detector3.release();
            }
            return null;
        } catch (ExecutionException e4) {
            th322 = e4;
            detector3 = null;
            bli.m864a(TAG, "Face detection execution failed.  Skipping face detection.", th322);
            if (detector3 != null) {
                detector3.release();
            }
            return null;
        } catch (IllegalStateException e5) {
            th322 = e5;
            detector3 = null;
            bli.m864a(TAG, "Face models missing.  Skipping face detection.", th322);
            if (detector3 != null) {
                detector3.release();
            }
            return null;
        } catch (Throwable th3222) {
            th2 = th3222;
            detector = null;
            if (detector != null) {
                detector.release();
            }
            throw th2;
        }
    }

    private Bitmap scaleDown(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (Math.max(width, height) <= i) {
            return bitmap;
        }
        if (width > height) {
            int i2 = (height * i) / width;
            width = i;
            i = i2;
        } else {
            width = (width * i) / height;
        }
        return Bitmap.createScaledBitmap(bitmap, width, i, false);
    }
}

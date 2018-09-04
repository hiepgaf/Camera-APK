package com.google.googlex.gcam.hdrplus;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.BlackLevelPattern;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.LensShadingMap;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.RggbChannelVector;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import com.google.android.camera.experimental2017.ExperimentalKeys;
import com.google.googlex.gcam.AeMetadata;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AfMetadata;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.AwbMetadata;
import com.google.googlex.gcam.DngColorCalibration;
import com.google.googlex.gcam.DngColorCalibrationVector;
import com.google.googlex.gcam.DngNoiseModel;
import com.google.googlex.gcam.FaceInfo;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.OisMetadata;
import com.google.googlex.gcam.OisPosition;
import com.google.googlex.gcam.OisPositionVector;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.QcColorCalibration;
import com.google.googlex.gcam.QcColorCalibration.IlluminantData;
import com.google.googlex.gcam.QcIlluminantVector;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.WeightedNormalizedRect;
import com.google.googlex.gcam.WeightedNormalizedRectVector;
import com.google.googlex.gcam.WeightedPixelRect;
import com.google.googlex.gcam.WeightedPixelRectVector;
import com.google.googlex.gcam.androidutils.MathUtils;
import java.util.List;
import p000.hsz;
import p000.ion;
import p000.ipz;
import p000.iqp;
import p000.itj;
import p000.iun;
import p000.ive;
import p000.iwp;
import p000.jri;

@TargetApi(21)
/* compiled from: PG */
public class MetadataConverter {
    public static final int COLOR_SPACE_TRANSFORM_MATRIX_NUM_ELEMENTS = 9;
    public static final int COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR = 10000;
    public static final int DUMMY_COLOR_TEMPERATURE = GcamModule.getKColorTempUnknown();
    public static final float GCAM_CALCULATES_SHARPNESS = 0.0f;
    public static final float GCAM_METERING_REGION_FRACTION = 0.1225f;
    public static final float GCAM_METERING_REGION_WEIGHT = 45.0f;
    public static final String GCAM_SOFTWARE_TAG = "HDR+";
    public static final int HAL_POST_RAW_SENSITIVITY_BOOST_UNITY = 100;
    public static final float OIS_RAW_2_PIXEL_X_COEFF = -0.007517f;
    public static final float OIS_RAW_2_PIXEL_Y_COEFF = -0.00733f;
    public static final int RGGB_CHANNEL_VECTOR_SIZE = 4;
    public static final String TAG = MetadataConverter.class.getSimpleName();
    public final iun characteristics;
    public final int[] evenOddIndexMap;
    public final int faceDetectMode;
    public final int minIsoGain;
    public final int[] redBlueIndexMap;
    public final Rect sensorActiveArraySize;

    public MetadataConverter(iun iun) {
        this.characteristics = iun;
        this.minIsoGain = ((Integer) ((Range) iun.mo1913a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue();
        int intValue = ((Integer) iun.mo1913a(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue();
        this.redBlueIndexMap = getRedBlueSourceIndicesForCfa(intValue);
        this.evenOddIndexMap = getEvenOddSourceIndicesForCfa(intValue);
        this.sensorActiveArraySize = (Rect) iun.mo1913a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        this.faceDetectMode = iun.mo1927i().f7487d;
    }

    private void appendFaceInfo(Face[] faceArr, FaceInfoVector faceInfoVector) {
        Rect rect = (Rect) this.characteristics.mo1913a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = rect.width();
        int height = rect.height();
        if (faceArr != null) {
            for (int i = 0; i < faceArr.length; i++) {
                Rect bounds = faceArr[i].getBounds();
                float f = (float) width;
                float exactCenterX = bounds.exactCenterX() / f;
                float f2 = (float) height;
                float exactCenterY = bounds.exactCenterY() / f2;
                float width2 = ((float) (bounds.width() + bounds.height())) / 2.0f;
                if (width > height) {
                    f = width2 / f;
                } else {
                    f = width2 / f2;
                }
                f2 = ((float) (faceArr[i].getScore() - 1)) / 99.0f;
                if (exactCenterX < 0.0f || exactCenterX > 1.0f || exactCenterY > 1.0f || exactCenterY < 0.0f || f < 0.0f || f > 1.0f || f2 < 0.0f || f2 > 1.0f) {
                    Log.w(TAG, String.format("Face data is bad: (%d, %d) - (%d, %d), score %d", new Object[]{Integer.valueOf(bounds.left), Integer.valueOf(bounds.top), Integer.valueOf(bounds.right), Integer.valueOf(bounds.bottom), Integer.valueOf(faceArr[i].getScore())}));
                } else {
                    FaceInfo faceInfo = new FaceInfo();
                    faceInfo.setPos_x(exactCenterX);
                    faceInfo.setPos_y(exactCenterY);
                    faceInfo.setSize(f);
                    faceInfo.setConfidence(f2);
                    faceInfoVector.add(faceInfo);
                }
            }
        }
    }

    public static void appendMeteringRectanglesAsGcamWeightedPixelRects(MeteringRectangle[] meteringRectangleArr, WeightedPixelRectVector weightedPixelRectVector) {
        if (meteringRectangleArr != null) {
            for (int i = 0; i < meteringRectangleArr.length; i++) {
                if (meteringRectangleArr[i].getMeteringWeight() != 0) {
                    WeightedPixelRect weightedPixelRect = new WeightedPixelRect();
                    Rect rect = meteringRectangleArr[i].getRect();
                    PixelRect rect2 = weightedPixelRect.getRect();
                    rect2.setX0(rect.left);
                    rect2.setX1(rect.right);
                    rect2.setY0(rect.top);
                    rect2.setY1(rect.bottom);
                    weightedPixelRect.setWeight((float) meteringRectangleArr[i].getMeteringWeight());
                    weightedPixelRectVector.add(weightedPixelRect);
                }
            }
        }
    }

    public void convertMeteringRectanglesToGcamWeightedRects(MeteringRectangle[] meteringRectangleArr, Rect rect, WeightedNormalizedRectVector weightedNormalizedRectVector) {
        WeightedNormalizedRect weightedNormalizedRect = new WeightedNormalizedRect();
        weightedNormalizedRect.setWeight(1.0f);
        weightedNormalizedRect.setRect(new NormalizedRect());
        weightedNormalizedRectVector.add(weightedNormalizedRect);
        if (meteringRectangleArr != null) {
            for (int i = 0; i < meteringRectangleArr.length; i++) {
                if (meteringRectangleArr[i].getMeteringWeight() != 0) {
                    WeightedNormalizedRect weightedNormalizedRect2 = new WeightedNormalizedRect();
                    Rect rect2 = meteringRectangleArr[i].getRect();
                    float exactCenterX = rect2.exactCenterX();
                    float exactCenterY = rect2.exactCenterY();
                    float min = ((float) Math.min(rect.width(), rect.height())) * 0.06125f;
                    float clamp = MathUtils.clamp((exactCenterX - min) / ((float) this.sensorActiveArraySize.width()), 0.0f, 1.0f);
                    float clamp2 = MathUtils.clamp((exactCenterY - min) / ((float) this.sensorActiveArraySize.height()), 0.0f, 1.0f);
                    exactCenterX = MathUtils.clamp((exactCenterX + min) / ((float) this.sensorActiveArraySize.width()), 0.0f, 1.0f);
                    exactCenterY = MathUtils.clamp((exactCenterY + min) / ((float) this.sensorActiveArraySize.height()), 0.0f, 1.0f);
                    NormalizedRect rect3 = weightedNormalizedRect2.getRect();
                    rect3.setX0(clamp);
                    rect3.setY0(clamp2);
                    rect3.setX1(exactCenterX);
                    rect3.setY1(exactCenterY);
                    weightedNormalizedRect2.setWeight(45.0f);
                    weightedNormalizedRectVector.add(weightedNormalizedRect2);
                }
            }
        }
    }

    private static int convertToBayerPattern(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 2;
            default:
                throw new IllegalArgumentException("staticInfo: unsupported BayerPattern");
        }
    }

    private ColorSpaceTransform convertToColorSpaceTransform(float[] fArr) {
        boolean z;
        int i = 0;
        if (fArr.length == 9) {
            z = true;
        } else {
            z = false;
        }
        jri.m13145a(z, "ccm must have length %s.", 9);
        Rational[] rationalArr = new Rational[9];
        while (i < 9) {
            rationalArr[i] = new Rational((int) (fArr[i] * 10000.0f), COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR);
            i++;
        }
        return new ColorSpaceTransform(rationalArr);
    }

    private static float[] convertToFloatArray(ColorSpaceTransform colorSpaceTransform) {
        int i = 0;
        Rational[] rationalArr = new Rational[9];
        colorSpaceTransform.copyElements(rationalArr, 0);
        float[] fArr = new float[9];
        while (i < 9) {
            fArr[i] = rationalArr[i].floatValue();
            i++;
        }
        return fArr;
    }

    public FrameMetadata convertToGcamFrameMetadata(iwp iwp) {
        return convertToGcamFrameMetadata(iwp, null, null);
    }

    public FrameMetadata convertToGcamFrameMetadata(iwp iwp, Face[] faceArr, GyroSampleVector gyroSampleVector) {
        float[] fArr;
        boolean z = true;
        int i = 0;
        FrameMetadata frameMetadata = new FrameMetadata();
        frameMetadata.setSensor_id(getGcamSensorId(this.characteristics));
        frameMetadata.setActual_exposure_time_ms(getExposureTimeMs(iwp));
        float[] analogAndDigitalGain = getAnalogAndDigitalGain(iwp);
        frameMetadata.setActual_analog_gain(analogAndDigitalGain[0]);
        frameMetadata.setApplied_digital_gain(analogAndDigitalGain[1]);
        Integer num = (Integer) iwp.mo3143a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
        if (num != null) {
            frameMetadata.setPost_raw_digital_gain(((float) num.intValue()) / 100.0f);
        }
        int intValue = ((Integer) iwp.mo3143a(CaptureResult.FLASH_MODE)).intValue();
        if (intValue == 1 || intValue == 2) {
            frameMetadata.setFlash(1);
        } else {
            frameMetadata.setFlash(0);
        }
        frameMetadata.setSharpness(0.0f);
        frameMetadata.setWb(getAwbInfoCaptured(iwp));
        Rational[] rationalArr = (Rational[]) iwp.mo3143a(CaptureResult.SENSOR_NEUTRAL_COLOR_POINT);
        frameMetadata.setNeutral_point(new float[]{rationalArr[0].floatValue(), rationalArr[1].floatValue(), rationalArr[2].floatValue()});
        Boolean bool = (Boolean) iwp.mo3143a(CaptureResult.BLACK_LEVEL_LOCK);
        if (bool == null) {
            bool = Boolean.valueOf(false);
        }
        frameMetadata.setWas_black_level_locked(bool.booleanValue());
        frameMetadata.setTimestamp_ns(((Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP)).longValue());
        Face[] faceArr2 = (Face[]) iwp.mo3143a(CaptureResult.STATISTICS_FACES);
        if (faceArr2 != null && faceArr2.length > 0) {
            faceArr = faceArr2;
        }
        appendFaceInfo(faceArr, frameMetadata.getFaces());
        num = (Integer) iwp.mo3143a(CaptureResult.STATISTICS_SCENE_FLICKER);
        if (num != null) {
            switch (num.intValue()) {
                case 0:
                    frameMetadata.setScene_flicker(1);
                    break;
                case 1:
                    frameMetadata.setScene_flicker(2);
                    break;
                case 2:
                    frameMetadata.setScene_flicker(3);
                    break;
                default:
                    Log.e(TAG, "Unexpected STATISTICS_SCENE_FLICKER type!");
                    break;
            }
        }
        Pair[] pairArr = (Pair[]) iwp.mo3143a(CaptureResult.SENSOR_NOISE_PROFILE);
        DngNoiseModel[] dngNoiseModelArr = new DngNoiseModel[4];
        for (int i2 = 0; i2 < 4; i2++) {
            dngNoiseModelArr[i2] = new DngNoiseModel();
            dngNoiseModelArr[i2].setScale(((Double) pairArr[i2].first).floatValue());
            dngNoiseModelArr[i2].setOffset(((Double) pairArr[i2].second).floatValue());
        }
        frameMetadata.setDng_noise_model_bayer(dngNoiseModelArr);
        analogAndDigitalGain = (float[]) iwp.mo3143a(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
        if (analogAndDigitalGain != null) {
            frameMetadata.setBlack_levels_bayer(analogAndDigitalGain);
        } else {
            BlackLevelPattern blackLevelPattern = (BlackLevelPattern) this.characteristics.mo1913a(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
            fArr = new float[4];
            for (int i3 = 0; i3 < 4; i3++) {
                fArr[i3] = (float) blackLevelPattern.getOffsetForIndex(i3 % 2, i3 / 2);
            }
            frameMetadata.setBlack_levels_bayer(fArr);
        }
        Float f = (Float) iwp.mo3143a(CaptureResult.LENS_FOCUS_DISTANCE);
        Integer num2 = (Integer) this.characteristics.mo1913a(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
        if (!(f == null || num2 == null || (num2.intValue() != 2 && num2.intValue() != 1))) {
            frameMetadata.setFocus_distance_diopters(f.floatValue());
        }
        f = (Float) iwp.mo3143a(CaptureResult.LENS_FOCAL_LENGTH);
        if (f != null) {
            frameMetadata.setFocal_length_mm(f.floatValue());
        }
        frameMetadata.setControl_mode(((Integer) iwp.mo3143a(CaptureResult.CONTROL_MODE)).intValue());
        AeMetadata aeMetadata = new AeMetadata();
        aeMetadata.setMode(((Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_MODE)).intValue());
        aeMetadata.setLock(((Boolean) iwp.mo3143a(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
        aeMetadata.setState(((Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_STATE)).intValue());
        num = (Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        if (num != null) {
            aeMetadata.setPrecapture_trigger(num.intValue());
        }
        aeMetadata.setExposure_compensation(getExposureCompensationStops(((Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
        appendMeteringRectanglesAsGcamWeightedPixelRects((MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AE_REGIONS), aeMetadata.getMetering_rectangles());
        frameMetadata.setAe(aeMetadata);
        AwbMetadata awbMetadata = new AwbMetadata();
        awbMetadata.setMode(((Integer) iwp.mo3143a(CaptureResult.CONTROL_AWB_MODE)).intValue());
        awbMetadata.setLock(((Boolean) iwp.mo3143a(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
        awbMetadata.setState(((Integer) iwp.mo3143a(CaptureResult.CONTROL_AWB_STATE)).intValue());
        appendMeteringRectanglesAsGcamWeightedPixelRects((MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AWB_REGIONS), awbMetadata.getMetering_rectangles());
        frameMetadata.setAwb(awbMetadata);
        AfMetadata afMetadata = new AfMetadata();
        afMetadata.setMode(((Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_MODE)).intValue());
        afMetadata.setState(((Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_STATE)).intValue());
        afMetadata.setTrigger(((Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
        appendMeteringRectanglesAsGcamWeightedPixelRects((MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AF_REGIONS), afMetadata.getMetering_rectangles());
        frameMetadata.setAf(afMetadata);
        num = (Integer) iwp.mo3143a(CaptureResult.LENS_STATE);
        if (num != null) {
            frameMetadata.setLens_state(num.intValue());
        }
        OisMetadata oisMetadata = new OisMetadata();
        if (!(hsz.f6614h == null || hsz.f6615i == null)) {
            oisMetadata.setTimestamp_ois_clock_ns(((Long) iwp.mo3143a(hsz.f6614h)).longValue());
            long[] jArr = (long[]) iwp.mo3143a(hsz.f6615i);
            int length;
            int length2;
            boolean z2;
            StringBuilder stringBuilder;
            int length3;
            StringBuilder stringBuilder2;
            OisPositionVector oisPositionVector;
            OisPosition oisPosition;
            if (ExperimentalKeys.getLibraryVersion() >= 3 && hsz.f6618l != null && hsz.f6619m != null) {
                fArr = (float[]) iwp.mo3143a(hsz.f6618l);
                analogAndDigitalGain = (float[]) iwp.mo3143a(hsz.f6619m);
                length = jArr.length;
                length2 = fArr.length;
                if (length == length2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                stringBuilder = new StringBuilder(95);
                stringBuilder.append("The length of shiftPixelX (");
                stringBuilder.append(length2);
                stringBuilder.append(") should equal the length of oisTimestamps (");
                stringBuilder.append(length);
                stringBuilder.append(").");
                jri.m13144a(z2, stringBuilder.toString());
                length3 = analogAndDigitalGain.length;
                if (length != length3) {
                    z = false;
                }
                stringBuilder2 = new StringBuilder(95);
                stringBuilder2.append("The length of shiftPixelY (");
                stringBuilder2.append(length3);
                stringBuilder2.append(") should equal the length of oisTimestamps (");
                stringBuilder2.append(length);
                stringBuilder2.append(").");
                jri.m13144a(z, stringBuilder2.toString());
                oisPositionVector = new OisPositionVector();
                while (i < jArr.length) {
                    oisPosition = new OisPosition();
                    oisPosition.setTimestamp_ns(jArr[i]);
                    oisPosition.setShift_pixel_x(fArr[i]);
                    oisPosition.setShift_pixel_y(analogAndDigitalGain[i]);
                    oisPositionVector.add(oisPosition);
                    i++;
                }
                oisMetadata.setOis_positions(oisPositionVector);
            } else if (!(hsz.f6616j == null || hsz.f6617k == null)) {
                int[] iArr = (int[]) iwp.mo3143a(hsz.f6616j);
                int[] iArr2 = (int[]) iwp.mo3143a(hsz.f6617k);
                length = jArr.length;
                length2 = iArr.length;
                if (length == length2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                stringBuilder = new StringBuilder(93);
                stringBuilder.append("The length of shiftRawX (");
                stringBuilder.append(length2);
                stringBuilder.append(") should equal the length of oisTimestamps (");
                stringBuilder.append(length);
                stringBuilder.append(").");
                jri.m13144a(z2, stringBuilder.toString());
                length3 = iArr2.length;
                if (length != length3) {
                    z = false;
                }
                stringBuilder2 = new StringBuilder(93);
                stringBuilder2.append("The length of shiftRawY (");
                stringBuilder2.append(length3);
                stringBuilder2.append(") should equal the length of oisTimestamps (");
                stringBuilder2.append(length);
                stringBuilder2.append(").");
                jri.m13144a(z, stringBuilder2.toString());
                oisPositionVector = new OisPositionVector();
                while (i < jArr.length) {
                    oisPosition = new OisPosition();
                    oisPosition.setTimestamp_ns(jArr[i]);
                    oisPosition.setShift_pixel_x(((float) iArr[i]) * -0.007517f);
                    oisPosition.setShift_pixel_y(((float) iArr2[i]) * -0.00733f);
                    oisPositionVector.add(oisPosition);
                    i++;
                }
                oisMetadata.setOis_positions(oisPositionVector);
            }
        }
        frameMetadata.setOis_metadata(oisMetadata);
        if (hsz.f6620n != null) {
            frameMetadata.setExposure_time_boost(((Float) iwp.mo3143a(hsz.f6620n)).floatValue());
        }
        if (gyroSampleVector != null) {
            frameMetadata.setGyro_samples(gyroSampleVector);
        }
        return frameMetadata;
    }

    public static StaticMetadata convertToGcamStaticMetadata(iun iun) {
        boolean z;
        int i;
        int intValue;
        int i2 = 0;
        StaticMetadata staticMetadata = new StaticMetadata();
        staticMetadata.setMake(Build.MANUFACTURER);
        staticMetadata.setModel(Build.MODEL);
        staticMetadata.setDevice(Build.DEVICE);
        String GetVersion = GcamModule.GetVersion();
        String valueOf = String.valueOf("HDR+ ");
        GetVersion = String.valueOf(GetVersion);
        if (GetVersion.length() == 0) {
            GetVersion = new String(valueOf);
        } else {
            GetVersion = valueOf.concat(GetVersion);
        }
        staticMetadata.setSoftware(GetVersion);
        staticMetadata.setDevice_os_version(Build.FINGERPRINT);
        staticMetadata.setSensor_id(getGcamSensorId(iun));
        staticMetadata.setHas_flash(iun.mo1939u());
        List<Float> a = iun.mo1915a();
        jri.m13144a(a.isEmpty() ^ 1, (Object) "Cameras must have at least one focal length.");
        FloatVector floatVector = new FloatVector();
        for (Float floatValue : a) {
            floatVector.add(floatValue.floatValue());
        }
        staticMetadata.setAvailable_focal_lengths_mm(floatVector);
        if (r5 > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Cameras must have at least one f-number (aperture size).");
        FloatVector floatVector2 = new FloatVector();
        for (float add : (float[]) iun.mo1913a(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES)) {
            floatVector2.add(add);
        }
        staticMetadata.setAvailable_f_numbers(floatVector2);
        BlackLevelPattern blackLevelPattern = (BlackLevelPattern) iun.mo1913a(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
        if (blackLevelPattern != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "SENSOR_BLACK_LEVEL_PATTERN is required.");
        float[] fArr = new float[4];
        for (i = 0; i < 4; i++) {
            fArr[i] = (float) blackLevelPattern.getOffsetForIndex(i % 2, i / 2);
        }
        staticMetadata.setBlack_levels_bayer(fArr);
        staticMetadata.setWhite_level(((Integer) iun.mo1913a(CameraCharacteristics.SENSOR_INFO_WHITE_LEVEL)).intValue());
        Rect[] rectArr = (Rect[]) iun.mo1913a(CameraCharacteristics.SENSOR_OPTICAL_BLACK_REGIONS);
        if (rectArr != null) {
            PixelRectVector pixelRectVector = new PixelRectVector();
            for (Rect rect : rectArr) {
                PixelRect pixelRect = new PixelRect();
                pixelRect.setX0(rect.left);
                pixelRect.setX1(rect.right);
                pixelRect.setY0(rect.top);
                pixelRect.setY1(rect.bottom);
                pixelRectVector.add(pixelRect);
            }
            staticMetadata.setOptically_black_regions(pixelRectVector);
        }
        staticMetadata.setBayer_pattern(convertToBayerPattern(((Integer) iun.mo1913a(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue()));
        int[] iArr = new int[]{((Integer) ((Range) iun.mo1913a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue(), ((Integer) ((Range) iun.mo1913a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getUpper()).intValue()};
        int intValue2 = ((Integer) iun.mo1913a(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY)).intValue();
        staticMetadata.setIso_range(iArr);
        staticMetadata.setMax_analog_iso(intValue2);
        DngColorCalibrationVector dngColorCalibrationVector = new DngColorCalibrationVector();
        Integer num = (Integer) iun.mo1913a(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT1);
        if (num != null) {
            float[] convertToFloatArray = convertToFloatArray((ColorSpaceTransform) iun.mo1913a(CameraCharacteristics.SENSOR_COLOR_TRANSFORM1));
            float[] convertToFloatArray2 = convertToFloatArray((ColorSpaceTransform) iun.mo1913a(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM1));
            DngColorCalibration dngColorCalibration = new DngColorCalibration();
            dngColorCalibration.setIlluminant(num.intValue());
            dngColorCalibration.setXyz_to_model_rgb(convertToFloatArray);
            dngColorCalibration.setModel_rgb_to_device_rgb(convertToFloatArray2);
            dngColorCalibrationVector.add(dngColorCalibration);
        }
        Byte b = (Byte) iun.mo1913a(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT2);
        if (b != null) {
            convertToFloatArray = convertToFloatArray((ColorSpaceTransform) iun.mo1913a(CameraCharacteristics.SENSOR_COLOR_TRANSFORM2));
            convertToFloatArray2 = convertToFloatArray((ColorSpaceTransform) iun.mo1913a(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM2));
            dngColorCalibration = new DngColorCalibration();
            dngColorCalibration.setIlluminant(b.byteValue());
            dngColorCalibration.setXyz_to_model_rgb(convertToFloatArray);
            dngColorCalibration.setModel_rgb_to_device_rgb(convertToFloatArray2);
            dngColorCalibrationVector.add(dngColorCalibration);
        }
        staticMetadata.setDng_color_calibration(dngColorCalibrationVector);
        QcColorCalibration qcColorCalibration = new QcColorCalibration();
        if (hsz.f6628v != null) {
            intValue = ((Integer) iun.mo1913a(ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_NUM_LIGHTS)).intValue();
            Log.v(TAG, String.format("EEPROM_WB_CALIB is available, found %d illuminants", new Object[]{Integer.valueOf(intValue)}));
            if (intValue > 0) {
                float[] fArr2 = (float[]) iun.mo1913a(ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_R_OVER_G_RATIOS);
                convertToFloatArray2 = (float[]) iun.mo1913a(ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_B_OVER_G_RATIOS);
                if (fArr2.length == intValue && convertToFloatArray2.length == intValue) {
                    QcIlluminantVector qcIlluminantVector = new QcIlluminantVector();
                    while (i2 < intValue) {
                        IlluminantData illuminantData = new IlluminantData();
                        illuminantData.setRg_ratio(fArr2[i2]);
                        illuminantData.setBg_ratio(convertToFloatArray2[i2]);
                        qcIlluminantVector.add(illuminantData);
                        i2++;
                    }
                    qcColorCalibration.setIlluminant_data(qcIlluminantVector);
                } else {
                    Log.w(TAG, "The r/g and b/g ratio data is corrupted");
                }
            } else {
                Log.w(TAG, "EEPROM_WB_CALIB available, but has no calibrated illuminants");
            }
        } else {
            Log.d(TAG, "EEPROM_WB_CALIB is not available");
        }
        if (hsz.f6631y != null) {
            qcColorCalibration.setGrgb_ratio(((Float) iun.mo1913a(hsz.f6631y)).floatValue());
        } else {
            Log.d(TAG, "EEPROM_WB_CALIB_GR_OVER_GB_RATIO is not available");
        }
        staticMetadata.setQc_color_calibration(qcColorCalibration);
        SizeF sizeF = (SizeF) iun.mo1918b(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        staticMetadata.setSensor_physical_width_mm(sizeF.getWidth());
        staticMetadata.setSensor_physical_height_mm(sizeF.getHeight());
        Size size = (Size) iun.mo1918b(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        staticMetadata.setPixel_array_width(size.getWidth());
        staticMetadata.setPixel_array_height(size.getHeight());
        Rect rect2 = (Rect) iun.mo1918b(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        PixelRect pixelRect2 = new PixelRect();
        pixelRect2.setX0(rect2.left);
        pixelRect2.setX1(rect2.right);
        pixelRect2.setY0(rect2.top);
        pixelRect2.setY1(rect2.bottom);
        staticMetadata.setActive_area(pixelRect2);
        ive gcamRawFormat = getGcamRawFormat(iun);
        staticMetadata.setFrame_raw_max_width(gcamRawFormat.f7495b.f7329a);
        staticMetadata.setFrame_raw_max_height(gcamRawFormat.f7495b.f7330b);
        staticMetadata.setRaw_bits_per_pixel(ImageFormat.getBitsPerPixel(gcamRawFormat.f7494a));
        staticMetadata.setFrame_readout_time_ms(nsToMsFloat(iun.mo1912a(gcamRawFormat.f7494a, gcamRawFormat.f7495b)));
        return staticMetadata;
    }

    public NormalizedRect convertToNormalizedRect(Rect rect) {
        NormalizedRect normalizedRect = new NormalizedRect();
        float width = 1.0f / ((float) this.sensorActiveArraySize.width());
        float height = 1.0f / ((float) this.sensorActiveArraySize.height());
        normalizedRect.setX0(((float) rect.left) * width);
        normalizedRect.setY0(((float) rect.top) * height);
        normalizedRect.setX1(width * ((float) rect.right));
        normalizedRect.setY1(((float) rect.bottom) * height);
        return normalizedRect;
    }

    public SpatialGainMap convertToSpatialGainMap(iwp iwp) {
        LensShadingMap lensShadingMap = (LensShadingMap) iwp.mo3143a(CaptureResult.STATISTICS_LENS_SHADING_CORRECTION_MAP);
        if (lensShadingMap == null) {
            Log.w(TAG, "android.statistics.lensShadingMap was null, returning the empty SpatialGainMap()");
            return new SpatialGainMap();
        }
        int columnCount = lensShadingMap.getColumnCount();
        int rowCount = lensShadingMap.getRowCount();
        SpatialGainMap spatialGainMap = new SpatialGainMap(columnCount, rowCount, true, false);
        int[] evenOddSourceIndicesForCfa = getEvenOddSourceIndicesForCfa(((Integer) this.characteristics.mo1913a(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue());
        for (int i = 0; i < 4; i++) {
            int i2 = evenOddSourceIndicesForCfa[i];
            for (int i3 = 0; i3 < rowCount; i3++) {
                for (int i4 = 0; i4 < columnCount; i4++) {
                    spatialGainMap.WriteRggb(i4, i3, i, lensShadingMap.getGainFactor(i2, i4, i3));
                }
            }
        }
        return spatialGainMap;
    }

    public float[] getAnalogAndDigitalGain(iwp iwp) {
        float max;
        float f;
        int intValue = ((Integer) ((Range) this.characteristics.mo1913a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue();
        int intValue2 = ((Integer) this.characteristics.mo1913a(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY)).intValue();
        int intValue3 = ((Integer) iwp.mo3143a(CaptureResult.SENSOR_SENSITIVITY)).intValue();
        if (intValue3 > intValue2) {
            float f2 = (float) intValue2;
            float f3 = f2 / ((float) intValue);
            max = Math.max(((float) intValue3) / f2, 1.0f);
            f = f3;
        } else {
            f = ((float) intValue3) / ((float) intValue);
            max = 1.0f;
        }
        return new float[]{f, max};
    }

    private float[] getAwbGains(iwp iwp) {
        boolean z;
        int i = 0;
        RggbChannelVector rggbChannelVector = (RggbChannelVector) iwp.mo3143a(CaptureResult.COLOR_CORRECTION_GAINS);
        if (rggbChannelVector != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "CaptureResult missing CaptureResult.COLOR_CORRECTION_GAINS.");
        float[] fArr = new float[4];
        while (i < 4) {
            fArr[i] = rggbChannelVector.getComponent(this.evenOddIndexMap[i]);
            i++;
        }
        return fArr;
    }

    public AwbInfo getAwbInfoCaptured(iwp iwp) {
        AwbInfo awbInfo = new AwbInfo();
        awbInfo.setColor_temp(DUMMY_COLOR_TEMPERATURE);
        awbInfo.setGains(getAwbGains(iwp));
        awbInfo.setRgb2rgb(getAwbRgb2Rgb(iwp));
        return awbInfo;
    }

    private static float[] getAwbRgb2Rgb(iwp iwp) {
        boolean z;
        ColorSpaceTransform colorSpaceTransform = (ColorSpaceTransform) iwp.mo3143a(CaptureResult.COLOR_CORRECTION_TRANSFORM);
        if (colorSpaceTransform != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "CaptureResult missing CaptureResult.COLOR_CORRECTION_TRANSFORM.");
        return convertToFloatArray(colorSpaceTransform);
    }

    private static int[] getEvenOddSourceIndicesForCfa(int i) {
        switch (i) {
            case 0:
            case 1:
                return new int[]{0, 1, 2, 3};
            case 2:
            case 3:
                return new int[]{0, 2, 1, 3};
            default:
                throw new IllegalArgumentException("CameraCharacteristics: unsupported colorFilterArrangment");
        }
    }

    public float getExposureCompensationStops(int i) {
        Rational rational = (Rational) this.characteristics.mo1913a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        return new Rational(rational.getNumerator() * i, rational.getDenominator()).floatValue();
    }

    public static float getExposureTimeMs(iwp iwp) {
        return nsToMsFloat(((Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue());
    }

    public static ive getGcamRawFormat(iun iun) {
        List b = iun.mo1920b(37);
        List b2 = iun.mo1920b(38);
        List b3 = iun.mo1920b(32);
        if (!b.isEmpty()) {
            return new ive(37, ion.m3940a(b));
        }
        if (!b2.isEmpty()) {
            return new ive(38, ion.m3940a(b2));
        }
        if (!b3.isEmpty()) {
            return new ive(32, ion.m3940a(b3));
        }
        throw new IllegalArgumentException("No HDR+ compatible raw format supported.");
    }

    public static int getGcamSensorId(iun iun) {
        Object obj = (Integer) iun.mo1913a(CameraCharacteristics.LENS_FACING);
        jri.m13152b(obj);
        return obj.intValue() == 1 ? 0 : 1;
    }

    private static int[] getRedBlueSourceIndicesForCfa(int i) {
        return getEvenOddSourceIndicesForCfa(i);
    }

    public float getTotalExposureTime(iwp iwp) {
        return (((float) ((Integer) iwp.mo3143a(CaptureResult.SENSOR_SENSITIVITY)).intValue()) / ((float) ((Integer) ((Range) this.characteristics.mo1913a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue())) * nsToMsFloat(((Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue());
    }

    public static long msFloatToNs(float f) {
        return (long) (1000000.0f * f);
    }

    public static float nsToMsFloat(long j) {
        return ((float) j) / 1000000.0f;
    }

    public void updateAeShotParams(AeShotParams aeShotParams, Rect rect, MeteringRectangle[] meteringRectangleArr, iqp iqp) {
        Rect a = ipz.m4019b(iqp).m4022a(rect);
        aeShotParams.setCrop(convertToNormalizedRect(a));
        convertMeteringRectanglesToGcamWeightedRects(meteringRectangleArr, a, aeShotParams.getWeighted_metering_areas());
    }

    public void updateFromFrameRequest(FrameRequest frameRequest, itj itj) {
        float desired_exposure_time_ms = frameRequest.getDesired_exposure_time_ms();
        frameRequest.getDesired_analog_gain();
        frameRequest.getDesired_digital_gain();
        itj.m4208a();
        itj.m4208a();
        msFloatToNs(desired_exposure_time_ms);
        itj.m4208a();
        itj.m4208a();
        itj.m4208a();
        frameRequest.getTry_to_lock_black_level();
        itj.m4208a();
        itj.m4208a();
        itj.m4208a();
        AwbInfo awb = frameRequest.getAwb();
        float[] gains = awb.getGains();
        int[] iArr = this.redBlueIndexMap;
        RggbChannelVector rggbChannelVector = new RggbChannelVector(gains[iArr[0]], gains[iArr[1]], gains[iArr[2]], gains[iArr[3]]);
        itj.m4208a();
        convertToColorSpaceTransform(awb.getRgb2rgb());
        itj.m4208a();
        itj.m4208a();
        itj.m4208a();
        itj.m4208a();
        itj.m4208a();
    }
}

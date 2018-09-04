package p000;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult.Key;
import android.hardware.camera2.params.BlackLevelPattern;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.LensShadingMap;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.RggbChannelVector;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import com.google.android.camera.experimental2017.ExperimentalKeys;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.googlex.gcam.AeMetadata;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AfMetadata;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.AwbMetadata;
import com.google.googlex.gcam.DngColorCalibration;
import com.google.googlex.gcam.DngColorCalibrationVector;
import com.google.googlex.gcam.DngNoiseModel;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.FaceInfo;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.FloatSmoothKeyValueMap;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.GoudaRequest;
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
import com.google.googlex.gcam.hdrplus.MetadataConverter;
import java.util.Arrays;
import java.util.List;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bya */
public final class bya {
    /* renamed from: b */
    private static final String f1712b = bli.m862a("HdrPMdataConv");
    /* renamed from: c */
    private static final boolean f1713c;
    /* renamed from: d */
    private static final int f1714d = GcamModule.getKColorTempUnknown();
    /* renamed from: a */
    public final ffc f1715a;
    /* renamed from: e */
    private final int f1716e;

    static {
        boolean z = false;
        if (fgw.m2279f().m2283a("persist.gcam.sm.log", false)) {
            z = true;
        } else if (!fgw.m2279f().m2283a("persist.gcam.sm.enabled", true)) {
            z = true;
        }
        f1713c = z;
    }

    public bya(ffc ffc) {
        this.f1715a = ffc;
        this.f1716e = ffc.mo1927i().f7487d;
    }

    /* renamed from: a */
    private static void m1045a(MeteringRectangle[] meteringRectangleArr, WeightedPixelRectVector weightedPixelRectVector) {
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

    /* renamed from: a */
    public static int m1042a(fxi fxi) {
        if (fxi == fxi.AUTO) {
            return 0;
        }
        if (fxi == fxi.ON) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static float[] m1046a(ColorSpaceTransform colorSpaceTransform) {
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

    /* renamed from: a */
    public final FrameMetadata m1050a(iwp iwp, Face[] faceArr, GyroSampleVector gyroSampleVector) {
        float f;
        float max;
        FrameMetadata frameMetadata = new FrameMetadata();
        frameMetadata.setSensor_id(bya.m1047b(this.f1715a));
        long longValue = ((Long) jri.m13152b((Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME))).longValue();
        if (f1713c) {
            String str = f1712b;
            StringBuilder stringBuilder = new StringBuilder(53);
            stringBuilder.append("getExposureTimeMs - exposure ns: ");
            stringBuilder.append(longValue);
            bli.m871d(str, stringBuilder.toString());
        }
        frameMetadata.setActual_exposure_time_ms(((float) longValue) / 1000000.0f);
        int intValue = ((Integer) ((Range) jri.m13152b((Range) this.f1715a.mo1913a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE))).getLower()).intValue();
        int intValue2 = ((Integer) jri.m13152b((Integer) this.f1715a.mo1913a(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY))).intValue();
        int intValue3 = ((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.SENSOR_SENSITIVITY))).intValue();
        if (intValue3 > intValue2) {
            float f2 = (float) intValue2;
            f = f2 / ((float) intValue);
            max = Math.max(((float) intValue3) / f2, 1.0f);
        } else {
            f = ((float) intValue3) / ((float) intValue);
            max = 1.0f;
        }
        if (f1713c) {
            str = f1712b;
            stringBuilder = new StringBuilder(91);
            stringBuilder.append("getAnalogAndDigitalGain - actual analog gain: ");
            stringBuilder.append(f);
            stringBuilder.append(" digital gain: ");
            stringBuilder.append(max);
            bli.m871d(str, stringBuilder.toString());
        }
        float[] fArr = new float[]{f, max};
        frameMetadata.setActual_analog_gain(fArr[0]);
        frameMetadata.setApplied_digital_gain(fArr[1]);
        Integer num = (Integer) iwp.mo3143a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
        if (num != null) {
            frameMetadata.setPost_raw_digital_gain(((float) num.intValue()) / 100.0f);
        }
        intValue3 = ((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.FLASH_MODE))).intValue();
        if (intValue3 == 1 || intValue3 == 2) {
            frameMetadata.setFlash(1);
        } else {
            frameMetadata.setFlash(0);
        }
        frameMetadata.setSharpness(0.0f);
        frameMetadata.setWb(m1054b(iwp));
        Rational[] rationalArr = (Rational[]) jri.m13152b((Rational[]) iwp.mo3143a(CaptureResult.SENSOR_NEUTRAL_COLOR_POINT));
        frameMetadata.setNeutral_point(new float[]{rationalArr[0].floatValue(), rationalArr[1].floatValue(), rationalArr[2].floatValue()});
        Boolean bool = (Boolean) iwp.mo3143a(CaptureResult.BLACK_LEVEL_LOCK);
        if (bool == null) {
            bool = Boolean.valueOf(false);
        }
        frameMetadata.setWas_black_level_locked(bool.booleanValue());
        longValue = ((Long) jri.m13152b((Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP))).longValue();
        frameMetadata.setTimestamp_ns(longValue);
        if (f1713c) {
            str = f1712b;
            stringBuilder = new StringBuilder(67);
            stringBuilder.append("Captured AWB for metadata result timestamp: ");
            stringBuilder.append(longValue);
            stringBuilder.append(" ns");
            bli.m871d(str, stringBuilder.toString());
        }
        Face[] faceArr2 = (Face[]) iwp.mo3143a(CaptureResult.STATISTICS_FACES);
        if (!(faceArr2 == null || faceArr2.length == 0)) {
            faceArr = faceArr2;
        }
        FaceInfoVector faces = frameMetadata.getFaces();
        Rect rect = (Rect) jri.m13152b((Rect) this.f1715a.mo1913a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
        int width = rect.width();
        int height = rect.height();
        if (faceArr != null) {
            for (intValue = 0; intValue < faceArr.length; intValue++) {
                Rect bounds = faceArr[intValue].getBounds();
                max = (float) width;
                float exactCenterX = bounds.exactCenterX() / max;
                float f3 = (float) height;
                float exactCenterY = bounds.exactCenterY() / f3;
                float width2 = ((float) (bounds.width() + bounds.height())) / 2.0f;
                if (width > height) {
                    max = width2 / max;
                } else {
                    max = width2 / f3;
                }
                f3 = ((float) (faceArr[intValue].getScore() - 1)) / 99.0f;
                if (exactCenterX < 0.0f || exactCenterX > 1.0f || exactCenterY > 1.0f || exactCenterY < 0.0f || max < 0.0f || max > 1.0f || f3 < 0.0f || f3 > 1.0f) {
                    bli.m873e(f1712b, String.format("Face data is bad: (%d, %d) - (%d, %d), score %d", new Object[]{Integer.valueOf(bounds.left), Integer.valueOf(bounds.top), Integer.valueOf(bounds.right), Integer.valueOf(bounds.bottom), Integer.valueOf(faceArr[intValue].getScore())}));
                } else {
                    FaceInfo faceInfo = new FaceInfo();
                    faceInfo.setPos_x(exactCenterX);
                    faceInfo.setPos_y(exactCenterY);
                    faceInfo.setSize(max);
                    faceInfo.setConfidence(f3);
                    faces.add(faceInfo);
                }
            }
        }
        frameMetadata.setSensor_temp(GcamModule.getKSensorTempUnknown());
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
                    bli.m866b(f1712b, "Unexpected STATISTICS_SCENE_FLICKER type!");
                    break;
            }
        }
        Pair[] pairArr = (Pair[]) jri.m13152b((Pair[]) iwp.mo3143a(CaptureResult.SENSOR_NOISE_PROFILE));
        DngNoiseModel[] dngNoiseModelArr = new DngNoiseModel[4];
        for (intValue2 = 0; intValue2 < 4; intValue2++) {
            dngNoiseModelArr[intValue2] = new DngNoiseModel();
            dngNoiseModelArr[intValue2].setScale(((Double) pairArr[intValue2].first).floatValue());
            dngNoiseModelArr[intValue2].setOffset(((Double) pairArr[intValue2].second).floatValue());
        }
        frameMetadata.setDng_noise_model_bayer(dngNoiseModelArr);
        float[] fArr2 = (float[]) iwp.mo3143a(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
        if (fArr2 != null) {
            frameMetadata.setBlack_levels_bayer(fArr2);
        } else {
            BlackLevelPattern blackLevelPattern = (BlackLevelPattern) jri.m13152b((BlackLevelPattern) this.f1715a.mo1913a(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN));
            fArr = new float[4];
            for (intValue = 0; intValue < 4; intValue++) {
                fArr[intValue] = (float) blackLevelPattern.getOffsetForIndex(intValue % 2, intValue / 2);
            }
            frameMetadata.setBlack_levels_bayer(fArr);
        }
        Float f4 = (Float) iwp.mo3143a(CaptureResult.LENS_FOCUS_DISTANCE);
        Integer num2 = (Integer) this.f1715a.mo1913a(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
        if (!(f4 == null || num2 == null || (num2.intValue() != 2 && num2.intValue() != 1))) {
            frameMetadata.setFocus_distance_diopters(f4.floatValue());
        }
        f4 = (Float) iwp.mo3143a(CaptureResult.LENS_FOCAL_LENGTH);
        if (f4 != null) {
            frameMetadata.setFocal_length_mm(f4.floatValue());
        }
        frameMetadata.setControl_mode(((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_MODE))).intValue());
        AeMetadata aeMetadata = new AeMetadata();
        aeMetadata.setMode(((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_MODE))).intValue());
        aeMetadata.setLock(((Boolean) jri.m13152b((Boolean) iwp.mo3143a(CaptureResult.CONTROL_AE_LOCK))).booleanValue());
        aeMetadata.setState(((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_STATE))).intValue());
        num = (Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        if (num != null) {
            aeMetadata.setPrecapture_trigger(num.intValue());
        }
        aeMetadata.setExposure_compensation(m1049a(((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION))).intValue()));
        bya.m1045a((MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AE_REGIONS), aeMetadata.getMetering_rectangles());
        frameMetadata.setAe(aeMetadata);
        AwbMetadata awbMetadata = new AwbMetadata();
        awbMetadata.setMode(((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AWB_MODE))).intValue());
        awbMetadata.setLock(((Boolean) jri.m13152b((Boolean) iwp.mo3143a(CaptureResult.CONTROL_AWB_LOCK))).booleanValue());
        awbMetadata.setState(((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AWB_STATE))).intValue());
        bya.m1045a((MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AWB_REGIONS), awbMetadata.getMetering_rectangles());
        frameMetadata.setAwb(awbMetadata);
        AfMetadata afMetadata = new AfMetadata();
        afMetadata.setMode(((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_MODE))).intValue());
        afMetadata.setState(((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_STATE))).intValue());
        afMetadata.setTrigger(((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_TRIGGER))).intValue());
        bya.m1045a((MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AF_REGIONS), afMetadata.getMetering_rectangles());
        frameMetadata.setAf(afMetadata);
        num = (Integer) iwp.mo3143a(CaptureResult.LENS_STATE);
        if (num != null) {
            frameMetadata.setLens_state(num.intValue());
        }
        OisMetadata oisMetadata = new OisMetadata();
        if (!(hsz.f6614h == null || hsz.f6615i == null)) {
            oisMetadata.setTimestamp_ois_clock_ns(((Long) jri.m13152b((Long) iwp.mo3143a(hsz.f6614h))).longValue());
            long[] jArr = (long[]) jri.m13152b((long[]) iwp.mo3143a(hsz.f6615i));
            int length;
            int length2;
            boolean z;
            StringBuilder stringBuilder2;
            OisPositionVector oisPositionVector;
            OisPosition oisPosition;
            if (ExperimentalKeys.getLibraryVersion() >= 3 && hsz.f6618l != null && hsz.f6619m != null) {
                fArr = (float[]) jri.m13152b((float[]) iwp.mo3143a(hsz.f6618l));
                fArr2 = (float[]) jri.m13152b((float[]) iwp.mo3143a(hsz.f6619m));
                length = jArr.length;
                length2 = fArr.length;
                if (length == length2) {
                    z = true;
                } else {
                    z = false;
                }
                stringBuilder2 = new StringBuilder(95);
                stringBuilder2.append("The length of shiftPixelX (");
                stringBuilder2.append(length2);
                stringBuilder2.append(") should equal the length of oisTimestamps (");
                stringBuilder2.append(length);
                stringBuilder2.append(").");
                jri.m13144a(z, stringBuilder2.toString());
                length2 = fArr2.length;
                if (length == length2) {
                    z = true;
                } else {
                    z = false;
                }
                stringBuilder2 = new StringBuilder(95);
                stringBuilder2.append("The length of shiftPixelY (");
                stringBuilder2.append(length2);
                stringBuilder2.append(") should equal the length of oisTimestamps (");
                stringBuilder2.append(length);
                stringBuilder2.append(").");
                jri.m13144a(z, stringBuilder2.toString());
                oisPositionVector = new OisPositionVector();
                for (width = 0; width < jArr.length; width++) {
                    oisPosition = new OisPosition();
                    oisPosition.setTimestamp_ns(jArr[width]);
                    oisPosition.setShift_pixel_x(fArr[width]);
                    oisPosition.setShift_pixel_y(fArr2[width]);
                    oisPositionVector.add(oisPosition);
                }
                oisMetadata.setOis_positions(oisPositionVector);
            } else if (!(hsz.f6616j == null || hsz.f6617k == null)) {
                int[] iArr = (int[]) jri.m13152b((int[]) iwp.mo3143a(hsz.f6616j));
                int[] iArr2 = (int[]) jri.m13152b((int[]) iwp.mo3143a(hsz.f6617k));
                length = jArr.length;
                length2 = iArr.length;
                if (length == length2) {
                    z = true;
                } else {
                    z = false;
                }
                stringBuilder2 = new StringBuilder(93);
                stringBuilder2.append("The length of shiftRawX (");
                stringBuilder2.append(length2);
                stringBuilder2.append(") should equal the length of oisTimestamps (");
                stringBuilder2.append(length);
                stringBuilder2.append(").");
                jri.m13144a(z, stringBuilder2.toString());
                length2 = iArr2.length;
                if (length == length2) {
                    z = true;
                } else {
                    z = false;
                }
                stringBuilder2 = new StringBuilder(93);
                stringBuilder2.append("The length of shiftRawY (");
                stringBuilder2.append(length2);
                stringBuilder2.append(") should equal the length of oisTimestamps (");
                stringBuilder2.append(length);
                stringBuilder2.append(").");
                jri.m13144a(z, stringBuilder2.toString());
                oisPositionVector = new OisPositionVector();
                for (width = 0; width < jArr.length; width++) {
                    oisPosition = new OisPosition();
                    oisPosition.setTimestamp_ns(jArr[width]);
                    oisPosition.setShift_pixel_x(((float) iArr[width]) * -0.007517f);
                    oisPosition.setShift_pixel_y(((float) iArr2[width]) * -0.00733f);
                    oisPositionVector.add(oisPosition);
                }
                oisMetadata.setOis_positions(oisPositionVector);
            }
        }
        frameMetadata.setOis_metadata(oisMetadata);
        if (hsz.f6620n != null) {
            frameMetadata.setExposure_time_boost(((Float) jri.m13152b((Float) iwp.mo3143a(hsz.f6620n))).floatValue());
        }
        if (gyroSampleVector != null) {
            frameMetadata.setGyro_samples(gyroSampleVector);
        }
        return frameMetadata;
    }

    /* renamed from: a */
    public static GoudaRequest m1043a(FloatSmoothKeyValueMap floatSmoothKeyValueMap, int i, int i2, ExifMetadata exifMetadata, int i3, fvj fvj, iqp iqp, boolean z, boolean z2, kbg kbg) {
        int i4;
        GoudaRequest goudaRequest = new GoudaRequest();
        switch (i3) {
            case 0:
                i4 = 3;
                break;
            case 90:
                i4 = 2;
                break;
            case MediaDecoder.ROTATE_180 /*180*/:
                i4 = 1;
                break;
            case MediaDecoder.ROTATE_90_LEFT /*270*/:
                i4 = 0;
                break;
            default:
                i4 = 3;
                break;
        }
        goudaRequest.setImage_rotation(i4);
        PixelRectVector pixelRectVector = new PixelRectVector();
        Rect rect = fvj.f4733b;
        float f = (float) i;
        float width = f / ((float) rect.width());
        float height = ((float) i2) / ((float) rect.height());
        Face[] faceArr = fvj.f4732a;
        for (Face bounds : faceArr) {
            Rect bounds2 = bounds.getBounds();
            PixelRect pixelRect = new PixelRect();
            pixelRect.setX0((int) (((float) (bounds2.left - rect.left)) * width));
            pixelRect.setY0((int) (((float) (bounds2.top - rect.top)) * height));
            pixelRect.setX1((int) (((float) (bounds2.right - rect.left)) * width));
            pixelRect.setY1((int) (((float) (bounds2.bottom - rect.top)) * height));
            pixelRectVector.add(pixelRect);
        }
        goudaRequest.setFaces(pixelRectVector);
        i4 = iqp.f7329a;
        int i5 = iqp.f7330b;
        goudaRequest.setOutput_width(i4);
        goudaRequest.setOutput_height(i5);
        goudaRequest.setFrame_metadata(exifMetadata.getFrame_metadata());
        goudaRequest.setStatic_metadata(exifMetadata.getStatic_metadata());
        goudaRequest.setPost_resample_sharpening(floatSmoothKeyValueMap.Get(((float) i4) / f));
        if (z && kbg.mo2084b() && !z2) {
            goudaRequest.setOutput_format_primary(1);
        } else {
            goudaRequest.setOutput_format_primary(3);
        }
        return goudaRequest;
    }

    /* renamed from: a */
    public static StaticMetadata m1044a(ffc ffc) {
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
        staticMetadata.setSensor_id(bya.m1047b(ffc));
        staticMetadata.setHas_flash(Boolean.valueOf(ffc.mo1939u()).booleanValue());
        List<Float> a = ffc.mo1915a();
        if (a.size() <= 0) {
            throw new AssertionError("No focal lengths defined!");
        }
        FloatVector floatVector = new FloatVector();
        for (Float floatValue : a) {
            floatVector.add(floatValue.floatValue());
        }
        staticMetadata.setAvailable_focal_lengths_mm(floatVector);
        if (r7 <= 0) {
            throw new AssertionError("No aperture values defined!");
        }
        int i;
        int i2;
        QcColorCalibration qcColorCalibration;
        FloatVector floatVector2 = new FloatVector();
        for (float add : (float[]) jri.m13152b((float[]) ffc.mo1913a(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES))) {
            floatVector2.add(add);
        }
        staticMetadata.setAvailable_f_numbers(floatVector2);
        BlackLevelPattern blackLevelPattern = (BlackLevelPattern) jri.m13152b((BlackLevelPattern) ffc.mo1913a(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN));
        float[] fArr = new float[4];
        for (i = 0; i < 4; i++) {
            fArr[i] = (float) blackLevelPattern.getOffsetForIndex(i % 2, i / 2);
        }
        staticMetadata.setBlack_levels_bayer(fArr);
        staticMetadata.setWhite_level(((Integer) jri.m13152b((Integer) ffc.mo1913a(CameraCharacteristics.SENSOR_INFO_WHITE_LEVEL))).intValue());
        Rect[] rectArr = (Rect[]) ffc.mo1913a(CameraCharacteristics.SENSOR_OPTICAL_BLACK_REGIONS);
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
        switch (((Integer) jri.m13152b((Integer) ffc.mo1913a(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT))).intValue()) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 4;
                break;
            case 3:
                i2 = 2;
                break;
            default:
                throw new IllegalArgumentException("staticInfo: unsupported BayerPattern");
        }
        staticMetadata.setBayer_pattern(i2);
        int[] iArr = new int[]{((Integer) ((Range) jri.m13152b((Range) ffc.mo1913a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE))).getLower()).intValue(), ((Integer) ((Range) jri.m13152b((Range) ffc.mo1913a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE))).getUpper()).intValue()};
        i2 = ((Integer) jri.m13152b((Integer) ffc.mo1913a(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY))).intValue();
        staticMetadata.setIso_range(iArr);
        staticMetadata.setMax_analog_iso(i2);
        DngColorCalibrationVector dngColorCalibrationVector = new DngColorCalibrationVector();
        Integer num = (Integer) ffc.mo1913a(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT1);
        if (num != null) {
            float[] a2 = bya.m1046a((ColorSpaceTransform) jri.m13152b((ColorSpaceTransform) ffc.mo1913a(CameraCharacteristics.SENSOR_COLOR_TRANSFORM1)));
            float[] a3 = bya.m1046a((ColorSpaceTransform) jri.m13152b((ColorSpaceTransform) ffc.mo1913a(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM1)));
            DngColorCalibration dngColorCalibration = new DngColorCalibration();
            dngColorCalibration.setIlluminant(num.intValue());
            dngColorCalibration.setXyz_to_model_rgb(a2);
            dngColorCalibration.setModel_rgb_to_device_rgb(a3);
            dngColorCalibrationVector.add(dngColorCalibration);
        }
        Byte b = (Byte) ffc.mo1913a(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT2);
        if (b != null) {
            a2 = bya.m1046a((ColorSpaceTransform) jri.m13152b((ColorSpaceTransform) ffc.mo1913a(CameraCharacteristics.SENSOR_COLOR_TRANSFORM2)));
            a3 = bya.m1046a((ColorSpaceTransform) jri.m13152b((ColorSpaceTransform) ffc.mo1913a(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM2)));
            dngColorCalibration = new DngColorCalibration();
            dngColorCalibration.setIlluminant(b.byteValue());
            dngColorCalibration.setXyz_to_model_rgb(a2);
            dngColorCalibration.setModel_rgb_to_device_rgb(a3);
            dngColorCalibrationVector.add(dngColorCalibration);
        }
        staticMetadata.setDng_color_calibration(dngColorCalibrationVector);
        QcColorCalibration qcColorCalibration2 = new QcColorCalibration();
        try {
            if (hsz.f6628v != null) {
                i = ((Integer) jri.m13152b((Integer) ffc.mo1913a(hsz.f6628v))).intValue();
                bli.m871d(f1712b, String.format("EEPROM_WB_CALIB is available, found %d illuminants", new Object[]{Integer.valueOf(i)}));
                if (i > 0) {
                    float[] fArr2 = (float[]) jri.m13152b((float[]) ffc.mo1913a(hsz.f6629w));
                    a3 = (float[]) jri.m13152b((float[]) ffc.mo1913a(hsz.f6630x));
                    if (fArr2.length == i && a3.length == i) {
                        QcIlluminantVector qcIlluminantVector = new QcIlluminantVector();
                        for (int i3 = 0; i3 < i; i3++) {
                            IlluminantData illuminantData = new IlluminantData();
                            illuminantData.setRg_ratio(fArr2[i3]);
                            illuminantData.setBg_ratio(a3[i3]);
                            qcIlluminantVector.add(illuminantData);
                        }
                        qcColorCalibration2.setIlluminant_data(qcIlluminantVector);
                    } else {
                        bli.m873e(f1712b, "The r/g and b/g ratio data is corrupted");
                    }
                } else {
                    bli.m873e(f1712b, "EEPROM_WB_CALIB available, but has no calibrated illuminants");
                }
            } else {
                bli.m863a(f1712b, "EEPROM_WB_CALIB is not available");
            }
            if (hsz.f6631y != null) {
                qcColorCalibration2.setGrgb_ratio(((Float) jri.m13152b((Float) ffc.mo1913a(hsz.f6631y))).floatValue());
                qcColorCalibration = qcColorCalibration2;
            } else {
                bli.m863a(f1712b, "EEPROM_WB_CALIB_GR_OVER_GB_RATIO is not available");
                qcColorCalibration = qcColorCalibration2;
            }
        } catch (IllegalArgumentException e) {
            qcColorCalibration = new QcColorCalibration();
            bli.m873e(f1712b, "EEPROM_WB keys do not exist");
        }
        staticMetadata.setQc_color_calibration(qcColorCalibration);
        Size size = (Size) ffc.mo1918b(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        staticMetadata.setPixel_array_width(size.getWidth());
        staticMetadata.setPixel_array_height(size.getHeight());
        Rect rect2 = (Rect) ffc.mo1918b(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        PixelRect pixelRect2 = new PixelRect();
        pixelRect2.setX0(rect2.left);
        pixelRect2.setX1(rect2.right);
        pixelRect2.setY0(rect2.top);
        pixelRect2.setY1(rect2.bottom);
        staticMetadata.setActive_area(pixelRect2);
        ive a4 = bxe.m1035a(ffc);
        staticMetadata.setFrame_raw_max_width(a4.f7495b.f7329a);
        staticMetadata.setFrame_raw_max_height(a4.f7495b.f7330b);
        staticMetadata.setRaw_bits_per_pixel(ImageFormat.getBitsPerPixel(a4.f7494a));
        SizeF sizeF = (SizeF) ffc.mo1918b(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        staticMetadata.setSensor_physical_width_mm(sizeF.getWidth());
        staticMetadata.setSensor_physical_height_mm(sizeF.getHeight());
        staticMetadata.setFrame_readout_time_ms(((float) ffc.mo1912a(a4.f7494a, a4.f7495b)) / 1000000.0f);
        return staticMetadata;
    }

    /* renamed from: a */
    public final SpatialGainMap m1051a(iwp iwp) {
        LensShadingMap lensShadingMap = (LensShadingMap) iwp.mo3143a(CaptureResult.STATISTICS_LENS_SHADING_CORRECTION_MAP);
        if (lensShadingMap == null) {
            bli.m873e(f1712b, "android.statistics.lensShadingMap was null, returning the empty SpatialGainMap()");
            return new SpatialGainMap();
        }
        int columnCount = lensShadingMap.getColumnCount();
        int rowCount = lensShadingMap.getRowCount();
        SpatialGainMap spatialGainMap = new SpatialGainMap(columnCount, rowCount, true, false);
        int[] b = bya.m1048b(((Integer) jri.m13152b((Integer) this.f1715a.mo1913a(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT))).intValue());
        for (int i = 0; i < 4; i++) {
            int i2 = b[i];
            for (int i3 = 0; i3 < rowCount; i3++) {
                for (int i4 = 0; i4 < columnCount; i4++) {
                    spatialGainMap.WriteRggb(i4, i3, i, lensShadingMap.getGainFactor(i2, i4, i3));
                }
            }
        }
        return spatialGainMap;
    }

    /* renamed from: b */
    public final AwbInfo m1054b(iwp iwp) {
        float[] fArr;
        AwbInfo awbInfo = new AwbInfo();
        awbInfo.setColor_temp(f1714d);
        ffc ffc = this.f1715a;
        Key key = CaptureResult.COLOR_CORRECTION_GAINS;
        RggbChannelVector rggbChannelVector = (RggbChannelVector) iwp.mo3143a(key);
        if (rggbChannelVector == null) {
            String str = f1712b;
            String name = key.getName();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 27);
            stringBuilder.append("getAwbGains - key ");
            stringBuilder.append(name);
            stringBuilder.append(" is null.");
            bli.m873e(str, stringBuilder.toString());
            fArr = new float[4];
            Arrays.fill(fArr, 1.0f);
        } else {
            float[] fArr2 = new float[4];
            int[] b = bya.m1048b(((Integer) jri.m13152b((Integer) ffc.mo1913a(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT))).intValue());
            for (int i = 0; i < 4; i++) {
                fArr2[i] = rggbChannelVector.getComponent(b[i]);
            }
            fArr = fArr2;
        }
        awbInfo.setGains(fArr);
        ColorSpaceTransform colorSpaceTransform = (ColorSpaceTransform) iwp.mo3143a(CaptureResult.COLOR_CORRECTION_TRANSFORM);
        if (colorSpaceTransform == null) {
            bli.m873e(f1712b, "getAwbRgb2Rgb: CaptureResult.COLOR_CORRECTION_TRANSFORM is null.");
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        } else {
            fArr = bya.m1046a(colorSpaceTransform);
        }
        awbInfo.setRgb2rgb(fArr);
        return awbInfo;
    }

    /* renamed from: b */
    private static int[] m1048b(int i) {
        switch (i) {
            case 0:
                return new int[]{0, 1, 2, 3};
            case 1:
                return new int[]{0, 1, 2, 3};
            case 2:
                return new int[]{0, 2, 1, 3};
            case 3:
                return new int[]{0, 2, 1, 3};
            default:
                throw new IllegalArgumentException("staticInfo: unsupported colorFilterArrangment");
        }
    }

    /* renamed from: a */
    public final float m1049a(int i) {
        Rational rational = (Rational) jri.m13152b((Rational) this.f1715a.mo1913a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP));
        return new Rational(rational.getNumerator() * i, rational.getDenominator()).floatValue();
    }

    /* renamed from: b */
    public static int m1047b(ffc ffc) {
        Object obj = (Integer) ffc.mo1913a(CameraCharacteristics.LENS_FACING);
        jri.m13152b(obj);
        if (obj.intValue() == 1) {
            return 0;
        }
        float[] fArr = (float[]) ffc.mo1913a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        if (fArr != null && fArr.length > 1) {
            return 3;
        }
        if (fArr == null) {
            return 1;
        }
        if (fArr.length != 1) {
            return 1;
        }
        if (((double) fArr[0]) >= 2.9d) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    public final void m1052a(AeShotParams aeShotParams, Rect rect, MeteringRectangle[] meteringRectangleArr, iqp iqp) {
        if (!fgw.m2279f().m2283a("persist.gcam.ignore_ae_regions", false)) {
            int i;
            Rect a = ipz.m4019b(iqp).m4022a(rect);
            Rect rect2 = (Rect) jri.m13152b((Rect) this.f1715a.mo1913a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
            NormalizedRect normalizedRect = new NormalizedRect();
            float width = 1.0f / ((float) rect2.width());
            float height = 1.0f / ((float) rect2.height());
            normalizedRect.setX0(((float) a.left) * width);
            normalizedRect.setY0(((float) a.top) * height);
            normalizedRect.setX1(width * ((float) a.right));
            normalizedRect.setY1(((float) a.bottom) * height);
            if (f1713c) {
                String str = f1712b;
                String valueOf = String.valueOf(a);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 49);
                stringBuilder.append("convertCropRectToGcamCropParams - cropRegion is: ");
                stringBuilder.append(valueOf);
                bli.m871d(str, stringBuilder.toString());
                bli.m871d(f1712b, String.format("convertCropRectToGcamCropParams - normalized crop: x0 = %f, y0 = %f, x1 = %f, y1 = %f, aspect ratio = %f", new Object[]{Float.valueOf(normalizedRect.getX0()), Float.valueOf(normalizedRect.getY0()), Float.valueOf(normalizedRect.getX1()), Float.valueOf(normalizedRect.getY1()), Float.valueOf((normalizedRect.getX1() - normalizedRect.getX0()) / (normalizedRect.getY1() - normalizedRect.getY0()))}));
            }
            aeShotParams.setCrop(normalizedRect);
            WeightedNormalizedRectVector weighted_metering_areas = aeShotParams.getWeighted_metering_areas();
            WeightedNormalizedRect weightedNormalizedRect = new WeightedNormalizedRect();
            weightedNormalizedRect.setWeight(1.0f);
            weightedNormalizedRect.setRect(new NormalizedRect());
            weighted_metering_areas.add(weightedNormalizedRect);
            if (meteringRectangleArr != null) {
                i = 0;
                for (int i2 = 0; i2 < meteringRectangleArr.length; i2++) {
                    if (meteringRectangleArr[i2].getMeteringWeight() != 0) {
                        i++;
                        WeightedNormalizedRect weightedNormalizedRect2 = new WeightedNormalizedRect();
                        Rect rect3 = meteringRectangleArr[i2].getRect();
                        float exactCenterX = rect3.exactCenterX();
                        float exactCenterY = rect3.exactCenterY();
                        float min = ((float) Math.min(a.width(), a.height())) * 0.06125f;
                        float a2 = hjg.m3198a((exactCenterX - min) / ((float) rect2.width()));
                        float a3 = hjg.m3198a((exactCenterY - min) / ((float) rect2.height()));
                        exactCenterX = hjg.m3198a((exactCenterX + min) / ((float) rect2.width()));
                        exactCenterY = hjg.m3198a((exactCenterY + min) / ((float) rect2.height()));
                        NormalizedRect rect4 = weightedNormalizedRect2.getRect();
                        rect4.setX0(a2);
                        rect4.setY0(a3);
                        rect4.setX1(exactCenterX);
                        rect4.setY1(exactCenterY);
                        weightedNormalizedRect2.setWeight(45.0f);
                        weighted_metering_areas.add(weightedNormalizedRect2);
                        if (f1713c) {
                            bli.m871d(f1712b, String.format("convertMeteringRectanglesToGcamWeightedRects: input rect: %s SENSOR_INFO_ACTIVE_ARRAY: %s  output normalized rectangle %d: (x0: %f, y0: %f, x1: %f, y1: %f, weight: %f)", new Object[]{rect3.toString(), rect2.toString(), Integer.valueOf(i), Float.valueOf(a2), Float.valueOf(a3), Float.valueOf(exactCenterX), Float.valueOf(exactCenterY), Float.valueOf(45.0f)}));
                        }
                    }
                }
            } else {
                i = 0;
            }
            if (f1713c) {
                String str2 = f1712b;
                StringBuilder stringBuilder2 = new StringBuilder(92);
                stringBuilder2.append("convertMeteringRectanglesToGcamWeightedRects - set up ");
                stringBuilder2.append(i);
                stringBuilder2.append(" metering rectangles total.");
                bli.m871d(str2, stringBuilder2.toString());
            }
        } else if (f1713c) {
            bli.m863a(f1712b, "updateAeShotParams - ignoring all AE regions");
        }
    }

    /* renamed from: a */
    public final void m1053a(fio fio, FrameRequest frameRequest) {
        float desired_exposure_time_ms = frameRequest.getDesired_exposure_time_ms();
        float desired_analog_gain = frameRequest.getDesired_analog_gain();
        float desired_digital_gain = frameRequest.getDesired_digital_gain();
        fio.m2303a(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        Integer valueOf = Integer.valueOf(0);
        fio.m2303a(key, valueOf);
        long j = (long) (desired_exposure_time_ms * 1000000.0f);
        fio.m2303a(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j));
        if (f1713c) {
            String str = f1712b;
            StringBuilder stringBuilder = new StringBuilder(61);
            stringBuilder.append("updateFromFrameRequest - Exposure (ns) = ");
            stringBuilder.append(j);
            bli.m871d(str, stringBuilder.toString());
        }
        int intValue = ((Integer) ((Range) this.f1715a.mo1913a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue();
        fio.m2303a(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf((int) ((desired_digital_gain * desired_analog_gain) * ((float) intValue))));
        if (f1713c) {
            bli.m871d(f1712b, String.format("updateFromFrameRequest - Gain (iso) = %d (analog = %f, digital = %f, minIsoGain = %d)", new Object[]{r6, Float.valueOf(desired_analog_gain), Float.valueOf(desired_digital_gain), Integer.valueOf(intValue)}));
        }
        fio.m2303a(CaptureRequest.BLACK_LEVEL_LOCK, Boolean.valueOf(frameRequest.getTry_to_lock_black_level()));
        if (f1713c) {
            bli.m871d(f1712b, "updateFromFrameRequest - using manual white balance values");
        }
        AwbInfo awb = frameRequest.getAwb();
        if (!awb.Check()) {
            bli.m873e(f1712b, "updateFromFrameRequest - expected FrameRequest to have valid AwbInfo");
        }
        fio.m2303a(CaptureRequest.CONTROL_AWB_MODE, valueOf);
        fio.m2303a(CaptureRequest.COLOR_CORRECTION_MODE, valueOf);
        float[] gains = awb.getGains();
        int[] b = bya.m1048b(((Integer) this.f1715a.mo1913a(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue());
        fio.m2303a(CaptureRequest.COLOR_CORRECTION_GAINS, new RggbChannelVector(gains[b[0]], gains[b[1]], gains[b[2]], gains[b[3]]));
        Rational[] rationalArr = new Rational[9];
        float[] rgb2rgb = awb.getRgb2rgb();
        for (intValue = 0; intValue < 9; intValue++) {
            rationalArr[intValue] = new Rational((int) (rgb2rgb[intValue] * 10000.0f), MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR);
        }
        fio.m2303a(CaptureRequest.COLOR_CORRECTION_TRANSFORM, new ColorSpaceTransform(rationalArr));
        fio.m2303a(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE, Integer.valueOf(1));
        fio.m2303a(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(this.f1716e));
        CaptureRequest.Key key2 = CaptureRequest.EDGE_MODE;
        Integer valueOf2 = Integer.valueOf(0);
        fio.m2303a(key2, valueOf2);
        fio.m2303a(CaptureRequest.NOISE_REDUCTION_MODE, valueOf2);
        fio.m2303a(CaptureRequest.SENSOR_FRAME_DURATION, Long.valueOf(0));
    }
}

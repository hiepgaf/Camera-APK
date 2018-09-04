package com.google.googlex.gcam.androidutils.camera2;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
public class MetadataToString {
    public static String get3AStringFromResult(CaptureResult captureResult) {
        return String.format("CONTROL_MODE = %s\n\tAE_MODE = %s, AE_STATE = %s\n\tAF_MODE = %s, AF_STATE = %s\n\tAWB_MODE = %s, AWB_STATE = %s\n", new Object[]{getControlModeName(((Integer) captureResult.get(CaptureResult.CONTROL_MODE)).intValue()), getAEModeName(((Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue()), getAEStateName(((Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE)).intValue()), getAFModeName(((Integer) captureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue()), getAFStateName(((Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE)).intValue()), getAWBModeName(((Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue()), getAWBStateName(((Integer) captureResult.get(CaptureResult.CONTROL_AWB_STATE)).intValue())});
    }

    public static String getAEAntibandingModeName(int i) {
        switch (i) {
            case 0:
                return "CONTROL_AE_ANTIBANDING_MODE_OFF";
            case 1:
                return "CONTROL_AE_ANTIBANDING_MODE_50HZ";
            case 2:
                return "CONTROL_AE_ANTIBANDING_MODE_60HZ";
            case 3:
                return "CONTROL_AE_ANTIBANDING_MODE_AUTO";
            default:
                throw new IllegalArgumentException("Invalid AE antibanding mode enum");
        }
    }

    public static String getAEModeName(int i) {
        switch (i) {
            case 0:
                return "CONTROL_AE_MODE_OFF";
            case 1:
                return "CONTROL_AE_MODE_ON";
            case 2:
                return "CONTROL_AE_MODE_ON_AUTO_FLASH";
            case 3:
                return "CONTROL_AE_MODE_ON_ALWAYS_FLASH";
            case 4:
                return "CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE";
            default:
                throw new IllegalArgumentException("Invalid AE mode enum");
        }
    }

    public static String getAEPrecaptureTriggerName(int i) {
        switch (i) {
            case 0:
                return "CONTROL_AE_PRECAPTURE_TRIGGER_IDLE";
            case 1:
                return "CONTROL_AE_PRECAPTURE_TRIGGER_START";
            default:
                throw new IllegalArgumentException("Invalid AE precapture trigger enum");
        }
    }

    public static String getAEStateName(int i) {
        switch (i) {
            case 0:
                return "CONTROL_AE_STATE_INACTIVE";
            case 1:
                return "CONTROL_AE_STATE_SEARCHING";
            case 2:
                return "CONTROL_AE_STATE_CONVERGED";
            case 3:
                return "CONTROL_AE_STATE_LOCKED";
            case 4:
                return "CONTROL_AE_STATE_FLASH_REQUIRED";
            case 5:
                return "CONTROL_AE_STATE_PRECAPTURE";
            default:
                throw new IllegalArgumentException("Invalid AE state enum");
        }
    }

    public static String getAFModeName(int i) {
        switch (i) {
            case 0:
                return "CONTROL_AF_MODE_OFF";
            case 1:
                return "CONTROL_AF_MODE_AUTO";
            case 2:
                return "CONTROL_AF_MODE_MACRO";
            case 3:
                return "CONTROL_AF_MODE_CONTINUOUS_VIDEO";
            case 4:
                return "CONTROL_AF_MODE_CONTINUOUS_PICTURE";
            case 5:
                return "CONTROL_AF_MODE_EDOF";
            default:
                throw new IllegalArgumentException("Invalid AF mode enum");
        }
    }

    public static String getAFStateName(int i) {
        switch (i) {
            case 0:
                return "CONTROL_AF_STATE_INACTIVE";
            case 1:
                return "CONTROL_AF_STATE_PASSIVE_SCAN";
            case 2:
                return "CONTROL_AF_STATE_PASSIVE_FOCUSED";
            case 3:
                return "CONTROL_AF_STATE_ACTIVE_SCAN";
            case 4:
                return "CONTROL_AF_STATE_FOCUSED_LOCKED";
            case 5:
                return "CONTROL_AF_STATE_NOT_FOCUSED_LOCKED";
            case 6:
                return "CONTROL_AF_STATE_PASSIVE_UNFOCUSED";
            default:
                throw new IllegalArgumentException("Invalid AF state enum");
        }
    }

    public static String getAFTriggerName(int i) {
        switch (i) {
            case 0:
                return "CONTROL_AF_TRIGGER_IDLE";
            case 1:
                return "CONTROL_AF_TRIGGER_START";
            case 2:
                return "CONTROL_AF_TRIGGER_CANCEL";
            default:
                throw new IllegalArgumentException("Invalid AF trigger enum");
        }
    }

    public static String getAWBModeName(int i) {
        switch (i) {
            case 0:
                return "CONTROL_AWB_MODE_OFF";
            case 1:
                return "CONTROL_AWB_MODE_AUTO";
            case 2:
                return "CONTROL_AWB_MODE_INCANDESCENT";
            case 3:
                return "CONTROL_AWB_MODE_FLUORESCENT";
            case 4:
                return "CONTROL_AWB_MODE_WARM_FLUORESCENT";
            case 5:
                return "CONTROL_AWB_MODE_DAYLIGHT";
            case 6:
                return "CONTROL_AWB_MODE_CLOUDY_DAYLIGHT";
            case 7:
                return "CONTROL_AWB_MODE_TWILIGHT";
            case 8:
                return "CONTROL_AWB_MODE_SHADE";
            default:
                throw new IllegalArgumentException("Invalid AWB mode enum");
        }
    }

    public static String getAWBStateName(int i) {
        switch (i) {
            case 0:
                return "CONTROL_AWB_STATE_INACTIVE";
            case 1:
                return "CONTROL_AWB_STATE_SEARCHING";
            case 2:
                return "CONTROL_AWB_STATE_CONVERGED";
            case 3:
                return "CONTROL_AWB_STATE_LOCKED";
            default:
                throw new IllegalArgumentException("Invalid AWB state enum");
        }
    }

    public static String getControlModeName(int i) {
        switch (i) {
            case 0:
                return "CONTROL_MODE_OFF";
            case 1:
                return "CONTROL_MODE_AUTO";
            case 2:
                return "CONTROL_MODE_USE_SCENE_MODE";
            case 3:
                return "CONTROL_MODE_OFF_KEEP_STATE";
            default:
                throw new IllegalArgumentException("Invalid control mode enum");
        }
    }

    public static String getControlSceneModeString(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 0:
                return "CONTROL_SCENE_MODE_DISABLED";
            case 1:
                return "CONTROL_SCENE_MODE_FACE_PRIORITY";
            case 2:
                return "CONTROL_SCENE_MODE_ACTION";
            case 3:
                return "CONTROL_SCENE_MODE_PORTRAIT";
            case 4:
                return "CONTROL_SCENE_MODE_LANDSCAPE";
            case 5:
                return "CONTROL_SCENE_MODE_NIGHT";
            case 6:
                return "CONTROL_SCENE_MODE_NIGHT_PORTRAIT";
            case 7:
                return "CONTROL_SCENE_MODE_THEATRE";
            case 8:
                return "CONTROL_SCENE_MODE_BEACH";
            case 9:
                return "CONTROL_SCENE_MODE_SNOW";
            case 10:
                return "CONTROL_SCENE_MODE_SUNSET";
            case 11:
                return "CONTROL_SCENE_MODE_STEADYPHOTO";
            case 12:
                return "CONTROL_SCENE_MODE_FIREWORKS";
            case 13:
                return "CONTROL_SCENE_MODE_SPORTS";
            case 14:
                return "CONTROL_SCENE_MODE_PARTY";
            case 15:
                return "CONTROL_SCENE_MODE_CANDLELIGHT";
            case 16:
                return "CONTROL_SCENE_MODE_BARCODE";
            case 17:
                return "CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO";
            default:
                return "INVALID_ENUM";
        }
    }

    public static String getStatisticsFaceDetectModeString(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 0:
                return "STATISTICS_FACE_DETECT_MODE_OFF";
            case 1:
                return "STATISTICS_FACE_DETECT_MODE_SIMPLE";
            case 2:
                return "STATISTICS_FACE_DETECT_MODE_FULL";
            default:
                return "INVALID_ENUM";
        }
    }
}

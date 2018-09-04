package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult.Key;
import com.google.android.camera.experimental2017.ExperimentalKeys;

/* compiled from: PG */
/* renamed from: hsz */
public final class hsz {
    /* renamed from: A */
    public static final Integer f6604A;
    /* renamed from: B */
    public static final Key f6605B;
    /* renamed from: C */
    private static final boolean f6606C = hsx.m3356a(hsx.f6598a, 2);
    /* renamed from: a */
    public static final CameraCharacteristics.Key f6607a;
    /* renamed from: b */
    public static final CaptureRequest.Key f6608b;
    /* renamed from: c */
    public static final CaptureRequest.Key f6609c;
    /* renamed from: d */
    public static final Byte f6610d;
    /* renamed from: e */
    public static final Byte f6611e;
    /* renamed from: f */
    public static final Byte f6612f = Byte.valueOf((byte) 2);
    /* renamed from: g */
    public static final Key f6613g;
    /* renamed from: h */
    public static final Key f6614h;
    /* renamed from: i */
    public static final Key f6615i;
    @Deprecated
    /* renamed from: j */
    public static final Key f6616j;
    @Deprecated
    /* renamed from: k */
    public static final Key f6617k;
    /* renamed from: l */
    public static final Key f6618l;
    /* renamed from: m */
    public static final Key f6619m;
    /* renamed from: n */
    public static final Key f6620n;
    /* renamed from: o */
    public static final Key f6621o;
    /* renamed from: p */
    public static final CaptureRequest.Key f6622p;
    /* renamed from: q */
    public static final Integer f6623q;
    /* renamed from: r */
    public static final Key f6624r;
    /* renamed from: s */
    public static final Key f6625s;
    /* renamed from: t */
    public static final CaptureRequest.Key f6626t;
    /* renamed from: u */
    public static final CaptureRequest.Key f6627u;
    /* renamed from: v */
    public static final CameraCharacteristics.Key f6628v;
    /* renamed from: w */
    public static final CameraCharacteristics.Key f6629w;
    /* renamed from: x */
    public static final CameraCharacteristics.Key f6630x;
    /* renamed from: y */
    public static final CameraCharacteristics.Key f6631y;
    /* renamed from: z */
    public static final CaptureRequest.Key f6632z;

    static {
        CameraCharacteristics.Key key;
        CaptureRequest.Key key2;
        Key key3;
        Key key4 = null;
        Byte valueOf = Byte.valueOf((byte) 0);
        Byte valueOf2 = Byte.valueOf((byte) 1);
        if (f6606C) {
            key = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_INFORMATION;
        } else {
            key = null;
        }
        f6607a = key;
        if (f6606C) {
            hsz.m3364g();
        }
        if (!f6606C) {
            key2 = null;
        } else if (hsz.m3364g()) {
            key2 = ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_ENABLE;
        } else {
            key2 = null;
        }
        f6608b = key2;
        if (f6606C) {
            key2 = ExperimentalKeys.EXPERIMENTAL_CONTROL_TRACKING_AF_TRIGGER;
        } else {
            key2 = null;
        }
        f6609c = key2;
        f6610d = valueOf;
        f6611e = valueOf2;
        if (f6606C) {
            key3 = ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_REGIONS_CONFIDENCE;
        } else {
            key3 = null;
        }
        f6613g = key3;
        if (f6606C) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME;
        } else {
            key3 = null;
        }
        f6614h = key3;
        if (f6606C) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_TIMESTAMPS_BOOTTIME;
        } else {
            key3 = null;
        }
        f6615i = key3;
        if (f6606C) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_X;
        } else {
            key3 = null;
        }
        f6616j = key3;
        if (f6606C) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_Y;
        } else {
            key3 = null;
        }
        f6617k = key3;
        if (!f6606C) {
            key3 = null;
        } else if (hsz.m3362e()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_X;
        } else {
            key3 = null;
        }
        f6618l = key3;
        if (!f6606C) {
            key3 = null;
        } else if (hsz.m3362e()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_Y;
        } else {
            key3 = null;
        }
        f6619m = key3;
        if (!f6606C) {
            key3 = null;
        } else if (hsz.m3358a()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_CONTROL_EXP_TIME_BOOST;
        } else {
            key3 = null;
        }
        f6620n = key3;
        if (hsz.m3360c()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_REQUEST_NEXT_STILL_INTENT_REQUEST_READY;
        } else {
            key3 = null;
        }
        f6621o = key3;
        if (hsz.m3360c()) {
            key2 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW;
        } else {
            key2 = null;
        }
        f6622p = key2;
        Integer valueOf3 = Integer.valueOf(1);
        f6623q = valueOf3;
        if (hsz.m3360c()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_CONFIG;
        } else {
            key3 = null;
        }
        f6624r = key3;
        if (hsz.m3360c()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_DATA;
        } else {
            key3 = null;
        }
        f6625s = key3;
        if (hsz.m3360c()) {
            key2 = ExperimentalKeys.EXPERIMENTAL_CONTINUOUS_ZSL_CAPTURE;
        } else {
            key2 = null;
        }
        f6626t = key2;
        if (hsz.m3359b()) {
            key2 = ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS;
        } else {
            key2 = null;
        }
        f6627u = key2;
        hsz.m3365h();
        if (f6606C) {
            hsz.m3363f();
        }
        if (f6606C) {
            hsz.m3363f();
        }
        if (f6606C) {
            hsz.m3363f();
        }
        if (!f6606C) {
            key = null;
        } else if (hsz.m3366i()) {
            key = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else {
            key = null;
        }
        f6628v = key;
        if (!f6606C) {
            key = null;
        } else if (hsz.m3366i()) {
            key = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else {
            key = null;
        }
        f6629w = key;
        if (!f6606C) {
            key = null;
        } else if (hsz.m3366i()) {
            key = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else {
            key = null;
        }
        f6630x = key;
        if (!f6606C) {
            key = null;
        } else if (hsz.m3366i()) {
            key = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else {
            key = null;
        }
        f6631y = key;
        if (!f6606C) {
            key2 = null;
        } else if (hsz.m3361d()) {
            key2 = ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE;
        } else {
            key2 = null;
        }
        f6632z = key2;
        f6604A = valueOf3;
        if (f6606C) {
            hsz.m3361d();
        }
        if (f6606C) {
            hsz.m3361d();
        }
        if (f6606C && hsz.m3361d()) {
            key4 = ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        }
        f6605B = key4;
    }

    /* renamed from: a */
    private static boolean m3358a() {
        if (f6606C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 2) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m3359b() {
        if (f6606C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 5) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m3360c() {
        if (f6606C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 4) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m3361d() {
        if (f6606C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 9) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m3362e() {
        if (f6606C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 3) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m3363f() {
        if (f6606C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 7) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m3364g() {
        if (f6606C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() > 0) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m3365h() {
        if (f6606C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 6) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m3366i() {
        if (f6606C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 10) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }
}

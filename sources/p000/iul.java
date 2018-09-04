package p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraCharacteristics.Key;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: iul */
final class iul implements iun {
    /* renamed from: e */
    private final Object f18585e;
    /* renamed from: f */
    private final CameraCharacteristics f18586f;
    /* renamed from: g */
    private final iur f18587g;
    /* renamed from: h */
    private final ivx f18588h;
    /* renamed from: i */
    private final ird f18589i;
    /* renamed from: j */
    private final iqz f18590j;
    /* renamed from: k */
    private StreamConfigurationMap f18591k = null;

    iul(iur iur, CameraCharacteristics cameraCharacteristics, ivx ivx, ird ird, iqz iqz) {
        jri.m13152b((Object) cameraCharacteristics);
        this.f18587g = iur;
        this.f18586f = cameraCharacteristics;
        this.f18588h = ivx;
        this.f18589i = ird;
        this.f18590j = iqz.mo512a("Characteristics");
        this.f18585e = new Object();
    }

    /* renamed from: a */
    public final Object mo1913a(Key key) {
        return this.f18586f.get(key);
    }

    /* renamed from: a */
    public final Object mo1914a(Key key, Object obj) {
        Object obj2 = this.f18586f.get(key);
        return obj2 == null ? obj : obj2;
    }

    /* renamed from: a */
    public final List mo1915a() {
        float[] fArr = (float[]) mo1914a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS, b);
        if (fArr.length == 0) {
            return Collections.emptyList();
        }
        return new kmi(fArr);
    }

    /* renamed from: b */
    public final List mo1919b() {
        return ion.m3948a((Size[]) mo1914a(CameraCharacteristics.JPEG_AVAILABLE_THUMBNAIL_SIZES, c));
    }

    /* renamed from: c */
    public final iut mo1921c() {
        int intValue = ((Integer) mo1918b(CameraCharacteristics.LENS_FACING)).intValue();
        if (intValue == 1) {
            return iut.BACK;
        }
        if (intValue == 0) {
            return iut.FRONT;
        }
        return iut.EXTERNAL;
    }

    /* renamed from: d */
    public final iur mo1922d() {
        return this.f18587g;
    }

    /* renamed from: b */
    public final Object mo1918b(Key key) {
        return jri.m13152b(this.f18586f.get(key));
    }

    /* renamed from: e */
    public final List mo1923e() {
        return Arrays.asList((Range[]) mo1918b(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: f */
    public final float mo1924f() {
        if (!mo1938t()) {
            return -1.0f;
        }
        Rational rational = (Rational) mo1914a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP, Rational.ZERO);
        return ((float) rational.getNumerator()) / ((float) rational.getDenominator());
    }

    /* renamed from: g */
    public final List mo1925g() {
        Object obj = (float[]) this.f18586f.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        jri.m13152b(obj);
        Arrays.sort(obj);
        List b = khb.m4885b();
        for (float valueOf : obj) {
            b.add(Float.valueOf(valueOf));
        }
        return b;
    }

    public final List a_(iqp iqp) {
        StreamConfigurationMap B = m12466B();
        if (B == null) {
            return Collections.emptyList();
        }
        Range[] highSpeedVideoFpsRangesFor = B.getHighSpeedVideoFpsRangesFor(ion.m3939a(iqp));
        if (highSpeedVideoFpsRangesFor == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(highSpeedVideoFpsRangesFor);
    }

    /* renamed from: h */
    public final List mo1926h() {
        StreamConfigurationMap B = m12466B();
        if (B == null) {
            return Collections.emptyList();
        }
        Size[] highSpeedVideoSizes = B.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return Collections.emptyList();
        }
        List a = ion.m3948a(highSpeedVideoSizes);
        return Arrays.asList((iqp[]) a.toArray(new iqp[a.size()]));
    }

    /* renamed from: i */
    public final ius mo1927i() {
        List arrayList = new ArrayList(r3);
        for (int a : (int[]) mo1914a(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES, a)) {
            arrayList.add(ius.m4256a(a));
        }
        if (arrayList.contains(ius.FULL)) {
            return ius.FULL;
        }
        if (arrayList.contains(ius.SIMPLE)) {
            return ius.SIMPLE;
        }
        return ius.NONE;
    }

    /* renamed from: j */
    public final int mo1928j() {
        if (mo1938t()) {
            return ((Integer) ((Range) mo1918b(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getUpper()).intValue();
        }
        return -1;
    }

    /* renamed from: k */
    public final float mo1929k() {
        return ((Float) mo1914a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, Float.valueOf(1.0f))).floatValue();
    }

    /* renamed from: l */
    public final int mo1930l() {
        if (mo1938t()) {
            return ((Integer) ((Range) mo1918b(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getLower()).intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public final long mo1912a(int i, iqp iqp) {
        StreamConfigurationMap B = m12466B();
        if (B == null) {
            return 0;
        }
        return B.getOutputMinFrameDuration(i, ion.m3939a(iqp));
    }

    /* renamed from: m */
    public final byte[] mo1931m() {
        byte[] bArr = d;
        if (hsz.f6607a != null) {
            return (byte[]) mo1914a(hsz.f6607a, d);
        }
        return bArr;
    }

    /* renamed from: n */
    public final Rect mo1932n() {
        return (Rect) mo1918b(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    /* renamed from: o */
    public final int mo1933o() {
        return ((Integer) mo1918b(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    /* renamed from: B */
    private final StreamConfigurationMap m12466B() {
        String str;
        StreamConfigurationMap streamConfigurationMap;
        synchronized (this.f18585e) {
            if (this.f18591k == null) {
                try {
                    ird ird = this.f18589i;
                    str = this.f18587g.f7482b;
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 31);
                    stringBuilder.append("StreamConfigurationMap(");
                    stringBuilder.append(str);
                    stringBuilder.append(")#create");
                    ird.mo1903a(stringBuilder.toString());
                    this.f18591k = (StreamConfigurationMap) mo1913a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                } catch (Throwable e) {
                    iqz iqz = this.f18590j;
                    r4 = "Unable to obtain StreamConfigurationMap for camera ";
                    str = String.valueOf(this.f18587g.f7482b);
                    String str2;
                    if (str.length() == 0) {
                        str = new String(str2);
                    } else {
                        str = str2.concat(str);
                    }
                    iqz.mo515b(str, e);
                    return null;
                } finally {
                    this.f18589i.mo1904b();
                }
            }
            streamConfigurationMap = this.f18591k;
        }
        return streamConfigurationMap;
    }

    /* renamed from: p */
    public final int mo1934p() {
        return go.m2648a(((Integer) mo1918b(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue());
    }

    /* renamed from: a */
    public final List mo1916a(int i) {
        if (!this.f18588h.f7500a) {
            return Collections.emptyList();
        }
        StreamConfigurationMap B = m12466B();
        if (B == null) {
            return Collections.emptyList();
        }
        return ion.m3948a(B.getInputSizes(i));
    }

    /* renamed from: b */
    public final List mo1920b(int i) {
        StreamConfigurationMap B = m12466B();
        if (B == null) {
            return Collections.emptyList();
        }
        return ion.m3948a(B.getOutputSizes(i));
    }

    /* renamed from: q */
    public final List mo1935q() {
        StreamConfigurationMap B = m12466B();
        if (B == null) {
            return Collections.emptyList();
        }
        return ion.m3948a(B.getOutputSizes(SurfaceTexture.class));
    }

    /* renamed from: r */
    public final boolean mo1936r() {
        Integer num = (Integer) mo1913a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        return num != null && num.intValue() > 0;
    }

    /* renamed from: s */
    public final boolean mo1937s() {
        Integer num = (Integer) mo1913a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        Float f = (Float) mo1913a(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (num != null && num.intValue() > 0 && f != null && f.floatValue() > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo1938t() {
        boolean z;
        Range range = (Range) mo1913a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range == null) {
            z = false;
        } else if (range.getLower() != null && ((Integer) range.getLower()).intValue() != 0) {
            z = true;
        } else if (range.getUpper() == null) {
            z = false;
        } else if (((Integer) range.getUpper()).intValue() != 0) {
            return true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: u */
    public final boolean mo1939u() {
        return mo1940v() || mo1921c() == iut.FRONT;
    }

    /* renamed from: v */
    public final boolean mo1940v() {
        return ((Boolean) mo1914a(CameraCharacteristics.FLASH_INFO_AVAILABLE, Boolean.valueOf(false))).booleanValue();
    }

    /* renamed from: w */
    public final boolean mo1941w() {
        try {
            return this.f18586f.getAvailableCaptureRequestKeys().contains(CaptureRequest.CONTROL_ENABLE_ZSL);
        } catch (NoSuchFieldError e) {
            return false;
        }
    }

    /* renamed from: x */
    public final boolean mo1942x() {
        for (int i : (int[]) mo1914a(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES, a)) {
            if (i == 18) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo1943y() {
        for (int i : (int[]) mo1914a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, a)) {
            if (i == 9) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo1944z() {
        for (int i : (int[]) this.f18586f.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) {
            if (i == 11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public final boolean mo1911A() {
        for (int i : (int[]) mo1914a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES, a)) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}

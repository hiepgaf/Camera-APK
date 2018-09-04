package com.google.googlex.gcam.androidutils;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import com.google.googlex.gcam.androidutils.vecmath.Vector3f;
import com.google.googlex.gcam.androidutils.vecmath.Vector4f;

/* compiled from: PG */
public class ColorUtils {
    public static Vector3f colorMapHSV(float f) {
        return hsv2rgb(new Vector3f(f, 1.0f, 1.0f));
    }

    public static Vector4f colorMapHSVA(float f, float f2) {
        Vector3f hsv2rgb = hsv2rgb(new Vector3f(f, 1.0f, 1.0f));
        return new Vector4f(hsv2rgb.f2489x, hsv2rgb.f2490y, hsv2rgb.f2491z, f2);
    }

    public static int convertYUVtoARGB(int i, int i2, int i3) {
        int i4 = Illuminant.kOther;
        float f = (float) i2;
        int i5 = i + ((int) (1.402f * f));
        float f2 = (float) i3;
        int i6 = i - ((int) ((f * 0.714f) + (0.344f * f2)));
        int i7 = ((int) (1.772f * f2)) + i;
        if (i5 > Illuminant.kOther) {
            i5 = Illuminant.kOther;
        } else if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > Illuminant.kOther) {
            i6 = Illuminant.kOther;
        } else if (i6 < 0) {
            i6 = 0;
        }
        if (i7 <= Illuminant.kOther) {
            if (i7 < 0) {
                i4 = 0;
            } else {
                i4 = i7;
            }
        }
        return i4 | (((i5 << 16) | -16777216) | (i6 << 8));
    }

    public static byte floatToByte(float f) {
        return (byte) ((int) (255.0f * f));
    }

    public static Vector3f hsv2rgb(Vector3f vector3f) {
        float f = vector3f.f2489x;
        float f2 = vector3f.f2490y;
        float f3 = vector3f.f2491z;
        f *= 360.0f;
        if (f2 == 0.0f) {
            return new Vector3f(f3, f3, f3);
        }
        f /= 60.0f;
        int i = (int) f;
        f -= (float) i;
        float f4 = (1.0f - f2) * f3;
        float f5 = (1.0f - (f2 * f)) * f3;
        f = (1.0f - ((1.0f - f) * f2)) * f3;
        float f6;
        switch (i) {
            case 0:
                break;
            case 1:
                f = f3;
                f3 = f5;
                break;
            case 2:
                f6 = f4;
                f4 = f;
                f = f3;
                f3 = f6;
                break;
            case 3:
                f = f5;
                f6 = f3;
                f3 = f4;
                f4 = f6;
                break;
            case 4:
                f6 = f;
                f = f4;
                f4 = f3;
                f3 = f6;
                break;
            default:
                f = f4;
                f4 = f5;
                break;
        }
        return new Vector3f(f3, f, f4);
    }

    public static float intToFloat(int i) {
        return ((float) i) / 255.0f;
    }

    public static Vector4f intToFloat(int i, int i2, int i3, int i4) {
        return new Vector4f(intToFloat(i), intToFloat(i2), intToFloat(i3), intToFloat(i4));
    }

    public static byte intToUByte(int i) {
        return (byte) i;
    }

    public static Vector4f randomColorForInteger(long j) {
        long j2;
        if (j < 4294967291L) {
            j2 = (j * j) % 4294967291L;
            if (j > 2147483645) {
                j2 = 4294967291L - j2;
            }
        } else {
            j2 = j;
        }
        return intToFloat((int) (j2 & 255), (int) ((j2 >> 8) & 255), (int) ((j2 >> 16) & 255), (int) ((j2 >> 24) & 255));
    }

    public static float saturate(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}

package p000;

import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jza */
public enum jza {
    SHARPNESS((String) 0, 1, (int) jzg.f8146b, (int) 66666666),
    SHARPNESS_MEAN((String) 16, 1, (int) jzg.f8146b, (int) 66666666),
    SHARPNESS_STDEV((String) 17, 1, (int) jzg.f8146b, (int) 66666666),
    MASKED_SHARPNESS((String) 18, 1, (int) jzg.f8146b, (int) 66666666),
    MASKED_SHARPNESS_MEAN((String) 19, 1, (int) jzg.f8146b, (int) 66666666),
    MASKED_SHARPNESS_STDEV((String) 20, 1, (int) jzg.f8146b, (int) 66666666),
    PERCEPTUAL_SHARPNESS((String) 23, 1, (int) jzg.f8146b, (int) 66666666),
    FACE_COUNT((String) 1, 1, (int) jzg.f8146b, (int) 499999995),
    COLORFULNESS((String) 2, 1, (int) jzg.f8146b, (int) 166666665),
    TIMESTAMP((String) 3, 1, (int) jzg.f8145a, (int) 33333333),
    MOTION_SALIENCY((String) 4, 1, (int) jzg.f8146b, (int) 166666665),
    MOTION_ESTIMATION_SALIENCY((String) 21, 2, (int) jzg.f8146b, (int) 166666665),
    HUE_SAT_HISTOGRAM((String) 5, (int) new int[]{6, 3}, (int) jzg.f8146b, (int[]) 166666665),
    VALUE_HISTOGRAM((String) 6, 6, (int) jzg.f8146b, (int) 166666665),
    IMAGE_SALIENCY((String) 7, 1, (int) jzg.f8146b, (int) 166666665),
    FACE_ILLUMINATION_SCORE((String) 8, 4, (int) jzg.f8146b, (int) 499999995),
    FACE_FRAMING_SCORE((String) 9, 4, (int) jzg.f8146b, (int) 499999995),
    FACE_IS_SMILING_AGGREGATE_SCORE((String) 10, 1, (int) jzg.f8146b, (int) 499999995),
    FACE_IS_LEFT_EYE_OPEN_AGGREGATE_SCORE((String) 11, 1, (int) jzg.f8146b, (int) 499999995),
    FACE_IS_RIGHT_EYE_OPEN_AGGREGATE_SCORE((String) 12, 1, (int) jzg.f8146b, (int) 499999995),
    FACE_SHARPNESS_AGGREGATE_SCORE((String) 22, 1, (int) jzg.f8146b, (int) 499999995),
    IMAGE_SATURATION((String) 13, 1, (int) jzg.f8146b, (int) 166666665),
    IMAGE_ENTROPY((String) 14, 1, (int) jzg.f8146b, (int) 166666665),
    INTERFRAME_HOMOGRAPHY((String) 15, 9, (int) jzg.f8147c, (int) 166666665),
    CAMERA_MOTION((String) 25, 2, (int) jzg.f8146b, (int) 166666665),
    EXPOSURE((String) 24, 1, (int) jzg.f8146b, (int) 66666666),
    MAX_GRID_SHARPNESS((String) 26, 1, (int) jzg.f8146b, (int) 66666666),
    BRIGHTNESS_MEAN((String) 27, 1, (int) jzg.f8146b, (int) 66666666),
    BRIGHTNESS_VARIANCE((String) 28, 1, (int) jzg.f8146b, (int) 66666666),
    MAX_BLOCK_BRIGHTNESS_MEAN((String) 29, 1, (int) jzg.f8146b, (int) 66666666),
    MIN_BLOCK_BRIGHTNESS_MEAN((String) 30, 1, (int) jzg.f8146b, (int) 66666666),
    MAX_BLOCK_BRIGHTNESS_VARIANCE((String) 31, 1, (int) jzg.f8146b, (int) 66666666),
    MIN_BLOCK_BRIGHTNESS_VARIANCE((String) 32, 1, (int) jzg.f8146b, (int) 66666666),
    VIDEO_PRESENTATION_TIME((String) 33, 1, (int) jzg.f8147c, (int) 0),
    TEST_FEATURE_1((String) 100, 1, (int) jzg.f8146b, (int) 66666666),
    TEST_FEATURE_2((String) 200, 3, (int) jzg.f8146b, (int) 66666666),
    TEST_MULTIDIMENSIONAL_FEATURE((String) VideoProviderSource.TIMESTAMP_FILTER_SIZE, (int) new int[]{2, 5, 3}, (int) jzg.f8146b, (int[]) 66666666);
    
    /* renamed from: Q */
    private static final Map f8100Q = null;
    /* renamed from: A */
    public final int f8127A;
    /* renamed from: B */
    public final jzg f8128B;
    /* renamed from: C */
    public final int[] f8129C;
    /* renamed from: D */
    public final long f8130D;
    /* renamed from: z */
    public final int f8131z;

    static {
        f8100Q = new HashMap();
    }

    private jza(int i, int i2, jzg jzg, long j) {
        this(r9, r10, i, new int[]{i2}, jzg, j);
    }

    private jza(int i, int[] iArr, jzg jzg, long j) {
        boolean z;
        int i2 = 1;
        int i3 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        jri.m13152b((Object) iArr);
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f8131z = i;
        this.f8128B = jzg;
        this.f8129C = iArr;
        this.f8130D = j;
        int[] iArr2 = this.f8129C;
        int length = iArr2.length;
        while (i3 < length) {
            int i4 = iArr2[i3];
            if (i4 <= 0) {
                String valueOf = String.valueOf(Arrays.toString(iArr));
                String str = "Invalid value of feature dimension:";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new IllegalArgumentException(valueOf);
            }
            i2 *= i4;
            i3++;
        }
        this.f8127A = i2;
    }

    /* renamed from: a */
    public static jza m4706a(int i) {
        if (f8100Q.isEmpty()) {
            for (jza jza : jza.values()) {
                f8100Q.put(Integer.valueOf(jza.f8131z), jza);
            }
        }
        return (jza) f8100Q.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static jza m4707a(String str) {
        return (jza) Enum.valueOf(jza.class, str);
    }
}

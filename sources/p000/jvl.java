package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.util.Trace;
import com.google.android.libraries.smartburst.utils.FeatureTableUtils;
import com.google.android.libraries.smartburst.utils.MathUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/* compiled from: PG */
/* renamed from: jvl */
public final class jvl extends juo {
    /* renamed from: a */
    private final jvk f21953a;
    /* renamed from: b */
    private final FeatureTable f21954b;
    /* renamed from: c */
    private final float f21955c = 0.25f;
    /* renamed from: d */
    private final float f21956d = 30.0f;

    public jvl(FeatureTable featureTable, jvk jvk) {
        this.f21953a = jvk;
        this.f21954b = featureTable;
    }

    /* renamed from: a */
    public final List mo3182a(juh juh) {
        List a = ken.m13458a(juh.f7984a);
        if (a.size() == 0) {
            return khb.m4885b();
        }
        int[] iArr;
        int i;
        int i2;
        long[] allValidTimestamps = FeatureTableUtils.getAllValidTimestamps(this.f21954b);
        int length = allValidTimestamps.length;
        float[] fArr = new float[length];
        float[] fArr2 = new float[length];
        for (length = 0; length < allValidTimestamps.length; length++) {
            long j = allValidTimestamps[length];
            fArr2[length] = this.f21954b.getFeature(j, jza.TIMESTAMP).getValue();
            fArr[length] = this.f21954b.getFeature(j, jza.MOTION_SALIENCY).getValue();
        }
        System.currentTimeMillis();
        if (fArr.length > 600) {
            fArr = MathUtils.applyGaussianKernel1D(fArr, 15, 9.0f);
        } else {
            fArr = MathUtils.squeezeToRange(MathUtils.clamp(MathUtils.applyBilateralFilter1D(fArr, 15, 9.0f, 0.2f), 0.02f, Float.POSITIVE_INFINITY), 0.02f, 0.35f);
        }
        jvm jvm = new jvm(fArr, fArr2, allValidTimestamps, a, this.f21953a, this.f21955c, this.f21956d);
        Trace.beginSection("MinCostFrameSetSegmenterImpl:segment");
        System.currentTimeMillis();
        int[] findLocalMinima = MathUtils.findLocalMinima(jvm.f8000a);
        Trace.beginSection("MinCostFrameSetSegmenterImpl:findOptimalSegmentation");
        int length2 = findLocalMinima.length;
        if (length2 == 0) {
            iArr = new int[]{-1};
        } else {
            double[] dArr = new double[length2];
            int[] iArr2 = new int[length2];
            Arrays.fill(iArr2, -1);
            for (int i3 = 0; i3 < length2; i3++) {
                i = findLocalMinima[i3];
                dArr[i3] = jvm.m4651a(0, i);
                for (i2 = i3 - 1; i2 >= 0; i2--) {
                    int i4 = findLocalMinima[i2];
                    if (i - i4 > jvm.f8003d) {
                        break;
                    }
                    if (dArr[i2] <= dArr[i3]) {
                        double a2 = jvm.m4651a(i4 + 1, i) + dArr[i2];
                        if (a2 < dArr[i3]) {
                            dArr[i3] = a2;
                            iArr2[i3] = i2;
                        }
                    }
                }
            }
            iArr = iArr2;
        }
        Trace.endSection();
        Deque arrayDeque = new ArrayDeque();
        int length3 = findLocalMinima.length;
        allValidTimestamps = jvm.f8001b;
        arrayDeque.addFirst(Long.valueOf(allValidTimestamps[allValidTimestamps.length - 1] + 1));
        if (length3 > 0) {
            length3--;
            i2 = findLocalMinima[length3] + 1;
            long[] jArr = jvm.f8001b;
            if (i2 < jArr.length - 1) {
                arrayDeque.addFirst(Long.valueOf(jArr[i2]));
            }
            while (true) {
                length3 = iArr[length3];
                if (length3 == -1) {
                    break;
                }
                arrayDeque.addFirst(Long.valueOf(jvm.f8001b[findLocalMinima[length3] + 1]));
            }
        }
        arrayDeque.addFirst(Long.valueOf(jvm.f8001b[0]));
        List list = jvm.f8002c;
        long j2 = jvm.f8001b[0];
        List b = khb.m4885b();
        if (!list.isEmpty()) {
            j2 = Math.min(j2, ((Long) list.get(0)).longValue());
            i = 0;
            length3 = 0;
            while (length3 < list.size()) {
                if (arrayDeque.size() == 0) {
                    b.add(new juh(list.subList(length3, list.size()), j2, ((Long) list.get(list.size() - 1)).longValue()));
                    break;
                }
                int i5 = length3;
                while (i5 < list.size() && ((Long) list.get(i5)).longValue() < ((Long) arrayDeque.getFirst()).longValue()) {
                    i5++;
                }
                long longValue = ((Long) arrayDeque.pop()).longValue();
                if (i5 != i) {
                    b.add(new juh(list.subList(i, i5), j2, longValue));
                    length = i5;
                } else {
                    length = i;
                }
                j2 = longValue;
                length3 = i5;
                i = length;
            }
        }
        Trace.endSection();
        return b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21953a);
        float f = this.f21955c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 61);
        stringBuilder.append("MinCostSegmenter[costMetric=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", newClusterCost=");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

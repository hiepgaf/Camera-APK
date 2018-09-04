package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: juq */
public final class juq extends jul {
    /* renamed from: a */
    private final FeatureTable f21914a;
    /* renamed from: b */
    private final float f21915b = 0.8f;

    public juq(FeatureTable featureTable) {
        this.f21914a = featureTable;
    }

    /* renamed from: a */
    public final Set mo3180a(juh juh) {
        if (juh.m4646b()) {
            return Collections.emptySet();
        }
        long a = juh.m4644a();
        Iterator it = juh.iterator();
        float f = 0.0f;
        long j = a;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (longValue != juh.m4644a()) {
                jkz rowIterator = this.f21914a.getRowIterator(j);
                float[] fArr = new float[]{0.0f, 0.0f};
                int i = 0;
                int i2 = 0;
                while (rowIterator.m4528a()) {
                    jky jky = (jky) rowIterator.next();
                    if (jky.m4527b() > longValue) {
                        break;
                    }
                    float[] values = jky.m4525a(jza.CAMERA_MOTION).getValues();
                    float f2 = values[0];
                    if (f2 >= 0.2f || values[1] >= 0.2f) {
                        int i3 = i + 1;
                        if (i3 > 4) {
                            i = 0;
                            i2++;
                        } else {
                            i = i3;
                        }
                    } else {
                        fArr[0] = f2 + fArr[0];
                        fArr[1] = values[1] + fArr[1];
                        i = 0;
                    }
                }
                float f3 = fArr[0];
                float f4 = fArr[1];
                j = longValue;
                f = (((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) + (((float) i2) * 0.1f)) + f;
            }
        }
        if (f > this.f21915b) {
            return khb.m4872a(jui.CAMERA_PANNING, new jui[0]);
        }
        return Collections.emptySet();
    }

    public final String toString() {
        float f = this.f21915b;
        StringBuilder stringBuilder = new StringBuilder(59);
        stringBuilder.append("[CameraPanningSegmentClassifier threshold: ");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

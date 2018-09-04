package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.utils.FloatArray;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jup */
public final class jup extends jul {
    /* renamed from: a */
    private final FeatureTable f21912a;
    /* renamed from: b */
    private float f21913b = -1.0f;

    public jup(FeatureTable featureTable) {
        this.f21912a = featureTable;
    }

    /* renamed from: a */
    public final Set mo3180a(juh juh) {
        jkz rowIterator;
        float value;
        float f = 0.0f;
        if (this.f21913b < 0.0f) {
            FeatureTable featureTable = this.f21912a;
            rowIterator = featureTable.getRowIterator(featureTable.getEarliestTimestamp());
            while (rowIterator.m4528a()) {
                value = ((jky) rowIterator.next()).m4525a(jza.MOTION_SALIENCY).getValue();
                if (value > this.f21913b) {
                    this.f21913b = value;
                }
            }
        }
        long j = juh.f7986c;
        long j2 = juh.f7987d;
        rowIterator = this.f21912a.getRowIterator(j);
        FloatArray floatArray = new FloatArray();
        while (rowIterator.m4528a()) {
            jky jky = (jky) rowIterator.next();
            if (jky.m4527b() > j2) {
                break;
            }
            value = jky.m4525a(jza.MOTION_SALIENCY).getValue();
            if (value > 0.02f) {
                float f2 = this.f21913b;
                if (f2 != 0.02f) {
                    value = (((value - 220.16f) * 0.98f) / (f2 - 220.16f)) + 0.02f;
                }
            }
            floatArray.add(value);
        }
        floatArray.sortInPlace();
        FloatArray subArray = floatArray.subArray((int) (((float) floatArray.size()) * 0.7f), floatArray.size());
        if (!subArray.isEmpty()) {
            Iterator it = subArray.iterator();
            while (it.hasNext()) {
                f = ((Float) it.next()).floatValue() + f;
            }
            f /= (float) subArray.size();
        }
        if (f > 0.2f) {
            return khb.m4872a(jui.ACTION, new jui[0]);
        }
        return Collections.emptySet();
    }

    public final String toString() {
        return "[ActionSegmentClassifier cutoff: 0.02 threshold: 0.2 top percent to keep: 0.3]";
    }
}

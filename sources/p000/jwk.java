package p000;

import com.google.android.libraries.smartburst.utils.Feature;

/* compiled from: PG */
/* renamed from: jwk */
public final class jwk implements jwo {
    /* renamed from: a */
    public final float mo2058a(Feature feature, Feature feature2) {
        boolean z;
        int i = 0;
        if (feature.getType() == feature2.getType()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        float[] values = feature.getValues();
        float[] values2 = feature2.getValues();
        float f = 0.0f;
        while (i < values.length) {
            f += Math.abs(values2[i] - values[i]);
            i++;
        }
        return f;
    }
}

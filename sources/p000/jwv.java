package p000;

import com.google.android.libraries.smartburst.utils.Feature;

/* compiled from: PG */
/* renamed from: jwv */
public final class jwv implements jwo {
    /* renamed from: a */
    public final float mo2058a(Feature feature, Feature feature2) {
        boolean z;
        float f;
        int i = 0;
        jri.m13152b((Object) feature);
        jri.m13152b((Object) feature2);
        if (feature.getType() == feature2.getType()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        float[] values = feature.getValues();
        float[] values2 = feature2.getValues();
        float a = jwv.m13270a(feature);
        float a2 = jwv.m13270a(feature2);
        if (a > 1.0E-7f) {
            f = 1.0f / a;
        } else {
            f = 1.0f;
        }
        if (a2 > 1.0E-7f) {
            a = 1.0f / a2;
        } else {
            a = 1.0f;
        }
        float f2 = 0.0f;
        while (i < values.length) {
            f2 += Math.abs((values2[i] * a) - (values[i] * f));
            i++;
        }
        return f2;
    }

    /* renamed from: a */
    private static float m13270a(Feature feature) {
        float f = 0.0f;
        for (float abs : feature.getValues()) {
            f += Math.abs(abs);
        }
        return f;
    }
}

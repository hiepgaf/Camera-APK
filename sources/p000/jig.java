package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.utils.Feature;

/* compiled from: PG */
/* renamed from: jig */
public final class jig {
    /* renamed from: a */
    public final FeatureTable f7849a;

    public jig(FeatureTable featureTable) {
        jri.m13152b((Object) featureTable);
        this.f7849a = featureTable;
    }

    /* renamed from: a */
    public final jzr m4507a(jza jza) {
        jzs jzs = new jzs();
        if (this.f7849a.getFeatureTypes().contains(jza)) {
            for (Feature values : this.f7849a.getColumnValues(jza)) {
                for (float f : values.getValues()) {
                    jzs.m4716a((double) f);
                }
            }
        }
        return jzs.m4715a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7849a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("FeatureTableStats[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

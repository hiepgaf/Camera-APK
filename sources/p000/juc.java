package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: juc */
public final class juc extends jtn {
    /* renamed from: b */
    private final jza f21910b;
    /* renamed from: c */
    private final int f21911c;

    public juc(FeatureTable featureTable, jza jza) {
        boolean z = true;
        super(featureTable);
        jri.m13152b((Object) jza);
        if (jza.f8127A != 1) {
            z = false;
        }
        jri.m13143a(z);
        this.f21910b = jza;
        this.f21911c = 0;
    }

    public juc(FeatureTable featureTable, jza jza, int i) {
        boolean z;
        boolean z2 = true;
        super(featureTable);
        jri.m13152b((Object) jza);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i >= jza.f8127A) {
            z2 = false;
        }
        jri.m13143a(z2);
        this.f21910b = jza;
        this.f21911c = i;
    }

    /* renamed from: a */
    public final jzf mo3178a(long j, jky jky) {
        return new jzc(jky.m4525a(this.f21910b).getValueAt(this.f21911c, new int[0]));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21910b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
        stringBuilder.append("SingleFeatureScorer[type=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

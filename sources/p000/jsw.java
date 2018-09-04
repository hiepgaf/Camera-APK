package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jsw */
public class jsw {
    /* renamed from: a */
    public final jry f7951a;
    /* renamed from: b */
    public final jry f7952b;
    /* renamed from: c */
    public final jtf f7953c;
    /* renamed from: d */
    public final jrg f7954d;
    /* renamed from: e */
    public final jxm f7955e;
    /* renamed from: f */
    public final int f7956f;
    /* renamed from: g */
    public final FeatureTable f7957g;

    public jsw(jrg jrg, jxm jxm, FeatureTable featureTable, jry jry, jry jry2, jtf jtf, int i) {
        boolean z;
        jri.m13152b((Object) jxm);
        jri.m13152b((Object) featureTable);
        jri.m13152b((Object) jry);
        jri.m13152b((Object) jry2);
        jri.m13152b((Object) jtf);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f7954d = jrg;
        this.f7955e = jxm;
        this.f7957g = featureTable;
        this.f7951a = jry;
        this.f7952b = jry2;
        this.f7953c = jtf;
        this.f7956f = i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f7951a);
        String valueOf2 = String.valueOf(this.f7952b);
        String valueOf3 = String.valueOf(this.f7953c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 104) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("SummaryFeatureExtractor[parallelMetadataExtractor=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", serialMetadataExtractor=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", parallelFeatureExtractor=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

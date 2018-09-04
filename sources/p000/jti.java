package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jti */
public final class jti implements jtv {
    /* renamed from: a */
    private final float f19030a;
    /* renamed from: b */
    private final List f19031b;
    /* renamed from: c */
    private final float[] f19032c;
    /* renamed from: d */
    private final float[] f19033d;
    /* renamed from: e */
    private final float[] f19034e;
    /* renamed from: f */
    private jtv[] f19035f;
    /* renamed from: g */
    private final List f19036g;

    jti(List list, float f, List list2, float[] fArr, float[] fArr2, float[] fArr3) {
        this.f19036g = list;
        this.f19030a = f;
        this.f19032c = fArr;
        this.f19033d = fArr2;
        this.f19034e = fArr3;
        this.f19031b = ken.m13458a((Collection) list2);
        if (this.f19033d.length != this.f19034e.length) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Dimensionality of normalization means doesn't match standard deviations: %d vs. %d", new Object[]{Integer.valueOf(this.f19033d.length), Integer.valueOf(this.f19034e.length)}));
        }
        int size = this.f19036g.size();
        if (size != this.f19033d.length) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Dimensionality of features doesn't match normalization data: %d vs. %d", new Object[]{Integer.valueOf(this.f19036g.size()), Integer.valueOf(this.f19033d.length)}));
        } else if (this.f19032c.length != this.f19031b.size() + size) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Dimensionality of weight vector does not match total number of features: %d vs. %d", new Object[]{Integer.valueOf(this.f19032c.length), Integer.valueOf(size + this.f19031b.size())}));
        }
    }

    /* renamed from: a */
    public static jtj m13195a(jtl jtl) {
        return new jtj(jtl);
    }

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        float f;
        jri.m13152b(this.f19032c);
        jri.m13152b(this.f19033d);
        jri.m13152b(this.f19034e);
        if (this.f19035f == null) {
            this.f19035f = new jtv[this.f19036g.size()];
            int i = 0;
            for (kbn b : this.f19036g) {
                this.f19035f[i] = (jtv) b.mo605b();
                i++;
            }
        }
        float[] fArr = new float[this.f19032c.length];
        int i2 = 0;
        while (true) {
            jtv[] jtvArr = this.f19035f;
            if (i2 >= jtvArr.length) {
                break;
            }
            fArr[i2] = (jtvArr[i2].mo2049a(j).mo2076a() - this.f19033d[i2]) / this.f19034e[i2];
            i2++;
        }
        for (int i3 = 0; i3 < this.f19031b.size(); i3++) {
            int length = this.f19035f.length + i3;
            jto jto = (jto) this.f19031b.get(i3);
            boolean z = jto.f7968a == jtp.ABS ? jto.f7971d : true;
            jri.m13143a(z);
            f = fArr[jto.f7969b];
            if (jto.f7971d) {
                f = Math.abs(f);
            }
            switch (jto.f7968a.ordinal()) {
                case 0:
                    f *= fArr[jto.f7970c];
                    break;
                case 1:
                    f = (float) ((2.0d / (Math.exp((double) ((jto.f7972e - f) * jto.f7973f)) + 1.0d)) - 4.0d);
                    break;
                default:
                    break;
            }
            fArr[length] = f;
        }
        f = this.f19030a;
        for (i2 = 0; i2 < fArr.length; i2++) {
            f += fArr[i2] * this.f19032c[i2];
        }
        return new jzc(f);
    }

    /* renamed from: b */
    public final void mo2051b(long j) {
    }

    /* renamed from: c */
    public final void mo2052c(long j) {
    }

    /* renamed from: a */
    public final void mo2050a() {
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f19035f);
        float f = this.f19030a;
        String arrays2 = Arrays.toString(this.f19032c);
        String arrays3 = Arrays.toString(this.f19033d);
        String arrays4 = Arrays.toString(this.f19034e);
        String valueOf = String.valueOf(this.f19031b);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        int length3 = String.valueOf(arrays3).length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 101) + length2) + length3) + String.valueOf(arrays4).length()) + String.valueOf(valueOf).length());
        stringBuilder.append("ExplicitNonlinearScorer[scorers=");
        stringBuilder.append(arrays);
        stringBuilder.append(", bias=");
        stringBuilder.append(f);
        stringBuilder.append(", weights=");
        stringBuilder.append(arrays2);
        stringBuilder.append(", normMeans=");
        stringBuilder.append(arrays3);
        stringBuilder.append(", normDevs=");
        stringBuilder.append(arrays4);
        stringBuilder.append(", transforms=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

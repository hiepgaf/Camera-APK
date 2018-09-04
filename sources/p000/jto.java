package p000;

/* compiled from: PG */
/* renamed from: jto */
public final class jto {
    /* renamed from: a */
    public final jtp f7968a;
    /* renamed from: b */
    public final int f7969b;
    /* renamed from: c */
    public final int f7970c;
    /* renamed from: d */
    public final boolean f7971d;
    /* renamed from: e */
    public final float f7972e;
    /* renamed from: f */
    public final float f7973f;

    private jto(jtp jtp, int i, int i2, boolean z, float f, float f2) {
        this.f7968a = jtp;
        this.f7969b = i;
        this.f7970c = i2;
        this.f7971d = z;
        this.f7972e = f;
        this.f7973f = f2;
    }

    /* renamed from: a */
    public static jto m4634a(int i) {
        return new jto(jtp.ABS, i, -1, true, 0.0f, 1.0f);
    }

    /* renamed from: a */
    public static jto m4636a(int i, int i2, boolean z) {
        return new jto(jtp.MUL, i, i2, z, 0.0f, 1.0f);
    }

    /* renamed from: a */
    public static jto m4635a(int i, float f, float f2) {
        return new jto(jtp.SIGMOID, i, -1, true, f, f2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7968a);
        int i = this.f7969b;
        int i2 = this.f7970c;
        boolean z = this.f7971d;
        float f = this.f7972e;
        float f2 = this.f7973f;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 148);
        stringBuilder.append("FeatureTransform[transform=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", index=");
        stringBuilder.append(i);
        stringBuilder.append(", crossIndex=");
        stringBuilder.append(i2);
        stringBuilder.append(", absolute=");
        stringBuilder.append(z);
        stringBuilder.append(", sigmoidOffset=");
        stringBuilder.append(f);
        stringBuilder.append(", sigmoidScale=");
        stringBuilder.append(f2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

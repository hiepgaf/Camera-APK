package p000;

/* compiled from: PG */
/* renamed from: jen */
public final class jen {
    /* renamed from: b */
    private static final jhv f7745b = jhv.m4495a(33321, 36756, 33325, 33326, 33330, 33329, 33332, 33331, 33334, 33333, 33323, 36757, 33327, 33328, 33336, 33335, 33338, 33337, 33340, 33339, 32849, 35905, 36194, 36758, 35898, 35901, 34843, 34837, 36221, 36239, 36215, 36233, 36209, 36227, 32856, 35907, 36759, 32855, 32854, 32857, 34842, 34836, 36220, 36238, 36975, 36214, 36232, 36226, 36208);
    /* renamed from: c */
    private static final jhv f7746c = jhv.m4495a(33321, 36756, 33325, 33323, 36757, 33327, 32849, 35905, 36194, 36758, 35898, 35901, 34843, 32856, 35907, 36759, 32855, 32854, 32857, 34842);
    /* renamed from: d */
    private static final int[][][][] f7747d;
    /* renamed from: a */
    public final int f7748a;

    static {
        jhv.m4495a(33321, 33330, 33329, 33332, 33331, 33334, 33333, 33323, 33336, 33335, 33338, 33337, 33340, 33339, 32849, 36194, 32856, 35907, 32855, 32854, 32857, 36220, 36238, 36975, 36214, 36232, 36226, 36208);
        r0 = new int[4][][][];
        int[][][] iArr = new int[2][][];
        r2 = new int[2][];
        r2[0] = new int[]{33329, 33331, 33333};
        r2[1] = new int[]{33330, 33332, 33334};
        iArr[0] = r2;
        r2 = new int[2][];
        r2[0] = new int[]{0, 33325, 33326};
        r2[1] = new int[]{0, 0, 0};
        iArr[1] = r2;
        r0[0] = iArr;
        iArr = new int[2][][];
        r2 = new int[2][];
        r2[0] = new int[]{33335, 33337, 33339};
        r2[1] = new int[]{33336, 33338, 33340};
        iArr[0] = r2;
        r2 = new int[2][];
        r2[0] = new int[]{0, 33327, 33328};
        r2[1] = new int[]{0, 0, 0};
        iArr[1] = r2;
        r0[1] = iArr;
        iArr = new int[2][][];
        r2 = new int[2][];
        r2[0] = new int[]{36239, 36233, 36227};
        r2[1] = new int[]{36221, 36215, 36209};
        iArr[0] = r2;
        r2 = new int[2][];
        r2[0] = new int[]{0, 34843, 34837};
        r2[1] = new int[]{0, 0, 0};
        iArr[1] = r2;
        r0[2] = iArr;
        iArr = new int[2][][];
        r2 = new int[2][];
        r2[0] = new int[]{36238, 36232, 36226};
        r2[1] = new int[]{36220, 36214, 36208};
        iArr[0] = r2;
        r2 = new int[2][];
        r2[0] = new int[]{0, 34842, 34836};
        r2[1] = new int[]{0, 0, 0};
        iArr[1] = r2;
        r0[3] = iArr;
        f7747d = r0;
    }

    private jen(int i) {
        boolean a = f7745b.m4496a(i);
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("Not a valid GL sized format: ");
        stringBuilder.append(i);
        jri.m13144a(a, stringBuilder.toString());
        this.f7748a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jen)) {
            return false;
        }
        if (this.f7748a != ((jen) obj).f7748a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static jen m4431a(jdc jdc) {
        int i;
        int i2 = 1;
        int i3 = 0;
        jcg jcg = jdc.f18734c;
        int length = jdc.f18733b.length;
        switch (jcg.mo1986b() - 1) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                if (jcg.mo3164a() == 8) {
                    switch (length) {
                        case 1:
                            return new jen(33321);
                        case 2:
                            return new jen(33323);
                        case 3:
                            return new jen(32849);
                        case 4:
                            return new jen(32856);
                        default:
                            StringBuilder stringBuilder = new StringBuilder(40);
                            stringBuilder.append("Unsupported channel count '");
                            stringBuilder.append(length);
                            stringBuilder.append("'!");
                            throw new jeo(stringBuilder.toString());
                    }
                }
                i2 = jcg.mo3164a();
                StringBuilder stringBuilder2 = new StringBuilder(46);
                stringBuilder2.append("Unsupported normalized bit size '");
                stringBuilder2.append(i2);
                stringBuilder2.append("'!");
                throw new jeo(stringBuilder2.toString());
            default:
                String d = jcg.mo3165d();
                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(d).length() + 18);
                stringBuilder3.append("Unsupported type ");
                stringBuilder3.append(d);
                stringBuilder3.append("!");
                throw new jeo(stringBuilder3.toString());
        }
        int c = jcg.mo1987c() ^ 1;
        switch (jcg.mo3164a()) {
            case 8:
                i2 = 0;
                break;
            case 16:
                break;
            case 32:
                i2 = 2;
                break;
            default:
                i2 = -1;
                break;
        }
        if (i2 >= 0) {
            i3 = f7747d[length - 1][i][c][i2];
        }
        if (i3 != 0) {
            return new jen(i3);
        }
        d = String.valueOf(jcg);
        stringBuilder3 = new StringBuilder(String.valueOf(d).length() + 27);
        stringBuilder3.append("Unsupported format type '");
        stringBuilder3.append(d);
        stringBuilder3.append("'!");
        throw new jeo(stringBuilder3.toString());
    }

    public final int hashCode() {
        return this.f7748a;
    }

    /* renamed from: a */
    public final boolean m4432a() {
        return f7746c.m4496a(this.f7748a);
    }

    public final String toString() {
        int i = this.f7748a;
        StringBuilder stringBuilder = new StringBuilder(21);
        stringBuilder.append("GLFormat[");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

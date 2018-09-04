package p000;

/* compiled from: PG */
/* renamed from: ind */
public enum ind {
    MPEG_4(2, 0, ixx.MPEG4),
    WEBM(9, 1, ixx.WEBM),
    THREE_GPP(1, -1, ixx.THREE_GPP);
    
    /* renamed from: a */
    public final int f7148a;
    /* renamed from: b */
    public final int f7149b;
    /* renamed from: c */
    public final ixx f7150c;

    private ind(int i, int i2, ixx ixx) {
        this.f7148a = i;
        this.f7149b = i2;
        this.f7150c = ixx;
    }

    /* renamed from: a */
    public static boolean m3877a(ioa ioa) {
        int e = ioa.mo3130e();
        if (e == 2 || e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static ind m3878b(ioa ioa) {
        jri.m13143a(ind.m3877a(ioa));
        int e = ioa.mo3130e();
        switch (e) {
            case 1:
                return THREE_GPP;
            case 2:
                return MPEG_4;
            default:
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("file format is not supported: ");
                stringBuilder.append(e);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

package p000;

/* compiled from: PG */
/* renamed from: inv */
public enum inv implements inu {
    H263("video/3gpp"),
    H264("video/avc"),
    MPEG_4_SP("video/mp4v-es"),
    HEVC("video/hevc");
    
    /* renamed from: a */
    public final String f18402a;

    private inv(String str) {
        this.f18402a = str;
    }

    /* renamed from: a */
    public final String mo1898a() {
        return this.f18402a;
    }

    /* renamed from: a */
    public static inv m12311a(int i) {
        switch (i) {
            case 1:
                return H263;
            case 2:
                return H264;
            case 3:
                return MPEG_4_SP;
            case 5:
                return HEVC;
            default:
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Unsupported video codec type: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

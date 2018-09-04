package p000;

/* compiled from: PG */
/* renamed from: inq */
public enum inq implements inu {
    AMR_NB("audio/3gpp"),
    AMR_WB("audio/amr-wb"),
    AAC("audio/mp4a-latm"),
    HE_AAC("audio/mp4a-latm"),
    AAC_ELD("audio/mp4a-latm");
    
    /* renamed from: a */
    public final String f18396a;

    private inq(String str) {
        this.f18396a = str;
    }

    /* renamed from: a */
    public final String mo1898a() {
        return this.f18396a;
    }

    /* renamed from: a */
    public static inq m12309a(int i) {
        switch (i) {
            case 1:
                return AMR_NB;
            case 2:
                return AMR_WB;
            case 3:
                return AAC;
            case 4:
                return HE_AAC;
            case 5:
                return AAC_ELD;
            default:
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Unsupported audio codec type: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

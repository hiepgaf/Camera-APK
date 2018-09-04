package p000;

/* compiled from: PG */
/* renamed from: iut */
public enum iut {
    FRONT,
    BACK,
    EXTERNAL;

    /* renamed from: a */
    public static String m4257a(iut iut) {
        switch (iut.ordinal()) {
            case 0:
                return "front";
            case 1:
                return "back";
            case 2:
                return "external";
            default:
                return "unknown";
        }
    }
}

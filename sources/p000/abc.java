package p000;

/* compiled from: PG */
/* renamed from: abc */
public enum abc {
    AUTO,
    CONTINUOUS_PICTURE,
    CONTINUOUS_VIDEO,
    EXTENDED_DOF,
    FIXED,
    INFINITY,
    MACRO;

    /* renamed from: a */
    public static abc m44a(String str) {
        return (abc) Enum.valueOf(abc.class, str);
    }
}

package p000;

/* compiled from: PG */
/* renamed from: abb */
public enum abb {
    NO_FLASH,
    AUTO,
    OFF,
    ON,
    TORCH,
    RED_EYE;

    /* renamed from: a */
    public static abb m43a(String str) {
        return (abb) Enum.valueOf(abb.class, str);
    }
}

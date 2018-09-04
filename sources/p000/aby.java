package p000;

/* compiled from: PG */
/* renamed from: aby */
public final class aby {
    /* renamed from: a */
    private static final int f180a = 14;
    /* renamed from: b */
    private final String f181b;

    public aby(String str) {
        int length = str.length() - f180a;
        if (length > 0) {
            aby aby = abx.f179a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tag ");
            stringBuilder.append(str);
            stringBuilder.append(" is ");
            stringBuilder.append(length);
            stringBuilder.append(" chars longer than limit.");
            abx.m91e(aby, stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("CAM2PORT_");
        if (length > 0) {
            str = str.substring(0, f180a);
        }
        stringBuilder2.append(str);
        this.f181b = stringBuilder2.toString();
    }

    public final String toString() {
        return this.f181b;
    }
}

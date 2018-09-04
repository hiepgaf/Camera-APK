package p000;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jdi */
public final class jdi extends jdv {
    private jdi(jdo jdo, jaq jaq) {
        super(jdo, jaq);
    }

    /* renamed from: a */
    public static jdi m17947a(jdo jdo, ByteBuffer byteBuffer) {
        return new jdi(jdo, jdv.m17630a(jdo, new jdj(jdo, byteBuffer)));
    }

    public final String toString() {
        String jet = ((jet) m17634d()).toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(jet).length() + 10);
        stringBuilder.append("GLBuffer{");
        stringBuilder.append(jet);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

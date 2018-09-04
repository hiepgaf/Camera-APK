package p000;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: iom */
public final class iom extends IOException {
    public iom(String str, String str2, int i, Throwable th) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 39) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" with file path ");
        stringBuilder.append(str2);
        stringBuilder.append(" and format ");
        stringBuilder.append(i);
        super(stringBuilder.toString(), th);
    }
}

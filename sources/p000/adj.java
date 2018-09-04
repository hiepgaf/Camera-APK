package p000;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: adj */
public final class adj extends IOException {
    public static final long serialVersionUID = 1;

    public adj(int i) {
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("Http request failed with status code: ");
        stringBuilder.append(i);
        this(stringBuilder.toString(), '\u0000');
    }

    public adj(String str) {
        this(str, '\u0000');
    }

    private adj(String str, byte b) {
        super(str, null);
    }

    public adj(String str, char c) {
        this(str, (byte) 0);
    }

    public adj(String str, inu inu, Throwable th) {
        String valueOf = String.valueOf(inu);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(valueOf).length());
        stringBuilder.append(str);
        stringBuilder.append(" with mime ");
        stringBuilder.append(valueOf);
        super(stringBuilder.toString(), th);
    }
}

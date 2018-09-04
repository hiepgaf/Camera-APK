package p000;

import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: bsu */
public final class bsu {
    /* renamed from: a */
    private static final Pattern f1510a = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    static {
        Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }

    /* renamed from: a */
    public static boolean m955a(String str) {
        return str != null && f1510a.matcher(str).matches();
    }
}

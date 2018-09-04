package p000;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: abe */
public final class abe {
    /* renamed from: a */
    public static abb m46a(String str) {
        if (str == null) {
            return abb.values()[0];
        }
        try {
            return abb.m43a(abe.m50e(str));
        } catch (IllegalArgumentException e) {
            return abb.values()[0];
        }
    }

    /* renamed from: b */
    public static abc m47b(String str) {
        if (str == null) {
            return abc.values()[0];
        }
        try {
            return abc.m44a(abe.m50e(str));
        } catch (IllegalArgumentException e) {
            return abc.values()[0];
        }
    }

    /* renamed from: c */
    public static abd m48c(String str) {
        if (str == null) {
            return abd.values()[0];
        }
        try {
            return abd.m45a(abe.m50e(str));
        } catch (IllegalArgumentException e) {
            return abd.values()[0];
        }
    }

    /* renamed from: d */
    static String m49d(String str) {
        return str.toLowerCase(Locale.US).replaceAll("_", "-");
    }

    /* renamed from: e */
    private static String m50e(String str) {
        return str.toUpperCase(Locale.US).replaceAll("-", "_");
    }
}

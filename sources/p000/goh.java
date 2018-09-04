package p000;

import java.util.HashMap;

/* compiled from: PG */
/* renamed from: goh */
final class goh {
    /* renamed from: a */
    private static HashMap f5594a = new HashMap();

    goh() {
    }

    /* renamed from: a */
    public static String m2656a(String str) {
        goi goi = (goi) f5594a.get(str);
        if (goi == null) {
            return null;
        }
        return goi.f5595a;
    }

    /* renamed from: b */
    public static String[] m2658b(String str) {
        goi goi = (goi) f5594a.get(str);
        if (goi == null) {
            return new String[0];
        }
        return goi.f5596b;
    }

    /* renamed from: a */
    public static void m2657a(String str, String str2, String[] strArr) {
        f5594a.put(str, new goi(str2, strArr));
    }
}

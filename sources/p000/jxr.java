package p000;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jxr */
public final class jxr {
    /* renamed from: a */
    private static final jxy f8075a = new jxu(jxx.m4690b());
    /* renamed from: b */
    private static final jxy f8076b = new jxu(jxx.m4689a());

    /* renamed from: a */
    public static jxy m4678a() {
        return new jxq(f8076b, f8075a);
    }

    /* renamed from: a */
    public static jxy m4679a(jxm jxm) {
        List arrayList = new ArrayList();
        for (jxa a : jxm.m4671a()) {
            arrayList.add(Long.valueOf(((Long) a.m4665a(jxa.f8044a)).longValue()));
        }
        return new jyb(jxr.m4678a(), arrayList);
    }

    /* renamed from: a */
    public static String m4677a(long j) {
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("frame-");
        stringBuilder.append(j);
        stringBuilder.append(".jpg");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public static String m4680b(long j) {
        StringBuilder stringBuilder = new StringBuilder(38);
        stringBuilder.append("med-res-frame-");
        stringBuilder.append(j);
        stringBuilder.append(".jpg");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public static jxy m4681b() {
        return new jxu(jxx.m4691c());
    }

    /* renamed from: a */
    public static String m4676a(int i, long j, String str, boolean z, boolean z2, boolean z3, String str2) {
        String format = new SimpleDateFormat(str2).format(Long.valueOf(j));
        if (z2) {
            Locale locale = Locale.US;
            r2 = new Object[4];
            Integer valueOf = Integer.valueOf(i);
            r2[0] = valueOf;
            r2[1] = "XTR";
            r2[2] = valueOf;
            r2[3] = format;
            return String.format(locale, "%05d%s_%05d_BURST%s", r2);
        }
        String str3;
        Locale locale2 = Locale.US;
        Object[] objArr = new Object[6];
        Integer valueOf2 = Integer.valueOf(i);
        objArr[0] = valueOf2;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        if (z3) {
            str3 = "PORTRAIT";
        } else {
            str3 = "IMG";
        }
        objArr[2] = str3;
        objArr[3] = valueOf2;
        objArr[4] = format;
        if (z) {
            str3 = "_COVER";
        } else {
            str3 = "";
        }
        objArr[5] = str3;
        return String.format(locale2, "%05d%s%s_%05d_BURST%s%s", objArr);
    }

    /* renamed from: a */
    public static String m4675a(int i, long j, String str, boolean z, boolean z2) {
        return jxr.m4676a(i, j, str, z, z2, false, "yyyyMMddHHmmss");
    }

    /* renamed from: c */
    public static String m4682c() {
        return "sb_video_temp.mp4";
    }
}

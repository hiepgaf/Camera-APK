package p000;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: coc */
final class coc {
    /* renamed from: a */
    private static final SimpleDateFormat f2225a = new SimpleDateFormat("yyyyMMddHHmmss");

    /* renamed from: a */
    static String m1212a(jip jip, long j) {
        String str;
        String format = f2225a.format(Long.valueOf(j));
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        jiy a = jiy.m4515a(jip.f18840a);
        switch (a.ordinal()) {
            case 0:
                str = "Burst_Cover_Collage";
                break;
            case 1:
                str = "Burst_Cover_GIF_Action";
                break;
            case 2:
                str = "Burst_Cover_Collage";
                break;
            case 3:
                str = "Burst_Cover_Group_Smiles";
                break;
            case 4:
                str = "Burst_Cover_Video";
                break;
            default:
                str = String.valueOf(a);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
                stringBuilder.append("No known file prefix for creation type ");
                stringBuilder.append(str);
                throw new RuntimeException(stringBuilder.toString());
        }
        objArr[0] = str;
        objArr[1] = format;
        return String.format(locale, "%s_%s", objArr);
    }

    /* renamed from: a */
    static File m1211a(File file) {
        return new File(file, ".medresframes");
    }
}

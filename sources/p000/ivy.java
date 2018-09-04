package p000;

import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: ivy */
public final class ivy {
    /* renamed from: a */
    public final boolean f7505a;
    /* renamed from: b */
    public final boolean f7506b;
    /* renamed from: c */
    public final boolean f7507c;
    /* renamed from: d */
    public final boolean f7508d;
    /* renamed from: e */
    public final boolean f7509e;
    /* renamed from: f */
    public final boolean f7510f;
    /* renamed from: g */
    public final boolean f7511g;
    /* renamed from: h */
    public final boolean f7512h;
    /* renamed from: i */
    public final boolean f7513i;
    /* renamed from: j */
    public final boolean f7514j;

    private ivy(long j) {
        boolean z;
        boolean z2 = true;
        if (j == -2398083415379664855L) {
            z = true;
        } else {
            z = false;
        }
        this.f7505a = z;
        if (j == 1938362633813361533L) {
            z = true;
        } else {
            z = false;
        }
        this.f7506b = z;
        if (j == -1181909560337748989L) {
            z = true;
        } else {
            z = false;
        }
        this.f7507c = z;
        if (j == 2353878190013225779L) {
            z = true;
        } else {
            z = false;
        }
        this.f7509e = z;
        if (j == 5177423953723387160L) {
            z = true;
        } else {
            z = false;
        }
        this.f7508d = z;
        if (j == -1520579938770587849L) {
            z = true;
        } else {
            z = false;
        }
        this.f7510f = z;
        if (j == 1998349393618216766L) {
            z = true;
        } else {
            z = false;
        }
        this.f7511g = z;
        if (j == -3048193804805810922L) {
            z = true;
        } else {
            z = false;
        }
        this.f7512h = z;
        if (j == -1134170917312626182L) {
            z = true;
        } else {
            z = false;
        }
        this.f7513i = z;
        if (j != 7819589124620182093L) {
            z2 = false;
        }
        this.f7514j = z2;
    }

    /* renamed from: a */
    public static ivy m4269a() {
        int i = 0;
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.FINGERPRINT;
        str = ivy.m4270a(str);
        String a = ivy.m4270a(str2);
        str2 = ivy.m4270a(str3);
        if (a.startsWith("GENERIC") || str2.startsWith("GENERIC") || str2.contains("SDK_") || str2.contains("_SDK")) {
            return new ivy(-8977428044353436645L);
        }
        boolean z;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 34) + String.valueOf(str).length());
        stringBuilder.append("G1V5VHBME0Mq6trmUxb9Q9URJXm0Sof1|");
        stringBuilder.append(a);
        stringBuilder.append("|");
        stringBuilder.append(str);
        str = stringBuilder.toString();
        kif a2 = kih.m4956a();
        CharSequence toUpperCase = str.toUpperCase(Locale.ROOT);
        int length = toUpperCase.length();
        int i2 = length + length;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13145a(z, "expectedInputSize must be >= 0 but was %s", i2);
        kig a3 = a2.mo2180a();
        int length2 = toUpperCase.length();
        while (i < length2) {
            a3.mo2173a(toUpperCase.charAt(i));
            i++;
        }
        return new ivy(a3.mo3245a().mo2177c());
    }

    /* renamed from: a */
    private static String m4270a(String str) {
        return str != null ? str.toUpperCase(Locale.ROOT) : "unknown";
    }
}

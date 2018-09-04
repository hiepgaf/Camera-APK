package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dkt */
public final class dkt {
    /* renamed from: a */
    private static final String f3118a = bli.m862a("CdrVidSnapSizePkr");

    /* renamed from: a */
    public static kbg m1652a(inc inc, ine ine, List list) {
        ine ine2 = ine.RES_2160P;
        iqp iqp = new iqp(0, 0);
        iqp iqp2 = iqp;
        for (iqp iqp3 : list) {
            String str = f3118a;
            String valueOf = String.valueOf(iqp3);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append("supportedImageSize = ");
            stringBuilder.append(valueOf);
            bli.m871d(str, stringBuilder.toString());
            if (ipz.m4019b(iqp3).equals(ipz.m4019b(ine.m3881c())) && ((!(ine == ine2 || inc == inc.FPS_60) || iqp3.m4046a() <= ine.m3880b()) && iqp3.m4046a() > iqp2.m4046a())) {
                iqp2 = iqp3;
            }
        }
        if (iqp2.m4046a() != 0) {
            return kbg.m4745c(iqp2);
        }
        return kau.f19138a;
    }
}

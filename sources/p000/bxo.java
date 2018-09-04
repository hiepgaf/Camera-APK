package p000;

import android.annotation.TargetApi;
import java.io.File;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bxo */
public final class bxo implements iqs {
    /* renamed from: a */
    public final /* synthetic */ Object mo594a() {
        return new bwr();
    }

    /* renamed from: a */
    public static void m7846a(String str, int i, int i2, iwp iwp) {
        String str2;
        StringBuilder stringBuilder = new StringBuilder(26);
        stringBuilder.append("  Result frame ");
        stringBuilder.append(i2);
        String stringBuilder2 = stringBuilder.toString();
        switch (i) {
            case 0:
                str2 = "unknown_actual_hal3.txt";
                break;
            case 1:
                str2 = "metering_burst_actual_hal3.txt";
                break;
            case 2:
                str2 = "payload_burst_actual_hal3.txt";
                break;
            case 4:
                str2 = "viewfinder_actual_hal3.txt";
                break;
            default:
                str2 = "unknown_actual_hal3.txt";
                break;
        }
        axf.m729a(stringBuilder2, iwp, new File(str, str2));
    }
}

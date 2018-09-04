package p000;

import android.widget.Toast;

/* renamed from: eyr */
final /* synthetic */ class eyr implements Runnable {
    /* renamed from: a */
    private final eyp f4367a;
    /* renamed from: b */
    private final eyx f4368b;

    eyr(eyp eyp, eyx eyx) {
        this.f4367a = eyp;
        this.f4368b = eyx;
    }

    public final void run() {
        eyx eyx = this.f4368b;
        String str = eyx.f4369a;
        String str2 = eyx.f4370b;
        String str3 = eyx.f4371c;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 28) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("Started: ");
        stringBuilder.append(str);
        stringBuilder.append(", ended: ");
        stringBuilder.append(str2);
        stringBuilder.append(", CANCEL: ");
        stringBuilder.append(str3);
        Toast.makeText(null, stringBuilder.toString(), 0).show();
    }
}

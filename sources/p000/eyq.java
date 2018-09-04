package p000;

import android.widget.Toast;

/* renamed from: eyq */
final /* synthetic */ class eyq implements Runnable {
    /* renamed from: a */
    private final eyp f4365a;
    /* renamed from: b */
    private final eyx f4366b;

    eyq(eyp eyp, eyx eyx) {
        this.f4365a = eyp;
        this.f4366b = eyx;
    }

    public final void run() {
        eyx eyx = this.f4366b;
        String str = eyx.f4369a;
        String str2 = eyx.f4370b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(str2).length());
        stringBuilder.append("Started: ");
        stringBuilder.append(str);
        stringBuilder.append(", ended: ");
        stringBuilder.append(str2);
        Toast.makeText(null, stringBuilder.toString(), 0).show();
    }
}

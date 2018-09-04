package p000;

import com.google.android.GoogleCamera.R;

/* renamed from: bne */
final /* synthetic */ class bne implements Runnable {
    /* renamed from: a */
    private final bnh f1334a;
    /* renamed from: b */
    private final bnk f1335b;

    bne(bnh bnh, bnk bnk) {
        this.f1334a = bnh;
        this.f1335b = bnk;
    }

    public final void run() {
        bnh bnh = this.f1334a;
        bnk bnk = this.f1335b;
        bnh.f1347k = bnk.m7598g();
        if (bnh.f1347k != null) {
            bnh.f1337a.mo2863a(bnh.f1347k);
        } else {
            String valueOf = String.valueOf(bnk.f11070b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
            stringBuilder.append("Error: Could not decode thumbnail image: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("!");
            bli.m866b("BurstController", stringBuilder.toString());
        }
        bnh.f1337a.mo2871a(hci.m11749a((int) R.string.burst_process_creation, new Object[0]));
    }
}

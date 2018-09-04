package p000;

import android.widget.Toast;

/* compiled from: PG */
/* renamed from: bmi */
final class bmi implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f1315a;
    /* renamed from: b */
    private final /* synthetic */ int f1316b;
    /* renamed from: c */
    private final /* synthetic */ bmh f1317c;

    bmi(bmh bmh, String str, int i) {
        this.f1317c = bmh;
        this.f1315a = str;
        this.f1316b = i;
    }

    public final void run() {
        Toast.makeText(this.f1317c.f1313a, this.f1315a, this.f1316b).show();
    }
}

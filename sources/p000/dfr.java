package p000;

import android.app.AlertDialog;

/* compiled from: PG */
/* renamed from: dfr */
final class dfr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ des f3038a;

    dfr(des des) {
        this.f3038a = des;
    }

    public final void run() {
        AlertDialog alertDialog = this.f3038a.f22803K;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        alertDialog = this.f3038a.f22804L;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }
}

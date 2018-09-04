package p000;

import android.support.v7.app.AlertController;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: lw */
public final class lw implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ AlertController f8809a;

    public lw(AlertController alertController) {
        this.f8809a = alertController;
    }

    public final void onClick(View view) {
        AlertController alertController = this.f8809a;
        alertController.f627u.obtainMessage(1, alertController.f608b).sendToTarget();
    }
}

package p000;

import android.app.AlertDialog.Builder;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dfe */
final class dfe implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ des f3027a;

    dfe(des des) {
        this.f3027a = des;
    }

    public final void run() {
        Builder builder = new Builder(this.f3027a.f22830p.mo2748b(), 16974546);
        builder.setPositiveButton(R.string.dialog_ok, new dff(this));
        builder.setNegativeButton(R.string.dialog_cancel, new dfg());
        builder.setMessage(R.string.photosphere_fisheye_confirm_dialog);
        builder.setCancelable(true);
        this.f3027a.f22804L = builder.create();
        this.f3027a.f22804L.show();
    }
}

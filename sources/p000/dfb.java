package p000;

import android.app.AlertDialog.Builder;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dfb */
final class dfb implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ des f3025a;

    dfb(des des) {
        this.f3025a = des;
    }

    public final void run() {
        Builder builder = new Builder(this.f3025a.f22830p.mo2748b(), 16974546);
        builder.setPositiveButton(R.string.dialog_ok, new dfc(this));
        builder.setNegativeButton(R.string.dialog_cancel, new dfd());
        if (this.f3025a.ao.mo2860b() == hhx.PHOTO_SPHERE) {
            builder.setMessage(R.string.cancel_photo_sphere);
        } else {
            builder.setMessage(R.string.cancel_panorama);
        }
        builder.setCancelable(true);
        this.f3025a.f22803K = builder.create();
        this.f3025a.f22803K.show();
    }
}

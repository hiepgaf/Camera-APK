package p000;

import android.app.AlertDialog.Builder;
import com.google.android.GoogleCamera.R;

/* renamed from: awy */
final /* synthetic */ class awy implements Runnable {
    /* renamed from: a */
    private final aww f991a;
    /* renamed from: b */
    private final int f992b;
    /* renamed from: c */
    private final boolean f993c;

    awy(aww aww, int i, boolean z) {
        this.f991a = aww;
        this.f992b = i;
        this.f993c = z;
    }

    public final void run() {
        aww aww = this.f991a;
        int i = this.f992b;
        boolean z = this.f993c;
        ikd.m12259a();
        Builder onKeyListener = new Builder(aww.f10462a, 16974546).setTitle(aww.f10464c.getString(R.string.camera_error_title)).setMessage(aww.f10464c.getString(i)).setCancelable(false).setOnKeyListener(new awz(aww));
        if (z) {
            onKeyListener.setPositiveButton(aww.f10464c.getString(R.string.dialog_dismiss), aww.f10466e);
        } else {
            onKeyListener.setPositiveButton(aww.f10464c.getString(R.string.camera_menu_settings_label), new axa(aww)).setNegativeButton(aww.f10464c.getString(R.string.dialog_dismiss), aww.f10466e);
        }
        onKeyListener.show();
    }
}

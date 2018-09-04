package p000;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.util.TypedValue;
import com.google.android.GoogleCamera.R;

/* renamed from: bpe */
final /* synthetic */ class bpe implements Runnable {
    /* renamed from: a */
    private final bpd f1371a;
    /* renamed from: b */
    private final boolean f1372b;
    /* renamed from: c */
    private final Activity f1373c;
    /* renamed from: d */
    private final bpl f1374d;
    /* renamed from: e */
    private final Exception f1375e;

    bpe(bpd bpd, boolean z, Activity activity, bpl bpl, Exception exception) {
        this.f1371a = bpd;
        this.f1372b = z;
        this.f1373c = activity;
        this.f1374d = bpl;
        this.f1375e = exception;
    }

    public final void run() {
        bpd bpd = this.f1371a;
        boolean z = this.f1372b;
        Context context = this.f1373c;
        bpl bpl = this.f1374d;
        Exception exception = this.f1375e;
        if (z || bpd.f20133c.get()) {
            int i = bpl.f1391e;
            int i2 = bpl.f1392f;
            OnClickListener bpf = new bpf(bpd, context);
            OnClickListener bpg = new bpg(bpd, context, i2, exception);
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843605, typedValue, true);
            if (!context.isFinishing()) {
                bli.m866b(bpd.f20131a, "Show fatal error dialog");
                new Builder(context, 16974546).setCancelable(false).setTitle(R.string.camera_error_title).setMessage(i).setNegativeButton(R.string.dialog_report, bpg).setPositiveButton(R.string.dialog_dismiss, bpf).setIcon(typedValue.resourceId).show();
            }
        } else if (bpd.f20132b.get()) {
            bpd.m14863a("Activity received an error, but was not running. Executing finish()");
        }
    }
}

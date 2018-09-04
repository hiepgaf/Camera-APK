package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: bpf */
final /* synthetic */ class bpf implements OnClickListener {
    /* renamed from: a */
    private final bpd f1376a;
    /* renamed from: b */
    private final Activity f1377b;

    bpf(bpd bpd, Activity activity) {
        this.f1376a = bpd;
        this.f1377b = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bpd bpd = this.f1376a;
        Activity activity = this.f1377b;
        if (bpd.f20132b.get()) {
            activity.finish();
        }
    }
}

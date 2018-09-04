package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: bpg */
final /* synthetic */ class bpg implements OnClickListener {
    /* renamed from: a */
    private final bpd f1378a;
    /* renamed from: b */
    private final Activity f1379b;
    /* renamed from: c */
    private final int f1380c;
    /* renamed from: d */
    private final Exception f1381d;

    bpg(bpd bpd, Activity activity, int i, Exception exception) {
        this.f1378a = bpd;
        this.f1379b = activity;
        this.f1380c = i;
        this.f1381d = exception;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bpd bpd = this.f1378a;
        Activity activity = this.f1379b;
        new axi(activity).m732a(this.f1380c, this.f1381d);
        if (bpd.f20132b.get()) {
            activity.finish();
        }
    }
}

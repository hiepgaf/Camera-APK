package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
/* renamed from: dlg */
final class dlg implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ dlf f3121a;

    dlg(dlf dlf) {
        this.f3121a = dlf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3121a.f3120a.f22988h = null;
        dialogInterface.dismiss();
        this.f3121a.f3120a.f22991k.mo2745a("Storage full");
    }
}

package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
/* renamed from: djw */
public final class djw implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ hkv f3110a;

    public djw(hkv hkv) {
        this.f3110a = hkv;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3110a.f6321g.m9611c(true);
        dialogInterface.dismiss();
    }
}

package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
/* renamed from: djs */
final class djs implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ djr f3106a;

    djs(djr djr) {
        this.f3106a = djr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3106a.f6321g.m9611c(true);
        dialogInterface.dismiss();
    }
}

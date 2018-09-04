package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
/* renamed from: djt */
final class djt implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ djr f3107a;

    djt(djr djr) {
        this.f3107a = djr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3107a.f6321g.m9611c(true);
        this.f3107a.f6321g.m9606b();
        dialogInterface.dismiss();
    }
}

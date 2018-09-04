package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: gtp */
final class gtp implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ gtm f5688a;

    gtp(gtm gtm) {
        this.f5688a = gtm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5688a.f17321b.startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
    }
}

package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
/* renamed from: dfc */
final class dfc implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ dfb f3026a;

    dfc(dfb dfb) {
        this.f3026a = dfb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        des des = this.f3026a.f3025a;
        ejy ejy = des.f22836v;
        if (ejy == null || ejy.f3744t) {
            bli.m873e(des.f22792c, "Photo is being taken, ignoring user's request for cancel.");
        } else {
            des.m17047n();
        }
    }
}

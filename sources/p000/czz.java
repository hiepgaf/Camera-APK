package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
/* renamed from: czz */
final class czz implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ czw f2903a;

    czz(czw czw) {
        this.f2903a = czw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2903a.f2894b.m707a("CaptureModule: Out of storage space on device.");
    }
}

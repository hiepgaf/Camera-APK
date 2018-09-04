package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

/* renamed from: awz */
final /* synthetic */ class awz implements OnKeyListener {
    /* renamed from: a */
    private final aww f994a;

    awz(aww aww) {
        this.f994a = aww;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        aww aww = this.f994a;
        if (i == 4) {
            aww.m7118b();
        }
        return true;
    }
}

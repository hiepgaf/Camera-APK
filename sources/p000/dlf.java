package p000;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: dlf */
final class dlf implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ dla f3120a;

    dlf(dla dla) {
        this.f3120a = dla;
    }

    public final void run() {
        dla dla = this.f3120a;
        if (dla.f22988h == null) {
            dla.f22988h = dla.f22986f.mo1630d(new dlg(this));
            this.f3120a.f22988h.show();
            ((TextView) this.f3120a.f22988h.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}

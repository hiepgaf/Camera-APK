package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* renamed from: gn */
final class gn extends Handler {
    gn() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        ll llVar = (ll) message.obj;
        switch (message.what) {
            case 1:
                gk gkVar = llVar.f8779a;
                Object obj = llVar.f8780b[0];
                if (gkVar.f5278f.get()) {
                    gkVar.mo1459b();
                } else {
                    gkVar.mo1458a(obj);
                }
                gkVar.f5277e = go.f5565c;
                return;
            case 2:
                gk.m2572c();
                return;
            default:
                return;
        }
    }
}

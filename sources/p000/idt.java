package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: idt */
final class idt extends Handler {
    /* renamed from: a */
    private final /* synthetic */ idr f6943a;

    idt(idr idr, Looper looper) {
        this.f6943a = idr;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ids ids = (ids) message.obj;
                idr idr = this.f6943a;
                idr.f21702a.lock();
                try {
                    if (idr.f21712k == ids.f6942a) {
                        ids.mo1843a();
                        idr.f21702a.unlock();
                        return;
                    }
                    return;
                } finally {
                    idr.f21702a.unlock();
                }
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown message id: ");
                stringBuilder.append(i);
                Log.w("GACStateManager", stringBuilder.toString());
                return;
        }
    }
}

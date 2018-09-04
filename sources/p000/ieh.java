package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: ieh */
final class ieh extends Handler {
    /* renamed from: a */
    private final /* synthetic */ ieg f6973a;

    public ieh(ieg ieg, Looper looper) {
        this.f6973a = ieg;
        super(looper);
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        htl.m3435b(z);
        iej iej = (iej) message.obj;
        Object obj = this.f6973a.f6970a;
        if (obj != null) {
            try {
                iej.mo1853b(obj);
                return;
            } catch (RuntimeException e) {
                iej.mo1852a();
                throw e;
            }
        }
        iej.mo1852a();
    }
}

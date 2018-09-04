package p000;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: PG */
/* renamed from: ht */
final class ht implements Callback {
    /* renamed from: a */
    private final /* synthetic */ hs f6633a;

    ht(hs hsVar) {
        this.f6633a = hsVar;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                hs hsVar = this.f6633a;
                synchronized (hsVar.f6538a) {
                    if (!hsVar.f6540c.hasMessages(1)) {
                        hsVar.f6539b.quit();
                        hsVar.f6539b = null;
                        hsVar.f6540c = null;
                        break;
                    }
                    break;
                }
            case 1:
                hs hsVar2 = this.f6633a;
                ((Runnable) message.obj).run();
                synchronized (hsVar2.f6538a) {
                    hsVar2.f6540c.removeMessages(0);
                    Handler handler = hsVar2.f6540c;
                    handler.sendMessageDelayed(handler.obtainMessage(0), (long) hsVar2.f6541d);
                }
                break;
        }
        return true;
    }
}

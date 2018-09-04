package p000;

import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: PG */
/* renamed from: agr */
final class agr implements Callback {
    agr() {
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((agn) message.obj).mo58e();
        return true;
    }
}

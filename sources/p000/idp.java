package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: idp */
final class idp extends Handler {
    /* renamed from: a */
    private final /* synthetic */ idn f6941a;

    idp(idn idn, Looper looper) {
        this.f6941a = idn;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                idn.m12174b(this.f6941a);
                return;
            case 2:
                idn.m12172a(this.f6941a);
                return;
            default:
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown message id: ");
                stringBuilder.append(i);
                Log.w("GoogleApiClientImpl", stringBuilder.toString());
                return;
        }
    }
}

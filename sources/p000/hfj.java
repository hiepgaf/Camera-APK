package p000;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: hfj */
final class hfj extends Handler {
    /* renamed from: a */
    private final /* synthetic */ hfh f6147a;

    hfj(hfh hfh) {
        this.f6147a = hfh;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            hfh hfh = this.f6147a;
            hfh.m11790a(false, hfh.f17743a - 1);
        }
    }
}

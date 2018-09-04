package p000;

import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: PG */
/* renamed from: aeu */
final class aeu implements Callback {
    /* renamed from: a */
    private final /* synthetic */ aet f363a;

    aeu(aet aet) {
        this.f363a = aet;
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        this.f363a.m197a((aex) message.obj);
        return true;
    }
}

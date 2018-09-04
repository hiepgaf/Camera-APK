package p000;

import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: PG */
/* renamed from: aog */
final class aog implements Callback {
    /* renamed from: a */
    private final /* synthetic */ aod f811a;

    aog(aod aod) {
        this.f811a = aod;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f811a.m521a((aoe) message.obj);
            return true;
        }
        if (message.what == 2) {
            this.f811a.f800c.m6283a((aoe) message.obj);
        }
        return false;
    }
}

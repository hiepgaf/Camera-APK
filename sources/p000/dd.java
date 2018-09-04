package p000;

import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: PG */
/* renamed from: dd */
final class dd implements Callback {
    /* renamed from: a */
    private final /* synthetic */ dc f2996a;

    dd(dc dcVar) {
        this.f2996a = dcVar;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                dc dcVar = this.f2996a;
                df dfVar = (df) message.obj;
                synchronized (dcVar.f2983a) {
                    if (dfVar == null || dfVar == null) {
                        de deVar = (de) dfVar.f3022a.get();
                        if (deVar != null) {
                            dcVar.f2984b.removeCallbacksAndMessages(dfVar);
                            deVar.m1575a();
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }
}

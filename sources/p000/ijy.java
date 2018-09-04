package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: ijy */
public final class ijy {
    /* renamed from: a */
    public static Handler m3789a(ikb ikb, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        ikb.mo1879a(new ijz(handlerThread));
        return new Handler(handlerThread.getLooper());
    }
}

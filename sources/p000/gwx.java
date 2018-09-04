package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: gwx */
final class gwx extends Handler {
    /* renamed from: a */
    private final WeakReference f5736a;

    public gwx(gwv gwv, Looper looper) {
        super(looper);
        this.f5736a = new WeakReference(gwv);
    }

    public final void handleMessage(Message message) {
        gwv gwv = (gwv) this.f5736a.get();
        if (gwv != null) {
            switch (message.what) {
                case 0:
                    gwv.m11626a();
                    gwv.f17503o.mo3415t();
                    return;
                default:
                    return;
            }
        }
    }
}

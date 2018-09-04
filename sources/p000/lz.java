package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: lz */
public final class lz extends Handler {
    /* renamed from: a */
    private WeakReference f8822a;

    public lz(DialogInterface dialogInterface) {
        this.f8822a = new WeakReference(dialogInterface);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case -3:
            case -2:
            case -1:
                ((OnClickListener) message.obj).onClick((DialogInterface) this.f8822a.get(), message.what);
                return;
            case 1:
                ((DialogInterface) message.obj).dismiss();
                return;
            default:
                return;
        }
    }
}

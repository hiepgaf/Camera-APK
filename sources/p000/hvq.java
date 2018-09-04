package p000;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: hvq */
final class hvq extends Handler {
    /* renamed from: a */
    private final /* synthetic */ hvm f6739a;

    public hvq(hvm hvm, Looper looper) {
        this.f6739a = hvm;
        super(looper);
    }

    /* renamed from: a */
    private static void m3529a(Message message) {
        hvr hvr = (hvr) message.obj;
        hvr.mo1779a();
        hvr.m3533c();
    }

    /* renamed from: b */
    private static boolean m3530b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 5;
    }

    public final void handleMessage(Message message) {
        PendingIntent pendingIntent = null;
        if (this.f6739a.f6726k.get() == message.arg1) {
            if (message.what == 1 || message.what == 5) {
                if (!this.f6739a.m3516e()) {
                    hvq.m3529a(message);
                    return;
                }
            }
            if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                this.f6739a.f6722g.mo1781a(connectionResult);
                this.f6739a.m3507a(connectionResult);
            } else if (message.what == 4) {
                this.f6739a.m3506a(4, null);
                hvo hvo = this.f6739a.f6724i;
                if (hvo != null) {
                    hvo.f6737a.mo1224a(message.arg2);
                }
                hvm hvm = this.f6739a;
                hvm.f6716a = message.arg2;
                hvm.f6717b = System.currentTimeMillis();
                this.f6739a.m3512a(4, 1, null);
            } else if (message.what == 2 && !this.f6739a.m3515d()) {
                hvq.m3529a(message);
            } else if (hvq.m3530b(message)) {
                Object obj;
                hvr hvr = (hvr) message.obj;
                synchronized (hvr) {
                    obj = hvr.f6740a;
                    if (hvr.f6741b) {
                        String valueOf = String.valueOf(hvr);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        stringBuilder.append("Callback proxy ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" being reused. This is not safe.");
                        Log.w("GmsClient", stringBuilder.toString());
                    }
                }
                if (obj == null) {
                    hvr.mo1779a();
                } else {
                    try {
                        hvr.mo1780a(obj);
                    } catch (RuntimeException e) {
                        hvr.mo1779a();
                        throw e;
                    }
                }
                synchronized (hvr) {
                    hvr.f6741b = true;
                }
                hvr.m3533c();
            } else {
                int i = message.what;
                StringBuilder stringBuilder2 = new StringBuilder(45);
                stringBuilder2.append("Don't know how to handle message: ");
                stringBuilder2.append(i);
                Log.wtf("GmsClient", stringBuilder2.toString(), new Exception());
            }
        } else if (hvq.m3530b(message)) {
            hvq.m3529a(message);
        }
    }
}

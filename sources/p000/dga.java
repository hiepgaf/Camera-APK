package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* renamed from: dga */
final class dga extends Handler {
    /* renamed from: a */
    private final /* synthetic */ des f3042a;

    public dga(des des, Looper looper) {
        this.f3042a = des;
        super(looper);
    }

    public final void handleMessage(Message message) {
        eki eki;
        switch (message.what) {
            case 1:
                eki = this.f3042a.f22834t;
                if (eki != null) {
                    eki.onSurfaceCreated(null, null);
                    return;
                }
                return;
            case 2:
                String str = des.f22792c;
                int i = message.arg1;
                int i2 = message.arg2;
                StringBuilder stringBuilder = new StringBuilder(44);
                stringBuilder.append("MSG_RESIZE_RENDERER: ");
                stringBuilder.append(i);
                stringBuilder.append("x");
                stringBuilder.append(i2);
                bli.m871d(str, stringBuilder.toString());
                des des = this.f3042a;
                eki eki2 = des.f22834t;
                if (eki2 != null && des.f22836v != null) {
                    eki2.onSurfaceChanged(null, message.arg1, message.arg2);
                    this.f3042a.f22834t.m1834a();
                    this.f3042a.f22836v.m1823c();
                    return;
                }
                return;
            case 3:
                bli.m871d(des.f22792c, "MSG_UPDATE_ORIENTATION");
                eki = this.f3042a.f22834t;
                if (eki != null) {
                    eki.m1834a();
                    return;
                }
                return;
            default:
                return;
        }
    }
}

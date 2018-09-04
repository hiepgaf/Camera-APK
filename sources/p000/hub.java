package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@SuppressLint({"HandlerLeak"})
/* renamed from: hub */
final class hub extends Handler {
    /* renamed from: a */
    private final Context f6665a;
    /* renamed from: b */
    private final /* synthetic */ hua f6666b;

    public hub(hua hua, Context context) {
        this.f6666b = hua;
        super(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f6665a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int a;
        switch (message.what) {
            case 1:
                a = huc.m3453a(this.f6665a);
                if (huc.m3460b(a)) {
                    hua hua = this.f6666b;
                    Context context = this.f6665a;
                    hua.m11984a(context, a, huc.m3454a(context, a, 0, "n"));
                    return;
                }
                return;
            default:
                a = message.what;
                StringBuilder stringBuilder = new StringBuilder(50);
                stringBuilder.append("Don't know how to handle this message: ");
                stringBuilder.append(a);
                Log.w("GoogleApiAvailability", stringBuilder.toString());
                return;
        }
    }
}

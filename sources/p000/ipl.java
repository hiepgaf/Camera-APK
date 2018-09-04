package p000;

import android.util.Log;
import java.util.concurrent.Callable;

/* renamed from: ipl */
public final /* synthetic */ class ipl implements Callable {
    /* renamed from: a */
    private final ios f7292a;

    public ipl(ios ios) {
        this.f7292a = ios;
    }

    public final Object call() {
        ior ior = this.f7292a.f18447f;
        if (ior != null) {
            synchronized (ior.f18428a) {
                if (ior.f18437j == ipk.READY || ior.f18437j == ipk.PAUSED) {
                    ior.f18432e = new ipj(ior, "VideoEncoder");
                    ior.f18429b.start();
                    ior.f18432e.start();
                    ior.f18437j = ipk.STARTED;
                } else {
                    String valueOf = String.valueOf(ior.f18437j);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                    stringBuilder.append("illegal state as ");
                    stringBuilder.append(valueOf);
                    Log.e("VideoEncoder", stringBuilder.toString());
                }
            }
        }
        return null;
    }
}

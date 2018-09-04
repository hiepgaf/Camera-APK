package p000;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: dfz */
final class dfz extends Handler {
    /* renamed from: a */
    private final WeakReference f3041a;

    public dfz(des des) {
        this.f3041a = new WeakReference(des);
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        des des = (des) this.f3041a.get();
        if (des != null) {
            switch (message.what) {
                case 101:
                    des.m17046m();
                    return;
                case 102:
                case 103:
                    return;
                case 104:
                    eln eln = des.f22829o;
                    goe m = eln.f3936b.mo2885m();
                    if (m.m2654b()) {
                        String path = m.m2653a().getPath();
                        long a = des.f22820f.mo1466a() / 1000000;
                        if (!des.f22800H && LightCycle.m1307f() > 0) {
                            z = false;
                        }
                        int i = (int) a;
                        synchronized (LightCycle.f2376a) {
                            LightCycleNative.FinishCapture(z, path, path, i);
                            LightCycle.f2377b = Boolean.valueOf(false);
                        }
                        des.f22828n.mo1231a(eln, new elp(des, eln));
                    } else {
                        bli.m866b(des.f22792c, "Could not create temporary mosaic file. Not able to stitch.");
                    }
                    des.m17052s();
                    return;
                case 105:
                    des.m17052s();
                    return;
                default:
                    throw new AssertionError(message.what);
            }
        }
    }
}

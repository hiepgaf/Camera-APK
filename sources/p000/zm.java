package p000;

import android.hardware.Camera.ShutterCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: zm */
final class zm implements ShutterCallback {
    /* renamed from: a */
    public final aas f9588a;
    /* renamed from: b */
    private final Handler f9589b;

    zm(Handler handler, aas aas) {
        this.f9589b = handler;
        this.f9588a = aas;
    }

    public final void onShutter() {
        this.f9589b.post(new zn(this));
    }
}
